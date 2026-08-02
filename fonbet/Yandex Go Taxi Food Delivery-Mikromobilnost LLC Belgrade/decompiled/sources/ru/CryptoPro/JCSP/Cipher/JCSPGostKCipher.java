package ru.CryptoPro.JCSP.Cipher;

/* loaded from: classes4.dex */
public final class JCSPGostKCipher extends GostCipher {
    private static final int s = 16;

    public JCSPGostKCipher() {
        this.q = 16;
        this.f = new byte[16];
        this.i = new byte[GostCipher.h + 16];
    }
}
