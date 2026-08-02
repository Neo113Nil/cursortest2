package ru.CryptoPro.JCSP.Sign.rsa;

import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.params.SignatureParamsSpec;

/* loaded from: classes4.dex */
public class JCSPKeccak256RSASign extends JCSPSHA1RSASign {
    public JCSPKeccak256RSASign(String str, String str2) {
        super(str, str2);
        a(SignatureParamsSpec.CRYPT_NOHASHOID);
    }

    public JCSPKeccak256RSASign(String str) {
        this(str, "GenKECCAK-256RSA");
    }

    public JCSPKeccak256RSASign() {
        this(JCP.SIGN_KECCAK_256_RSA_NAME);
    }
}
