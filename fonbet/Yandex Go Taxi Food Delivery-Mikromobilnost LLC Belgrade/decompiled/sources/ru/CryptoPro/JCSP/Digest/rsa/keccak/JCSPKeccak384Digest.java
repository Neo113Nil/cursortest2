package ru.CryptoPro.JCSP.Digest.rsa.keccak;

import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.Key.KeyInterface;
import ru.CryptoPro.JCSP.Digest.cl_1;

/* loaded from: classes4.dex */
public class JCSPKeccak384Digest extends cl_1 {
    public static final int DIGEST_ALG_ID = 32858;
    public static final int DIGEST_LENGTH = 48;

    public JCSPKeccak384Digest() {
        this(JCP.DIGEST_KECCAK_384);
    }

    @Override // java.security.MessageDigest, java.security.MessageDigestSpi
    public Object clone() throws CloneNotSupportedException {
        return new JCSPKeccak384Digest(this);
    }

    @Override // ru.CryptoPro.JCSP.Digest.BaseGostDigest, java.security.MessageDigestSpi
    public int engineGetDigestLength() {
        return 48;
    }

    @Override // ru.CryptoPro.JCP.Digest.AbstractGostDigest
    public int getAlgorithmIdentifier() {
        return 32858;
    }

    public JCSPKeccak384Digest(String str) {
        this(str, 24);
    }

    public JCSPKeccak384Digest(String str, int i) {
        super(str, i);
    }

    public JCSPKeccak384Digest(KeyInterface keyInterface) {
        this(keyInterface, 24);
    }

    public JCSPKeccak384Digest(KeyInterface keyInterface, int i) {
        super(i, keyInterface, JCP.DIGEST_KECCAK_384);
    }

    public JCSPKeccak384Digest(JCSPKeccak384Digest jCSPKeccak384Digest) {
        super(jCSPKeccak384Digest, JCP.DIGEST_KECCAK_384);
    }
}
