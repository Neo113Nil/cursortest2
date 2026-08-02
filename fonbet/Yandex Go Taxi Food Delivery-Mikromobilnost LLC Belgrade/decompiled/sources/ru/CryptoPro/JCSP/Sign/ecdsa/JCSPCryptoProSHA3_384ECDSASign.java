package ru.CryptoPro.JCSP.Sign.ecdsa;

import ru.CryptoPro.JCP.JCP;

/* loaded from: classes4.dex */
public class JCSPCryptoProSHA3_384ECDSASign extends JCSPCryptoProSHA1ECDSASign {
    public JCSPCryptoProSHA3_384ECDSASign() {
        this(JCP.SIGN_CRYPTOPRO_SHA3_384_ECDSA_NAME);
    }

    public JCSPCryptoProSHA3_384ECDSASign(String str) {
        this(str, "GenSHA3-384ECDSA");
    }

    public JCSPCryptoProSHA3_384ECDSASign(String str, String str2) {
        super(str, str2);
    }
}
