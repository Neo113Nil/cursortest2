package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import w2.C5140B;

/* renamed from: com.google.android.gms.internal.ads.Oi, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2729Oi implements InterfaceC3320hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27408a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC3534lN f27409b;

    /* renamed from: c, reason: collision with root package name */
    public final C3266gN f27410c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC3534lN f27411d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC3534lN f27412e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC3534lN f27413f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC3534lN f27414g;

    public C2729Oi(C3010bi c3010bi, C2911Zh c2911Zh, C3266gN c3266gN, C3266gN c3266gN2, C3266gN c3266gN3, C3266gN c3266gN4) {
        this.f27408a = 0;
        this.f27409b = c3010bi;
        this.f27411d = c2911Zh;
        this.f27410c = c3266gN;
        this.f27412e = c3266gN2;
        this.f27413f = c3266gN3;
        this.f27414g = c3266gN4;
    }

    public S0.q a() {
        Context a9 = ((C3010bi) this.f27409b).a();
        Vu vu = (Vu) this.f27410c.f();
        C3383ig c3383ig = AbstractC3436jg.f32055a;
        AbstractC3364iD.j(c3383ig);
        return new S0.q(a9, vu, c3383ig, (ScheduledExecutorService) ((C3266gN) this.f27412e).f(), (InterfaceC2611Hj) ((C3266gN) this.f27413f).f(), (Xq) ((C3266gN) this.f27414g).f(), (C4206xv) ((C3266gN) this.f27411d).f());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3534lN
    public final Object f() {
        switch (this.f27408a) {
            case 0:
                Context a9 = ((C3010bi) this.f27409b).a();
                C5140B b9 = ((C2911Zh) this.f27411d).b();
                C3286gq c3286gq = (C3286gq) this.f27410c.f();
                C2700Mn c2700Mn = (C2700Mn) ((C3266gN) this.f27412e).f();
                C3383ig c3383ig = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig);
                return new C2712Ni(a9, b9, c3286gq, c2700Mn, c3383ig, (RD) ((C3266gN) this.f27413f).f(), (ScheduledExecutorService) ((C3266gN) this.f27414g).f());
            case 1:
                C3870rj c3870rj = (C3870rj) this.f27411d;
                C2607Hf c2607Hf = new C2607Hf(c3870rj.f34464b.a(), c3870rj.f34465c.a().f30396g);
                Context a10 = ((C3010bi) this.f27409b).a();
                C2641Jf c2641Jf = (C2641Jf) this.f27410c.f();
                InterfaceC4084vh interfaceC4084vh = (InterfaceC4084vh) ((C2766Ql) this.f27412e).f27848b.f2970v;
                return new C2960am(c2607Hf, a10, c2641Jf, interfaceC4084vh == null ? null : interfaceC4084vh.q(), (EnumC3144e9) ((InterfaceC3320hN) this.f27413f).f(), ((C2696Mj) this.f27414g).a());
            case 2:
                C3332hi c3332hi = (C3332hi) ((C3374iN) this.f27409b).f31812a;
                C3710ok a11 = ((C3818qk) this.f27411d).f34159b.a();
                C3926sl c3926sl = (C3926sl) this.f27412e;
                C3121dm c3121dm = (C3121dm) this.f27413f;
                C2898Yk a12 = ((C3439jj) this.f27414g).a();
                Xq xq = (Xq) this.f27410c.f();
                C3332hi c3332hi2 = c3332hi.f31635b;
                C3710ok c3710ok = new C3710ok(a11);
                C3680o7 c3680o7 = null;
                C3717or c3717or = new C3717or(0, c3680o7);
                S0.s sVar = new S0.s(15, a12, c3680o7);
                Ux ux = new Ux(16, c3680o7);
                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33200y4)).booleanValue()) {
                    c3680o7 = new C3680o7(27);
                    c3680o7.f33649u = xq;
                }
                C3872rl c3872rl = c3926sl.f34901b;
                AbstractC3364iD.l(C3872rl.class, c3872rl);
                if (c3680o7 == null) {
                    c3680o7 = new C3680o7(27);
                }
                C3067cm c3067cm = c3121dm.f30617b;
                AbstractC3364iD.l(C3067cm.class, c3067cm);
                InterfaceC2611Hj interfaceC2611Hj = (InterfaceC2611Hj) new C3600mi(c3332hi2, ux, c3067cm, new C3495kl(23), c3872rl, c3710ok, c3680o7, c3717or, sVar, null, null).f33234H0.f();
                AbstractC3364iD.j(interfaceC2611Hj);
                return interfaceC2611Hj;
            case 3:
                Context a13 = ((C3010bi) this.f27409b).a();
                C3075cu a14 = ((C3818qk) this.f27411d).a();
                C2709Nf c2709Nf = (C2709Nf) this.f27414g;
                C3383ig c3383ig2 = AbstractC3436jg.f32056b;
                AbstractC3364iD.j(c3383ig2);
                C3383ig c3383ig3 = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig3);
                C2590Gf c2590Gf = new C2590Gf(c3383ig2, c3383ig3, new C3715op((Context) ((C2962ao) c2709Nf.f27289b).f29908b.f(), c3383ig3, 0), C3266gN.b((C2729Oi) c2709Nf.f27290c), 16);
                AbstractC3364iD.j(c3383ig3);
                return new C3607mp(a13, a14, c2590Gf, c3383ig3, (ScheduledExecutorService) this.f27410c.f(), (C2719Np) ((C3266gN) this.f27412e).f(), (Vu) ((C3266gN) this.f27413f).f());
            case 4:
                Context a15 = ((C3010bi) this.f27409b).a();
                C3383ig c3383ig4 = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig4);
                C2889Yb c2889Yb = new C2889Yb(16);
                C3332hi c3332hi3 = (C3332hi) ((C3117di) this.f27411d).f30595b.f31812a;
                AbstractC3364iD.j(c3332hi3);
                return new BinderC2600Gp(a15, c3383ig4, c2889Yb, c3332hi3, new Qx(28, ((E2.F) ((C4031ui) this.f27414g).f35333b).a()), (ArrayDeque) this.f27410c.f(), (Wu) ((C3266gN) this.f27412e).f(), (C2847Vh) ((C3266gN) this.f27413f).f());
            case 5:
                return a();
            case 6:
                C3332hi c3332hi4 = (C3332hi) ((C3374iN) this.f27409b).f31812a;
                C3121dm c3121dm2 = (C3121dm) this.f27411d;
                return new C2788Rq(c3332hi4, c3121dm2.f30617b, ((C3818qk) this.f27413f).f34159b.a(), ((C3926sl) this.f27414g).f34901b, (Xq) this.f27410c.f(), (C3608mq) ((C3266gN) this.f27412e).f());
            case 7:
                return new C2788Rq((C3332hi) ((C3374iN) this.f27409b).f31812a, ((C3818qk) this.f27411d).f34159b.a(), ((C3771pr) this.f27413f).f33934b, ((C3926sl) this.f27414g).f34901b, (Xq) this.f27410c.f(), (C3608mq) ((C3266gN) this.f27412e).f());
            case 8:
                return new C2788Rq((C3332hi) ((C3374iN) this.f27409b).f31812a, ((C3818qk) this.f27411d).f34159b.a(), ((C3926sl) this.f27413f).f34901b, ((C3818qk) this.f27414g).f34159b.f33721d, (Xq) this.f27410c.f(), (C3608mq) ((C3266gN) this.f27412e).f());
            case 9:
                C5140B b10 = ((C2911Zh) this.f27411d).b();
                Context a16 = ((C3010bi) this.f27409b).a();
                C3383ig c3383ig5 = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig5);
                return new Vs(b10, a16, c3383ig5, (ScheduledExecutorService) this.f27410c.f(), new C3506kw(((C3063ci) this.f27412e).f30321b.a()), ((C3818qk) this.f27413f).a(), ((C3010bi) this.f27414g).b());
            case 10:
                return new C3449jt((Context) ((C3374iN) this.f27409b).f31812a, (Executor) this.f27410c.f(), (C3332hi) ((C3374iN) this.f27411d).f31812a, ((C4255yq) this.f27413f).a(), (C3289gt) ((C3266gN) this.f27412e).f(), new C3022bu(), ((C3010bi) this.f27414g).b());
            case 11:
                return new Mt((Context) ((C3374iN) this.f27409b).f31812a, (Executor) this.f27410c.f(), (C3332hi) ((C3374iN) this.f27411d).f31812a, ((C4255yq) this.f27414g).a(), (Jt) ((C3266gN) this.f27412e).f(), new C3022bu(), (Zt) ((C3266gN) this.f27413f).f());
            case 12:
                return new C3344hu((C4260yv) this.f27410c.f(), (C4152wv) ((C3266gN) this.f27412e).f(), ((C2696Mj) this.f27409b).a(), ((C2696Mj) this.f27411d).f27111b.r(), (C2712Ni) ((C3266gN) this.f27413f).f(), (Vu) ((C3266gN) this.f27414g).f());
            case 13:
                Context a17 = ((C3010bi) this.f27409b).a();
                C3383ig c3383ig6 = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig6);
                return new C4260yv(a17, c3383ig6, (SD) this.f27410c.f(), (x2.l) this.f27411d.f(), (C4152wv) ((C3266gN) this.f27412e).f(), (Wu) ((C3266gN) this.f27413f).f(), (C2847Vh) ((C3266gN) this.f27414g).f());
            case 14:
                return new Ev((Qv) this.f27410c.f(), ((E2.F) this.f27414g).c(), ((C3010bi) this.f27409b).a(), (V2.a) ((C3266gN) this.f27412e).f(), (Cv) ((C3266gN) this.f27413f).f(), ((C2911Zh) this.f27411d).b());
            case 15:
                return new Oy(C3266gN.b(this.f27410c), C3266gN.b((C3266gN) this.f27412e), C3266gN.b((C3266gN) this.f27413f), (C2972ay) ((C3374iN) this.f27409b).f31812a, (ExecutorService) ((C3374iN) this.f27411d).f31812a, (C4006uA) ((C3266gN) this.f27414g).f());
            case 16:
                return new C3725oz((C4002u6) ((C3374iN) this.f27409b).f31812a, (C3241fz) this.f27410c.f(), (EnumC3616my) ((C3374iN) this.f27411d).f31812a, (Context) ((C3374iN) this.f27413f).f31812a, (Map) ((C3374iN) this.f27414g).f31812a, (C4006uA) ((C3266gN) this.f27412e).f());
            case 17:
                InterfaceC3307hA interfaceC3307hA = (InterfaceC3307hA) this.f27410c.f();
                Rz rz = (Rz) ((C3266gN) this.f27412e).f();
                Yz yz = (Yz) ((C3266gN) this.f27413f).f();
                C4006uA c4006uA = (C4006uA) ((C3266gN) this.f27414g).f();
                InterfaceC3832qy interfaceC3832qy = (InterfaceC3832qy) ((C3266gN) this.f27409b).f();
                C2972ay c2972ay = (C2972ay) ((C3374iN) this.f27411d).f31812a;
                return new Cz(interfaceC3307hA, rz, yz, c4006uA, interfaceC3832qy, c2972ay.X().E(), c2972ay.X().F(), c2972ay.X().G());
            default:
                return new Wz((Context) ((C3374iN) this.f27409b).f31812a, (ExecutorService) ((C3374iN) this.f27411d).f31812a, (C2972ay) ((C3374iN) this.f27414g).f31812a, (C3778py) this.f27410c.f(), (C4006uA) ((C3266gN) this.f27412e).f(), (Xz) ((C3266gN) this.f27413f).f());
        }
    }

    public C2729Oi(C3010bi c3010bi, C3266gN c3266gN, C3266gN c3266gN2, C3266gN c3266gN3, C3266gN c3266gN4, C3266gN c3266gN5) {
        this.f27408a = 5;
        this.f27409b = c3010bi;
        this.f27410c = c3266gN;
        this.f27412e = c3266gN2;
        this.f27413f = c3266gN3;
        this.f27414g = c3266gN4;
        this.f27411d = c3266gN5;
    }

    public C2729Oi(C3010bi c3010bi, C3266gN c3266gN, InterfaceC3534lN interfaceC3534lN, C3266gN c3266gN2, C3266gN c3266gN3, C3266gN c3266gN4) {
        this.f27408a = 13;
        this.f27409b = c3010bi;
        this.f27410c = c3266gN;
        this.f27411d = interfaceC3534lN;
        this.f27412e = c3266gN2;
        this.f27413f = c3266gN3;
        this.f27414g = c3266gN4;
    }

    public C2729Oi(C3266gN c3266gN, E2.F f2, C3010bi c3010bi, C3266gN c3266gN2, C3266gN c3266gN3, C2911Zh c2911Zh) {
        this.f27408a = 14;
        this.f27410c = c3266gN;
        this.f27414g = f2;
        this.f27409b = c3010bi;
        this.f27412e = c3266gN2;
        this.f27413f = c3266gN3;
        this.f27411d = c2911Zh;
    }

    public C2729Oi(C3266gN c3266gN, C3266gN c3266gN2, C2696Mj c2696Mj, C2696Mj c2696Mj2, C3266gN c3266gN3, C3266gN c3266gN4) {
        this.f27408a = 12;
        this.f27410c = c3266gN;
        this.f27412e = c3266gN2;
        this.f27409b = c2696Mj;
        this.f27411d = c2696Mj2;
        this.f27413f = c3266gN3;
        this.f27414g = c3266gN4;
    }

    public C2729Oi(C3266gN c3266gN, C3266gN c3266gN2, C3266gN c3266gN3, C3266gN c3266gN4, C3266gN c3266gN5, C3374iN c3374iN) {
        this.f27408a = 17;
        this.f27410c = c3266gN;
        this.f27412e = c3266gN2;
        this.f27413f = c3266gN3;
        this.f27414g = c3266gN4;
        this.f27409b = c3266gN5;
        this.f27411d = c3374iN;
    }

    public C2729Oi(C3266gN c3266gN, C3266gN c3266gN2, C3266gN c3266gN3, C3374iN c3374iN, C3374iN c3374iN2, C3266gN c3266gN4) {
        this.f27408a = 15;
        this.f27410c = c3266gN;
        this.f27412e = c3266gN2;
        this.f27413f = c3266gN3;
        this.f27409b = c3374iN;
        this.f27411d = c3374iN2;
        this.f27414g = c3266gN4;
    }

    public /* synthetic */ C2729Oi(InterfaceC3320hN interfaceC3320hN, C3010bi c3010bi, C3266gN c3266gN, InterfaceC3320hN interfaceC3320hN2, InterfaceC3320hN interfaceC3320hN3, InterfaceC3320hN interfaceC3320hN4, int i) {
        this.f27408a = i;
        this.f27411d = interfaceC3320hN;
        this.f27409b = c3010bi;
        this.f27410c = c3266gN;
        this.f27412e = interfaceC3320hN2;
        this.f27413f = interfaceC3320hN3;
        this.f27414g = interfaceC3320hN4;
    }

    public /* synthetic */ C2729Oi(InterfaceC3320hN interfaceC3320hN, InterfaceC3320hN interfaceC3320hN2, InterfaceC3320hN interfaceC3320hN3, C3266gN c3266gN, C3266gN c3266gN2, C3266gN c3266gN3, int i) {
        this.f27408a = i;
        this.f27409b = interfaceC3320hN;
        this.f27411d = interfaceC3320hN2;
        this.f27414g = interfaceC3320hN3;
        this.f27410c = c3266gN;
        this.f27412e = c3266gN2;
        this.f27413f = c3266gN3;
    }

    public C2729Oi(C3374iN c3374iN, C3818qk c3818qk, C3926sl c3926sl, C3121dm c3121dm, C3439jj c3439jj, C3266gN c3266gN) {
        this.f27408a = 2;
        this.f27409b = c3374iN;
        this.f27411d = c3818qk;
        this.f27412e = c3926sl;
        this.f27413f = c3121dm;
        this.f27414g = c3439jj;
        this.f27410c = c3266gN;
    }

    public C2729Oi(C3374iN c3374iN, C3266gN c3266gN, C3374iN c3374iN2, C4255yq c4255yq, C3266gN c3266gN2, C3010bi c3010bi) {
        this.f27408a = 10;
        this.f27409b = c3374iN;
        this.f27410c = c3266gN;
        this.f27411d = c3374iN2;
        this.f27413f = c4255yq;
        this.f27412e = c3266gN2;
        this.f27414g = c3010bi;
    }

    public C2729Oi(C3374iN c3374iN, C3266gN c3266gN, C3374iN c3374iN2, C4255yq c4255yq, C3266gN c3266gN2, C3266gN c3266gN3) {
        this.f27408a = 11;
        this.f27409b = c3374iN;
        this.f27410c = c3266gN;
        this.f27411d = c3374iN2;
        this.f27414g = c4255yq;
        this.f27412e = c3266gN2;
        this.f27413f = c3266gN3;
    }

    public C2729Oi(C3374iN c3374iN, C3266gN c3266gN, C3374iN c3374iN2, C3374iN c3374iN3, C3374iN c3374iN4, C3266gN c3266gN2) {
        this.f27408a = 16;
        this.f27409b = c3374iN;
        this.f27410c = c3266gN;
        this.f27411d = c3374iN2;
        this.f27413f = c3374iN3;
        this.f27414g = c3374iN4;
        this.f27412e = c3266gN2;
    }

    public /* synthetic */ C2729Oi(C3374iN c3374iN, InterfaceC3320hN interfaceC3320hN, InterfaceC3320hN interfaceC3320hN2, InterfaceC3320hN interfaceC3320hN3, C3266gN c3266gN, C3266gN c3266gN2, int i) {
        this.f27408a = i;
        this.f27409b = c3374iN;
        this.f27411d = interfaceC3320hN;
        this.f27413f = interfaceC3320hN2;
        this.f27414g = interfaceC3320hN3;
        this.f27410c = c3266gN;
        this.f27412e = c3266gN2;
    }
}
