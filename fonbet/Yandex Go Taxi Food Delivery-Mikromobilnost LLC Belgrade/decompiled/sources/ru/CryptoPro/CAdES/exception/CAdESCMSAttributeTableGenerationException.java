package ru.CryptoPro.CAdES.exception;

import java.util.Vector;
import org.bouncycastle.cms.CMSAttributeTableGenerationException;
import ru.CryptoPro.AdES.exception.AdESException;
import ru.CryptoPro.AdES.exception.IAdESException;

/* loaded from: classes4.dex */
public class CAdESCMSAttributeTableGenerationException extends CMSAttributeTableGenerationException implements IAdESException {
    private final Integer a;

    public CAdESCMSAttributeTableGenerationException(String str, Exception exc, Integer num) {
        super(str, exc);
        this.a = num;
    }

    @Override // ru.CryptoPro.AdES.exception.IAdESException
    public Integer getErrorCode() {
        return this.a;
    }

    @Override // ru.CryptoPro.AdES.exception.IAdESException
    public Vector<Integer> getErrorCodeList() {
        Vector<Integer> vector = new Vector<>();
        vector.add(this.a);
        return vector;
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(getMessage());
        stringBuffer.append("; error code: [");
        stringBuffer.append(this.a);
        stringBuffer.append("] '");
        stringBuffer.append(AdESException.getErrorCodeName(this.a));
        return stringBuffer.toString();
    }
}
