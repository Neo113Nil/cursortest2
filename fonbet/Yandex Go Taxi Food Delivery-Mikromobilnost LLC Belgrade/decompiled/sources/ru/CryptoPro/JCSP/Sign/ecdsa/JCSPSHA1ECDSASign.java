package ru.CryptoPro.JCSP.Sign.ecdsa;

import java.security.SignatureException;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.tools.Array;
import ru.CryptoPro.JCSP.Sign.JCSPGostElSign;

/* loaded from: classes4.dex */
public class JCSPSHA1ECDSASign extends JCSPGostElSign {
    public JCSPSHA1ECDSASign() {
        this(JCP.SIGN_SHA1_ECDSA_NAME);
    }

    @Override // ru.CryptoPro.JCSP.Sign.JCSPGostElSign, ru.CryptoPro.JCSP.Sign.CryptoProSign, java.security.SignatureSpi
    public byte[] engineSign() throws SignatureException {
        byte[] engineSign = super.engineSign();
        int i = 0;
        while (engineSign[i] == 0) {
            i++;
        }
        int length = engineSign.length - i;
        byte[] bArr = new byte[length];
        Array.copy(engineSign, i, bArr, 0, length);
        return bArr;
    }

    @Override // ru.CryptoPro.JCP.Sign.AbstractSignature
    public boolean validateAlgorithms(String str, String str2) {
        if (str2.equalsIgnoreCase(JCP.ECDSA_NAME) || str2.equalsIgnoreCase(JCP.CP_ECDSA_NAME) || str2.equalsIgnoreCase(JCP.ECDH_NAME) || str2.equalsIgnoreCase(JCP.CP_ECDH_NAME) || str2.equalsIgnoreCase("EC")) {
            return str.equalsIgnoreCase(JCP.SIGN_SHA1_ECDSA_NAME) || str.equalsIgnoreCase(JCP.SIGN_CP_SHA1_ECDSA_NAME) || str.equalsIgnoreCase(JCP.SIGN_SHA224_ECDSA_NAME) || str.equalsIgnoreCase(JCP.SIGN_CP_SHA224_ECDSA_NAME) || str.equalsIgnoreCase(JCP.SIGN_SHA256_ECDSA_NAME) || str.equalsIgnoreCase(JCP.SIGN_CP_SHA256_ECDSA_NAME) || str.equalsIgnoreCase(JCP.SIGN_SHA384_ECDSA_NAME) || str.equalsIgnoreCase(JCP.SIGN_CP_SHA384_ECDSA_NAME) || str.equalsIgnoreCase(JCP.SIGN_SHA512_ECDSA_NAME) || str.equalsIgnoreCase(JCP.SIGN_CP_SHA512_ECDSA_NAME) || str.equalsIgnoreCase(JCP.SIGN_SHA3_224_ECDSA_NAME) || str.equalsIgnoreCase(JCP.SIGN_CP_SHA3_224_ECDSA_NAME) || str.equalsIgnoreCase(JCP.SIGN_SHA3_256_ECDSA_NAME) || str.equalsIgnoreCase(JCP.SIGN_CP_SHA3_256_ECDSA_NAME) || str.equalsIgnoreCase(JCP.SIGN_SHA3_384_ECDSA_NAME) || str.equalsIgnoreCase(JCP.SIGN_CP_SHA3_384_ECDSA_NAME) || str.equalsIgnoreCase(JCP.SIGN_SHA3_512_ECDSA_NAME) || str.equalsIgnoreCase(JCP.SIGN_CP_SHA3_512_ECDSA_NAME) || str.equalsIgnoreCase(JCP.SIGN_KECCAK_224_ECDSA_NAME) || str.equalsIgnoreCase(JCP.SIGN_CP_KECCAK_224_ECDSA_NAME) || str.equalsIgnoreCase(JCP.SIGN_KECCAK_256_ECDSA_NAME) || str.equalsIgnoreCase(JCP.SIGN_CP_KECCAK_256_ECDSA_NAME) || str.equalsIgnoreCase(JCP.SIGN_KECCAK_384_ECDSA_NAME) || str.equalsIgnoreCase(JCP.SIGN_CP_KECCAK_384_ECDSA_NAME) || str.equalsIgnoreCase(JCP.SIGN_KECCAK_512_ECDSA_NAME) || str.equalsIgnoreCase(JCP.SIGN_CP_KECCAK_512_ECDSA_NAME);
        }
        return false;
    }

    public JCSPSHA1ECDSASign(String str) {
        super(str, "GenSHA1ECDSA");
    }

    public JCSPSHA1ECDSASign(String str, String str2) {
        super(str, str2);
    }
}
