package ru.CryptoPro.JCSP.Sign;

import java.security.SignatureException;
import ru.CryptoPro.JCP.tools.Array;
import ru.CryptoPro.JCSP.JCSPLogger;

/* loaded from: classes4.dex */
public class JCSPGostElSign extends JCSPCryptoProSign {
    public JCSPGostElSign() {
        this("GOST3411withGOST3410EL");
    }

    @Override // ru.CryptoPro.JCSP.Sign.CryptoProSign, java.security.SignatureSpi
    public byte[] engineSign() throws SignatureException {
        return Array.invByteOrderB(super.engineSign());
    }

    @Override // ru.CryptoPro.JCSP.Sign.CryptoProSign, java.security.SignatureSpi
    public boolean engineVerify(byte[] bArr, int i, int i2) throws SignatureException {
        int signatureLength = getSignatureLength(i2);
        if (i2 >= signatureLength) {
            try {
                if (bArr.length - i >= signatureLength) {
                    byte[] bArr2 = new byte[signatureLength];
                    System.arraycopy(bArr, i, bArr2, 0, signatureLength);
                    Array.invByteOrder(bArr2);
                    return super.engineVerify(bArr2, 0, signatureLength);
                }
            } catch (SignatureException e) {
                b();
                throw e;
            }
        }
        JCSPLogger.enter();
        SignatureException signatureException = new SignatureException(CryptoProSign.resource.getString("InvSigLen"));
        JCSPLogger.warning(signatureException);
        throw signatureException;
    }

    public JCSPGostElSign(String str) {
        this(str, "GenGOST");
    }

    public JCSPGostElSign(String str, String str2) {
        super(str, str2);
    }
}
