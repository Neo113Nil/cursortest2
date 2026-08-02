package defpackage;

import com.connectsdk.etc.helper.HttpMessage;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;

/* loaded from: classes5.dex */
public final class okn extends i5e {
    public final bho b;
    public Socket c;
    public Socket d;
    public hsd e;
    public izm f;
    public o5e g;
    public ikn h;
    public hkn i;
    public boolean j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public int o;
    public final ArrayList p;
    public long q;

    public okn(fpa fpaVar, bho bhoVar) {
        fpaVar.getClass();
        bhoVar.getClass();
        this.b = bhoVar;
        this.o = 1;
        this.p = new ArrayList();
        this.q = Long.MAX_VALUE;
    }

    public static void d(OkHttpClient okHttpClient, bho bhoVar, IOException iOException) {
        okHttpClient.getClass();
        bhoVar.getClass();
        iOException.getClass();
        if (bhoVar.b.type() != Proxy.Type.DIRECT) {
            mn mnVar = bhoVar.a;
            mnVar.g.connectFailed(mnVar.h.j(), bhoVar.b.address(), iOException);
        }
        vtm vtmVar = okHttpClient.B;
        synchronized (vtmVar) {
            ((LinkedHashSet) vtmVar.a).add(bhoVar);
        }
    }

    @Override // defpackage.i5e
    public final synchronized void a(o5e o5eVar, app appVar) {
        appVar.getClass();
        this.o = (appVar.a & 16) != 0 ? appVar.b[4] : Integer.MAX_VALUE;
    }

    @Override // defpackage.i5e
    public final void b(x5e x5eVar) {
        x5eVar.c(8, null);
    }

    public final void c(int i, int i2, int i3, boolean z, es3 es3Var, jib jibVar) {
        es3 es3Var2;
        jib jibVar2;
        bho bhoVar;
        jibVar.getClass();
        if (this.f != null) {
            xq0.q("already connected");
            return;
        }
        List list = this.b.a.j;
        n66 n66Var = new n66(list);
        mn mnVar = this.b.a;
        if (mnVar.c == null) {
            if (!list.contains(l66.f)) {
                throw new cho(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String str = this.b.a.h.d;
            otk otkVar = otk.a;
            if (!otk.a.h(str)) {
                throw new cho(new UnknownServiceException(hrg.q("CLEARTEXT communication to ", str, " not permitted by network security policy")));
            }
        } else if (mnVar.i.contains(izm.H2_PRIOR_KNOWLEDGE)) {
            throw new cho(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        cho choVar = null;
        do {
            try {
                bho bhoVar2 = this.b;
                try {
                    if (bhoVar2.a.c != null && bhoVar2.b.type() == Proxy.Type.HTTP) {
                        es3Var2 = es3Var;
                        jibVar2 = jibVar;
                        f(i, i2, i3, es3Var2, jibVar2);
                        if (this.c == null) {
                            bhoVar = this.b;
                            if (bhoVar.a.c == null && bhoVar.b.type() == Proxy.Type.HTTP && this.c == null) {
                                throw new cho(new ProtocolException("Too many tunnel connections attempted: 21"));
                            }
                            this.q = System.nanoTime();
                            return;
                        }
                    } else {
                        es3Var2 = es3Var;
                        jibVar2 = jibVar;
                        e(i, i2, es3Var2, jibVar2);
                    }
                    g(n66Var, es3Var2, jibVar2);
                    bho bhoVar3 = this.b;
                    jibVar2.d(es3Var2, bhoVar3.c, bhoVar3.b, this.f);
                    bhoVar = this.b;
                    if (bhoVar.a.c == null) {
                    }
                    this.q = System.nanoTime();
                    return;
                } catch (IOException e) {
                    e = e;
                    Socket socket = this.d;
                    if (socket != null) {
                        cvt.e(socket);
                    }
                    Socket socket2 = this.c;
                    if (socket2 != null) {
                        cvt.e(socket2);
                    }
                    this.d = null;
                    this.c = null;
                    this.h = null;
                    this.i = null;
                    this.e = null;
                    this.f = null;
                    this.g = null;
                    this.o = 1;
                    bho bhoVar4 = this.b;
                    jibVar2.e(es3Var2, bhoVar4.c, bhoVar4.b, e);
                    if (choVar == null) {
                        choVar = new cho(e);
                    } else {
                        fob.a(choVar.a, e);
                        choVar.b = e;
                    }
                    if (!z) {
                        throw choVar;
                    }
                    n66Var.d = true;
                    if (!n66Var.c) {
                        throw choVar;
                    }
                    if (e instanceof ProtocolException) {
                        throw choVar;
                    }
                    if (e instanceof InterruptedIOException) {
                        throw choVar;
                    }
                    if ((e instanceof SSLHandshakeException) && (e.getCause() instanceof CertificateException)) {
                        throw choVar;
                    }
                    if (e instanceof SSLPeerUnverifiedException) {
                        throw choVar;
                    }
                }
            } catch (IOException e2) {
                e = e2;
                es3Var2 = es3Var;
                jibVar2 = jibVar;
            }
        } while (e instanceof SSLException);
        throw choVar;
    }

    public final void e(int i, int i2, es3 es3Var, jib jibVar) {
        Socket createSocket;
        bho bhoVar = this.b;
        Proxy proxy = bhoVar.b;
        mn mnVar = bhoVar.a;
        Proxy.Type type = proxy.type();
        int i3 = type == null ? -1 : nkn.a[type.ordinal()];
        if (i3 == 1 || i3 == 2) {
            createSocket = mnVar.b.createSocket();
            createSocket.getClass();
        } else {
            createSocket = new Socket(proxy);
        }
        this.c = createSocket;
        jibVar.f(es3Var, this.b.c, proxy);
        createSocket.setSoTimeout(i2);
        try {
            otk otkVar = otk.a;
            otk.a.e(createSocket, this.b.c, i);
            try {
                this.h = new ikn(fxf.U(createSocket));
                this.i = new hkn(fxf.R(createSocket));
            } catch (NullPointerException e) {
                if (Intrinsics.d(e.getMessage(), "throw with null exception")) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.b.c);
            connectException.initCause(e2);
            throw connectException;
        }
    }

    public final void f(int i, int i2, int i3, es3 es3Var, jib jibVar) {
        b0o b0oVar = new b0o();
        bho bhoVar = this.b;
        u7e u7eVar = bhoVar.a.h;
        u7eVar.getClass();
        b0oVar.a = u7eVar;
        b0oVar.e("CONNECT", null);
        mn mnVar = bhoVar.a;
        b0oVar.d("Host", cvt.w(mnVar.h, true));
        b0oVar.d("Proxy-Connection", "Keep-Alive");
        b0oVar.d(HttpMessage.USER_AGENT, "okhttp/4.12.0");
        d0o b = b0oVar.b();
        pv9 pv9Var = new pv9(9);
        wkn wknVar = cvt.c;
        qwp.D("Proxy-Authenticate");
        qwp.G("OkHttp-Preemptive", "Proxy-Authenticate");
        pv9Var.I("Proxy-Authenticate");
        pv9Var.m("Proxy-Authenticate", "OkHttp-Preemptive");
        new l3o(b, izm.HTTP_1_1, "Preemptive Authenticate", 407, null, pv9Var.r(), wknVar, null, null, null, -1L, -1L, null);
        mnVar.f.getClass();
        u7e u7eVar2 = b.a;
        e(i, i2, es3Var, jibVar);
        String str = "CONNECT " + cvt.w(u7eVar2, true) + " HTTP/1.1";
        ikn iknVar = this.h;
        iknVar.getClass();
        hkn hknVar = this.i;
        hknVar.getClass();
        rd2 rd2Var = new rd2(null, this, iknVar, hknVar);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        iknVar.a.i().g(i2, timeUnit);
        hknVar.a.i().g(i3, timeUnit);
        rd2Var.o(b.c, str);
        rd2Var.b();
        k3o g = rd2Var.g(false);
        g.getClass();
        g.a = b;
        l3o a = g.a();
        int i4 = a.d;
        long k = cvt.k(a);
        if (k != -1) {
            a5e n = rd2Var.n(k);
            cvt.u(n, Integer.MAX_VALUE);
            n.close();
        }
        if (i4 == 200) {
            if (iknVar.b.N() && hknVar.b.N()) {
                return;
            }
            kac.f("TLS tunnel buffered too many bytes!");
            return;
        }
        if (i4 != 407) {
            kac.f(k5r.i(i4, "Unexpected response code for CONNECT: "));
        } else {
            mnVar.f.getClass();
            kac.f("Failed to authenticate with proxy");
        }
    }

    public final void g(n66 n66Var, es3 es3Var, jib jibVar) {
        SSLSocket sSLSocket;
        izm izmVar = izm.HTTP_1_1;
        mn mnVar = this.b.a;
        if (mnVar.c == null) {
            List list = mnVar.i;
            izm izmVar2 = izm.H2_PRIOR_KNOWLEDGE;
            boolean contains = list.contains(izmVar2);
            Socket socket = this.c;
            if (!contains) {
                this.d = socket;
                this.f = izmVar;
                return;
            } else {
                this.d = socket;
                this.f = izmVar2;
                l();
                return;
            }
        }
        jibVar.t(es3Var);
        mn mnVar2 = this.b.a;
        SSLSocketFactory sSLSocketFactory = mnVar2.c;
        SSLSocket sSLSocket2 = null;
        String str = null;
        try {
            sSLSocketFactory.getClass();
            Socket socket2 = this.c;
            u7e u7eVar = mnVar2.h;
            Socket createSocket = sSLSocketFactory.createSocket(socket2, u7eVar.d, u7eVar.e, true);
            createSocket.getClass();
            sSLSocket = (SSLSocket) createSocket;
        } catch (Throwable th) {
            th = th;
        }
        try {
            l66 a = n66Var.a(sSLSocket);
            if (a.b) {
                otk otkVar = otk.a;
                otk.a.d(sSLSocket, mnVar2.h.d, mnVar2.i);
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            session.getClass();
            hsd q = lxe.q(session);
            HostnameVerifier hostnameVerifier = mnVar2.d;
            hostnameVerifier.getClass();
            if (hostnameVerifier.verify(mnVar2.h.d, session)) {
                ha4 ha4Var = mnVar2.e;
                ha4Var.getClass();
                this.e = new hsd(q.a, q.b, q.c, new t03(21, ha4Var, q, mnVar2));
                ha4Var.a(mnVar2.h.d, new kgk(9, this));
                if (a.b) {
                    otk otkVar2 = otk.a;
                    str = otk.a.f(sSLSocket);
                }
                this.d = sSLSocket;
                this.h = new ikn(fxf.U(sSLSocket));
                this.i = new hkn(fxf.R(sSLSocket));
                if (str != null) {
                    izmVar = ywf.x(str);
                }
                this.f = izmVar;
                otk otkVar3 = otk.a;
                otk.a.a(sSLSocket);
                jibVar.s(es3Var, this.e);
                if (this.f == izm.HTTP_2) {
                    l();
                    return;
                }
                return;
            }
            List a2 = q.a();
            if (a2.isEmpty()) {
                throw new SSLPeerUnverifiedException("Hostname " + mnVar2.h.d + " not verified (no certificates)");
            }
            Object obj = a2.get(0);
            obj.getClass();
            X509Certificate x509Certificate = (X509Certificate) obj;
            StringBuilder sb = new StringBuilder("\n              |Hostname ");
            sb.append(mnVar2.h.d);
            sb.append(" not verified:\n              |    certificate: ");
            ha4 ha4Var2 = ha4.c;
            StringBuilder sb2 = new StringBuilder("sha256/");
            pn3 pn3Var = pn3.d;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            encoded.getClass();
            sb2.append(ovn.L(-1234567890, encoded).c("SHA-256").a());
            sb.append(sb2.toString());
            sb.append("\n              |    DN: ");
            sb.append(x509Certificate.getSubjectDN().getName());
            sb.append("\n              |    subjectAltNames: ");
            sb.append(CollectionsKt.g0(wnj.a(x509Certificate, 7), wnj.a(x509Certificate, 2)));
            sb.append("\n              ");
            throw new SSLPeerUnverifiedException(hlr.e(sb.toString()));
        } catch (Throwable th2) {
            th = th2;
            sSLSocket2 = sSLSocket;
            if (sSLSocket2 != null) {
                otk otkVar4 = otk.a;
                otk.a.a(sSLSocket2);
            }
            if (sSLSocket2 != null) {
                cvt.e(sSLSocket2);
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b5, code lost:
    
        if (defpackage.wnj.c(r5, (java.security.cert.X509Certificate) r11) != false) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(mn mnVar, List list) {
        hsd hsdVar;
        byte[] bArr = cvt.a;
        if (this.p.size() < this.o && !this.j) {
            bho bhoVar = this.b;
            mn mnVar2 = bhoVar.a;
            mn mnVar3 = bhoVar.a;
            boolean a = mnVar2.a(mnVar);
            u7e u7eVar = mnVar.h;
            if (a) {
                String str = u7eVar.d;
                String str2 = u7eVar.d;
                if (Intrinsics.d(str, mnVar3.h.d)) {
                    return true;
                }
                if (this.g != null && list != null) {
                    List list2 = list;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator it = list2.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            bho bhoVar2 = (bho) it.next();
                            Proxy.Type type = bhoVar2.b.type();
                            Proxy.Type type2 = Proxy.Type.DIRECT;
                            if (type == type2 && bhoVar.b.type() == type2 && Intrinsics.d(bhoVar.c, bhoVar2.c)) {
                                if (mnVar.d == wnj.a) {
                                    byte[] bArr2 = cvt.a;
                                    u7e u7eVar2 = mnVar3.h;
                                    if (u7eVar.e == u7eVar2.e) {
                                        if (!Intrinsics.d(str2, u7eVar2.d)) {
                                            if (!this.k && (hsdVar = this.e) != null) {
                                                List a2 = hsdVar.a();
                                                if (!a2.isEmpty()) {
                                                    Object obj = a2.get(0);
                                                    obj.getClass();
                                                }
                                            }
                                        }
                                        try {
                                            ha4 ha4Var = mnVar.e;
                                            ha4Var.getClass();
                                            hsd hsdVar2 = this.e;
                                            hsdVar2.getClass();
                                            List a3 = hsdVar2.a();
                                            str2.getClass();
                                            a3.getClass();
                                            ha4Var.a(str2, new t03(3, ha4Var, a3, str2));
                                            return true;
                                        } catch (SSLPeerUnverifiedException unused) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean i(boolean z) {
        long j;
        byte[] bArr = cvt.a;
        long nanoTime = System.nanoTime();
        Socket socket = this.c;
        socket.getClass();
        Socket socket2 = this.d;
        socket2.getClass();
        this.h.getClass();
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        o5e o5eVar = this.g;
        if (o5eVar != null) {
            synchronized (o5eVar) {
                if (o5eVar.f) {
                    return false;
                }
                if (o5eVar.n < o5eVar.m) {
                    if (nanoTime >= o5eVar.o) {
                        return false;
                    }
                }
                return true;
            }
        }
        synchronized (this) {
            j = nanoTime - this.q;
        }
        if (j < 10000000000L || !z) {
            return true;
        }
        try {
            int soTimeout = socket2.getSoTimeout();
            try {
                socket2.setSoTimeout(1);
                return !r4.a();
            } finally {
                socket2.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public final iob j(OkHttpClient okHttpClient, ukn uknVar) {
        int i = uknVar.d;
        okHttpClient.getClass();
        Socket socket = this.d;
        socket.getClass();
        ikn iknVar = this.h;
        iknVar.getClass();
        hkn hknVar = this.i;
        hknVar.getClass();
        o5e o5eVar = this.g;
        if (o5eVar != null) {
            return new p5e(okHttpClient, this, uknVar, o5eVar);
        }
        socket.setSoTimeout(i);
        vis i2 = iknVar.a.i();
        long j = i;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        i2.g(j, timeUnit);
        hknVar.a.i().g(uknVar.e, timeUnit);
        return new rd2(okHttpClient, this, iknVar, hknVar);
    }

    public final synchronized void k() {
        this.j = true;
    }

    public final void l() {
        Socket socket = this.d;
        socket.getClass();
        ikn iknVar = this.h;
        iknVar.getClass();
        hkn hknVar = this.i;
        hknVar.getClass();
        socket.setSoTimeout(0);
        m8s m8sVar = m8s.h;
        rdk rdkVar = new rdk(m8sVar);
        String str = this.b.a.h.d;
        str.getClass();
        rdkVar.d = socket;
        rdkVar.b = cvt.g + ' ' + str;
        rdkVar.e = iknVar;
        rdkVar.f = hknVar;
        rdkVar.g = this;
        o5e o5eVar = new o5e(rdkVar);
        this.g = o5eVar;
        app appVar = o5e.z;
        this.o = (appVar.a & 16) != 0 ? appVar.b[4] : Integer.MAX_VALUE;
        y5e y5eVar = o5eVar.w;
        synchronized (y5eVar) {
            try {
                if (y5eVar.d) {
                    throw new IOException("closed");
                }
                Logger logger = y5e.f;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(cvt.i(">> CONNECTION " + f5e.a.e(), new Object[0]));
                }
                y5eVar.a.W(f5e.a);
                y5eVar.a.flush();
            } finally {
            }
        }
        y5e y5eVar2 = o5eVar.w;
        app appVar2 = o5eVar.p;
        synchronized (y5eVar2) {
            try {
                appVar2.getClass();
                if (y5eVar2.d) {
                    throw new IOException("closed");
                }
                y5eVar2.g(0, Integer.bitCount(appVar2.a) * 6, 4, 0);
                int i = 0;
                while (i < 10) {
                    boolean z = true;
                    if (((1 << i) & appVar2.a) == 0) {
                        z = false;
                    }
                    if (z) {
                        y5eVar2.a.writeShort(i != 4 ? i != 7 ? i : 4 : 3);
                        y5eVar2.a.writeInt(appVar2.b[i]);
                    }
                    i++;
                }
                y5eVar2.a.flush();
            } finally {
            }
        }
        if (o5eVar.p.a() != 65535) {
            o5eVar.w.I(0, r1 - 65535);
        }
        m8sVar.e().c(new h78(o5eVar.c, o5eVar.x, 3), 0L);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Connection{");
        bho bhoVar = this.b;
        sb.append(bhoVar.a.h.d);
        sb.append(':');
        sb.append(bhoVar.a.h.e);
        sb.append(", proxy=");
        sb.append(bhoVar.b);
        sb.append(" hostAddress=");
        sb.append(bhoVar.c);
        sb.append(" cipherSuite=");
        hsd hsdVar = this.e;
        sb.append(hsdVar != null ? hsdVar.b : "none");
        sb.append(" protocol=");
        sb.append(this.f);
        sb.append('}');
        return sb.toString();
    }
}
