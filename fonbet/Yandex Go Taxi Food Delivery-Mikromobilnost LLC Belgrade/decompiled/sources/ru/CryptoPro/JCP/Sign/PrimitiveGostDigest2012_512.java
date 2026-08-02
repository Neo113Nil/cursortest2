package ru.CryptoPro.JCP.Sign;

import ru.CryptoPro.JCP.JCP;

/* loaded from: classes4.dex */
public class PrimitiveGostDigest2012_512 extends PrimitiveGostDigest {
    public PrimitiveGostDigest2012_512() {
        super(JCP.CRYPTOPRO_SIGN_2012_512_NAME);
    }

    @Override // ru.CryptoPro.JCP.Sign.PrimitiveGostDigest
    public int a() {
        return 64;
    }
}
