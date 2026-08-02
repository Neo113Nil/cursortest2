package ru.CryptoPro.JCSP.Sign.ecdsa;

import ru.CryptoPro.JCP.JCP;

/* loaded from: classes4.dex */
public class JCSPKeccak384ECDSASign extends JCSPSHA1ECDSASign {
    public JCSPKeccak384ECDSASign() {
        this(JCP.SIGN_KECCAK_384_ECDSA_NAME);
    }

    public JCSPKeccak384ECDSASign(String str) {
        this(str, "GenKECCAK-384ECDSA");
    }

    public JCSPKeccak384ECDSASign(String str, String str2) {
        super(str, str2);
    }
}
