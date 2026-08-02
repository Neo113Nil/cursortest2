package ru.CryptoPro.Crypto.Cipher;

/* loaded from: classes4.dex */
public final class GostMeshedCipher extends BaseGostCipher {
    public GostMeshedCipher() {
        super(new GostCoreMeshedCipher());
    }
}
