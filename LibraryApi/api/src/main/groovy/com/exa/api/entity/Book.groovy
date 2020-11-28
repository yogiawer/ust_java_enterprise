package com.exa.api.entity

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.GeneratedValue
import javax.persistence.Table
import javax.persistence.ManyToOne
import javax.persistence.CascadeType
import javax.persistence.JoinTable
import javax.persistence.JoinColumn
import javax.persistence.GenerationType
import javax.validation.constraints.NotNull
import javax.persistence.Column

@Entity
@Table(name = "books")
class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id

    @NotNull
    @Column(nullable = false)
    Integer category_id

    @NotNull
    @Column(nullable = false)
    String name

    @NotNull
    @Column(nullable = false)
    String pengarang

    @NotNull
    @Column(nullable = false)
    String penerbit

    @NotNull
    @Column(nullable = false)
    String isbn

    @ManyToOne
    @JoinColumn(name="category_id", nullable = false, insertable = false, updatable = false)
    Category category
}