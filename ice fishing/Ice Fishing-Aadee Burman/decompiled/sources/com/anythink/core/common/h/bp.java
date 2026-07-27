package com.anythink.core.common.h;

import java.util.List;

/* loaded from: classes.dex */
public final class bp {

    /* renamed from: a, reason: collision with root package name */
    com.anythink.core.d.l f13734a;

    /* renamed from: b, reason: collision with root package name */
    n f13735b;

    /* renamed from: c, reason: collision with root package name */
    List<bv> f13736c;

    /* renamed from: d, reason: collision with root package name */
    List<bv> f13737d;

    /* renamed from: e, reason: collision with root package name */
    List<bv> f13738e;

    /* renamed from: f, reason: collision with root package name */
    List<bv> f13739f;

    /* renamed from: g, reason: collision with root package name */
    List<bv> f13740g;

    /* renamed from: h, reason: collision with root package name */
    int f13741h;

    public bp(com.anythink.core.d.l lVar, n nVar, int i) {
        this.f13734a = lVar;
        this.f13735b = nVar;
        this.f13741h = i;
    }

    public final com.anythink.core.d.l a() {
        return this.f13734a;
    }

    public final int b() {
        return this.f13741h;
    }

    public final n c() {
        return this.f13735b;
    }

    public final List<bv> d() {
        return this.f13736c;
    }

    public final List<bv> e() {
        return this.f13737d;
    }

    public final List<bv> f() {
        return this.f13739f;
    }

    public final List<bv> g() {
        return this.f13740g;
    }

    public final List<bv> h() {
        return this.f13738e;
    }

    public final boolean i() {
        List<bv> list = this.f13736c;
        if (list != null && list.size() > 0) {
            return true;
        }
        List<bv> list2 = this.f13737d;
        if (list2 != null && list2.size() > 0) {
            return true;
        }
        List<bv> list3 = this.f13738e;
        if (list3 != null && list3.size() > 0) {
            return true;
        }
        List<bv> list4 = this.f13739f;
        if (list4 != null && list4.size() > 0) {
            return true;
        }
        List<bv> list5 = this.f13740g;
        return list5 != null && list5.size() > 0;
    }

    public final boolean j() {
        List<bv> list = this.f13739f;
        if (list != null && list.size() > 0) {
            return true;
        }
        List<bv> list2 = this.f13740g;
        return list2 != null && list2.size() > 0;
    }

    public final boolean k() {
        List<bv> list = this.f13736c;
        if (list != null && list.size() > 0) {
            return false;
        }
        List<bv> list2 = this.f13738e;
        return list2 == null || list2.size() <= 0;
    }

    public final void a(List<bv> list) {
        this.f13736c = list;
    }

    public final void b(List<bv> list) {
        this.f13737d = list;
    }

    public final void c(List<bv> list) {
        this.f13739f = list;
    }

    public final void d(List<bv> list) {
        this.f13740g = list;
    }

    public final void e(List<bv> list) {
        this.f13738e = list;
    }
}
