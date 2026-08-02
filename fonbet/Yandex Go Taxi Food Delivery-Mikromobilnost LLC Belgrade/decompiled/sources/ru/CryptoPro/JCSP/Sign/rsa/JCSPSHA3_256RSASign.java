package ru.CryptoPro.JCSP.Sign.rsa;

import ru.CryptoPro.JCP.JCP;

/* loaded from: classes4.dex */
public class JCSPSHA3_256RSASign extends JCSPSHA1RSASign {
    public JCSPSHA3_256RSASign() {
        this(JCP.SIGN_SHA3_256_RSA_NAME);
    }

    public JCSPSHA3_256RSASign(String str) {
        this(str, "GenSHA3-256RSA");
    }

    public JCSPSHA3_256RSASign(String str, String str2) {
        super(str, str2);
    }
}
