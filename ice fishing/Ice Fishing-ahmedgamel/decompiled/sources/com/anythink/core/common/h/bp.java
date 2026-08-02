package com.anythink.core.common.h;

import java.util.List;

/* loaded from: classes.dex */
public final class bp {

    /* renamed from: a, reason: collision with root package name */
    com.anythink.core.d.l f14520a;

    /* renamed from: b, reason: collision with root package name */
    n f14521b;

    /* renamed from: c, reason: collision with root package name */
    List<bv> f14522c;

    /* renamed from: d, reason: collision with root package name */
    List<bv> f14523d;

    /* renamed from: e, reason: collision with root package name */
    List<bv> f14524e;

    /* renamed from: f, reason: collision with root package name */
    List<bv> f14525f;

    /* renamed from: g, reason: collision with root package name */
    List<bv> f14526g;

    /* renamed from: h, reason: collision with root package name */
    int f14527h;

    public bp(com.anythink.core.d.l lVar, n nVar, int i) {
        this.f14520a = lVar;
        this.f14521b = nVar;
        this.f14527h = i;
    }

    public final com.anythink.core.d.l a() {
        return this.f14520a;
    }

    public final int b() {
        return this.f14527h;
    }

    public final n c() {
        return this.f14521b;
    }

    public final List<bv> d() {
        return this.f14522c;
    }

    public final List<bv> e() {
        return this.f14523d;
    }

    public final List<bv> f() {
        return this.f14525f;
    }

    public final List<bv> g() {
        return this.f14526g;
    }

    public final List<bv> h() {
        return this.f14524e;
    }

    public final boolean i() {
        List<bv> list = this.f14522c;
        if (list != null && list.size() > 0) {
            return true;
        }
        List<bv> list2 = this.f14523d;
        if (list2 != null && list2.size() > 0) {
            return true;
        }
        List<bv> list3 = this.f14524e;
        if (list3 != null && list3.size() > 0) {
            return true;
        }
        List<bv> list4 = this.f14525f;
        if (list4 != null && list4.size() > 0) {
            return true;
        }
        List<bv> list5 = this.f14526g;
        return list5 != null && list5.size() > 0;
    }

    public final boolean j() {
        List<bv> list = this.f14525f;
        if (list != null && list.size() > 0) {
            return true;
        }
        List<bv> list2 = this.f14526g;
        return list2 != null && list2.size() > 0;
    }

    public final boolean k() {
        List<bv> list = this.f14522c;
        if (list != null && list.size() > 0) {
            return false;
        }
        List<bv> list2 = this.f14524e;
        return list2 == null || list2.size() <= 0;
    }

    public final void a(List<bv> list) {
        this.f14522c = list;
    }

    public final void b(List<bv> list) {
        this.f14523d = list;
    }

    public final void c(List<bv> list) {
        this.f14525f = list;
    }

    public final void d(List<bv> list) {
        this.f14526g = list;
    }

    public final void e(List<bv> list) {
        this.f14524e = list;
    }
}
