package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import java.util.concurrent.Executor;
import p2.C4835j;
import q2.C4900p;

/* loaded from: classes2.dex */
public final class Mt {

    /* renamed from: a, reason: collision with root package name */
    public final Context f26362a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f26363b;

    /* renamed from: c, reason: collision with root package name */
    public final C3309hi f26364c;

    /* renamed from: d, reason: collision with root package name */
    public final Jt f26365d;

    /* renamed from: e, reason: collision with root package name */
    public final At f26366e;

    /* renamed from: f, reason: collision with root package name */
    public final Zt f26367f;

    /* renamed from: g, reason: collision with root package name */
    public final Wu f26368g;

    /* renamed from: h, reason: collision with root package name */
    public final C2999bu f26369h;
    public N3.a i;

    public Mt(Context context, Executor executor, C3309hi c3309hi, At at, Jt jt, C2999bu c2999bu, Zt zt) {
        this.f26362a = context;
        this.f26363b = executor;
        this.f26364c = c3309hi;
        this.f26366e = at;
        this.f26365d = jt;
        this.f26369h = c2999bu;
        this.f26367f = zt;
        this.f26368g = c3309hi.c();
    }

    public final boolean a(q2.c1 c1Var, String str, AbstractC2772Sd abstractC2772Sd, Ir ir) {
        Vu vu;
        Executor executor = this.f26363b;
        if (str == null) {
            int i = u2.z.f41319b;
            v2.i.c("Ad unit ID should not be null for rewarded video ad.");
            executor.execute(new RunnableC3470kj(26, this));
            return false;
        }
        N3.a aVar = this.i;
        if (aVar != null && !aVar.isDone()) {
            return false;
        }
        C3301ha c3301ha = AbstractC3569ma.f32235e3;
        q2.r rVar = q2.r.f40204e;
        if (((Boolean) rVar.f40207c.a(c3301ha)).booleanValue()) {
            C4900p.a();
        }
        boolean booleanValue = ((Boolean) AbstractC2633Ka.f25928c.r()).booleanValue();
        At at = this.f26366e;
        if (!booleanValue || at.o() == null) {
            vu = null;
        } else {
            vu = (Vu) ((C3900si) at.o()).f34073g.f();
            vu.i(5);
            vu.c(c1Var.f40102I);
            vu.d(c1Var.f40099F);
        }
        boolean z3 = c1Var.f40120y;
        Context context = this.f26362a;
        AbstractC2968bG.r(context, z3);
        if (((Boolean) rVar.f40207c.a(AbstractC3569ma.ka)).booleanValue() && z3) {
            ((C2749Qo) this.f26364c.f30840G.f()).b(true);
        }
        Pair pair = new Pair("api-call", Long.valueOf(c1Var.f40111S));
        C4835j.f39730C.f39742k.getClass();
        Bundle b9 = AbstractC3043cl.b(pair, new Pair("dynamite-enter", Long.valueOf(System.currentTimeMillis())));
        C2999bu c2999bu = this.f26369h;
        c2999bu.f29345c = str;
        c2999bu.f29344b = new q2.f1("reward_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false, false);
        c2999bu.f29343a = c1Var;
        c2999bu.f29361t = b9;
        C3052cu a9 = c2999bu.a();
        Su e9 = Su.e(context, AbstractC2772Sd.F(a9), 5, c1Var);
        Lt lt = new Lt();
        lt.f26187a = a9;
        N3.a y7 = at.y(new S0.e(lt, null, 19, false), new C3534lt(1, this));
        this.i = y7;
        y7.a(new LD(0, y7, new C3864s(this, ir, vu, e9, lt)), executor);
        return true;
    }

    public final C3415ji b(InterfaceC4235yt interfaceC4235yt) {
        C3415ji c3415ji = new C3415ji(this.f26364c.f30874b, 1);
        C3687ok c3687ok = new C3687ok();
        c3687ok.f32932a = this.f26362a;
        c3687ok.f32933b = ((Lt) interfaceC4235yt).f26187a;
        c3687ok.f32935d = this.f26367f;
        c3415ji.f31302f = new C3687ok(c3687ok);
        c3415ji.f31301e = new C3849rl(new C3796ql());
        return c3415ji;
    }
}
