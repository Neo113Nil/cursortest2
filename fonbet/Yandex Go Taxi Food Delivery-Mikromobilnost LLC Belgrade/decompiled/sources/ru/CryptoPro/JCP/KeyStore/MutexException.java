package ru.CryptoPro.JCP.KeyStore;

import java.security.KeyStoreException;

/* loaded from: classes4.dex */
public class MutexException extends KeyStoreException {
    public MutexException() {
    }

    public MutexException(String str) {
        super(str);
    }

    public MutexException(Throwable th) {
        super(th);
    }
}
