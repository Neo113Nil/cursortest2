package ru.CryptoPro.JCSP.Digest.rsa.sha3;

import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.Key.KeyInterface;
import ru.CryptoPro.JCSP.Digest.cl_1;

/* loaded from: classes4.dex */
public class JCSPSHA3_384Digest extends cl_1 {
    public static final int DIGEST_ALG_ID = 32847;
    public static final int DIGEST_LENGTH = 48;

    public JCSPSHA3_384Digest() {
        this(JCP.DIGEST_SHA3_384);
    }

    @Override // java.security.MessageDigest, java.security.MessageDigestSpi
    public Object clone() throws CloneNotSupportedException {
        return new JCSPSHA3_384Digest(this);
    }

    @Override // ru.CryptoPro.JCSP.Digest.BaseGostDigest, java.security.MessageDigestSpi
    public int engineGetDigestLength() {
        return 48;
    }

    @Override // ru.CryptoPro.JCP.Digest.AbstractGostDigest
    public int getAlgorithmIdentifier() {
        return 32847;
    }

    public JCSPSHA3_384Digest(String str) {
        this(str, 24);
    }

    public JCSPSHA3_384Digest(String str, int i) {
        super(str, i);
    }

    public JCSPSHA3_384Digest(KeyInterface keyInterface) {
        this(keyInterface, 24);
    }

    public JCSPSHA3_384Digest(KeyInterface keyInterface, int i) {
        super(i, keyInterface, JCP.DIGEST_SHA3_384);
    }

    public JCSPSHA3_384Digest(JCSPSHA3_384Digest jCSPSHA3_384Digest) {
        super(jCSPSHA3_384Digest, JCP.DIGEST_SHA3_384);
    }
}
