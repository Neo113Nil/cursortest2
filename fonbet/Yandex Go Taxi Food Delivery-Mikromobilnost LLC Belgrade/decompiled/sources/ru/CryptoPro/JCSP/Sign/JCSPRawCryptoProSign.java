package ru.CryptoPro.JCSP.Sign;

import java.security.SignatureException;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.tools.Array;
import ru.CryptoPro.JCSP.JCSPLogger;

/* loaded from: classes4.dex */
public class JCSPRawCryptoProSign extends JCSPRawGostElSign {
    public JCSPRawCryptoProSign() {
        super(JCP.RAW_CRYPTOPRO_SIGN_NAME);
    }

    @Override // ru.CryptoPro.JCSP.Sign.JCSPGostElSign, ru.CryptoPro.JCSP.Sign.CryptoProSign, java.security.SignatureSpi
    public byte[] engineSign() throws SignatureException {
        return Array.invByteOrderB(super.engineSign());
    }

    @Override // ru.CryptoPro.JCSP.Sign.JCSPGostElSign, ru.CryptoPro.JCSP.Sign.CryptoProSign, java.security.SignatureSpi
    public boolean engineVerify(byte[] bArr, int i, int i2) throws SignatureException {
        int signatureLength = getSignatureLength(i2);
        if (i2 < signatureLength || bArr.length - i < signatureLength) {
            JCSPLogger.enter();
            SignatureException signatureException = new SignatureException(CryptoProSign.resource.getString("InvSigLen"));
            JCSPLogger.warning(signatureException);
            throw signatureException;
        }
        byte[] bArr2 = new byte[signatureLength];
        System.arraycopy(bArr, i, bArr2, 0, signatureLength);
        Array.invByteOrder(bArr2);
        return super.engineVerify(bArr2, 0, signatureLength);
    }

    public JCSPRawCryptoProSign(String str, String str2) {
        super(str, str2);
    }
}
