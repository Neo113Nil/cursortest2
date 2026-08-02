package ru.CryptoPro.JCSP.Sign.ecdsa;

import java.security.SignatureException;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.tools.Array;
import ru.CryptoPro.JCSP.Sign.JCSPCryptoProSign;

/* loaded from: classes4.dex */
public class JCSPCryptoProSHA1ECDSASign extends JCSPCryptoProSign {
    public JCSPCryptoProSHA1ECDSASign() {
        this(JCP.SIGN_CRYPTOPRO_SHA1_ECDSA_NAME);
    }

    @Override // ru.CryptoPro.JCSP.Sign.CryptoProSign, java.security.SignatureSpi
    public byte[] engineSign() throws SignatureException {
        byte[] engineSign = super.engineSign();
        int length = engineSign.length;
        while (engineSign[length - 1] == 0) {
            length--;
        }
        byte[] bArr = new byte[length];
        Array.copy(engineSign, 0, bArr, 0, length);
        return bArr;
    }

    @Override // ru.CryptoPro.JCP.Sign.AbstractSignature
    public boolean validateAlgorithms(String str, String str2) {
        if (str2.equalsIgnoreCase(JCP.ECDSA_NAME) || str2.equalsIgnoreCase(JCP.CP_ECDSA_NAME) || str2.equalsIgnoreCase(JCP.ECDH_NAME) || str2.equalsIgnoreCase(JCP.CP_ECDH_NAME) || str2.equalsIgnoreCase("EC")) {
            return str.equalsIgnoreCase(JCP.SIGN_CRYPTOPRO_SHA1_ECDSA_NAME) || str.equalsIgnoreCase(JCP.SIGN_CRYPTOPRO_SHA224_ECDSA_NAME) || str.equalsIgnoreCase(JCP.SIGN_CRYPTOPRO_SHA256_ECDSA_NAME) || str.equalsIgnoreCase(JCP.SIGN_CRYPTOPRO_SHA384_ECDSA_NAME) || str.equalsIgnoreCase(JCP.SIGN_CRYPTOPRO_SHA512_ECDSA_NAME) || str.equalsIgnoreCase(JCP.SIGN_CRYPTOPRO_SHA3_224_ECDSA_NAME) || str.equalsIgnoreCase(JCP.SIGN_CRYPTOPRO_SHA3_256_ECDSA_NAME) || str.equalsIgnoreCase(JCP.SIGN_CRYPTOPRO_SHA3_384_ECDSA_NAME) || str.equalsIgnoreCase(JCP.SIGN_CRYPTOPRO_SHA3_512_ECDSA_NAME) || str.equalsIgnoreCase(JCP.SIGN_CRYPTOPRO_KECCAK_224_ECDSA_NAME) || str.equalsIgnoreCase(JCP.SIGN_CRYPTOPRO_KECCAK_256_ECDSA_NAME) || str.equalsIgnoreCase(JCP.SIGN_CRYPTOPRO_KECCAK_384_ECDSA_NAME) || str.equalsIgnoreCase(JCP.SIGN_CRYPTOPRO_KECCAK_512_ECDSA_NAME);
        }
        return false;
    }

    public JCSPCryptoProSHA1ECDSASign(String str) {
        super(str, "GenSHA1ECDSA");
    }

    public JCSPCryptoProSHA1ECDSASign(String str, String str2) {
        super(str, str2);
    }
}
