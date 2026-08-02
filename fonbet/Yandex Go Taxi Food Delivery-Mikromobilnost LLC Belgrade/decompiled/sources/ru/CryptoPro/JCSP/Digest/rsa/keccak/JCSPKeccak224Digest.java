package ru.CryptoPro.JCSP.Digest.rsa.keccak;

import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.Key.KeyInterface;
import ru.CryptoPro.JCSP.Digest.cl_1;

/* loaded from: classes4.dex */
public class JCSPKeccak224Digest extends cl_1 {
    public static final int DIGEST_ALG_ID = 32856;
    public static final int DIGEST_LENGTH = 28;

    public JCSPKeccak224Digest() {
        this(JCP.DIGEST_KECCAK_224);
    }

    @Override // java.security.MessageDigest, java.security.MessageDigestSpi
    public Object clone() throws CloneNotSupportedException {
        return new JCSPKeccak224Digest(this);
    }

    @Override // ru.CryptoPro.JCSP.Digest.BaseGostDigest, java.security.MessageDigestSpi
    public int engineGetDigestLength() {
        return 28;
    }

    @Override // ru.CryptoPro.JCP.Digest.AbstractGostDigest
    public int getAlgorithmIdentifier() {
        return 32856;
    }

    public JCSPKeccak224Digest(String str) {
        this(str, 24);
    }

    public JCSPKeccak224Digest(String str, int i) {
        super(str, i);
    }

    public JCSPKeccak224Digest(KeyInterface keyInterface) {
        this(keyInterface, 24);
    }

    public JCSPKeccak224Digest(KeyInterface keyInterface, int i) {
        super(i, keyInterface, JCP.DIGEST_KECCAK_224);
    }

    public JCSPKeccak224Digest(JCSPKeccak224Digest jCSPKeccak224Digest) {
        super(jCSPKeccak224Digest, JCP.DIGEST_KECCAK_224);
    }
}
