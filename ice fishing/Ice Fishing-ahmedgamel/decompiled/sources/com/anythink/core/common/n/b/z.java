package com.anythink.core.common.n.b;

import android.os.Build;
import com.anythink.core.common.n.b.af;
import com.anythink.core.common.n.b.aj;
import com.anythink.core.common.n.b.e;
import com.anythink.core.common.n.b.l;
import com.anythink.core.common.n.b.r;
import com.anythink.core.common.n.b.u;
import java.net.Proxy;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public class z implements aj.a, e.a, Cloneable {

    /* renamed from: a, reason: collision with root package name */
    static final List<ab> f15775a = com.anythink.core.common.n.b.a.c.a(ab.HTTP_2, ab.HTTP_1_1);

    /* renamed from: b, reason: collision with root package name */
    static final List<l> f15776b = com.anythink.core.common.n.b.a.c.a(l.f15667b, l.f15669d);

    /* renamed from: A, reason: collision with root package name */
    final int f15777A;

    /* renamed from: B, reason: collision with root package name */
    final int f15778B;

    /* renamed from: C, reason: collision with root package name */
    final int f15779C;

    /* renamed from: D, reason: collision with root package name */
    final int f15780D;

    /* renamed from: c, reason: collision with root package name */
    final p f15781c;

    /* renamed from: d, reason: collision with root package name */
    final Proxy f15782d;

    /* renamed from: e, reason: collision with root package name */
    final List<ab> f15783e;

    /* renamed from: f, reason: collision with root package name */
    final List<l> f15784f;

    /* renamed from: g, reason: collision with root package name */
    final List<w> f15785g;

    /* renamed from: h, reason: collision with root package name */
    final List<w> f15786h;
    final r.a i;

    /* renamed from: j, reason: collision with root package name */
    final ProxySelector f15787j;

    /* renamed from: k, reason: collision with root package name */
    final n f15788k;

    /* renamed from: l, reason: collision with root package name */
    final c f15789l;

    /* renamed from: m, reason: collision with root package name */
    final com.anythink.core.common.n.b.a.a.f f15790m;

    /* renamed from: n, reason: collision with root package name */
    final SocketFactory f15791n;

    /* renamed from: o, reason: collision with root package name */
    final SSLSocketFactory f15792o;

    /* renamed from: p, reason: collision with root package name */
    final com.anythink.core.common.n.b.a.j.c f15793p;

    /* renamed from: q, reason: collision with root package name */
    final HostnameVerifier f15794q;

    /* renamed from: r, reason: collision with root package name */
    final g f15795r;

    /* renamed from: s, reason: collision with root package name */
    final b f15796s;

    /* renamed from: t, reason: collision with root package name */
    final b f15797t;

    /* renamed from: u, reason: collision with root package name */
    final k f15798u;

    /* renamed from: v, reason: collision with root package name */
    final q f15799v;

    /* renamed from: w, reason: collision with root package name */
    final boolean f15800w;

    /* renamed from: x, reason: collision with root package name */
    final boolean f15801x;

    /* renamed from: y, reason: collision with root package name */
    final boolean f15802y;

    /* renamed from: z, reason: collision with root package name */
    final int f15803z;

    public static final class a {

        /* renamed from: A, reason: collision with root package name */
        int f15804A;

        /* renamed from: B, reason: collision with root package name */
        int f15805B;

        /* renamed from: a, reason: collision with root package name */
        p f15806a;

        /* renamed from: b, reason: collision with root package name */
        Proxy f15807b;

        /* renamed from: c, reason: collision with root package name */
        List<ab> f15808c;

        /* renamed from: d, reason: collision with root package name */
        List<l> f15809d;

        /* renamed from: e, reason: collision with root package name */
        final List<w> f15810e;

        /* renamed from: f, reason: collision with root package name */
        final List<w> f15811f;

        /* renamed from: g, reason: collision with root package name */
        r.a f15812g;

        /* renamed from: h, reason: collision with root package name */
        ProxySelector f15813h;
        n i;

        /* renamed from: j, reason: collision with root package name */
        c f15814j;

        /* renamed from: k, reason: collision with root package name */
        com.anythink.core.common.n.b.a.a.f f15815k;

        /* renamed from: l, reason: collision with root package name */
        SocketFactory f15816l;

        /* renamed from: m, reason: collision with root package name */
        SSLSocketFactory f15817m;

        /* renamed from: n, reason: collision with root package name */
        com.anythink.core.common.n.b.a.j.c f15818n;

        /* renamed from: o, reason: collision with root package name */
        HostnameVerifier f15819o;

        /* renamed from: p, reason: collision with root package name */
        g f15820p;

        /* renamed from: q, reason: collision with root package name */
        b f15821q;

        /* renamed from: r, reason: collision with root package name */
        b f15822r;

        /* renamed from: s, reason: collision with root package name */
        k f15823s;

        /* renamed from: t, reason: collision with root package name */
        q f15824t;

        /* renamed from: u, reason: collision with root package name */
        boolean f15825u;

        /* renamed from: v, reason: collision with root package name */
        boolean f15826v;

        /* renamed from: w, reason: collision with root package name */
        boolean f15827w;

        /* renamed from: x, reason: collision with root package name */
        int f15828x;

        /* renamed from: y, reason: collision with root package name */
        int f15829y;

        /* renamed from: z, reason: collision with root package name */
        int f15830z;

        public a() {
            this.f15810e = new ArrayList();
            this.f15811f = new ArrayList();
            this.f15806a = new p();
            this.f15808c = z.f15775a;
            this.f15809d = z.f15776b;
            this.f15812g = r.a(r.f15709a);
            ProxySelector proxySelector = ProxySelector.getDefault();
            this.f15813h = proxySelector;
            if (proxySelector == null) {
                this.f15813h = new com.anythink.core.common.n.b.a.h.a();
            }
            this.i = n.f15699a;
            this.f15816l = SocketFactory.getDefault();
            this.f15819o = com.anythink.core.common.n.b.a.j.e.f15375a;
            this.f15820p = g.f15605a;
            b bVar = b.f15542a;
            this.f15821q = bVar;
            this.f15822r = bVar;
            this.f15823s = new k();
            this.f15824t = q.f15708a;
            this.f15825u = true;
            this.f15826v = true;
            this.f15827w = true;
            this.f15828x = 0;
            this.f15829y = 10000;
            this.f15830z = 10000;
            this.f15804A = 10000;
            this.f15805B = 0;
        }

        private a a(Duration duration) {
            long millis;
            if (Build.VERSION.SDK_INT >= 26) {
                millis = duration.toMillis();
                this.f15828x = com.anythink.core.common.n.b.a.c.a("timeout", millis, TimeUnit.MILLISECONDS);
            }
            return this;
        }

        private a b(Duration duration) {
            long millis;
            if (Build.VERSION.SDK_INT >= 26) {
                millis = duration.toMillis();
                this.f15829y = com.anythink.core.common.n.b.a.c.a("timeout", millis, TimeUnit.MILLISECONDS);
            }
            return this;
        }

        private a c(Duration duration) {
            long millis;
            if (Build.VERSION.SDK_INT >= 26) {
                millis = duration.toMillis();
                this.f15830z = com.anythink.core.common.n.b.a.c.a("timeout", millis, TimeUnit.MILLISECONDS);
            }
            return this;
        }

        private a d(long j6, TimeUnit timeUnit) {
            this.f15828x = com.anythink.core.common.n.b.a.c.a("timeout", j6, timeUnit);
            return this;
        }

        private a e(long j6, TimeUnit timeUnit) {
            this.f15805B = com.anythink.core.common.n.b.a.c.a("interval", j6, timeUnit);
            return this;
        }

        private a d(Duration duration) {
            long millis;
            if (Build.VERSION.SDK_INT >= 26) {
                millis = duration.toMillis();
                this.f15804A = com.anythink.core.common.n.b.a.c.a("timeout", millis, TimeUnit.MILLISECONDS);
            }
            return this;
        }

        private a e(Duration duration) {
            long millis;
            if (Build.VERSION.SDK_INT >= 26) {
                millis = duration.toMillis();
                this.f15805B = com.anythink.core.common.n.b.a.c.a("timeout", millis, TimeUnit.MILLISECONDS);
            }
            return this;
        }

        public final a a(long j6, TimeUnit timeUnit) {
            this.f15829y = com.anythink.core.common.n.b.a.c.a("timeout", j6, timeUnit);
            return this;
        }

        public final a b(long j6, TimeUnit timeUnit) {
            this.f15830z = com.anythink.core.common.n.b.a.c.a("timeout", j6, timeUnit);
            return this;
        }

        public final a c(long j6, TimeUnit timeUnit) {
            this.f15804A = com.anythink.core.common.n.b.a.c.a("timeout", j6, timeUnit);
            return this;
        }

        private a a(Proxy proxy) {
            this.f15807b = proxy;
            return this;
        }

        private a b(b bVar) {
            if (bVar != null) {
                this.f15821q = bVar;
                return this;
            }
            throw new NullPointerException("proxyAuthenticator == null");
        }

        private a c(boolean z3) {
            this.f15827w = z3;
            return this;
        }

        private a a(ProxySelector proxySelector) {
            if (proxySelector != null) {
                this.f15813h = proxySelector;
                return this;
            }
            throw new NullPointerException("proxySelector == null");
        }

        private List<w> c() {
            return this.f15811f;
        }

        private a b(boolean z3) {
            this.f15826v = z3;
            return this;
        }

        private a a(n nVar) {
            if (nVar != null) {
                this.i = nVar;
                return this;
            }
            throw new NullPointerException("cookieJar == null");
        }

        private a b(List<l> list) {
            this.f15809d = com.anythink.core.common.n.b.a.c.a(list);
            return this;
        }

        private List<w> b() {
            return this.f15810e;
        }

        private a a(c cVar) {
            this.f15814j = cVar;
            this.f15815k = null;
            return this;
        }

        private a b(w wVar) {
            if (wVar != null) {
                this.f15811f.add(wVar);
                return this;
            }
            throw new IllegalArgumentException("interceptor == null");
        }

        public final a a(q qVar) {
            this.f15824t = qVar;
            return this;
        }

        private a a(SocketFactory socketFactory) {
            if (socketFactory != null) {
                if (!(socketFactory instanceof SSLSocketFactory)) {
                    this.f15816l = socketFactory;
                    return this;
                }
                throw new IllegalArgumentException("socketFactory instanceof SSLSocketFactory");
            }
            throw new NullPointerException("socketFactory == null");
        }

        private a a(SSLSocketFactory sSLSocketFactory) {
            if (sSLSocketFactory != null) {
                this.f15817m = sSLSocketFactory;
                this.f15818n = com.anythink.core.common.n.b.a.g.c.e().b(sSLSocketFactory);
                return this;
            }
            throw new NullPointerException("sslSocketFactory == null");
        }

        private a a(SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager) {
            if (sSLSocketFactory == null) {
                throw new NullPointerException("sslSocketFactory == null");
            }
            if (x509TrustManager != null) {
                this.f15817m = sSLSocketFactory;
                this.f15818n = com.anythink.core.common.n.b.a.g.c.e().a(x509TrustManager);
                return this;
            }
            throw new NullPointerException("trustManager == null");
        }

        private a a(HostnameVerifier hostnameVerifier) {
            if (hostnameVerifier != null) {
                this.f15819o = hostnameVerifier;
                return this;
            }
            throw new NullPointerException("hostnameVerifier == null");
        }

        public a(z zVar) {
            ArrayList arrayList = new ArrayList();
            this.f15810e = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.f15811f = arrayList2;
            this.f15806a = zVar.f15781c;
            this.f15807b = zVar.f15782d;
            this.f15808c = zVar.f15783e;
            this.f15809d = zVar.f15784f;
            arrayList.addAll(zVar.f15785g);
            arrayList2.addAll(zVar.f15786h);
            this.f15812g = zVar.i;
            this.f15813h = zVar.f15787j;
            this.i = zVar.f15788k;
            this.f15815k = zVar.f15790m;
            this.f15814j = zVar.f15789l;
            this.f15816l = zVar.f15791n;
            this.f15817m = zVar.f15792o;
            this.f15818n = zVar.f15793p;
            this.f15819o = zVar.f15794q;
            this.f15820p = zVar.f15795r;
            this.f15821q = zVar.f15796s;
            this.f15822r = zVar.f15797t;
            this.f15823s = zVar.f15798u;
            this.f15824t = zVar.f15799v;
            this.f15825u = zVar.f15800w;
            this.f15826v = zVar.f15801x;
            this.f15827w = zVar.f15802y;
            this.f15828x = zVar.f15803z;
            this.f15829y = zVar.f15777A;
            this.f15830z = zVar.f15778B;
            this.f15804A = zVar.f15779C;
            this.f15805B = zVar.f15780D;
        }

        private a a(g gVar) {
            if (gVar != null) {
                this.f15820p = gVar;
                return this;
            }
            throw new NullPointerException("certificatePinner == null");
        }

        private a a(b bVar) {
            if (bVar != null) {
                this.f15822r = bVar;
                return this;
            }
            throw new NullPointerException("authenticator == null");
        }

        public final a a(k kVar) {
            if (kVar != null) {
                this.f15823s = kVar;
                return this;
            }
            throw new NullPointerException("connectionPool == null");
        }

        private a a(boolean z3) {
            this.f15825u = z3;
            return this;
        }

        public final a a(p pVar) {
            this.f15806a = pVar;
            return this;
        }

        public final a a(List<ab> list) {
            ArrayList arrayList = new ArrayList(list);
            ab abVar = ab.H2_PRIOR_KNOWLEDGE;
            if (!arrayList.contains(abVar) && !arrayList.contains(ab.HTTP_1_1)) {
                throw new IllegalArgumentException("protocols must contain h2_prior_knowledge or http/1.1: ".concat(String.valueOf(arrayList)));
            }
            if (arrayList.contains(abVar) && arrayList.size() > 1) {
                throw new IllegalArgumentException("protocols containing h2_prior_knowledge cannot use other protocols: ".concat(String.valueOf(arrayList)));
            }
            if (!arrayList.contains(ab.HTTP_1_0)) {
                if (!arrayList.contains(null)) {
                    arrayList.remove(ab.SPDY_3);
                    this.f15808c = Collections.unmodifiableList(arrayList);
                    return this;
                }
                throw new IllegalArgumentException("protocols must not contain null");
            }
            throw new IllegalArgumentException("protocols must not contain http/1.0: ".concat(String.valueOf(arrayList)));
        }

        private a a(w wVar) {
            if (wVar != null) {
                this.f15810e.add(wVar);
                return this;
            }
            throw new IllegalArgumentException("interceptor == null");
        }

        public final a a(r rVar) {
            if (rVar != null) {
                this.f15812g = r.a(rVar);
                return this;
            }
            throw new NullPointerException("eventListener == null");
        }

        private a a(r.a aVar) {
            if (aVar != null) {
                this.f15812g = aVar;
                return this;
            }
            throw new NullPointerException("eventListenerFactory == null");
        }

        public final z a() {
            return new z(this);
        }
    }

    static {
        com.anythink.core.common.n.b.a.a.f14869a = new com.anythink.core.common.n.b.a.a() { // from class: com.anythink.core.common.n.b.z.1
            @Override // com.anythink.core.common.n.b.a.a
            public final void a(u.a aVar, String str) {
                aVar.a(str);
            }

            @Override // com.anythink.core.common.n.b.a.a
            public final void a(u.a aVar, String str, String str2) {
                aVar.c(str, str2);
            }

            @Override // com.anythink.core.common.n.b.a.a
            public final com.anythink.core.common.n.b.a.b.f a(k kVar) {
                return kVar.f15665a;
            }

            @Override // com.anythink.core.common.n.b.a.a
            public final boolean a(C0546a c0546a, C0546a c0546a2) {
                return c0546a.a(c0546a2);
            }

            @Override // com.anythink.core.common.n.b.a.a
            public final int a(af.a aVar) {
                return aVar.f15514c;
            }

            @Override // com.anythink.core.common.n.b.a.a
            public final e a(z zVar, ad adVar) {
                return ac.a(zVar, adVar, true);
            }

            @Override // com.anythink.core.common.n.b.a.a
            public final com.anythink.core.common.n.b.a.b.c a(af afVar) {
                return afVar.f15510m;
            }

            @Override // com.anythink.core.common.n.b.a.a
            public final void a(l lVar, SSLSocket sSLSocket, boolean z3) {
                String[] enabledCipherSuites;
                String[] enabledProtocols;
                if (lVar.f15673g != null) {
                    enabledCipherSuites = com.anythink.core.common.n.b.a.c.a(i.f15640a, sSLSocket.getEnabledCipherSuites(), lVar.f15673g);
                } else {
                    enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
                }
                if (lVar.f15674h != null) {
                    enabledProtocols = com.anythink.core.common.n.b.a.c.a(com.anythink.core.common.n.b.a.c.f15042g, sSLSocket.getEnabledProtocols(), lVar.f15674h);
                } else {
                    enabledProtocols = sSLSocket.getEnabledProtocols();
                }
                String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
                int a9 = com.anythink.core.common.n.b.a.c.a(i.f15640a, supportedCipherSuites, "TLS_FALLBACK_SCSV");
                if (z3 && a9 != -1) {
                    enabledCipherSuites = com.anythink.core.common.n.b.a.c.a(enabledCipherSuites, supportedCipherSuites[a9]);
                }
                l b9 = new l.a(lVar).a(enabledCipherSuites).b(enabledProtocols).b();
                String[] strArr = b9.f15674h;
                if (strArr != null) {
                    sSLSocket.setEnabledProtocols(strArr);
                }
                String[] strArr2 = b9.f15673g;
                if (strArr2 != null) {
                    sSLSocket.setEnabledCipherSuites(strArr2);
                }
            }

            @Override // com.anythink.core.common.n.b.a.a
            public final void a(af.a aVar, com.anythink.core.common.n.b.a.b.c cVar) {
                aVar.f15523m = cVar;
            }
        };
    }

    public z() {
        this(new a());
    }

    private List<w> A() {
        return this.f15785g;
    }

    private List<w> B() {
        return this.f15786h;
    }

    private static SSLSocketFactory a(X509TrustManager x509TrustManager) {
        try {
            SSLContext c9 = com.anythink.core.common.n.b.a.g.c.e().c();
            c9.init(null, new TrustManager[]{x509TrustManager}, null);
            return c9.getSocketFactory();
        } catch (GeneralSecurityException e9) {
            throw new AssertionError("No System TLS", e9);
        }
    }

    private int u() {
        return this.f15777A;
    }

    private int v() {
        return this.f15778B;
    }

    private int w() {
        return this.f15779C;
    }

    private c x() {
        return this.f15789l;
    }

    private com.anythink.core.common.n.b.a.a.f y() {
        c cVar = this.f15789l;
        return cVar != null ? cVar.f15547a : this.f15790m;
    }

    private p z() {
        return this.f15781c;
    }

    public final int b() {
        return this.f15780D;
    }

    public final Proxy c() {
        return this.f15782d;
    }

    public final ProxySelector d() {
        return this.f15787j;
    }

    public final n e() {
        return this.f15788k;
    }

    public final q f() {
        return this.f15799v;
    }

    public final SocketFactory g() {
        return this.f15791n;
    }

    public final SSLSocketFactory h() {
        return this.f15792o;
    }

    public final HostnameVerifier i() {
        return this.f15794q;
    }

    public final g j() {
        return this.f15795r;
    }

    public final b k() {
        return this.f15797t;
    }

    public final b l() {
        return this.f15796s;
    }

    public final k m() {
        return this.f15798u;
    }

    public final boolean n() {
        return this.f15800w;
    }

    public final boolean o() {
        return this.f15801x;
    }

    public final boolean p() {
        return this.f15802y;
    }

    public final List<ab> q() {
        return this.f15783e;
    }

    public final List<l> r() {
        return this.f15784f;
    }

    public final r.a s() {
        return this.i;
    }

    public final a t() {
        return new a(this);
    }

    public z(a aVar) {
        boolean z3;
        this.f15781c = aVar.f15806a;
        this.f15782d = aVar.f15807b;
        this.f15783e = aVar.f15808c;
        List<l> list = aVar.f15809d;
        this.f15784f = list;
        this.f15785g = com.anythink.core.common.n.b.a.c.a(aVar.f15810e);
        this.f15786h = com.anythink.core.common.n.b.a.c.a(aVar.f15811f);
        this.i = aVar.f15812g;
        this.f15787j = aVar.f15813h;
        this.f15788k = aVar.i;
        this.f15789l = aVar.f15814j;
        this.f15790m = aVar.f15815k;
        this.f15791n = aVar.f15816l;
        Iterator<l> it = list.iterator();
        loop0: while (true) {
            z3 = false;
            while (it.hasNext()) {
                z3 = (z3 || it.next().f15671e) ? true : z3;
            }
        }
        SSLSocketFactory sSLSocketFactory = aVar.f15817m;
        if (sSLSocketFactory == null && z3) {
            X509TrustManager a9 = com.anythink.core.common.n.b.a.c.a();
            this.f15792o = a(a9);
            this.f15793p = com.anythink.core.common.n.b.a.g.c.e().a(a9);
        } else {
            this.f15792o = sSLSocketFactory;
            this.f15793p = aVar.f15818n;
        }
        if (this.f15792o != null) {
            com.anythink.core.common.n.b.a.g.c.e();
        }
        this.f15794q = aVar.f15819o;
        this.f15795r = aVar.f15820p.a(this.f15793p);
        this.f15796s = aVar.f15821q;
        this.f15797t = aVar.f15822r;
        this.f15798u = aVar.f15823s;
        this.f15799v = aVar.f15824t;
        this.f15800w = aVar.f15825u;
        this.f15801x = aVar.f15826v;
        this.f15802y = aVar.f15827w;
        this.f15803z = aVar.f15828x;
        this.f15777A = aVar.f15829y;
        this.f15778B = aVar.f15830z;
        this.f15779C = aVar.f15804A;
        this.f15780D = aVar.f15805B;
        if (this.f15785g.contains(null)) {
            throw new IllegalStateException("Null interceptor: " + this.f15785g);
        }
        if (this.f15786h.contains(null)) {
            throw new IllegalStateException("Null network interceptor: " + this.f15786h);
        }
    }

    public final int a() {
        return this.f15803z;
    }

    @Override // com.anythink.core.common.n.b.e.a
    public final e a(ad adVar) {
        return ac.a(this, adVar, false);
    }

    @Override // com.anythink.core.common.n.b.aj.a
    public final aj a(ad adVar, ak akVar) {
        com.anythink.core.common.n.b.a.k.a aVar = new com.anythink.core.common.n.b.a.k.a(adVar, akVar, new Random(), this.f15780D);
        aVar.a(this);
        return aVar;
    }
}
