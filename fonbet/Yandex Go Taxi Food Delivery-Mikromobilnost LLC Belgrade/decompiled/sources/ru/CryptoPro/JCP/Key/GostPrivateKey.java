package ru.CryptoPro.JCP.Key;

/* loaded from: classes4.dex */
public class GostPrivateKey extends InternalGostPrivateKey implements SpecKey {
    @Override // ru.CryptoPro.JCP.Key.SpecKey
    public final void clear() {
    }

    @Override // javax.security.auth.Destroyable
    public final void destroy() {
    }

    @Override // ru.CryptoPro.JCP.Key.SpecKey
    public final int getKeySize() {
        return this.keySize;
    }

    @Override // javax.security.auth.Destroyable
    public final boolean isDestroyed() {
        return false;
    }
}
