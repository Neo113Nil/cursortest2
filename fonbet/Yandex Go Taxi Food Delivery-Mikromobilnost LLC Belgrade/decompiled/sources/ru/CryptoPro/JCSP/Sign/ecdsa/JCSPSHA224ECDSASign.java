package ru.CryptoPro.JCSP.Sign.ecdsa;

import ru.CryptoPro.JCP.JCP;

/* loaded from: classes4.dex */
public class JCSPSHA224ECDSASign extends JCSPSHA1ECDSASign {
    public JCSPSHA224ECDSASign() {
        this(JCP.SIGN_SHA224_ECDSA_NAME);
    }

    public JCSPSHA224ECDSASign(String str) {
        super(str, "GenSHA224ECDSA");
    }

    public JCSPSHA224ECDSASign(String str, String str2) {
        super(str, str2);
    }
}
