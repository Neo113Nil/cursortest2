package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.widget.FrameLayout;
import java.util.HashSet;
import java.util.concurrent.Executor;
import p2.C4835j;
import q2.C4900p;
import v2.C5110a;

/* renamed from: com.google.android.gms.internal.ads.jt, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3426jt {

    /* renamed from: a, reason: collision with root package name */
    public final Context f31335a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f31336b;

    /* renamed from: c, reason: collision with root package name */
    public final C3309hi f31337c;

    /* renamed from: d, reason: collision with root package name */
    public final C3266gt f31338d;

    /* renamed from: e, reason: collision with root package name */
    public final At f31339e;

    /* renamed from: f, reason: collision with root package name */
    public final C5110a f31340f;

    /* renamed from: g, reason: collision with root package name */
    public final FrameLayout f31341g;

    /* renamed from: h, reason: collision with root package name */
    public final Wu f31342h;
    public final C2999bu i;

    /* renamed from: j, reason: collision with root package name */
    public N3.a f31343j;

    public C3426jt(Context context, Executor executor, C3309hi c3309hi, At at, C3266gt c3266gt, C2999bu c2999bu, C5110a c5110a) {
        this.f31335a = context;
        this.f31336b = executor;
        this.f31337c = c3309hi;
        this.f31339e = at;
        this.f31338d = c3266gt;
        this.i = c2999bu;
        this.f31340f = c5110a;
        this.f31341g = new FrameLayout(context);
        this.f31342h = c3309hi.c();
    }

    public final synchronized boolean a(q2.c1 c1Var, String str, AbstractC2772Sd abstractC2772Sd, Ir ir) {
        Throwable th;
        boolean z3;
        Vu vu;
        C3469ki c3469ki;
        try {
            try {
                if (!c1Var.b()) {
                    if (((Boolean) AbstractC2684Na.f26496d.r()).booleanValue()) {
                        try {
                            if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.Cc)).booleanValue()) {
                                z3 = true;
                                if (this.f31340f.f41390v >= ((Integer) q2.r.f40204e.f40207c.a(AbstractC3569ma.Dc)).intValue() || !z3) {
                                    P2.w.d("loadAd must be called on the main UI thread.");
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    }
                    z3 = false;
                    if (this.f31340f.f41390v >= ((Integer) q2.r.f40204e.f40207c.a(AbstractC3569ma.Dc)).intValue()) {
                    }
                    P2.w.d("loadAd must be called on the main UI thread.");
                }
                if (str == null) {
                    int i = u2.z.f41319b;
                    v2.i.c("Ad unit ID should not be null for app open ad.");
                    this.f31336b.execute(new RunnableC3470kj(21, this));
                    return false;
                }
                if (this.f31343j != null) {
                    return false;
                }
                C3301ha c3301ha = AbstractC3569ma.f32235e3;
                q2.r rVar = q2.r.f40204e;
                if (((Boolean) rVar.f40207c.a(c3301ha)).booleanValue()) {
                    C4900p.a();
                }
                if (!((Boolean) AbstractC2633Ka.f25928c.r()).booleanValue() || (c3469ki = (C3469ki) this.f31339e.o()) == null) {
                    vu = null;
                } else {
                    Vu vu2 = (Vu) c3469ki.f31544f.f();
                    vu2.i(7);
                    vu2.c(c1Var.f40102I);
                    vu2.d(c1Var.f40099F);
                    vu = vu2;
                }
                Context context = this.f31335a;
                boolean z6 = c1Var.f40120y;
                AbstractC2968bG.r(context, z6);
                if (((Boolean) rVar.f40207c.a(AbstractC3569ma.ka)).booleanValue() && z6) {
                    ((C2749Qo) this.f31337c.f30840G.f()).b(true);
                }
                Pair pair = new Pair("api-call", Long.valueOf(c1Var.f40111S));
                C4835j.f39730C.f39742k.getClass();
                Bundle b9 = AbstractC3043cl.b(pair, new Pair("dynamite-enter", Long.valueOf(System.currentTimeMillis())));
                C2999bu c2999bu = this.i;
                c2999bu.f29345c = str;
                c2999bu.f29344b = q2.f1.b();
                c2999bu.f29343a = c1Var;
                c2999bu.f29361t = b9;
                C3052cu a9 = c2999bu.a();
                Su e9 = Su.e(context, AbstractC2772Sd.F(a9), 7, c1Var);
                C3158et c3158et = new C3158et();
                c3158et.f29992a = a9;
                N3.a y7 = this.f31339e.y(new S0.e(c3158et, null, 19, false), new Ux(29, this));
                this.f31343j = y7;
                y7.a(new LD(0, y7, new C3864s(this, ir, vu, e9, c3158et)), this.f31336b);
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

    public final synchronized C3415ji b(InterfaceC4235yt interfaceC4235yt) {
        C3158et c3158et = (C3158et) interfaceC4235yt;
        if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.q9)).booleanValue()) {
            C3687ok c3687ok = new C3687ok();
            c3687ok.f32932a = this.f31335a;
            c3687ok.f32933b = c3158et.f29992a;
            C3687ok c3687ok2 = new C3687ok(c3687ok);
            C3796ql c3796ql = new C3796ql();
            C3266gt c3266gt = this.f31338d;
            Executor executor = this.f31336b;
            ((HashSet) c3796ql.f33388l).add(new C2491Bl(c3266gt, executor));
            c3796ql.c(c3266gt, executor);
            C3849rl c3849rl = new C3849rl(c3796ql);
            C3415ji c3415ji = new C3415ji(this.f31337c.f30874b, 0);
            c3415ji.f31302f = c3687ok2;
            c3415ji.f31301e = c3849rl;
            return c3415ji;
        }
        C3266gt c3266gt2 = this.f31338d;
        C3266gt c3266gt3 = new C3266gt(c3266gt2.f30669n);
        c3266gt3.f30668B = c3266gt2;
        C3796ql c3796ql2 = new C3796ql();
        Executor executor2 = this.f31336b;
        c3796ql2.a(c3266gt3, executor2);
        ((HashSet) c3796ql2.f33384g).add(new C2491Bl(c3266gt3, executor2));
        ((HashSet) c3796ql2.f33390n).add(new C2491Bl(c3266gt3, executor2));
        ((HashSet) c3796ql2.f33389m).add(new C2491Bl(c3266gt3, executor2));
        ((HashSet) c3796ql2.f33388l).add(new C2491Bl(c3266gt3, executor2));
        c3796ql2.c(c3266gt3, executor2);
        c3796ql2.f33391o = c3266gt3;
        C3687ok c3687ok3 = new C3687ok();
        c3687ok3.f32932a = this.f31335a;
        c3687ok3.f32933b = c3158et.f29992a;
        C3687ok c3687ok4 = new C3687ok(c3687ok3);
        C3849rl c3849rl2 = new C3849rl(c3796ql2);
        C3415ji c3415ji2 = new C3415ji(this.f31337c.f30874b, 0);
        c3415ji2.f31302f = c3687ok4;
        c3415ji2.f31301e = c3849rl2;
        return c3415ji2;
    }
}
