package defpackage;

import java.io.IOException;
import java.security.cert.CRLException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;

/* loaded from: classes4.dex */
public class t2f0 {
    public static vc51 a(X509CRL x509crl) {
        try {
            return new vc51(rc51.p(a4x0.m(b3.r(x509crl.getTBSCertList())).c));
        } catch (IOException e) {
            throw new CRLException(e.toString());
        }
    }

    public static vc51 b(X509Certificate x509Certificate) {
        try {
            return new vc51(rc51.p(d4x0.m(b3.r(x509Certificate.getTBSCertificate())).b));
        } catch (IOException e) {
            throw new CertificateEncodingException(e.toString());
        }
    }

    public static vc51 c(X509Certificate x509Certificate) {
        try {
            return new vc51(rc51.p(d4x0.m(b3.r(x509Certificate.getTBSCertificate())).c));
        } catch (IOException e) {
            throw new CertificateEncodingException(e.toString());
        }
    }
}
