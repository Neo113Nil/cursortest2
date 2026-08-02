package ru.CryptoPro.JCSP.Sign.ecdsa;

import ru.CryptoPro.JCP.JCP;

/* loaded from: classes4.dex */
public class JCSPSHA256ECDSASign extends JCSPSHA1ECDSASign {
    public JCSPSHA256ECDSASign() {
        this(JCP.SIGN_SHA256_ECDSA_NAME);
    }

    public JCSPSHA256ECDSASign(String str) {
        super(str, "GenSHA256ECDSA");
    }

    public JCSPSHA256ECDSASign(String str, String str2) {
        super(str, str2);
    }
}
