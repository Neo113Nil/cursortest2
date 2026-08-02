package ru.CryptoPro.JCSP.Sign.ecdsa;

import ru.CryptoPro.JCP.JCP;

/* loaded from: classes4.dex */
public class JCSPCryptoProSHA256ECDSASign extends JCSPCryptoProSHA1ECDSASign {
    public JCSPCryptoProSHA256ECDSASign() {
        this(JCP.SIGN_CRYPTOPRO_SHA256_ECDSA_NAME);
    }

    public JCSPCryptoProSHA256ECDSASign(String str) {
        super(str, "GenSHA256ECDSA");
    }

    public JCSPCryptoProSHA256ECDSASign(String str, String str2) {
        super(str, str2);
    }
}
