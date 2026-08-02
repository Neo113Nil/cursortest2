package ru.CryptoPro.JCSP.Sign.rsa;

import ru.CryptoPro.JCP.JCP;

/* loaded from: classes4.dex */
public class JCSPRawCryptoProRSASign extends JCSPCryptoProSHA1RSASign {
    public JCSPRawCryptoProRSASign() {
        super(JCP.SIGN_RAW_CRYPTOPRO_RSA_NAME, "None");
    }

    @Override // ru.CryptoPro.JCSP.Sign.rsa.JCSPCryptoProSHA1RSASign, ru.CryptoPro.JCP.Sign.AbstractSignature
    public boolean validateAlgorithms(String str, String str2) {
        return str2.equalsIgnoreCase("RSA") || str2.equalsIgnoreCase("CP_RSA");
    }
}
