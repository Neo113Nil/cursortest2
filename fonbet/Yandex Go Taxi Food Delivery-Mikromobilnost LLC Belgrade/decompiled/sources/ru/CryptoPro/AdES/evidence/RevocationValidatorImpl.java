package ru.CryptoPro.AdES.evidence;

import defpackage.he5;
import defpackage.m79;
import defpackage.mr60;
import defpackage.sbf;
import defpackage.tbf;
import java.security.cert.X509CRL;
import java.util.Arrays;
import java.util.Iterator;
import ru.CryptoPro.AdES.evidence.crl.CRLFinder;
import ru.CryptoPro.AdES.evidence.crl.ComplexCRLValidatorImpl;
import ru.CryptoPro.AdES.evidence.ocsp.ComplexOCSPValidatorImpl;
import ru.CryptoPro.AdES.evidence.ocsp.OCSPFinder;
import ru.CryptoPro.AdES.exception.AdESException;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public class RevocationValidatorImpl extends ComplexStatusValidatorImpl<Void> {
    @Override // ru.CryptoPro.AdES.evidence.ComplexStatusValidatorImpl, ru.CryptoPro.AdES.BaseParameterValidator
    public void validate(Void r7) throws AdESException {
        JCPLogger.subEnter();
        JCPLogger.fine("Validation of revocation evidences...");
        ComplexOCSPValidatorImpl complexOCSPValidatorImpl = new ComplexOCSPValidatorImpl();
        complexOCSPValidatorImpl.setSignerMustHaveOcspEvidence(false);
        complexOCSPValidatorImpl.setProvider(this.provider);
        complexOCSPValidatorImpl.setValidationDate(this.externalDate);
        complexOCSPValidatorImpl.setInternalDate(this.internalDate);
        complexOCSPValidatorImpl.setExternalDate(this.externalDate);
        complexOCSPValidatorImpl.setIgnoreEvidenceTime(this.ignoreEvidenceTime);
        complexOCSPValidatorImpl.setCertificateValues(this.certificateValues);
        complexOCSPValidatorImpl.setCompleteCertificateReferences(this.otherCertIDs);
        complexOCSPValidatorImpl.setCompleteRevocationReferences(this.crlOcspRefs);
        complexOCSPValidatorImpl.setRevocationValues(this.revocationValues);
        complexOCSPValidatorImpl.setOptions(this.options);
        ComplexCRLValidatorImpl complexCRLValidatorImpl = new ComplexCRLValidatorImpl();
        complexCRLValidatorImpl.setSignerMustHaveOcspEvidence(false);
        complexCRLValidatorImpl.setProvider(this.provider);
        complexCRLValidatorImpl.setValidationDate(this.externalDate);
        complexCRLValidatorImpl.setInternalDate(this.internalDate);
        complexCRLValidatorImpl.setExternalDate(this.externalDate);
        complexCRLValidatorImpl.setIgnoreEvidenceTime(this.ignoreEvidenceTime);
        complexCRLValidatorImpl.setCertificateValues(this.certificateValues);
        complexCRLValidatorImpl.setCompleteCertificateReferences(this.otherCertIDs);
        complexCRLValidatorImpl.setCompleteRevocationReferences(this.crlOcspRefs);
        complexCRLValidatorImpl.setRevocationValues(this.revocationValues);
        complexCRLValidatorImpl.setOptions(this.options);
        for (tbf tbfVar : this.crlOcspRefs) {
            mr60 ocspids = tbfVar.getOcspids();
            he5[] ocspVals = this.revocationValues.getOcspVals();
            if (ocspids != null && ocspVals != null) {
                OCSPFinder oCSPFinder = new OCSPFinder(Arrays.asList(ocspVals));
                oCSPFinder.setProvider(this.provider);
                Iterator<he5> it = oCSPFinder.find(ocspids).iterator();
                while (it.hasNext()) {
                    complexOCSPValidatorImpl.validate(new ValidatingItem<>(it.next()));
                }
            }
            sbf crlids = tbfVar.getCrlids();
            m79[] crlVals = this.revocationValues.getCrlVals();
            if (crlids != null && crlVals != null) {
                CRLFinder cRLFinder = new CRLFinder(Arrays.asList(crlVals));
                cRLFinder.setProvider(this.provider);
                Iterator<X509CRL> it2 = cRLFinder.find(crlids).iterator();
                while (it2.hasNext()) {
                    complexCRLValidatorImpl.validate(new ValidatingItem<>(it2.next()));
                }
            }
        }
        JCPLogger.subExit();
    }
}
