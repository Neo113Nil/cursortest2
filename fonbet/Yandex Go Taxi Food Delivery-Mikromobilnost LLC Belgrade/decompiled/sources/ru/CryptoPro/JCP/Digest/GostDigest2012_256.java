package ru.CryptoPro.JCP.Digest;

import defpackage.fq61;
import ru.CryptoPro.JCP.JCP;

/* loaded from: classes4.dex */
public final class GostDigest2012_256 extends fq61 {
    public static final int DIGEST_LENGTH = 32;

    public GostDigest2012_256() {
        super(JCP.GOST_DIGEST_2012_256_NAME, 32801);
    }

    @Override // java.security.MessageDigest, java.security.MessageDigestSpi
    public Object clone() throws CloneNotSupportedException {
        GostDigest2012_256 gostDigest2012_256 = new GostDigest2012_256(getAlgorithm(), this.I);
        fq61.g(this, gostDigest2012_256);
        return gostDigest2012_256;
    }

    @Override // java.security.MessageDigestSpi
    public final int engineGetDigestLength() {
        return 32;
    }

    @Override // ru.CryptoPro.JCP.Digest.AbstractGostDigest
    public int getAlgorithmIdentifier() {
        return 0;
    }

    public GostDigest2012_256(String str) {
        super(str, 32801);
    }
}
