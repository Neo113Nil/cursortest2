package ru.CryptoPro.AdES.evidence.crl;

import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import ru.CryptoPro.AdES.Options;
import ru.CryptoPro.AdES.certificate.CertificateItem;
import ru.CryptoPro.AdES.certificate.ComplexCertificateChainValidatorImpl;
import ru.CryptoPro.AdES.certificate.PKUPParameterValidatorImpl;
import ru.CryptoPro.AdES.exception.AdESException;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public class ComplexCRLValidatorImpl extends CRLValidatorImpl {
    @Override // ru.CryptoPro.AdES.evidence.ComplexStatusValidatorImpl
    public void validate(List<X509Certificate> list) throws AdESException {
        JCPLogger.subEnter();
        JCPLogger.fine("Complex validation of CRL...");
        ComplexCertificateChainValidatorImpl complexCertificateChainValidatorImpl = new ComplexCertificateChainValidatorImpl();
        complexCertificateChainValidatorImpl.setProvider(this.provider);
        complexCertificateChainValidatorImpl.setValidationDate(this.validationDate);
        complexCertificateChainValidatorImpl.setCompleteCertificateReferences(this.otherCertIDs);
        complexCertificateChainValidatorImpl.setCompleteRevocationReferences(this.crlOcspRefs);
        complexCertificateChainValidatorImpl.setRevocationValues(this.revocationValues);
        complexCertificateChainValidatorImpl.setSignerMustHaveOcspEvidence(false);
        Options options = this.options;
        if (options != null) {
            complexCertificateChainValidatorImpl.setEnableRevocationReferenceSearchByRevocationValue(options.isEnableRevocationReferenceSearchByRevocationValue());
        }
        HashSet hashSet = new HashSet(list);
        hashSet.remove(list.get(0));
        PKUPParameterValidatorImpl pKUPParameterValidatorImpl = new PKUPParameterValidatorImpl(this.validationDate, hashSet);
        complexCertificateChainValidatorImpl.setCertificateRole(CertificateItem.CertificateRole.CRLSigner);
        complexCertificateChainValidatorImpl.validate(list, Collections.singletonList(pKUPParameterValidatorImpl));
        JCPLogger.subExit();
    }
}
