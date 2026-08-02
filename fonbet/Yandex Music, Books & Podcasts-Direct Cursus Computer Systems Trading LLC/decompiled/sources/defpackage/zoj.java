package defpackage;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocket;

/* loaded from: classes5.dex */
public class zoj {
    public static final Logger b;
    public static final zoj c;
    public final ntk a;

    static {
        zoj zojVar;
        Logger logger = Logger.getLogger(zoj.class.getName());
        b = logger;
        ntk ntkVar = ntk.d;
        ClassLoader classLoader = zoj.class.getClassLoader();
        try {
            classLoader.loadClass("com.android.org.conscrypt.OpenSSLSocketImpl");
        } catch (ClassNotFoundException e) {
            logger.log(Level.FINE, "Unable to find Conscrypt. Skipping", (Throwable) e);
            try {
                classLoader.loadClass("org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl");
            } catch (ClassNotFoundException e2) {
                logger.log(Level.FINE, "Unable to find any OpenSSLSocketImpl. Skipping", (Throwable) e2);
                zojVar = new zoj(ntkVar);
            }
        }
        zojVar = new yoj(ntkVar);
        c = zojVar;
    }

    public zoj(ntk ntkVar) {
        o2g.O(ntkVar, "platform");
        this.a = ntkVar;
    }

    public static boolean c(String str) {
        if (str.contains("_")) {
            return false;
        }
        try {
            o2g.H(str, "Userinfo must not be present on authority: '%s'", xqd.a(str).getAuthority().indexOf(64) == -1);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public void a(SSLSocket sSLSocket, String str, List list) {
        this.a.c(sSLSocket, str, list);
    }

    public String b(SSLSocket sSLSocket) {
        return this.a.d(sSLSocket);
    }

    public String d(SSLSocket sSLSocket, String str, List list) {
        ntk ntkVar = this.a;
        if (list != null) {
            a(sSLSocket, str, list);
        }
        try {
            sSLSocket.startHandshake();
            String b2 = b(sSLSocket);
            if (b2 != null) {
                return b2;
            }
            throw new RuntimeException("TLS ALPN negotiation failed with protocols: " + list);
        } finally {
            ntkVar.a(sSLSocket);
        }
    }
}
