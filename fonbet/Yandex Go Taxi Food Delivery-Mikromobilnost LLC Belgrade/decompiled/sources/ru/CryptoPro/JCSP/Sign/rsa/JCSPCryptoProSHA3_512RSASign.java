package ru.CryptoPro.JCSP.Sign.rsa;

import ru.CryptoPro.JCP.JCP;

/* loaded from: classes4.dex */
public class JCSPCryptoProSHA3_512RSASign extends JCSPCryptoProSHA1RSASign {
    public JCSPCryptoProSHA3_512RSASign() {
        this(JCP.SIGN_CRYPTOPRO_SHA3_512_RSA_NAME);
    }

    public JCSPCryptoProSHA3_512RSASign(String str) {
        this(str, "GenSHA3-512RSA");
    }

    public JCSPCryptoProSHA3_512RSASign(String str, String str2) {
        super(str, str2);
    }
}
