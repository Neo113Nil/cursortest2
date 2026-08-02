package ru.CryptoPro.JCP.spec;

import java.security.Key;

/* loaded from: classes4.dex */
public abstract class WrappedKeyBase implements Key {
    protected final Key key;

    public WrappedKeyBase(Key key) {
        this.key = key;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.key.getAlgorithm();
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return this.key.getEncoded();
    }

    @Override // java.security.Key
    public String getFormat() {
        return this.key.getFormat();
    }
}
