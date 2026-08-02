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
    static final List<ab> f16562a = com.anythink.core.common.n.b.a.c.a(ab.HTTP_2, ab.HTTP_1_1);

    /* renamed from: b, reason: collision with root package name */
    static final List<l> f16563b = com.anythink.core.common.n.b.a.c.a(l.f16454b, l.f16456d);

    /* renamed from: A, reason: collision with root package name */
    final int f16564A;

    /* renamed from: B, reason: collision with root package name */
    final int f16565B;

    /* renamed from: C, reason: collision with root package name */
    final int f16566C;

    /* renamed from: D, reason: collision with root package name */
    final int f16567D;

    /* renamed from: c, reason: collision with root package name */
    final p f16568c;

    /* renamed from: d, reason: collision with root package name */
    final Proxy f16569d;

    /* renamed from: e, reason: collision with root package name */
    final List<ab> f16570e;

    /* renamed from: f, reason: collision with root package name */
    final List<l> f16571f;

    /* renamed from: g, reason: collision with root package name */
    final List<w> f16572g;

    /* renamed from: h, reason: collision with root package name */
    final List<w> f16573h;
    final r.a i;

    /* renamed from: j, reason: collision with root package name */
    final ProxySelector f16574j;

    /* renamed from: k, reason: collision with root package name */
    final n f16575k;

    /* renamed from: l, reason: collision with root package name */
    final c f16576l;

    /* renamed from: m, reason: collision with root package name */
    final com.anythink.core.common.n.b.a.a.f f16577m;

    /* renamed from: n, reason: collision with root package name */
    final SocketFactory f16578n;

    /* renamed from: o, reason: collision with root package name */
    final SSLSocketFactory f16579o;

    /* renamed from: p, reason: collision with root package name */
    final com.anythink.core.common.n.b.a.j.c f16580p;

    /* renamed from: q, reason: collision with root package name */
    final HostnameVerifier f16581q;

    /* renamed from: r, reason: collision with root package name */
    final g f16582r;

    /* renamed from: s, reason: collision with root package name */
    final InterfaceC0566b f16583s;

    /* renamed from: t, reason: collision with root package name */
    final InterfaceC0566b f16584t;

    /* renamed from: u, reason: collision with root package name */
    final k f16585u;

    /* renamed from: v, reason: collision with root package name */
    final q f16586v;

    /* renamed from: w, reason: collision with root package name */
    final boolean f16587w;

    /* renamed from: x, reason: collision with root package name */
    final boolean f16588x;

    /* renamed from: y, reason: collision with root package name */
    final boolean f16589y;

    /* renamed from: z, reason: collision with root package name */
    final int f16590z;

    public static final class a {

        /* renamed from: A, reason: collision with root package name */
        int f16591A;

        /* renamed from: B, reason: collision with root package name */
        int f16592B;

        /* renamed from: a, reason: collision with root package name */
        p f16593a;

        /* renamed from: b, reason: collision with root package name */
        Proxy f16594b;

        /* renamed from: c, reason: collision with root package name */
        List<ab> f16595c;

        /* renamed from: d, reason: collision with root package name */
        List<l> f16596d;

        /* renamed from: e, reason: collision with root package name */
        final List<w> f16597e;

        /* renamed from: f, reason: collision with root package name */
        final List<w> f16598f;

        /* renamed from: g, reason: collision with root package name */
        r.a f16599g;

        /* renamed from: h, reason: collision with root package name */
        ProxySelector f16600h;
        n i;

        /* renamed from: j, reason: collision with root package name */
        c f16601j;

        /* renamed from: k, reason: collision with root package name */
        com.anythink.core.common.n.b.a.a.f f16602k;

        /* renamed from: l, reason: collision with root package name */
        SocketFactory f16603l;

        /* renamed from: m, reason: collision with root package name */
        SSLSocketFactory f16604m;

        /* renamed from: n, reason: collision with root package name */
        com.anythink.core.common.n.b.a.j.c f16605n;

        /* renamed from: o, reason: collision with root package name */
        HostnameVerifier f16606o;

        /* renamed from: p, reason: collision with root package name */
        g f16607p;

        /* renamed from: q, reason: collision with root package name */
        InterfaceC0566b f16608q;

        /* renamed from: r, reason: collision with root package name */
        InterfaceC0566b f16609r;

        /* renamed from: s, reason: collision with root package name */
        k f16610s;

        /* renamed from: t, reason: collision with root package name */
        q f16611t;

        /* renamed from: u, reason: collision with root package name */
        boolean f16612u;

        /* renamed from: v, reason: collision with root package name */
        boolean f16613v;

        /* renamed from: w, reason: collision with root package name */
        boolean f16614w;

        /* renamed from: x, reason: collision with root package name */
        int f16615x;

        /* renamed from: y, reason: collision with root package name */
        int f16616y;

        /* renamed from: z, reason: collision with root package name */
        int f16617z;

        public a() {
            this.f16597e = new ArrayList();
            this.f16598f = new ArrayList();
            this.f16593a = new p();
            this.f16595c = z.f16562a;
            this.f16596d = z.f16563b;
            this.f16599g = r.a(r.f16496a);
            ProxySelector proxySelector = ProxySelector.getDefault();
            this.f16600h = proxySelector;
            if (proxySelector == null) {
                this.f16600h = new com.anythink.core.common.n.b.a.h.a();
            }
            this.i = n.f16486a;
            this.f16603l = SocketFactory.getDefault();
            this.f16606o = com.anythink.core.common.n.b.a.j.e.f16162a;
            this.f16607p = g.f16392a;
            InterfaceC0566b interfaceC0566b = InterfaceC0566b.f16329a;
            this.f16608q = interfaceC0566b;
            this.f16609r = interfaceC0566b;
            this.f16610s = new k();
            this.f16611t = q.f16495a;
            this.f16612u = true;
            this.f16613v = true;
            this.f16614w = true;
            this.f16615x = 0;
            this.f16616y = 10000;
            this.f16617z = 10000;
            this.f16591A = 10000;
            this.f16592B = 0;
        }

        private a a(Duration duration) {
            long millis;
            if (Build.VERSION.SDK_INT >= 26) {
                millis = duration.toMillis();
                this.f16615x = com.anythink.core.common.n.b.a.c.a("timeout", millis, TimeUnit.MILLISECONDS);
            }
            return this;
        }

        private a b(Duration duration) {
            long millis;
            if (Build.VERSION.SDK_INT >= 26) {
                millis = duration.toMillis();
                this.f16616y = com.anythink.core.common.n.b.a.c.a("timeout", millis, TimeUnit.MILLISECONDS);
            }
            return this;
        }

        private a c(Duration duration) {
            long millis;
            if (Build.VERSION.SDK_INT >= 26) {
                millis = duration.toMillis();
                this.f16617z = com.anythink.core.common.n.b.a.c.a("timeout", millis, TimeUnit.MILLISECONDS);
            }
            return this;
        }

        private a d(long j6, TimeUnit timeUnit) {
            this.f16615x = com.anythink.core.common.n.b.a.c.a("timeout", j6, timeUnit);
            return this;
        }

        private a e(long j6, TimeUnit timeUnit) {
            this.f16592B = com.anythink.core.common.n.b.a.c.a("interval", j6, timeUnit);
            return this;
        }

        private a d(Duration duration) {
            long millis;
            if (Build.VERSION.SDK_INT >= 26) {
                millis = duration.toMillis();
                this.f16591A = com.anythink.core.common.n.b.a.c.a("timeout", millis, TimeUnit.MILLISECONDS);
            }
            return this;
        }

        private a e(Duration duration) {
            long millis;
            if (Build.VERSION.SDK_INT >= 26) {
                millis = duration.toMillis();
                this.f16592B = com.anythink.core.common.n.b.a.c.a("timeout", millis, TimeUnit.MILLISECONDS);
            }
            return this;
        }

        public final a a(long j6, TimeUnit timeUnit) {
            this.f16616y = com.anythink.core.common.n.b.a.c.a("timeout", j6, timeUnit);
            return this;
        }

        public final a b(long j6, TimeUnit timeUnit) {
            this.f16617z = com.anythink.core.common.n.b.a.c.a("timeout", j6, timeUnit);
            return this;
        }

        public final a c(long j6, TimeUnit timeUnit) {
            this.f16591A = com.anythink.core.common.n.b.a.c.a("timeout", j6, timeUnit);
            return this;
        }

        private a a(Proxy proxy) {
            this.f16594b = proxy;
            return this;
        }

        private a b(InterfaceC0566b interfaceC0566b) {
            if (interfaceC0566b != null) {
                this.f16608q = interfaceC0566b;
                return this;
            }
            throw new NullPointerException("proxyAuthenticator == null");
        }

        private a c(boolean z6) {
            this.f16614w = z6;
            return this;
        }

        private a a(ProxySelector proxySelector) {
            if (proxySelector != null) {
                this.f16600h = proxySelector;
                return this;
            }
            throw new NullPointerException("proxySelector == null");
        }

        private List<w> c() {
            return this.f16598f;
        }

        private a b(boolean z6) {
            this.f16613v = z6;
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
            this.f16596d = com.anythink.core.common.n.b.a.c.a(list);
            return this;
        }

        private List<w> b() {
            return this.f16597e;
        }

        private a a(c cVar) {
            this.f16601j = cVar;
            this.f16602k = null;
            return this;
        }

        private a b(w wVar) {
            if (wVar != null) {
                this.f16598f.add(wVar);
                return this;
            }
            throw new IllegalArgumentException("interceptor == null");
        }

        public final a a(q qVar) {
            this.f16611t = qVar;
            return this;
        }

        private a a(SocketFactory socketFactory) {
            if (socketFactory != null) {
                if (!(socketFactory instanceof SSLSocketFactory)) {
                    this.f16603l = socketFactory;
                    return this;
                }
                throw new IllegalArgumentException("socketFactory instanceof SSLSocketFactory");
            }
            throw new NullPointerException("socketFactory == null");
        }

        private a a(SSLSocketFactory sSLSocketFactory) {
            if (sSLSocketFactory != null) {
                this.f16604m = sSLSocketFactory;
                this.f16605n = com.anythink.core.common.n.b.a.g.c.e().b(sSLSocketFactory);
                return this;
            }
            throw new NullPointerException("sslSocketFactory == null");
        }

        private a a(SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager) {
            if (sSLSocketFactory == null) {
                throw new NullPointerException("sslSocketFactory == null");
            }
            if (x509TrustManager != null) {
                this.f16604m = sSLSocketFactory;
                this.f16605n = com.anythink.core.common.n.b.a.g.c.e().a(x509TrustManager);
                return this;
            }
            throw new NullPointerException("trustManager == null");
        }

        private a a(HostnameVerifier hostnameVerifier) {
            if (hostnameVerifier != null) {
                this.f16606o = hostnameVerifier;
                return this;
            }
            throw new NullPointerException("hostnameVerifier == null");
        }

        public a(z zVar) {
            ArrayList arrayList = new ArrayList();
            this.f16597e = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.f16598f = arrayList2;
            this.f16593a = zVar.f16568c;
            this.f16594b = zVar.f16569d;
            this.f16595c = zVar.f16570e;
            this.f16596d = zVar.f16571f;
            arrayList.addAll(zVar.f16572g);
            arrayList2.addAll(zVar.f16573h);
            this.f16599g = zVar.i;
            this.f16600h = zVar.f16574j;
            this.i = zVar.f16575k;
            this.f16602k = zVar.f16577m;
            this.f16601j = zVar.f16576l;
            this.f16603l = zVar.f16578n;
            this.f16604m = zVar.f16579o;
            this.f16605n = zVar.f16580p;
            this.f16606o = zVar.f16581q;
            this.f16607p = zVar.f16582r;
            this.f16608q = zVar.f16583s;
            this.f16609r = zVar.f16584t;
            this.f16610s = zVar.f16585u;
            this.f16611t = zVar.f16586v;
            this.f16612u = zVar.f16587w;
            this.f16613v = zVar.f16588x;
            this.f16614w = zVar.f16589y;
            this.f16615x = zVar.f16590z;
            this.f16616y = zVar.f16564A;
            this.f16617z = zVar.f16565B;
            this.f16591A = zVar.f16566C;
            this.f16592B = zVar.f16567D;
        }

        private a a(g gVar) {
            if (gVar != null) {
                this.f16607p = gVar;
                return this;
            }
            throw new NullPointerException("certificatePinner == null");
        }

        private a a(InterfaceC0566b interfaceC0566b) {
            if (interfaceC0566b != null) {
                this.f16609r = interfaceC0566b;
                return this;
            }
            throw new NullPointerException("authenticator == null");
        }

        public final a a(k kVar) {
            if (kVar != null) {
                this.f16610s = kVar;
                return this;
            }
            throw new NullPointerException("connectionPool == null");
        }

        private a a(boolean z6) {
            this.f16612u = z6;
            return this;
        }

        public final a a(p pVar) {
            this.f16593a = pVar;
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
                    this.f16595c = Collections.unmodifiableList(arrayList);
                    return this;
                }
                throw new IllegalArgumentException("protocols must not contain null");
            }
            throw new IllegalArgumentException("protocols must not contain http/1.0: ".concat(String.valueOf(arrayList)));
        }

        private a a(w wVar) {
            if (wVar != null) {
                this.f16597e.add(wVar);
                return this;
            }
            throw new IllegalArgumentException("interceptor == null");
        }

        public final a a(r rVar) {
            if (rVar != null) {
                this.f16599g = r.a(rVar);
                return this;
            }
            throw new NullPointerException("eventListener == null");
        }

        private a a(r.a aVar) {
            if (aVar != null) {
                this.f16599g = aVar;
                return this;
            }
            throw new NullPointerException("eventListenerFactory == null");
        }

        public final z a() {
            return new z(this);
        }
    }

    static {
        com.anythink.core.common.n.b.a.a.f15656a = new com.anythink.core.common.n.b.a.a() { // from class: com.anythink.core.common.n.b.z.1
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
                return kVar.f16452a;
            }

            @Override // com.anythink.core.common.n.b.a.a
            public final boolean a(C0565a c0565a, C0565a c0565a2) {
                return c0565a.a(c0565a2);
            }

            @Override // com.anythink.core.common.n.b.a.a
            public final int a(af.a aVar) {
                return aVar.f16301c;
            }

            @Override // com.anythink.core.common.n.b.a.a
            public final e a(z zVar, ad adVar) {
                return ac.a(zVar, adVar, true);
            }

            @Override // com.anythink.core.common.n.b.a.a
            public final com.anythink.core.common.n.b.a.b.c a(af afVar) {
                return afVar.f16297m;
            }

            @Override // com.anythink.core.common.n.b.a.a
            public final void a(l lVar, SSLSocket sSLSocket, boolean z6) {
                String[] enabledCipherSuites;
                String[] enabledProtocols;
                if (lVar.f16460g != null) {
                    enabledCipherSuites = com.anythink.core.common.n.b.a.c.a(i.f16427a, sSLSocket.getEnabledCipherSuites(), lVar.f16460g);
                } else {
                    enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
                }
                if (lVar.f16461h != null) {
                    enabledProtocols = com.anythink.core.common.n.b.a.c.a(com.anythink.core.common.n.b.a.c.f15829g, sSLSocket.getEnabledProtocols(), lVar.f16461h);
                } else {
                    enabledProtocols = sSLSocket.getEnabledProtocols();
                }
                String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
                int a9 = com.anythink.core.common.n.b.a.c.a(i.f16427a, supportedCipherSuites, "TLS_FALLBACK_SCSV");
                if (z6 && a9 != -1) {
                    enabledCipherSuites = com.anythink.core.common.n.b.a.c.a(enabledCipherSuites, supportedCipherSuites[a9]);
                }
                l b9 = new l.a(lVar).a(enabledCipherSuites).b(enabledProtocols).b();
                String[] strArr = b9.f16461h;
                if (strArr != null) {
                    sSLSocket.setEnabledProtocols(strArr);
                }
                String[] strArr2 = b9.f16460g;
                if (strArr2 != null) {
                    sSLSocket.setEnabledCipherSuites(strArr2);
                }
            }

            @Override // com.anythink.core.common.n.b.a.a
            public final void a(af.a aVar, com.anythink.core.common.n.b.a.b.c cVar) {
                aVar.f16310m = cVar;
            }
        };
    }

    public z() {
        this(new a());
    }

    private List<w> A() {
        return this.f16572g;
    }

    private List<w> B() {
        return this.f16573h;
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
        return this.f16564A;
    }

    private int v() {
        return this.f16565B;
    }

    private int w() {
        return this.f16566C;
    }

    private c x() {
        return this.f16576l;
    }

    private com.anythink.core.common.n.b.a.a.f y() {
        c cVar = this.f16576l;
        return cVar != null ? cVar.f16334a : this.f16577m;
    }

    private p z() {
        return this.f16568c;
    }

    public final int b() {
        return this.f16567D;
    }

    public final Proxy c() {
        return this.f16569d;
    }

    public final ProxySelector d() {
        return this.f16574j;
    }

    public final n e() {
        return this.f16575k;
    }

    public final q f() {
        return this.f16586v;
    }

    public final SocketFactory g() {
        return this.f16578n;
    }

    public final SSLSocketFactory h() {
        return this.f16579o;
    }

    public final HostnameVerifier i() {
        return this.f16581q;
    }

    public final g j() {
        return this.f16582r;
    }

    public final InterfaceC0566b k() {
        return this.f16584t;
    }

    public final InterfaceC0566b l() {
        return this.f16583s;
    }

    public final k m() {
        return this.f16585u;
    }

    public final boolean n() {
        return this.f16587w;
    }

    public final boolean o() {
        return this.f16588x;
    }

    public final boolean p() {
        return this.f16589y;
    }

    public final List<ab> q() {
        return this.f16570e;
    }

    public final List<l> r() {
        return this.f16571f;
    }

    public final r.a s() {
        return this.i;
    }

    public final a t() {
        return new a(this);
    }

    public z(a aVar) {
        boolean z6;
        this.f16568c = aVar.f16593a;
        this.f16569d = aVar.f16594b;
        this.f16570e = aVar.f16595c;
        List<l> list = aVar.f16596d;
        this.f16571f = list;
        this.f16572g = com.anythink.core.common.n.b.a.c.a(aVar.f16597e);
        this.f16573h = com.anythink.core.common.n.b.a.c.a(aVar.f16598f);
        this.i = aVar.f16599g;
        this.f16574j = aVar.f16600h;
        this.f16575k = aVar.i;
        this.f16576l = aVar.f16601j;
        this.f16577m = aVar.f16602k;
        this.f16578n = aVar.f16603l;
        Iterator<l> it = list.iterator();
        loop0: while (true) {
            z6 = false;
            while (it.hasNext()) {
                z6 = (z6 || it.next().f16458e) ? true : z6;
            }
        }
        SSLSocketFactory sSLSocketFactory = aVar.f16604m;
        if (sSLSocketFactory == null && z6) {
            X509TrustManager a9 = com.anythink.core.common.n.b.a.c.a();
            this.f16579o = a(a9);
            this.f16580p = com.anythink.core.common.n.b.a.g.c.e().a(a9);
        } else {
            this.f16579o = sSLSocketFactory;
            this.f16580p = aVar.f16605n;
        }
        if (this.f16579o != null) {
            com.anythink.core.common.n.b.a.g.c.e();
        }
        this.f16581q = aVar.f16606o;
        this.f16582r = aVar.f16607p.a(this.f16580p);
        this.f16583s = aVar.f16608q;
        this.f16584t = aVar.f16609r;
        this.f16585u = aVar.f16610s;
        this.f16586v = aVar.f16611t;
        this.f16587w = aVar.f16612u;
        this.f16588x = aVar.f16613v;
        this.f16589y = aVar.f16614w;
        this.f16590z = aVar.f16615x;
        this.f16564A = aVar.f16616y;
        this.f16565B = aVar.f16617z;
        this.f16566C = aVar.f16591A;
        this.f16567D = aVar.f16592B;
        if (this.f16572g.contains(null)) {
            throw new IllegalStateException("Null interceptor: " + this.f16572g);
        }
        if (this.f16573h.contains(null)) {
            throw new IllegalStateException("Null network interceptor: " + this.f16573h);
        }
    }

    public final int a() {
        return this.f16590z;
    }

    @Override // com.anythink.core.common.n.b.e.a
    public final e a(ad adVar) {
        return ac.a(this, adVar, false);
    }

    @Override // com.anythink.core.common.n.b.aj.a
    public final aj a(ad adVar, ak akVar) {
        com.anythink.core.common.n.b.a.k.a aVar = new com.anythink.core.common.n.b.a.k.a(adVar, akVar, new Random(), this.f16567D);
        aVar.a(this);
        return aVar;
    }
}
