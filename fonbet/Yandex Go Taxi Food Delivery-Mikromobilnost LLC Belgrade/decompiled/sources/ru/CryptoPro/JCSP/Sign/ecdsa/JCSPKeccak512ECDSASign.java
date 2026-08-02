package ru.CryptoPro.JCSP.Sign.ecdsa;

import ru.CryptoPro.JCP.JCP;

/* loaded from: classes4.dex */
public class JCSPKeccak512ECDSASign extends JCSPSHA1ECDSASign {
    public JCSPKeccak512ECDSASign() {
        this(JCP.SIGN_KECCAK_512_ECDSA_NAME);
    }

    public JCSPKeccak512ECDSASign(String str) {
        this(str, "GenKECCAK-512ECDSA");
    }

    public JCSPKeccak512ECDSASign(String str, String str2) {
        super(str, str2);
    }
}
