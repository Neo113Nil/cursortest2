package ru.CryptoPro.JCSP.Sign.ecdsa;

import ru.CryptoPro.JCP.JCP;

/* loaded from: classes4.dex */
public class JCSPKeccak224ECDSASign extends JCSPSHA1ECDSASign {
    public JCSPKeccak224ECDSASign() {
        this(JCP.SIGN_KECCAK_224_ECDSA_NAME);
    }

    public JCSPKeccak224ECDSASign(String str) {
        this(str, "GenKECCAK-224ECDSA");
    }

    public JCSPKeccak224ECDSASign(String str, String str2) {
        super(str, str2);
    }
}
