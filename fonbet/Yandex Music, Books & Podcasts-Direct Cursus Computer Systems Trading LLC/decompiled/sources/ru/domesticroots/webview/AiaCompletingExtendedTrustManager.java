package ru.domesticroots.webview;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import defpackage.ea4;
import defpackage.iq;
import defpackage.kkp;
import defpackage.osg;
import defpackage.yfx;
import java.lang.reflect.Method;
import java.net.Socket;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.X509ExtendedTrustManager;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes5.dex */
class AiaCompletingExtendedTrustManager extends X509ExtendedTrustManager {
    public final kkp a;

    public AiaCompletingExtendedTrustManager(X509TrustManager x509TrustManager, osg osgVar) {
        this.a = new kkp(x509TrustManager, osgVar);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        ((X509TrustManager) this.a.b).checkClientTrusted(x509CertificateArr, str);
    }

    @NonNull
    @Keep
    public List<X509Certificate> checkServerTrusted(@NonNull X509Certificate[] x509CertificateArr, String str, String str2) throws CertificateException {
        int i;
        kkp kkpVar = this.a;
        kkpVar.getClass();
        if (x509CertificateArr == null || x509CertificateArr.length == 0) {
            throw new CertificateException("Empty certificate chain");
        }
        List<X509Certificate>[] listArr = new List[1];
        iq iqVar = new iq(kkpVar, listArr, str, str2);
        yfx yfxVar = (yfx) kkpVar.c;
        X509Certificate x509Certificate = x509CertificateArr[0];
        yfxVar.getClass();
        try {
            i = yfxVar.z(x509Certificate, x509CertificateArr, iqVar);
        } catch (RuntimeException unused) {
            ((osg) yfxVar.b).getClass();
            i = 3;
        }
        if (i == 1) {
            return listArr[0];
        }
        throw new ea4(i);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        return ((X509TrustManager) this.a.b).getAcceptedIssuers();
    }

    @Keep
    public boolean isSameTrustConfiguration(String str, String str2) {
        kkp kkpVar = this.a;
        Method method = (Method) kkpVar.e;
        if (method == null) {
            return true;
        }
        try {
            return ((Boolean) method.invoke((X509TrustManager) kkpVar.b, str, str2)).booleanValue();
        } catch (ReflectiveOperationException | RuntimeException unused) {
            return true;
        }
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) {
        ((X509TrustManager) this.a.b).checkClientTrusted(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) {
        ((X509TrustManager) this.a.b).checkClientTrusted(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) {
        this.a.p(x509CertificateArr);
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) {
        this.a.p(x509CertificateArr);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        this.a.p(x509CertificateArr);
    }
}
