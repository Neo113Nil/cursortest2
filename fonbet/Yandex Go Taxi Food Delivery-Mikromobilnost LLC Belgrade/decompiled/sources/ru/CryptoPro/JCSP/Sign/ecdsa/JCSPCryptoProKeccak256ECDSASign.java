package ru.CryptoPro.JCSP.Sign.ecdsa;

import ru.CryptoPro.JCP.JCP;

/* loaded from: classes4.dex */
public class JCSPCryptoProKeccak256ECDSASign extends JCSPCryptoProSHA1ECDSASign {
    public JCSPCryptoProKeccak256ECDSASign() {
        this(JCP.SIGN_CRYPTOPRO_KECCAK_256_ECDSA_NAME);
    }

    public JCSPCryptoProKeccak256ECDSASign(String str) {
        this(str, "GenKECCAK-256ECDSA");
    }

    public JCSPCryptoProKeccak256ECDSASign(String str, String str2) {
        super(str, str2);
    }
}
