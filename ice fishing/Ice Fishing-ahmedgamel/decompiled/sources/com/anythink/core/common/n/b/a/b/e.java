package com.anythink.core.common.n.b.a.b;

import D.x;
import com.anythink.core.common.n.b.C0565a;
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
    static final /* synthetic */ boolean f15765g = true;
    private static final String i = "throw with null exception";

    /* renamed from: j, reason: collision with root package name */
    private static final int f15766j = 21;

    /* renamed from: a, reason: collision with root package name */
    public final f f15767a;

    /* renamed from: b, reason: collision with root package name */
    boolean f15768b;

    /* renamed from: c, reason: collision with root package name */
    int f15769c;

    /* renamed from: d, reason: collision with root package name */
    int f15770d;

    /* renamed from: k, reason: collision with root package name */
    private final ah f15773k;

    /* renamed from: l, reason: collision with root package name */
    private Socket f15774l;

    /* renamed from: m, reason: collision with root package name */
    private Socket f15775m;

    /* renamed from: n, reason: collision with root package name */
    private t f15776n;

    /* renamed from: o, reason: collision with root package name */
    private ab f15777o;

    /* renamed from: p, reason: collision with root package name */
    private com.anythink.core.common.n.b.a.e.f f15778p;

    /* renamed from: q, reason: collision with root package name */
    private com.anythink.core.common.n.c.e f15779q;

    /* renamed from: r, reason: collision with root package name */
    private com.anythink.core.common.n.c.d f15780r;

    /* renamed from: s, reason: collision with root package name */
    private int f15781s;

    /* renamed from: t, reason: collision with root package name */
    private int f15782t = 1;

    /* renamed from: e, reason: collision with root package name */
    final List<Reference<j>> f15771e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    long f15772f = Long.MAX_VALUE;

    public e(f fVar, ah ahVar) {
        this.f15767a = fVar;
        this.f15773k = ahVar;
    }

    private static e a(f fVar, ah ahVar, Socket socket, long j6) {
        e eVar = new e(fVar, ahVar);
        eVar.f15775m = socket;
        eVar.f15772f = j6;
        return eVar;
    }

    private ad h() {
        ad b9 = new ad.a().a(this.f15773k.a().a()).a("CONNECT", (ae) null).a("Host", com.anythink.core.common.n.b.a.c.a(this.f15773k.a().a(), true)).a("Proxy-Connection", com.anythink.expressad.foundation.g.f.g.b.f20127c).b();
        ad authenticate = this.f15773k.a().d().authenticate(this.f15773k, new af.a().a(b9).a(ab.HTTP_1_1).a(407).a("Preemptive Authenticate").a(com.anythink.core.common.n.b.a.c.f15826d).a(-1L).b(-1L).a("Proxy-Authenticate", aa.f16249a + "-Preemptive").a());
        return authenticate != null ? authenticate : b9;
    }

    @Override // com.anythink.core.common.n.b.j
    public final Socket b() {
        return this.f15775m;
    }

    @Override // com.anythink.core.common.n.b.j
    public final t c() {
        return this.f15776n;
    }

    @Override // com.anythink.core.common.n.b.j
    public final ab d() {
        return this.f15777o;
    }

    public final void e() {
        if (!f15765g && Thread.holdsLock(this.f15767a)) {
            throw new AssertionError();
        }
        synchronized (this.f15767a) {
            this.f15768b = true;
        }
    }

    public final void f() {
        com.anythink.core.common.n.b.a.c.a(this.f15774l);
    }

    public final boolean g() {
        return this.f15778p != null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Connection{");
        sb.append(this.f15773k.a().a().f());
        sb.append(":");
        sb.append(this.f15773k.a().a().g());
        sb.append(", proxy=");
        sb.append(this.f15773k.b());
        sb.append(" hostAddress=");
        sb.append(this.f15773k.c());
        sb.append(" cipherSuite=");
        t tVar = this.f15776n;
        sb.append(tVar != null ? tVar.b() : "none");
        sb.append(" protocol=");
        sb.append(this.f15777o);
        sb.append('}');
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ff A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(int i4, int i6, int i9, int i10, boolean z6) {
        if (this.f15777o == null) {
            List<l> f2 = this.f15773k.a().f();
            b bVar = new b(f2);
            if (this.f15773k.a().i() == null) {
                if (f2.contains(l.f16456d)) {
                    String f9 = this.f15773k.a().a().f();
                    if (!com.anythink.core.common.n.b.a.g.c.e().b(f9)) {
                        throw new h(new UnknownServiceException(x.l("CLEARTEXT communication to ", f9, " not permitted by network security policy")));
                    }
                } else {
                    throw new h(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
                }
            } else if (this.f15773k.a().e().contains(ab.H2_PRIOR_KNOWLEDGE)) {
                throw new h(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
            }
            h hVar = null;
            do {
                try {
                    if (this.f15773k.d()) {
                        a(i4, i6, i9);
                        if (this.f15774l == null) {
                            if (!this.f15773k.d() && this.f15774l == null) {
                                throw new h(new ProtocolException("Too many tunnel connections attempted: 21"));
                            }
                            if (this.f15778p == null) {
                                synchronized (this.f15767a) {
                                    this.f15782t = this.f15778p.a();
                                }
                                return;
                            }
                            return;
                        }
                    } else {
                        a(i4, i6);
                    }
                    if (this.f15773k.a().i() == null) {
                        List<ab> e9 = this.f15773k.a().e();
                        ab abVar = ab.H2_PRIOR_KNOWLEDGE;
                        if (e9.contains(abVar)) {
                            this.f15775m = this.f15774l;
                            this.f15777o = abVar;
                            a(i10);
                        } else {
                            this.f15775m = this.f15774l;
                            this.f15777o = ab.HTTP_1_1;
                        }
                    } else {
                        a(bVar);
                        if (this.f15777o == ab.HTTP_2) {
                            a(i10);
                        }
                    }
                    this.f15773k.c();
                    this.f15773k.b();
                    if (!this.f15773k.d()) {
                    }
                    if (this.f15778p == null) {
                    }
                } catch (IOException e10) {
                    com.anythink.core.common.n.b.a.c.a(this.f15775m);
                    com.anythink.core.common.n.b.a.c.a(this.f15774l);
                    this.f15775m = null;
                    this.f15774l = null;
                    this.f15779q = null;
                    this.f15780r = null;
                    this.f15776n = null;
                    this.f15777o = null;
                    this.f15778p = null;
                    this.f15773k.c();
                    this.f15773k.b();
                    if (hVar == null) {
                        hVar = new h(e10);
                    } else {
                        hVar.a(e10);
                    }
                    if (!z6) {
                        throw hVar;
                    }
                }
            } while (bVar.a(e10));
            throw hVar;
        }
        throw new IllegalStateException("already connected");
    }

    private void a(int i4, int i6) {
        Socket createSocket;
        Proxy b9 = this.f15773k.b();
        C0565a a9 = this.f15773k.a();
        if (b9.type() != Proxy.Type.DIRECT && b9.type() != Proxy.Type.HTTP) {
            createSocket = new Socket(b9);
        } else {
            createSocket = a9.c().createSocket();
        }
        this.f15774l = createSocket;
        this.f15773k.c();
        this.f15774l.setSoTimeout(i6);
        try {
            com.anythink.core.common.n.b.a.g.c.e().a(this.f15774l, this.f15773k.c(), i4);
            try {
                this.f15779q = n.a(n.b(this.f15774l));
                this.f15780r = n.a(n.a(this.f15774l));
            } catch (NullPointerException e9) {
                if (i.equals(e9.getMessage())) {
                    throw new IOException(e9);
                }
            }
        } catch (ConnectException e10) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f15773k.c());
            connectException.initCause(e10);
            throw connectException;
        }
    }

    private void a(b bVar, int i4) {
        if (this.f15773k.a().i() == null) {
            List<ab> e9 = this.f15773k.a().e();
            ab abVar = ab.H2_PRIOR_KNOWLEDGE;
            if (e9.contains(abVar)) {
                this.f15775m = this.f15774l;
                this.f15777o = abVar;
                a(i4);
                return;
            } else {
                this.f15775m = this.f15774l;
                this.f15777o = ab.HTTP_1_1;
                return;
            }
        }
        a(bVar);
        if (this.f15777o == ab.HTTP_2) {
            a(i4);
        }
    }

    private void a(int i4) {
        this.f15775m.setSoTimeout(0);
        com.anythink.core.common.n.b.a.e.f a9 = new f.a().a(this.f15775m, this.f15773k.a().a().f(), this.f15779q, this.f15780r).a(this).a(i4).a();
        this.f15778p = a9;
        a9.b();
    }

    private void a(b bVar) {
        SSLSocket sSLSocket;
        ab abVar;
        C0565a a9 = this.f15773k.a();
        SSLSocket sSLSocket2 = null;
        try {
            try {
                sSLSocket = (SSLSocket) a9.i().createSocket(this.f15774l, a9.a().f(), a9.a().g(), true);
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
            this.f15775m = sSLSocket;
            this.f15779q = n.a(n.b(sSLSocket));
            this.f15780r = n.a(n.a(this.f15775m));
            this.f15776n = a11;
            if (a12 != null) {
                abVar = ab.a(a12);
            } else {
                abVar = ab.HTTP_1_1;
            }
            this.f15777o = abVar;
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

    private ad a(int i4, int i6, ad adVar, v vVar) {
        String str = "CONNECT " + com.anythink.core.common.n.b.a.c.a(vVar, true) + " HTTP/1.1";
        while (true) {
            com.anythink.core.common.n.b.a.d.a aVar = new com.anythink.core.common.n.b.a.d.a(null, null, this.f15779q, this.f15780r);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f15779q.a().a(i4, timeUnit);
            this.f15780r.a().a(i6, timeUnit);
            aVar.a(adVar.c(), str);
            aVar.c();
            af a9 = aVar.a(false).a(adVar).a();
            aVar.c(a9);
            int c9 = a9.c();
            if (c9 == 200) {
                if (this.f15779q.d().g() && this.f15780r.c().g()) {
                    return null;
                }
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
            if (c9 == 407) {
                ad authenticate = this.f15773k.a().d().authenticate(this.f15773k, a9);
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

    public final boolean a(C0565a c0565a, List<ah> list) {
        if (this.f15771e.size() >= this.f15782t || this.f15768b || !com.anythink.core.common.n.b.a.a.f15656a.a(this.f15773k.a(), c0565a)) {
            return false;
        }
        if (c0565a.a().f().equals(this.f15773k.a().a().f())) {
            return true;
        }
        if (this.f15778p != null && list != null) {
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                ah ahVar = list.get(i4);
                Proxy.Type type = ahVar.b().type();
                Proxy.Type type2 = Proxy.Type.DIRECT;
                if (type == type2 && this.f15773k.b().type() == type2 && this.f15773k.c().equals(ahVar.c())) {
                    if (c0565a.j() != com.anythink.core.common.n.b.a.j.e.f16162a || !a(c0565a.a())) {
                        return false;
                    }
                    try {
                        c0565a.k().a(c0565a.a().f(), this.f15776n.c());
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
        for (int i4 = 0; i4 < size; i4++) {
            ah ahVar = list.get(i4);
            Proxy.Type type = ahVar.b().type();
            Proxy.Type type2 = Proxy.Type.DIRECT;
            if (type == type2 && this.f15773k.b().type() == type2 && this.f15773k.c().equals(ahVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final boolean a(v vVar) {
        if (vVar.g() != this.f15773k.a().a().g()) {
            return false;
        }
        if (vVar.f().equals(this.f15773k.a().a().f())) {
            return true;
        }
        if (this.f15776n != null) {
            com.anythink.core.common.n.b.a.j.e eVar = com.anythink.core.common.n.b.a.j.e.f16162a;
            if (com.anythink.core.common.n.b.a.j.e.a(vVar.f(), (X509Certificate) this.f15776n.c().get(0))) {
                return true;
            }
        }
        return false;
    }

    public final com.anythink.core.common.n.b.a.c.c a(z zVar, w.a aVar) {
        if (this.f15778p != null) {
            return new com.anythink.core.common.n.b.a.e.g(zVar, this, aVar, this.f15778p);
        }
        this.f15775m.setSoTimeout(aVar.e());
        com.anythink.core.common.n.c.x a9 = this.f15779q.a();
        long e9 = aVar.e();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        a9.a(e9, timeUnit);
        this.f15780r.a().a(aVar.f(), timeUnit);
        return new com.anythink.core.common.n.b.a.d.a(zVar, this, this.f15779q, this.f15780r);
    }

    public final a.e a(final c cVar) {
        this.f15775m.setSoTimeout(0);
        e();
        return new a.e(this.f15779q, this.f15780r) { // from class: com.anythink.core.common.n.b.a.b.e.1
            @Override // java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                cVar.a(true, true, null);
            }
        };
    }

    @Override // com.anythink.core.common.n.b.j
    public final ah a() {
        return this.f15773k;
    }

    public final boolean a(boolean z6) {
        if (this.f15775m.isClosed() || this.f15775m.isInputShutdown() || this.f15775m.isOutputShutdown()) {
            return false;
        }
        com.anythink.core.common.n.b.a.e.f fVar = this.f15778p;
        if (fVar != null) {
            return fVar.b(System.nanoTime());
        }
        if (z6) {
            try {
                int soTimeout = this.f15775m.getSoTimeout();
                try {
                    this.f15775m.setSoTimeout(1);
                    return !this.f15779q.g();
                } finally {
                    this.f15775m.setSoTimeout(soTimeout);
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
        synchronized (this.f15767a) {
            this.f15782t = fVar.a();
        }
    }

    public final void a(IOException iOException) {
        if (!f15765g && Thread.holdsLock(this.f15767a)) {
            throw new AssertionError();
        }
        synchronized (this.f15767a) {
            try {
                if (iOException instanceof com.anythink.core.common.n.b.a.e.n) {
                    com.anythink.core.common.n.b.a.e.b bVar = ((com.anythink.core.common.n.b.a.e.n) iOException).f16123a;
                    if (bVar == com.anythink.core.common.n.b.a.e.b.REFUSED_STREAM) {
                        int i4 = this.f15781s + 1;
                        this.f15781s = i4;
                        if (i4 > 1) {
                            this.f15768b = true;
                            this.f15769c++;
                        }
                    } else if (bVar != com.anythink.core.common.n.b.a.e.b.CANCEL) {
                        this.f15768b = true;
                        this.f15769c++;
                    }
                } else if (!g() || (iOException instanceof com.anythink.core.common.n.b.a.e.a)) {
                    this.f15768b = true;
                    if (this.f15770d == 0) {
                        if (iOException != null) {
                            f fVar = this.f15767a;
                            ah ahVar = this.f15773k;
                            if (ahVar.b().type() != Proxy.Type.DIRECT) {
                                C0565a a9 = ahVar.a();
                                a9.g().connectFailed(a9.a().a(), ahVar.b().address(), iOException);
                            }
                            fVar.f15787a.a(ahVar);
                        }
                        this.f15769c++;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
            throw th;
        }
    }

    private void a(int i4, int i6, int i9) {
        ad b9 = new ad.a().a(this.f15773k.a().a()).a("CONNECT", (ae) null).a("Host", com.anythink.core.common.n.b.a.c.a(this.f15773k.a().a(), true)).a("Proxy-Connection", com.anythink.expressad.foundation.g.f.g.b.f20127c).b();
        ad authenticate = this.f15773k.a().d().authenticate(this.f15773k, new af.a().a(b9).a(ab.HTTP_1_1).a(407).a("Preemptive Authenticate").a(com.anythink.core.common.n.b.a.c.f15826d).a(-1L).b(-1L).a("Proxy-Authenticate", aa.f16249a + "-Preemptive").a());
        if (authenticate != null) {
            b9 = authenticate;
        }
        v a9 = b9.a();
        for (int i10 = 0; i10 < 21; i10++) {
            a(i4, i6);
            b9 = a(i6, i9, b9, a9);
            if (b9 == null) {
                return;
            }
            com.anythink.core.common.n.b.a.c.a(this.f15774l);
            this.f15774l = null;
            this.f15780r = null;
            this.f15779q = null;
            this.f15773k.c();
            this.f15773k.b();
        }
    }
}
