package ru.CryptoPro.JCP.KeyStore;

import java.security.UnrecoverableKeyException;

/* loaded from: classes4.dex */
public class NoSuchKeyException extends UnrecoverableKeyException {
    public NoSuchKeyException() {
    }

    public NoSuchKeyException(String str) {
        super(str);
    }
}
