package ru.CryptoPro.JCP.KeyStore;

import java.security.UnrecoverableKeyException;

/* loaded from: classes4.dex */
public class PasswordLockException extends UnrecoverableKeyException {
    public PasswordLockException() {
    }

    public PasswordLockException(String str) {
        super(str);
    }
}
