package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import java.util.concurrent.Executor;
import r2.C4906k;
import s2.C4949p;

/* loaded from: classes2.dex */
public final class Mt {

    /* renamed from: a, reason: collision with root package name */
    public final Context f27147a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f27148b;

    /* renamed from: c, reason: collision with root package name */
    public final C3332hi f27149c;

    /* renamed from: d, reason: collision with root package name */
    public final Jt f27150d;

    /* renamed from: e, reason: collision with root package name */
    public final At f27151e;

    /* renamed from: f, reason: collision with root package name */
    public final Zt f27152f;

    /* renamed from: g, reason: collision with root package name */
    public final Wu f27153g;

    /* renamed from: h, reason: collision with root package name */
    public final C3022bu f27154h;
    public P3.a i;

    public Mt(Context context, Executor executor, C3332hi c3332hi, At at, Jt jt, C3022bu c3022bu, Zt zt) {
        this.f27147a = context;
        this.f27148b = executor;
        this.f27149c = c3332hi;
        this.f27151e = at;
        this.f27150d = jt;
        this.f27154h = c3022bu;
        this.f27152f = zt;
        this.f27153g = c3332hi.c();
    }

    public final boolean a(s2.c1 c1Var, String str, AbstractC2792Sd abstractC2792Sd, Ir ir) {
        Vu vu;
        Executor executor = this.f27148b;
        if (str == null) {
            int i = w2.z.f41712b;
            x2.i.c("Ad unit ID should not be null for rewarded video ad.");
            executor.execute(new RunnableC3493kj(26, this));
            return false;
        }
        P3.a aVar = this.i;
        if (aVar != null && !aVar.isDone()) {
            return false;
        }
        C3324ha c3324ha = AbstractC3592ma.f33015e3;
        s2.r rVar = s2.r.f40506e;
        if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
            C4949p.a();
        }
        boolean booleanValue = ((Boolean) AbstractC2653Ka.f26706c.r()).booleanValue();
        At at = this.f27151e;
        if (!booleanValue || at.o() == null) {
            vu = null;
        } else {
            vu = (Vu) ((C3923si) at.o()).f34839g.f();
            vu.i(5);
            vu.c(c1Var.f40404I);
            vu.d(c1Var.f40401F);
        }
        boolean z6 = c1Var.f40422y;
        Context context = this.f27147a;
        AbstractC2991bG.r(context, z6);
        if (((Boolean) rVar.f40509c.a(AbstractC3592ma.ka)).booleanValue() && z6) {
            ((C2786Ro) this.f27149c.f31601G.f()).b(true);
        }
        Pair pair = new Pair("api-call", Long.valueOf(c1Var.f40413S));
        C4906k.f40186C.f40198k.getClass();
        Bundle b9 = AbstractC3066cl.b(pair, new Pair("dynamite-enter", Long.valueOf(System.currentTimeMillis())));
        C3022bu c3022bu = this.f27154h;
        c3022bu.f30133c = str;
        c3022bu.f30132b = new s2.f1("reward_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false, false);
        c3022bu.f30131a = c1Var;
        c3022bu.f30149t = b9;
        C3075cu a9 = c3022bu.a();
        Su j6 = Su.j(context, AbstractC2792Sd.F(a9), 5, c1Var);
        Lt lt = new Lt();
        lt.f26978a = a9;
        P3.a y7 = at.y(new S0.e(lt, null, 22, false), new C3557lt(1, this));
        this.i = y7;
        y7.a(new LD(0, y7, new C3887s(this, ir, vu, j6, lt)), executor);
        return true;
    }

    public final C3438ji b(InterfaceC4258yt interfaceC4258yt) {
        C3438ji c3438ji = new C3438ji(this.f27149c.f31635b, 1);
        C3710ok c3710ok = new C3710ok();
        c3710ok.f33718a = this.f27147a;
        c3710ok.f33719b = ((Lt) interfaceC4258yt).f26978a;
        c3710ok.f33721d = this.f27152f;
        c3438ji.f32089f = new C3710ok(c3710ok);
        c3438ji.f32088e = new C3872rl(new C3819ql());
        return c3438ji;
    }
}
