package ru.CryptoPro.AdES.evidence;

import defpackage.he5;
import defpackage.vfc;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import ru.CryptoPro.AdES.Options;
import ru.CryptoPro.AdES.certificate.CertificateItem;
import ru.CryptoPro.AdES.evidence.crl.CRLEvidenceCollectorImpl;
import ru.CryptoPro.AdES.evidence.ocsp.OCSPEvidenceCollectorImpl;
import ru.CryptoPro.AdES.exception.AdESException;
import ru.CryptoPro.AdES.exception.IAdESException;
import ru.CryptoPro.AdES.tools.AdESUtility;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public class EvidenceCollectorImpl extends AbstractCertificateChainEvidence implements EvidenceCollector {
    private Options options = null;

    private boolean exists(List<Evidence<?>> list, X509Certificate x509Certificate) {
        Iterator<Evidence<?>> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().getCheckableCertificate().equals(x509Certificate)) {
                return true;
            }
        }
        return false;
    }

    @Override // ru.CryptoPro.AdES.evidence.EvidenceCollector
    public void collect(List<CertificateItem> list, List<Evidence<?>> list2, boolean z) throws AdESException {
        JCPLogger.subEnter();
        LinkedList linkedList = new LinkedList(list);
        List<X509Certificate> certificates = CertificateItem.getCertificates(linkedList);
        int size = linkedList.size() - 1;
        if (size <= 0) {
            return;
        }
        int i = 0;
        while (i <= size) {
            CertificateItem certificateItem = (CertificateItem) linkedList.get(i);
            X509Certificate certificate = certificateItem.getCertificate();
            X509Certificate certificate2 = ((CertificateItem) (i < size ? linkedList.get(i + 1) : linkedList.get(i))).getCertificate();
            if (exists(list2, certificate)) {
                JCPLogger.fineFormat("Exclude certificate: \n\tserial number: {0}\n\tsubject: {1}\n\tissuer:  {2} from evidence collecting because it has already been added there.", certificate.getSerialNumber().toString(16), certificate.getSubjectDN(), certificate.getIssuerDN());
            } else if (AdESUtility.skipCertificateValidity(certificateItem.getCertificate(), certificateItem.getCertificateRole())) {
                JCPLogger.fineFormat("Skip certificate:\n\tserial number: {0}\n\tsubject: {1}\n\tissuer:  {2}\n\treason: pkix-ocsp-nocheck or self-signed.", certificate.getSerialNumber().toString(16), certificate.getSubjectDN(), certificate.getIssuerDN());
                NullEvidenceImpl nullEvidenceImpl = new NullEvidenceImpl(certificate, certificate2, certificates);
                nullEvidenceImpl.setIndex(String.valueOf(list2.size()));
                list2.add(nullEvidenceImpl);
            } else {
                z = i == 0 && z;
                OCSPEvidenceCollectorImpl oCSPEvidenceCollectorImpl = new OCSPEvidenceCollectorImpl();
                oCSPEvidenceCollectorImpl.setCheckableCertificateChain(certificates);
                oCSPEvidenceCollectorImpl.setSignerMustHaveOcspEvidence(z);
                oCSPEvidenceCollectorImpl.setProvider(this.provider);
                oCSPEvidenceCollectorImpl.setInternalDate(this.internalDate);
                oCSPEvidenceCollectorImpl.setExternalDate(this.externalDate);
                oCSPEvidenceCollectorImpl.setCertificateValues(this.additionalCertificateValues);
                oCSPEvidenceCollectorImpl.setOptions(this.options);
                Evidence<he5> make = oCSPEvidenceCollectorImpl.make(certificateItem, certificate2);
                if (make != null) {
                    make.setIndex(String.valueOf(list2.size()));
                    list2.add(make);
                    collect(CertificateItem.performChainWithRoles(make.getEvidenceChain(), CertificateItem.CertificateRole.OCSPSigner), list2, false);
                } else {
                    if (z) {
                        AdESException exception = oCSPEvidenceCollectorImpl.getException();
                        if (exception != null) {
                            throw exception;
                        }
                        StringBuilder sb = new StringBuilder("The signer certificate: sn ");
                        vfc.B(certificate, 16, sb, ", subject ", ", issuer ");
                        sb.append(" must have OCSP evidence but service is unavailable or error occurred. OCSP evidence is not created.");
                        throw new AdESException(sb.toString(), IAdESException.ecOnlineCallFailed);
                    }
                    CRLEvidenceCollectorImpl cRLEvidenceCollectorImpl = new CRLEvidenceCollectorImpl();
                    cRLEvidenceCollectorImpl.setCheckableCertificateChain(certificates);
                    cRLEvidenceCollectorImpl.setSignerMustHaveOcspEvidence(z);
                    cRLEvidenceCollectorImpl.setProvider(this.provider);
                    cRLEvidenceCollectorImpl.setInternalDate(this.internalDate);
                    cRLEvidenceCollectorImpl.setExternalDate(this.externalDate);
                    cRLEvidenceCollectorImpl.setCertificateValues(this.additionalCertificateValues);
                    cRLEvidenceCollectorImpl.setCRLs(this.additionalCRLs);
                    cRLEvidenceCollectorImpl.setIgnoreEvidenceTime(this.ignoreEvidenceTime);
                    Evidence<X509CRL> make2 = cRLEvidenceCollectorImpl.make(certificateItem, certificate2);
                    if (make2 == null) {
                        AdESException exception2 = cRLEvidenceCollectorImpl.getException();
                        if (exception2 == null) {
                            throw new AdESException("OCSP and CRL evidences not found.", IAdESException.ecRevocationIsNull);
                        }
                        throw exception2;
                    }
                    make2.setIndex(String.valueOf(list2.size()));
                    list2.add(make2);
                    collect(CertificateItem.performChainWithRoles(make2.getEvidenceChain(), CertificateItem.CertificateRole.CRLSigner), list2, false);
                }
            }
            i++;
        }
        JCPLogger.subExit();
    }

    @Override // ru.CryptoPro.AdES.evidence.EvidenceCollector, ru.CryptoPro.AdES.SignatureOptions
    public void setOptions(Options options) {
        this.options = options;
    }
}
