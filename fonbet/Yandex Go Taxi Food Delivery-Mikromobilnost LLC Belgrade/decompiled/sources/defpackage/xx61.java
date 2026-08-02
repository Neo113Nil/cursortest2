package defpackage;

import java.util.Date;
import ru.CryptoPro.AdES.AdESParameters;
import ru.CryptoPro.AdES.exception.IAdESException;
import ru.CryptoPro.AdES.external.decode.AdESXLongType1AttributeDecoder;
import ru.CryptoPro.AdES.external.decode.EnhancedInternalTimeStampAdESSignerParameters;
import ru.CryptoPro.CAdES.CAdESSigner;
import ru.CryptoPro.CAdES.CAdESSignerXLT1Impl;
import ru.CryptoPro.CAdES.exception.CAdESException;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public class xx61 extends CAdESSignerXLT1Impl implements EnhancedInternalTimeStampAdESSignerParameters {
    public Date F;
    public Date G;

    public xx61(acs0 acs0Var, Integer num) {
        super(acs0Var, num, false);
        this.F = null;
        this.G = null;
    }

    @Override // ru.CryptoPro.CAdES.CAdESSignerBESImpl, ru.CryptoPro.CAdES.CAdESSignerPKCS7Impl, ru.CryptoPro.CAdES.CAdESSignerRawImpl, ru.CryptoPro.CAdES.CAdESSigner, ru.CryptoPro.CAdES.interfaces.external.ICAdESSigner, ru.CryptoPro.CAdES.CAdESSignerBES
    public final void addCountersigner(acs0 acs0Var) {
        throw new CAdESException("Unsupported method", IAdESException.ecInternal);
    }

    @Override // ru.CryptoPro.CAdES.CAdESSignerXLT1Impl, ru.CryptoPro.CAdES.CAdESSignerPKCS7Impl, ru.CryptoPro.AdES.external.signature.AdESSigner
    public final Date getExternalDate() {
        return this.G;
    }

    @Override // ru.CryptoPro.CAdES.CAdESSignerTImpl, ru.CryptoPro.CAdES.CAdESSignerPKCS7Impl, ru.CryptoPro.AdES.external.signature.AdESSigner
    public final Date getInternalDate() {
        return this.F;
    }

    @Override // ru.CryptoPro.CAdES.CAdESSignerXLT1Impl, ru.CryptoPro.CAdES.CAdESSignerTImpl, ru.CryptoPro.CAdES.CAdESSignerBESImpl, ru.CryptoPro.CAdES.CAdESSigner, ru.CryptoPro.AdES.external.signature.AdESSigner, ru.CryptoPro.AdES.external.interfaces.IAdESSigner, ru.CryptoPro.CAdES.interfaces.external.ICAdESSigner, ru.CryptoPro.CAdES.CAdESSignerBES
    public Integer getSignatureType() {
        return AdESParameters.TSA_SIGNATURE_TIME_STAMP;
    }

    @Override // ru.CryptoPro.AdES.external.decode.EnhancedInternalTimeStampAdESSignerParameters, ru.CryptoPro.AdES.external.decode.InternalTimeStampCAdESSignerParameters
    public final void setContent(byte[] bArr) {
        JCPLogger.subEnter();
        this.F = CAdESSigner.b(bArr);
        JCPLogger.subExit();
    }

    @Override // ru.CryptoPro.AdES.external.decode.EnhancedInternalTimeStampAdESSignerParameters, ru.CryptoPro.AdES.external.decode.InternalTimeStampCAdESSignerParameters
    public final void setExternalDate(Date date) {
        this.G = date;
    }

    @Override // ru.CryptoPro.AdES.external.decode.EnhancedInternalTimeStampAdESSignerParameters
    public final void setParentalDecoder(AdESXLongType1AttributeDecoder adESXLongType1AttributeDecoder) {
        this.b = adESXLongType1AttributeDecoder;
    }

    @Override // ru.CryptoPro.AdES.external.decode.EnhancedInternalTimeStampAdESSignerParameters
    public final void updateIfNeed() {
        erd0 erd0Var = this.z;
        if (!(erd0Var instanceof sx61) || ((sx61) erd0Var).i()) {
            return;
        }
        h();
    }

    public xx61(acs0 acs0Var) {
        this(acs0Var, AdESParameters.TSA_SIGNATURE_TIME_STAMP);
    }
}
