package com.anythink.core.common.n.b.a.c;

import com.anythink.core.common.n.b.ad;
import com.anythink.core.common.n.b.af;
import com.anythink.core.common.n.b.w;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class g implements w.a {

    /* renamed from: a, reason: collision with root package name */
    private final List<w> f15056a;

    /* renamed from: b, reason: collision with root package name */
    private final com.anythink.core.common.n.b.a.b.j f15057b;

    /* renamed from: c, reason: collision with root package name */
    private final com.anythink.core.common.n.b.a.b.c f15058c;

    /* renamed from: d, reason: collision with root package name */
    private final int f15059d;

    /* renamed from: e, reason: collision with root package name */
    private final ad f15060e;

    /* renamed from: f, reason: collision with root package name */
    private final com.anythink.core.common.n.b.e f15061f;

    /* renamed from: g, reason: collision with root package name */
    private final int f15062g;

    /* renamed from: h, reason: collision with root package name */
    private final int f15063h;
    private final int i;

    /* renamed from: j, reason: collision with root package name */
    private int f15064j;

    public g(List<w> list, com.anythink.core.common.n.b.a.b.j jVar, com.anythink.core.common.n.b.a.b.c cVar, int i, ad adVar, com.anythink.core.common.n.b.e eVar, int i6, int i9, int i10) {
        this.f15056a = list;
        this.f15057b = jVar;
        this.f15058c = cVar;
        this.f15059d = i;
        this.f15060e = adVar;
        this.f15061f = eVar;
        this.f15062g = i6;
        this.f15063h = i9;
        this.i = i10;
    }

    @Override // com.anythink.core.common.n.b.w.a
    public final w.a a(int i, TimeUnit timeUnit) {
        return new g(this.f15056a, this.f15057b, this.f15058c, this.f15059d, this.f15060e, this.f15061f, com.anythink.core.common.n.b.a.c.a("timeout", i, timeUnit), this.f15063h, this.i);
    }

    @Override // com.anythink.core.common.n.b.w.a
    public final com.anythink.core.common.n.b.j b() {
        com.anythink.core.common.n.b.a.b.c cVar = this.f15058c;
        if (cVar != null) {
            return cVar.a();
        }
        return null;
    }

    @Override // com.anythink.core.common.n.b.w.a
    public final w.a c(int i, TimeUnit timeUnit) {
        return new g(this.f15056a, this.f15057b, this.f15058c, this.f15059d, this.f15060e, this.f15061f, this.f15062g, this.f15063h, com.anythink.core.common.n.b.a.c.a("timeout", i, timeUnit));
    }

    @Override // com.anythink.core.common.n.b.w.a
    public final int d() {
        return this.f15062g;
    }

    @Override // com.anythink.core.common.n.b.w.a
    public final int e() {
        return this.f15063h;
    }

    @Override // com.anythink.core.common.n.b.w.a
    public final int f() {
        return this.i;
    }

    public final com.anythink.core.common.n.b.a.b.j g() {
        return this.f15057b;
    }

    public final com.anythink.core.common.n.b.a.b.c h() {
        com.anythink.core.common.n.b.a.b.c cVar = this.f15058c;
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalStateException();
    }

    @Override // com.anythink.core.common.n.b.w.a
    public final w.a b(int i, TimeUnit timeUnit) {
        return new g(this.f15056a, this.f15057b, this.f15058c, this.f15059d, this.f15060e, this.f15061f, this.f15062g, com.anythink.core.common.n.b.a.c.a("timeout", i, timeUnit), this.i);
    }

    @Override // com.anythink.core.common.n.b.w.a
    public final ad a() {
        return this.f15060e;
    }

    @Override // com.anythink.core.common.n.b.w.a
    public final com.anythink.core.common.n.b.e c() {
        return this.f15061f;
    }

    @Override // com.anythink.core.common.n.b.w.a
    public final af a(ad adVar) {
        return a(adVar, this.f15057b, this.f15058c);
    }

    public final af a(ad adVar, com.anythink.core.common.n.b.a.b.j jVar, com.anythink.core.common.n.b.a.b.c cVar) {
        if (this.f15059d < this.f15056a.size()) {
            this.f15064j++;
            com.anythink.core.common.n.b.a.b.c cVar2 = this.f15058c;
            if (cVar2 != null && !cVar2.a().a(adVar.a())) {
                throw new IllegalStateException("network interceptor " + this.f15056a.get(this.f15059d - 1) + " must retain the same host and port");
            }
            if (this.f15058c != null && this.f15064j > 1) {
                throw new IllegalStateException("network interceptor " + this.f15056a.get(this.f15059d - 1) + " must call proceed() exactly once");
            }
            g gVar = new g(this.f15056a, jVar, cVar, this.f15059d + 1, adVar, this.f15061f, this.f15062g, this.f15063h, this.i);
            w wVar = this.f15056a.get(this.f15059d);
            af a9 = wVar.a(gVar);
            if (cVar != null && this.f15059d + 1 < this.f15056a.size() && gVar.f15064j != 1) {
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
