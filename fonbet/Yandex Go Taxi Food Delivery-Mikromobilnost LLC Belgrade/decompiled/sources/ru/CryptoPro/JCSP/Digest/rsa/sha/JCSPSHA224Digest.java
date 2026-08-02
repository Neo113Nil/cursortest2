package ru.CryptoPro.JCSP.Digest.rsa.sha;

import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.Key.KeyInterface;
import ru.CryptoPro.JCSP.Digest.cl_1;

/* loaded from: classes4.dex */
public class JCSPSHA224Digest extends cl_1 {
    public static final int DIGEST_ALG_ID = 33053;
    public static final int DIGEST_LENGTH = 28;

    public JCSPSHA224Digest() {
        this(JCP.DIGEST_SHA224);
    }

    @Override // java.security.MessageDigest, java.security.MessageDigestSpi
    public Object clone() throws CloneNotSupportedException {
        return new JCSPSHA224Digest(this);
    }

    @Override // ru.CryptoPro.JCSP.Digest.BaseGostDigest, java.security.MessageDigestSpi
    public int engineGetDigestLength() {
        return 28;
    }

    @Override // ru.CryptoPro.JCP.Digest.AbstractGostDigest
    public int getAlgorithmIdentifier() {
        return 33053;
    }

    public JCSPSHA224Digest(String str) {
        this(str, 24);
    }

    public JCSPSHA224Digest(String str, int i) {
        super(str, i);
    }

    public JCSPSHA224Digest(KeyInterface keyInterface) {
        this(keyInterface, 24);
    }

    public JCSPSHA224Digest(KeyInterface keyInterface, int i) {
        super(i, keyInterface, JCP.DIGEST_SHA224);
    }

    public JCSPSHA224Digest(JCSPSHA224Digest jCSPSHA224Digest) {
        super(jCSPSHA224Digest, JCP.DIGEST_SHA224);
    }
}
