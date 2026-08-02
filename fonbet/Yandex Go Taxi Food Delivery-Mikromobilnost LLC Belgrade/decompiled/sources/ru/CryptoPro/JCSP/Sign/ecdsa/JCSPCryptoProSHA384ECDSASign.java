package ru.CryptoPro.JCSP.Sign.ecdsa;

import ru.CryptoPro.JCP.JCP;

/* loaded from: classes4.dex */
public class JCSPCryptoProSHA384ECDSASign extends JCSPCryptoProSHA1ECDSASign {
    public JCSPCryptoProSHA384ECDSASign() {
        this(JCP.SIGN_CRYPTOPRO_SHA384_ECDSA_NAME);
    }

    public JCSPCryptoProSHA384ECDSASign(String str) {
        super(str, "GenSHA384ECDSA");
    }

    public JCSPCryptoProSHA384ECDSASign(String str, String str2) {
        super(str, str2);
    }
}
