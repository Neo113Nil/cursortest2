package com.anythink.core.common.n.b.a.c;

import com.anythink.core.common.n.b.ad;
import com.anythink.core.common.n.b.af;
import com.anythink.core.common.n.b.w;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class g implements w.a {

    /* renamed from: a, reason: collision with root package name */
    private final List<w> f15214a;

    /* renamed from: b, reason: collision with root package name */
    private final com.anythink.core.common.n.b.a.b.j f15215b;

    /* renamed from: c, reason: collision with root package name */
    private final com.anythink.core.common.n.b.a.b.c f15216c;

    /* renamed from: d, reason: collision with root package name */
    private final int f15217d;

    /* renamed from: e, reason: collision with root package name */
    private final ad f15218e;

    /* renamed from: f, reason: collision with root package name */
    private final com.anythink.core.common.n.b.e f15219f;

    /* renamed from: g, reason: collision with root package name */
    private final int f15220g;

    /* renamed from: h, reason: collision with root package name */
    private final int f15221h;
    private final int i;

    /* renamed from: j, reason: collision with root package name */
    private int f15222j;

    public g(List<w> list, com.anythink.core.common.n.b.a.b.j jVar, com.anythink.core.common.n.b.a.b.c cVar, int i, ad adVar, com.anythink.core.common.n.b.e eVar, int i4, int i9, int i10) {
        this.f15214a = list;
        this.f15215b = jVar;
        this.f15216c = cVar;
        this.f15217d = i;
        this.f15218e = adVar;
        this.f15219f = eVar;
        this.f15220g = i4;
        this.f15221h = i9;
        this.i = i10;
    }

    @Override // com.anythink.core.common.n.b.w.a
    public final w.a a(int i, TimeUnit timeUnit) {
        return new g(this.f15214a, this.f15215b, this.f15216c, this.f15217d, this.f15218e, this.f15219f, com.anythink.core.common.n.b.a.c.a("timeout", i, timeUnit), this.f15221h, this.i);
    }

    @Override // com.anythink.core.common.n.b.w.a
    public final com.anythink.core.common.n.b.j b() {
        com.anythink.core.common.n.b.a.b.c cVar = this.f15216c;
        if (cVar != null) {
            return cVar.a();
        }
        return null;
    }

    @Override // com.anythink.core.common.n.b.w.a
    public final w.a c(int i, TimeUnit timeUnit) {
        return new g(this.f15214a, this.f15215b, this.f15216c, this.f15217d, this.f15218e, this.f15219f, this.f15220g, this.f15221h, com.anythink.core.common.n.b.a.c.a("timeout", i, timeUnit));
    }

    @Override // com.anythink.core.common.n.b.w.a
    public final int d() {
        return this.f15220g;
    }

    @Override // com.anythink.core.common.n.b.w.a
    public final int e() {
        return this.f15221h;
    }

    @Override // com.anythink.core.common.n.b.w.a
    public final int f() {
        return this.i;
    }

    public final com.anythink.core.common.n.b.a.b.j g() {
        return this.f15215b;
    }

    public final com.anythink.core.common.n.b.a.b.c h() {
        com.anythink.core.common.n.b.a.b.c cVar = this.f15216c;
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalStateException();
    }

    @Override // com.anythink.core.common.n.b.w.a
    public final w.a b(int i, TimeUnit timeUnit) {
        return new g(this.f15214a, this.f15215b, this.f15216c, this.f15217d, this.f15218e, this.f15219f, this.f15220g, com.anythink.core.common.n.b.a.c.a("timeout", i, timeUnit), this.i);
    }

    @Override // com.anythink.core.common.n.b.w.a
    public final ad a() {
        return this.f15218e;
    }

    @Override // com.anythink.core.common.n.b.w.a
    public final com.anythink.core.common.n.b.e c() {
        return this.f15219f;
    }

    @Override // com.anythink.core.common.n.b.w.a
    public final af a(ad adVar) {
        return a(adVar, this.f15215b, this.f15216c);
    }

    public final af a(ad adVar, com.anythink.core.common.n.b.a.b.j jVar, com.anythink.core.common.n.b.a.b.c cVar) {
        if (this.f15217d < this.f15214a.size()) {
            this.f15222j++;
            com.anythink.core.common.n.b.a.b.c cVar2 = this.f15216c;
            if (cVar2 != null && !cVar2.a().a(adVar.a())) {
                throw new IllegalStateException("network interceptor " + this.f15214a.get(this.f15217d - 1) + " must retain the same host and port");
            }
            if (this.f15216c != null && this.f15222j > 1) {
                throw new IllegalStateException("network interceptor " + this.f15214a.get(this.f15217d - 1) + " must call proceed() exactly once");
            }
            g gVar = new g(this.f15214a, jVar, cVar, this.f15217d + 1, adVar, this.f15219f, this.f15220g, this.f15221h, this.i);
            w wVar = this.f15214a.get(this.f15217d);
            af a9 = wVar.a(gVar);
            if (cVar != null && this.f15217d + 1 < this.f15214a.size() && gVar.f15222j != 1) {
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
