package ru.CryptoPro.JCSP.Sign.ecdsa;

import ru.CryptoPro.JCP.JCP;

/* loaded from: classes4.dex */
public class JCSPCryptoProKeccak512ECDSASign extends JCSPCryptoProSHA1ECDSASign {
    public JCSPCryptoProKeccak512ECDSASign() {
        this(JCP.SIGN_CRYPTOPRO_KECCAK_512_ECDSA_NAME);
    }

    public JCSPCryptoProKeccak512ECDSASign(String str) {
        this(str, "GenKECCAK-512ECDSA");
    }

    public JCSPCryptoProKeccak512ECDSASign(String str, String str2) {
        super(str, str2);
    }
}
