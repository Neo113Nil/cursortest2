package ru.CryptoPro.JCSP.MSCAPI;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes4.dex */
public abstract class cl_4 {
    private final ReentrantReadWriteLock a;
    private final Lock b;
    private final Lock c;

    public cl_4() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.a = reentrantReadWriteLock;
        this.b = reentrantReadWriteLock.readLock();
        this.c = reentrantReadWriteLock.writeLock();
    }

    public void readLock() {
        this.b.lock();
    }

    public void readUnlock() {
        this.b.unlock();
    }

    public void writeLock() {
        this.c.lock();
    }

    public void writeUnlock() {
        this.c.unlock();
    }
}
