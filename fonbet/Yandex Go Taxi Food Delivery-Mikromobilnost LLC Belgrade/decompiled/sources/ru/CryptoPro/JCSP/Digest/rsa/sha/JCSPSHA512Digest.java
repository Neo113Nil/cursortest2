package ru.CryptoPro.JCSP.Digest.rsa.sha;

import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.Key.KeyInterface;
import ru.CryptoPro.JCSP.Digest.cl_1;

/* loaded from: classes4.dex */
public class JCSPSHA512Digest extends cl_1 {
    public static final int DIGEST_ALG_ID = 32782;
    public static final int DIGEST_LENGTH = 64;

    public JCSPSHA512Digest() {
        this(JCP.DIGEST_SHA512);
    }

    @Override // java.security.MessageDigest, java.security.MessageDigestSpi
    public Object clone() throws CloneNotSupportedException {
        return new JCSPSHA512Digest(this);
    }

    @Override // ru.CryptoPro.JCSP.Digest.BaseGostDigest, java.security.MessageDigestSpi
    public int engineGetDigestLength() {
        return 64;
    }

    @Override // ru.CryptoPro.JCP.Digest.AbstractGostDigest
    public int getAlgorithmIdentifier() {
        return 32782;
    }

    public JCSPSHA512Digest(String str) {
        this(str, 24);
    }

    public JCSPSHA512Digest(String str, int i) {
        super(str, i);
    }

    public JCSPSHA512Digest(KeyInterface keyInterface) {
        this(keyInterface, 24);
    }

    public JCSPSHA512Digest(KeyInterface keyInterface, int i) {
        super(i, keyInterface, JCP.DIGEST_SHA512);
    }

    public JCSPSHA512Digest(JCSPSHA512Digest jCSPSHA512Digest) {
        super(jCSPSHA512Digest, JCP.DIGEST_SHA512);
    }
}
