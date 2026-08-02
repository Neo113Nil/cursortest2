package ru.CryptoPro.JCSP.Digest.rsa.keccak;

import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.Key.KeyInterface;
import ru.CryptoPro.JCSP.Digest.cl_1;

/* loaded from: classes4.dex */
public class JCSPKeccak256Digest extends cl_1 {
    public static final int DIGEST_ALG_ID = 32857;
    public static final int DIGEST_LENGTH = 32;

    public JCSPKeccak256Digest() {
        this(JCP.DIGEST_KECCAK_256);
    }

    @Override // java.security.MessageDigest, java.security.MessageDigestSpi
    public Object clone() throws CloneNotSupportedException {
        return new JCSPKeccak256Digest(this);
    }

    @Override // ru.CryptoPro.JCSP.Digest.BaseGostDigest, java.security.MessageDigestSpi
    public int engineGetDigestLength() {
        return 32;
    }

    @Override // ru.CryptoPro.JCP.Digest.AbstractGostDigest
    public int getAlgorithmIdentifier() {
        return 32857;
    }

    public JCSPKeccak256Digest(String str) {
        this(str, 24);
    }

    public JCSPKeccak256Digest(String str, int i) {
        super(str, i);
    }

    public JCSPKeccak256Digest(KeyInterface keyInterface) {
        this(keyInterface, 24);
    }

    public JCSPKeccak256Digest(KeyInterface keyInterface, int i) {
        super(i, keyInterface, JCP.DIGEST_KECCAK_256);
    }

    public JCSPKeccak256Digest(JCSPKeccak256Digest jCSPKeccak256Digest) {
        super(jCSPKeccak256Digest, JCP.DIGEST_KECCAK_256);
    }
}
