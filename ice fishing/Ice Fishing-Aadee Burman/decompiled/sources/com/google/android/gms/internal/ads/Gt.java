package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import java.util.HashSet;
import java.util.concurrent.Executor;
import p2.C4835j;
import q2.C4900p;

/* loaded from: classes2.dex */
public final class Gt {

    /* renamed from: a, reason: collision with root package name */
    public final Context f25150a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f25151b;

    /* renamed from: c, reason: collision with root package name */
    public final C3309hi f25152c;

    /* renamed from: d, reason: collision with root package name */
    public final Dr f25153d;

    /* renamed from: e, reason: collision with root package name */
    public final Jt f25154e;

    /* renamed from: f, reason: collision with root package name */
    public C3892sa f25155f;

    /* renamed from: g, reason: collision with root package name */
    public final Wu f25156g;

    /* renamed from: h, reason: collision with root package name */
    public final C2999bu f25157h;
    public Iu i;

    public Gt(Context context, Executor executor, C3309hi c3309hi, Dr dr, Jt jt, C2999bu c2999bu) {
        this.f25150a = context;
        this.f25151b = executor;
        this.f25152c = c3309hi;
        this.f25153d = dr;
        this.f25157h = c2999bu;
        this.f25154e = jt;
        this.f25156g = c3309hi.c();
    }

    public final boolean a(q2.c1 c1Var, String str, AbstractC2772Sd abstractC2772Sd, Ir ir) {
        boolean z3;
        C3793qi c3793qi;
        Vu vu;
        Executor executor = this.f25151b;
        if (str == null) {
            int i = u2.z.f41319b;
            v2.i.c("Ad unit ID should not be null for interstitial ad.");
            executor.execute(new RunnableC3470kj(24, this));
            return false;
        }
        if (b()) {
            return false;
        }
        C3301ha c3301ha = AbstractC3569ma.f32235e3;
        q2.r rVar = q2.r.f40204e;
        if (((Boolean) rVar.f40207c.a(c3301ha)).booleanValue()) {
            C4900p.a();
        }
        C3301ha c3301ha2 = AbstractC3569ma.ka;
        SharedPreferencesOnSharedPreferenceChangeListenerC3461ka sharedPreferencesOnSharedPreferenceChangeListenerC3461ka = rVar.f40207c;
        boolean booleanValue = ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(c3301ha2)).booleanValue();
        C3309hi c3309hi = this.f25152c;
        if (booleanValue && c1Var.f40120y) {
            ((C2749Qo) c3309hi.f30840G.f()).b(true);
        }
        Pair pair = new Pair("api-call", Long.valueOf(c1Var.f40111S));
        C4835j.f39730C.f39742k.getClass();
        Bundle b9 = AbstractC3043cl.b(pair, new Pair("dynamite-enter", Long.valueOf(System.currentTimeMillis())));
        C2999bu c2999bu = this.f25157h;
        c2999bu.f29345c = str;
        c2999bu.f29344b = ((Ct) abstractC2772Sd).f24257M;
        c2999bu.f29343a = c1Var;
        c2999bu.f29361t = b9;
        C3052cu a9 = c2999bu.a();
        int F8 = AbstractC2772Sd.F(a9);
        Context context = this.f25150a;
        Su e9 = Su.e(context, F8, 4, c1Var);
        boolean booleanValue2 = ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.r9)).booleanValue();
        Dr dr = this.f25153d;
        if (booleanValue2) {
            C3309hi c3309hi2 = c3309hi.f30874b;
            C3687ok c3687ok = new C3687ok();
            c3687ok.f32932a = context;
            c3687ok.f32933b = a9;
            C3687ok c3687ok2 = new C3687ok(c3687ok);
            C3796ql c3796ql = new C3796ql();
            c3796ql.d(dr, executor);
            c3796ql.b(dr, executor);
            c3793qi = new C3793qi(c3309hi2, new C3472kl(23), new C3849rl(c3796ql), c3687ok2, new C3657o7(27), new C3694or(0, this.f25155f), null, null);
            z3 = true;
        } else {
            C3796ql c3796ql2 = new C3796ql();
            HashSet hashSet = (HashSet) c3796ql2.f33385h;
            HashSet hashSet2 = (HashSet) c3796ql2.f33382e;
            z3 = true;
            Jt jt = this.f25154e;
            if (jt != null) {
                hashSet2.add(new C2491Bl(jt, executor));
                hashSet.add(new C2491Bl(jt, executor));
                c3796ql2.a(jt, executor);
            }
            C3309hi c3309hi3 = c3309hi.f30874b;
            C3687ok c3687ok3 = new C3687ok();
            c3687ok3.f32932a = context;
            c3687ok3.f32933b = a9;
            C3687ok c3687ok4 = new C3687ok(c3687ok3);
            c3796ql2.d(dr, executor);
            hashSet2.add(new C2491Bl(dr, executor));
            hashSet.add(new C2491Bl(dr, executor));
            c3796ql2.a(dr, executor);
            ((HashSet) c3796ql2.f33380c).add(new C2491Bl(dr, executor));
            c3796ql2.c(dr, executor);
            c3796ql2.b(dr, executor);
            ((HashSet) c3796ql2.f33389m).add(new C2491Bl(dr, executor));
            ((HashSet) c3796ql2.f33388l).add(new C2491Bl(dr, executor));
            c3793qi = new C3793qi(c3309hi3, new C3472kl(23), new C3849rl(c3796ql2), c3687ok4, new C3657o7(27), new C3694or(0, this.f25155f), null, null);
        }
        if (((Boolean) AbstractC2633Ka.f25928c.r()).booleanValue()) {
            vu = (Vu) c3793qi.f33348o0.f();
            vu.i(4);
            vu.c(c1Var.f40102I);
            vu.d(c1Var.f40099F);
        } else {
            vu = null;
        }
        Vu vu2 = vu;
        C2710Oj c2710Oj = (C2710Oj) c3793qi.C0.f();
        Iu c9 = c2710Oj.c(c2710Oj.b());
        this.i = c9;
        c9.a(new LD(0, c9, new C3864s(this, ir, vu2, e9, c3793qi)), executor);
        return z3;
    }

    public final boolean b() {
        Iu iu = this.i;
        return (iu == null || iu.f25615v.isDone()) ? false : true;
    }
}
