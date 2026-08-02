package ru.CryptoPro.AdES.evidence.crl;

import defpackage.vfc;
import java.net.URI;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CRL;
import java.security.cert.CRLException;
import java.security.cert.CertStoreException;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import ru.CryptoPro.AdES.certificate.CertificateItem;
import ru.CryptoPro.AdES.evidence.AbstractEvidenceSingleCollector;
import ru.CryptoPro.AdES.evidence.Evidence;
import ru.CryptoPro.AdES.evidence.EvidenceParameterValidatorImpl;
import ru.CryptoPro.AdES.evidence.ValidatingItem;
import ru.CryptoPro.AdES.exception.AdESException;
import ru.CryptoPro.AdES.exception.IAdESException;
import ru.CryptoPro.AdES.service.ServiceConnectorImpl;
import ru.CryptoPro.AdES.tools.AdESUtility;
import ru.CryptoPro.AdES.tools.revocation.data.RevocationMethod;
import ru.CryptoPro.AdES.tools.revocation.impl.DefaultValidatingData;
import ru.CryptoPro.JCP.tools.JCPLogger;
import ru.CryptoPro.JCP.tools.logger.LoggingUtils;
import ru.CryptoPro.reprov.certpath.URICertStore;

/* loaded from: classes4.dex */
public class CRLEvidenceCollectorImpl extends AbstractEvidenceSingleCollector<X509CRL> {
    private void checkIfRevoked(X509CRL x509crl, X509Certificate x509Certificate) throws AdESException {
        if (x509crl.isRevoked(x509Certificate)) {
            StringBuilder sb = new StringBuilder("CRL status of certificate: sn ");
            vfc.B(x509Certificate, 16, sb, ", subject ", ", issuer ");
            sb.append(" is REVOKED!");
            throw new AdESException(sb.toString(), IAdESException.ecRevocationCertificateStatusIsRevoked);
        }
    }

    private Evidence<X509CRL> packCRLEvidence(X509CRL x509crl, CertificateItem certificateItem, X509Certificate x509Certificate, X509Certificate x509Certificate2) throws AdESException {
        Date time = Calendar.getInstance().getTime();
        JCPLogger.fine("Validating of CRL (online)...");
        CRLValidatorImpl cRLValidatorImpl = new CRLValidatorImpl();
        cRLValidatorImpl.setValidationDate(time);
        cRLValidatorImpl.setInternalDate(this.internalDate);
        cRLValidatorImpl.setExternalDate(this.externalDate);
        cRLValidatorImpl.setProvider(this.provider);
        cRLValidatorImpl.setCertificateValues(this.additionalCertificateValues);
        cRLValidatorImpl.setIgnoreEvidenceTime(this.ignoreEvidenceTime);
        cRLValidatorImpl.validate(new ValidatingItem<>(new DefaultValidatingData(certificateItem.getCertificate(), x509Certificate, certificateItem.getCertificateRole(), RevocationMethod.CRL), x509crl));
        JCPLogger.fine("Creating CRL evidence block...");
        CRLEvidenceImpl cRLEvidenceImpl = new CRLEvidenceImpl(x509crl, certificateItem.getCertificate(), x509Certificate, this.certificateChain, cRLValidatorImpl.getEvidenceChain());
        new EvidenceParameterValidatorImpl(x509Certificate2, time).validate((EvidenceParameterValidatorImpl) cRLEvidenceImpl);
        return cRLEvidenceImpl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Exception, java.security.cert.CRLException] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Exception, java.lang.Throwable] */
    @Override // ru.CryptoPro.AdES.evidence.AbstractEvidenceSingleCollector, ru.CryptoPro.AdES.evidence.SingleEvidenceCollector
    public Evidence<X509CRL> make(CertificateItem certificateItem, X509Certificate x509Certificate) throws AdESException {
        AdESException adESException;
        JCPLogger.fine("Collecting CRL evidences...");
        X509Certificate certificate = certificateItem.getCertificate();
        X509Certificate x509Certificate2 = this.certificateChain.get(this.certificateChain.size() - 1);
        if (!((AbstractEvidenceSingleCollector) this).additionalCRLs.isEmpty()) {
            JCPLogger.fine("Collecting CRL evidences using local CRLs...");
            for (X509CRL x509crl : ((AbstractEvidenceSingleCollector) this).additionalCRLs) {
                try {
                    Evidence<X509CRL> packCRLEvidence = packCRLEvidence(x509crl, certificateItem, x509Certificate, x509Certificate2);
                    checkIfRevoked(x509crl, certificate);
                    return packCRLEvidence;
                } catch (AdESException e) {
                    this.thrownException = e;
                    JCPLogger.thrown(e);
                }
            }
        }
        JCPLogger.fine("Collecting CRL evidences using CRL distribution points...");
        for (String str : AdESUtility.getCrlUrls(certificate)) {
            JCPLogger.fine("Try to use following url: " + str);
            try {
                try {
                    URICertStore.URICertStoreParameters uRICertStoreParameters = new URICertStore.URICertStoreParameters(URI.create(str));
                    uRICertStoreParameters.useBase64Stream();
                    uRICertStoreParameters.failOnError();
                    Collection<? extends CRL> cRLs = URICertStore.getInstance(uRICertStoreParameters).getCRLs(null);
                    if (cRLs.isEmpty()) {
                        throw new AdESException(ServiceConnectorImpl.getServiceErrorMessage(str, "CRL content is null."), IAdESException.ecOnlineCallFailed);
                    }
                    X509CRL x509crl2 = (X509CRL) cRLs.iterator().next();
                    if (JCPLogger.isFinerEnabled()) {
                        try {
                            LoggingUtils.logBase64EncodedValue("CRL [BASE64]:", x509crl2.getEncoded());
                        } catch (CRLException e2) {
                            adESException = new AdESException((Exception) e2, IAdESException.ecRevocationInvalidCRL);
                            e = e2;
                            this.thrownException = adESException;
                            JCPLogger.thrown(e);
                        }
                    }
                    try {
                        Evidence<X509CRL> packCRLEvidence2 = packCRLEvidence(x509crl2, certificateItem, x509Certificate, x509Certificate2);
                        checkIfRevoked(x509crl2, certificate);
                        return packCRLEvidence2;
                    } catch (AdESException e3) {
                        e = e3;
                        this.thrownException = e;
                        JCPLogger.thrown(e);
                    }
                } catch (AdESException e4) {
                    e = e4;
                    if (!e.getErrorCode().equals(IAdESException.ecOnlineCallFailed)) {
                        throw e;
                    }
                }
            } catch (IllegalArgumentException | InvalidAlgorithmParameterException | NoSuchAlgorithmException | CertStoreException e5) {
                adESException = new AdESException((Exception) e5, IAdESException.ecRevocationInvalidCRL);
                e = e5;
            }
        }
        return null;
    }
}
