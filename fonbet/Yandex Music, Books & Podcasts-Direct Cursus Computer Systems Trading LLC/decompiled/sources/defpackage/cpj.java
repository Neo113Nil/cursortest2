package defpackage;

import java.net.Socket;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes5.dex */
public abstract class cpj {
    public static final List a = Collections.unmodifiableList(Arrays.asList(hzm.HTTP_2));

    public static SSLSocket a(SSLSocketFactory sSLSocketFactory, Socket socket, String str, int i, m66 m66Var) {
        hzm hzmVar;
        o2g.O(sSLSocketFactory, "sslSocketFactory");
        o2g.O(socket, "socket");
        o2g.O(m66Var, "spec");
        SSLSocket sSLSocket = (SSLSocket) sSLSocketFactory.createSocket(socket, str, i, true);
        String[] strArr = m66Var.b;
        String[] strArr2 = strArr != null ? (String[]) bvt.a(strArr, sSLSocket.getEnabledCipherSuites()) : null;
        String[] strArr3 = (String[]) bvt.a(m66Var.c, sSLSocket.getEnabledProtocols());
        k66 k66Var = new k66(m66Var);
        if (!k66Var.a) {
            xq0.q("no cipher suites for cleartext connections");
            return null;
        }
        if (strArr2 == null) {
            k66Var.b = null;
        } else {
            k66Var.b = (String[]) strArr2.clone();
        }
        if (!k66Var.a) {
            xq0.q("no TLS versions for cleartext connections");
            return null;
        }
        if (strArr3 == null) {
            k66Var.c = null;
        } else {
            k66Var.c = (String[]) strArr3.clone();
        }
        m66 m66Var2 = new m66(k66Var);
        sSLSocket.setEnabledProtocols(m66Var2.c);
        String[] strArr4 = m66Var2.b;
        if (strArr4 != null) {
            sSLSocket.setEnabledCipherSuites(strArr4);
        }
        zoj zojVar = zoj.c;
        boolean z = m66Var.d;
        List list = a;
        String d = zojVar.d(sSLSocket, str, z ? list : null);
        if (d.equals("http/1.0")) {
            hzmVar = hzm.HTTP_1_0;
        } else if (d.equals("http/1.1")) {
            hzmVar = hzm.HTTP_1_1;
        } else if (d.equals("h2")) {
            hzmVar = hzm.HTTP_2;
        } else {
            if (!d.equals("spdy/3.1")) {
                kac.f("Unexpected protocol: ".concat(d));
                return null;
            }
            hzmVar = hzm.SPDY_3;
        }
        o2g.S(d, "Only " + list + " are supported, but negotiated protocol is %s", list.contains(hzmVar));
        if (xnj.a.verify((str.startsWith("[") && str.endsWith("]")) ? f1d.d(1, 1, str) : str, sSLSocket.getSession())) {
            return sSLSocket;
        }
        throw new SSLPeerUnverifiedException("Cannot verify hostname: ".concat(str));
    }
}
