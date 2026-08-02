package ru.CryptoPro.JCSP.Digest.rsa.sha;

import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.Key.KeyInterface;
import ru.CryptoPro.JCSP.Digest.cl_1;

/* loaded from: classes4.dex */
public class JCSPSHA256Digest extends cl_1 {
    public static final int DIGEST_ALG_ID = 32780;
    public static final int DIGEST_LENGTH = 32;

    public JCSPSHA256Digest() {
        this(JCP.DIGEST_SHA256);
    }

    @Override // java.security.MessageDigest, java.security.MessageDigestSpi
    public Object clone() throws CloneNotSupportedException {
        return new JCSPSHA256Digest(this);
    }

    @Override // ru.CryptoPro.JCSP.Digest.BaseGostDigest, java.security.MessageDigestSpi
    public int engineGetDigestLength() {
        return 32;
    }

    @Override // ru.CryptoPro.JCP.Digest.AbstractGostDigest
    public int getAlgorithmIdentifier() {
        return 32780;
    }

    public JCSPSHA256Digest(String str) {
        this(str, 24);
    }

    public JCSPSHA256Digest(String str, int i) {
        super(str, i);
    }

    public JCSPSHA256Digest(KeyInterface keyInterface) {
        this(keyInterface, 24);
    }

    public JCSPSHA256Digest(KeyInterface keyInterface, int i) {
        super(i, keyInterface, JCP.DIGEST_SHA256);
    }

    public JCSPSHA256Digest(JCSPSHA256Digest jCSPSHA256Digest) {
        super(jCSPSHA256Digest, JCP.DIGEST_SHA256);
    }
}
