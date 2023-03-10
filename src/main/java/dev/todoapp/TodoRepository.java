package dev.todoapp;

import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface TodoRepository extends CrudRepository<Todo, Integer>{

    Set<Todo> findAllByUserId(Integer userId);
}

