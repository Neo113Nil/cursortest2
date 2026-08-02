package ru.CryptoPro.JCSP.Sign.rsa;

import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.params.SignatureParamsSpec;

/* loaded from: classes4.dex */
public class JCSPCryptoProKeccak512RSASign extends JCSPCryptoProSHA1RSASign {
    public JCSPCryptoProKeccak512RSASign(String str, String str2) {
        super(str, str2);
        a(SignatureParamsSpec.CRYPT_NOHASHOID);
    }

    public JCSPCryptoProKeccak512RSASign(String str) {
        this(str, "GenKECCAK-512RSA");
    }

    public JCSPCryptoProKeccak512RSASign() {
        this(JCP.SIGN_CRYPTOPRO_KECCAK_512_RSA_NAME);
    }
}
