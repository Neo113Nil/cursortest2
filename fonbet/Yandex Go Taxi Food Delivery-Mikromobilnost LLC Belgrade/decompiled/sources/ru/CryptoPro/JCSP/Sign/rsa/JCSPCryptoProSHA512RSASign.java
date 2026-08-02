package ru.CryptoPro.JCSP.Sign.rsa;

import ru.CryptoPro.JCP.JCP;

/* loaded from: classes4.dex */
public class JCSPCryptoProSHA512RSASign extends JCSPCryptoProSHA1RSASign {
    public JCSPCryptoProSHA512RSASign() {
        this(JCP.SIGN_CRYPTOPRO_SHA512_RSA_NAME);
    }

    public JCSPCryptoProSHA512RSASign(String str) {
        this(str, "GenSHA512RSA");
    }

    public JCSPCryptoProSHA512RSASign(String str, String str2) {
        super(str, str2);
    }
}
