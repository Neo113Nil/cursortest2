package ru.CryptoPro.JCSP.Sign.rsa;

import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.params.SignatureParamsSpec;

/* loaded from: classes4.dex */
public class JCSPCryptoProKeccak384RSASign extends JCSPCryptoProSHA1RSASign {
    public JCSPCryptoProKeccak384RSASign(String str, String str2) {
        super(str, str2);
        a(SignatureParamsSpec.CRYPT_NOHASHOID);
    }

    public JCSPCryptoProKeccak384RSASign(String str) {
        this(str, "GenKECCAK-384RSA");
    }

    public JCSPCryptoProKeccak384RSASign() {
        this(JCP.SIGN_CRYPTOPRO_KECCAK_384_RSA_NAME);
    }
}
