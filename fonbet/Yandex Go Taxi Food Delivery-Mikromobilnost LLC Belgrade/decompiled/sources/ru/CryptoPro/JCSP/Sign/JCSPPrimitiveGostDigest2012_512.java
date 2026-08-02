package ru.CryptoPro.JCSP.Sign;

import ru.CryptoPro.JCP.Sign.PrimitiveGostDigest2012_512;

/* loaded from: classes4.dex */
public class JCSPPrimitiveGostDigest2012_512 extends PrimitiveGostDigest2012_512 {
    public static final int DIGEST_ALG_ID = 32802;

    @Override // ru.CryptoPro.JCP.Sign.PrimitiveGostDigest, ru.CryptoPro.JCP.Digest.AbstractGostDigest
    public int getAlgorithmIdentifier() {
        return 32802;
    }
}
