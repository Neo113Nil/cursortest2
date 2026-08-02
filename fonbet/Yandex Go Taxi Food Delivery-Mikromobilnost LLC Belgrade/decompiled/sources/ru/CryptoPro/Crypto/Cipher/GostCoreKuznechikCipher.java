package ru.CryptoPro.Crypto.Cipher;

import ru.CryptoPro.JCP.JCP;

/* loaded from: classes4.dex */
public class GostCoreKuznechikCipher extends GostCoreMagmaCipher {
    protected static final long MAX_ENCRYPTIONS_COUNT_CTR_ACPKM_SINGLE_MESSAGE_K = 576460752303423488L;
    protected static final int TIMES_CHANGE_KEY_K = 256;

    @Override // ru.CryptoPro.Crypto.Cipher.GostCoreMagmaCipher, ru.CryptoPro.Crypto.Cipher.GostCoreMeshedCipher
    public boolean canProceedNewBytes(int i) {
        return this.processedByteCount + ((long) i) <= MAX_ENCRYPTIONS_COUNT_CTR_ACPKM_SINGLE_MESSAGE_K;
    }

    @Override // ru.CryptoPro.Crypto.Cipher.GostCoreMagmaCipher
    public int getIVLen() {
        return 16;
    }

    @Override // ru.CryptoPro.Crypto.Cipher.GostCoreMagmaCipher
    public String getOmacAlg() {
        return JCP.GOST_K_IMIT_NAME;
    }

    @Override // ru.CryptoPro.Crypto.Cipher.GostCoreCipher
    public void setByteBlockSize() {
        this.byteBlockSize = 16;
    }

    @Override // ru.CryptoPro.Crypto.Cipher.GostCoreMagmaCipher, ru.CryptoPro.Crypto.Cipher.GostCoreCipher
    public void setMixBlockSize(boolean z) {
        this.mixBlockSize = z ? 16384 : 256;
    }
}
