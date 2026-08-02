package com.nimbusds.jose.util;

import javax.crypto.SecretKey;

/* loaded from: classes5.dex */
public final class KeyUtils$1 implements SecretKey {
    public final /* synthetic */ SecretKey val$secretKey;

    public KeyUtils$1(SecretKey secretKey) {
        this.val$secretKey = secretKey;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "AES";
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        return this.val$secretKey.getEncoded();
    }

    @Override // java.security.Key
    public final String getFormat() {
        return this.val$secretKey.getFormat();
    }
}
