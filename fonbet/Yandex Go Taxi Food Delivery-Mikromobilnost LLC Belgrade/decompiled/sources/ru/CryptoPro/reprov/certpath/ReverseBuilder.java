package ru.CryptoPro.reprov.certpath;

import java.security.cert.X509Certificate;
import java.util.Comparator;

/* loaded from: classes4.dex */
class ReverseBuilder extends Builder {

    class PKIXCertComparator implements Comparator {
        @Override // java.util.Comparator
        public int compare(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
            x509Certificate.getSubjectX500Principal();
            throw null;
        }
    }
}
