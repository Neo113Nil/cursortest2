package ru.CryptoPro.JCSP.Sign.rsa;

import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.params.SignatureParamsSpec;

/* loaded from: classes4.dex */
public class JCSPCryptoProKeccak224RSASign extends JCSPCryptoProSHA1RSASign {
    public JCSPCryptoProKeccak224RSASign(String str, String str2) {
        super(str, str2);
        a(SignatureParamsSpec.CRYPT_NOHASHOID);
    }

    public JCSPCryptoProKeccak224RSASign(String str) {
        this(str, "GenKECCAK-224RSA");
    }

    public JCSPCryptoProKeccak224RSASign() {
        this(JCP.SIGN_CRYPTOPRO_KECCAK_224_RSA_NAME);
    }
}
