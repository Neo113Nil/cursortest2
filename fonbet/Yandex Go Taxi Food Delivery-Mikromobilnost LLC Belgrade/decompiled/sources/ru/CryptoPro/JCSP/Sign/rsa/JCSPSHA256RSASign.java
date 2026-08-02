package ru.CryptoPro.JCSP.Sign.rsa;

import ru.CryptoPro.JCP.JCP;

/* loaded from: classes4.dex */
public class JCSPSHA256RSASign extends JCSPSHA1RSASign {
    public JCSPSHA256RSASign() {
        this(JCP.SIGN_SHA256_RSA_NAME);
    }

    public JCSPSHA256RSASign(String str) {
        this(str, "GenSHA256RSA");
    }

    public JCSPSHA256RSASign(String str, String str2) {
        super(str, str2);
    }
}
