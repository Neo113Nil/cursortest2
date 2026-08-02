package ru.CryptoPro.JCSP.Sign.ecdsa;

import ru.CryptoPro.JCP.JCP;

/* loaded from: classes4.dex */
public class JCSPCryptoProSHA512ECDSASign extends JCSPCryptoProSHA1ECDSASign {
    public JCSPCryptoProSHA512ECDSASign() {
        this(JCP.SIGN_CRYPTOPRO_SHA512_ECDSA_NAME);
    }

    public JCSPCryptoProSHA512ECDSASign(String str) {
        super(str, "GenSHA512ECDSA");
    }

    public JCSPCryptoProSHA512ECDSASign(String str, String str2) {
        super(str, str2);
    }
}
