package ru.CryptoPro.Crypto.Cipher;

/* loaded from: classes4.dex */
public final class GostJCESimpleCipher extends BaseGostCipher {
    public GostJCESimpleCipher() {
        super(new GostCoreJCESimpleCipher());
    }
}
