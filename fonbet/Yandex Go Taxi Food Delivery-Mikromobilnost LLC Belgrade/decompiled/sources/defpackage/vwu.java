package defpackage;

import java.security.KeyStore;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManagerFactory;

/* loaded from: classes4.dex */
public final class vwu extends rwu {
    @Override // defpackage.rwu
    public final void a(HttpsURLConnection httpsURLConnection) {
        super.a(httpsURLConnection);
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("PKIX");
        trustManagerFactory.init((KeyStore) null);
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        sSLContext.init(null, trustManagerFactory.getTrustManagers(), null);
        httpsURLConnection.setSSLSocketFactory(sSLContext.getSocketFactory());
    }
}
