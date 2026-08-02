package com.anythink.core.common.n.b.a.c;

import com.anythink.core.common.n.b.ad;
import com.anythink.core.common.n.b.af;
import com.anythink.core.common.n.b.w;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class g implements w.a {

    /* renamed from: a, reason: collision with root package name */
    private final List<w> f15843a;

    /* renamed from: b, reason: collision with root package name */
    private final com.anythink.core.common.n.b.a.b.j f15844b;

    /* renamed from: c, reason: collision with root package name */
    private final com.anythink.core.common.n.b.a.b.c f15845c;

    /* renamed from: d, reason: collision with root package name */
    private final int f15846d;

    /* renamed from: e, reason: collision with root package name */
    private final ad f15847e;

    /* renamed from: f, reason: collision with root package name */
    private final com.anythink.core.common.n.b.e f15848f;

    /* renamed from: g, reason: collision with root package name */
    private final int f15849g;

    /* renamed from: h, reason: collision with root package name */
    private final int f15850h;
    private final int i;

    /* renamed from: j, reason: collision with root package name */
    private int f15851j;

    public g(List<w> list, com.anythink.core.common.n.b.a.b.j jVar, com.anythink.core.common.n.b.a.b.c cVar, int i, ad adVar, com.anythink.core.common.n.b.e eVar, int i4, int i6, int i9) {
        this.f15843a = list;
        this.f15844b = jVar;
        this.f15845c = cVar;
        this.f15846d = i;
        this.f15847e = adVar;
        this.f15848f = eVar;
        this.f15849g = i4;
        this.f15850h = i6;
        this.i = i9;
    }

    @Override // com.anythink.core.common.n.b.w.a
    public final w.a a(int i, TimeUnit timeUnit) {
        return new g(this.f15843a, this.f15844b, this.f15845c, this.f15846d, this.f15847e, this.f15848f, com.anythink.core.common.n.b.a.c.a("timeout", i, timeUnit), this.f15850h, this.i);
    }

    @Override // com.anythink.core.common.n.b.w.a
    public final com.anythink.core.common.n.b.j b() {
        com.anythink.core.common.n.b.a.b.c cVar = this.f15845c;
        if (cVar != null) {
            return cVar.a();
        }
        return null;
    }

    @Override // com.anythink.core.common.n.b.w.a
    public final w.a c(int i, TimeUnit timeUnit) {
        return new g(this.f15843a, this.f15844b, this.f15845c, this.f15846d, this.f15847e, this.f15848f, this.f15849g, this.f15850h, com.anythink.core.common.n.b.a.c.a("timeout", i, timeUnit));
    }

    @Override // com.anythink.core.common.n.b.w.a
    public final int d() {
        return this.f15849g;
    }

    @Override // com.anythink.core.common.n.b.w.a
    public final int e() {
        return this.f15850h;
    }

    @Override // com.anythink.core.common.n.b.w.a
    public final int f() {
        return this.i;
    }

    public final com.anythink.core.common.n.b.a.b.j g() {
        return this.f15844b;
    }

    public final com.anythink.core.common.n.b.a.b.c h() {
        com.anythink.core.common.n.b.a.b.c cVar = this.f15845c;
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalStateException();
    }

    @Override // com.anythink.core.common.n.b.w.a
    public final w.a b(int i, TimeUnit timeUnit) {
        return new g(this.f15843a, this.f15844b, this.f15845c, this.f15846d, this.f15847e, this.f15848f, this.f15849g, com.anythink.core.common.n.b.a.c.a("timeout", i, timeUnit), this.i);
    }

    @Override // com.anythink.core.common.n.b.w.a
    public final ad a() {
        return this.f15847e;
    }

    @Override // com.anythink.core.common.n.b.w.a
    public final com.anythink.core.common.n.b.e c() {
        return this.f15848f;
    }

    @Override // com.anythink.core.common.n.b.w.a
    public final af a(ad adVar) {
        return a(adVar, this.f15844b, this.f15845c);
    }

    public final af a(ad adVar, com.anythink.core.common.n.b.a.b.j jVar, com.anythink.core.common.n.b.a.b.c cVar) {
        if (this.f15846d < this.f15843a.size()) {
            this.f15851j++;
            com.anythink.core.common.n.b.a.b.c cVar2 = this.f15845c;
            if (cVar2 != null && !cVar2.a().a(adVar.a())) {
                throw new IllegalStateException("network interceptor " + this.f15843a.get(this.f15846d - 1) + " must retain the same host and port");
            }
            if (this.f15845c != null && this.f15851j > 1) {
                throw new IllegalStateException("network interceptor " + this.f15843a.get(this.f15846d - 1) + " must call proceed() exactly once");
            }
            g gVar = new g(this.f15843a, jVar, cVar, this.f15846d + 1, adVar, this.f15848f, this.f15849g, this.f15850h, this.i);
            w wVar = this.f15843a.get(this.f15846d);
            af a9 = wVar.a(gVar);
            if (cVar != null && this.f15846d + 1 < this.f15843a.size() && gVar.f15851j != 1) {
                throw new IllegalStateException("network interceptor " + wVar + " must call proceed() exactly once");
            }
            if (a9 == null) {
                throw new NullPointerException("interceptor " + wVar + " returned null");
            }
            if (a9.g() != null) {
                return a9;
            }
            throw new IllegalStateException("interceptor " + wVar + " returned a response with no body");
        }
        throw new AssertionError();
    }
}
