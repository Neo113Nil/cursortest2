package ru.CryptoPro.JCSP.Sign.ecdsa;

import ru.CryptoPro.JCP.JCP;

/* loaded from: classes4.dex */
public class JCSPCryptoProKeccak384ECDSASign extends JCSPCryptoProSHA1ECDSASign {
    public JCSPCryptoProKeccak384ECDSASign() {
        this(JCP.SIGN_CRYPTOPRO_KECCAK_384_ECDSA_NAME);
    }

    public JCSPCryptoProKeccak384ECDSASign(String str) {
        this(str, "GenKECCAK-384ECDSA");
    }

    public JCSPCryptoProKeccak384ECDSASign(String str, String str2) {
        super(str, str2);
    }
}
