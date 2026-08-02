package ru.CryptoPro.JCSP.Sign.rsa;

import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.params.SignatureParamsSpec;

/* loaded from: classes4.dex */
public class JCSPKeccak384RSASign extends JCSPSHA1RSASign {
    public JCSPKeccak384RSASign(String str, String str2) {
        super(str, str2);
        a(SignatureParamsSpec.CRYPT_NOHASHOID);
    }

    public JCSPKeccak384RSASign(String str) {
        this(str, "GenKECCAK-384RSA");
    }

    public JCSPKeccak384RSASign() {
        this(JCP.SIGN_KECCAK_384_RSA_NAME);
    }
}
