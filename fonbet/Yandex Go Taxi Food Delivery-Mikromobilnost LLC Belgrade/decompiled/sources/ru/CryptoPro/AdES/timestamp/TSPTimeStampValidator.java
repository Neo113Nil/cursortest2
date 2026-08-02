package ru.CryptoPro.AdES.timestamp;

import ru.CryptoPro.AdES.BaseParameterValidator;
import ru.CryptoPro.AdES.exception.AdESException;
import ru.CryptoPro.AdES.external.timestamp.TSPTimeStampValidationProcess;

/* loaded from: classes4.dex */
public interface TSPTimeStampValidator extends BaseParameterValidator<TSPTimeStampValidationProcess> {
    @Override // ru.CryptoPro.AdES.BaseParameterValidator
    /* synthetic */ void validate(TSPTimeStampValidationProcess tSPTimeStampValidationProcess) throws AdESException;
}
