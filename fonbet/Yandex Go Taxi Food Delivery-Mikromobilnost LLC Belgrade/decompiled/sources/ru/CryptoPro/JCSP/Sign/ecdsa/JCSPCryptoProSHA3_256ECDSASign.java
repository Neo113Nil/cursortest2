package ru.CryptoPro.JCSP.Sign.ecdsa;

import ru.CryptoPro.JCP.JCP;

/* loaded from: classes4.dex */
public class JCSPCryptoProSHA3_256ECDSASign extends JCSPCryptoProSHA1ECDSASign {
    public JCSPCryptoProSHA3_256ECDSASign() {
        this(JCP.SIGN_CRYPTOPRO_SHA3_256_ECDSA_NAME);
    }

    public JCSPCryptoProSHA3_256ECDSASign(String str) {
        this(str, "GenSHA3-256ECDSA");
    }

    public JCSPCryptoProSHA3_256ECDSASign(String str, String str2) {
        super(str, str2);
    }
}
