package ru.CryptoPro.JCSP.Sign.ecdsa;

import ru.CryptoPro.JCP.JCP;

/* loaded from: classes4.dex */
public class JCSPCryptoProSHA3_512ECDSASign extends JCSPCryptoProSHA1ECDSASign {
    public JCSPCryptoProSHA3_512ECDSASign() {
        this(JCP.SIGN_CRYPTOPRO_SHA3_512_ECDSA_NAME);
    }

    public JCSPCryptoProSHA3_512ECDSASign(String str) {
        this(str, "GenSHA3-512ECDSA");
    }

    public JCSPCryptoProSHA3_512ECDSASign(String str, String str2) {
        super(str, str2);
    }
}
