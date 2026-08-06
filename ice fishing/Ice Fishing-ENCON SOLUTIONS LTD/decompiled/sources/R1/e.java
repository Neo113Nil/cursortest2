package R1;

import java.security.KeyStore;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.bouncycastle.jsse.provider.BouncyCastleJsseProvider;

/* loaded from: classes.dex */
public final class e extends n {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f1748d;

    /* renamed from: c, reason: collision with root package name */
    public final Provider f1749c = new BouncyCastleJsseProvider();

    static {
        boolean z2 = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, d.class.getClassLoader());
            z2 = true;
        } catch (ClassNotFoundException unused) {
        }
        f1748d = z2;
    }

    @Override // R1.n
    public final void d(SSLSocket sSLSocket, String str, List protocols) {
        kotlin.jvm.internal.i.e(protocols, "protocols");
        super.d(sSLSocket, str, protocols);
    }

    @Override // R1.n
    public final String f(SSLSocket sSLSocket) {
        return null;
    }

    @Override // R1.n
    public final SSLContext k() {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f1749c);
        kotlin.jvm.internal.i.d(sSLContext, "getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // R1.n
    public final X509TrustManager m() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("PKIX", "BCJSSE");
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        kotlin.jvm.internal.i.b(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                if (trustManager != null) {
                    return (X509TrustManager) trustManager;
                }
                throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
            }
        }
        String arrays = Arrays.toString(trustManagers);
        kotlin.jvm.internal.i.d(arrays, "toString(this)");
        throw new IllegalStateException(kotlin.jvm.internal.i.h(arrays, "Unexpected default trust managers: ").toString());
    }
}
