package ru.CryptoPro.JCSP.Sign.ecdsa;

import ru.CryptoPro.JCP.JCP;

/* loaded from: classes4.dex */
public class JCSPCryptoProKeccak224ECDSASign extends JCSPCryptoProSHA1ECDSASign {
    public JCSPCryptoProKeccak224ECDSASign() {
        this(JCP.SIGN_CRYPTOPRO_KECCAK_224_ECDSA_NAME);
    }

    public JCSPCryptoProKeccak224ECDSASign(String str) {
        this(str, "GenKECCAK-224ECDSA");
    }

    public JCSPCryptoProKeccak224ECDSASign(String str, String str2) {
        super(str, str2);
    }
}
