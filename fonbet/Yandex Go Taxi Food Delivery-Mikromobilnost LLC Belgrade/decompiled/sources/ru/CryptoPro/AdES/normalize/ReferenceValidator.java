package ru.CryptoPro.AdES.normalize;

import defpackage.d79;
import defpackage.he5;
import defpackage.i3;
import defpackage.l79;
import defpackage.m79;
import defpackage.pc51;
import defpackage.t2f0;
import defpackage.ths0;
import defpackage.vc51;
import java.io.ByteArrayInputStream;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import ru.CryptoPro.AdES.certificate.CertificateFinder;
import ru.CryptoPro.AdES.evidence.CertificateIdentifierCalculator;
import ru.CryptoPro.AdES.tools.AdESUtility;
import ru.CryptoPro.AdES.tools.CertificateUtility;
import ru.CryptoPro.AdES.tools.ProviderUtility;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public class ReferenceValidator implements CertificateUtility, ProviderUtility {
    private final X509Certificate checkableCertificate;
    private String provider = null;
    private final List<X509Certificate> certificateValues = new LinkedList();

    public ReferenceValidator(X509Certificate x509Certificate) {
        this.checkableCertificate = x509Certificate;
    }

    public boolean isCRLAccepted(m79 m79Var) {
        JCPLogger.fine("Analyzing CRL...");
        try {
            X509CRL x509crl = (X509CRL) AdESUtility.CERT_FACTORY.generateCRL(new ByteArrayInputStream(m79Var.getEncoded()));
            vc51 a = t2f0.a(x509crl);
            byte[] authorityKeyIdentifier = AdESUtility.getAuthorityKeyIdentifier(x509crl.getExtensionValue(pc51.f.a));
            CertificateFinder certificateFinder = new CertificateFinder(this.certificateValues);
            certificateFinder.setProvider(this.provider);
            JCPLogger.fine("Finding issuer certificate...");
            X509Certificate find = certificateFinder.find(a, authorityKeyIdentifier);
            JCPLogger.fine("Checking CRL signature...");
            x509crl.verify(find.getPublicKey(), this.provider);
            JCPLogger.fine("Checking certificate signature...");
            this.checkableCertificate.verify(find.getPublicKey(), this.provider);
            JCPLogger.fine("CRL evidence accepted.");
            return true;
        } catch (Exception e) {
            JCPLogger.subThrown(e);
            return false;
        }
    }

    public boolean isOCSPAccepted(he5 he5Var) {
        CertificateIdentifierCalculator certificateIdentifierCalculator;
        JCPLogger.fine("Analyzing basic ocsp response...");
        i3 i3Var = he5Var.a.x;
        for (int i = 0; i < i3Var.size(); i++) {
            JCPLogger.fine("Analyzing single ocsp response #" + i);
            d79 d79Var = ths0.m(i3Var.A(i)).a;
            l79 l79Var = new l79(d79Var);
            String str = d79Var.a.a.a;
            CertificateFinder certificateFinder = new CertificateFinder(this.certificateValues);
            certificateFinder.setProvider(this.provider);
            try {
                JCPLogger.fine("Finding issuer certificate...");
                X509Certificate find = certificateFinder.find(l79Var);
                JCPLogger.fine("Checking certificate signature...");
                this.checkableCertificate.verify(find.getPublicKey(), this.provider);
                certificateIdentifierCalculator = new CertificateIdentifierCalculator(this.checkableCertificate, find);
                certificateIdentifierCalculator.setDigestAlgorithm(str);
                certificateIdentifierCalculator.setProvider(this.provider);
                JCPLogger.fine("Checking certificate identifier...");
            } catch (Exception e) {
                JCPLogger.subThrown(e);
            }
            if (AdESUtility.compareCertificateID(l79Var, AdESUtility.fixCertificateID(certificateIdentifierCalculator.make((Void) null), str))) {
                JCPLogger.fine("OCSP evidence accepted.");
                return true;
            }
            continue;
        }
        return false;
    }

    @Override // ru.CryptoPro.AdES.tools.CertificateUtility
    public void setCertificateValues(Set<X509Certificate> set) {
        this.certificateValues.addAll(set);
    }

    @Override // ru.CryptoPro.AdES.tools.ProviderUtility
    public void setProvider(String str) {
        this.provider = str;
    }
}
