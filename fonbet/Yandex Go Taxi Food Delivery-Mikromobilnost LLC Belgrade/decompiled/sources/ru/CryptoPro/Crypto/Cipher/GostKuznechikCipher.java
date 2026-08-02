package ru.CryptoPro.Crypto.Cipher;

/* loaded from: classes4.dex */
public final class GostKuznechikCipher extends BaseGostCipher {
    public GostKuznechikCipher() {
        super(new GostCoreKuznechikCipher());
    }

    @Override // ru.CryptoPro.Crypto.Cipher.BaseGostCipher
    public final void setBlockSize() {
        this.blockSize = 16;
    }
}
