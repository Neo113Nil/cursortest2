package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import v2.C5110a;

/* renamed from: com.google.android.gms.internal.ads.rm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3850rm implements InterfaceC3297hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33720a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final C3243gN f33721b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC3511lN f33722c;

    /* renamed from: d, reason: collision with root package name */
    public final C3243gN f33723d;

    /* renamed from: e, reason: collision with root package name */
    public final C2987bi f33724e;

    /* renamed from: f, reason: collision with root package name */
    public final C3243gN f33725f;

    /* renamed from: g, reason: collision with root package name */
    public final C3243gN f33726g;

    /* renamed from: h, reason: collision with root package name */
    public final C3243gN f33727h;
    public final C3243gN i;

    /* renamed from: j, reason: collision with root package name */
    public final C3243gN f33728j;

    /* renamed from: k, reason: collision with root package name */
    public final C3243gN f33729k;

    /* renamed from: l, reason: collision with root package name */
    public final C3243gN f33730l;

    /* renamed from: m, reason: collision with root package name */
    public final C3243gN f33731m;

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC3297hN f33732n;

    /* renamed from: o, reason: collision with root package name */
    public final InterfaceC3297hN f33733o;

    /* renamed from: p, reason: collision with root package name */
    public final InterfaceC3511lN f33734p;

    /* renamed from: q, reason: collision with root package name */
    public final InterfaceC3511lN f33735q;

    /* renamed from: r, reason: collision with root package name */
    public final InterfaceC3511lN f33736r;

    /* renamed from: s, reason: collision with root package name */
    public final InterfaceC3511lN f33737s;

    /* renamed from: t, reason: collision with root package name */
    public final InterfaceC3511lN f33738t;

    public C3850rm(C2727Pj c2727Pj, C3243gN c3243gN, C4008ui c4008ui, InterfaceC3297hN interfaceC3297hN, C2526Dm c2526Dm, InterfaceC3511lN interfaceC3511lN, C3044cm c3044cm, C3243gN c3243gN2, C3243gN c3243gN3, C3243gN c3243gN4, C3243gN c3243gN5, C3243gN c3243gN6, C3847rj c3847rj, C3243gN c3243gN7, C2987bi c2987bi, C2987bi c2987bi2, C3243gN c3243gN8, C3243gN c3243gN9, C3243gN c3243gN10) {
        this.f33732n = c2727Pj;
        this.f33721b = c3243gN;
        this.f33733o = c4008ui;
        this.f33734p = interfaceC3297hN;
        this.f33735q = c2526Dm;
        this.f33722c = interfaceC3511lN;
        this.f33736r = c3044cm;
        this.f33723d = c3243gN2;
        this.f33725f = c3243gN3;
        this.f33726g = c3243gN4;
        this.f33727h = c3243gN5;
        this.i = c3243gN6;
        this.f33737s = c3847rj;
        this.f33728j = c3243gN7;
        this.f33724e = c2987bi;
        this.f33738t = c2987bi2;
        this.f33729k = c3243gN8;
        this.f33730l = c3243gN9;
        this.f33731m = c3243gN10;
    }

    public C3045cn a() {
        Context context = (Context) this.f33721b.f();
        C2829Vm c2829Vm = (C2829Vm) this.f33722c.f();
        C3441k7 c3441k7 = (C3441k7) this.f33723d.f();
        C5110a b9 = this.f33724e.b();
        Object obj = ((C4008ui) this.f33732n).f34561b;
        k8.b b10 = C4008ui.b();
        C3068d9 c3068d9 = (C3068d9) this.f33725f.f();
        C3360ig c3360ig = AbstractC3413jg.f31268a;
        AbstractC3341iD.j(c3360ig);
        return new C3045cn(context, c2829Vm, c3441k7, b9, b10, c3068d9, c3360ig, ((C3795qk) this.f33733o).a(), (C3314hn) this.f33726g.f(), (C2612In) this.f33727h.f(), (ScheduledExecutorService) this.i.f(), (C3153eo) this.f33728j.f(), (C4237yv) this.f33729k.f(), (C2800Tp) this.f33730l.f(), (C4175xn) this.f33731m.f(), (BinderC2880Yp) ((C3243gN) this.f33734p).f(), (C3213fu) ((C3243gN) this.f33735q).f(), (C2993bo) ((C3243gN) this.f33736r).f(), (C3691oo) ((C3243gN) this.f33737s).f(), (C3311hk) this.f33738t.f());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3511lN
    public final Object f() {
        switch (this.f33720a) {
            case 0:
                S0.q b9 = ((C2727Pj) this.f33732n).b();
                Executor executor = (Executor) this.f33721b.f();
                C4012um a9 = ((C4008ui) this.f33733o).a();
                InterfaceC4174xm interfaceC4174xm = (InterfaceC4174xm) ((InterfaceC3297hN) this.f33734p).f();
                C2509Cm a10 = ((C2526Dm) this.f33735q).a();
                C4120wm c4120wm = (C4120wm) this.f33722c.f();
                C4282zm c4282zm = (C4282zm) ((C3044cm) this.f33736r).f29580b.f29323u;
                AbstractC3341iD.j(c4282zm);
                InterfaceC3135eN b10 = C3243gN.b(this.f33723d);
                InterfaceC3135eN b11 = C3243gN.b(this.f33725f);
                InterfaceC3135eN b12 = C3243gN.b(this.f33726g);
                InterfaceC3135eN b13 = C3243gN.b(this.f33727h);
                InterfaceC3135eN b14 = C3243gN.b(this.i);
                C3847rj c3847rj = (C3847rj) this.f33737s;
                C2587Hf c2587Hf = new C2587Hf(c3847rj.f33692b.a(), c3847rj.f33693c.a().f29626g);
                C3441k7 c3441k7 = (C3441k7) this.f33728j.f();
                C5110a b15 = this.f33724e.b();
                Context a11 = ((C2987bi) this.f33738t).a();
                C3904sm c3904sm = (C3904sm) this.f33729k.f();
                Er er = (Er) this.f33730l.f();
                return new C3797qm(b9, executor, a9, interfaceC4174xm, a10, c4120wm, c4282zm, b10, b11, b12, b13, b14, c2587Hf, c3441k7, b15, a11, c3904sm, er);
            default:
                return a();
        }
    }

    public C3850rm(C3243gN c3243gN, InterfaceC3511lN interfaceC3511lN, C3243gN c3243gN2, C2987bi c2987bi, C4008ui c4008ui, C3243gN c3243gN3, C3795qk c3795qk, C3243gN c3243gN4, C3243gN c3243gN5, C3243gN c3243gN6, C3243gN c3243gN7, C3243gN c3243gN8, C3243gN c3243gN9, C3243gN c3243gN10, C3243gN c3243gN11, C3243gN c3243gN12, C3243gN c3243gN13, C3243gN c3243gN14, InterfaceC3511lN interfaceC3511lN2) {
        this.f33721b = c3243gN;
        this.f33722c = interfaceC3511lN;
        this.f33723d = c3243gN2;
        this.f33724e = c2987bi;
        this.f33732n = c4008ui;
        this.f33725f = c3243gN3;
        this.f33733o = c3795qk;
        this.f33726g = c3243gN4;
        this.f33727h = c3243gN5;
        this.i = c3243gN6;
        this.f33728j = c3243gN7;
        this.f33729k = c3243gN8;
        this.f33730l = c3243gN9;
        this.f33731m = c3243gN10;
        this.f33734p = c3243gN11;
        this.f33735q = c3243gN12;
        this.f33736r = c3243gN13;
        this.f33737s = c3243gN14;
        this.f33738t = interfaceC3511lN2;
    }
}
