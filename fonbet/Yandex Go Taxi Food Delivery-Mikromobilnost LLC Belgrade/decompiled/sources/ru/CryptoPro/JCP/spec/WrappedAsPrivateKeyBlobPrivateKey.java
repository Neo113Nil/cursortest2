package ru.CryptoPro.JCP.spec;

import java.security.PrivateKey;

/* loaded from: classes4.dex */
public class WrappedAsPrivateKeyBlobPrivateKey extends WrappedKeyBase {
    public WrappedAsPrivateKeyBlobPrivateKey(PrivateKey privateKey) {
        super(privateKey);
    }

    public PrivateKey getPrivateKey() {
        return (PrivateKey) this.key;
    }
}
