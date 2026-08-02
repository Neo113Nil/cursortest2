package ru.CryptoPro.JCSP.Digest;

import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.Key.KeyInterface;

/* loaded from: classes4.dex */
public final class JCSPGostDigest2012_512 extends GostDigest {
    public static final int DIGEST_ALG_ID = 32802;
    public static final int DIGEST_LENGTH = 64;

    public JCSPGostDigest2012_512() {
        super(JCP.GOST_DIGEST_2012_512_NAME, 81);
    }

    @Override // java.security.MessageDigest, java.security.MessageDigestSpi
    public Object clone() throws CloneNotSupportedException {
        return new JCSPGostDigest2012_512(this);
    }

    @Override // ru.CryptoPro.JCSP.Digest.BaseGostDigest, java.security.MessageDigestSpi
    public int engineGetDigestLength() {
        return 64;
    }

    @Override // ru.CryptoPro.JCP.Digest.AbstractGostDigest
    public int getAlgorithmIdentifier() {
        return 32802;
    }

    public JCSPGostDigest2012_512(KeyInterface keyInterface) {
        super(81, keyInterface, JCP.GOST_DIGEST_2012_512_NAME);
    }

    public JCSPGostDigest2012_512(JCSPGostDigest2012_512 jCSPGostDigest2012_512) {
        super(jCSPGostDigest2012_512, JCP.GOST_DIGEST_2012_512_NAME);
    }
}
