package ru.CryptoPro.JCSP.Sign.rsa;

import ru.CryptoPro.JCP.JCP;

/* loaded from: classes4.dex */
public class JCSPCryptoProSHA224RSASign extends JCSPCryptoProSHA1RSASign {
    public JCSPCryptoProSHA224RSASign() {
        this(JCP.SIGN_CRYPTOPRO_SHA224_RSA_NAME);
    }

    public JCSPCryptoProSHA224RSASign(String str) {
        this(str, "GenSHA224RSA");
    }

    public JCSPCryptoProSHA224RSASign(String str, String str2) {
        super(str, str2);
    }
}
