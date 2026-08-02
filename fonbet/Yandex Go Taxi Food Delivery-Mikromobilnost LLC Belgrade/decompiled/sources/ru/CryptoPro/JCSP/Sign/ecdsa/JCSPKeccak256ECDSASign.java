package ru.CryptoPro.JCSP.Sign.ecdsa;

import ru.CryptoPro.JCP.JCP;

/* loaded from: classes4.dex */
public class JCSPKeccak256ECDSASign extends JCSPSHA1ECDSASign {
    public JCSPKeccak256ECDSASign() {
        this(JCP.SIGN_KECCAK_256_ECDSA_NAME);
    }

    public JCSPKeccak256ECDSASign(String str) {
        this(str, "GenKECCAK-256ECDSA");
    }

    public JCSPKeccak256ECDSASign(String str, String str2) {
        super(str, str2);
    }
}
