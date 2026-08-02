package ru.CryptoPro.JCSP.Sign.ecdsa;

import ru.CryptoPro.JCP.JCP;

/* loaded from: classes4.dex */
public class JCSPCryptoProSHA224ECDSASign extends JCSPCryptoProSHA1ECDSASign {
    public JCSPCryptoProSHA224ECDSASign() {
        this(JCP.SIGN_CRYPTOPRO_SHA224_ECDSA_NAME);
    }

    public JCSPCryptoProSHA224ECDSASign(String str) {
        super(str, "GenSHA224ECDSA");
    }

    public JCSPCryptoProSHA224ECDSASign(String str, String str2) {
        super(str, str2);
    }
}
