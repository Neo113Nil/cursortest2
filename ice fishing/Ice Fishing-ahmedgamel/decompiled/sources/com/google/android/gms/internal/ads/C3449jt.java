package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.widget.FrameLayout;
import java.util.HashSet;
import java.util.concurrent.Executor;
import r2.C4906k;
import s2.C4949p;
import x2.C5189a;

/* renamed from: com.google.android.gms.internal.ads.jt, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3449jt {

    /* renamed from: a, reason: collision with root package name */
    public final Context f32114a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f32115b;

    /* renamed from: c, reason: collision with root package name */
    public final C3332hi f32116c;

    /* renamed from: d, reason: collision with root package name */
    public final C3289gt f32117d;

    /* renamed from: e, reason: collision with root package name */
    public final At f32118e;

    /* renamed from: f, reason: collision with root package name */
    public final C5189a f32119f;

    /* renamed from: g, reason: collision with root package name */
    public final FrameLayout f32120g;

    /* renamed from: h, reason: collision with root package name */
    public final Wu f32121h;
    public final C3022bu i;

    /* renamed from: j, reason: collision with root package name */
    public P3.a f32122j;

    public C3449jt(Context context, Executor executor, C3332hi c3332hi, At at, C3289gt c3289gt, C3022bu c3022bu, C5189a c5189a) {
        this.f32114a = context;
        this.f32115b = executor;
        this.f32116c = c3332hi;
        this.f32118e = at;
        this.f32117d = c3289gt;
        this.i = c3022bu;
        this.f32119f = c5189a;
        this.f32120g = new FrameLayout(context);
        this.f32121h = c3332hi.c();
    }

    public final synchronized boolean a(s2.c1 c1Var, String str, AbstractC2792Sd abstractC2792Sd, Ir ir) {
        Throwable th;
        boolean z6;
        Vu vu;
        C3492ki c3492ki;
        try {
            try {
                if (!c1Var.b()) {
                    if (((Boolean) AbstractC2704Na.f27279d.r()).booleanValue()) {
                        try {
                            if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.Cc)).booleanValue()) {
                                z6 = true;
                                if (this.f32119f.f41847v >= ((Integer) s2.r.f40506e.f40509c.a(AbstractC3592ma.Dc)).intValue() || !z6) {
                                    R2.w.d("loadAd must be called on the main UI thread.");
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    }
                    z6 = false;
                    if (this.f32119f.f41847v >= ((Integer) s2.r.f40506e.f40509c.a(AbstractC3592ma.Dc)).intValue()) {
                    }
                    R2.w.d("loadAd must be called on the main UI thread.");
                }
                if (str == null) {
                    int i = w2.z.f41712b;
                    x2.i.c("Ad unit ID should not be null for app open ad.");
                    this.f32115b.execute(new RunnableC3493kj(21, this));
                    return false;
                }
                if (this.f32122j != null) {
                    return false;
                }
                C3324ha c3324ha = AbstractC3592ma.f33015e3;
                s2.r rVar = s2.r.f40506e;
                if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
                    C4949p.a();
                }
                if (!((Boolean) AbstractC2653Ka.f26706c.r()).booleanValue() || (c3492ki = (C3492ki) this.f32118e.o()) == null) {
                    vu = null;
                } else {
                    Vu vu2 = (Vu) c3492ki.f32321f.f();
                    vu2.i(7);
                    vu2.c(c1Var.f40404I);
                    vu2.d(c1Var.f40401F);
                    vu = vu2;
                }
                Context context = this.f32114a;
                boolean z9 = c1Var.f40422y;
                AbstractC2991bG.r(context, z9);
                if (((Boolean) rVar.f40509c.a(AbstractC3592ma.ka)).booleanValue() && z9) {
                    ((C2786Ro) this.f32116c.f31601G.f()).b(true);
                }
                Pair pair = new Pair("api-call", Long.valueOf(c1Var.f40413S));
                C4906k.f40186C.f40198k.getClass();
                Bundle b9 = AbstractC3066cl.b(pair, new Pair("dynamite-enter", Long.valueOf(System.currentTimeMillis())));
                C3022bu c3022bu = this.i;
                c3022bu.f30133c = str;
                c3022bu.f30132b = s2.f1.b();
                c3022bu.f30131a = c1Var;
                c3022bu.f30149t = b9;
                C3075cu a9 = c3022bu.a();
                Su j6 = Su.j(context, AbstractC2792Sd.F(a9), 7, c1Var);
                C3181et c3181et = new C3181et();
                c3181et.f30781a = a9;
                P3.a y7 = this.f32118e.y(new S0.e(c3181et, null, 22, false), new Ux(29, this));
                this.f32122j = y7;
                y7.a(new LD(0, y7, new C3887s(this, ir, vu, j6, c3181et)), this.f32115b);
                return true;
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public final synchronized C3438ji b(InterfaceC4258yt interfaceC4258yt) {
        C3181et c3181et = (C3181et) interfaceC4258yt;
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.q9)).booleanValue()) {
            C3710ok c3710ok = new C3710ok();
            c3710ok.f33718a = this.f32114a;
            c3710ok.f33719b = c3181et.f30781a;
            C3710ok c3710ok2 = new C3710ok(c3710ok);
            C3819ql c3819ql = new C3819ql();
            C3289gt c3289gt = this.f32117d;
            Executor executor = this.f32115b;
            ((HashSet) c3819ql.f34170l).add(new C2528Cl(c3289gt, executor));
            c3819ql.c(c3289gt, executor);
            C3872rl c3872rl = new C3872rl(c3819ql);
            C3438ji c3438ji = new C3438ji(this.f32116c.f31635b, 0);
            c3438ji.f32089f = c3710ok2;
            c3438ji.f32088e = c3872rl;
            return c3438ji;
        }
        C3289gt c3289gt2 = this.f32117d;
        C3289gt c3289gt3 = new C3289gt(c3289gt2.f31438n);
        c3289gt3.f31437B = c3289gt2;
        C3819ql c3819ql2 = new C3819ql();
        Executor executor2 = this.f32115b;
        c3819ql2.a(c3289gt3, executor2);
        ((HashSet) c3819ql2.f34166g).add(new C2528Cl(c3289gt3, executor2));
        ((HashSet) c3819ql2.f34172n).add(new C2528Cl(c3289gt3, executor2));
        ((HashSet) c3819ql2.f34171m).add(new C2528Cl(c3289gt3, executor2));
        ((HashSet) c3819ql2.f34170l).add(new C2528Cl(c3289gt3, executor2));
        c3819ql2.c(c3289gt3, executor2);
        c3819ql2.f34173o = c3289gt3;
        C3710ok c3710ok3 = new C3710ok();
        c3710ok3.f33718a = this.f32114a;
        c3710ok3.f33719b = c3181et.f30781a;
        C3710ok c3710ok4 = new C3710ok(c3710ok3);
        C3872rl c3872rl2 = new C3872rl(c3819ql2);
        C3438ji c3438ji2 = new C3438ji(this.f32116c.f31635b, 0);
        c3438ji2.f32089f = c3710ok4;
        c3438ji2.f32088e = c3872rl2;
        return c3438ji2;
    }
}
