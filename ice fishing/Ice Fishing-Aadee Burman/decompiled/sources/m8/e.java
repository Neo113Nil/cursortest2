package m8;

import com.icefishing.icefishinglive2.AbstractC4404f;
import g1.C4523c;
import i8.C4594a;
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
import q2.C4896n;
import v7.AbstractC5129j;
import x7.C5200a;
import y8.z;

/* loaded from: classes2.dex */
public final class e implements w, n8.e {

    /* renamed from: a, reason: collision with root package name */
    public final l8.d f39327a;

    /* renamed from: b, reason: collision with root package name */
    public final s f39328b;

    /* renamed from: c, reason: collision with root package name */
    public final int f39329c;

    /* renamed from: d, reason: collision with root package name */
    public final int f39330d;

    /* renamed from: e, reason: collision with root package name */
    public final int f39331e;

    /* renamed from: f, reason: collision with root package name */
    public final int f39332f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f39333g;

    /* renamed from: h, reason: collision with root package name */
    public final a f39334h;
    public final t i;

    /* renamed from: j, reason: collision with root package name */
    public final i8.y f39335j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f39336k;

    /* renamed from: l, reason: collision with root package name */
    public final C4896n f39337l;

    /* renamed from: m, reason: collision with root package name */
    public final int f39338m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f39339n;

    /* renamed from: o, reason: collision with root package name */
    public volatile boolean f39340o;

    /* renamed from: p, reason: collision with root package name */
    public Socket f39341p;

    /* renamed from: q, reason: collision with root package name */
    public Socket f39342q;

    /* renamed from: r, reason: collision with root package name */
    public i8.k f39343r;

    /* renamed from: s, reason: collision with root package name */
    public i8.s f39344s;

    /* renamed from: t, reason: collision with root package name */
    public j4.g f39345t;

    /* renamed from: u, reason: collision with root package name */
    public r f39346u;

    public e(l8.d taskRunner, s connectionPool, int i, int i6, int i9, int i10, boolean z3, a user, t routePlanner, i8.y route, ArrayList arrayList, C4896n c4896n, int i11, boolean z6) {
        kotlin.jvm.internal.h.e(taskRunner, "taskRunner");
        kotlin.jvm.internal.h.e(connectionPool, "connectionPool");
        kotlin.jvm.internal.h.e(user, "user");
        kotlin.jvm.internal.h.e(routePlanner, "routePlanner");
        kotlin.jvm.internal.h.e(route, "route");
        this.f39327a = taskRunner;
        this.f39328b = connectionPool;
        this.f39329c = i;
        this.f39330d = i6;
        this.f39331e = i9;
        this.f39332f = i10;
        this.f39333g = z3;
        this.f39334h = user;
        this.i = routePlanner;
        this.f39335j = route;
        this.f39336k = arrayList;
        this.f39337l = c4896n;
        this.f39338m = i11;
        this.f39339n = z6;
    }

    @Override // m8.w
    public final w a() {
        return new e(this.f39327a, this.f39328b, this.f39329c, this.f39330d, this.f39331e, this.f39332f, this.f39333g, this.f39334h, this.i, this.f39335j, this.f39336k, this.f39337l, this.f39338m, this.f39339n);
    }

    @Override // m8.w
    public final r b() {
        a aVar = this.f39334h;
        i8.y route = this.f39335j;
        aVar.getClass();
        kotlin.jvm.internal.h.e(route, "route");
        C4523c c4523c = aVar.f39319a.f39387n.f38219z;
        synchronized (c4523c) {
            ((LinkedHashSet) c4523c.f37627u).remove(route);
        }
        r connection = this.f39346u;
        kotlin.jvm.internal.h.b(connection);
        a aVar2 = this.f39334h;
        i8.y route2 = this.f39335j;
        aVar2.getClass();
        kotlin.jvm.internal.h.e(connection, "connection");
        kotlin.jvm.internal.h.e(route2, "route");
        aVar2.f39320b.getClass();
        q call = aVar2.f39319a;
        kotlin.jvm.internal.h.e(call, "call");
        u c9 = this.i.c(this, this.f39336k);
        if (c9 != null) {
            return c9.f39432a;
        }
        synchronized (connection) {
            s sVar = this.f39328b;
            sVar.getClass();
            TimeZone timeZone = j8.d.f38483a;
            sVar.f39416f.add(connection);
            sVar.f39414d.d(sVar.f39415e, 0L);
            this.f39334h.a(connection);
        }
        this.f39334h.g(connection);
        this.f39334h.h(connection);
        return connection;
    }

    @Override // m8.w
    public final v c() {
        Socket socket;
        Socket socket2;
        i8.y yVar = this.f39335j;
        if (this.f39341p != null) {
            throw new IllegalStateException("TCP already connected");
        }
        a aVar = this.f39334h;
        aVar.b(this);
        boolean z3 = false;
        try {
            try {
                aVar.f(yVar);
                h();
                z3 = true;
                v vVar = new v(this, (Throwable) null, 6);
                aVar.n(this);
                return vVar;
            } catch (IOException e9) {
                yVar.f38262a.getClass();
                Proxy proxy = yVar.f38263b;
                if (proxy.type() != Proxy.Type.DIRECT) {
                    C4594a c4594a = yVar.f38262a;
                    c4594a.f38073g.connectFailed(c4594a.f38074h.g(), proxy.address(), e9);
                }
                aVar.e(yVar, e9);
                v vVar2 = new v(this, e9, 2);
                aVar.n(this);
                if (!z3 && (socket2 = this.f39341p) != null) {
                    j8.d.c(socket2);
                }
                return vVar2;
            }
        } catch (Throwable th) {
            aVar.n(this);
            if (!z3 && (socket = this.f39341p) != null) {
                j8.d.c(socket);
            }
            throw th;
        }
    }

    @Override // m8.w, n8.e
    public final void cancel() {
        this.f39340o = true;
        Socket socket = this.f39341p;
        if (socket != null) {
            j8.d.c(socket);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0145  */
    @Override // m8.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final v e() {
        e eVar;
        e eVar2;
        Socket socket = this.f39341p;
        if (socket == null) {
            throw new IllegalArgumentException("TCP not connected");
        }
        if (isReady()) {
            throw new IllegalStateException("already connected");
        }
        i8.y yVar = this.f39335j;
        C4594a c4594a = yVar.f38262a;
        C4594a c4594a2 = yVar.f38262a;
        List list = c4594a.f38075j;
        a aVar = this.f39334h;
        aVar.b(this);
        e eVar3 = null;
        boolean z3 = false;
        try {
            try {
                if (this.f39337l != null) {
                    v j6 = j();
                    if (j6.f39434b != null || j6.f39435c != null) {
                        aVar.n(this);
                        Socket socket2 = this.f39342q;
                        if (socket2 != null) {
                            j8.d.c(socket2);
                        }
                        j8.d.c(socket);
                        return j6;
                    }
                }
                if (c4594a2.f38069c != null) {
                    j4.g gVar = this.f39345t;
                    if (gVar == null) {
                        kotlin.jvm.internal.h.k("socket");
                        throw null;
                    }
                    if (((y8.r) gVar.f38405v).f41982u.j()) {
                        j4.g gVar2 = this.f39345t;
                        if (gVar2 == null) {
                            kotlin.jvm.internal.h.k("socket");
                            throw null;
                        }
                        if (((y8.p) gVar2.f38406w).f41978u.j()) {
                            aVar.f39319a.getClass();
                            SSLSocketFactory sSLSocketFactory = c4594a2.f38069c;
                            i8.n nVar = c4594a2.f38074h;
                            Socket createSocket = sSLSocketFactory.createSocket(socket, nVar.f38162d, nVar.f38163e, true);
                            kotlin.jvm.internal.h.c(createSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
                            SSLSocket sSLSocket = (SSLSocket) createSocket;
                            e l9 = l(list, sSLSocket);
                            i8.i iVar = (i8.i) list.get(l9.f39338m);
                            eVar = l9.k(list, sSLSocket);
                            try {
                                iVar.a(sSLSocket, l9.f39339n);
                                i(sSLSocket, iVar);
                                aVar.f39319a.getClass();
                                eVar2 = eVar;
                            } catch (IOException e9) {
                                e = e9;
                                aVar.e(yVar, e);
                                if (this.f39333g && !(e instanceof ProtocolException) && !(e instanceof InterruptedIOException) && ((!(e instanceof SSLHandshakeException) || !(e.getCause() instanceof CertificateException)) && !(e instanceof SSLPeerUnverifiedException) && (e instanceof SSLException))) {
                                    eVar3 = eVar;
                                }
                                v vVar = new v(this, eVar3, e);
                                aVar.n(this);
                                if (!z3) {
                                    Socket socket3 = this.f39342q;
                                    if (socket3 != null) {
                                        j8.d.c(socket3);
                                    }
                                    j8.d.c(socket);
                                }
                                return vVar;
                            }
                        }
                    }
                    throw new IOException("TLS tunnel buffered too many bytes!");
                }
                this.f39342q = socket;
                List list2 = c4594a2.i;
                i8.s sVar = i8.s.f38228z;
                if (!list2.contains(sVar)) {
                    sVar = i8.s.f38225w;
                }
                this.f39344s = sVar;
                eVar2 = null;
                try {
                    l8.d dVar = this.f39327a;
                    s sVar2 = this.f39328b;
                    i8.y yVar2 = this.f39335j;
                    Socket socket4 = this.f39342q;
                    kotlin.jvm.internal.h.b(socket4);
                    i8.k kVar = this.f39343r;
                    i8.s sVar3 = this.f39344s;
                    kotlin.jvm.internal.h.b(sVar3);
                    j4.g gVar3 = this.f39345t;
                    if (gVar3 == null) {
                        kotlin.jvm.internal.h.k("socket");
                        throw null;
                    }
                    r rVar = new r(dVar, sVar2, yVar2, socket, socket4, kVar, sVar3, gVar3, this.f39328b.f39411a);
                    this.f39346u = rVar;
                    rVar.i();
                    aVar.c(yVar);
                    try {
                        v vVar2 = new v(this, (Throwable) null, 6);
                        aVar.n(this);
                        return vVar2;
                    } catch (IOException e10) {
                        e = e10;
                        eVar = eVar2;
                        z3 = true;
                        aVar.e(yVar, e);
                        if (this.f39333g) {
                            eVar3 = eVar;
                        }
                        v vVar3 = new v(this, eVar3, e);
                        aVar.n(this);
                        if (!z3) {
                        }
                        return vVar3;
                    } catch (Throwable th) {
                        th = th;
                        z3 = true;
                        aVar.n(this);
                        if (!z3) {
                            Socket socket5 = this.f39342q;
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
    public final void f(q call, IOException iOException) {
        kotlin.jvm.internal.h.e(call, "call");
    }

    @Override // n8.e
    public final i8.y g() {
        return this.f39335j;
    }

    public final void h() {
        Socket createSocket;
        Proxy.Type type = this.f39335j.f38263b.type();
        int i = type == null ? -1 : d.f39326a[type.ordinal()];
        if (i == 1 || i == 2) {
            createSocket = this.f39335j.f38262a.f38068b.createSocket();
            kotlin.jvm.internal.h.b(createSocket);
        } else {
            createSocket = new Socket(this.f39335j.f38263b);
        }
        this.f39341p = createSocket;
        if (this.f39340o) {
            throw new IOException("canceled");
        }
        createSocket.setSoTimeout(this.f39332f);
        try {
            s8.f fVar = s8.f.f40497a;
            s8.f.f40497a.f(createSocket, this.f39335j.f38264c, this.f39331e);
            try {
                this.f39345t = new j4.g(new S0.n(createSocket));
            } catch (NullPointerException e9) {
                if (kotlin.jvm.internal.h.a(e9.getMessage(), "throw with null exception")) {
                    throw new IOException(e9);
                }
            }
        } catch (ConnectException e10) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f39335j.f38264c);
            connectException.initCause(e10);
            throw connectException;
        }
    }

    public final void i(SSLSocket sSLSocket, i8.i iVar) {
        String str;
        i8.s sVar;
        final C4594a c4594a = this.f39335j.f38262a;
        try {
            if (iVar.f38129b) {
                s8.f fVar = s8.f.f40497a;
                s8.f.f40497a.e(sSLSocket, c4594a.f38074h.f38162d, c4594a.i);
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            kotlin.jvm.internal.h.b(session);
            final i8.k g4 = A8.b.g(session);
            w8.c cVar = c4594a.f38070d;
            kotlin.jvm.internal.h.b(cVar);
            if (!cVar.verify(c4594a.f38074h.f38162d, session)) {
                List a9 = g4.a();
                if (a9.isEmpty()) {
                    throw new SSLPeerUnverifiedException("Hostname " + c4594a.f38074h.f38162d + " not verified (no certificates)");
                }
                Object obj = a9.get(0);
                kotlin.jvm.internal.h.c(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                X509Certificate x509Certificate = (X509Certificate) obj;
                StringBuilder sb = new StringBuilder("\n            |Hostname ");
                sb.append(c4594a.f38074h.f38162d);
                sb.append(" not verified:\n            |    certificate: ");
                i8.d dVar = i8.d.f38092c;
                sb.append(d6.c.m(x509Certificate));
                sb.append("\n            |    DN: ");
                sb.append(x509Certificate.getSubjectDN().getName());
                sb.append("\n            |    subjectAltNames: ");
                sb.append(AbstractC5129j.H(w8.c.a(x509Certificate, 7), w8.c.a(x509Certificate, 2)));
                sb.append("\n            ");
                throw new SSLPeerUnverifiedException(Q7.k.I(sb.toString()));
            }
            final i8.d dVar2 = c4594a.f38071e;
            kotlin.jvm.internal.h.b(dVar2);
            this.f39343r = new i8.k(g4.f38145a, g4.f38146b, g4.f38147c, new I7.a() { // from class: m8.c
                @Override // I7.a
                public final Object invoke() {
                    com.bumptech.glide.e eVar = i8.d.this.f38094b;
                    kotlin.jvm.internal.h.b(eVar);
                    return eVar.a(c4594a.f38074h.f38162d, g4.a());
                }
            });
            String hostname = c4594a.f38074h.f38162d;
            kotlin.jvm.internal.h.e(hostname, "hostname");
            Iterator it = dVar2.f38093a.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            if (iVar.f38129b) {
                s8.f fVar2 = s8.f.f40497a;
                str = s8.f.f40497a.g(sSLSocket);
            } else {
                str = null;
            }
            this.f39342q = sSLSocket;
            this.f39345t = new j4.g(new S0.n(sSLSocket));
            if (str != null) {
                i8.s.f38223u.getClass();
                sVar = i8.b.d(str);
            } else {
                sVar = i8.s.f38225w;
            }
            this.f39344s = sVar;
            s8.f fVar3 = s8.f.f40497a;
            s8.f.f40497a.getClass();
        } catch (Throwable th) {
            s8.f fVar4 = s8.f.f40497a;
            s8.f.f40497a.getClass();
            j8.d.c(sSLSocket);
            throw th;
        }
    }

    @Override // m8.w
    public final boolean isReady() {
        return this.f39344s != null;
    }

    public final v j() {
        C4896n c4896n = this.f39337l;
        kotlin.jvm.internal.h.b(c4896n);
        i8.y yVar = this.f39335j;
        String str = "CONNECT " + j8.d.i(yVar.f38262a.f38074h, true) + " HTTP/1.1";
        j4.g gVar = this.f39345t;
        if (gVar == null) {
            kotlin.jvm.internal.h.k("socket");
            throw null;
        }
        o8.g gVar2 = new o8.g(null, this, gVar);
        j4.g gVar3 = this.f39345t;
        if (gVar3 == null) {
            kotlin.jvm.internal.h.k("socket");
            throw null;
        }
        z L6 = ((y8.r) gVar3.f38405v).f41981n.L();
        long j6 = this.f39329c;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        L6.g(j6);
        j4.g gVar4 = this.f39345t;
        if (gVar4 == null) {
            kotlin.jvm.internal.h.k("socket");
            throw null;
        }
        ((y8.p) gVar4.f38406w).f41977n.L().g(this.f39330d);
        gVar2.l((i8.l) c4896n.f40191w, str);
        gVar2.a();
        i8.u e9 = gVar2.e(false);
        kotlin.jvm.internal.h.b(e9);
        e9.f38230a = c4896n;
        i8.v a9 = e9.a();
        long f3 = j8.d.f(a9);
        if (f3 != -1) {
            o8.d k9 = gVar2.k((i8.n) a9.f38252n.f40189u, f3);
            j8.d.g(k9, Integer.MAX_VALUE);
            k9.close();
        }
        int i = a9.f38255w;
        if (i == 200) {
            return new v(this, (Throwable) null, 6);
        }
        if (i != 407) {
            throw new IOException(AbstractC4404f.e(i, "Unexpected response code for CONNECT: "));
        }
        yVar.f38262a.f38072f.getClass();
        throw new IOException("Failed to authenticate with proxy");
    }

    public final e k(List connectionSpecs, SSLSocket sSLSocket) {
        kotlin.jvm.internal.h.e(connectionSpecs, "connectionSpecs");
        int i = this.f39338m;
        int size = connectionSpecs.size();
        for (int i6 = i + 1; i6 < size; i6++) {
            i8.i iVar = (i8.i) connectionSpecs.get(i6);
            iVar.getClass();
            if (iVar.f38128a) {
                String[] strArr = iVar.f38131d;
                if (strArr != null) {
                    if (!j8.c.d(C5200a.f41772u, strArr, sSLSocket.getEnabledProtocols())) {
                        continue;
                    }
                }
                String[] strArr2 = iVar.f38130c;
                if (strArr2 != null) {
                    if (!j8.c.d(i8.f.f38096c, strArr2, sSLSocket.getEnabledCipherSuites())) {
                    }
                }
                boolean z3 = i != -1;
                return new e(this.f39327a, this.f39328b, this.f39329c, this.f39330d, this.f39331e, this.f39332f, this.f39333g, this.f39334h, this.i, this.f39335j, this.f39336k, this.f39337l, i6, z3);
            }
        }
        return null;
    }

    public final e l(List connectionSpecs, SSLSocket sSLSocket) {
        kotlin.jvm.internal.h.e(connectionSpecs, "connectionSpecs");
        if (this.f39338m != -1) {
            return this;
        }
        e k9 = k(connectionSpecs, sSLSocket);
        if (k9 != null) {
            return k9;
        }
        StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
        sb.append(this.f39339n);
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
