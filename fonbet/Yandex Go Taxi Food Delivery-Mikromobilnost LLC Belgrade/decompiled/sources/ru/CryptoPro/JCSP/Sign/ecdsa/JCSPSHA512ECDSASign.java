package ru.CryptoPro.JCSP.Sign.ecdsa;

import ru.CryptoPro.JCP.JCP;

/* loaded from: classes4.dex */
public class JCSPSHA512ECDSASign extends JCSPSHA1ECDSASign {
    public JCSPSHA512ECDSASign() {
        this(JCP.SIGN_SHA512_ECDSA_NAME);
    }

    public JCSPSHA512ECDSASign(String str) {
        super(str, "GenSHA512ECDSA");
    }

    public JCSPSHA512ECDSASign(String str, String str2) {
        super(str, str2);
    }
}
