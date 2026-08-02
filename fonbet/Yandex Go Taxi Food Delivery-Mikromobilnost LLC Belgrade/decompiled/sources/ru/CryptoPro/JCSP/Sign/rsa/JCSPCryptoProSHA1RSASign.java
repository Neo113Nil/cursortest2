package ru.CryptoPro.JCSP.Sign.rsa;

import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCSP.Sign.JCSPCryptoProSign;

/* loaded from: classes4.dex */
public class JCSPCryptoProSHA1RSASign extends JCSPCryptoProSign {
    public JCSPCryptoProSHA1RSASign() {
        this(JCP.SIGN_CRYPTOPRO_SHA1_RSA_NAME);
    }

    @Override // ru.CryptoPro.JCP.Sign.AbstractSignature
    public int getSignatureLength(int i) {
        return JCSPSHA1RSASign.a(this.B);
    }

    @Override // ru.CryptoPro.JCP.Sign.AbstractSignature
    public boolean validateAlgorithms(String str, String str2) {
        if (str2.equalsIgnoreCase("RSA") || str2.equalsIgnoreCase("CP_RSA")) {
            return str.equalsIgnoreCase(JCP.SIGN_CRYPTOPRO_SHA1_RSA_NAME) || str.equalsIgnoreCase(JCP.SIGN_CRYPTOPRO_SHA224_RSA_NAME) || str.equalsIgnoreCase(JCP.SIGN_CRYPTOPRO_SHA256_RSA_NAME) || str.equalsIgnoreCase(JCP.SIGN_CRYPTOPRO_SHA384_RSA_NAME) || str.equalsIgnoreCase(JCP.SIGN_CRYPTOPRO_SHA512_RSA_NAME) || str.equalsIgnoreCase(JCP.SIGN_CRYPTOPRO_SHA3_224_RSA_NAME) || str.equalsIgnoreCase(JCP.SIGN_CRYPTOPRO_SHA3_256_RSA_NAME) || str.equalsIgnoreCase(JCP.SIGN_CRYPTOPRO_SHA3_384_RSA_NAME) || str.equalsIgnoreCase(JCP.SIGN_CRYPTOPRO_SHA3_512_RSA_NAME) || str.equalsIgnoreCase(JCP.SIGN_CRYPTOPRO_KECCAK_224_RSA_NAME) || str.equalsIgnoreCase(JCP.SIGN_CRYPTOPRO_KECCAK_256_RSA_NAME) || str.equalsIgnoreCase(JCP.SIGN_CRYPTOPRO_KECCAK_384_RSA_NAME) || str.equalsIgnoreCase(JCP.SIGN_CRYPTOPRO_KECCAK_512_RSA_NAME);
        }
        return false;
    }

    public JCSPCryptoProSHA1RSASign(String str) {
        super(str, "GenSHA1RSA");
    }

    public JCSPCryptoProSHA1RSASign(String str, String str2) {
        super(str, str2);
    }
}
