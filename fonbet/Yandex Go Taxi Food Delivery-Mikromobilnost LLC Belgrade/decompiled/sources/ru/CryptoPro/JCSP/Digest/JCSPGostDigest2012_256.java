package ru.CryptoPro.JCSP.Digest;

import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.Key.KeyInterface;

/* loaded from: classes4.dex */
public final class JCSPGostDigest2012_256 extends GostDigest {
    public static final int DIGEST_ALG_ID = 32801;
    public static final int DIGEST_LENGTH = 32;

    public JCSPGostDigest2012_256() {
        super(JCP.GOST_DIGEST_2012_256_NAME, 80);
    }

    @Override // java.security.MessageDigest, java.security.MessageDigestSpi
    public Object clone() throws CloneNotSupportedException {
        return new JCSPGostDigest2012_256(this);
    }

    @Override // ru.CryptoPro.JCSP.Digest.BaseGostDigest, java.security.MessageDigestSpi
    public int engineGetDigestLength() {
        return 32;
    }

    @Override // ru.CryptoPro.JCP.Digest.AbstractGostDigest
    public int getAlgorithmIdentifier() {
        return 32801;
    }

    public JCSPGostDigest2012_256(KeyInterface keyInterface) {
        super(80, keyInterface, JCP.GOST_DIGEST_2012_256_NAME);
    }

    public JCSPGostDigest2012_256(JCSPGostDigest2012_256 jCSPGostDigest2012_256) {
        super(jCSPGostDigest2012_256, JCP.GOST_DIGEST_2012_256_NAME);
    }
}
