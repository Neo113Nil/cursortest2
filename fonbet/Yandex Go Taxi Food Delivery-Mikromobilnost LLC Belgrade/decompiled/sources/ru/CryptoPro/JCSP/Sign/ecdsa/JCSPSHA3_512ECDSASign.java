package ru.CryptoPro.JCSP.Sign.ecdsa;

import ru.CryptoPro.JCP.JCP;

/* loaded from: classes4.dex */
public class JCSPSHA3_512ECDSASign extends JCSPSHA1ECDSASign {
    public JCSPSHA3_512ECDSASign() {
        this(JCP.SIGN_SHA3_512_ECDSA_NAME);
    }

    public JCSPSHA3_512ECDSASign(String str) {
        this(str, "GenSHA3-512ECDSA");
    }

    public JCSPSHA3_512ECDSASign(String str, String str2) {
        super(str, str2);
    }
}
