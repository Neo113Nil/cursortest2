package ru.CryptoPro.JCSP.Digest.rsa.sha3;

import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.Key.KeyInterface;
import ru.CryptoPro.JCSP.Digest.cl_1;

/* loaded from: classes4.dex */
public class JCSPSHA3_256Digest extends cl_1 {
    public static final int DIGEST_ALG_ID = 32846;
    public static final int DIGEST_LENGTH = 32;

    public JCSPSHA3_256Digest() {
        this(JCP.DIGEST_SHA3_256);
    }

    @Override // java.security.MessageDigest, java.security.MessageDigestSpi
    public Object clone() throws CloneNotSupportedException {
        return new JCSPSHA3_256Digest(this);
    }

    @Override // ru.CryptoPro.JCSP.Digest.BaseGostDigest, java.security.MessageDigestSpi
    public int engineGetDigestLength() {
        return 32;
    }

    @Override // ru.CryptoPro.JCP.Digest.AbstractGostDigest
    public int getAlgorithmIdentifier() {
        return 32846;
    }

    public JCSPSHA3_256Digest(String str) {
        this(str, 24);
    }

    public JCSPSHA3_256Digest(String str, int i) {
        super(str, i);
    }

    public JCSPSHA3_256Digest(KeyInterface keyInterface) {
        this(keyInterface, 24);
    }

    public JCSPSHA3_256Digest(KeyInterface keyInterface, int i) {
        super(i, keyInterface, JCP.DIGEST_SHA3_256);
    }

    public JCSPSHA3_256Digest(JCSPSHA3_256Digest jCSPSHA3_256Digest) {
        super(jCSPSHA3_256Digest, JCP.DIGEST_SHA3_256);
    }
}
