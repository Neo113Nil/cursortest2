package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* loaded from: classes.dex */
public final class Y implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C0941g f7621a;

    /* renamed from: b, reason: collision with root package name */
    public final c0 f7622b;

    /* renamed from: c, reason: collision with root package name */
    public final r f7623c;

    public Y() {
        this(null, null, null, 7, null);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Q fromModel(W w2) {
        Q q2 = new Q();
        C0939e c0939e = w2.f7615a;
        q2.f7608a = c0939e != null ? this.f7621a.fromModel(c0939e) : null;
        a0 a0Var = w2.f7616b;
        q2.f7609b = a0Var != null ? this.f7622b.fromModel(a0Var) : null;
        C0950p c0950p = w2.f7617c;
        q2.f7610c = c0950p != null ? this.f7623c.fromModel(c0950p) : null;
        return q2;
    }

    public Y(C0941g c0941g, c0 c0Var, r rVar) {
        this.f7621a = c0941g;
        this.f7622b = c0Var;
        this.f7623c = rVar;
    }

    public /* synthetic */ Y(C0941g c0941g, c0 c0Var, r rVar, int i2, kotlin.jvm.internal.e eVar) {
        this((i2 & 1) != 0 ? new C0941g() : c0941g, (i2 & 2) != 0 ? new c0() : c0Var, (i2 & 4) != 0 ? new r() : rVar);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final W toModel(Q q2) {
        C0939e c0939e;
        a0 a0Var;
        N n2 = q2.f7608a;
        if (n2 != null) {
            this.f7621a.getClass();
            c0939e = new C0939e(n2.f7599a);
        } else {
            c0939e = null;
        }
        P p2 = q2.f7609b;
        if (p2 != null) {
            this.f7622b.getClass();
            a0Var = new a0(p2.f7605a, p2.f7606b);
        } else {
            a0Var = null;
        }
        O o2 = q2.f7610c;
        return new W(c0939e, a0Var, o2 != null ? this.f7623c.toModel(o2) : null);
    }
}
