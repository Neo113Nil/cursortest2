package ru.CryptoPro.JCSP.params;

import java.security.Key;

/* loaded from: classes4.dex */
public class MulXSpec implements Key {
    private final Key a;
    private byte[] b;
    private Key c;

    public MulXSpec(Key key, byte[] bArr) {
        this.b = null;
        this.c = null;
        this.a = key;
        this.b = (byte[]) bArr.clone();
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "MUL_X";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return null;
    }

    @Override // java.security.Key
    public String getFormat() {
        return "RAW";
    }

    public byte[] getNumber() {
        return this.b;
    }

    public Key getOpKey() {
        return this.c;
    }

    public Key getSourceKey() {
        return this.a;
    }

    public MulXSpec(Key key, Key key2) {
        this.b = null;
        this.a = key;
        this.c = key2;
    }
}
