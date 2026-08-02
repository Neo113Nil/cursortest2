package ru.CryptoPro.JCSP.params;

import java.security.Key;

/* loaded from: classes4.dex */
public class RMaskSpec implements Key {
    private final Key a;

    public RMaskSpec(Key key) {
        this.a = key;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "R_MASK";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return null;
    }

    @Override // java.security.Key
    public String getFormat() {
        return "RAW";
    }

    public Key getKey() {
        return this.a;
    }
}
