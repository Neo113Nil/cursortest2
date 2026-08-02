package com.anythink.core.common.n.b;

import com.anythink.basead.ui.BaseATView;
import com.anythink.core.common.n.b.u;
import com.google.android.gms.internal.ads.Wv;
import java.io.Closeable;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class af implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    final ad f16286a;

    /* renamed from: b, reason: collision with root package name */
    final ab f16287b;

    /* renamed from: c, reason: collision with root package name */
    final int f16288c;

    /* renamed from: d, reason: collision with root package name */
    final String f16289d;

    /* renamed from: e, reason: collision with root package name */
    final t f16290e;

    /* renamed from: f, reason: collision with root package name */
    final u f16291f;

    /* renamed from: g, reason: collision with root package name */
    final ag f16292g;

    /* renamed from: h, reason: collision with root package name */
    final af f16293h;
    final af i;

    /* renamed from: j, reason: collision with root package name */
    final af f16294j;

    /* renamed from: k, reason: collision with root package name */
    final long f16295k;

    /* renamed from: l, reason: collision with root package name */
    final long f16296l;

    /* renamed from: m, reason: collision with root package name */
    final com.anythink.core.common.n.b.a.b.c f16297m;

    /* renamed from: n, reason: collision with root package name */
    private volatile d f16298n;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        ad f16299a;

        /* renamed from: b, reason: collision with root package name */
        ab f16300b;

        /* renamed from: c, reason: collision with root package name */
        int f16301c;

        /* renamed from: d, reason: collision with root package name */
        String f16302d;

        /* renamed from: e, reason: collision with root package name */
        t f16303e;

        /* renamed from: f, reason: collision with root package name */
        u.a f16304f;

        /* renamed from: g, reason: collision with root package name */
        ag f16305g;

        /* renamed from: h, reason: collision with root package name */
        af f16306h;
        af i;

        /* renamed from: j, reason: collision with root package name */
        af f16307j;

        /* renamed from: k, reason: collision with root package name */
        long f16308k;

        /* renamed from: l, reason: collision with root package name */
        long f16309l;

        /* renamed from: m, reason: collision with root package name */
        com.anythink.core.common.n.b.a.b.c f16310m;

        public a() {
            this.f16301c = -1;
            this.f16304f = new u.a();
        }

        private static void d(af afVar) {
            if (afVar.f16292g != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        public final a a(ad adVar) {
            this.f16299a = adVar;
            return this;
        }

        public final a b(String str, String str2) {
            this.f16304f.a(str, str2);
            return this;
        }

        public final a c(af afVar) {
            if (afVar != null && afVar.f16292g != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
            this.f16307j = afVar;
            return this;
        }

        private a b(String str) {
            this.f16304f.b(str);
            return this;
        }

        public final a a(ab abVar) {
            this.f16300b = abVar;
            return this;
        }

        public final a a(int i) {
            this.f16301c = i;
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
            this.f16301c = -1;
            this.f16299a = afVar.f16286a;
            this.f16300b = afVar.f16287b;
            this.f16301c = afVar.f16288c;
            this.f16302d = afVar.f16289d;
            this.f16303e = afVar.f16290e;
            this.f16304f = afVar.f16291f.b();
            this.f16305g = afVar.f16292g;
            this.f16306h = afVar.f16293h;
            this.i = afVar.i;
            this.f16307j = afVar.f16294j;
            this.f16308k = afVar.f16295k;
            this.f16309l = afVar.f16296l;
            this.f16310m = afVar.f16297m;
        }

        public final a a(String str) {
            this.f16302d = str;
            return this;
        }

        public final a a(t tVar) {
            this.f16303e = tVar;
            return this;
        }

        public final a b(long j6) {
            this.f16309l = j6;
            return this;
        }

        public final a a(String str, String str2) {
            this.f16304f.d(str, str2);
            return this;
        }

        public final a a(u uVar) {
            this.f16304f = uVar.b();
            return this;
        }

        public final a a(ag agVar) {
            this.f16305g = agVar;
            return this;
        }

        public final a a(af afVar) {
            if (afVar != null) {
                a("networkResponse", afVar);
            }
            this.f16306h = afVar;
            return this;
        }

        private static void a(String str, af afVar) {
            if (afVar.f16292g == null) {
                if (afVar.f16293h == null) {
                    if (afVar.i == null) {
                        if (afVar.f16294j != null) {
                            throw new IllegalArgumentException(Wv.g(str, ".priorResponse != null"));
                        }
                        return;
                    }
                    throw new IllegalArgumentException(Wv.g(str, ".cacheResponse != null"));
                }
                throw new IllegalArgumentException(Wv.g(str, ".networkResponse != null"));
            }
            throw new IllegalArgumentException(Wv.g(str, ".body != null"));
        }

        public final a a(long j6) {
            this.f16308k = j6;
            return this;
        }

        private void a(com.anythink.core.common.n.b.a.b.c cVar) {
            this.f16310m = cVar;
        }

        public final af a() {
            if (this.f16299a != null) {
                if (this.f16300b != null) {
                    if (this.f16301c >= 0) {
                        if (this.f16302d != null) {
                            return new af(this);
                        }
                        throw new IllegalStateException("message == null");
                    }
                    throw new IllegalStateException("code < 0: " + this.f16301c);
                }
                throw new IllegalStateException("protocol == null");
            }
            throw new IllegalStateException("request == null");
        }
    }

    public af(a aVar) {
        this.f16286a = aVar.f16299a;
        this.f16287b = aVar.f16300b;
        this.f16288c = aVar.f16301c;
        this.f16289d = aVar.f16302d;
        this.f16290e = aVar.f16303e;
        this.f16291f = aVar.f16304f.a();
        this.f16292g = aVar.f16305g;
        this.f16293h = aVar.f16306h;
        this.i = aVar.i;
        this.f16294j = aVar.f16307j;
        this.f16295k = aVar.f16308k;
        this.f16296l = aVar.f16309l;
        this.f16297m = aVar.f16310m;
    }

    private boolean n() {
        int i = this.f16288c;
        return i >= 200 && i < 300;
    }

    private u o() {
        com.anythink.core.common.n.b.a.b.c cVar = this.f16297m;
        if (cVar != null) {
            return cVar.e();
        }
        throw new IllegalStateException("trailers not available");
    }

    private boolean p() {
        int i = this.f16288c;
        if (i == 307 || i == 308) {
            return true;
        }
        switch (i) {
            case 300:
            case BaseATView.a.f10561L /* 301 */:
            case 302:
            case BaseATView.a.f10563N /* 303 */:
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
        int i = this.f16288c;
        if (i == 401) {
            str = "WWW-Authenticate";
        } else {
            if (i != 407) {
                return Collections.EMPTY_LIST;
            }
            str = "Proxy-Authenticate";
        }
        return com.anythink.core.common.n.b.a.c.e.a(this.f16291f, str);
    }

    public final ad a() {
        return this.f16286a;
    }

    public final ab b() {
        return this.f16287b;
    }

    public final int c() {
        return this.f16288c;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ag agVar = this.f16292g;
        if (agVar == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        agVar.close();
    }

    public final String d() {
        return this.f16289d;
    }

    public final t e() {
        return this.f16290e;
    }

    public final u f() {
        return this.f16291f;
    }

    public final ag g() {
        return this.f16292g;
    }

    public final a h() {
        return new a(this);
    }

    public final af i() {
        return this.f16293h;
    }

    public final af j() {
        return this.f16294j;
    }

    public final d k() {
        d dVar = this.f16298n;
        if (dVar != null) {
            return dVar;
        }
        d a9 = d.a(this.f16291f);
        this.f16298n = a9;
        return a9;
    }

    public final long l() {
        return this.f16295k;
    }

    public final long m() {
        return this.f16296l;
    }

    public final String toString() {
        return "Response{protocol=" + this.f16287b + ", code=" + this.f16288c + ", message=" + this.f16289d + ", url=" + this.f16286a.f16267a + '}';
    }

    private String a(String str, String str2) {
        String a9 = this.f16291f.a(str);
        return a9 != null ? a9 : str2;
    }

    private List<String> b(String str) {
        return this.f16291f.b(str);
    }

    private ag a(long j6) {
        com.anythink.core.common.n.c.e h3 = this.f16292g.c().h();
        com.anythink.core.common.n.c.c cVar = new com.anythink.core.common.n.c.c();
        h3.b(j6);
        cVar.a(h3, Math.min(j6, h3.d().b()));
        return ag.a(this.f16292g.a(), cVar.b(), cVar);
    }

    public final String a(String str) {
        String a9 = this.f16291f.a(str);
        if (a9 != null) {
            return a9;
        }
        return null;
    }
}
