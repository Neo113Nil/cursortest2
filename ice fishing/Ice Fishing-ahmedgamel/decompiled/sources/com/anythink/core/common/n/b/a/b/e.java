package com.anythink.core.common.n.b.a.b;

import D.y;
import com.anythink.core.common.n.b.C0546a;
import com.anythink.core.common.n.b.a.e.f;
import com.anythink.core.common.n.b.a.k.a;
import com.anythink.core.common.n.b.aa;
import com.anythink.core.common.n.b.ab;
import com.anythink.core.common.n.b.ad;
import com.anythink.core.common.n.b.ae;
import com.anythink.core.common.n.b.af;
import com.anythink.core.common.n.b.ah;
import com.anythink.core.common.n.b.l;
import com.anythink.core.common.n.b.t;
import com.anythink.core.common.n.b.v;
import com.anythink.core.common.n.b.w;
import com.anythink.core.common.n.b.z;
import com.anythink.core.common.n.c.n;
import com.anythink.core.common.n.c.x;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class e extends f.c implements com.anythink.core.common.n.b.j {

    /* renamed from: g, reason: collision with root package name */
    static final /* synthetic */ boolean f14978g = true;
    private static final String i = "throw with null exception";

    /* renamed from: j, reason: collision with root package name */
    private static final int f14979j = 21;

    /* renamed from: a, reason: collision with root package name */
    public final f f14980a;

    /* renamed from: b, reason: collision with root package name */
    boolean f14981b;

    /* renamed from: c, reason: collision with root package name */
    int f14982c;

    /* renamed from: d, reason: collision with root package name */
    int f14983d;

    /* renamed from: k, reason: collision with root package name */
    private final ah f14986k;

    /* renamed from: l, reason: collision with root package name */
    private Socket f14987l;

    /* renamed from: m, reason: collision with root package name */
    private Socket f14988m;

    /* renamed from: n, reason: collision with root package name */
    private t f14989n;

    /* renamed from: o, reason: collision with root package name */
    private ab f14990o;

    /* renamed from: p, reason: collision with root package name */
    private com.anythink.core.common.n.b.a.e.f f14991p;

    /* renamed from: q, reason: collision with root package name */
    private com.anythink.core.common.n.c.e f14992q;

    /* renamed from: r, reason: collision with root package name */
    private com.anythink.core.common.n.c.d f14993r;

    /* renamed from: s, reason: collision with root package name */
    private int f14994s;

    /* renamed from: t, reason: collision with root package name */
    private int f14995t = 1;

    /* renamed from: e, reason: collision with root package name */
    final List<Reference<j>> f14984e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    long f14985f = Long.MAX_VALUE;

    public e(f fVar, ah ahVar) {
        this.f14980a = fVar;
        this.f14986k = ahVar;
    }

    private static e a(f fVar, ah ahVar, Socket socket, long j6) {
        e eVar = new e(fVar, ahVar);
        eVar.f14988m = socket;
        eVar.f14985f = j6;
        return eVar;
    }

    private ad h() {
        ad b9 = new ad.a().a(this.f14986k.a().a()).a("CONNECT", (ae) null).a("Host", com.anythink.core.common.n.b.a.c.a(this.f14986k.a().a(), true)).a("Proxy-Connection", com.anythink.expressad.foundation.g.f.g.b.f19340c).b();
        ad authenticate = this.f14986k.a().d().authenticate(this.f14986k, new af.a().a(b9).a(ab.HTTP_1_1).a(407).a("Preemptive Authenticate").a(com.anythink.core.common.n.b.a.c.f15039d).a(-1L).b(-1L).a("Proxy-Authenticate", aa.f15462a + "-Preemptive").a());
        return authenticate != null ? authenticate : b9;
    }

    @Override // com.anythink.core.common.n.b.j
    public final Socket b() {
        return this.f14988m;
    }

    @Override // com.anythink.core.common.n.b.j
    public final t c() {
        return this.f14989n;
    }

    @Override // com.anythink.core.common.n.b.j
    public final ab d() {
        return this.f14990o;
    }

    public final void e() {
        if (!f14978g && Thread.holdsLock(this.f14980a)) {
            throw new AssertionError();
        }
        synchronized (this.f14980a) {
            this.f14981b = true;
        }
    }

    public final void f() {
        com.anythink.core.common.n.b.a.c.a(this.f14987l);
    }

    public final boolean g() {
        return this.f14991p != null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Connection{");
        sb.append(this.f14986k.a().a().f());
        sb.append(":");
        sb.append(this.f14986k.a().a().g());
        sb.append(", proxy=");
        sb.append(this.f14986k.b());
        sb.append(" hostAddress=");
        sb.append(this.f14986k.c());
        sb.append(" cipherSuite=");
        t tVar = this.f14989n;
        sb.append(tVar != null ? tVar.b() : "none");
        sb.append(" protocol=");
        sb.append(this.f14990o);
        sb.append('}');
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ff A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(int i6, int i9, int i10, int i11, boolean z3) {
        if (this.f14990o == null) {
            List<l> f3 = this.f14986k.a().f();
            b bVar = new b(f3);
            if (this.f14986k.a().i() == null) {
                if (f3.contains(l.f15669d)) {
                    String f9 = this.f14986k.a().a().f();
                    if (!com.anythink.core.common.n.b.a.g.c.e().b(f9)) {
                        throw new h(new UnknownServiceException(y.o("CLEARTEXT communication to ", f9, " not permitted by network security policy")));
                    }
                } else {
                    throw new h(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
                }
            } else if (this.f14986k.a().e().contains(ab.H2_PRIOR_KNOWLEDGE)) {
                throw new h(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
            }
            h hVar = null;
            do {
                try {
                    if (this.f14986k.d()) {
                        a(i6, i9, i10);
                        if (this.f14987l == null) {
                            if (!this.f14986k.d() && this.f14987l == null) {
                                throw new h(new ProtocolException("Too many tunnel connections attempted: 21"));
                            }
                            if (this.f14991p == null) {
                                synchronized (this.f14980a) {
                                    this.f14995t = this.f14991p.a();
                                }
                                return;
                            }
                            return;
                        }
                    } else {
                        a(i6, i9);
                    }
                    if (this.f14986k.a().i() == null) {
                        List<ab> e9 = this.f14986k.a().e();
                        ab abVar = ab.H2_PRIOR_KNOWLEDGE;
                        if (e9.contains(abVar)) {
                            this.f14988m = this.f14987l;
                            this.f14990o = abVar;
                            a(i11);
                        } else {
                            this.f14988m = this.f14987l;
                            this.f14990o = ab.HTTP_1_1;
                        }
                    } else {
                        a(bVar);
                        if (this.f14990o == ab.HTTP_2) {
                            a(i11);
                        }
                    }
                    this.f14986k.c();
                    this.f14986k.b();
                    if (!this.f14986k.d()) {
                    }
                    if (this.f14991p == null) {
                    }
                } catch (IOException e10) {
                    com.anythink.core.common.n.b.a.c.a(this.f14988m);
                    com.anythink.core.common.n.b.a.c.a(this.f14987l);
                    this.f14988m = null;
                    this.f14987l = null;
                    this.f14992q = null;
                    this.f14993r = null;
                    this.f14989n = null;
                    this.f14990o = null;
                    this.f14991p = null;
                    this.f14986k.c();
                    this.f14986k.b();
                    if (hVar == null) {
                        hVar = new h(e10);
                    } else {
                        hVar.a(e10);
                    }
                    if (!z3) {
                        throw hVar;
                    }
                }
            } while (bVar.a(e10));
            throw hVar;
        }
        throw new IllegalStateException("already connected");
    }

    private void a(int i6, int i9) {
        Socket createSocket;
        Proxy b9 = this.f14986k.b();
        C0546a a9 = this.f14986k.a();
        if (b9.type() != Proxy.Type.DIRECT && b9.type() != Proxy.Type.HTTP) {
            createSocket = new Socket(b9);
        } else {
            createSocket = a9.c().createSocket();
        }
        this.f14987l = createSocket;
        this.f14986k.c();
        this.f14987l.setSoTimeout(i9);
        try {
            com.anythink.core.common.n.b.a.g.c.e().a(this.f14987l, this.f14986k.c(), i6);
            try {
                this.f14992q = n.a(n.b(this.f14987l));
                this.f14993r = n.a(n.a(this.f14987l));
            } catch (NullPointerException e9) {
                if (i.equals(e9.getMessage())) {
                    throw new IOException(e9);
                }
            }
        } catch (ConnectException e10) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f14986k.c());
            connectException.initCause(e10);
            throw connectException;
        }
    }

    private void a(b bVar, int i6) {
        if (this.f14986k.a().i() == null) {
            List<ab> e9 = this.f14986k.a().e();
            ab abVar = ab.H2_PRIOR_KNOWLEDGE;
            if (e9.contains(abVar)) {
                this.f14988m = this.f14987l;
                this.f14990o = abVar;
                a(i6);
                return;
            } else {
                this.f14988m = this.f14987l;
                this.f14990o = ab.HTTP_1_1;
                return;
            }
        }
        a(bVar);
        if (this.f14990o == ab.HTTP_2) {
            a(i6);
        }
    }

    private void a(int i6) {
        this.f14988m.setSoTimeout(0);
        com.anythink.core.common.n.b.a.e.f a9 = new f.a().a(this.f14988m, this.f14986k.a().a().f(), this.f14992q, this.f14993r).a(this).a(i6).a();
        this.f14991p = a9;
        a9.b();
    }

    private void a(b bVar) {
        SSLSocket sSLSocket;
        ab abVar;
        C0546a a9 = this.f14986k.a();
        SSLSocket sSLSocket2 = null;
        try {
            try {
                sSLSocket = (SSLSocket) a9.i().createSocket(this.f14987l, a9.a().f(), a9.a().g(), true);
            } catch (Throwable th) {
                th = th;
            }
        } catch (AssertionError e9) {
            e = e9;
        }
        try {
            l a10 = bVar.a(sSLSocket);
            if (a10.a()) {
                com.anythink.core.common.n.b.a.g.c.e().a(sSLSocket, a9.a().f(), a9.e());
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            t a11 = t.a(session);
            if (!a9.j().verify(a9.a().f(), session)) {
                List<Certificate> c9 = a11.c();
                if (!c9.isEmpty()) {
                    X509Certificate x509Certificate = (X509Certificate) c9.get(0);
                    throw new SSLPeerUnverifiedException("Hostname " + a9.a().f() + " not verified:\n    certificate: " + com.anythink.core.common.n.b.g.a((Certificate) x509Certificate) + "\n    DN: " + x509Certificate.getSubjectDN().getName() + "\n    subjectAltNames: " + com.anythink.core.common.n.b.a.j.e.a(x509Certificate));
                }
                throw new SSLPeerUnverifiedException("Hostname " + a9.a().f() + " not verified (no certificates)");
            }
            a9.k().a(a9.a().f(), a11.c());
            String a12 = a10.a() ? com.anythink.core.common.n.b.a.g.c.e().a(sSLSocket) : null;
            this.f14988m = sSLSocket;
            this.f14992q = n.a(n.b(sSLSocket));
            this.f14993r = n.a(n.a(this.f14988m));
            this.f14989n = a11;
            if (a12 != null) {
                abVar = ab.a(a12);
            } else {
                abVar = ab.HTTP_1_1;
            }
            this.f14990o = abVar;
            com.anythink.core.common.n.b.a.g.c.e();
        } catch (AssertionError e10) {
            e = e10;
            if (!com.anythink.core.common.n.b.a.c.a(e)) {
                throw e;
            }
            throw new IOException(e);
        } catch (Throwable th2) {
            th = th2;
            sSLSocket2 = sSLSocket;
            if (sSLSocket2 != null) {
                com.anythink.core.common.n.b.a.g.c.e();
            }
            com.anythink.core.common.n.b.a.c.a((Socket) sSLSocket2);
            throw th;
        }
    }

    private ad a(int i6, int i9, ad adVar, v vVar) {
        String str = "CONNECT " + com.anythink.core.common.n.b.a.c.a(vVar, true) + " HTTP/1.1";
        while (true) {
            com.anythink.core.common.n.b.a.d.a aVar = new com.anythink.core.common.n.b.a.d.a(null, null, this.f14992q, this.f14993r);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f14992q.a().a(i6, timeUnit);
            this.f14993r.a().a(i9, timeUnit);
            aVar.a(adVar.c(), str);
            aVar.c();
            af a9 = aVar.a(false).a(adVar).a();
            aVar.c(a9);
            int c9 = a9.c();
            if (c9 == 200) {
                if (this.f14992q.d().g() && this.f14993r.c().g()) {
                    return null;
                }
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
            if (c9 == 407) {
                ad authenticate = this.f14986k.a().d().authenticate(this.f14986k, a9);
                if (authenticate != null) {
                    if (com.anythink.expressad.foundation.d.d.cs.equalsIgnoreCase(a9.a("Connection"))) {
                        return authenticate;
                    }
                    adVar = authenticate;
                } else {
                    throw new IOException("Failed to authenticate with proxy");
                }
            } else {
                throw new IOException("Unexpected response code for CONNECT: " + a9.c());
            }
        }
    }

    public final boolean a(C0546a c0546a, List<ah> list) {
        if (this.f14984e.size() >= this.f14995t || this.f14981b || !com.anythink.core.common.n.b.a.a.f14869a.a(this.f14986k.a(), c0546a)) {
            return false;
        }
        if (c0546a.a().f().equals(this.f14986k.a().a().f())) {
            return true;
        }
        if (this.f14991p != null && list != null) {
            int size = list.size();
            for (int i6 = 0; i6 < size; i6++) {
                ah ahVar = list.get(i6);
                Proxy.Type type = ahVar.b().type();
                Proxy.Type type2 = Proxy.Type.DIRECT;
                if (type == type2 && this.f14986k.b().type() == type2 && this.f14986k.c().equals(ahVar.c())) {
                    if (c0546a.j() != com.anythink.core.common.n.b.a.j.e.f15375a || !a(c0546a.a())) {
                        return false;
                    }
                    try {
                        c0546a.k().a(c0546a.a().f(), this.f14989n.c());
                        return true;
                    } catch (SSLPeerUnverifiedException unused) {
                        return false;
                    }
                }
            }
        }
        return false;
    }

    private boolean a(List<ah> list) {
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            ah ahVar = list.get(i6);
            Proxy.Type type = ahVar.b().type();
            Proxy.Type type2 = Proxy.Type.DIRECT;
            if (type == type2 && this.f14986k.b().type() == type2 && this.f14986k.c().equals(ahVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final boolean a(v vVar) {
        if (vVar.g() != this.f14986k.a().a().g()) {
            return false;
        }
        if (vVar.f().equals(this.f14986k.a().a().f())) {
            return true;
        }
        if (this.f14989n != null) {
            com.anythink.core.common.n.b.a.j.e eVar = com.anythink.core.common.n.b.a.j.e.f15375a;
            if (com.anythink.core.common.n.b.a.j.e.a(vVar.f(), (X509Certificate) this.f14989n.c().get(0))) {
                return true;
            }
        }
        return false;
    }

    public final com.anythink.core.common.n.b.a.c.c a(z zVar, w.a aVar) {
        if (this.f14991p != null) {
            return new com.anythink.core.common.n.b.a.e.g(zVar, this, aVar, this.f14991p);
        }
        this.f14988m.setSoTimeout(aVar.e());
        x a9 = this.f14992q.a();
        long e9 = aVar.e();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        a9.a(e9, timeUnit);
        this.f14993r.a().a(aVar.f(), timeUnit);
        return new com.anythink.core.common.n.b.a.d.a(zVar, this, this.f14992q, this.f14993r);
    }

    public final a.e a(final c cVar) {
        this.f14988m.setSoTimeout(0);
        e();
        return new a.e(this.f14992q, this.f14993r) { // from class: com.anythink.core.common.n.b.a.b.e.1
            @Override // java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                cVar.a(true, true, null);
            }
        };
    }

    @Override // com.anythink.core.common.n.b.j
    public final ah a() {
        return this.f14986k;
    }

    public final boolean a(boolean z3) {
        if (this.f14988m.isClosed() || this.f14988m.isInputShutdown() || this.f14988m.isOutputShutdown()) {
            return false;
        }
        com.anythink.core.common.n.b.a.e.f fVar = this.f14991p;
        if (fVar != null) {
            return fVar.b(System.nanoTime());
        }
        if (z3) {
            try {
                int soTimeout = this.f14988m.getSoTimeout();
                try {
                    this.f14988m.setSoTimeout(1);
                    return !this.f14992q.g();
                } finally {
                    this.f14988m.setSoTimeout(soTimeout);
                }
            } catch (SocketTimeoutException unused) {
            } catch (IOException unused2) {
                return false;
            }
        }
        return true;
    }

    @Override // com.anythink.core.common.n.b.a.e.f.c
    public final void a(com.anythink.core.common.n.b.a.e.i iVar) {
        iVar.a(com.anythink.core.common.n.b.a.e.b.REFUSED_STREAM, (IOException) null);
    }

    @Override // com.anythink.core.common.n.b.a.e.f.c
    public final void a(com.anythink.core.common.n.b.a.e.f fVar) {
        synchronized (this.f14980a) {
            this.f14995t = fVar.a();
        }
    }

    public final void a(IOException iOException) {
        if (!f14978g && Thread.holdsLock(this.f14980a)) {
            throw new AssertionError();
        }
        synchronized (this.f14980a) {
            try {
                if (iOException instanceof com.anythink.core.common.n.b.a.e.n) {
                    com.anythink.core.common.n.b.a.e.b bVar = ((com.anythink.core.common.n.b.a.e.n) iOException).f15336a;
                    if (bVar == com.anythink.core.common.n.b.a.e.b.REFUSED_STREAM) {
                        int i6 = this.f14994s + 1;
                        this.f14994s = i6;
                        if (i6 > 1) {
                            this.f14981b = true;
                            this.f14982c++;
                        }
                    } else if (bVar != com.anythink.core.common.n.b.a.e.b.CANCEL) {
                        this.f14981b = true;
                        this.f14982c++;
                    }
                } else if (!g() || (iOException instanceof com.anythink.core.common.n.b.a.e.a)) {
                    this.f14981b = true;
                    if (this.f14983d == 0) {
                        if (iOException != null) {
                            f fVar = this.f14980a;
                            ah ahVar = this.f14986k;
                            if (ahVar.b().type() != Proxy.Type.DIRECT) {
                                C0546a a9 = ahVar.a();
                                a9.g().connectFailed(a9.a().a(), ahVar.b().address(), iOException);
                            }
                            fVar.f15000a.a(ahVar);
                        }
                        this.f14982c++;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
            throw th;
        }
    }

    private void a(int i6, int i9, int i10) {
        ad b9 = new ad.a().a(this.f14986k.a().a()).a("CONNECT", (ae) null).a("Host", com.anythink.core.common.n.b.a.c.a(this.f14986k.a().a(), true)).a("Proxy-Connection", com.anythink.expressad.foundation.g.f.g.b.f19340c).b();
        ad authenticate = this.f14986k.a().d().authenticate(this.f14986k, new af.a().a(b9).a(ab.HTTP_1_1).a(407).a("Preemptive Authenticate").a(com.anythink.core.common.n.b.a.c.f15039d).a(-1L).b(-1L).a("Proxy-Authenticate", aa.f15462a + "-Preemptive").a());
        if (authenticate != null) {
            b9 = authenticate;
        }
        v a9 = b9.a();
        for (int i11 = 0; i11 < 21; i11++) {
            a(i6, i9);
            b9 = a(i9, i10, b9, a9);
            if (b9 == null) {
                return;
            }
            com.anythink.core.common.n.b.a.c.a(this.f14987l);
            this.f14987l = null;
            this.f14993r = null;
            this.f14992q = null;
            this.f14986k.c();
            this.f14986k.b();
        }
    }
}
