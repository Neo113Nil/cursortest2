package ru.CryptoPro.JCP.KeyStore;

import java.security.UnrecoverableKeyException;

/* loaded from: classes4.dex */
public class InvalidPasswordException extends UnrecoverableKeyException {
    public InvalidPasswordException() {
    }

    public InvalidPasswordException(String str) {
        super(str);
    }
}
