package ru.CryptoPro.JCSP.Sign.rsa;

import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.params.SignatureParamsSpec;

/* loaded from: classes4.dex */
public class JCSPCryptoProKeccak256RSASign extends JCSPCryptoProSHA1RSASign {
    public JCSPCryptoProKeccak256RSASign(String str, String str2) {
        super(str, str2);
        a(SignatureParamsSpec.CRYPT_NOHASHOID);
    }

    public JCSPCryptoProKeccak256RSASign(String str) {
        this(str, "GenKECCAK-256RSA");
    }

    public JCSPCryptoProKeccak256RSASign() {
        this(JCP.SIGN_CRYPTOPRO_KECCAK_256_RSA_NAME);
    }
}
