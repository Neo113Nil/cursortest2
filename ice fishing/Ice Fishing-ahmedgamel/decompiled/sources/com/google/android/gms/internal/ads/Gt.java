package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import java.util.HashSet;
import java.util.concurrent.Executor;
import r2.C4906k;
import s2.C4949p;

/* loaded from: classes2.dex */
public final class Gt {

    /* renamed from: a, reason: collision with root package name */
    public final Context f25922a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f25923b;

    /* renamed from: c, reason: collision with root package name */
    public final C3332hi f25924c;

    /* renamed from: d, reason: collision with root package name */
    public final Dr f25925d;

    /* renamed from: e, reason: collision with root package name */
    public final Jt f25926e;

    /* renamed from: f, reason: collision with root package name */
    public C3915sa f25927f;

    /* renamed from: g, reason: collision with root package name */
    public final Wu f25928g;

    /* renamed from: h, reason: collision with root package name */
    public final C3022bu f25929h;
    public Iu i;

    public Gt(Context context, Executor executor, C3332hi c3332hi, Dr dr, Jt jt, C3022bu c3022bu) {
        this.f25922a = context;
        this.f25923b = executor;
        this.f25924c = c3332hi;
        this.f25925d = dr;
        this.f25929h = c3022bu;
        this.f25926e = jt;
        this.f25928g = c3332hi.c();
    }

    public final boolean a(s2.c1 c1Var, String str, AbstractC2792Sd abstractC2792Sd, Ir ir) {
        boolean z6;
        C3816qi c3816qi;
        Vu vu;
        Executor executor = this.f25923b;
        if (str == null) {
            int i = w2.z.f41712b;
            x2.i.c("Ad unit ID should not be null for interstitial ad.");
            executor.execute(new RunnableC3493kj(24, this));
            return false;
        }
        if (b()) {
            return false;
        }
        C3324ha c3324ha = AbstractC3592ma.f33015e3;
        s2.r rVar = s2.r.f40506e;
        if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
            C4949p.a();
        }
        C3324ha c3324ha2 = AbstractC3592ma.ka;
        SharedPreferencesOnSharedPreferenceChangeListenerC3484ka sharedPreferencesOnSharedPreferenceChangeListenerC3484ka = rVar.f40509c;
        boolean booleanValue = ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(c3324ha2)).booleanValue();
        C3332hi c3332hi = this.f25924c;
        if (booleanValue && c1Var.f40422y) {
            ((C2786Ro) c3332hi.f31601G.f()).b(true);
        }
        Pair pair = new Pair("api-call", Long.valueOf(c1Var.f40413S));
        C4906k.f40186C.f40198k.getClass();
        Bundle b9 = AbstractC3066cl.b(pair, new Pair("dynamite-enter", Long.valueOf(System.currentTimeMillis())));
        C3022bu c3022bu = this.f25929h;
        c3022bu.f30133c = str;
        c3022bu.f30132b = ((Ct) abstractC2792Sd).f25002M;
        c3022bu.f30131a = c1Var;
        c3022bu.f30149t = b9;
        C3075cu a9 = c3022bu.a();
        int F8 = AbstractC2792Sd.F(a9);
        Context context = this.f25922a;
        Su j6 = Su.j(context, F8, 4, c1Var);
        boolean booleanValue2 = ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.r9)).booleanValue();
        Dr dr = this.f25925d;
        if (booleanValue2) {
            C3332hi c3332hi2 = c3332hi.f31635b;
            C3710ok c3710ok = new C3710ok();
            c3710ok.f33718a = context;
            c3710ok.f33719b = a9;
            C3710ok c3710ok2 = new C3710ok(c3710ok);
            C3819ql c3819ql = new C3819ql();
            c3819ql.d(dr, executor);
            c3819ql.b(dr, executor);
            c3816qi = new C3816qi(c3332hi2, new C3495kl(23), new C3872rl(c3819ql), c3710ok2, new C3680o7(27), new C3717or(0, this.f25927f), null, null);
            z6 = true;
        } else {
            C3819ql c3819ql2 = new C3819ql();
            HashSet hashSet = (HashSet) c3819ql2.f34167h;
            HashSet hashSet2 = (HashSet) c3819ql2.f34164e;
            z6 = true;
            Jt jt = this.f25926e;
            if (jt != null) {
                hashSet2.add(new C2528Cl(jt, executor));
                hashSet.add(new C2528Cl(jt, executor));
                c3819ql2.a(jt, executor);
            }
            C3332hi c3332hi3 = c3332hi.f31635b;
            C3710ok c3710ok3 = new C3710ok();
            c3710ok3.f33718a = context;
            c3710ok3.f33719b = a9;
            C3710ok c3710ok4 = new C3710ok(c3710ok3);
            c3819ql2.d(dr, executor);
            hashSet2.add(new C2528Cl(dr, executor));
            hashSet.add(new C2528Cl(dr, executor));
            c3819ql2.a(dr, executor);
            ((HashSet) c3819ql2.f34162c).add(new C2528Cl(dr, executor));
            c3819ql2.c(dr, executor);
            c3819ql2.b(dr, executor);
            ((HashSet) c3819ql2.f34171m).add(new C2528Cl(dr, executor));
            ((HashSet) c3819ql2.f34170l).add(new C2528Cl(dr, executor));
            c3816qi = new C3816qi(c3332hi3, new C3495kl(23), new C3872rl(c3819ql2), c3710ok4, new C3680o7(27), new C3717or(0, this.f25927f), null, null);
        }
        if (((Boolean) AbstractC2653Ka.f26706c.r()).booleanValue()) {
            vu = (Vu) c3816qi.f34130o0.f();
            vu.i(4);
            vu.c(c1Var.f40404I);
            vu.d(c1Var.f40401F);
        } else {
            vu = null;
        }
        Vu vu2 = vu;
        C2730Oj c2730Oj = (C2730Oj) c3816qi.C0.f();
        Iu c9 = c2730Oj.c(c2730Oj.b());
        this.i = c9;
        c9.a(new LD(0, c9, new C3887s(this, ir, vu2, j6, c3816qi)), executor);
        return z6;
    }

    public final boolean b() {
        Iu iu = this.i;
        return (iu == null || iu.f26368v.isDone()) ? false : true;
    }
}
