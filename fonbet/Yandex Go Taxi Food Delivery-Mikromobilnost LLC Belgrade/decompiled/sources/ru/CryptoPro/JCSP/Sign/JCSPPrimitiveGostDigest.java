package ru.CryptoPro.JCSP.Sign;

import ru.CryptoPro.JCP.Sign.PrimitiveGostDigest;

/* loaded from: classes4.dex */
public class JCSPPrimitiveGostDigest extends PrimitiveGostDigest {
    public static final int DIGEST_ALG_ID = 32798;

    @Override // ru.CryptoPro.JCP.Sign.PrimitiveGostDigest, ru.CryptoPro.JCP.Digest.AbstractGostDigest
    public int getAlgorithmIdentifier() {
        return 32798;
    }
}
