package R1;

import J1.s;
import android.util.Log;
import io.appmetrica.analytics.coreutils.internal.services.telephony.CellularNetworkTypeExtractor;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public static volatile n f1772a;

    /* renamed from: b, reason: collision with root package name */
    public static final Logger f1773b;

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0093, code lost:
    
        if (r1 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b5, code lost:
    
        if (r1 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d5, code lost:
    
        if (r1 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00fb, code lost:
    
        if (java.lang.Integer.parseInt(r3) >= 9) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0163  */
    static {
        n kVar;
        n nVar;
        if (m0.j.k()) {
            for (Map.Entry entry : S1.c.f1777b.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                Logger logger = Logger.getLogger(str);
                if (S1.c.f1776a.add(logger)) {
                    logger.setUseParentHandlers(false);
                    logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
                    logger.addHandler(S1.d.f1778a);
                }
            }
            nVar = a.f1741d ? new a() : null;
            if (nVar == null) {
                r2 = c.f1745e ? new c() : null;
                kotlin.jvm.internal.i.b(r2);
                nVar = r2;
            }
        } else {
            if ("Conscrypt".equals(Security.getProviders()[0].getName())) {
                kVar = h.f1751d ? new h() : null;
            }
            if ("BC".equals(Security.getProviders()[0].getName())) {
                kVar = e.f1748d ? new e() : null;
            }
            if ("OpenJSSE".equals(Security.getProviders()[0].getName())) {
                kVar = m.f1770d ? new m() : null;
            }
            kVar = k.f1761c ? new k() : null;
            if (kVar == null) {
                String jvmVersion = System.getProperty("java.specification.version", CellularNetworkTypeExtractor.UNKNOWN_NETWORK_TYPE_VALUE);
                try {
                    kotlin.jvm.internal.i.d(jvmVersion, "jvmVersion");
                } catch (NumberFormatException unused) {
                }
            }
            nVar = kVar;
        }
        f1772a = nVar;
        f1773b = Logger.getLogger(s.class.getName());
        try {
            Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
            Class<?> cls2 = Class.forName(kotlin.jvm.internal.i.h("$Provider", "org.eclipse.jetty.alpn.ALPN"), true, null);
            Class<?> clientProviderClass = Class.forName(kotlin.jvm.internal.i.h("$ClientProvider", "org.eclipse.jetty.alpn.ALPN"), true, null);
            Class<?> serverProviderClass = Class.forName(kotlin.jvm.internal.i.h("$ServerProvider", "org.eclipse.jetty.alpn.ALPN"), true, null);
            Method putMethod = cls.getMethod("put", SSLSocket.class, cls2);
            Method getMethod = cls.getMethod("get", SSLSocket.class);
            Method removeMethod = cls.getMethod("remove", SSLSocket.class);
            kotlin.jvm.internal.i.d(putMethod, "putMethod");
            kotlin.jvm.internal.i.d(getMethod, "getMethod");
            kotlin.jvm.internal.i.d(removeMethod, "removeMethod");
            kotlin.jvm.internal.i.d(clientProviderClass, "clientProviderClass");
            kotlin.jvm.internal.i.d(serverProviderClass, "serverProviderClass");
            r2 = new j(putMethod, getMethod, removeMethod, clientProviderClass, serverProviderClass);
        } catch (ClassNotFoundException | NoSuchMethodException unused2) {
        }
        if (r2 == null) {
            nVar = new n();
            f1772a = nVar;
            f1773b = Logger.getLogger(s.class.getName());
        }
        nVar = r2;
        f1772a = nVar;
        f1773b = Logger.getLogger(s.class.getName());
        if (r2 == null) {
        }
        nVar = r2;
        f1772a = nVar;
        f1773b = Logger.getLogger(s.class.getName());
    }

    public static void i(String message, int i2, Throwable th) {
        kotlin.jvm.internal.i.e(message, "message");
        f1773b.log(i2 == 5 ? Level.WARNING : Level.INFO, message, th);
    }

    public l b(X509TrustManager x509TrustManager) {
        return new V1.a(c(x509TrustManager));
    }

    public V1.d c(X509TrustManager x509TrustManager) {
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        kotlin.jvm.internal.i.d(acceptedIssuers, "trustManager.acceptedIssuers");
        return new V1.b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void d(SSLSocket sSLSocket, String str, List protocols) {
        kotlin.jvm.internal.i.e(protocols, "protocols");
    }

    public void e(Socket socket, InetSocketAddress address, int i2) {
        kotlin.jvm.internal.i.e(address, "address");
        socket.connect(address, i2);
    }

    public String f(SSLSocket sSLSocket) {
        return null;
    }

    public Object g() {
        if (f1773b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public boolean h(String hostname) {
        kotlin.jvm.internal.i.e(hostname, "hostname");
        return true;
    }

    public void j(Object obj, String message) {
        kotlin.jvm.internal.i.e(message, "message");
        if (obj == null) {
            message = kotlin.jvm.internal.i.h(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);", message);
        }
        i(message, 5, (Throwable) obj);
    }

    public SSLContext k() {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        kotlin.jvm.internal.i.d(sSLContext, "getInstance(\"TLS\")");
        return sSLContext;
    }

    public SSLSocketFactory l(X509TrustManager x509TrustManager) {
        try {
            SSLContext k2 = k();
            k2.init(null, new TrustManager[]{x509TrustManager}, null);
            SSLSocketFactory socketFactory = k2.getSocketFactory();
            kotlin.jvm.internal.i.d(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e2) {
            throw new AssertionError(kotlin.jvm.internal.i.h(e2, "No System TLS: "), e2);
        }
    }

    public X509TrustManager m() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
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

    public final String toString() {
        return getClass().getSimpleName();
    }

    public void a(SSLSocket sSLSocket) {
    }
}
