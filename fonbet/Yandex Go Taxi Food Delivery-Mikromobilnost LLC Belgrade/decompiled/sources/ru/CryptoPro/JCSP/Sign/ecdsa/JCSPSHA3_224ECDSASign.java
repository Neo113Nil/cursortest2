package ru.CryptoPro.JCSP.Sign.ecdsa;

import ru.CryptoPro.JCP.JCP;

/* loaded from: classes4.dex */
public class JCSPSHA3_224ECDSASign extends JCSPSHA1ECDSASign {
    public JCSPSHA3_224ECDSASign() {
        this(JCP.SIGN_SHA3_224_ECDSA_NAME);
    }

    public JCSPSHA3_224ECDSASign(String str) {
        this(str, "GenSHA3-224ECDSA");
    }

    public JCSPSHA3_224ECDSASign(String str, String str2) {
        super(str, str2);
    }
}
