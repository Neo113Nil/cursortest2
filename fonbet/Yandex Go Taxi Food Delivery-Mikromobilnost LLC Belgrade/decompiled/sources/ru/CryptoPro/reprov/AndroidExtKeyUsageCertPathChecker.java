package ru.CryptoPro.reprov;

import defpackage.dy31;
import java.security.cert.CertPathValidatorException;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import ru.CryptoPro.AdES.tools.AdESUtility;

/* loaded from: classes4.dex */
public class AndroidExtKeyUsageCertPathChecker extends PKIXCertPathChecker {
    public static Set a;

    @Override // java.security.cert.PKIXCertPathChecker
    public void check(Certificate certificate, Collection collection) throws CertPathValidatorException {
        List<String> list;
        X509Certificate x509Certificate = (X509Certificate) certificate;
        if (x509Certificate.getSubjectDN().equals(x509Certificate.getIssuerDN())) {
            try {
                x509Certificate.verify(x509Certificate.getPublicKey());
                boolean[] keyUsage = x509Certificate.getKeyUsage();
                if (keyUsage != null && !keyUsage[5]) {
                    dy31.r("CA key usage check failed: keyCertSign bit is not set");
                    return;
                }
            } catch (Exception unused) {
            }
        }
        if (collection == null || collection.isEmpty() || !collection.contains(AdESUtility.EXTENDED_KEY_USAGE)) {
            return;
        }
        try {
            list = x509Certificate.getExtendedKeyUsage();
        } catch (CertificateParsingException unused2) {
            list = null;
        }
        if (list == null || !list.contains("1.3.6.1.5.5.7.3.8")) {
            return;
        }
        collection.remove(AdESUtility.EXTENDED_KEY_USAGE);
    }

    @Override // java.security.cert.PKIXCertPathChecker
    public Set getSupportedExtensions() {
        if (a == null) {
            HashSet hashSet = new HashSet();
            a = hashSet;
            hashSet.add(AdESUtility.EXTENDED_KEY_USAGE);
            a = Collections.unmodifiableSet(a);
        }
        return a;
    }

    @Override // java.security.cert.PKIXCertPathChecker, java.security.cert.CertPathChecker
    public void init(boolean z) throws CertPathValidatorException {
        if (z) {
            dy31.r("forward checking not supported");
        }
    }

    @Override // java.security.cert.PKIXCertPathChecker, java.security.cert.CertPathChecker
    public boolean isForwardCheckingSupported() {
        return false;
    }
}
