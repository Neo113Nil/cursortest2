package m8;

import a.AbstractC0426a;
import com.google.android.gms.internal.ads.Wv;
import i1.C4586c;
import i8.C4603a;
import i8.y;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import s2.C4945n;
import v7.AbstractC5119j;
import x7.C5195a;
import y8.z;

/* loaded from: classes2.dex */
public final class e implements v, n8.e {

    /* renamed from: a, reason: collision with root package name */
    public final l8.d f39486a;

    /* renamed from: b, reason: collision with root package name */
    public final r f39487b;

    /* renamed from: c, reason: collision with root package name */
    public final int f39488c;

    /* renamed from: d, reason: collision with root package name */
    public final int f39489d;

    /* renamed from: e, reason: collision with root package name */
    public final int f39490e;

    /* renamed from: f, reason: collision with root package name */
    public final int f39491f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f39492g;

    /* renamed from: h, reason: collision with root package name */
    public final a f39493h;
    public final s i;

    /* renamed from: j, reason: collision with root package name */
    public final y f39494j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f39495k;

    /* renamed from: l, reason: collision with root package name */
    public final C4945n f39496l;

    /* renamed from: m, reason: collision with root package name */
    public final int f39497m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f39498n;

    /* renamed from: o, reason: collision with root package name */
    public volatile boolean f39499o;

    /* renamed from: p, reason: collision with root package name */
    public Socket f39500p;

    /* renamed from: q, reason: collision with root package name */
    public Socket f39501q;

    /* renamed from: r, reason: collision with root package name */
    public i8.k f39502r;

    /* renamed from: s, reason: collision with root package name */
    public i8.s f39503s;

    /* renamed from: t, reason: collision with root package name */
    public l4.g f39504t;

    /* renamed from: u, reason: collision with root package name */
    public q f39505u;

    public e(l8.d taskRunner, r connectionPool, int i, int i4, int i6, int i9, boolean z6, a user, s routePlanner, y route, ArrayList arrayList, C4945n c4945n, int i10, boolean z9) {
        kotlin.jvm.internal.h.e(taskRunner, "taskRunner");
        kotlin.jvm.internal.h.e(connectionPool, "connectionPool");
        kotlin.jvm.internal.h.e(user, "user");
        kotlin.jvm.internal.h.e(routePlanner, "routePlanner");
        kotlin.jvm.internal.h.e(route, "route");
        this.f39486a = taskRunner;
        this.f39487b = connectionPool;
        this.f39488c = i;
        this.f39489d = i4;
        this.f39490e = i6;
        this.f39491f = i9;
        this.f39492g = z6;
        this.f39493h = user;
        this.i = routePlanner;
        this.f39494j = route;
        this.f39495k = arrayList;
        this.f39496l = c4945n;
        this.f39497m = i10;
        this.f39498n = z9;
    }

    @Override // m8.v
    public final v a() {
        return new e(this.f39486a, this.f39487b, this.f39488c, this.f39489d, this.f39490e, this.f39491f, this.f39492g, this.f39493h, this.i, this.f39494j, this.f39495k, this.f39496l, this.f39497m, this.f39498n);
    }

    @Override // m8.v
    public final q b() {
        a aVar = this.f39493h;
        y route = this.f39494j;
        aVar.getClass();
        kotlin.jvm.internal.h.e(route, "route");
        C4586c c4586c = aVar.f39478a.f39544n.f38338z;
        synchronized (c4586c) {
            ((LinkedHashSet) c4586c.f38154u).remove(route);
        }
        q connection = this.f39505u;
        kotlin.jvm.internal.h.b(connection);
        a aVar2 = this.f39493h;
        y route2 = this.f39494j;
        aVar2.getClass();
        kotlin.jvm.internal.h.e(connection, "connection");
        kotlin.jvm.internal.h.e(route2, "route");
        aVar2.f39479b.getClass();
        p call = aVar2.f39478a;
        kotlin.jvm.internal.h.e(call, "call");
        t c9 = this.i.c(this, this.f39495k);
        if (c9 != null) {
            return c9.f39589a;
        }
        synchronized (connection) {
            r rVar = this.f39487b;
            rVar.getClass();
            TimeZone timeZone = j8.d.f38495a;
            rVar.f39573f.add(connection);
            rVar.f39571d.d(rVar.f39572e, 0L);
            this.f39493h.a(connection);
        }
        this.f39493h.g(connection);
        this.f39493h.h(connection);
        return connection;
    }

    @Override // m8.v
    public final u c() {
        Socket socket;
        Socket socket2;
        y yVar = this.f39494j;
        if (this.f39500p != null) {
            throw new IllegalStateException("TCP already connected");
        }
        a aVar = this.f39493h;
        aVar.b(this);
        boolean z6 = false;
        try {
            try {
                aVar.f(yVar);
                h();
                z6 = true;
                u uVar = new u(this, (Throwable) null, 6);
                aVar.n(this);
                return uVar;
            } catch (IOException e9) {
                yVar.f38381a.getClass();
                Proxy proxy = yVar.f38382b;
                if (proxy.type() != Proxy.Type.DIRECT) {
                    C4603a c4603a = yVar.f38381a;
                    c4603a.f38192g.connectFailed(c4603a.f38193h.g(), proxy.address(), e9);
                }
                aVar.e(yVar, e9);
                u uVar2 = new u(this, e9, 2);
                aVar.n(this);
                if (!z6 && (socket2 = this.f39500p) != null) {
                    j8.d.c(socket2);
                }
                return uVar2;
            }
        } catch (Throwable th) {
            aVar.n(this);
            if (!z6 && (socket = this.f39500p) != null) {
                j8.d.c(socket);
            }
            throw th;
        }
    }

    @Override // m8.v, n8.e
    public final void cancel() {
        this.f39499o = true;
        Socket socket = this.f39500p;
        if (socket != null) {
            j8.d.c(socket);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0145  */
    @Override // m8.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final u e() {
        e eVar;
        e eVar2;
        Socket socket = this.f39500p;
        if (socket == null) {
            throw new IllegalArgumentException("TCP not connected");
        }
        if (isReady()) {
            throw new IllegalStateException("already connected");
        }
        y yVar = this.f39494j;
        C4603a c4603a = yVar.f38381a;
        C4603a c4603a2 = yVar.f38381a;
        List list = c4603a.f38194j;
        a aVar = this.f39493h;
        aVar.b(this);
        e eVar3 = null;
        boolean z6 = false;
        try {
            try {
                if (this.f39496l != null) {
                    u j6 = j();
                    if (j6.f39591b != null || j6.f39592c != null) {
                        aVar.n(this);
                        Socket socket2 = this.f39501q;
                        if (socket2 != null) {
                            j8.d.c(socket2);
                        }
                        j8.d.c(socket);
                        return j6;
                    }
                }
                if (c4603a2.f38188c != null) {
                    l4.g gVar = this.f39504t;
                    if (gVar == null) {
                        kotlin.jvm.internal.h.k("socket");
                        throw null;
                    }
                    if (((y8.r) gVar.f38917v).f41956u.j()) {
                        l4.g gVar2 = this.f39504t;
                        if (gVar2 == null) {
                            kotlin.jvm.internal.h.k("socket");
                            throw null;
                        }
                        if (((y8.p) gVar2.f38918w).f41952u.j()) {
                            aVar.f39478a.getClass();
                            SSLSocketFactory sSLSocketFactory = c4603a2.f38188c;
                            i8.n nVar = c4603a2.f38193h;
                            Socket createSocket = sSLSocketFactory.createSocket(socket, nVar.f38281d, nVar.f38282e, true);
                            kotlin.jvm.internal.h.c(createSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
                            SSLSocket sSLSocket = (SSLSocket) createSocket;
                            e l9 = l(list, sSLSocket);
                            i8.i iVar = (i8.i) list.get(l9.f39497m);
                            eVar = l9.k(list, sSLSocket);
                            try {
                                iVar.a(sSLSocket, l9.f39498n);
                                i(sSLSocket, iVar);
                                aVar.f39478a.getClass();
                                eVar2 = eVar;
                            } catch (IOException e9) {
                                e = e9;
                                aVar.e(yVar, e);
                                if (this.f39492g && !(e instanceof ProtocolException) && !(e instanceof InterruptedIOException) && ((!(e instanceof SSLHandshakeException) || !(e.getCause() instanceof CertificateException)) && !(e instanceof SSLPeerUnverifiedException) && (e instanceof SSLException))) {
                                    eVar3 = eVar;
                                }
                                u uVar = new u(this, eVar3, e);
                                aVar.n(this);
                                if (!z6) {
                                    Socket socket3 = this.f39501q;
                                    if (socket3 != null) {
                                        j8.d.c(socket3);
                                    }
                                    j8.d.c(socket);
                                }
                                return uVar;
                            }
                        }
                    }
                    throw new IOException("TLS tunnel buffered too many bytes!");
                }
                this.f39501q = socket;
                List list2 = c4603a2.i;
                i8.s sVar = i8.s.f38347z;
                if (!list2.contains(sVar)) {
                    sVar = i8.s.f38344w;
                }
                this.f39503s = sVar;
                eVar2 = null;
                try {
                    l8.d dVar = this.f39486a;
                    r rVar = this.f39487b;
                    y yVar2 = this.f39494j;
                    Socket socket4 = this.f39501q;
                    kotlin.jvm.internal.h.b(socket4);
                    i8.k kVar = this.f39502r;
                    i8.s sVar2 = this.f39503s;
                    kotlin.jvm.internal.h.b(sVar2);
                    l4.g gVar3 = this.f39504t;
                    if (gVar3 == null) {
                        kotlin.jvm.internal.h.k("socket");
                        throw null;
                    }
                    q qVar = new q(dVar, rVar, yVar2, socket, socket4, kVar, sVar2, gVar3, this.f39487b.f39568a);
                    this.f39505u = qVar;
                    qVar.i();
                    aVar.c(yVar);
                    try {
                        u uVar2 = new u(this, (Throwable) null, 6);
                        aVar.n(this);
                        return uVar2;
                    } catch (IOException e10) {
                        e = e10;
                        eVar = eVar2;
                        z6 = true;
                        aVar.e(yVar, e);
                        if (this.f39492g) {
                            eVar3 = eVar;
                        }
                        u uVar3 = new u(this, eVar3, e);
                        aVar.n(this);
                        if (!z6) {
                        }
                        return uVar3;
                    } catch (Throwable th) {
                        th = th;
                        z6 = true;
                        aVar.n(this);
                        if (!z6) {
                            Socket socket5 = this.f39501q;
                            if (socket5 != null) {
                                j8.d.c(socket5);
                            }
                            j8.d.c(socket);
                        }
                        throw th;
                    }
                } catch (IOException e11) {
                    e = e11;
                    eVar = eVar2;
                }
            } catch (IOException e12) {
                e = e12;
                eVar = null;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // n8.e
    public final void f(p call, IOException iOException) {
        kotlin.jvm.internal.h.e(call, "call");
    }

    @Override // n8.e
    public final y g() {
        return this.f39494j;
    }

    public final void h() {
        Socket createSocket;
        Proxy.Type type = this.f39494j.f38382b.type();
        int i = type == null ? -1 : d.f39485a[type.ordinal()];
        if (i == 1 || i == 2) {
            createSocket = this.f39494j.f38381a.f38187b.createSocket();
            kotlin.jvm.internal.h.b(createSocket);
        } else {
            createSocket = new Socket(this.f39494j.f38382b);
        }
        this.f39500p = createSocket;
        if (this.f39499o) {
            throw new IOException("canceled");
        }
        createSocket.setSoTimeout(this.f39491f);
        try {
            s8.f fVar = s8.f.f40554a;
            s8.f.f40554a.f(createSocket, this.f39494j.f38383c, this.f39490e);
            try {
                this.f39504t = new l4.g(new S0.n(createSocket));
            } catch (NullPointerException e9) {
                if (kotlin.jvm.internal.h.a(e9.getMessage(), "throw with null exception")) {
                    throw new IOException(e9);
                }
            }
        } catch (ConnectException e10) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f39494j.f38383c);
            connectException.initCause(e10);
            throw connectException;
        }
    }

    public final void i(SSLSocket sSLSocket, i8.i iVar) {
        String str;
        i8.s sVar;
        final C4603a c4603a = this.f39494j.f38381a;
        try {
            if (iVar.f38248b) {
                s8.f fVar = s8.f.f40554a;
                s8.f.f40554a.e(sSLSocket, c4603a.f38193h.f38281d, c4603a.i);
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            kotlin.jvm.internal.h.b(session);
            final i8.k j6 = A8.b.j(session);
            w8.c cVar = c4603a.f38189d;
            kotlin.jvm.internal.h.b(cVar);
            if (!cVar.verify(c4603a.f38193h.f38281d, session)) {
                List a9 = j6.a();
                if (a9.isEmpty()) {
                    throw new SSLPeerUnverifiedException("Hostname " + c4603a.f38193h.f38281d + " not verified (no certificates)");
                }
                Object obj = a9.get(0);
                kotlin.jvm.internal.h.c(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                X509Certificate x509Certificate = (X509Certificate) obj;
                StringBuilder sb = new StringBuilder("\n            |Hostname ");
                sb.append(c4603a.f38193h.f38281d);
                sb.append(" not verified:\n            |    certificate: ");
                i8.d dVar = i8.d.f38211c;
                sb.append(d6.c.i(x509Certificate));
                sb.append("\n            |    DN: ");
                sb.append(x509Certificate.getSubjectDN().getName());
                sb.append("\n            |    subjectAltNames: ");
                sb.append(AbstractC5119j.F(w8.c.a(x509Certificate, 7), w8.c.a(x509Certificate, 2)));
                sb.append("\n            ");
                throw new SSLPeerUnverifiedException(Q7.k.Y(sb.toString()));
            }
            final i8.d dVar2 = c4603a.f38190e;
            kotlin.jvm.internal.h.b(dVar2);
            this.f39502r = new i8.k(j6.f38264a, j6.f38265b, j6.f38266c, new I7.a() { // from class: m8.c
                @Override // I7.a
                public final Object invoke() {
                    AbstractC0426a abstractC0426a = i8.d.this.f38213b;
                    kotlin.jvm.internal.h.b(abstractC0426a);
                    return abstractC0426a.d(c4603a.f38193h.f38281d, j6.a());
                }
            });
            String hostname = c4603a.f38193h.f38281d;
            kotlin.jvm.internal.h.e(hostname, "hostname");
            Iterator it = dVar2.f38212a.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            if (iVar.f38248b) {
                s8.f fVar2 = s8.f.f40554a;
                str = s8.f.f40554a.g(sSLSocket);
            } else {
                str = null;
            }
            this.f39501q = sSLSocket;
            this.f39504t = new l4.g(new S0.n(sSLSocket));
            if (str != null) {
                i8.s.f38342u.getClass();
                sVar = i8.b.d(str);
            } else {
                sVar = i8.s.f38344w;
            }
            this.f39503s = sVar;
            s8.f fVar3 = s8.f.f40554a;
            s8.f.f40554a.getClass();
        } catch (Throwable th) {
            s8.f fVar4 = s8.f.f40554a;
            s8.f.f40554a.getClass();
            j8.d.c(sSLSocket);
            throw th;
        }
    }

    @Override // m8.v
    public final boolean isReady() {
        return this.f39503s != null;
    }

    public final u j() {
        C4945n c4945n = this.f39496l;
        kotlin.jvm.internal.h.b(c4945n);
        y yVar = this.f39494j;
        String str = "CONNECT " + j8.d.i(yVar.f38381a.f38193h, true) + " HTTP/1.1";
        l4.g gVar = this.f39504t;
        if (gVar == null) {
            kotlin.jvm.internal.h.k("socket");
            throw null;
        }
        o8.g gVar2 = new o8.g(null, this, gVar);
        l4.g gVar3 = this.f39504t;
        if (gVar3 == null) {
            kotlin.jvm.internal.h.k("socket");
            throw null;
        }
        z L2 = ((y8.r) gVar3.f38917v).f41955n.L();
        long j6 = this.f39488c;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        L2.g(j6);
        l4.g gVar4 = this.f39504t;
        if (gVar4 == null) {
            kotlin.jvm.internal.h.k("socket");
            throw null;
        }
        ((y8.p) gVar4.f38918w).f41951n.L().g(this.f39489d);
        gVar2.l((i8.l) c4945n.f40493w, str);
        gVar2.b();
        i8.u f2 = gVar2.f(false);
        kotlin.jvm.internal.h.b(f2);
        f2.f38349a = c4945n;
        i8.v a9 = f2.a();
        long f9 = j8.d.f(a9);
        if (f9 != -1) {
            o8.d k9 = gVar2.k((i8.n) a9.f38371n.f40491u, f9);
            j8.d.g(k9, Integer.MAX_VALUE);
            k9.close();
        }
        int i = a9.f38374w;
        if (i == 200) {
            return new u(this, (Throwable) null, 6);
        }
        if (i != 407) {
            throw new IOException(Wv.f(i, "Unexpected response code for CONNECT: "));
        }
        yVar.f38381a.f38191f.getClass();
        throw new IOException("Failed to authenticate with proxy");
    }

    public final e k(List connectionSpecs, SSLSocket sSLSocket) {
        kotlin.jvm.internal.h.e(connectionSpecs, "connectionSpecs");
        int i = this.f39497m;
        int size = connectionSpecs.size();
        for (int i4 = i + 1; i4 < size; i4++) {
            i8.i iVar = (i8.i) connectionSpecs.get(i4);
            iVar.getClass();
            if (iVar.f38247a) {
                String[] strArr = iVar.f38250d;
                if (strArr != null) {
                    if (!j8.c.d(C5195a.f41885u, strArr, sSLSocket.getEnabledProtocols())) {
                        continue;
                    }
                }
                String[] strArr2 = iVar.f38249c;
                if (strArr2 != null) {
                    if (!j8.c.d(i8.f.f38215c, strArr2, sSLSocket.getEnabledCipherSuites())) {
                    }
                }
                boolean z6 = i != -1;
                return new e(this.f39486a, this.f39487b, this.f39488c, this.f39489d, this.f39490e, this.f39491f, this.f39492g, this.f39493h, this.i, this.f39494j, this.f39495k, this.f39496l, i4, z6);
            }
        }
        return null;
    }

    public final e l(List connectionSpecs, SSLSocket sSLSocket) {
        kotlin.jvm.internal.h.e(connectionSpecs, "connectionSpecs");
        if (this.f39497m != -1) {
            return this;
        }
        e k9 = k(connectionSpecs, sSLSocket);
        if (k9 != null) {
            return k9;
        }
        StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
        sb.append(this.f39498n);
        sb.append(", modes=");
        sb.append(connectionSpecs);
        sb.append(", supported protocols=");
        String[] enabledProtocols = sSLSocket.getEnabledProtocols();
        kotlin.jvm.internal.h.b(enabledProtocols);
        String arrays = Arrays.toString(enabledProtocols);
        kotlin.jvm.internal.h.d(arrays, "toString(...)");
        sb.append(arrays);
        throw new UnknownServiceException(sb.toString());
    }

    @Override // n8.e
    public final void d() {
    }
}
