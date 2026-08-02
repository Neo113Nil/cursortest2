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
import r2.C4906k;
import s2.C4949p;
import s2.C4969z0;

/* renamed from: com.google.android.gms.internal.ads.ot, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3719ot {

    /* renamed from: a, reason: collision with root package name */
    public final Context f33748a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f33749b;

    /* renamed from: c, reason: collision with root package name */
    public final C3332hi f33750c;

    /* renamed from: d, reason: collision with root package name */
    public final Dr f33751d;

    /* renamed from: e, reason: collision with root package name */
    public final Fr f33752e;

    /* renamed from: f, reason: collision with root package name */
    public final FrameLayout f33753f;

    /* renamed from: g, reason: collision with root package name */
    public C3915sa f33754g;

    /* renamed from: h, reason: collision with root package name */
    public final C2898Yk f33755h;
    public final Wu i;

    /* renamed from: j, reason: collision with root package name */
    public final C3441jl f33756j;

    /* renamed from: k, reason: collision with root package name */
    public final C3022bu f33757k;

    /* renamed from: l, reason: collision with root package name */
    public Iu f33758l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f33759m;

    /* renamed from: n, reason: collision with root package name */
    public C4969z0 f33760n;

    /* renamed from: o, reason: collision with root package name */
    public Ir f33761o;

    public C3719ot(Context context, Executor executor, s2.f1 f1Var, C3332hi c3332hi, Dr dr, Fr fr, C3022bu c3022bu, C3441jl c3441jl) {
        this.f33748a = context;
        this.f33749b = executor;
        this.f33750c = c3332hi;
        this.f33751d = dr;
        this.f33752e = fr;
        this.f33757k = c3022bu;
        this.f33755h = new C2898Yk((ScheduledExecutorService) c3332hi.f31639d.f(), (V2.a) c3332hi.f31643f.f(), (C3230fo) c3332hi.f31659o.f());
        this.i = c3332hi.c();
        this.f33753f = new FrameLayout(context);
        this.f33756j = c3441jl;
        c3022bu.f30132b = f1Var;
        this.f33759m = true;
        this.f33760n = null;
        this.f33761o = null;
    }

    public final boolean a(s2.c1 c1Var, String str, AbstractC2792Sd abstractC2792Sd, Ir ir) {
        C3600mi c3600mi;
        int i = 15;
        int i4 = 0;
        Executor executor = this.f33749b;
        if (str == null) {
            int i6 = w2.z.f41712b;
            x2.i.c("Ad unit ID should not be null for banner ad.");
            executor.execute(new RunnableC3493kj(22, this));
            return false;
        }
        boolean b9 = b();
        C3022bu c3022bu = this.f33757k;
        if (!b9) {
            C3324ha c3324ha = AbstractC3592ma.f33015e3;
            s2.r rVar = s2.r.f40506e;
            if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
                C4949p.a();
            }
            C3324ha c3324ha2 = AbstractC3592ma.ka;
            SharedPreferencesOnSharedPreferenceChangeListenerC3484ka sharedPreferencesOnSharedPreferenceChangeListenerC3484ka = rVar.f40509c;
            boolean booleanValue = ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(c3324ha2)).booleanValue();
            C3332hi c3332hi = this.f33750c;
            if (booleanValue && c1Var.f40422y) {
                ((C2786Ro) c3332hi.f31601G.f()).b(true);
            }
            Pair pair = new Pair("api-call", Long.valueOf(c1Var.f40413S));
            C4906k.f40186C.f40198k.getClass();
            Bundle b10 = AbstractC3066cl.b(pair, new Pair("dynamite-enter", Long.valueOf(System.currentTimeMillis())));
            c3022bu.f30133c = str;
            c3022bu.f30131a = c1Var;
            c3022bu.f30149t = b10;
            C3075cu a9 = c3022bu.a();
            int F8 = AbstractC2792Sd.F(a9);
            Context context = this.f33748a;
            Su j6 = Su.j(context, F8, 3, c1Var);
            boolean booleanValue2 = ((Boolean) AbstractC2840Va.f29000f.r()).booleanValue();
            Vu vu = null;
            Dr dr = this.f33751d;
            if (!booleanValue2 || !c3022bu.f30132b.f40435D) {
                boolean booleanValue3 = ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.p9)).booleanValue();
                FrameLayout frameLayout = this.f33753f;
                C3441jl c3441jl = this.f33756j;
                C2898Yk c2898Yk = this.f33755h;
                if (booleanValue3) {
                    C3332hi c3332hi2 = c3332hi.f31635b;
                    C3710ok c3710ok = new C3710ok();
                    c3710ok.f33718a = context;
                    c3710ok.f33719b = a9;
                    C3710ok c3710ok2 = new C3710ok(c3710ok);
                    C3819ql c3819ql = new C3819ql();
                    c3819ql.d(dr, executor);
                    c3819ql.b(dr, executor);
                    C3872rl c3872rl = new C3872rl(c3819ql);
                    C3717or c3717or = new C3717or(i4, this.f33754g);
                    C3067cm c3067cm = new C3067cm(i4, C2495Am.f24509h, vu);
                    S0.s sVar = new S0.s(i, c2898Yk, c3441jl);
                    c3600mi = new C3600mi(c3332hi2, new Ux(16, frameLayout), c3067cm, new C3495kl(23), c3872rl, c3710ok2, new C3680o7(27), c3717or, sVar, null, null);
                } else {
                    C3332hi c3332hi3 = c3332hi.f31635b;
                    C3710ok c3710ok3 = new C3710ok();
                    c3710ok3.f33718a = context;
                    c3710ok3.f33719b = a9;
                    C3710ok c3710ok4 = new C3710ok(c3710ok3);
                    C3819ql c3819ql2 = new C3819ql();
                    c3819ql2.d(dr, executor);
                    C2528Cl c2528Cl = new C2528Cl(dr, executor);
                    HashSet hashSet = (HashSet) c3819ql2.f34162c;
                    hashSet.add(c2528Cl);
                    hashSet.add(new C2528Cl(this.f33752e, executor));
                    c3819ql2.c(dr, executor);
                    ((HashSet) c3819ql2.f34165f).add(new C2528Cl(dr, executor));
                    ((HashSet) c3819ql2.f34164e).add(new C2528Cl(dr, executor));
                    ((HashSet) c3819ql2.f34167h).add(new C2528Cl(dr, executor));
                    c3819ql2.a(dr, executor);
                    c3819ql2.b(dr, executor);
                    ((HashSet) c3819ql2.f34171m).add(new C2528Cl(dr, executor));
                    C3872rl c3872rl2 = new C3872rl(c3819ql2);
                    C3717or c3717or2 = new C3717or(i4, this.f33754g);
                    C3067cm c3067cm2 = new C3067cm(i4, C2495Am.f24509h, vu);
                    S0.s sVar2 = new S0.s(15, c2898Yk, c3441jl);
                    c3600mi = new C3600mi(c3332hi3, new Ux(16, frameLayout), c3067cm2, new C3495kl(23), c3872rl2, c3710ok4, new C3680o7(27), c3717or2, sVar2, null, null);
                }
                if (((Boolean) AbstractC2653Ka.f26706c.r()).booleanValue()) {
                    vu = (Vu) c3600mi.f33326u0.f();
                    vu.i(3);
                    vu.c(c1Var.f40404I);
                    vu.d(c1Var.f40401F);
                }
                this.f33761o = ir;
                C2730Oj c2730Oj = (C2730Oj) c3600mi.f33236I0.f();
                Iu c9 = c2730Oj.c(c2730Oj.b());
                this.f33758l = c9;
                c9.a(new LD(i4, c9, new C2590Gf(this, vu, j6, c3600mi)), executor);
                return true;
            }
            if (dr != null) {
                dr.I(SK.F(7, null, null));
            }
        } else if (!c3022bu.f30145p) {
            this.f33759m = true;
            return false;
        }
        return false;
    }

    public final boolean b() {
        Iu iu = this.f33758l;
        return (iu == null || iu.f26368v.isDone()) ? false : true;
    }

    public final void c() {
        synchronized (this) {
            try {
                Iu iu = this.f33758l;
                if (iu != null && iu.f26368v.isDone()) {
                    try {
                        C3547lj c3547lj = (C3547lj) this.f33758l.f26368v.get();
                        this.f33758l = null;
                        FrameLayout frameLayout = this.f33753f;
                        frameLayout.removeAllViews();
                        c3547lj.getClass();
                        ViewParent parent = c3547lj.f32605m.getParent();
                        if (parent instanceof ViewGroup) {
                            String str = c3547lj.f25627f.f34470n;
                            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 78);
                            sb.append("Banner view provided from ");
                            sb.append(str);
                            sb.append(" already has a parent view. Removing its old parent.");
                            String sb2 = sb.toString();
                            int i = w2.z.f41712b;
                            x2.i.f(sb2);
                            ((ViewGroup) parent).removeView(c3547lj.f32605m);
                        }
                        C3324ha c3324ha = AbstractC3592ma.p9;
                        s2.r rVar = s2.r.f40506e;
                        if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
                            C3717or c3717or = c3547lj.f25628g.f30611n;
                            Dr dr = this.f33751d;
                            C3120dl c3120dl = (C3120dl) c3717or.f33740u;
                            c3120dl.f30612u = dr;
                            c3120dl.f30613v = this.f33752e;
                        }
                        frameLayout.addView(c3547lj.f32605m);
                        Ir ir = this.f33761o;
                        if (ir != null) {
                            ir.s(c3547lj);
                        }
                        if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
                            Executor executor = this.f33749b;
                            Dr dr2 = this.f33751d;
                            Objects.requireNonNull(dr2);
                            executor.execute(new RunnableC3493kj(23, dr2));
                        }
                        int i4 = ((Ut) c3547lj.f25622a.f29533b.f25831v).f28803d;
                        if (i4 >= 0) {
                            this.f33759m = false;
                            C2898Yk c2898Yk = this.f33755h;
                            c2898Yk.R1(i4);
                            c2898Yk.T1(c3547lj.d());
                        } else {
                            this.f33759m = true;
                            this.f33755h.R1(c3547lj.d());
                        }
                    } catch (InterruptedException e9) {
                        e = e9;
                        e();
                        w2.z.l("Error occurred while refreshing the ad. Making a new ad request.", e);
                        this.f33759m = true;
                        this.f33755h.F();
                    } catch (ExecutionException e10) {
                        e = e10;
                        e();
                        w2.z.l("Error occurred while refreshing the ad. Making a new ad request.", e);
                        this.f33759m = true;
                        this.f33755h.F();
                    }
                } else if (this.f33758l != null) {
                    w2.z.k("Show timer went off but there is an ongoing ad request.");
                    this.f33759m = true;
                } else {
                    w2.z.k("No ad request was in progress or an ad was cached when show timer went off. Hence requesting a new ad.");
                    this.f33759m = true;
                    this.f33755h.F();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d() {
        Object parent = this.f33753f.getParent();
        if (!(parent instanceof View)) {
            return false;
        }
        View view = (View) parent;
        w2.D d9 = C4906k.f40186C.f40191c;
        Context context = view.getContext();
        Context applicationContext = context.getApplicationContext();
        KeyguardManager keyguardManager = null;
        PowerManager powerManager = applicationContext != null ? (PowerManager) applicationContext.getSystemService("power") : null;
        Object systemService = context.getSystemService("keyguard");
        if (systemService != null && (systemService instanceof KeyguardManager)) {
            keyguardManager = (KeyguardManager) systemService;
        }
        return w2.D.r(view, powerManager, keyguardManager);
    }

    public final void e() {
        this.f33758l = null;
        C4969z0 c4969z0 = this.f33760n;
        this.f33760n = null;
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.p9)).booleanValue() && c4969z0 != null) {
            this.f33749b.execute(new RunnableC3071cq(7, this, c4969z0));
        }
        Ir ir = this.f33761o;
        if (ir != null) {
            ir.mo11c();
        }
    }
}
