package ru.CryptoPro.CAdES.timestamp.external;

import defpackage.m8z0;
import ru.CryptoPro.AdES.AdESParameters;

/* loaded from: classes4.dex */
public class ExternalTimeStampEnhancementProcessImpl extends InternalTimeStampEnhancementProcessImpl {
    public ExternalTimeStampEnhancementProcessImpl(m8z0 m8z0Var) {
        super(m8z0Var);
    }

    @Override // ru.CryptoPro.CAdES.timestamp.external.InternalTimeStampEnhancementProcessImpl, ru.CryptoPro.AdES.external.timestamp.TSPTimeStampEnhancementProcess
    public Integer getTimeStampEnhanceType() {
        return AdESParameters.TSA_CAdESC_TIME_STAMP;
    }

    @Override // ru.CryptoPro.CAdES.timestamp.external.InternalTimeStampEnhancementProcessImpl, ru.CryptoPro.AdES.external.timestamp.TSPTimeStampEnhancementProcess
    public Integer getTimeStampType() {
        return AdESParameters.TSA_CAdESC_TIME_STAMP_SIMPLE;
    }
}
