package com.bar.demo.service.impl;

import com.bar.demo.entity.Maker;
import com.bar.demo.persistence.IMakerDAO;
import com.bar.demo.service.IMakerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MakerServiceImpl implements IMakerService {
    @Autowired
    private IMakerDAO makerDAO;
    @Override
    public List<Maker> findAll() {
        return makerDAO.findAll();
    }

    @Override
    public Optional<Maker> findById(Long id) {
        return makerDAO.findById(id);
    }


    @Override
    public void save(Maker maker) {
    makerDAO.save(maker);
    }

    @Override
    public void deleteById(Long id) {
    makerDAO.deleteById(id);
    }
}
