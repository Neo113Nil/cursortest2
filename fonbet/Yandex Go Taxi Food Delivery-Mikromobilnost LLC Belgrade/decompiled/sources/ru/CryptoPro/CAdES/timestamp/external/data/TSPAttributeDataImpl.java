package ru.CryptoPro.CAdES.timestamp.external.data;

import defpackage.vc3;
import java.security.MessageDigest;
import ru.CryptoPro.AdES.exception.IAdESException;
import ru.CryptoPro.AdES.tools.AdESUtility;
import ru.CryptoPro.CAdES.exception.CAdESException;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public class TSPAttributeDataImpl extends TSPSignatureDataImpl {
    public final vc3[] y;

    public TSPAttributeDataImpl(byte[] bArr, vc3[] vc3VarArr) {
        super(bArr);
        this.y = vc3VarArr;
    }

    @Override // ru.CryptoPro.CAdES.timestamp.external.data.TSPSignatureDataImpl, ru.CryptoPro.AdES.external.timestamp.data.TSPData
    public byte[] getDigest() throws CAdESException {
        JCPLogger.fine("Calculating digest using signature and attributes...");
        try {
            String correctProviderByHashAlgorithm = AdESUtility.correctProviderByHashAlgorithm(this.b, this.c);
            String str = this.c;
            MessageDigest messageDigest = correctProviderByHashAlgorithm == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, correctProviderByHashAlgorithm);
            byte[] bArr = this.a;
            messageDigest.update(bArr, 0, bArr.length);
            for (vc3 vc3Var : this.y) {
                if (this.w) {
                    messageDigest.update(vc3Var.getEncoded("DER"), 0, vc3Var.getEncoded("DER").length);
                } else {
                    byte[] encoded = vc3Var.a.getEncoded("DER");
                    byte[] encoded2 = vc3Var.b.getEncoded("DER");
                    messageDigest.update(encoded);
                    messageDigest.update(encoded2);
                }
            }
            return messageDigest.digest();
        } catch (Exception e) {
            throw new CAdESException(e, IAdESException.ecTimestampWrongImprint);
        }
    }
}
