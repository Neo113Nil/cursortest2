package ru.CryptoPro.JCSP.Sign.rsa;

import ru.CryptoPro.JCP.JCP;

/* loaded from: classes4.dex */
public class JCSPCryptoProSHA3_224RSASign extends JCSPCryptoProSHA1RSASign {
    public JCSPCryptoProSHA3_224RSASign() {
        this(JCP.SIGN_CRYPTOPRO_SHA3_224_RSA_NAME);
    }

    public JCSPCryptoProSHA3_224RSASign(String str) {
        this(str, "GenSHA3-224RSA");
    }

    public JCSPCryptoProSHA3_224RSASign(String str, String str2) {
        super(str, str2);
    }
}
