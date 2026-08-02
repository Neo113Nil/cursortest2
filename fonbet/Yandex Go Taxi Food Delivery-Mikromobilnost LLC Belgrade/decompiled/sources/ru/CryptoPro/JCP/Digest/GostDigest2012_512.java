package ru.CryptoPro.JCP.Digest;

import defpackage.fq61;
import ru.CryptoPro.JCP.JCP;

/* loaded from: classes4.dex */
public final class GostDigest2012_512 extends fq61 {
    public static final int DIGEST_LENGTH = 64;

    public GostDigest2012_512() {
        super(JCP.GOST_DIGEST_2012_512_NAME, 32802);
    }

    @Override // java.security.MessageDigest, java.security.MessageDigestSpi
    public Object clone() throws CloneNotSupportedException {
        GostDigest2012_512 gostDigest2012_512 = new GostDigest2012_512(getAlgorithm(), this.I);
        fq61.g(this, gostDigest2012_512);
        return gostDigest2012_512;
    }

    @Override // java.security.MessageDigestSpi
    public final int engineGetDigestLength() {
        return 64;
    }

    @Override // ru.CryptoPro.JCP.Digest.AbstractGostDigest
    public int getAlgorithmIdentifier() {
        return 0;
    }

    public GostDigest2012_512(String str) {
        super(str, 32802);
    }
}
