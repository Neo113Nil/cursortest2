package com.anythink.core.common.n.b.a.j;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public abstract class c {
    private static c a(X509TrustManager x509TrustManager) {
        return com.anythink.core.common.n.b.a.g.c.e().a(x509TrustManager);
    }

    public abstract List<Certificate> a(List<Certificate> list, String str);

    private static c a(X509Certificate... x509CertificateArr) {
        return new a(new b(x509CertificateArr));
    }
}
