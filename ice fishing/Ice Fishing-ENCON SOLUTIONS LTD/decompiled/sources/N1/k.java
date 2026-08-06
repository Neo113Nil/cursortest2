package N1;

import F.U;
import J1.A;
import J1.C0050a;
import J1.s;
import J1.t;
import J1.u;
import J1.v;
import J1.x;
import Q1.D;
import Q1.EnumC0079b;
import Q1.q;
import Q1.r;
import Q1.y;
import Q1.z;
import W1.p;
import a.AbstractC0083a;
import i1.AbstractC0252i;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.KotlinVersion;
import u0.AbstractC1050a;

/* loaded from: classes.dex */
public final class k extends Q1.i {

    /* renamed from: b, reason: collision with root package name */
    public final A f1199b;

    /* renamed from: c, reason: collision with root package name */
    public Socket f1200c;

    /* renamed from: d, reason: collision with root package name */
    public Socket f1201d;

    /* renamed from: e, reason: collision with root package name */
    public J1.k f1202e;

    /* renamed from: f, reason: collision with root package name */
    public t f1203f;

    /* renamed from: g, reason: collision with root package name */
    public q f1204g;

    /* renamed from: h, reason: collision with root package name */
    public W1.q f1205h;

    /* renamed from: i, reason: collision with root package name */
    public p f1206i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1207j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1208k;

    /* renamed from: l, reason: collision with root package name */
    public int f1209l;

    /* renamed from: m, reason: collision with root package name */
    public int f1210m;

    /* renamed from: n, reason: collision with root package name */
    public int f1211n;

    /* renamed from: o, reason: collision with root package name */
    public int f1212o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f1213p;

    /* renamed from: q, reason: collision with root package name */
    public long f1214q;

    public k(l connectionPool, A route) {
        kotlin.jvm.internal.i.e(connectionPool, "connectionPool");
        kotlin.jvm.internal.i.e(route, "route");
        this.f1199b = route;
        this.f1212o = 1;
        this.f1213p = new ArrayList();
        this.f1214q = Long.MAX_VALUE;
    }

    public static void d(s client, A failedRoute, IOException failure) {
        kotlin.jvm.internal.i.e(client, "client");
        kotlin.jvm.internal.i.e(failedRoute, "failedRoute");
        kotlin.jvm.internal.i.e(failure, "failure");
        if (failedRoute.f804b.type() != Proxy.Type.DIRECT) {
            C0050a c0050a = failedRoute.f803a;
            c0050a.f819g.connectFailed(c0050a.f820h.f(), failedRoute.f804b.address(), failure);
        }
        C.j jVar = client.f962y;
        synchronized (jVar) {
            ((LinkedHashSet) jVar.f124b).add(failedRoute);
        }
    }

    @Override // Q1.i
    public final synchronized void a(q connection, D settings) {
        kotlin.jvm.internal.i.e(connection, "connection");
        kotlin.jvm.internal.i.e(settings, "settings");
        this.f1212o = (settings.f1561a & 16) != 0 ? settings.f1562b[4] : Integer.MAX_VALUE;
    }

    @Override // Q1.i
    public final void b(y yVar) {
        yVar.c(EnumC0079b.REFUSED_STREAM, null);
    }

    public final void c(int i2, int i3, int i4, boolean z2, i call) {
        A a2;
        kotlin.jvm.internal.i.e(call, "call");
        if (this.f1203f != null) {
            throw new IllegalStateException("already connected");
        }
        List list = this.f1199b.f803a.f822j;
        b bVar = new b(list);
        C0050a c0050a = this.f1199b.f803a;
        if (c0050a.f815c == null) {
            if (!list.contains(J1.i.f871f)) {
                throw new m(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String str = this.f1199b.f803a.f820h.f907d;
            R1.n nVar = R1.n.f1772a;
            if (!R1.n.f1772a.h(str)) {
                throw new m(new UnknownServiceException("CLEARTEXT communication to " + str + " not permitted by network security policy"));
            }
        } else if (c0050a.f821i.contains(t.H2_PRIOR_KNOWLEDGE)) {
            throw new m(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        m mVar = null;
        do {
            try {
                A a3 = this.f1199b;
                if (a3.f803a.f815c != null && a3.f804b.type() == Proxy.Type.HTTP) {
                    f(i2, i3, i4, call);
                    if (this.f1200c == null) {
                        a2 = this.f1199b;
                        if (a2.f803a.f815c == null && a2.f804b.type() == Proxy.Type.HTTP && this.f1200c == null) {
                            throw new m(new ProtocolException("Too many tunnel connections attempted: 21"));
                        }
                        this.f1214q = System.nanoTime();
                        return;
                    }
                } else {
                    e(i2, i3, call);
                }
                g(bVar, call);
                InetSocketAddress inetSocketAddress = this.f1199b.f805c;
                kotlin.jvm.internal.i.e(inetSocketAddress, "inetSocketAddress");
                a2 = this.f1199b;
                if (a2.f803a.f815c == null) {
                }
                this.f1214q = System.nanoTime();
                return;
            } catch (IOException e2) {
                Socket socket = this.f1201d;
                if (socket != null) {
                    K1.b.e(socket);
                }
                Socket socket2 = this.f1200c;
                if (socket2 != null) {
                    K1.b.e(socket2);
                }
                this.f1201d = null;
                this.f1200c = null;
                this.f1205h = null;
                this.f1206i = null;
                this.f1202e = null;
                this.f1203f = null;
                this.f1204g = null;
                this.f1212o = 1;
                InetSocketAddress inetSocketAddress2 = this.f1199b.f805c;
                kotlin.jvm.internal.i.e(inetSocketAddress2, "inetSocketAddress");
                if (mVar == null) {
                    mVar = new m(e2);
                } else {
                    AbstractC1050a.a(mVar.f1221a, e2);
                    mVar.f1222b = e2;
                }
                if (!z2) {
                    throw mVar;
                }
                bVar.f1153d = true;
                if (!bVar.f1152c) {
                    throw mVar;
                }
                if (e2 instanceof ProtocolException) {
                    throw mVar;
                }
                if (e2 instanceof InterruptedIOException) {
                    throw mVar;
                }
                if ((e2 instanceof SSLHandshakeException) && (e2.getCause() instanceof CertificateException)) {
                    throw mVar;
                }
                if (e2 instanceof SSLPeerUnverifiedException) {
                    throw mVar;
                }
            }
        } while (e2 instanceof SSLException);
        throw mVar;
    }

    public final void e(int i2, int i3, i call) {
        Socket createSocket;
        A a2 = this.f1199b;
        Proxy proxy = a2.f804b;
        C0050a c0050a = a2.f803a;
        Proxy.Type type = proxy.type();
        int i4 = type == null ? -1 : j.f1198a[type.ordinal()];
        if (i4 == 1 || i4 == 2) {
            createSocket = c0050a.f814b.createSocket();
            kotlin.jvm.internal.i.b(createSocket);
        } else {
            createSocket = new Socket(proxy);
        }
        this.f1200c = createSocket;
        InetSocketAddress inetSocketAddress = this.f1199b.f805c;
        kotlin.jvm.internal.i.e(call, "call");
        kotlin.jvm.internal.i.e(inetSocketAddress, "inetSocketAddress");
        createSocket.setSoTimeout(i3);
        try {
            R1.n nVar = R1.n.f1772a;
            R1.n.f1772a.e(createSocket, this.f1199b.f805c, i2);
            try {
                this.f1205h = new W1.q(R1.d.H(createSocket));
                this.f1206i = new p(R1.d.G(createSocket));
            } catch (NullPointerException e2) {
                if (kotlin.jvm.internal.i.a(e2.getMessage(), "throw with null exception")) {
                    throw new IOException(e2);
                }
            }
        } catch (ConnectException e3) {
            ConnectException connectException = new ConnectException(kotlin.jvm.internal.i.h(this.f1199b.f805c, "Failed to connect to "));
            connectException.initCause(e3);
            throw connectException;
        }
    }

    public final void f(int i2, int i3, int i4, i iVar) {
        u uVar = new u();
        A a2 = this.f1199b;
        J1.o url = a2.f803a.f820h;
        kotlin.jvm.internal.i.e(url, "url");
        uVar.f973c = url;
        uVar.c("CONNECT", null);
        C0050a c0050a = a2.f803a;
        uVar.b("Host", K1.b.v(c0050a.f820h, true));
        uVar.b("Proxy-Connection", "Keep-Alive");
        uVar.b("User-Agent", "okhttp/4.11.0");
        v a3 = uVar.a();
        J1.l lVar = new J1.l(0);
        AbstractC1050a.f("Proxy-Authenticate");
        AbstractC1050a.g("OkHttp-Preemptive", "Proxy-Authenticate");
        lVar.d("Proxy-Authenticate");
        lVar.a("Proxy-Authenticate", "OkHttp-Preemptive");
        lVar.b();
        c0050a.f818f.getClass();
        e(i2, i3, iVar);
        String str = "CONNECT " + K1.b.v(a3.f977a, true) + " HTTP/1.1";
        W1.q qVar = this.f1205h;
        kotlin.jvm.internal.i.b(qVar);
        p pVar = this.f1206i;
        kotlin.jvm.internal.i.b(pVar);
        o oVar = new o(null, this, qVar, pVar);
        W1.y d2 = qVar.f1895a.d();
        long j2 = i3;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        d2.g(j2, timeUnit);
        pVar.f1892a.d().g(i4, timeUnit);
        oVar.k(a3.f979c, str);
        oVar.d();
        x g2 = oVar.g(false);
        kotlin.jvm.internal.i.b(g2);
        g2.f987a = a3;
        J1.y a4 = g2.a();
        long k2 = K1.b.k(a4);
        if (k2 != -1) {
            P1.d j3 = oVar.j(k2);
            K1.b.t(j3, Integer.MAX_VALUE, timeUnit);
            j3.close();
        }
        int i5 = a4.f1003d;
        if (i5 != 200) {
            if (i5 != 407) {
                throw new IOException(kotlin.jvm.internal.i.h(Integer.valueOf(i5), "Unexpected response code for CONNECT: "));
            }
            c0050a.f818f.getClass();
            throw new IOException("Failed to authenticate with proxy");
        }
        if (!qVar.f1896b.a() || !pVar.f1893b.a()) {
            throw new IOException("TLS tunnel buffered too many bytes!");
        }
    }

    public final void g(b bVar, i call) {
        int i2 = 1;
        C0050a c0050a = this.f1199b.f803a;
        SSLSocketFactory sSLSocketFactory = c0050a.f815c;
        t tVar = t.HTTP_1_1;
        if (sSLSocketFactory == null) {
            List list = c0050a.f821i;
            t tVar2 = t.H2_PRIOR_KNOWLEDGE;
            if (!list.contains(tVar2)) {
                this.f1201d = this.f1200c;
                this.f1203f = tVar;
                return;
            } else {
                this.f1201d = this.f1200c;
                this.f1203f = tVar2;
                l();
                return;
            }
        }
        kotlin.jvm.internal.i.e(call, "call");
        C0050a c0050a2 = this.f1199b.f803a;
        SSLSocketFactory sSLSocketFactory2 = c0050a2.f815c;
        SSLSocket sSLSocket = null;
        String str = null;
        try {
            kotlin.jvm.internal.i.b(sSLSocketFactory2);
            Socket socket = this.f1200c;
            J1.o oVar = c0050a2.f820h;
            Socket createSocket = sSLSocketFactory2.createSocket(socket, oVar.f907d, oVar.f908e, true);
            if (createSocket == null) {
                throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            }
            SSLSocket sSLSocket2 = (SSLSocket) createSocket;
            try {
                J1.i a2 = bVar.a(sSLSocket2);
                if (a2.f873b) {
                    R1.n nVar = R1.n.f1772a;
                    R1.n.f1772a.d(sSLSocket2, c0050a2.f820h.f907d, c0050a2.f821i);
                }
                sSLSocket2.startHandshake();
                SSLSession sslSocketSession = sSLSocket2.getSession();
                kotlin.jvm.internal.i.d(sslSocketSession, "sslSocketSession");
                J1.k i3 = AbstractC0083a.i(sslSocketSession);
                V1.c cVar = c0050a2.f816d;
                kotlin.jvm.internal.i.b(cVar);
                if (!cVar.verify(c0050a2.f820h.f907d, sslSocketSession)) {
                    List a3 = i3.a();
                    if (a3.isEmpty()) {
                        throw new SSLPeerUnverifiedException("Hostname " + c0050a2.f820h.f907d + " not verified (no certificates)");
                    }
                    X509Certificate x509Certificate = (X509Certificate) a3.get(0);
                    StringBuilder sb = new StringBuilder("\n              |Hostname ");
                    sb.append(c0050a2.f820h.f907d);
                    sb.append(" not verified:\n              |    certificate: ");
                    J1.e eVar = J1.e.f844c;
                    sb.append(R1.d.D(x509Certificate));
                    sb.append("\n              |    DN: ");
                    sb.append((Object) x509Certificate.getSubjectDN().getName());
                    sb.append("\n              |    subjectAltNames: ");
                    sb.append(AbstractC0252i.N(V1.c.a(x509Certificate, 7), V1.c.a(x509Certificate, 2)));
                    sb.append("\n              ");
                    throw new SSLPeerUnverifiedException(z1.h.L(sb.toString()));
                }
                J1.e eVar2 = c0050a2.f817e;
                kotlin.jvm.internal.i.b(eVar2);
                this.f1202e = new J1.k(i3.f889a, i3.f890b, i3.f891c, new J1.d(eVar2, i3, c0050a2, i2));
                eVar2.a(c0050a2.f820h.f907d, new U(4, this));
                if (a2.f873b) {
                    R1.n nVar2 = R1.n.f1772a;
                    str = R1.n.f1772a.f(sSLSocket2);
                }
                this.f1201d = sSLSocket2;
                this.f1205h = new W1.q(R1.d.H(sSLSocket2));
                this.f1206i = new p(R1.d.G(sSLSocket2));
                if (str != null) {
                    tVar = R1.l.o(str);
                }
                this.f1203f = tVar;
                R1.n nVar3 = R1.n.f1772a;
                R1.n.f1772a.a(sSLSocket2);
                if (this.f1203f == t.HTTP_2) {
                    l();
                }
            } catch (Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    R1.n nVar4 = R1.n.f1772a;
                    R1.n.f1772a.a(sSLSocket);
                }
                if (sSLSocket != null) {
                    K1.b.e(sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a4, code lost:
    
        if (V1.c.c(r1, (java.security.cert.X509Certificate) r10.get(0)) != false) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(C0050a c0050a, ArrayList arrayList) {
        J1.k kVar;
        int i2 = 0;
        byte[] bArr = K1.b.f1051a;
        if (this.f1213p.size() < this.f1212o && !this.f1207j) {
            A a2 = this.f1199b;
            if (!a2.f803a.a(c0050a)) {
                return false;
            }
            J1.o oVar = c0050a.f820h;
            String str = oVar.f907d;
            C0050a c0050a2 = a2.f803a;
            if (kotlin.jvm.internal.i.a(str, c0050a2.f820h.f907d)) {
                return true;
            }
            if (this.f1204g != null && arrayList != null && !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    A a3 = (A) it.next();
                    Proxy.Type type = a3.f804b.type();
                    Proxy.Type type2 = Proxy.Type.DIRECT;
                    if (type == type2 && a2.f804b.type() == type2) {
                        if (kotlin.jvm.internal.i.a(a2.f805c, a3.f805c)) {
                            if (c0050a.f816d != V1.c.f1831a) {
                                return false;
                            }
                            byte[] bArr2 = K1.b.f1051a;
                            J1.o oVar2 = c0050a2.f820h;
                            if (oVar.f908e == oVar2.f908e) {
                                String str2 = oVar2.f907d;
                                String hostname = oVar.f907d;
                                if (!kotlin.jvm.internal.i.a(hostname, str2)) {
                                    if (!this.f1208k && (kVar = this.f1202e) != null) {
                                        List a4 = kVar.a();
                                        if (!a4.isEmpty()) {
                                        }
                                    }
                                }
                                try {
                                    J1.e eVar = c0050a.f817e;
                                    kotlin.jvm.internal.i.b(eVar);
                                    J1.k kVar2 = this.f1202e;
                                    kotlin.jvm.internal.i.b(kVar2);
                                    List peerCertificates = kVar2.a();
                                    kotlin.jvm.internal.i.e(hostname, "hostname");
                                    kotlin.jvm.internal.i.e(peerCertificates, "peerCertificates");
                                    eVar.a(hostname, new J1.d(eVar, peerCertificates, hostname, i2));
                                    return true;
                                } catch (SSLPeerUnverifiedException unused) {
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean i(boolean z2) {
        long j2;
        byte[] bArr = K1.b.f1051a;
        long nanoTime = System.nanoTime();
        Socket socket = this.f1200c;
        kotlin.jvm.internal.i.b(socket);
        Socket socket2 = this.f1201d;
        kotlin.jvm.internal.i.b(socket2);
        W1.q qVar = this.f1205h;
        kotlin.jvm.internal.i.b(qVar);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        q qVar2 = this.f1204g;
        if (qVar2 != null) {
            synchronized (qVar2) {
                if (qVar2.f1631f) {
                    return false;
                }
                if (qVar2.f1639n < qVar2.f1638m) {
                    if (nanoTime >= qVar2.f1640o) {
                        return false;
                    }
                }
                return true;
            }
        }
        synchronized (this) {
            j2 = nanoTime - this.f1214q;
        }
        if (j2 < 10000000000L || !z2) {
            return true;
        }
        try {
            int soTimeout = socket2.getSoTimeout();
            try {
                socket2.setSoTimeout(1);
                boolean z3 = !qVar.a();
                socket2.setSoTimeout(soTimeout);
                return z3;
            } catch (Throwable th) {
                socket2.setSoTimeout(soTimeout);
                throw th;
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public final O1.e j(s client, O1.g gVar) {
        kotlin.jvm.internal.i.e(client, "client");
        Socket socket = this.f1201d;
        kotlin.jvm.internal.i.b(socket);
        W1.q qVar = this.f1205h;
        kotlin.jvm.internal.i.b(qVar);
        p pVar = this.f1206i;
        kotlin.jvm.internal.i.b(pVar);
        q qVar2 = this.f1204g;
        if (qVar2 != null) {
            return new r(client, this, gVar, qVar2);
        }
        int i2 = gVar.f1244g;
        socket.setSoTimeout(i2);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        qVar.f1895a.d().g(i2, timeUnit);
        pVar.f1892a.d().g(gVar.f1245h, timeUnit);
        return new o(client, this, qVar, pVar);
    }

    public final synchronized void k() {
        this.f1207j = true;
    }

    public final void l() {
        Socket socket = this.f1201d;
        kotlin.jvm.internal.i.b(socket);
        W1.q qVar = this.f1205h;
        kotlin.jvm.internal.i.b(qVar);
        p pVar = this.f1206i;
        kotlin.jvm.internal.i.b(pVar);
        boolean z2 = false;
        socket.setSoTimeout(0);
        M1.d dVar = M1.d.f1096h;
        Q0.c cVar = new Q0.c(dVar);
        String peerName = this.f1199b.f803a.f820h.f907d;
        kotlin.jvm.internal.i.e(peerName, "peerName");
        cVar.f1519b = socket;
        String str = K1.b.f1056f + ' ' + peerName;
        kotlin.jvm.internal.i.e(str, "<set-?>");
        cVar.f1520c = str;
        cVar.f1521d = qVar;
        cVar.f1522e = pVar;
        cVar.f1523f = this;
        q qVar2 = new q(cVar);
        this.f1204g = qVar2;
        D d2 = q.f1625z;
        int i2 = 4;
        this.f1212o = (d2.f1561a & 16) != 0 ? d2.f1562b[4] : Integer.MAX_VALUE;
        z zVar = qVar2.f1647w;
        synchronized (zVar) {
            try {
                if (zVar.f1697d) {
                    throw new IOException("closed");
                }
                Logger logger = z.f1693f;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(K1.b.i(kotlin.jvm.internal.i.h(Q1.g.f1599a.b(), ">> CONNECTION "), new Object[0]));
                }
                p pVar2 = zVar.f1694a;
                W1.j byteString = Q1.g.f1599a;
                pVar2.getClass();
                kotlin.jvm.internal.i.e(byteString, "byteString");
                if (pVar2.f1894c) {
                    throw new IllegalStateException("closed");
                }
                pVar2.f1893b.r(byteString);
                pVar2.a();
                zVar.f1694a.flush();
            } finally {
            }
        }
        z zVar2 = qVar2.f1647w;
        D settings = qVar2.f1641p;
        synchronized (zVar2) {
            try {
                kotlin.jvm.internal.i.e(settings, "settings");
                if (zVar2.f1697d) {
                    throw new IOException("closed");
                }
                zVar2.c(0, Integer.bitCount(settings.f1561a) * 6, 4, 0);
                int i3 = 0;
                while (i3 < 10) {
                    int i4 = i3 + 1;
                    boolean z3 = true;
                    if (((1 << i3) & settings.f1561a) == 0) {
                        z3 = z2;
                    }
                    if (z3) {
                        int i5 = i3 != i2 ? i3 != 7 ? i3 : i2 : 3;
                        p pVar3 = zVar2.f1694a;
                        if (pVar3.f1894c) {
                            throw new IllegalStateException("closed");
                        }
                        W1.g gVar = pVar3.f1893b;
                        W1.r q2 = gVar.q(2);
                        int i6 = q2.f1900c;
                        byte b2 = (byte) ((i5 >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                        byte[] bArr = q2.f1898a;
                        bArr[i6] = b2;
                        bArr[i6 + 1] = (byte) (i5 & KotlinVersion.MAX_COMPONENT_VALUE);
                        q2.f1900c = i6 + 2;
                        gVar.f1875b += 2;
                        pVar3.a();
                        zVar2.f1694a.c(settings.f1562b[i3]);
                    }
                    i3 = i4;
                    z2 = false;
                    i2 = 4;
                }
                zVar2.f1694a.flush();
            } finally {
            }
        }
        if (qVar2.f1641p.a() != 65535) {
            qVar2.f1647w.n(0, r2 - 65535);
        }
        dVar.e().c(new M1.b(qVar2.f1628c, qVar2.f1648x, 0), 0L);
    }

    public final String toString() {
        J1.g gVar;
        StringBuilder sb = new StringBuilder("Connection{");
        A a2 = this.f1199b;
        sb.append(a2.f803a.f820h.f907d);
        sb.append(':');
        sb.append(a2.f803a.f820h.f908e);
        sb.append(", proxy=");
        sb.append(a2.f804b);
        sb.append(" hostAddress=");
        sb.append(a2.f805c);
        sb.append(" cipherSuite=");
        J1.k kVar = this.f1202e;
        Object obj = "none";
        if (kVar != null && (gVar = kVar.f890b) != null) {
            obj = gVar;
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f1203f);
        sb.append('}');
        return sb.toString();
    }
}
