package ru.CryptoPro.JCSP.Sign.ecdsa;

import ru.CryptoPro.JCP.JCP;

/* loaded from: classes4.dex */
public class JCSPSHA384ECDSASign extends JCSPSHA1ECDSASign {
    public JCSPSHA384ECDSASign() {
        this(JCP.SIGN_SHA384_ECDSA_NAME);
    }

    public JCSPSHA384ECDSASign(String str) {
        super(str, "GenSHA384ECDSA");
    }

    public JCSPSHA384ECDSASign(String str, String str2) {
        super(str, str2);
    }
}
