package ru.CryptoPro.JCSP.Sign.rsa;

import ru.CryptoPro.JCP.JCP;

/* loaded from: classes4.dex */
public class JCSPSHA224RSASign extends JCSPSHA1RSASign {
    public JCSPSHA224RSASign() {
        this(JCP.SIGN_SHA224_RSA_NAME);
    }

    public JCSPSHA224RSASign(String str) {
        this(str, "GenSHA224RSA");
    }

    public JCSPSHA224RSASign(String str, String str2) {
        super(str, str2);
    }
}
