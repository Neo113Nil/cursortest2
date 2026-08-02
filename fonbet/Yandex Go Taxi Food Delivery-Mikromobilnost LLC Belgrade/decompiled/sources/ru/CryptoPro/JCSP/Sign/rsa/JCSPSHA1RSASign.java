package ru.CryptoPro.JCSP.Sign.rsa;

import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.Key.KeyInterface;
import ru.CryptoPro.JCSP.Key.AbstractKeySpec;
import ru.CryptoPro.JCSP.Key.PublicKeySpec;
import ru.CryptoPro.JCSP.Sign.JCSPGostElSign;

/* loaded from: classes4.dex */
public class JCSPSHA1RSASign extends JCSPGostElSign {
    public JCSPSHA1RSASign() {
        this(JCP.SIGN_SHA1_RSA_NAME);
    }

    public static int a(KeyInterface keyInterface) {
        int keyLength;
        if (keyInterface == null) {
            return 0;
        }
        if (keyInterface instanceof AbstractKeySpec) {
            keyLength = ((AbstractKeySpec) keyInterface).getKeyLength();
        } else {
            if (!(keyInterface instanceof PublicKeySpec)) {
                return 0;
            }
            keyLength = ((PublicKeySpec) keyInterface).getKeyLength();
        }
        return keyLength >> 3;
    }

    @Override // ru.CryptoPro.JCP.Sign.AbstractSignature
    public int getSignatureLength(int i) {
        return a(this.B);
    }

    @Override // ru.CryptoPro.JCP.Sign.AbstractSignature
    public boolean validateAlgorithms(String str, String str2) {
        if (str2.equalsIgnoreCase("RSA") || str2.equalsIgnoreCase("CP_RSA")) {
            return str.equalsIgnoreCase(JCP.SIGN_SHA1_RSA_NAME) || str.equalsIgnoreCase(JCP.SIGN_CP_SHA1_RSA_NAME) || str.equalsIgnoreCase(JCP.SIGN_SHA224_RSA_NAME) || str.equalsIgnoreCase(JCP.SIGN_CP_SHA224_RSA_NAME) || str.equalsIgnoreCase(JCP.SIGN_SHA256_RSA_NAME) || str.equalsIgnoreCase(JCP.SIGN_CP_SHA256_RSA_NAME) || str.equalsIgnoreCase(JCP.SIGN_SHA384_RSA_NAME) || str.equalsIgnoreCase(JCP.SIGN_CP_SHA384_RSA_NAME) || str.equalsIgnoreCase(JCP.SIGN_SHA512_RSA_NAME) || str.equalsIgnoreCase(JCP.SIGN_CP_SHA512_RSA_NAME) || str.equalsIgnoreCase(JCP.SIGN_SHA3_224_RSA_NAME) || str.equalsIgnoreCase(JCP.SIGN_CP_SHA3_224_RSA_NAME) || str.equalsIgnoreCase(JCP.SIGN_SHA3_256_RSA_NAME) || str.equalsIgnoreCase(JCP.SIGN_CP_SHA3_256_RSA_NAME) || str.equalsIgnoreCase(JCP.SIGN_SHA3_384_RSA_NAME) || str.equalsIgnoreCase(JCP.SIGN_CP_SHA3_384_RSA_NAME) || str.equalsIgnoreCase(JCP.SIGN_SHA3_512_RSA_NAME) || str.equalsIgnoreCase(JCP.SIGN_CP_SHA3_512_RSA_NAME) || str.equalsIgnoreCase(JCP.SIGN_KECCAK_224_RSA_NAME) || str.equalsIgnoreCase(JCP.SIGN_CP_KECCAK_224_RSA_NAME) || str.equalsIgnoreCase(JCP.SIGN_KECCAK_256_RSA_NAME) || str.equalsIgnoreCase(JCP.SIGN_CP_KECCAK_256_RSA_NAME) || str.equalsIgnoreCase(JCP.SIGN_KECCAK_384_RSA_NAME) || str.equalsIgnoreCase(JCP.SIGN_CP_KECCAK_384_RSA_NAME) || str.equalsIgnoreCase(JCP.SIGN_KECCAK_512_RSA_NAME) || str.equalsIgnoreCase(JCP.SIGN_CP_KECCAK_512_RSA_NAME);
        }
        return false;
    }

    public JCSPSHA1RSASign(String str) {
        super(str, "GenSHA1RSA");
    }

    public JCSPSHA1RSASign(String str, String str2) {
        super(str, str2);
    }
}
