package ru.CryptoPro.JCSP.Sign.ecdsa;

import ru.CryptoPro.JCP.JCP;

/* loaded from: classes4.dex */
public class JCSPSHA3_256ECDSASign extends JCSPSHA1ECDSASign {
    public JCSPSHA3_256ECDSASign() {
        this(JCP.SIGN_SHA3_256_ECDSA_NAME);
    }

    public JCSPSHA3_256ECDSASign(String str) {
        this(str, "GenSHA3-256ECDSA");
    }

    public JCSPSHA3_256ECDSASign(String str, String str2) {
        super(str, str2);
    }
}
