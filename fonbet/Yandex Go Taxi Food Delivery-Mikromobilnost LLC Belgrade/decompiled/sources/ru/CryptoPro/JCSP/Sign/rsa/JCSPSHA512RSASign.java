package ru.CryptoPro.JCSP.Sign.rsa;

import ru.CryptoPro.JCP.JCP;

/* loaded from: classes4.dex */
public class JCSPSHA512RSASign extends JCSPSHA1RSASign {
    public JCSPSHA512RSASign() {
        this(JCP.SIGN_SHA512_RSA_NAME);
    }

    public JCSPSHA512RSASign(String str) {
        this(str, "GenSHA512RSA");
    }

    public JCSPSHA512RSASign(String str, String str2) {
        super(str, str2);
    }
}
