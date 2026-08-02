package ru.CryptoPro.JCSP.Sign.rsa;

import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.params.SignatureParamsSpec;

/* loaded from: classes4.dex */
public class JCSPKeccak224RSASign extends JCSPSHA1RSASign {
    public JCSPKeccak224RSASign(String str, String str2) {
        super(str, str2);
        a(SignatureParamsSpec.CRYPT_NOHASHOID);
    }

    public JCSPKeccak224RSASign(String str) {
        this(str, "GenKECCAK-224RSA");
    }

    public JCSPKeccak224RSASign() {
        this(JCP.SIGN_KECCAK_224_RSA_NAME);
    }
}
