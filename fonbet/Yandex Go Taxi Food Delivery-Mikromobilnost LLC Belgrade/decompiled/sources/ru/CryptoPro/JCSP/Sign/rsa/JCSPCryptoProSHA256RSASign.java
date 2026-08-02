package ru.CryptoPro.JCSP.Sign.rsa;

import ru.CryptoPro.JCP.JCP;

/* loaded from: classes4.dex */
public class JCSPCryptoProSHA256RSASign extends JCSPCryptoProSHA1RSASign {
    public JCSPCryptoProSHA256RSASign() {
        this(JCP.SIGN_CRYPTOPRO_SHA256_RSA_NAME);
    }

    public JCSPCryptoProSHA256RSASign(String str) {
        this(str, "GenSHA256RSA");
    }

    public JCSPCryptoProSHA256RSASign(String str, String str2) {
        super(str, str2);
    }
}
