package com.anythink.core.common.n.b.a.e;

import com.anythink.core.common.n.b.a.e.i;
import com.anythink.core.common.n.b.ab;
import com.anythink.core.common.n.b.ad;
import com.anythink.core.common.n.b.af;
import com.anythink.core.common.n.b.u;
import com.anythink.core.common.n.b.w;
import com.anythink.core.common.n.b.z;
import com.anythink.core.common.n.c.v;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class g implements com.anythink.core.common.n.b.a.c.c {

    /* renamed from: l, reason: collision with root package name */
    private final w.a f15267l;

    /* renamed from: m, reason: collision with root package name */
    private final com.anythink.core.common.n.b.a.b.e f15268m;

    /* renamed from: n, reason: collision with root package name */
    private final f f15269n;

    /* renamed from: o, reason: collision with root package name */
    private volatile i f15270o;

    /* renamed from: p, reason: collision with root package name */
    private final ab f15271p;

    /* renamed from: q, reason: collision with root package name */
    private volatile boolean f15272q;

    /* renamed from: b, reason: collision with root package name */
    private static final String f15258b = "connection";

    /* renamed from: c, reason: collision with root package name */
    private static final String f15259c = "host";

    /* renamed from: d, reason: collision with root package name */
    private static final String f15260d = "keep-alive";

    /* renamed from: e, reason: collision with root package name */
    private static final String f15261e = "proxy-connection";

    /* renamed from: g, reason: collision with root package name */
    private static final String f15263g = "te";

    /* renamed from: f, reason: collision with root package name */
    private static final String f15262f = "transfer-encoding";

    /* renamed from: h, reason: collision with root package name */
    private static final String f15264h = "encoding";
    private static final String i = "upgrade";

    /* renamed from: j, reason: collision with root package name */
    private static final List<String> f15265j = com.anythink.core.common.n.b.a.c.a(f15258b, f15259c, f15260d, f15261e, f15263g, f15262f, f15264h, i, c.f15125c, c.f15126d, c.f15127e, c.f15128f);

    /* renamed from: k, reason: collision with root package name */
    private static final List<String> f15266k = com.anythink.core.common.n.b.a.c.a(f15258b, f15259c, f15260d, f15261e, f15263g, f15262f, f15264h, i);

    public g(z zVar, com.anythink.core.common.n.b.a.b.e eVar, w.a aVar, f fVar) {
        this.f15268m = eVar;
        this.f15267l = aVar;
        this.f15269n = fVar;
        List<ab> q8 = zVar.q();
        ab abVar = ab.H2_PRIOR_KNOWLEDGE;
        this.f15271p = q8.contains(abVar) ? abVar : ab.HTTP_2;
    }

    @Override // com.anythink.core.common.n.b.a.c.c
    public final com.anythink.core.common.n.b.a.b.e a() {
        return this.f15268m;
    }

    @Override // com.anythink.core.common.n.b.a.c.c
    public final void b() {
        this.f15269n.f15207r.b();
    }

    @Override // com.anythink.core.common.n.b.a.c.c
    public final void c() {
        this.f15270o.f().close();
    }

    @Override // com.anythink.core.common.n.b.a.c.c
    public final u d() {
        return this.f15270o.d();
    }

    @Override // com.anythink.core.common.n.b.a.c.c
    public final void e() {
        this.f15272q = true;
        if (this.f15270o != null) {
            this.f15270o.a(b.CANCEL);
        }
    }

    @Override // com.anythink.core.common.n.b.a.c.c
    public final v a(ad adVar, long j6) {
        return this.f15270o.f();
    }

    private static List<c> b(ad adVar) {
        u c9 = adVar.c();
        ArrayList arrayList = new ArrayList(c9.a() + 4);
        arrayList.add(new c(c.f15130h, adVar.b()));
        arrayList.add(new c(c.i, com.anythink.core.common.n.b.a.c.i.a(adVar.a())));
        String a9 = adVar.a("Host");
        if (a9 != null) {
            arrayList.add(new c(c.f15132k, a9));
        }
        arrayList.add(new c(c.f15131j, adVar.a().b()));
        int a10 = c9.a();
        for (int i6 = 0; i6 < a10; i6++) {
            String lowerCase = c9.a(i6).toLowerCase(Locale.US);
            if (!f15265j.contains(lowerCase) || (lowerCase.equals(f15263g) && c9.b(i6).equals("trailers"))) {
                arrayList.add(new c(lowerCase, c9.b(i6)));
            }
        }
        return arrayList;
    }

    @Override // com.anythink.core.common.n.b.a.c.c
    public final void a(ad adVar) {
        if (this.f15270o != null) {
            return;
        }
        boolean z3 = adVar.d() != null;
        u c9 = adVar.c();
        ArrayList arrayList = new ArrayList(c9.a() + 4);
        arrayList.add(new c(c.f15130h, adVar.b()));
        arrayList.add(new c(c.i, com.anythink.core.common.n.b.a.c.i.a(adVar.a())));
        String a9 = adVar.a("Host");
        if (a9 != null) {
            arrayList.add(new c(c.f15132k, a9));
        }
        arrayList.add(new c(c.f15131j, adVar.a().b()));
        int a10 = c9.a();
        for (int i6 = 0; i6 < a10; i6++) {
            String lowerCase = c9.a(i6).toLowerCase(Locale.US);
            if (!f15265j.contains(lowerCase) || (lowerCase.equals(f15263g) && c9.b(i6).equals("trailers"))) {
                arrayList.add(new c(lowerCase, c9.b(i6)));
            }
        }
        this.f15270o = this.f15269n.a(arrayList, z3);
        if (!this.f15272q) {
            i.c cVar = this.f15270o.f15290f;
            long e9 = this.f15267l.e();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            cVar.a(e9, timeUnit);
            this.f15270o.f15291g.a(this.f15267l.f(), timeUnit);
            return;
        }
        this.f15270o.a(b.CANCEL);
        throw new IOException("Canceled");
    }

    @Override // com.anythink.core.common.n.b.a.c.c
    public final com.anythink.core.common.n.c.w b(af afVar) {
        return this.f15270o.e();
    }

    @Override // com.anythink.core.common.n.b.a.c.c
    public final af.a a(boolean z3) {
        u c9 = this.f15270o.c();
        ab abVar = this.f15271p;
        u.a aVar = new u.a();
        int a9 = c9.a();
        com.anythink.core.common.n.b.a.c.k kVar = null;
        for (int i6 = 0; i6 < a9; i6++) {
            String a10 = c9.a(i6);
            String b9 = c9.b(i6);
            if (a10.equals(c.f15124b)) {
                kVar = com.anythink.core.common.n.b.a.c.k.a("HTTP/1.1 ".concat(String.valueOf(b9)));
            } else if (!f15266k.contains(a10)) {
                com.anythink.core.common.n.b.a.a.f14869a.a(aVar, a10, b9);
            }
        }
        if (kVar != null) {
            af.a a11 = new af.a().a(abVar).a(kVar.f15074e).a(kVar.f15075f).a(aVar.a());
            if (z3 && com.anythink.core.common.n.b.a.a.f14869a.a(a11) == 100) {
                return null;
            }
            return a11;
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    private static af.a a(u uVar, ab abVar) {
        u.a aVar = new u.a();
        int a9 = uVar.a();
        com.anythink.core.common.n.b.a.c.k kVar = null;
        for (int i6 = 0; i6 < a9; i6++) {
            String a10 = uVar.a(i6);
            String b9 = uVar.b(i6);
            if (a10.equals(c.f15124b)) {
                kVar = com.anythink.core.common.n.b.a.c.k.a("HTTP/1.1 ".concat(String.valueOf(b9)));
            } else if (!f15266k.contains(a10)) {
                com.anythink.core.common.n.b.a.a.f14869a.a(aVar, a10, b9);
            }
        }
        if (kVar != null) {
            return new af.a().a(abVar).a(kVar.f15074e).a(kVar.f15075f).a(aVar.a());
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    @Override // com.anythink.core.common.n.b.a.c.c
    public final long a(af afVar) {
        return com.anythink.core.common.n.b.a.c.e.a(afVar);
    }
}
