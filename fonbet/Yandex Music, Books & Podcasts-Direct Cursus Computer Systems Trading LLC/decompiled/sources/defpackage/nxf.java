package defpackage;

import android.content.Context;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes4.dex */
public final class nxf implements X509TrustManager {
    public final Context a;
    public final jyr b;

    public nxf(Context context) {
        context.getClass();
        this.a = context;
        this.b = btf.b(new v1e(25, this));
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        x509CertificateArr.getClass();
        str.getClass();
        ((X509TrustManager) this.b.getValue()).checkClientTrusted(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        x509CertificateArr.getClass();
        str.getClass();
        ((X509TrustManager) this.b.getValue()).checkServerTrusted(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        X509Certificate[] acceptedIssuers = ((X509TrustManager) this.b.getValue()).getAcceptedIssuers();
        acceptedIssuers.getClass();
        return acceptedIssuers;
    }
}
