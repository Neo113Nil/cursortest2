package ru.CryptoPro.JCSP.Digest.rsa.sha3;

import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.Key.KeyInterface;
import ru.CryptoPro.JCSP.Digest.cl_1;

/* loaded from: classes4.dex */
public class JCSPSHA3_512Digest extends cl_1 {
    public static final int DIGEST_ALG_ID = 32848;
    public static final int DIGEST_LENGTH = 64;

    public JCSPSHA3_512Digest() {
        this(JCP.DIGEST_SHA3_512);
    }

    @Override // java.security.MessageDigest, java.security.MessageDigestSpi
    public Object clone() throws CloneNotSupportedException {
        return new JCSPSHA3_512Digest(this);
    }

    @Override // ru.CryptoPro.JCSP.Digest.BaseGostDigest, java.security.MessageDigestSpi
    public int engineGetDigestLength() {
        return 64;
    }

    @Override // ru.CryptoPro.JCP.Digest.AbstractGostDigest
    public int getAlgorithmIdentifier() {
        return 32848;
    }

    public JCSPSHA3_512Digest(String str) {
        this(str, 24);
    }

    public JCSPSHA3_512Digest(String str, int i) {
        super(str, i);
    }

    public JCSPSHA3_512Digest(KeyInterface keyInterface) {
        this(keyInterface, 24);
    }

    public JCSPSHA3_512Digest(KeyInterface keyInterface, int i) {
        super(i, keyInterface, JCP.DIGEST_SHA3_512);
    }

    public JCSPSHA3_512Digest(JCSPSHA3_512Digest jCSPSHA3_512Digest) {
        super(jCSPSHA3_512Digest, JCP.DIGEST_SHA3_512);
    }
}
