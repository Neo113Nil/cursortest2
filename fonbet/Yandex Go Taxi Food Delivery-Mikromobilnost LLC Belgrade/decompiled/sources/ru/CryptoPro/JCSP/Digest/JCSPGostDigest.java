package ru.CryptoPro.JCSP.Digest;

import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.Key.KeyInterface;
import ru.CryptoPro.JCP.params.OID;

/* loaded from: classes4.dex */
public final class JCSPGostDigest extends GostDigest {
    public static final int DIGEST_ALG_ID = 32798;
    public static final int DIGEST_LENGTH = 32;

    public JCSPGostDigest() {
        super(JCP.GOST_DIGEST_NAME, 75);
    }

    @Override // java.security.MessageDigest, java.security.MessageDigestSpi
    public Object clone() throws CloneNotSupportedException {
        return new JCSPGostDigest(this);
    }

    @Override // ru.CryptoPro.JCSP.Digest.BaseGostDigest, java.security.MessageDigestSpi
    public int engineGetDigestLength() {
        return 32;
    }

    @Override // ru.CryptoPro.JCP.Digest.AbstractGostDigest
    public int getAlgorithmIdentifier() {
        return 32798;
    }

    public JCSPGostDigest(KeyInterface keyInterface) {
        super(75, keyInterface, JCP.GOST_DIGEST_NAME);
    }

    public JCSPGostDigest(OID oid) {
        super(oid, JCP.GOST_DIGEST_NAME);
    }

    public JCSPGostDigest(JCSPGostDigest jCSPGostDigest) {
        super(jCSPGostDigest, JCP.GOST_DIGEST_NAME);
    }
}
