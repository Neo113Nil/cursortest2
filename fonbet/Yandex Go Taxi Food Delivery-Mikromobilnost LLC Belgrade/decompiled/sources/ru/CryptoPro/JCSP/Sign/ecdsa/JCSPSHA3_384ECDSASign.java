package ru.CryptoPro.JCSP.Sign.ecdsa;

import ru.CryptoPro.JCP.JCP;

/* loaded from: classes4.dex */
public class JCSPSHA3_384ECDSASign extends JCSPSHA1ECDSASign {
    public JCSPSHA3_384ECDSASign() {
        this(JCP.SIGN_SHA3_384_ECDSA_NAME);
    }

    public JCSPSHA3_384ECDSASign(String str) {
        this(str, "GenSHA3-384ECDSA");
    }

    public JCSPSHA3_384ECDSASign(String str, String str2) {
        super(str, str2);
    }
}
