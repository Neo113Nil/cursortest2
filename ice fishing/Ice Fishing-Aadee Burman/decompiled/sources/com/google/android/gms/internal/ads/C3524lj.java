package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.lj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3524lj extends AbstractC2557Fj {

    /* renamed from: l, reason: collision with root package name */
    public final Context f31826l;

    /* renamed from: m, reason: collision with root package name */
    public final View f31827m;

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC4061vh f31828n;

    /* renamed from: o, reason: collision with root package name */
    public final Tt f31829o;

    /* renamed from: p, reason: collision with root package name */
    public final InterfaceC2540Ej f31830p;

    /* renamed from: q, reason: collision with root package name */
    public final C4282zm f31831q;

    /* renamed from: r, reason: collision with root package name */
    public final C2559Fl f31832r;

    /* renamed from: s, reason: collision with root package name */
    public final InterfaceC3135eN f31833s;

    /* renamed from: t, reason: collision with root package name */
    public final Executor f31834t;

    /* renamed from: u, reason: collision with root package name */
    public q2.f1 f31835u;

    public C3524lj(S0.q qVar, Context context, Tt tt, View view, InterfaceC4061vh interfaceC4061vh, InterfaceC2540Ej interfaceC2540Ej, C4282zm c4282zm, C2559Fl c2559Fl, InterfaceC3135eN interfaceC3135eN, Executor executor) {
        super(qVar);
        this.f31826l = context;
        this.f31827m = view;
        this.f31828n = interfaceC4061vh;
        this.f31829o = tt;
        this.f31830p = interfaceC2540Ej;
        this.f31831q = c4282zm;
        this.f31832r = c2559Fl;
        this.f31833s = interfaceC3135eN;
        this.f31834t = executor;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2557Fj
    public final void a() {
        this.f31834t.execute(new RunnableC3470kj(0, this));
        super.a();
    }

    public final Tt c() {
        q2.f1 f1Var = this.f31835u;
        if (f1Var != null) {
            return f1Var.f40131B ? new Tt(-3, 0, true) : new Tt(f1Var.f40143x, f1Var.f40140u, false);
        }
        St st = this.f24834b;
        if (st.f27611c0) {
            for (String str : st.f27606a) {
                if (str == null || !str.contains("FirstParty")) {
                }
            }
            View view = this.f31827m;
            return new Tt(view.getWidth(), view.getHeight(), false);
        }
        return (Tt) st.f27638r.get(0);
    }

    public final int d() {
        C3301ha c3301ha = AbstractC3569ma.W8;
        q2.r rVar = q2.r.f40204e;
        if (((Boolean) rVar.f40207c.a(c3301ha)).booleanValue() && this.f24834b.f27619g0) {
            if (!((Boolean) rVar.f40207c.a(AbstractC3569ma.X8)).booleanValue()) {
                return 0;
            }
        }
        return ((Ut) this.f24833a.f28754b.f25043v).f28005c;
    }
}
