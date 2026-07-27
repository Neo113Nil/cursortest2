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
import q2.C4907p;
import q2.C4927z0;

/* renamed from: com.google.android.gms.internal.ads.pt, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3763pt {

    /* renamed from: a, reason: collision with root package name */
    public final Context f33527a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f33528b;

    /* renamed from: c, reason: collision with root package name */
    public final C3214fi f33529c;

    /* renamed from: d, reason: collision with root package name */
    public final Fr f33530d;

    /* renamed from: e, reason: collision with root package name */
    public final Hr f33531e;

    /* renamed from: f, reason: collision with root package name */
    public final FrameLayout f33532f;

    /* renamed from: g, reason: collision with root package name */
    public C3744pa f33533g;

    /* renamed from: h, reason: collision with root package name */
    public final C2863Xk f33534h;
    public final Zu i;

    /* renamed from: j, reason: collision with root package name */
    public final C3378il f33535j;

    /* renamed from: k, reason: collision with root package name */
    public final C3171eu f33536k;

    /* renamed from: l, reason: collision with root package name */
    public Ku f33537l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f33538m;

    /* renamed from: n, reason: collision with root package name */
    public C4927z0 f33539n;

    /* renamed from: o, reason: collision with root package name */
    public Kr f33540o;

    public C3763pt(Context context, Executor executor, q2.g1 g1Var, C3214fi c3214fi, Fr fr, Hr hr, C3171eu c3171eu, C3378il c3378il) {
        this.f33527a = context;
        this.f33528b = executor;
        this.f33529c = c3214fi;
        this.f33530d = fr;
        this.f33531e = hr;
        this.f33536k = c3171eu;
        this.f33534h = new C2863Xk((ScheduledExecutorService) c3214fi.f30799d.d(), (S2.a) c3214fi.f30803f.d(), (C3165eo) c3214fi.f30819o.d());
        this.i = c3214fi.c();
        this.f33532f = new FrameLayout(context);
        this.f33535j = c3378il;
        c3171eu.f30531b = g1Var;
        this.f33538m = true;
        this.f33539n = null;
        this.f33540o = null;
    }

    public final boolean a(q2.d1 d1Var, String str, PA pa, Kr kr) {
        C3482ki c3482ki;
        int i = 22;
        int i4 = 26;
        int i9 = 0;
        Executor executor = this.f33528b;
        if (str == null) {
            int i10 = t2.C.f40822b;
            u2.i.c("Ad unit ID should not be null for banner ad.");
            executor.execute(new RunnableC3376ij(i, this));
            return false;
        }
        boolean b9 = b();
        C3171eu c3171eu = this.f33536k;
        if (!b9) {
            C3151ea c3151ea = AbstractC3368ia.f31654e3;
            q2.r rVar = q2.r.f40116e;
            if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
                C4907p.a();
            }
            C3151ea c3151ea2 = AbstractC3368ia.ka;
            SharedPreferencesOnSharedPreferenceChangeListenerC3260ga sharedPreferencesOnSharedPreferenceChangeListenerC3260ga = rVar.f40119c;
            boolean booleanValue = ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(c3151ea2)).booleanValue();
            C3214fi c3214fi = this.f33529c;
            if (booleanValue && d1Var.f40034y) {
                ((C2748Qo) c3214fi.f30762G.d()).b(true);
            }
            Pair pair = new Pair("api-call", Long.valueOf(d1Var.f40025S));
            p2.j.f39798C.f39810k.getClass();
            Bundle c4 = AbstractC3035cL.c(pair, new Pair("dynamite-enter", Long.valueOf(System.currentTimeMillis())));
            c3171eu.f30532c = str;
            c3171eu.f30530a = d1Var;
            c3171eu.f30548t = c4;
            C3226fu a9 = c3171eu.a();
            int N8 = PA.N(a9);
            Context context = this.f33527a;
            Vu e6 = Vu.e(context, N8, 3, d1Var);
            boolean booleanValue2 = ((Boolean) AbstractC2751Ra.f27378f.r()).booleanValue();
            Yu yu = null;
            Fr fr = this.f33530d;
            if (!booleanValue2 || !c3171eu.f30531b.f40050D) {
                boolean booleanValue3 = ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.p9)).booleanValue();
                FrameLayout frameLayout = this.f33532f;
                C3378il c3378il = this.f33535j;
                C2863Xk c2863Xk = this.f33534h;
                if (booleanValue3) {
                    C3214fi c3214fi2 = c3214fi.f30795b;
                    C3646nk c3646nk = new C3646nk();
                    c3646nk.f32990a = context;
                    c3646nk.f32991b = a9;
                    C3646nk c3646nk2 = new C3646nk(c3646nk);
                    C3755pl c3755pl = new C3755pl();
                    c3755pl.d(fr, executor);
                    c3755pl.b(fr, executor);
                    C3809ql c3809ql = new C3809ql(c3755pl);
                    C3761pr c3761pr = new C3761pr(i9, this.f33533g);
                    C2881Yl c2881Yl = new C2881Yl(i9, C4133wm.f35060h, yu);
                    C2881Yl c2881Yl2 = new C2881Yl(i4, c2863Xk, c3378il);
                    c3482ki = new C3482ki(c3214fi2, new Vx(16, frameLayout), c2881Yl, new C3431jl(22), c3809ql, c3646nk2, new C3562m7(i4), c3761pr, c2881Yl2, null, null);
                } else {
                    C3214fi c3214fi3 = c3214fi.f30795b;
                    C3646nk c3646nk3 = new C3646nk();
                    c3646nk3.f32990a = context;
                    c3646nk3.f32991b = a9;
                    C3646nk c3646nk4 = new C3646nk(c3646nk3);
                    C3755pl c3755pl2 = new C3755pl();
                    c3755pl2.d(fr, executor);
                    C2473Al c2473Al = new C2473Al(fr, executor);
                    HashSet hashSet = (HashSet) c3755pl2.f33493c;
                    hashSet.add(c2473Al);
                    hashSet.add(new C2473Al(this.f33531e, executor));
                    c3755pl2.c(fr, executor);
                    ((HashSet) c3755pl2.f33496f).add(new C2473Al(fr, executor));
                    ((HashSet) c3755pl2.f33495e).add(new C2473Al(fr, executor));
                    ((HashSet) c3755pl2.f33498h).add(new C2473Al(fr, executor));
                    c3755pl2.a(fr, executor);
                    c3755pl2.b(fr, executor);
                    ((HashSet) c3755pl2.f33502m).add(new C2473Al(fr, executor));
                    C3809ql c3809ql2 = new C3809ql(c3755pl2);
                    C3761pr c3761pr2 = new C3761pr(i9, this.f33533g);
                    C2881Yl c2881Yl3 = new C2881Yl(i9, C4133wm.f35060h, yu);
                    int i11 = 26;
                    C2881Yl c2881Yl4 = new C2881Yl(i11, c2863Xk, c3378il);
                    c3482ki = new C3482ki(c3214fi3, new Vx(16, frameLayout), c2881Yl3, new C3431jl(22), c3809ql2, c3646nk4, new C3562m7(i11), c3761pr2, c2881Yl4, null, null);
                }
                if (((Boolean) AbstractC2547Fa.f24966c.r()).booleanValue()) {
                    yu = (Yu) c3482ki.f32423u0.d();
                    yu.i(3);
                    yu.c(d1Var.f40016I);
                    yu.d(d1Var.f40013F);
                }
                this.f33540o = kr;
                C2709Oj c2709Oj = (C2709Oj) c3482ki.f32333I0.d();
                Ku c9 = c2709Oj.c(c2709Oj.b());
                this.f33537l = c9;
                c9.c(new MD(i9, c9, new C2518Df(this, yu, e6, c3482ki)), executor);
                return true;
            }
            if (fr != null) {
                fr.v(AbstractC3217fl.M(7, null, null));
            }
        } else if (!c3171eu.f30544p) {
            this.f33538m = true;
            return false;
        }
        return false;
    }

    public final boolean b() {
        Ku ku = this.f33537l;
        return (ku == null || ku.f26063v.isDone()) ? false : true;
    }

    public final void c() {
        synchronized (this) {
            try {
                Ku ku = this.f33537l;
                if (ku != null && ku.f26063v.isDone()) {
                    try {
                        C3429jj c3429jj = (C3429jj) this.f33537l.f26063v.get();
                        this.f33537l = null;
                        FrameLayout frameLayout = this.f33532f;
                        frameLayout.removeAllViews();
                        c3429jj.getClass();
                        ViewParent parent = c3429jj.f32158m.getParent();
                        if (parent instanceof ViewGroup) {
                            String str = c3429jj.f24808f.f33484n;
                            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 78);
                            sb.append("Banner view provided from ");
                            sb.append(str);
                            sb.append(" already has a parent view. Removing its old parent.");
                            String sb2 = sb.toString();
                            int i = t2.C.f40822b;
                            u2.i.f(sb2);
                            ((ViewGroup) parent).removeView(c3429jj.f32158m);
                        }
                        C3151ea c3151ea = AbstractC3368ia.p9;
                        q2.r rVar = q2.r.f40116e;
                        if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
                            C3761pr c3761pr = c3429jj.f24809g.f29564n;
                            Fr fr = this.f33530d;
                            C2999bl c2999bl = (C2999bl) c3761pr.f33523u;
                            c2999bl.f29565u = fr;
                            c2999bl.f29566v = this.f33531e;
                        }
                        frameLayout.addView(c3429jj.f32158m);
                        Kr kr = this.f33540o;
                        if (kr != null) {
                            kr.u(c3429jj);
                        }
                        if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
                            Executor executor = this.f33528b;
                            Fr fr2 = this.f33530d;
                            Objects.requireNonNull(fr2);
                            executor.execute(new RunnableC3376ij(23, fr2));
                        }
                        int i4 = ((Wt) c3429jj.f24803a.f29349b.f24454v).f28493d;
                        if (i4 >= 0) {
                            this.f33538m = false;
                            C2863Xk c2863Xk = this.f33534h;
                            c2863Xk.v1(i4);
                            c2863Xk.w1(c3429jj.d());
                        } else {
                            this.f33538m = true;
                            this.f33534h.v1(c3429jj.d());
                        }
                    } catch (InterruptedException e6) {
                        e = e6;
                        e();
                        t2.C.l("Error occurred while refreshing the ad. Making a new ad request.", e);
                        this.f33538m = true;
                        this.f33534h.x();
                    } catch (ExecutionException e9) {
                        e = e9;
                        e();
                        t2.C.l("Error occurred while refreshing the ad. Making a new ad request.", e);
                        this.f33538m = true;
                        this.f33534h.x();
                    }
                } else if (this.f33537l != null) {
                    t2.C.k("Show timer went off but there is an ongoing ad request.");
                    this.f33538m = true;
                } else {
                    t2.C.k("No ad request was in progress or an ad was cached when show timer went off. Hence requesting a new ad.");
                    this.f33538m = true;
                    this.f33534h.x();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d() {
        Object parent = this.f33532f.getParent();
        if (!(parent instanceof View)) {
            return false;
        }
        View view = (View) parent;
        t2.G g9 = p2.j.f39798C.f39803c;
        Context context = view.getContext();
        Context applicationContext = context.getApplicationContext();
        KeyguardManager keyguardManager = null;
        PowerManager powerManager = applicationContext != null ? (PowerManager) applicationContext.getSystemService("power") : null;
        Object systemService = context.getSystemService("keyguard");
        if (systemService != null && (systemService instanceof KeyguardManager)) {
            keyguardManager = (KeyguardManager) systemService;
        }
        return t2.G.r(view, powerManager, keyguardManager);
    }

    public final void e() {
        this.f33537l = null;
        C4927z0 c4927z0 = this.f33539n;
        this.f33539n = null;
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.p9)).booleanValue() && c4927z0 != null) {
            this.f33528b.execute(new RunnableC3329hp(8, this, c4927z0));
        }
        Kr kr = this.f33540o;
        if (kr != null) {
            kr.mo0a();
        }
    }
}
