package ru.CryptoPro.JCSP.Sign.ecdsa;

import ru.CryptoPro.JCP.JCP;

/* loaded from: classes4.dex */
public class JCSPCryptoProSHA3_224ECDSASign extends JCSPCryptoProSHA1ECDSASign {
    public JCSPCryptoProSHA3_224ECDSASign() {
        this(JCP.SIGN_CRYPTOPRO_SHA3_224_ECDSA_NAME);
    }

    public JCSPCryptoProSHA3_224ECDSASign(String str) {
        this(str, "GenSHA3-224ECDSA");
    }

    public JCSPCryptoProSHA3_224ECDSASign(String str, String str2) {
        super(str, str2);
    }
}
