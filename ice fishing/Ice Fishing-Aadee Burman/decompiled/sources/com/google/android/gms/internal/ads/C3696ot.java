package com.google.android.gms.internal.ads;

import android.app.KeyguardManager;
import android.content.Context;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.HashSet;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p2.C4835j;
import q2.C4900p;
import q2.C4920z0;

/* renamed from: com.google.android.gms.internal.ads.ot, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3696ot {

    /* renamed from: a, reason: collision with root package name */
    public final Context f32962a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f32963b;

    /* renamed from: c, reason: collision with root package name */
    public final C3309hi f32964c;

    /* renamed from: d, reason: collision with root package name */
    public final Dr f32965d;

    /* renamed from: e, reason: collision with root package name */
    public final Fr f32966e;

    /* renamed from: f, reason: collision with root package name */
    public final FrameLayout f32967f;

    /* renamed from: g, reason: collision with root package name */
    public C3892sa f32968g;

    /* renamed from: h, reason: collision with root package name */
    public final C2875Yk f32969h;
    public final Wu i;

    /* renamed from: j, reason: collision with root package name */
    public final C3418jl f32970j;

    /* renamed from: k, reason: collision with root package name */
    public final C2999bu f32971k;

    /* renamed from: l, reason: collision with root package name */
    public Iu f32972l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f32973m;

    /* renamed from: n, reason: collision with root package name */
    public C4920z0 f32974n;

    /* renamed from: o, reason: collision with root package name */
    public Ir f32975o;

    public C3696ot(Context context, Executor executor, q2.f1 f1Var, C3309hi c3309hi, Dr dr, Fr fr, C2999bu c2999bu, C3418jl c3418jl) {
        this.f32962a = context;
        this.f32963b = executor;
        this.f32964c = c3309hi;
        this.f32965d = dr;
        this.f32966e = fr;
        this.f32971k = c2999bu;
        this.f32969h = new C2875Yk((ScheduledExecutorService) c3309hi.f30878d.f(), (T2.a) c3309hi.f30882f.f(), (C3153eo) c3309hi.f30898o.f());
        this.i = c3309hi.c();
        this.f32967f = new FrameLayout(context);
        this.f32970j = c3418jl;
        c2999bu.f29344b = f1Var;
        this.f32973m = true;
        this.f32974n = null;
        this.f32975o = null;
    }

    public final boolean a(q2.c1 c1Var, String str, AbstractC2772Sd abstractC2772Sd, Ir ir) {
        C3577mi c3577mi;
        int i = 13;
        int i6 = 0;
        Executor executor = this.f32963b;
        if (str == null) {
            int i9 = u2.z.f41319b;
            v2.i.c("Ad unit ID should not be null for banner ad.");
            executor.execute(new RunnableC3470kj(22, this));
            return false;
        }
        boolean b9 = b();
        C2999bu c2999bu = this.f32971k;
        if (!b9) {
            C3301ha c3301ha = AbstractC3569ma.f32235e3;
            q2.r rVar = q2.r.f40204e;
            if (((Boolean) rVar.f40207c.a(c3301ha)).booleanValue()) {
                C4900p.a();
            }
            C3301ha c3301ha2 = AbstractC3569ma.ka;
            SharedPreferencesOnSharedPreferenceChangeListenerC3461ka sharedPreferencesOnSharedPreferenceChangeListenerC3461ka = rVar.f40207c;
            boolean booleanValue = ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(c3301ha2)).booleanValue();
            C3309hi c3309hi = this.f32964c;
            if (booleanValue && c1Var.f40120y) {
                ((C2749Qo) c3309hi.f30840G.f()).b(true);
            }
            Pair pair = new Pair("api-call", Long.valueOf(c1Var.f40111S));
            C4835j.f39730C.f39742k.getClass();
            Bundle b10 = AbstractC3043cl.b(pair, new Pair("dynamite-enter", Long.valueOf(System.currentTimeMillis())));
            c2999bu.f29345c = str;
            c2999bu.f29343a = c1Var;
            c2999bu.f29361t = b10;
            C3052cu a9 = c2999bu.a();
            int F8 = AbstractC2772Sd.F(a9);
            Context context = this.f32962a;
            Su e9 = Su.e(context, F8, 3, c1Var);
            boolean booleanValue2 = ((Boolean) AbstractC2817Va.f28203f.r()).booleanValue();
            Vu vu = null;
            Dr dr = this.f32965d;
            if (!booleanValue2 || !c2999bu.f29344b.f40133D) {
                boolean booleanValue3 = ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.p9)).booleanValue();
                FrameLayout frameLayout = this.f32967f;
                C3418jl c3418jl = this.f32970j;
                C2875Yk c2875Yk = this.f32969h;
                if (booleanValue3) {
                    C3309hi c3309hi2 = c3309hi.f30874b;
                    C3687ok c3687ok = new C3687ok();
                    c3687ok.f32932a = context;
                    c3687ok.f32933b = a9;
                    C3687ok c3687ok2 = new C3687ok(c3687ok);
                    C3796ql c3796ql = new C3796ql();
                    c3796ql.d(dr, executor);
                    c3796ql.b(dr, executor);
                    C3849rl c3849rl = new C3849rl(c3796ql);
                    C3694or c3694or = new C3694or(i6, this.f32968g);
                    C2991bm c2991bm = new C2991bm(i6, C4282zm.f35443h, vu);
                    S0.s sVar = new S0.s(i, c2875Yk, c3418jl);
                    c3577mi = new C3577mi(c3309hi2, new Ux(16, frameLayout), c2991bm, new C3472kl(23), c3849rl, c3687ok2, new C3657o7(27), c3694or, sVar, null, null);
                } else {
                    C3309hi c3309hi3 = c3309hi.f30874b;
                    C3687ok c3687ok3 = new C3687ok();
                    c3687ok3.f32932a = context;
                    c3687ok3.f32933b = a9;
                    C3687ok c3687ok4 = new C3687ok(c3687ok3);
                    C3796ql c3796ql2 = new C3796ql();
                    c3796ql2.d(dr, executor);
                    C2491Bl c2491Bl = new C2491Bl(dr, executor);
                    HashSet hashSet = (HashSet) c3796ql2.f33380c;
                    hashSet.add(c2491Bl);
                    hashSet.add(new C2491Bl(this.f32966e, executor));
                    c3796ql2.c(dr, executor);
                    ((HashSet) c3796ql2.f33383f).add(new C2491Bl(dr, executor));
                    ((HashSet) c3796ql2.f33382e).add(new C2491Bl(dr, executor));
                    ((HashSet) c3796ql2.f33385h).add(new C2491Bl(dr, executor));
                    c3796ql2.a(dr, executor);
                    c3796ql2.b(dr, executor);
                    ((HashSet) c3796ql2.f33389m).add(new C2491Bl(dr, executor));
                    C3849rl c3849rl2 = new C3849rl(c3796ql2);
                    C3694or c3694or2 = new C3694or(i6, this.f32968g);
                    C2991bm c2991bm2 = new C2991bm(i6, C4282zm.f35443h, vu);
                    S0.s sVar2 = new S0.s(13, c2875Yk, c3418jl);
                    c3577mi = new C3577mi(c3309hi3, new Ux(16, frameLayout), c2991bm2, new C3472kl(23), c3849rl2, c3687ok4, new C3657o7(27), c3694or2, sVar2, null, null);
                }
                if (((Boolean) AbstractC2633Ka.f25928c.r()).booleanValue()) {
                    vu = (Vu) c3577mi.f32546u0.f();
                    vu.i(3);
                    vu.c(c1Var.f40102I);
                    vu.d(c1Var.f40099F);
                }
                this.f32975o = ir;
                C2710Oj c2710Oj = (C2710Oj) c3577mi.f32456I0.f();
                Iu c9 = c2710Oj.c(c2710Oj.b());
                this.f32972l = c9;
                c9.a(new LD(i6, c9, new C2570Gf(this, vu, e9, c3577mi)), executor);
                return true;
            }
            if (dr != null) {
                dr.v(SK.F(7, null, null));
            }
        } else if (!c2999bu.f29357p) {
            this.f32973m = true;
            return false;
        }
        return false;
    }

    public final boolean b() {
        Iu iu = this.f32972l;
        return (iu == null || iu.f25615v.isDone()) ? false : true;
    }

    public final void c() {
        synchronized (this) {
            try {
                Iu iu = this.f32972l;
                if (iu != null && iu.f25615v.isDone()) {
                    try {
                        C3524lj c3524lj = (C3524lj) this.f32972l.f25615v.get();
                        this.f32972l = null;
                        FrameLayout frameLayout = this.f32967f;
                        frameLayout.removeAllViews();
                        c3524lj.getClass();
                        ViewParent parent = c3524lj.f31827m.getParent();
                        if (parent instanceof ViewGroup) {
                            String str = c3524lj.f24838f.f33698n;
                            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 78);
                            sb.append("Banner view provided from ");
                            sb.append(str);
                            sb.append(" already has a parent view. Removing its old parent.");
                            String sb2 = sb.toString();
                            int i = u2.z.f41319b;
                            v2.i.f(sb2);
                            ((ViewGroup) parent).removeView(c3524lj.f31827m);
                        }
                        C3301ha c3301ha = AbstractC3569ma.p9;
                        q2.r rVar = q2.r.f40204e;
                        if (((Boolean) rVar.f40207c.a(c3301ha)).booleanValue()) {
                            C3694or c3694or = c3524lj.f24839g.f29838n;
                            Dr dr = this.f32965d;
                            C3097dl c3097dl = (C3097dl) c3694or.f32954u;
                            c3097dl.f29839u = dr;
                            c3097dl.f29840v = this.f32966e;
                        }
                        frameLayout.addView(c3524lj.f31827m);
                        Ir ir = this.f32975o;
                        if (ir != null) {
                            ir.s(c3524lj);
                        }
                        if (((Boolean) rVar.f40207c.a(c3301ha)).booleanValue()) {
                            Executor executor = this.f32963b;
                            Dr dr2 = this.f32965d;
                            Objects.requireNonNull(dr2);
                            executor.execute(new RunnableC3470kj(23, dr2));
                        }
                        int i6 = ((Ut) c3524lj.f24833a.f28754b.f25043v).f28006d;
                        if (i6 >= 0) {
                            this.f32973m = false;
                            C2875Yk c2875Yk = this.f32969h;
                            c2875Yk.Q1(i6);
                            c2875Yk.T1(c3524lj.d());
                        } else {
                            this.f32973m = true;
                            this.f32969h.Q1(c3524lj.d());
                        }
                    } catch (InterruptedException e9) {
                        e = e9;
                        e();
                        u2.z.l("Error occurred while refreshing the ad. Making a new ad request.", e);
                        this.f32973m = true;
                        this.f32969h.F();
                    } catch (ExecutionException e10) {
                        e = e10;
                        e();
                        u2.z.l("Error occurred while refreshing the ad. Making a new ad request.", e);
                        this.f32973m = true;
                        this.f32969h.F();
                    }
                } else if (this.f32972l != null) {
                    u2.z.k("Show timer went off but there is an ongoing ad request.");
                    this.f32973m = true;
                } else {
                    u2.z.k("No ad request was in progress or an ad was cached when show timer went off. Hence requesting a new ad.");
                    this.f32973m = true;
                    this.f32969h.F();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d() {
        Object parent = this.f32967f.getParent();
        if (!(parent instanceof View)) {
            return false;
        }
        View view = (View) parent;
        u2.D d2 = C4835j.f39730C.f39735c;
        Context context = view.getContext();
        Context applicationContext = context.getApplicationContext();
        KeyguardManager keyguardManager = null;
        PowerManager powerManager = applicationContext != null ? (PowerManager) applicationContext.getSystemService("power") : null;
        Object systemService = context.getSystemService("keyguard");
        if (systemService != null && (systemService instanceof KeyguardManager)) {
            keyguardManager = (KeyguardManager) systemService;
        }
        return u2.D.r(view, powerManager, keyguardManager);
    }

    public final void e() {
        this.f32972l = null;
        C4920z0 c4920z0 = this.f32974n;
        this.f32974n = null;
        if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.p9)).booleanValue() && c4920z0 != null) {
            this.f32963b.execute(new RunnableC3048cq(7, this, c4920z0));
        }
        Ir ir = this.f32975o;
        if (ir != null) {
            ir.mo12c();
        }
    }
}
