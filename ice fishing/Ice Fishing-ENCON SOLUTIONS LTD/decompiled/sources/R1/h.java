package R1;

import java.security.KeyStore;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.conscrypt.Conscrypt;

/* loaded from: classes.dex */
public final class h extends n {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f1751d;

    /* renamed from: c, reason: collision with root package name */
    public final Provider f1752c;

    static {
        boolean z2 = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, f.class.getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (f.a()) {
                    z2 = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f1751d = z2;
    }

    public h() {
        Provider newProvider = Conscrypt.newProvider();
        kotlin.jvm.internal.i.d(newProvider, "newProvider()");
        this.f1752c = newProvider;
    }

    @Override // R1.n
    public final void d(SSLSocket sSLSocket, String str, List protocols) {
        kotlin.jvm.internal.i.e(protocols, "protocols");
        if (!Conscrypt.isConscrypt(sSLSocket)) {
            super.d(sSLSocket, str, protocols);
            return;
        }
        Conscrypt.setUseSessionTickets(sSLSocket, true);
        Object[] array = m0.j.c(protocols).toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        Conscrypt.setApplicationProtocols(sSLSocket, (String[]) array);
    }

    @Override // R1.n
    public final String f(SSLSocket sSLSocket) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // R1.n
    public final SSLContext k() {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f1752c);
        kotlin.jvm.internal.i.d(sSLContext, "getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // R1.n
    public final SSLSocketFactory l(X509TrustManager x509TrustManager) {
        SSLContext k2 = k();
        k2.init(null, new TrustManager[]{x509TrustManager}, null);
        SSLSocketFactory socketFactory = k2.getSocketFactory();
        kotlin.jvm.internal.i.d(socketFactory, "newSSLContext().apply {\n…null)\n    }.socketFactory");
        return socketFactory;
    }

    @Override // R1.n
    public final X509TrustManager m() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        kotlin.jvm.internal.i.b(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                if (trustManager == null) {
                    throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                }
                X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                Conscrypt.setHostnameVerifier(x509TrustManager, g.f1750a);
                return x509TrustManager;
            }
        }
        String arrays = Arrays.toString(trustManagers);
        kotlin.jvm.internal.i.d(arrays, "toString(this)");
        throw new IllegalStateException(kotlin.jvm.internal.i.h(arrays, "Unexpected default trust managers: ").toString());
    }
}
