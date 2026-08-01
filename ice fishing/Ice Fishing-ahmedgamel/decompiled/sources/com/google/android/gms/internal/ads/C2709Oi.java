package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import u2.C5069B;

/* renamed from: com.google.android.gms.internal.ads.Oi, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2709Oi implements InterfaceC3297hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26632a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC3511lN f26633b;

    /* renamed from: c, reason: collision with root package name */
    public final C3243gN f26634c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC3511lN f26635d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC3511lN f26636e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC3511lN f26637f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC3511lN f26638g;

    public C2709Oi(C2987bi c2987bi, C2888Zh c2888Zh, C3243gN c3243gN, C3243gN c3243gN2, C3243gN c3243gN3, C3243gN c3243gN4) {
        this.f26632a = 0;
        this.f26633b = c2987bi;
        this.f26635d = c2888Zh;
        this.f26634c = c3243gN;
        this.f26636e = c3243gN2;
        this.f26637f = c3243gN3;
        this.f26638g = c3243gN4;
    }

    public S0.q a() {
        Context a9 = ((C2987bi) this.f26633b).a();
        Vu vu = (Vu) this.f26634c.f();
        C3360ig c3360ig = AbstractC3413jg.f31268a;
        AbstractC3341iD.j(c3360ig);
        return new S0.q(a9, vu, c3360ig, (ScheduledExecutorService) ((C3243gN) this.f26636e).f(), (InterfaceC2591Hj) ((C3243gN) this.f26637f).f(), (Xq) ((C3243gN) this.f26638g).f(), (C4183xv) ((C3243gN) this.f26635d).f());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3511lN
    public final Object f() {
        switch (this.f26632a) {
            case 0:
                Context a9 = ((C2987bi) this.f26633b).a();
                C5069B b9 = ((C2888Zh) this.f26635d).b();
                C3263gq c3263gq = (C3263gq) this.f26634c.f();
                C2663Ln c2663Ln = (C2663Ln) ((C3243gN) this.f26636e).f();
                C3360ig c3360ig = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig);
                return new C2692Ni(a9, b9, c3263gq, c2663Ln, c3360ig, (RD) ((C3243gN) this.f26637f).f(), (ScheduledExecutorService) ((C3243gN) this.f26638g).f());
            case 1:
                C3847rj c3847rj = (C3847rj) this.f26635d;
                C2587Hf c2587Hf = new C2587Hf(c3847rj.f33692b.a(), c3847rj.f33693c.a().f29626g);
                Context a10 = ((C2987bi) this.f26633b).a();
                C2621Jf c2621Jf = (C2621Jf) this.f26634c.f();
                InterfaceC4061vh interfaceC4061vh = (InterfaceC4061vh) ((C2729Pl) this.f26636e).f26855b.f2841v;
                return new C2892Zl(c2587Hf, a10, c2621Jf, interfaceC4061vh == null ? null : interfaceC4061vh.q(), (EnumC3121e9) ((InterfaceC3297hN) this.f26637f).f(), ((C2676Mj) this.f26638g).a());
            case 2:
                C3309hi c3309hi = (C3309hi) ((C3351iN) this.f26633b).f31039a;
                C3687ok a11 = ((C3795qk) this.f26635d).f33377b.a();
                C3903sl c3903sl = (C3903sl) this.f26636e;
                C3044cm c3044cm = (C3044cm) this.f26637f;
                C2875Yk a12 = ((C3416jj) this.f26638g).a();
                Xq xq = (Xq) this.f26634c.f();
                C3309hi c3309hi2 = c3309hi.f30874b;
                C3687ok c3687ok = new C3687ok(a11);
                C3657o7 c3657o7 = null;
                C3694or c3694or = new C3694or(0, c3657o7);
                S0.s sVar = new S0.s(13, a12, c3657o7);
                Ux ux = new Ux(16, c3657o7);
                if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32421y4)).booleanValue()) {
                    c3657o7 = new C3657o7(27);
                    c3657o7.f32862u = xq;
                }
                C3849rl c3849rl = c3903sl.f34134b;
                AbstractC3341iD.l(C3849rl.class, c3849rl);
                if (c3657o7 == null) {
                    c3657o7 = new C3657o7(27);
                }
                C2991bm c2991bm = c3044cm.f29580b;
                AbstractC3341iD.l(C2991bm.class, c2991bm);
                InterfaceC2591Hj interfaceC2591Hj = (InterfaceC2591Hj) new C3577mi(c3309hi2, ux, c2991bm, new C3472kl(23), c3849rl, c3687ok, c3657o7, c3694or, sVar, null, null).f32454H0.f();
                AbstractC3341iD.j(interfaceC2591Hj);
                return interfaceC2591Hj;
            case 3:
                Context a13 = ((C2987bi) this.f26633b).a();
                C3052cu a14 = ((C3795qk) this.f26635d).a();
                C2689Nf c2689Nf = (C2689Nf) this.f26638g;
                C3360ig c3360ig2 = AbstractC3413jg.f31269b;
                AbstractC3341iD.j(c3360ig2);
                C3360ig c3360ig3 = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig3);
                C2570Gf c2570Gf = new C2570Gf(c3360ig2, c3360ig3, new C3692op((Context) ((C2894Zn) c2689Nf.f26506b).f28962b.f(), c3360ig3, 0), C3243gN.b((C2709Oi) c2689Nf.f26507c), 16);
                AbstractC3341iD.j(c3360ig3);
                return new C3584mp(a13, a14, c2570Gf, c3360ig3, (ScheduledExecutorService) this.f26634c.f(), (C2699Np) ((C3243gN) this.f26636e).f(), (Vu) ((C3243gN) this.f26637f).f());
            case 4:
                Context a15 = ((C2987bi) this.f26633b).a();
                C3360ig c3360ig4 = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig4);
                C2866Yb c2866Yb = new C2866Yb(16);
                C3309hi c3309hi3 = (C3309hi) ((C3094di) this.f26635d).f29822b.f31039a;
                AbstractC3341iD.j(c3309hi3);
                return new BinderC2580Gp(a15, c3360ig4, c2866Yb, c3309hi3, new Qx(28, ((C2.G) ((C4008ui) this.f26638g).f34561b).a()), (ArrayDeque) this.f26634c.f(), (Wu) ((C3243gN) this.f26636e).f(), (C2824Vh) ((C3243gN) this.f26637f).f());
            case 5:
                return a();
            case 6:
                C3309hi c3309hi4 = (C3309hi) ((C3351iN) this.f26633b).f31039a;
                C3044cm c3044cm2 = (C3044cm) this.f26635d;
                return new C2768Rq(c3309hi4, c3044cm2.f29580b, ((C3795qk) this.f26637f).f33377b.a(), ((C3903sl) this.f26638g).f34134b, (Xq) this.f26634c.f(), (C3585mq) ((C3243gN) this.f26636e).f());
            case 7:
                return new C2768Rq((C3309hi) ((C3351iN) this.f26633b).f31039a, ((C3795qk) this.f26635d).f33377b.a(), ((C3748pr) this.f26637f).f33148b, ((C3903sl) this.f26638g).f34134b, (Xq) this.f26634c.f(), (C3585mq) ((C3243gN) this.f26636e).f());
            case 8:
                return new C2768Rq((C3309hi) ((C3351iN) this.f26633b).f31039a, ((C3795qk) this.f26635d).f33377b.a(), ((C3903sl) this.f26637f).f34134b, ((C3795qk) this.f26638g).f33377b.f32935d, (Xq) this.f26634c.f(), (C3585mq) ((C3243gN) this.f26636e).f());
            case 9:
                C5069B b10 = ((C2888Zh) this.f26635d).b();
                Context a16 = ((C2987bi) this.f26633b).a();
                C3360ig c3360ig5 = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig5);
                return new Vs(b10, a16, c3360ig5, (ScheduledExecutorService) this.f26634c.f(), new C3429jw(((C3040ci) this.f26636e).f29536b.a()), ((C3795qk) this.f26637f).a(), ((C2987bi) this.f26638g).b());
            case 10:
                return new C3426jt((Context) ((C3351iN) this.f26633b).f31039a, (Executor) this.f26634c.f(), (C3309hi) ((C3351iN) this.f26635d).f31039a, ((C4232yq) this.f26637f).a(), (C3266gt) ((C3243gN) this.f26636e).f(), new C2999bu(), ((C2987bi) this.f26638g).b());
            case 11:
                return new Mt((Context) ((C3351iN) this.f26633b).f31039a, (Executor) this.f26634c.f(), (C3309hi) ((C3351iN) this.f26635d).f31039a, ((C4232yq) this.f26638g).a(), (Jt) ((C3243gN) this.f26636e).f(), new C2999bu(), (Zt) ((C3243gN) this.f26637f).f());
            case 12:
                return new C3321hu((C4237yv) this.f26634c.f(), (C4129wv) ((C3243gN) this.f26636e).f(), ((C2676Mj) this.f26633b).a(), ((C2676Mj) this.f26635d).f26322b.s(), (C2692Ni) ((C3243gN) this.f26637f).f(), (Vu) ((C3243gN) this.f26638g).f());
            case 13:
                Context a17 = ((C2987bi) this.f26633b).a();
                C3360ig c3360ig6 = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig6);
                return new C4237yv(a17, c3360ig6, (SD) this.f26634c.f(), (v2.l) this.f26635d.f(), (C4129wv) ((C3243gN) this.f26636e).f(), (Wu) ((C3243gN) this.f26637f).f(), (C2824Vh) ((C3243gN) this.f26638g).f());
            case 14:
                return new Ev((Qv) this.f26634c.f(), ((C2.G) this.f26638g).c(), ((C2987bi) this.f26633b).a(), (T2.a) ((C3243gN) this.f26636e).f(), (Cv) ((C3243gN) this.f26637f).f(), ((C2888Zh) this.f26635d).b());
            case 15:
                return new Oy(C3243gN.b(this.f26634c), C3243gN.b((C3243gN) this.f26636e), C3243gN.b((C3243gN) this.f26637f), (C2949ay) ((C3351iN) this.f26633b).f31039a, (ExecutorService) ((C3351iN) this.f26635d).f31039a, (C3983uA) ((C3243gN) this.f26638g).f());
            case 16:
                return new C3702oz((C3979u6) ((C3351iN) this.f26633b).f31039a, (C3218fz) this.f26634c.f(), (EnumC3593my) ((C3351iN) this.f26635d).f31039a, (Context) ((C3351iN) this.f26637f).f31039a, (Map) ((C3351iN) this.f26638g).f31039a, (C3983uA) ((C3243gN) this.f26636e).f());
            case 17:
                InterfaceC3284hA interfaceC3284hA = (InterfaceC3284hA) this.f26634c.f();
                Rz rz = (Rz) ((C3243gN) this.f26636e).f();
                Yz yz = (Yz) ((C3243gN) this.f26637f).f();
                C3983uA c3983uA = (C3983uA) ((C3243gN) this.f26638g).f();
                InterfaceC3809qy interfaceC3809qy = (InterfaceC3809qy) ((C3243gN) this.f26633b).f();
                C2949ay c2949ay = (C2949ay) ((C3351iN) this.f26635d).f31039a;
                return new Cz(interfaceC3284hA, rz, yz, c3983uA, interfaceC3809qy, c2949ay.X().E(), c2949ay.X().F(), c2949ay.X().G());
            default:
                return new Wz((Context) ((C3351iN) this.f26633b).f31039a, (ExecutorService) ((C3351iN) this.f26635d).f31039a, (C2949ay) ((C3351iN) this.f26638g).f31039a, (C3755py) this.f26634c.f(), (C3983uA) ((C3243gN) this.f26636e).f(), (Xz) ((C3243gN) this.f26637f).f());
        }
    }

    public C2709Oi(C2987bi c2987bi, C3243gN c3243gN, C3243gN c3243gN2, C3243gN c3243gN3, C3243gN c3243gN4, C3243gN c3243gN5) {
        this.f26632a = 5;
        this.f26633b = c2987bi;
        this.f26634c = c3243gN;
        this.f26636e = c3243gN2;
        this.f26637f = c3243gN3;
        this.f26638g = c3243gN4;
        this.f26635d = c3243gN5;
    }

    public C2709Oi(C2987bi c2987bi, C3243gN c3243gN, InterfaceC3511lN interfaceC3511lN, C3243gN c3243gN2, C3243gN c3243gN3, C3243gN c3243gN4) {
        this.f26632a = 13;
        this.f26633b = c2987bi;
        this.f26634c = c3243gN;
        this.f26635d = interfaceC3511lN;
        this.f26636e = c3243gN2;
        this.f26637f = c3243gN3;
        this.f26638g = c3243gN4;
    }

    public C2709Oi(C3243gN c3243gN, C2.G g4, C2987bi c2987bi, C3243gN c3243gN2, C3243gN c3243gN3, C2888Zh c2888Zh) {
        this.f26632a = 14;
        this.f26634c = c3243gN;
        this.f26638g = g4;
        this.f26633b = c2987bi;
        this.f26636e = c3243gN2;
        this.f26637f = c3243gN3;
        this.f26635d = c2888Zh;
    }

    public C2709Oi(C3243gN c3243gN, C3243gN c3243gN2, C2676Mj c2676Mj, C2676Mj c2676Mj2, C3243gN c3243gN3, C3243gN c3243gN4) {
        this.f26632a = 12;
        this.f26634c = c3243gN;
        this.f26636e = c3243gN2;
        this.f26633b = c2676Mj;
        this.f26635d = c2676Mj2;
        this.f26637f = c3243gN3;
        this.f26638g = c3243gN4;
    }

    public C2709Oi(C3243gN c3243gN, C3243gN c3243gN2, C3243gN c3243gN3, C3243gN c3243gN4, C3243gN c3243gN5, C3351iN c3351iN) {
        this.f26632a = 17;
        this.f26634c = c3243gN;
        this.f26636e = c3243gN2;
        this.f26637f = c3243gN3;
        this.f26638g = c3243gN4;
        this.f26633b = c3243gN5;
        this.f26635d = c3351iN;
    }

    public C2709Oi(C3243gN c3243gN, C3243gN c3243gN2, C3243gN c3243gN3, C3351iN c3351iN, C3351iN c3351iN2, C3243gN c3243gN4) {
        this.f26632a = 15;
        this.f26634c = c3243gN;
        this.f26636e = c3243gN2;
        this.f26637f = c3243gN3;
        this.f26633b = c3351iN;
        this.f26635d = c3351iN2;
        this.f26638g = c3243gN4;
    }

    public /* synthetic */ C2709Oi(InterfaceC3297hN interfaceC3297hN, C2987bi c2987bi, C3243gN c3243gN, InterfaceC3297hN interfaceC3297hN2, InterfaceC3297hN interfaceC3297hN3, InterfaceC3297hN interfaceC3297hN4, int i) {
        this.f26632a = i;
        this.f26635d = interfaceC3297hN;
        this.f26633b = c2987bi;
        this.f26634c = c3243gN;
        this.f26636e = interfaceC3297hN2;
        this.f26637f = interfaceC3297hN3;
        this.f26638g = interfaceC3297hN4;
    }

    public /* synthetic */ C2709Oi(InterfaceC3297hN interfaceC3297hN, InterfaceC3297hN interfaceC3297hN2, InterfaceC3297hN interfaceC3297hN3, C3243gN c3243gN, C3243gN c3243gN2, C3243gN c3243gN3, int i) {
        this.f26632a = i;
        this.f26633b = interfaceC3297hN;
        this.f26635d = interfaceC3297hN2;
        this.f26638g = interfaceC3297hN3;
        this.f26634c = c3243gN;
        this.f26636e = c3243gN2;
        this.f26637f = c3243gN3;
    }

    public C2709Oi(C3351iN c3351iN, C3795qk c3795qk, C3903sl c3903sl, C3044cm c3044cm, C3416jj c3416jj, C3243gN c3243gN) {
        this.f26632a = 2;
        this.f26633b = c3351iN;
        this.f26635d = c3795qk;
        this.f26636e = c3903sl;
        this.f26637f = c3044cm;
        this.f26638g = c3416jj;
        this.f26634c = c3243gN;
    }

    public C2709Oi(C3351iN c3351iN, C3243gN c3243gN, C3351iN c3351iN2, C4232yq c4232yq, C3243gN c3243gN2, C2987bi c2987bi) {
        this.f26632a = 10;
        this.f26633b = c3351iN;
        this.f26634c = c3243gN;
        this.f26635d = c3351iN2;
        this.f26637f = c4232yq;
        this.f26636e = c3243gN2;
        this.f26638g = c2987bi;
    }

    public C2709Oi(C3351iN c3351iN, C3243gN c3243gN, C3351iN c3351iN2, C4232yq c4232yq, C3243gN c3243gN2, C3243gN c3243gN3) {
        this.f26632a = 11;
        this.f26633b = c3351iN;
        this.f26634c = c3243gN;
        this.f26635d = c3351iN2;
        this.f26638g = c4232yq;
        this.f26636e = c3243gN2;
        this.f26637f = c3243gN3;
    }

    public C2709Oi(C3351iN c3351iN, C3243gN c3243gN, C3351iN c3351iN2, C3351iN c3351iN3, C3351iN c3351iN4, C3243gN c3243gN2) {
        this.f26632a = 16;
        this.f26633b = c3351iN;
        this.f26634c = c3243gN;
        this.f26635d = c3351iN2;
        this.f26637f = c3351iN3;
        this.f26638g = c3351iN4;
        this.f26636e = c3243gN2;
    }

    public /* synthetic */ C2709Oi(C3351iN c3351iN, InterfaceC3297hN interfaceC3297hN, InterfaceC3297hN interfaceC3297hN2, InterfaceC3297hN interfaceC3297hN3, C3243gN c3243gN, C3243gN c3243gN2, int i) {
        this.f26632a = i;
        this.f26633b = c3351iN;
        this.f26635d = interfaceC3297hN;
        this.f26637f = interfaceC3297hN2;
        this.f26638g = interfaceC3297hN3;
        this.f26634c = c3243gN;
        this.f26636e = c3243gN2;
    }
}
