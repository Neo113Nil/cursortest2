package ru.CryptoPro.AdES.certificate;

import defpackage.b64;
import defpackage.oyr;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.cert.CertPath;
import java.security.cert.CertPathValidator;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertSelector;
import java.security.cert.CertStore;
import java.security.cert.CertificateException;
import java.security.cert.CertificateRevokedException;
import java.security.cert.CollectionCertStoreParameters;
import java.security.cert.PKIXBuilderParameters;
import java.security.cert.TrustAnchor;
import java.security.cert.X509CRL;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import ru.CryptoPro.AdES.BaseParameterValidator;
import ru.CryptoPro.AdES.exception.AdESException;
import ru.CryptoPro.AdES.exception.IAdESException;
import ru.CryptoPro.AdES.tools.AdESUtility;
import ru.CryptoPro.JCP.tools.JCPLogger;
import ru.CryptoPro.JCP.tools.Platform;

/* loaded from: classes4.dex */
public class BaseCertificateChainValidatorImpl extends AbstractCertificateChainBuilder implements BaseCertificateChainValidator {
    private static final String VALIDATE_WARNING = "For online validation (by CRL DP) 'com.sun.security.enableCRLDP' (for Oracle), or 'com.ibm.security.enableCRLDP' (for IBM) must be set to 'true', or 'ocsp.enable' must be set to 'true' (OCSP) with other options (responder etc.), or CRL list must be set for offline validation";
    private final ArrayList<X509CRL> cRLs = new ArrayList<>();
    private boolean enableCertificateValidation = true;

    private boolean isEnabledCRLValidationOnline() {
        return CertificateChainValidator.PARAM_SUN_CRL_DP || CertificateChainValidator.PARAM_IBM_CRL_DP;
    }

    @Override // ru.CryptoPro.AdES.certificate.BaseCertificateChainValidator, ru.CryptoPro.AdES.certificate.CertificateChainValidator, ru.CryptoPro.AdES.certificate.CertificateChainBase
    public String getProvider() {
        return this.provider;
    }

    @Override // ru.CryptoPro.AdES.certificate.BaseCertificateChainValidator, ru.CryptoPro.AdES.certificate.CertificateChainValidator, ru.CryptoPro.AdES.certificate.CertificateChainBase
    public Date getValidationDate() {
        return this.validationDate;
    }

    @Override // ru.CryptoPro.AdES.certificate.BaseCertificateChainValidator, ru.CryptoPro.AdES.certificate.CertificateChainValidator, ru.CryptoPro.AdES.tools.CRLUtility
    public void setCRLs(Collection<X509CRL> collection) {
        this.cRLs.addAll(collection);
    }

    @Override // ru.CryptoPro.AdES.certificate.BaseCertificateChainValidator, ru.CryptoPro.AdES.certificate.CertificateValidation
    public void setEnableCertificateValidation(boolean z) {
        this.enableCertificateValidation = z;
    }

    @Override // ru.CryptoPro.AdES.certificate.BaseCertificateChainValidator, ru.CryptoPro.AdES.certificate.CertificateChainValidator, ru.CryptoPro.AdES.certificate.CertificateChainBase, ru.CryptoPro.AdES.tools.ProviderUtility
    public void setProvider(String str) {
        this.provider = str;
    }

    @Override // ru.CryptoPro.AdES.certificate.BaseCertificateChainValidator, ru.CryptoPro.AdES.certificate.CertificateChainValidator, ru.CryptoPro.AdES.certificate.CertificateChainBase
    public void setValidationDate(Date date) {
        this.validationDate = date;
    }

    public void validate(List<X509Certificate> list, Set<TrustAnchor> set) throws AdESException {
        JCPLogger.subEnter();
        String str = "\n\tserial:  " + this.targetCert.getSerialNumber().toString(16) + "\n\tsubject: " + this.targetCert.getSubjectDN() + "\n\tissuer:  " + this.targetCert.getIssuerDN() + "\n\tnot before: " + this.targetCert.getNotBefore() + "\n\tnot after:  " + this.targetCert.getNotAfter() + "\n\tsignature provider: " + this.provider + "\n\tvalidation date: " + getValidationDate() + "\n\trevocation algorithm: " + getAlgorithm() + "\n\trevocation validator: " + getRevocationProvider() + "\n\tonline (crl list is empty): " + this.cRLs.isEmpty();
        JCPLogger.fineFormat(oyr.p("%%% Verifying the certificate chain for the target: ", str, "\n\t%%%"), new Object[0]);
        LinkedList linkedList = new LinkedList();
        linkedList.add(this.targetCert);
        linkedList.addAll(list);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(linkedList);
        arrayList.add(this.rootCert);
        try {
            CertPath generateCertPath = AdESUtility.CERT_FACTORY.generateCertPath(linkedList);
            boolean isEmpty = this.cRLs.isEmpty();
            if (!isEmpty) {
                JCPLogger.fine("Using local CRLs to verify the certificate chain...");
                arrayList.addAll(this.cRLs);
            }
            String concat = "Validation failed for the target: ".concat(str);
            try {
                PKIXBuilderParameters pKIXBuilderParameters = new PKIXBuilderParameters(set, (CertSelector) null);
                pKIXBuilderParameters.setSigProvider(this.provider);
                pKIXBuilderParameters.addCertStore(CertStore.getInstance("Collection", new CollectionCertStoreParameters(arrayList)));
                X509CertSelector x509CertSelector = new X509CertSelector();
                x509CertSelector.setCertificate(this.targetCert);
                pKIXBuilderParameters.setTargetCertConstraints(x509CertSelector);
                JCPLogger.fine("Date for building and validating of the certificate chain: " + getValidationDate());
                pKIXBuilderParameters.setDate(getValidationDate());
                pKIXBuilderParameters.setRevocationEnabled(true);
                if (isEmpty) {
                    boolean z = CertificateChainValidator.PARAM_OCSP;
                    JCPLogger.fine("Verifying the certificate chain (online) by use of ".concat(z ? "OCSP" : "CRL"));
                    if (!isEnabledCRLValidationOnline() && !z) {
                        JCPLogger.warning(VALIDATE_WARNING);
                    }
                } else {
                    JCPLogger.fine("Verifying the certificate chain (offline) using local CRL(s).");
                }
                CertPathValidator.getInstance(getAlgorithm(), getRevocationProvider()).validate(generateCertPath, pKIXBuilderParameters);
                JCPLogger.fine("Certificate chain is valid.");
                JCPLogger.subExit();
            } catch (InvalidAlgorithmParameterException e) {
                throw new AdESException(concat.concat("\nFor online validation (by CRL DP) 'com.sun.security.enableCRLDP' (for Oracle), or 'com.ibm.security.enableCRLDP' (for IBM) must be set to 'true', or 'ocsp.enable' must be set to 'true' (OCSP) with other options (responder etc.), or CRL list must be set for offline validation"), e, IAdESException.ecRevocationCertificateStatusIsUnknownOrRevoked);
            } catch (NoSuchAlgorithmException e2) {
                throw new AdESException(concat.concat("\nFor online validation (by CRL DP) 'com.sun.security.enableCRLDP' (for Oracle), or 'com.ibm.security.enableCRLDP' (for IBM) must be set to 'true', or 'ocsp.enable' must be set to 'true' (OCSP) with other options (responder etc.), or CRL list must be set for offline validation"), e2, IAdESException.ecRevocationCertificateStatusIsUnknownOrRevoked);
            } catch (NoSuchProviderException e3) {
                throw new AdESException(concat.concat("\nFor online validation (by CRL DP) 'com.sun.security.enableCRLDP' (for Oracle), or 'com.ibm.security.enableCRLDP' (for IBM) must be set to 'true', or 'ocsp.enable' must be set to 'true' (OCSP) with other options (responder etc.), or CRL list must be set for offline validation"), e3, IAdESException.ecRevocationCertificateStatusIsUnknownOrRevoked);
            } catch (CertPathValidatorException e4) {
                if (e4.getReason() == CertPathValidatorException.BasicReason.REVOKED) {
                    throw new AdESException(concat, e4, IAdESException.ecRevocationCertificateStatusIsRevoked);
                }
                for (Throwable cause = e4.getCause(); cause != null; cause = cause.getCause()) {
                    if (cause instanceof CertificateRevokedException) {
                        throw new AdESException(concat, e4, IAdESException.ecRevocationCertificateStatusIsRevoked);
                    }
                }
                throw new AdESException(concat.concat("\nFor online validation (by CRL DP) 'com.sun.security.enableCRLDP' (for Oracle), or 'com.ibm.security.enableCRLDP' (for IBM) must be set to 'true', or 'ocsp.enable' must be set to 'true' (OCSP) with other options (responder etc.), or CRL list must be set for offline validation"), e4, IAdESException.ecRevocationCertificateStatusIsUnknownOrRevoked);
            }
        } catch (CertificateException e5) {
            throw new AdESException(e5, IAdESException.ecInternal);
        }
    }

    @Override // ru.CryptoPro.AdES.certificate.BaseCertificateChainValidator, ru.CryptoPro.AdES.certificate.CertificateChainValidator
    public void validate(List<X509Certificate> list, List<BaseParameterValidator<X509Certificate>> list2) throws AdESException {
        JCPLogger.subEnter();
        JCPLogger.fine("%%% Verifying certificate chain... %%%");
        if (list == null || list.isEmpty()) {
            throw new AdESException(IAdESException.ecCertificateChainIsNull);
        }
        this.targetCert = list.get(0);
        this.rootCert = (X509Certificate) b64.c(1, list);
        JCPLogger.fine("enableCertificateValidation = " + this.enableCertificateValidation);
        if (this.enableCertificateValidation) {
            validate(list);
        } else {
            JCPLogger.fine("Warning! Validating of the signer certificate chain has been disabled!");
        }
        if (list2 != null) {
            for (X509Certificate x509Certificate : list) {
                for (BaseParameterValidator<X509Certificate> baseParameterValidator : list2) {
                    JCPLogger.fineFormat("Trying to check the certificate parameters:\n\tserial: {0}\n\tsubject: {1}\n\tissuer: {2}\n\tvalidator class: {3}\n\t...", x509Certificate.getSerialNumber().toString(16), x509Certificate.getSubjectDN(), x509Certificate.getIssuerDN(), baseParameterValidator.getClass().getCanonicalName());
                    baseParameterValidator.validate(x509Certificate);
                }
            }
        }
        JCPLogger.subExit();
    }

    private void validate(List<X509Certificate> list) throws AdESException {
        JCPLogger.subEnter();
        JCPLogger.fine("Check if the certificate chain is valid.");
        ArrayList arrayList = new ArrayList(list);
        if (arrayList.size() == 1) {
            if (AdESUtility.isSelfSigned(this.targetCert)) {
                JCPLogger.fineFormat("Skip validation of the certificate:\n\tserial:  {0}\n\tsubject: {1}\n\tissuer:  {2}\n\treason: self-signed in single-certificate chain.", this.targetCert.getSerialNumber().toString(16), this.targetCert.getSubjectDN(), this.targetCert.getIssuerDN());
                return;
            }
            throw new AdESException("Certificate: sn " + this.targetCert.getSerialNumber().toString(16) + ", subject " + this.targetCert.getSubjectDN() + " is not root or/and is not found in the list of trusted certificates", IAdESException.ecBuilderRootIsUntrusted);
        }
        arrayList.remove(this.rootCert);
        arrayList.remove(this.targetCert);
        HashSet hashSet = new HashSet(1);
        hashSet.add(new TrustAnchor(this.rootCert, null));
        if (Platform.isIbm || Platform.isAndroid) {
            JCPLogger.fine("IBM JVM or Android detected.");
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                X509Certificate x509Certificate = (X509Certificate) it.next();
                if (x509Certificate.getSubjectX500Principal().equals(x509Certificate.getIssuerX500Principal())) {
                    hashSet.add(new TrustAnchor(x509Certificate, null));
                }
            }
        }
        validate(arrayList, hashSet);
        JCPLogger.subExit();
    }
}
