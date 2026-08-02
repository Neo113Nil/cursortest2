package ru.CryptoPro.CAdES.timestamp.external;

import defpackage.m8z0;
import ru.CryptoPro.AdES.AdESParameters;
import ru.CryptoPro.AdES.external.timestamp.data.TSPData;

/* loaded from: classes4.dex */
public class EnhancedExternalTimeStampValidationProcessImpl extends EnhancedInternalTimeStampValidationProcessImpl {
    public EnhancedExternalTimeStampValidationProcessImpl(TSPData tSPData, m8z0 m8z0Var) {
        super(tSPData, m8z0Var);
    }

    @Override // ru.CryptoPro.CAdES.timestamp.external.EnhancedInternalTimeStampValidationProcessImpl, ru.CryptoPro.CAdES.timestamp.external.InternalTimeStampValidationProcessImpl
    public final Integer a() {
        return AdESParameters.TSA_CAdESC_TIME_STAMP;
    }
}
