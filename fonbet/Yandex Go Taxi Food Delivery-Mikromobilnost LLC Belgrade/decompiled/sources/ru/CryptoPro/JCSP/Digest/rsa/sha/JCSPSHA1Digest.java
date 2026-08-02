package ru.CryptoPro.JCSP.Digest.rsa.sha;

import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.Key.KeyInterface;
import ru.CryptoPro.JCSP.Digest.cl_1;

/* loaded from: classes4.dex */
public class JCSPSHA1Digest extends cl_1 {
    public static final int DIGEST_ALG_ID = 32772;
    public static final int DIGEST_LENGTH = 20;

    public JCSPSHA1Digest() {
        this(24);
    }

    @Override // java.security.MessageDigest, java.security.MessageDigestSpi
    public Object clone() throws CloneNotSupportedException {
        return new JCSPSHA1Digest(this);
    }

    @Override // ru.CryptoPro.JCSP.Digest.BaseGostDigest, java.security.MessageDigestSpi
    public int engineGetDigestLength() {
        return 20;
    }

    @Override // ru.CryptoPro.JCP.Digest.AbstractGostDigest
    public int getAlgorithmIdentifier() {
        return 32772;
    }

    public JCSPSHA1Digest(int i) {
        super(JCP.DIGEST_SHA1, i);
    }

    public JCSPSHA1Digest(KeyInterface keyInterface) {
        this(keyInterface, 24);
    }

    public JCSPSHA1Digest(KeyInterface keyInterface, int i) {
        super(i, keyInterface, JCP.DIGEST_SHA1);
    }

    public JCSPSHA1Digest(JCSPSHA1Digest jCSPSHA1Digest) {
        super(jCSPSHA1Digest, JCP.DIGEST_SHA1);
    }
}
