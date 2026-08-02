package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;
import java.security.AccessController;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivilegedActionException;
import java.security.Provider;
import java.security.Security;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;

/* loaded from: classes5.dex */
public class ntk {
    public static final Logger b;
    public static final String[] c;
    public static final ntk d;
    public final Provider a;

    static {
        Provider provider;
        Provider provider2;
        ntk ntkVar;
        int i;
        Logger logger = Logger.getLogger(ntk.class.getName());
        b = logger;
        c = new String[]{"com.google.android.gms.org.conscrypt.OpenSSLProvider", "org.conscrypt.OpenSSLProvider", "com.android.org.conscrypt.OpenSSLProvider", "org.apache.harmony.xnet.provider.jsse.OpenSSLProvider", "com.google.android.libraries.stitch.sslguard.SslGuardProvider"};
        Provider[] providers = Security.getProviders();
        int length = providers.length;
        int i2 = 0;
        loop0: while (true) {
            if (i2 >= length) {
                logger.log(Level.WARNING, "Unable to find Conscrypt");
                provider = null;
                break;
            }
            Provider provider3 = providers[i2];
            for (String str : c) {
                if (str.equals(provider3.getClass().getName())) {
                    logger.log(Level.FINE, "Found registered provider {0}", str);
                    provider = provider3;
                    break loop0;
                }
            }
            i2++;
        }
        int i3 = 2;
        if (provider != null) {
            ime imeVar = new ime((Class) null, "setUseSessionTickets", new Class[]{Boolean.TYPE});
            ime imeVar2 = new ime((Class) null, "setHostname", new Class[]{String.class});
            ime imeVar3 = new ime(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
            ime imeVar4 = new ime((Class) null, "setAlpnProtocols", new Class[]{byte[].class});
            try {
                Class<?> cls = Class.forName("android.net.TrafficStats");
                cls.getMethod("tagSocket", Socket.class);
                cls.getMethod("untagSocket", Socket.class);
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
            }
            if (!provider.getName().equals("GmsCore_OpenSSL") && !provider.getName().equals("Conscrypt") && !provider.getName().equals("Ssl_Guard")) {
                try {
                    ntk.class.getClassLoader().loadClass("android.net.Network");
                } catch (ClassNotFoundException e) {
                    logger.log(Level.FINE, "Can't find class", (Throwable) e);
                    try {
                        ntk.class.getClassLoader().loadClass("android.app.ActivityOptions");
                    } catch (ClassNotFoundException e2) {
                        logger.log(Level.FINE, "Can't find class", (Throwable) e2);
                        i3 = 3;
                    }
                    i = i3;
                }
            }
            i = 1;
            ntkVar = new htk(imeVar, imeVar2, imeVar3, imeVar4, provider, i);
        } else {
            try {
                Provider provider4 = SSLContext.getDefault().getProvider();
                try {
                    try {
                        SSLContext sSLContext = SSLContext.getInstance("TLS", provider4);
                        sSLContext.init(null, null, null);
                        ((Method) AccessController.doPrivileged(new ftk(0))).invoke(sSLContext.createSSLEngine(), null);
                        ntkVar = new jtk(provider4, (Method) AccessController.doPrivileged(new ftk(1)), (Method) AccessController.doPrivileged(new ftk(2)));
                    } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                        provider2 = provider4;
                        ntkVar = new ntk(provider2);
                        d = ntkVar;
                    }
                } catch (IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException unused3) {
                    Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN");
                    try {
                        ntkVar = new ktk(cls2.getMethod("put", SSLSocket.class, Class.forName("org.eclipse.jetty.alpn.ALPN$Provider")), cls2.getMethod("get", SSLSocket.class), cls2.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider"), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider"), provider4);
                    } catch (ClassNotFoundException | NoSuchMethodException unused4) {
                        provider2 = provider4;
                        ntkVar = new ntk(provider2);
                        d = ntkVar;
                    }
                }
            } catch (NoSuchAlgorithmException e3) {
                b6e.q(e3);
                return;
            }
        }
        d = ntkVar;
    }

    public ntk(Provider provider) {
        this.a = provider;
    }

    public static byte[] b(List list) {
        hi3 hi3Var = new hi3();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            hzm hzmVar = (hzm) list.get(i);
            if (hzmVar != hzm.HTTP_1_0) {
                hi3Var.M0(hzmVar.a.length());
                hi3Var.S0(hzmVar.a);
            }
        }
        return hi3Var.X(hi3Var.b);
    }

    public String d(SSLSocket sSLSocket) {
        return null;
    }

    public int e() {
        return 3;
    }

    public void a(SSLSocket sSLSocket) {
    }

    public void c(SSLSocket sSLSocket, String str, List list) {
    }
}
