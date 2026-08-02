package ru.CryptoPro.JCP.KeyStore;

/* loaded from: classes4.dex */
public interface MutexInterface {
    void lock() throws Exception;

    boolean tryLock() throws Exception;

    void unlock() throws Exception;

    void unlockFinally();
}
