package ru.domesticroots.webview;

import defpackage.tgz;
import defpackage.w511;
import java.lang.reflect.Method;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes9.dex */
public final class a {
    public final X509TrustManager a;
    public final b b;
    public final Method c;
    public final Method d;

    public a(X509TrustManager x509TrustManager, tgz tgzVar) {
        Method method;
        this.a = x509TrustManager;
        this.b = new b(tgzVar);
        Method method2 = null;
        try {
            method = x509TrustManager.getClass().getMethod("checkServerTrusted", X509Certificate[].class, String.class, String.class);
        } catch (NoSuchMethodException unused) {
            method = null;
        }
        this.c = method;
        try {
            method2 = x509TrustManager.getClass().getMethod("isSameTrustConfiguration", String.class, String.class);
        } catch (NoSuchMethodException unused2) {
        }
        this.d = method2;
    }

    public final void a(X509Certificate[] x509CertificateArr) {
        CertificateChainVerifier$Result certificateChainVerifier$Result;
        if (x509CertificateArr == null || x509CertificateArr.length == 0) {
            w511.y("Empty certificate chain");
            return;
        }
        X509Certificate x509Certificate = x509CertificateArr[0];
        X509TrustManager x509TrustManager = this.a;
        b bVar = this.b;
        bVar.getClass();
        try {
            certificateChainVerifier$Result = bVar.a(x509Certificate, x509CertificateArr, x509TrustManager);
        } catch (RuntimeException e) {
            bVar.a.s(e, "Unexpected exception while verifying certificate chain");
            certificateChainVerifier$Result = CertificateChainVerifier$Result.TRANSIENT_FAILURE;
        }
        certificateChainVerifier$Result.getClass();
        if (certificateChainVerifier$Result != CertificateChainVerifier$Result.TRUSTED) {
            throw new CertificateChainVerifier$NotTrustedException(certificateChainVerifier$Result);
        }
    }
}
