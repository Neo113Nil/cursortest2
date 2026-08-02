package ru.CryptoPro.reprov;

import defpackage.dy31;
import java.security.cert.CertPathValidatorException;
import java.security.cert.Certificate;
import java.security.cert.PKIXCertPathChecker;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public class EnrollCertTypeExtensionChecker extends PKIXCertPathChecker {
    public static Set a;

    @Override // java.security.cert.PKIXCertPathChecker
    public void check(Certificate certificate, Collection collection) throws CertPathValidatorException {
        JCPLogger.subEnter();
        if (collection != null && !collection.isEmpty()) {
            collection.remove("1.3.6.1.4.1.311.20.2");
        }
        JCPLogger.subExit();
    }

    @Override // java.security.cert.PKIXCertPathChecker
    public Set getSupportedExtensions() {
        if (a == null) {
            HashSet hashSet = new HashSet();
            a = hashSet;
            hashSet.add("1.3.6.1.4.1.311.20.2");
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
