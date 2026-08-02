package ru.CryptoPro.reprov.certpath;

import defpackage.dy31;
import defpackage.er61;
import java.security.cert.CertPathValidatorException;
import java.security.cert.Certificate;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.PKIXReason;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import ru.CryptoPro.JCP.tools.JCPLogger;
import ru.CryptoPro.reprov.x509.PKIXExtensions;

/* loaded from: classes4.dex */
class KeyChecker extends PKIXCertPathChecker {
    public static Set b;
    public int a;

    public static void a(X509Certificate x509Certificate) {
        JCPLogger.finerFormat("KeyChecker.verifyCAKeyUsage() ---checking {0}...", "CA key usage");
        boolean[] keyUsage = x509Certificate.getKeyUsage();
        if (keyUsage == null) {
            return;
        }
        if (keyUsage[5]) {
            JCPLogger.finerFormat("KeyChecker.verifyCAKeyUsage() {0} verified.", "CA key usage");
        } else {
            if (er61.a()) {
                throw new CertPathValidatorException("CA key usage check failed: keyCertSign bit is not set", null, null, -1, PKIXReason.INVALID_KEY_USAGE);
            }
            dy31.r("CA key usage check failed: keyCertSign bit is not set");
        }
    }

    @Override // java.security.cert.PKIXCertPathChecker
    public void check(Certificate certificate, Collection collection) throws CertPathValidatorException {
        X509Certificate x509Certificate = (X509Certificate) certificate;
        int i = this.a - 1;
        this.a = i;
        if (i != 0) {
            a(x509Certificate);
        }
        if (collection == null || collection.isEmpty()) {
            return;
        }
        collection.remove(PKIXExtensions.KeyUsage_Id.toString());
        collection.remove(PKIXExtensions.ExtendedKeyUsage_Id.toString());
        collection.remove(PKIXExtensions.SubjectAlternativeName_Id.toString());
    }

    @Override // java.security.cert.PKIXCertPathChecker
    public Set getSupportedExtensions() {
        if (b == null) {
            HashSet hashSet = new HashSet();
            b = hashSet;
            hashSet.add(PKIXExtensions.KeyUsage_Id.toString());
            b.add(PKIXExtensions.ExtendedKeyUsage_Id.toString());
            b.add(PKIXExtensions.SubjectAlternativeName_Id.toString());
            b = Collections.unmodifiableSet(b);
        }
        return b;
    }

    @Override // java.security.cert.PKIXCertPathChecker, java.security.cert.CertPathChecker
    public void init(boolean z) throws CertPathValidatorException {
        if (z) {
            dy31.r("forward checking not supported");
        } else {
            this.a = 0;
        }
    }

    @Override // java.security.cert.PKIXCertPathChecker, java.security.cert.CertPathChecker
    public boolean isForwardCheckingSupported() {
        return false;
    }
}
