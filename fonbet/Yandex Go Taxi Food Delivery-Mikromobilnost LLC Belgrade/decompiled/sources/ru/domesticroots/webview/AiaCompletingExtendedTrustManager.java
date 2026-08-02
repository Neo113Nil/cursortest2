package ru.domesticroots.webview;

import defpackage.jq1;
import defpackage.tgz;
import defpackage.w511;
import java.lang.reflect.Method;
import java.net.Socket;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.X509ExtendedTrustManager;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes9.dex */
class AiaCompletingExtendedTrustManager extends X509ExtendedTrustManager {
    public final a a;

    public AiaCompletingExtendedTrustManager(X509TrustManager x509TrustManager, tgz tgzVar) {
        this.a = new a(x509TrustManager, tgzVar);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        this.a.a.checkClientTrusted(x509CertificateArr, str);
    }

    public List<X509Certificate> checkServerTrusted(X509Certificate[] x509CertificateArr, String str, String str2) throws CertificateException {
        CertificateChainVerifier$Result certificateChainVerifier$Result;
        a aVar = this.a;
        aVar.getClass();
        if (x509CertificateArr == null || x509CertificateArr.length == 0) {
            w511.y("Empty certificate chain");
            return null;
        }
        List<X509Certificate>[] listArr = new List[1];
        jq1 jq1Var = new jq1(aVar, listArr, str, str2);
        b bVar = aVar.b;
        X509Certificate x509Certificate = x509CertificateArr[0];
        bVar.getClass();
        try {
            certificateChainVerifier$Result = bVar.a(x509Certificate, x509CertificateArr, jq1Var);
        } catch (RuntimeException unused) {
            bVar.a.getClass();
            certificateChainVerifier$Result = CertificateChainVerifier$Result.TRANSIENT_FAILURE;
        }
        certificateChainVerifier$Result.getClass();
        if (certificateChainVerifier$Result == CertificateChainVerifier$Result.TRUSTED) {
            return listArr[0];
        }
        throw new CertificateChainVerifier$NotTrustedException(certificateChainVerifier$Result);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        return this.a.a.getAcceptedIssuers();
    }

    public boolean isSameTrustConfiguration(String str, String str2) {
        a aVar = this.a;
        Method method = aVar.d;
        if (method == null) {
            return true;
        }
        try {
            return ((Boolean) method.invoke(aVar.a, str, str2)).booleanValue();
        } catch (ReflectiveOperationException | RuntimeException unused) {
            return true;
        }
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) {
        this.a.a.checkClientTrusted(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) {
        this.a.a.checkClientTrusted(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) {
        this.a.a(x509CertificateArr);
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) {
        this.a.a(x509CertificateArr);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        this.a.a(x509CertificateArr);
    }
}
