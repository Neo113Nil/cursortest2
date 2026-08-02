package ru.CryptoPro.reprov.certpath;

import defpackage.dy31;
import defpackage.er61;
import java.io.IOException;
import java.security.cert.CertPathValidatorException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.PKIXReason;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import ru.CryptoPro.JCP.tools.JCPLogger;
import ru.CryptoPro.reprov.x509.NameConstraintsExtension;
import ru.CryptoPro.reprov.x509.PKIXExtensions;
import ru.CryptoPro.reprov.x509.X509CertImpl;

/* loaded from: classes4.dex */
class ConstraintsChecker extends PKIXCertPathChecker {
    public static Set w;
    public int a;
    public int b;
    public NameConstraintsExtension c;

    @Override // java.security.cert.PKIXCertPathChecker
    public void check(Certificate certificate, Collection collection) throws CertPathValidatorException {
        X509Certificate x509Certificate = (X509Certificate) certificate;
        this.b++;
        JCPLogger.finerFormat("---checking {0}...", "basic constraints");
        JCPLogger.finer("i = ", Integer.valueOf(this.b));
        JCPLogger.finer("maxPathLength = ", Integer.valueOf(this.a));
        if (this.b < 0) {
            int basicConstraints = x509Certificate.getVersion() < 3 ? (this.b == 1 && X509CertImpl.isSelfIssued(x509Certificate)) ? Integer.MAX_VALUE : -1 : x509Certificate.getBasicConstraints();
            if (basicConstraints == -1) {
                if (er61.a()) {
                    throw new CertPathValidatorException("basic constraints check failed: this is not a CA certificate", null, null, -1, PKIXReason.NOT_CA_CERT);
                }
                dy31.r("basic constraints check failed: this is not a CA certificate");
                return;
            }
            if (!X509CertImpl.isSelfIssued(x509Certificate)) {
                int i = this.a;
                if (i <= 0) {
                    if (er61.a()) {
                        throw new CertPathValidatorException("basic constraints check failed: pathLenConstraint violated - this cert must be the last cert in the certification path", null, null, -1, PKIXReason.PATH_TOO_LONG);
                    }
                    dy31.r("basic constraints check failed: pathLenConstraint violated - this cert must be the last cert in the certification path");
                    return;
                }
                this.a = i - 1;
            }
            if (basicConstraints < this.a) {
                this.a = basicConstraints;
            }
        }
        JCPLogger.finer("after processing, maxPathLength = ", Integer.valueOf(this.a));
        JCPLogger.finerFormat("{0} verified:", "basic constraints");
        JCPLogger.finerFormat("---checking {0}...", "name constraints");
        if (this.c != null && (this.b == 0 || !X509CertImpl.isSelfIssued(x509Certificate))) {
            JCPLogger.finer("prevNC = ", this.c);
            JCPLogger.finer("currDN = ", x509Certificate.getSubjectX500Principal());
            try {
                if (!this.c.verify(x509Certificate)) {
                    if (!er61.a()) {
                        throw new CertPathValidatorException("name constraints check failed");
                    }
                    throw new CertPathValidatorException("name constraints check failed", null, null, -1, PKIXReason.INVALID_NAME);
                }
            } catch (IOException e) {
                throw new CertPathValidatorException(e);
            }
        }
        NameConstraintsExtension nameConstraintsExtension = this.c;
        try {
            NameConstraintsExtension nameConstraintsExtension2 = X509CertImpl.toImpl(x509Certificate).getNameConstraintsExtension();
            JCPLogger.finer("prevNC = ", nameConstraintsExtension);
            JCPLogger.finer("newNC = ", String.valueOf(nameConstraintsExtension2));
            if (nameConstraintsExtension == null) {
                JCPLogger.finer("mergedNC = ", String.valueOf(nameConstraintsExtension2));
                nameConstraintsExtension = nameConstraintsExtension2 == null ? nameConstraintsExtension2 : (NameConstraintsExtension) nameConstraintsExtension2.clone();
            } else {
                try {
                    nameConstraintsExtension.merge(nameConstraintsExtension2);
                    JCPLogger.finer("mergedNC = ", nameConstraintsExtension);
                } catch (IOException e2) {
                    throw new CertPathValidatorException(e2);
                }
            }
            this.c = nameConstraintsExtension;
            JCPLogger.finerFormat("{0} verified.", "name constraints");
            if (collection == null || collection.isEmpty()) {
                return;
            }
            collection.remove(PKIXExtensions.BasicConstraints_Id.toString());
            collection.remove(PKIXExtensions.NameConstraints_Id.toString());
        } catch (CertificateException e3) {
            throw new CertPathValidatorException(e3);
        }
    }

    @Override // java.security.cert.PKIXCertPathChecker
    public Set getSupportedExtensions() {
        if (w == null) {
            HashSet hashSet = new HashSet();
            w = hashSet;
            hashSet.add(PKIXExtensions.BasicConstraints_Id.toString());
            w.add(PKIXExtensions.NameConstraints_Id.toString());
            w = Collections.unmodifiableSet(w);
        }
        return w;
    }

    @Override // java.security.cert.PKIXCertPathChecker, java.security.cert.CertPathChecker
    public void init(boolean z) throws CertPathValidatorException {
        if (z) {
            dy31.r("forward checking not supported");
            return;
        }
        this.b = 0;
        this.a = 0;
        this.c = null;
    }

    @Override // java.security.cert.PKIXCertPathChecker, java.security.cert.CertPathChecker
    public boolean isForwardCheckingSupported() {
        return false;
    }
}
