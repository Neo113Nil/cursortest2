package io.appmetrica.analytics.impl;

import a.AbstractC0083a;
import i1.AbstractC0253j;
import java.util.List;

/* loaded from: classes.dex */
public final class N4 {

    /* renamed from: a, reason: collision with root package name */
    public final C0864x5 f4795a;

    /* renamed from: b, reason: collision with root package name */
    public final Ec f4796b;

    /* renamed from: c, reason: collision with root package name */
    public final Ec f4797c;

    public N4(L6 l6, Qg qg) {
        C0769te c0769te = new C0769te(l6);
        this.f4795a = new C0864x5(l6);
        this.f4796b = new Ec(c0769te, new M4(qg));
        this.f4797c = new Ec(c0769te, L4.f4670a);
    }

    public final List<F8> a() {
        return AbstractC0253j.B(this.f4795a, this.f4796b);
    }

    public final List<F8> b() {
        return AbstractC0083a.m(this.f4797c);
    }
}
