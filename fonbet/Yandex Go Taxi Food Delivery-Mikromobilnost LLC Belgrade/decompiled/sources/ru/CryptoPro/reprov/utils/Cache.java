package ru.CryptoPro.reprov.utils;

import defpackage.cv61;
import defpackage.lx61;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes4.dex */
public abstract class Cache {
    public final Lock a;
    public final Lock b;

    public Cache() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.a = reentrantReadWriteLock.readLock();
        this.b = reentrantReadWriteLock.writeLock();
    }

    public static Cache newHardMemoryCache(int i) {
        return new cv61(false, i, 0);
    }

    public static Cache newNullCache() {
        return lx61.c;
    }

    public static Cache newSoftMemoryCache(int i) {
        return new cv61(true, i, 0);
    }

    public abstract void clear();

    public abstract Object get(Object obj);

    public abstract void put(Object obj, Object obj2);

    public void readLock() {
        this.a.lock();
    }

    public void readUnlock() {
        this.a.unlock();
    }

    public abstract void remove(Object obj);

    public abstract int size();

    public void writeLock() {
        this.b.lock();
    }

    public void writeUnlock() {
        this.b.unlock();
    }

    public static Cache newHardMemoryCache(int i, int i2) {
        return new cv61(false, i, i2);
    }

    public static Cache newSoftMemoryCache(int i, int i2) {
        return new cv61(true, i, i2);
    }
}
