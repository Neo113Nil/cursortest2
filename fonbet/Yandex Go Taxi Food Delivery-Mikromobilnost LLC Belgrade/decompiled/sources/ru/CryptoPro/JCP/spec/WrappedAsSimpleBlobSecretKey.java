package ru.CryptoPro.JCP.spec;

import javax.crypto.SecretKey;

/* loaded from: classes4.dex */
public class WrappedAsSimpleBlobSecretKey extends WrappedKeyBase {
    public WrappedAsSimpleBlobSecretKey(SecretKey secretKey) {
        super(secretKey);
    }

    public SecretKey getSecretKey() {
        return (SecretKey) this.key;
    }
}
