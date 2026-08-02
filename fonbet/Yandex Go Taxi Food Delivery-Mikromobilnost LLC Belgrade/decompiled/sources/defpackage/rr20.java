package defpackage;

import com.yandex.mob.n;
import java.security.KeyStore;
import java.security.SecureRandom;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes8.dex */
public final class rr20 {
    public final X509TrustManager a;
    public final SSLSocketFactory b;
    public final n c;

    public rr20(X509TrustManager x509TrustManager, SSLSocketFactory sSLSocketFactory, n nVar) {
        this.a = x509TrustManager;
        this.b = sSLSocketFactory;
        this.c = nVar;
    }

    public final tig0 a() {
        SSLSocketFactory sSLSocketFactory;
        n nVar = this.c;
        X509TrustManager x509TrustManager = this.a;
        if (x509TrustManager != null && (sSLSocketFactory = this.b) != null) {
            return new tig0(new sr20(sSLSocketFactory, nVar), x509TrustManager);
        }
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        Object D = j73.D(trustManagerFactory.getTrustManagers());
        X509TrustManager x509TrustManager2 = D instanceof X509TrustManager ? (X509TrustManager) D : null;
        sSLContext.init(null, trustManagerFactory.getTrustManagers(), new SecureRandom());
        return new tig0(new sr20(sSLContext.getSocketFactory(), nVar), x509TrustManager2);
    }
}
