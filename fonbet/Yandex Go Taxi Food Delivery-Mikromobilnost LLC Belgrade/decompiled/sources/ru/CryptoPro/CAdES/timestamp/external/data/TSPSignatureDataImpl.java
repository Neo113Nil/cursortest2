package ru.CryptoPro.CAdES.timestamp.external.data;

import java.security.MessageDigest;
import java.util.Arrays;
import ru.CryptoPro.AdES.exception.IAdESException;
import ru.CryptoPro.AdES.external.timestamp.data.TSPData;
import ru.CryptoPro.AdES.tools.AdESUtility;
import ru.CryptoPro.CAdES.exception.CAdESException;
import ru.CryptoPro.JCP.tools.Array;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public class TSPSignatureDataImpl implements TSPData {
    public final byte[] a;
    public String b = null;
    public String c = null;
    public boolean w = false;
    public boolean x = false;

    public TSPSignatureDataImpl(byte[] bArr) {
        this.a = Array.copy(bArr);
    }

    @Override // ru.CryptoPro.AdES.external.timestamp.data.TSPData
    public byte[] getDigest() throws CAdESException {
        JCPLogger.fine("Calculating digest using signature...");
        try {
            String correctProviderByHashAlgorithm = AdESUtility.correctProviderByHashAlgorithm(this.b, this.c);
            String str = this.c;
            MessageDigest messageDigest = correctProviderByHashAlgorithm == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, correctProviderByHashAlgorithm);
            byte[] bArr = this.a;
            messageDigest.update(bArr, 0, bArr.length);
            return messageDigest.digest();
        } catch (Exception e) {
            throw new CAdESException(e, IAdESException.ecTimestampWrongImprint);
        }
    }

    @Override // ru.CryptoPro.AdES.external.timestamp.data.TSPData
    public String getProvider() {
        return this.b;
    }

    @Override // ru.CryptoPro.AdES.external.timestamp.data.TSPData, ru.CryptoPro.AdES.tools.DigestUtility
    public void setDigestAlgorithm(String str) {
        this.c = str;
    }

    @Override // ru.CryptoPro.AdES.external.timestamp.data.TSPData, ru.CryptoPro.AdES.tools.ProviderUtility
    public void setProvider(String str) {
        this.b = str;
    }

    @Override // ru.CryptoPro.AdES.external.timestamp.data.TSPData
    public void validateImprint(byte[] bArr) throws CAdESException {
        JCPLogger.subEnter();
        if (!Arrays.equals(bArr, getDigest())) {
            JCPLogger.fine("Trying to use V2 version of digest calculation...");
            this.x = true;
            if (!Arrays.equals(bArr, getDigest())) {
                JCPLogger.fine("Trying to use old version of digest calculation...");
                this.w = true;
                if (!Arrays.equals(bArr, getDigest())) {
                    throw new CAdESException(IAdESException.ecTimestampWrongImprint);
                }
            }
        }
        JCPLogger.subExit();
    }
}
