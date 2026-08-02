package ru.CryptoPro.AdES.certificate;

import defpackage.oyr;
import defpackage.r0x;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.cert.CertPath;
import java.security.cert.CertPathBuilder;
import java.security.cert.CertPathBuilderException;
import java.security.cert.CertPathBuilderResult;
import java.security.cert.CertStore;
import java.security.cert.Certificate;
import java.security.cert.CollectionCertStoreParameters;
import java.security.cert.PKIXBuilderParameters;
import java.security.cert.PKIXCertPathBuilderResult;
import java.security.cert.TrustAnchor;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import ru.CryptoPro.AdES.exception.AdESException;
import ru.CryptoPro.AdES.exception.IAdESException;
import ru.CryptoPro.AdES.tools.AdESUtility;
import ru.CryptoPro.JCP.tools.JCPLogger;
import ru.CryptoPro.JCP.tools.Platform;
import ru.CryptoPro.reprov.AndroidExtKeyUsageCertPathChecker;
import ru.CryptoPro.reprov.certpath.SunCertPathBuilder;

/* loaded from: classes4.dex */
public class CertificateChainBuilderImpl extends AbstractCertificateChainBuilder implements CertificateChainBuilder {
    private final List<X509Certificate> builtChain = new LinkedList();
    private final Set<X509Certificate> certificateValues = new HashSet();

    /* JADX WARN: Type inference failed for: r13v11, types: [ru.CryptoPro.AdES.certificate.CertificateChainBuilderImpl$1CertPathBuilderWrapper] */
    private void build(X509Certificate x509Certificate, Set<X509Certificate> set, Set<X509Certificate> set2) throws AdESException {
        boolean z;
        JCPLogger.subEnter();
        this.targetCert = x509Certificate;
        set.add(x509Certificate);
        X509CertSelector x509CertSelector = new X509CertSelector();
        x509CertSelector.setCertificate(x509Certificate);
        HashSet hashSet = new HashSet();
        Iterator<X509Certificate> it = set2.iterator();
        while (it.hasNext()) {
            hashSet.add(new TrustAnchor(it.next(), null));
        }
        int i = 0;
        if (Platform.isIbm || Platform.isAndroid) {
            JCPLogger.fine("IBM JVM or Android detected.");
            z = false;
            for (X509Certificate x509Certificate2 : set) {
                z = x509Certificate2.getSubjectX500Principal().equals(x509Certificate2.getIssuerX500Principal());
                if (z) {
                    break;
                }
            }
        } else {
            z = false;
        }
        this.builtChain.clear();
        StringBuilder sb = new StringBuilder("\n\tserial: ");
        sb.append(this.targetCert.getSerialNumber().toString(16));
        sb.append("\n\tsubject: ");
        sb.append(this.targetCert.getSubjectDN());
        sb.append("\n\tissuer: ");
        sb.append(this.targetCert.getIssuerDN());
        sb.append("\n\tnot before: ");
        sb.append(this.targetCert.getNotBefore());
        sb.append("\n\tnot after: ");
        sb.append(this.targetCert.getNotAfter());
        sb.append("\n\tsignature provider: ");
        sb.append(this.provider);
        sb.append("\n\tvalidation date: ");
        sb.append(getValidationDate());
        sb.append("\n\tnative implementation: ");
        sb.append(!z);
        String sb2 = sb.toString();
        JCPLogger.fine("%%% Building the certificate chain for the target certificate: " + sb2 + "\n\t%%%");
        String concat = "Error occurred during building the certification path for the target: ".concat(sb2);
        try {
            PKIXBuilderParameters pKIXBuilderParameters = new PKIXBuilderParameters(hashSet, x509CertSelector);
            pKIXBuilderParameters.setSigProvider(this.provider);
            pKIXBuilderParameters.setRevocationEnabled(false);
            pKIXBuilderParameters.addCertStore(CertStore.getInstance("Collection", new CollectionCertStoreParameters(set)));
            JCPLogger.fine("Date for building of the certificate chain: ", getValidationDate());
            pKIXBuilderParameters.setDate(getValidationDate());
            PKIXCertPathBuilderResult build = new Object(z) { // from class: ru.CryptoPro.AdES.certificate.CertificateChainBuilderImpl.1CertPathBuilderWrapper
                private CertPathBuilder nativeBuilder;
                private SunCertPathBuilder sunBuilder;

                {
                    this.nativeBuilder = null;
                    this.sunBuilder = null;
                    if (z) {
                        this.sunBuilder = new SunCertPathBuilder();
                    } else {
                        this.nativeBuilder = CertPathBuilder.getInstance(CertificateChainBuilderImpl.this.getAlgorithm(), CertificateChainBuilderImpl.this.getRevocationProvider());
                    }
                }

                public PKIXCertPathBuilderResult build(PKIXBuilderParameters pKIXBuilderParameters2) throws InvalidAlgorithmParameterException, CertPathBuilderException {
                    CertPathBuilderResult engineBuild;
                    CertPathBuilder certPathBuilder = this.nativeBuilder;
                    if (certPathBuilder != null) {
                        engineBuild = certPathBuilder.build(pKIXBuilderParameters2);
                    } else {
                        boolean z2 = Platform.isAndroid;
                        if (z2) {
                            pKIXBuilderParameters2 = (PKIXBuilderParameters) pKIXBuilderParameters2.clone();
                        }
                        if (z2) {
                            pKIXBuilderParameters2.addCertPathChecker(new AndroidExtKeyUsageCertPathChecker());
                        }
                        engineBuild = this.sunBuilder.engineBuild(pKIXBuilderParameters2);
                    }
                    return (PKIXCertPathBuilderResult) engineBuild;
                }
            }.build(pKIXBuilderParameters);
            CertPath certPath = build.getCertPath();
            JCPLogger.fine("Built chain contains the following certificates: ");
            for (Certificate certificate : certPath.getCertificates()) {
                X509Certificate x509Certificate3 = (X509Certificate) certificate;
                i++;
                JCPLogger.fineFormat("[{0}] certificate:\n\tserial: {1}\n\tsubject: {2}\n\tissuer: {3}\n\tnot before: {4}\n\tnot after: {5}", Integer.valueOf(i), x509Certificate3.getSerialNumber().toString(16), x509Certificate3.getSubjectDN(), x509Certificate3.getIssuerDN(), x509Certificate3.getNotBefore(), x509Certificate3.getNotAfter());
                this.builtChain.add((X509Certificate) certificate);
            }
            TrustAnchor trustAnchor = build.getTrustAnchor();
            if (trustAnchor == null) {
                throw new AdESException("Trust anchor not found", IAdESException.ecBuilderRootIsAbsent);
            }
            this.rootCert = trustAnchor.getTrustedCert();
            validateIfRootCertificateInTrustStoreAndAddToChain();
            JCPLogger.subExit();
        } catch (InvalidAlgorithmParameterException e) {
            JCPLogger.thrown(e);
            StringBuilder v = oyr.v(concat, "\n: ");
            v.append(e.getMessage());
            throw new AdESException(v.toString(), e, IAdESException.ecBuilderPKIXInvalidChain);
        } catch (NoSuchAlgorithmException e2) {
            JCPLogger.thrown(e2);
            StringBuilder v2 = oyr.v(concat, "\n: ");
            v2.append(e2.getMessage());
            throw new AdESException(v2.toString(), e2, IAdESException.ecBuilderPKIXInvalidChain);
        } catch (NoSuchProviderException e3) {
            JCPLogger.thrown(e3);
            StringBuilder v3 = oyr.v(concat, "\n: ");
            v3.append(e3.getMessage());
            throw new AdESException(v3.toString(), e3, IAdESException.ecBuilderPKIXInvalidChain);
        } catch (CertPathBuilderException e4) {
            JCPLogger.thrown(e4);
            StringBuilder v4 = oyr.v(concat, "\n: ");
            v4.append(e4.getMessage());
            throw new AdESException(v4.toString(), e4, IAdESException.ecBuilderPKIXInvalidChain);
        }
    }

    private void validateIfRootCertificateInTrustStoreAndAddToChain() throws AdESException {
        JCPLogger.subEnter();
        if (this.rootCert == null) {
            throw new AdESException("Root certificate not found", IAdESException.ecBuilderRootIsAbsent);
        }
        if (AbstractCertificateChainBuilder.getCaCertsTrustCertificates().contains(this.rootCert)) {
            JCPLogger.fineFormat("[T] Trusted certificate of chain:\n\tserial: {0}\n\tsubject: {1}\n\tissuer: {2}\n\tnot before: {3}\n\tnot after: {4}", this.rootCert.getSerialNumber().toString(16), this.rootCert.getSubjectDN(), this.rootCert.getIssuerDN(), this.rootCert.getNotBefore(), this.rootCert.getNotAfter());
            this.builtChain.add(this.rootCert);
            JCPLogger.subExit();
            return;
        }
        throw new AdESException("Root certificate: serial " + this.rootCert.getSerialNumber().toString(16) + ", subject " + this.rootCert.getSubjectDN() + ", issuer " + this.rootCert.getIssuerDN() + ", not before " + this.rootCert.getNotBefore() + ", not after " + this.rootCert.getNotAfter() + " is untrusted", IAdESException.ecBuilderRootIsUntrusted);
    }

    @Override // ru.CryptoPro.AdES.certificate.CertificateChainBuilder
    public List<X509Certificate> getCertificateChain() {
        return Collections.unmodifiableList(this.builtChain);
    }

    @Override // ru.CryptoPro.AdES.certificate.CertificateChainBuilder, ru.CryptoPro.AdES.certificate.CertificateChainBase
    public String getProvider() {
        return this.provider;
    }

    @Override // ru.CryptoPro.AdES.certificate.CertificateChainBuilder, ru.CryptoPro.AdES.certificate.CertificateChainBase
    public Date getValidationDate() {
        return this.validationDate;
    }

    @Override // ru.CryptoPro.AdES.certificate.CertificateChainBuilder, ru.CryptoPro.AdES.tools.CertificateUtility
    public void setCertificateValues(Set<X509Certificate> set) {
        this.certificateValues.addAll(set);
    }

    @Override // ru.CryptoPro.AdES.certificate.CertificateChainBuilder, ru.CryptoPro.AdES.certificate.CertificateChainBase, ru.CryptoPro.AdES.tools.ProviderUtility
    public void setProvider(String str) {
        this.provider = str;
    }

    @Override // ru.CryptoPro.AdES.certificate.CertificateChainBuilder, ru.CryptoPro.AdES.certificate.CertificateChainBase
    public void setValidationDate(Date date) {
        this.validationDate = date;
    }

    @Override // ru.CryptoPro.AdES.certificate.CertificateChainBuilder
    public void build(X509Certificate x509Certificate) throws AdESException {
        JCPLogger.subEnter();
        JCPLogger.fineFormat("%%% Building certificate chain for certificate:\n\tserial: {0}\n\tsubject: {1}\n\tissuer: {2}\n\tnot before: {3}\n\tnot after: {4}\n\t%%%", x509Certificate.getSerialNumber().toString(16), x509Certificate.getSubjectDN(), x509Certificate.getIssuerDN(), x509Certificate.getNotBefore(), x509Certificate.getNotAfter());
        Set<X509Certificate> caCertsTrustCertificates = AbstractCertificateChainBuilder.getCaCertsTrustCertificates();
        Set<X509Certificate> caCertsIntermediateCertificates = AbstractCertificateChainBuilder.getCaCertsIntermediateCertificates();
        for (X509Certificate x509Certificate2 : this.certificateValues) {
            if (AdESUtility.isSelfSigned(x509Certificate2)) {
                caCertsTrustCertificates.add(x509Certificate2);
            } else {
                caCertsIntermediateCertificates.add(x509Certificate2);
            }
        }
        build(x509Certificate, caCertsIntermediateCertificates, caCertsTrustCertificates);
        JCPLogger.fine("%%% Certificate chain is built %%%");
        JCPLogger.subExit();
    }

    @Override // ru.CryptoPro.AdES.certificate.CertificateChainBuilder
    public void build(r0x r0xVar) throws AdESException {
        JCPLogger.subEnter();
        CertificateFinder certificateFinder = new CertificateFinder(this.certificateValues);
        certificateFinder.setProvider(this.provider);
        build(certificateFinder.find(r0xVar));
        JCPLogger.subExit();
    }
}
