package ru.CryptoPro.JCSP.Sign.rsa;

import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.params.SignatureParamsSpec;

/* loaded from: classes4.dex */
public class JCSPKeccak512RSASign extends JCSPSHA1RSASign {
    public JCSPKeccak512RSASign(String str, String str2) {
        super(str, str2);
        a(SignatureParamsSpec.CRYPT_NOHASHOID);
    }

    public JCSPKeccak512RSASign(String str) {
        this(str, "GenKECCAK-512RSA");
    }

    public JCSPKeccak512RSASign() {
        this(JCP.SIGN_KECCAK_512_RSA_NAME);
    }
}
