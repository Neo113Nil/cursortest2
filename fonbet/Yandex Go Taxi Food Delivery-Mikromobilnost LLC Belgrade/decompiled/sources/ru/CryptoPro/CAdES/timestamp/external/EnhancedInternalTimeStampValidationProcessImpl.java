package ru.CryptoPro.CAdES.timestamp.external;

import defpackage.m8z0;
import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.Set;
import ru.CryptoPro.AdES.AdESParameters;
import ru.CryptoPro.AdES.external.decode.AdESXLongType1AttributeDecoder;
import ru.CryptoPro.AdES.external.timestamp.EnhancedInternalTimeStampValidationProcess;
import ru.CryptoPro.AdES.external.timestamp.data.TSPData;

/* loaded from: classes4.dex */
public class EnhancedInternalTimeStampValidationProcessImpl extends InternalTimeStampValidationProcessImpl implements EnhancedInternalTimeStampValidationProcess {
    public EnhancedInternalTimeStampValidationProcessImpl(TSPData tSPData, m8z0 m8z0Var) {
        super(tSPData, m8z0Var);
    }

    @Override // ru.CryptoPro.CAdES.timestamp.external.InternalTimeStampValidationProcessImpl
    public Integer a() {
        return AdESParameters.TSA_SIGNATURE_TIME_STAMP;
    }

    @Override // ru.CryptoPro.AdES.external.timestamp.EnhancedInternalTimeStampValidationProcess
    public Set<X509Certificate> getCertificateValues() {
        return Collections.unmodifiableSet(this.y);
    }

    @Override // ru.CryptoPro.AdES.external.timestamp.EnhancedInternalTimeStampValidationProcess
    public void setParentalDecoder(AdESXLongType1AttributeDecoder adESXLongType1AttributeDecoder) {
        this.A = adESXLongType1AttributeDecoder;
    }
}
