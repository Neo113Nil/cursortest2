package ru.CryptoPro.AdES.evidence.crl.rfc3280;

import defpackage.jc51;
import defpackage.oyr;
import java.security.cert.TrustAnchor;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;

/* loaded from: classes4.dex */
class PrincipalUtils {
    public static jc51 getCA(TrustAnchor trustAnchor) {
        return jc51.m(trustAnchor.getCA().getEncoded());
    }

    public static jc51 getEncodedIssuerPrincipal(Object obj) {
        if (obj instanceof X509Certificate) {
            return getIssuerPrincipal((X509Certificate) obj);
        }
        throw oyr.d(obj);
    }

    public static jc51 getIssuerPrincipal(X509CRL x509crl) {
        return jc51.m(x509crl.getIssuerX500Principal().getEncoded());
    }

    public static jc51 getSubjectPrincipal(X509Certificate x509Certificate) {
        return jc51.m(x509Certificate.getSubjectX500Principal().getEncoded());
    }

    public static jc51 getIssuerPrincipal(X509Certificate x509Certificate) {
        return jc51.m(x509Certificate.getIssuerX500Principal().getEncoded());
    }
}
