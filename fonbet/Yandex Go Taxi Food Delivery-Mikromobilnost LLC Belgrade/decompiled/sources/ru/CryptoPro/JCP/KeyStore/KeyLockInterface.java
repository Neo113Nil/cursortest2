package ru.CryptoPro.JCP.KeyStore;

import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes4.dex */
public interface KeyLockInterface {
    Map getDeniedAliases();

    ReentrantReadWriteLock getLock();
}
