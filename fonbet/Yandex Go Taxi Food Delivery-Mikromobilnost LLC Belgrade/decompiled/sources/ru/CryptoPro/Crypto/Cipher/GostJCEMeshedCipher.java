package ru.CryptoPro.Crypto.Cipher;

/* loaded from: classes4.dex */
public class GostJCEMeshedCipher extends BaseGostCipher {
    public GostJCEMeshedCipher() {
        super(new GostCoreJCEMeshedCipher());
    }
}
