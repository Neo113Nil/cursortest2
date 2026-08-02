package ru.CryptoPro.AdES.timestamp;

import defpackage.p4x0;
import defpackage.rza1;
import ru.CryptoPro.AdES.exception.AdESException;
import ru.CryptoPro.AdES.external.timestamp.TSPTimeStampValidationProcess;
import ru.CryptoPro.AdES.external.timestamp.data.TSPData;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public class TSPTimeStampValidatorImpl implements TSPTimeStampValidator {
    @Override // ru.CryptoPro.AdES.timestamp.TSPTimeStampValidator, ru.CryptoPro.AdES.BaseParameterValidator
    public void validate(TSPTimeStampValidationProcess tSPTimeStampValidationProcess) throws AdESException {
        JCPLogger.subEnter();
        JCPLogger.fine("Validating timestamp digest...");
        String str = tSPTimeStampValidationProcess.getTimeStampToken().c.p().a;
        TSPData data = tSPTimeStampValidationProcess.getData();
        data.setDigestAlgorithm(str);
        data.validateImprint(rza1.b(((p4x0) tSPTimeStampValidationProcess.getTimeStampToken().c.a).c.b));
        JCPLogger.fine("Validating timestamp certificate chain...");
        tSPTimeStampValidationProcess.validate();
        JCPLogger.subExit();
    }
}
