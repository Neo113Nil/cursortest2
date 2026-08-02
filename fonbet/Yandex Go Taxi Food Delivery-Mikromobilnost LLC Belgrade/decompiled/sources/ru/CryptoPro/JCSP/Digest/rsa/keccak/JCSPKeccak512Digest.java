package ru.CryptoPro.JCSP.Digest.rsa.keccak;

import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.Key.KeyInterface;
import ru.CryptoPro.JCSP.Digest.cl_1;

/* loaded from: classes4.dex */
public class JCSPKeccak512Digest extends cl_1 {
    public static final int DIGEST_ALG_ID = 32859;
    public static final int DIGEST_LENGTH = 64;

    public JCSPKeccak512Digest() {
        this(JCP.DIGEST_KECCAK_512);
    }

    @Override // java.security.MessageDigest, java.security.MessageDigestSpi
    public Object clone() throws CloneNotSupportedException {
        return new JCSPKeccak512Digest(this);
    }

    @Override // ru.CryptoPro.JCSP.Digest.BaseGostDigest, java.security.MessageDigestSpi
    public int engineGetDigestLength() {
        return 64;
    }

    @Override // ru.CryptoPro.JCP.Digest.AbstractGostDigest
    public int getAlgorithmIdentifier() {
        return 32859;
    }

    public JCSPKeccak512Digest(String str) {
        this(str, 24);
    }

    public JCSPKeccak512Digest(String str, int i) {
        super(str, i);
    }

    public JCSPKeccak512Digest(KeyInterface keyInterface) {
        this(keyInterface, 24);
    }

    public JCSPKeccak512Digest(KeyInterface keyInterface, int i) {
        super(i, keyInterface, JCP.DIGEST_KECCAK_512);
    }

    public JCSPKeccak512Digest(JCSPKeccak512Digest jCSPKeccak512Digest) {
        super(jCSPKeccak512Digest, JCP.DIGEST_KECCAK_512);
    }
}
