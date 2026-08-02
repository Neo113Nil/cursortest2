package ru.CryptoPro.AdES.evidence.crl;

import defpackage.pc51;
import defpackage.t2f0;
import defpackage.vc51;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SignatureException;
import java.security.cert.CRLException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.List;
import ru.CryptoPro.AdES.certificate.CertificateChainBuilderImpl;
import ru.CryptoPro.AdES.certificate.CertificateFinder;
import ru.CryptoPro.AdES.evidence.ComplexStatusValidatorImpl;
import ru.CryptoPro.AdES.evidence.ValidatingItem;
import ru.CryptoPro.AdES.exception.AdESException;
import ru.CryptoPro.AdES.exception.IAdESException;
import ru.CryptoPro.AdES.tools.AdESUtility;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public class CRLValidatorImpl extends ComplexStatusValidatorImpl<ValidatingItem<X509CRL>> {
    @Override // ru.CryptoPro.AdES.evidence.ComplexStatusValidatorImpl, ru.CryptoPro.AdES.BaseParameterValidator
    public void validate(ValidatingItem<X509CRL> validatingItem) throws AdESException {
        JCPLogger.subEnter();
        X509CRL revocationData = validatingItem.getRevocationData();
        X509Certificate issuerCertificate = validatingItem.getValidatingCertificateData() != null ? validatingItem.getValidatingCertificateData().getIssuerCertificate() : null;
        try {
            if (this.internalDate.after(revocationData.getNextUpdate())) {
                throw new AdESException("CRL issued by " + revocationData.getIssuerDN() + " has invalid nextUpdate " + revocationData.getNextUpdate() + " (later), if compare to internal stamp " + this.internalDate, IAdESException.ecRevocationCRLWrongNextUpdate);
            }
            if (!this.ignoreEvidenceTime) {
                Date date = this.validationDate;
                if (date == null) {
                    date = new Date();
                }
                if (date.before(revocationData.getThisUpdate())) {
                    throw new AdESException("CRL issued by " + revocationData.getIssuerDN() + " has inappropriate thisUpdate " + revocationData.getThisUpdate() + " if compare to validation date " + date, IAdESException.ecRevocationCRLWrongThisUpdate);
                }
                if (date.after(revocationData.getNextUpdate())) {
                    throw new AdESException("CRL issued by " + revocationData.getIssuerDN() + " has unsuitable nextUpdate " + revocationData.getNextUpdate() + " if compare to validation date " + date, IAdESException.ecRevocationCRLWrongNextUpdate);
                }
            }
            byte[] authorityKeyIdentifier = AdESUtility.getAuthorityKeyIdentifier(revocationData.getExtensionValue(pc51.f.a));
            vc51 a = t2f0.a(revocationData);
            if (issuerCertificate != null) {
                try {
                    if (!a.equals(t2f0.c(issuerCertificate))) {
                        throw new AdESException("Inappropriate CRL.", IAdESException.ecRevocationInvalidCRL);
                    }
                } catch (CertificateEncodingException e) {
                    throw new AdESException("Certificate decoding failed.", e, IAdESException.ecRevocationInvalidCRL);
                }
            }
            CertificateFinder certificateFinder = new CertificateFinder(this.certificateValues);
            certificateFinder.setProvider(this.provider);
            X509Certificate find = certificateFinder.find(a, authorityKeyIdentifier);
            try {
                revocationData.verify(find.getPublicKey(), this.provider);
                JCPLogger.fine("Validation of CRL evidence certificate chain...");
                CertificateChainBuilderImpl certificateChainBuilderImpl = new CertificateChainBuilderImpl();
                certificateChainBuilderImpl.setValidationDate(this.validationDate);
                certificateChainBuilderImpl.setProvider(this.provider);
                certificateChainBuilderImpl.setCertificateValues(this.certificateValues);
                certificateChainBuilderImpl.build(find);
                List<X509Certificate> certificateChain = certificateChainBuilderImpl.getCertificateChain();
                this.evidenceChain = certificateChain;
                validate(certificateChain);
                JCPLogger.subExit();
            } catch (SignatureException e2) {
                JCPLogger.thrown(e2);
                throw new AdESException("CRL issued by " + revocationData.getIssuerDN() + " has invalid signature (verified by certificate: sn " + find.getSerialNumber().toString(16) + ", subject " + find.getSubjectDN() + ", issuer  " + find.getIssuerDN() + ") [" + e2.getMessage() + "].", IAdESException.ecSignatureInvalid);
            }
        } catch (IOException e3) {
            AdESException adESException = new AdESException(e3, IAdESException.ecRevocationInvalidCRL);
            adESException.initCause(e3);
            throw adESException;
        } catch (InvalidKeyException e4) {
            AdESException adESException2 = new AdESException(e4, IAdESException.ecRevocationInvalidCRL);
            adESException2.initCause(e4);
            throw adESException2;
        } catch (NoSuchAlgorithmException e5) {
            AdESException adESException3 = new AdESException(e5, IAdESException.ecRevocationInvalidCRL);
            adESException3.initCause(e5);
            throw adESException3;
        } catch (NoSuchProviderException e6) {
            AdESException adESException4 = new AdESException(e6, IAdESException.ecRevocationInvalidCRL);
            adESException4.initCause(e6);
            throw adESException4;
        } catch (CRLException e7) {
            AdESException adESException5 = new AdESException(e7, IAdESException.ecRevocationInvalidCRL);
            adESException5.initCause(e7);
            throw adESException5;
        }
    }
}
