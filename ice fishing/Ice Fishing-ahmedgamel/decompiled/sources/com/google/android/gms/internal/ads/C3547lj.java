package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.lj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3547lj extends AbstractC2577Fj {

    /* renamed from: l, reason: collision with root package name */
    public final Context f32604l;

    /* renamed from: m, reason: collision with root package name */
    public final View f32605m;

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC4084vh f32606n;

    /* renamed from: o, reason: collision with root package name */
    public final Tt f32607o;

    /* renamed from: p, reason: collision with root package name */
    public final InterfaceC2560Ej f32608p;

    /* renamed from: q, reason: collision with root package name */
    public final C2495Am f32609q;

    /* renamed from: r, reason: collision with root package name */
    public final C2596Gl f32610r;

    /* renamed from: s, reason: collision with root package name */
    public final InterfaceC3158eN f32611s;

    /* renamed from: t, reason: collision with root package name */
    public final Executor f32612t;

    /* renamed from: u, reason: collision with root package name */
    public s2.f1 f32613u;

    public C3547lj(S0.q qVar, Context context, Tt tt, View view, InterfaceC4084vh interfaceC4084vh, InterfaceC2560Ej interfaceC2560Ej, C2495Am c2495Am, C2596Gl c2596Gl, InterfaceC3158eN interfaceC3158eN, Executor executor) {
        super(qVar);
        this.f32604l = context;
        this.f32605m = view;
        this.f32606n = interfaceC4084vh;
        this.f32607o = tt;
        this.f32608p = interfaceC2560Ej;
        this.f32609q = c2495Am;
        this.f32610r = c2596Gl;
        this.f32611s = interfaceC3158eN;
        this.f32612t = executor;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2577Fj
    public final void a() {
        this.f32612t.execute(new RunnableC3493kj(0, this));
        super.a();
    }

    public final Tt c() {
        s2.f1 f1Var = this.f32613u;
        if (f1Var != null) {
            return f1Var.f40433B ? new Tt(-3, 0, true) : new Tt(f1Var.f40445x, f1Var.f40442u, false);
        }
        St st = this.f25623b;
        if (st.f28394c0) {
            for (String str : st.f28389a) {
                if (str == null || !str.contains("FirstParty")) {
                }
            }
            View view = this.f32605m;
            return new Tt(view.getWidth(), view.getHeight(), false);
        }
        return (Tt) st.f28421r.get(0);
    }

    public final int d() {
        C3324ha c3324ha = AbstractC3592ma.W8;
        s2.r rVar = s2.r.f40506e;
        if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue() && this.f25623b.f28402g0) {
            if (!((Boolean) rVar.f40509c.a(AbstractC3592ma.X8)).booleanValue()) {
                return 0;
            }
        }
        return ((Ut) this.f25622a.f29533b.f25831v).f28802c;
    }
}
