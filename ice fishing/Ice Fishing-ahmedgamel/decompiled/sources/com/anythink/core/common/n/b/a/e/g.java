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
    private final w.a f16054l;

    /* renamed from: m, reason: collision with root package name */
    private final com.anythink.core.common.n.b.a.b.e f16055m;

    /* renamed from: n, reason: collision with root package name */
    private final f f16056n;

    /* renamed from: o, reason: collision with root package name */
    private volatile i f16057o;

    /* renamed from: p, reason: collision with root package name */
    private final ab f16058p;

    /* renamed from: q, reason: collision with root package name */
    private volatile boolean f16059q;

    /* renamed from: b, reason: collision with root package name */
    private static final String f16045b = "connection";

    /* renamed from: c, reason: collision with root package name */
    private static final String f16046c = "host";

    /* renamed from: d, reason: collision with root package name */
    private static final String f16047d = "keep-alive";

    /* renamed from: e, reason: collision with root package name */
    private static final String f16048e = "proxy-connection";

    /* renamed from: g, reason: collision with root package name */
    private static final String f16050g = "te";

    /* renamed from: f, reason: collision with root package name */
    private static final String f16049f = "transfer-encoding";

    /* renamed from: h, reason: collision with root package name */
    private static final String f16051h = "encoding";
    private static final String i = "upgrade";

    /* renamed from: j, reason: collision with root package name */
    private static final List<String> f16052j = com.anythink.core.common.n.b.a.c.a(f16045b, f16046c, f16047d, f16048e, f16050g, f16049f, f16051h, i, c.f15912c, c.f15913d, c.f15914e, c.f15915f);

    /* renamed from: k, reason: collision with root package name */
    private static final List<String> f16053k = com.anythink.core.common.n.b.a.c.a(f16045b, f16046c, f16047d, f16048e, f16050g, f16049f, f16051h, i);

    public g(z zVar, com.anythink.core.common.n.b.a.b.e eVar, w.a aVar, f fVar) {
        this.f16055m = eVar;
        this.f16054l = aVar;
        this.f16056n = fVar;
        List<ab> q8 = zVar.q();
        ab abVar = ab.H2_PRIOR_KNOWLEDGE;
        this.f16058p = q8.contains(abVar) ? abVar : ab.HTTP_2;
    }

    @Override // com.anythink.core.common.n.b.a.c.c
    public final com.anythink.core.common.n.b.a.b.e a() {
        return this.f16055m;
    }

    @Override // com.anythink.core.common.n.b.a.c.c
    public final void b() {
        this.f16056n.f15994r.b();
    }

    @Override // com.anythink.core.common.n.b.a.c.c
    public final void c() {
        this.f16057o.f().close();
    }

    @Override // com.anythink.core.common.n.b.a.c.c
    public final u d() {
        return this.f16057o.d();
    }

    @Override // com.anythink.core.common.n.b.a.c.c
    public final void e() {
        this.f16059q = true;
        if (this.f16057o != null) {
            this.f16057o.a(b.CANCEL);
        }
    }

    @Override // com.anythink.core.common.n.b.a.c.c
    public final v a(ad adVar, long j6) {
        return this.f16057o.f();
    }

    private static List<c> b(ad adVar) {
        u c9 = adVar.c();
        ArrayList arrayList = new ArrayList(c9.a() + 4);
        arrayList.add(new c(c.f15917h, adVar.b()));
        arrayList.add(new c(c.i, com.anythink.core.common.n.b.a.c.i.a(adVar.a())));
        String a9 = adVar.a("Host");
        if (a9 != null) {
            arrayList.add(new c(c.f15919k, a9));
        }
        arrayList.add(new c(c.f15918j, adVar.a().b()));
        int a10 = c9.a();
        for (int i4 = 0; i4 < a10; i4++) {
            String lowerCase = c9.a(i4).toLowerCase(Locale.US);
            if (!f16052j.contains(lowerCase) || (lowerCase.equals(f16050g) && c9.b(i4).equals("trailers"))) {
                arrayList.add(new c(lowerCase, c9.b(i4)));
            }
        }
        return arrayList;
    }

    @Override // com.anythink.core.common.n.b.a.c.c
    public final void a(ad adVar) {
        if (this.f16057o != null) {
            return;
        }
        boolean z6 = adVar.d() != null;
        u c9 = adVar.c();
        ArrayList arrayList = new ArrayList(c9.a() + 4);
        arrayList.add(new c(c.f15917h, adVar.b()));
        arrayList.add(new c(c.i, com.anythink.core.common.n.b.a.c.i.a(adVar.a())));
        String a9 = adVar.a("Host");
        if (a9 != null) {
            arrayList.add(new c(c.f15919k, a9));
        }
        arrayList.add(new c(c.f15918j, adVar.a().b()));
        int a10 = c9.a();
        for (int i4 = 0; i4 < a10; i4++) {
            String lowerCase = c9.a(i4).toLowerCase(Locale.US);
            if (!f16052j.contains(lowerCase) || (lowerCase.equals(f16050g) && c9.b(i4).equals("trailers"))) {
                arrayList.add(new c(lowerCase, c9.b(i4)));
            }
        }
        this.f16057o = this.f16056n.a(arrayList, z6);
        if (!this.f16059q) {
            i.c cVar = this.f16057o.f16077f;
            long e9 = this.f16054l.e();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            cVar.a(e9, timeUnit);
            this.f16057o.f16078g.a(this.f16054l.f(), timeUnit);
            return;
        }
        this.f16057o.a(b.CANCEL);
        throw new IOException("Canceled");
    }

    @Override // com.anythink.core.common.n.b.a.c.c
    public final com.anythink.core.common.n.c.w b(af afVar) {
        return this.f16057o.e();
    }

    @Override // com.anythink.core.common.n.b.a.c.c
    public final af.a a(boolean z6) {
        u c9 = this.f16057o.c();
        ab abVar = this.f16058p;
        u.a aVar = new u.a();
        int a9 = c9.a();
        com.anythink.core.common.n.b.a.c.k kVar = null;
        for (int i4 = 0; i4 < a9; i4++) {
            String a10 = c9.a(i4);
            String b9 = c9.b(i4);
            if (a10.equals(c.f15911b)) {
                kVar = com.anythink.core.common.n.b.a.c.k.a("HTTP/1.1 ".concat(String.valueOf(b9)));
            } else if (!f16053k.contains(a10)) {
                com.anythink.core.common.n.b.a.a.f15656a.a(aVar, a10, b9);
            }
        }
        if (kVar != null) {
            af.a a11 = new af.a().a(abVar).a(kVar.f15861e).a(kVar.f15862f).a(aVar.a());
            if (z6 && com.anythink.core.common.n.b.a.a.f15656a.a(a11) == 100) {
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
        for (int i4 = 0; i4 < a9; i4++) {
            String a10 = uVar.a(i4);
            String b9 = uVar.b(i4);
            if (a10.equals(c.f15911b)) {
                kVar = com.anythink.core.common.n.b.a.c.k.a("HTTP/1.1 ".concat(String.valueOf(b9)));
            } else if (!f16053k.contains(a10)) {
                com.anythink.core.common.n.b.a.a.f15656a.a(aVar, a10, b9);
            }
        }
        if (kVar != null) {
            return new af.a().a(abVar).a(kVar.f15861e).a(kVar.f15862f).a(aVar.a());
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    @Override // com.anythink.core.common.n.b.a.c.c
    public final long a(af afVar) {
        return com.anythink.core.common.n.b.a.c.e.a(afVar);
    }
}
