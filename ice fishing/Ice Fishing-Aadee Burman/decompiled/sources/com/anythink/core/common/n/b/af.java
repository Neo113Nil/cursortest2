package com.anythink.core.common.n.b;

import com.anythink.basead.ui.BaseATView;
import com.anythink.core.common.n.b.u;
import com.icefishing.icefishinglive2.AbstractC4404f;
import java.io.Closeable;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class af implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    final ad f15499a;

    /* renamed from: b, reason: collision with root package name */
    final ab f15500b;

    /* renamed from: c, reason: collision with root package name */
    final int f15501c;

    /* renamed from: d, reason: collision with root package name */
    final String f15502d;

    /* renamed from: e, reason: collision with root package name */
    final t f15503e;

    /* renamed from: f, reason: collision with root package name */
    final u f15504f;

    /* renamed from: g, reason: collision with root package name */
    final ag f15505g;

    /* renamed from: h, reason: collision with root package name */
    final af f15506h;
    final af i;

    /* renamed from: j, reason: collision with root package name */
    final af f15507j;

    /* renamed from: k, reason: collision with root package name */
    final long f15508k;

    /* renamed from: l, reason: collision with root package name */
    final long f15509l;

    /* renamed from: m, reason: collision with root package name */
    final com.anythink.core.common.n.b.a.b.c f15510m;

    /* renamed from: n, reason: collision with root package name */
    private volatile d f15511n;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        ad f15512a;

        /* renamed from: b, reason: collision with root package name */
        ab f15513b;

        /* renamed from: c, reason: collision with root package name */
        int f15514c;

        /* renamed from: d, reason: collision with root package name */
        String f15515d;

        /* renamed from: e, reason: collision with root package name */
        t f15516e;

        /* renamed from: f, reason: collision with root package name */
        u.a f15517f;

        /* renamed from: g, reason: collision with root package name */
        ag f15518g;

        /* renamed from: h, reason: collision with root package name */
        af f15519h;
        af i;

        /* renamed from: j, reason: collision with root package name */
        af f15520j;

        /* renamed from: k, reason: collision with root package name */
        long f15521k;

        /* renamed from: l, reason: collision with root package name */
        long f15522l;

        /* renamed from: m, reason: collision with root package name */
        com.anythink.core.common.n.b.a.b.c f15523m;

        public a() {
            this.f15514c = -1;
            this.f15517f = new u.a();
        }

        private static void d(af afVar) {
            if (afVar.f15505g != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        public final a a(ad adVar) {
            this.f15512a = adVar;
            return this;
        }

        public final a b(String str, String str2) {
            this.f15517f.a(str, str2);
            return this;
        }

        public final a c(af afVar) {
            if (afVar != null && afVar.f15505g != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
            this.f15520j = afVar;
            return this;
        }

        private a b(String str) {
            this.f15517f.b(str);
            return this;
        }

        public final a a(ab abVar) {
            this.f15513b = abVar;
            return this;
        }

        public final a a(int i) {
            this.f15514c = i;
            return this;
        }

        public final a b(af afVar) {
            if (afVar != null) {
                a("cacheResponse", afVar);
            }
            this.i = afVar;
            return this;
        }

        public a(af afVar) {
            this.f15514c = -1;
            this.f15512a = afVar.f15499a;
            this.f15513b = afVar.f15500b;
            this.f15514c = afVar.f15501c;
            this.f15515d = afVar.f15502d;
            this.f15516e = afVar.f15503e;
            this.f15517f = afVar.f15504f.b();
            this.f15518g = afVar.f15505g;
            this.f15519h = afVar.f15506h;
            this.i = afVar.i;
            this.f15520j = afVar.f15507j;
            this.f15521k = afVar.f15508k;
            this.f15522l = afVar.f15509l;
            this.f15523m = afVar.f15510m;
        }

        public final a a(String str) {
            this.f15515d = str;
            return this;
        }

        public final a a(t tVar) {
            this.f15516e = tVar;
            return this;
        }

        public final a b(long j6) {
            this.f15522l = j6;
            return this;
        }

        public final a a(String str, String str2) {
            this.f15517f.d(str, str2);
            return this;
        }

        public final a a(u uVar) {
            this.f15517f = uVar.b();
            return this;
        }

        public final a a(ag agVar) {
            this.f15518g = agVar;
            return this;
        }

        public final a a(af afVar) {
            if (afVar != null) {
                a("networkResponse", afVar);
            }
            this.f15519h = afVar;
            return this;
        }

        private static void a(String str, af afVar) {
            if (afVar.f15505g == null) {
                if (afVar.f15506h == null) {
                    if (afVar.i == null) {
                        if (afVar.f15507j != null) {
                            throw new IllegalArgumentException(AbstractC4404f.f(str, ".priorResponse != null"));
                        }
                        return;
                    }
                    throw new IllegalArgumentException(AbstractC4404f.f(str, ".cacheResponse != null"));
                }
                throw new IllegalArgumentException(AbstractC4404f.f(str, ".networkResponse != null"));
            }
            throw new IllegalArgumentException(AbstractC4404f.f(str, ".body != null"));
        }

        public final a a(long j6) {
            this.f15521k = j6;
            return this;
        }

        private void a(com.anythink.core.common.n.b.a.b.c cVar) {
            this.f15523m = cVar;
        }

        public final af a() {
            if (this.f15512a != null) {
                if (this.f15513b != null) {
                    if (this.f15514c >= 0) {
                        if (this.f15515d != null) {
                            return new af(this);
                        }
                        throw new IllegalStateException("message == null");
                    }
                    throw new IllegalStateException("code < 0: " + this.f15514c);
                }
                throw new IllegalStateException("protocol == null");
            }
            throw new IllegalStateException("request == null");
        }
    }

    public af(a aVar) {
        this.f15499a = aVar.f15512a;
        this.f15500b = aVar.f15513b;
        this.f15501c = aVar.f15514c;
        this.f15502d = aVar.f15515d;
        this.f15503e = aVar.f15516e;
        this.f15504f = aVar.f15517f.a();
        this.f15505g = aVar.f15518g;
        this.f15506h = aVar.f15519h;
        this.i = aVar.i;
        this.f15507j = aVar.f15520j;
        this.f15508k = aVar.f15521k;
        this.f15509l = aVar.f15522l;
        this.f15510m = aVar.f15523m;
    }

    private boolean n() {
        int i = this.f15501c;
        return i >= 200 && i < 300;
    }

    private u o() {
        com.anythink.core.common.n.b.a.b.c cVar = this.f15510m;
        if (cVar != null) {
            return cVar.e();
        }
        throw new IllegalStateException("trailers not available");
    }

    private boolean p() {
        int i = this.f15501c;
        if (i == 307 || i == 308) {
            return true;
        }
        switch (i) {
            case 300:
            case BaseATView.a.f9775L /* 301 */:
            case 302:
            case BaseATView.a.f9777N /* 303 */:
                return true;
            default:
                return false;
        }
    }

    private af q() {
        return this.i;
    }

    private List<h> r() {
        String str;
        int i = this.f15501c;
        if (i == 401) {
            str = "WWW-Authenticate";
        } else {
            if (i != 407) {
                return Collections.EMPTY_LIST;
            }
            str = "Proxy-Authenticate";
        }
        return com.anythink.core.common.n.b.a.c.e.a(this.f15504f, str);
    }

    public final ad a() {
        return this.f15499a;
    }

    public final ab b() {
        return this.f15500b;
    }

    public final int c() {
        return this.f15501c;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ag agVar = this.f15505g;
        if (agVar == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        agVar.close();
    }

    public final String d() {
        return this.f15502d;
    }

    public final t e() {
        return this.f15503e;
    }

    public final u f() {
        return this.f15504f;
    }

    public final ag g() {
        return this.f15505g;
    }

    public final a h() {
        return new a(this);
    }

    public final af i() {
        return this.f15506h;
    }

    public final af j() {
        return this.f15507j;
    }

    public final d k() {
        d dVar = this.f15511n;
        if (dVar != null) {
            return dVar;
        }
        d a9 = d.a(this.f15504f);
        this.f15511n = a9;
        return a9;
    }

    public final long l() {
        return this.f15508k;
    }

    public final long m() {
        return this.f15509l;
    }

    public final String toString() {
        return "Response{protocol=" + this.f15500b + ", code=" + this.f15501c + ", message=" + this.f15502d + ", url=" + this.f15499a.f15480a + '}';
    }

    private String a(String str, String str2) {
        String a9 = this.f15504f.a(str);
        return a9 != null ? a9 : str2;
    }

    private List<String> b(String str) {
        return this.f15504f.b(str);
    }

    private ag a(long j6) {
        com.anythink.core.common.n.c.e h9 = this.f15505g.c().h();
        com.anythink.core.common.n.c.c cVar = new com.anythink.core.common.n.c.c();
        h9.b(j6);
        cVar.a(h9, Math.min(j6, h9.d().b()));
        return ag.a(this.f15505g.a(), cVar.b(), cVar);
    }

    public final String a(String str) {
        String a9 = this.f15504f.a(str);
        if (a9 != null) {
            return a9;
        }
        return null;
    }
}
