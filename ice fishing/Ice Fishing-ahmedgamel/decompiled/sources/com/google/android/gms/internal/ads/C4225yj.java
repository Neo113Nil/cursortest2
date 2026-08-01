package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import q2.InterfaceC4915x;
import v2.C5110a;

/* renamed from: com.google.android.gms.internal.ads.yj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4225yj implements InterfaceC3297hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35212a;

    /* renamed from: b, reason: collision with root package name */
    public final C3243gN f35213b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC3511lN f35214c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f35215d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC3511lN f35216e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC3511lN f35217f;

    public C4225yj(C2987bi c2987bi, C2987bi c2987bi2, C2676Mj c2676Mj, InterfaceC3297hN interfaceC3297hN, C3243gN c3243gN) {
        this.f35212a = 8;
        this.f35215d = c2987bi;
        this.f35217f = c2987bi2;
        this.f35214c = c2676Mj;
        this.f35216e = interfaceC3297hN;
        this.f35213b = c3243gN;
    }

    public BinderC3848rk a() {
        return new BinderC3848rk(((C2676Mj) this.f35214c).a(), (String) ((C2676Mj) this.f35215d).f26322b.f31665w, (C3585mq) this.f35213b.f(), ((C2676Mj) this.f35216e).f26322b.s(), (String) ((C3243gN) this.f35217f).f());
    }

    public C2733Pp b() {
        return new C2733Pp(((C2987bi) this.f35215d).a(), ((C2727Pj) this.f35216e).a(), (C2699Np) this.f35213b.f(), ((C2689Nf) this.f35214c).a(), ((C2888Zh) this.f35217f).b());
    }

    public Xs c() {
        C2866Yb c2866Yb = new C2866Yb(18);
        Context a9 = ((C2987bi) this.f35215d).a();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f35213b.f();
        C3360ig c3360ig = AbstractC3413jg.f31268a;
        AbstractC3341iD.j(c3360ig);
        G1.a aVar = ((C2998bt) this.f35216e).f29342b;
        return new Xs(c2866Yb, a9, scheduledExecutorService, c3360ig, aVar.f1050u, ((C2739Qe) ((C2998bt) this.f35214c).f29342b.f1051v).f27039E, ((C2739Qe) ((C2998bt) this.f35217f).f29342b.f1051v).f27038D);
    }

    public C3051ct d() {
        C3038cg c3038cg = (C3038cg) this.f35213b.f();
        boolean z3 = ((C2739Qe) ((C2998bt) this.f35215d).f29342b.f1051v).f27038D;
        C3360ig c3360ig = AbstractC3413jg.f31268a;
        AbstractC3341iD.j(c3360ig);
        AbstractC3341iD.j(((C2739Qe) ((C2998bt) this.f35216e).f29342b.f1051v).f27044w);
        return new C3051ct(c3038cg, z3, c3360ig, (ScheduledExecutorService) ((C3243gN) this.f35214c).f(), ((C2998bt) this.f35217f).a().intValue());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3511lN
    public final Object f() {
        switch (this.f35212a) {
            case 0:
                return new C4171xj(((C2987bi) this.f35215d).a(), (InterfaceC4061vh) ((C3740pj) this.f35216e).f33119b.f25045x, ((C2676Mj) this.f35214c).a(), ((C2987bi) this.f35217f).b(), (C3155eq) this.f35213b.f());
            case 1:
                C2507Ck c2507Ck = (C2507Ck) this.f35213b.f();
                St a9 = ((C2676Mj) this.f35214c).a();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) ((C3243gN) this.f35215d).f();
                C3360ig c3360ig = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig);
                return new C3257gk(c2507Ck, a9, scheduledExecutorService, c3360ig, (String) ((C2676Mj) this.f35216e).f26322b.f31665w, (C2811Uk) ((C3243gN) this.f35217f).f());
            case 2:
                return new C3525lk(((C2676Mj) this.f35215d).b(), ((C2676Mj) this.f35214c).a(), (T2.a) this.f35213b.f(), (C3153eo) ((C3243gN) this.f35216e).f(), (ScheduledExecutorService) ((C3243gN) this.f35217f).f());
            case 3:
                return a();
            case 4:
                return new C2860Xl(((C2987bi) this.f35215d).a(), (InterfaceC4061vh) ((C2729Pl) this.f35216e).f26855b.f2841v, ((C2676Mj) this.f35214c).a(), ((C2987bi) this.f35217f).b(), (C3155eq) this.f35213b.f());
            case 5:
                Map f3 = ((C3403jN) this.f35215d).f();
                Map f9 = ((C3403jN) this.f35216e).f();
                Map f10 = ((C3403jN) this.f35214c).f();
                C4282zm c4282zm = (C4282zm) ((C3044cm) this.f35217f).f29580b.f29323u;
                AbstractC3341iD.j(c4282zm);
                return new C2937am(f3, f9, f10, this.f35213b, c4282zm);
            case 6:
                Context a10 = ((C2987bi) this.f35215d).a();
                String packageName = ((C3040ci) this.f35216e).f29536b.a().getPackageName();
                AbstractC3341iD.j(packageName);
                C5110a b9 = ((C2987bi) this.f35217f).b();
                EnumC3121e9 enumC3121e9 = (EnumC3121e9) this.f35214c.f();
                String str = (String) this.f35213b.f();
                C3068d9 c3068d9 = new C3068d9(new com.bumptech.glide.manager.p(a10, 6));
                C3982u9 B9 = C4036v9.B();
                int i = b9.f41392u;
                B9.h();
                ((C4036v9) B9.f27721u).C(i);
                int i6 = b9.f41393v;
                B9.h();
                ((C4036v9) B9.f27721u).D(i6);
                int i9 = true != b9.f41394w ? 2 : 0;
                B9.h();
                ((C4036v9) B9.f27721u).A(i9);
                c3068d9.a(new C2570Gf(enumC3121e9, packageName, (C4036v9) B9.j(), str, 15));
                return c3068d9;
            case 7:
                return b();
            case 8:
                return new C3155eq(((C2987bi) this.f35215d).a(), ((C2987bi) this.f35217f).b(), ((C2676Mj) this.f35214c).a(), (InterfaceC4061vh) ((InterfaceC3297hN) this.f35216e).f(), (C3153eo) this.f35213b.f());
            case 9:
                return new Tq((C3309hi) ((C3351iN) this.f35215d).f31039a, ((C3795qk) this.f35216e).f33377b.a(), ((C3903sl) this.f35214c).f34134b, (Xq) this.f35213b.f(), (C3585mq) ((C3243gN) this.f35217f).f());
            case 10:
                T2.a aVar = (T2.a) this.f35213b.f();
                C3416jj c3416jj = (C3416jj) this.f35216e;
                C3481ku c3481ku = new C3481ku(14, (C3427ju) c3416jj.f31304b.f(), (C2731Pn) c3416jj.f31305c.f(), (C3153eo) c3416jj.f31306d.f());
                C3585mq c3585mq = (C3585mq) ((C3243gN) this.f35214c).f();
                C4237yv c4237yv = (C4237yv) ((C3243gN) this.f35217f).f();
                Xq xq = (Xq) ((C3657o7) this.f35215d).f32862u;
                return xq != null ? xq : new Xq(aVar, c3481ku, c3585mq, c4237yv);
            case 11:
                return new C2530Dq((Context) this.f35213b.f(), (C3577mi) ((C3351iN) this.f35215d).f31039a, (Lu) ((C3243gN) this.f35216e).f(), (RD) ((C3243gN) this.f35214c).f(), (C3892sa) ((C3748pr) this.f35217f).f33148b.f32954u);
            case 12:
                return new BinderC4179xr((Context) this.f35213b.f(), (InterfaceC4915x) ((C3044cm) this.f35215d).f29580b.f29324v, ((C3795qk) this.f35216e).a(), ((C3578mj) ((C4008ui) this.f35214c).f34561b).a(), (C3153eo) ((C3243gN) this.f35217f).f());
            case 13:
                return c();
            default:
                return d();
        }
    }

    public C4225yj(C2987bi c2987bi, C3040ci c3040ci, C2987bi c2987bi2, InterfaceC3511lN interfaceC3511lN, C3243gN c3243gN) {
        this.f35212a = 6;
        this.f35215d = c2987bi;
        this.f35216e = c3040ci;
        this.f35217f = c2987bi2;
        this.f35214c = interfaceC3511lN;
        this.f35213b = c3243gN;
    }

    public C4225yj(C2987bi c2987bi, C2727Pj c2727Pj, C3243gN c3243gN, C2689Nf c2689Nf, C2888Zh c2888Zh) {
        this.f35212a = 7;
        this.f35215d = c2987bi;
        this.f35216e = c2727Pj;
        this.f35213b = c3243gN;
        this.f35214c = c2689Nf;
        this.f35217f = c2888Zh;
    }

    public /* synthetic */ C4225yj(C2987bi c2987bi, InterfaceC3297hN interfaceC3297hN, C2676Mj c2676Mj, C2987bi c2987bi2, C3243gN c3243gN, int i) {
        this.f35212a = i;
        this.f35215d = c2987bi;
        this.f35216e = interfaceC3297hN;
        this.f35214c = c2676Mj;
        this.f35217f = c2987bi2;
        this.f35213b = c3243gN;
    }

    public C4225yj(C2676Mj c2676Mj, C2676Mj c2676Mj2, C3243gN c3243gN, C2676Mj c2676Mj3, C3243gN c3243gN2) {
        this.f35212a = 3;
        this.f35214c = c2676Mj;
        this.f35215d = c2676Mj2;
        this.f35213b = c3243gN;
        this.f35216e = c2676Mj3;
        this.f35217f = c3243gN2;
    }

    public C4225yj(C2676Mj c2676Mj, C2676Mj c2676Mj2, C3243gN c3243gN, C3243gN c3243gN2, C3243gN c3243gN3) {
        this.f35212a = 2;
        this.f35215d = c2676Mj;
        this.f35214c = c2676Mj2;
        this.f35213b = c3243gN;
        this.f35216e = c3243gN2;
        this.f35217f = c3243gN3;
    }

    public C4225yj(C3243gN c3243gN, C2676Mj c2676Mj, C3243gN c3243gN2, C2676Mj c2676Mj2, C3243gN c3243gN3) {
        this.f35212a = 1;
        this.f35213b = c3243gN;
        this.f35214c = c2676Mj;
        this.f35215d = c3243gN2;
        this.f35216e = c2676Mj2;
        this.f35217f = c3243gN3;
    }

    public /* synthetic */ C4225yj(C3243gN c3243gN, InterfaceC3297hN interfaceC3297hN, InterfaceC3511lN interfaceC3511lN, InterfaceC3511lN interfaceC3511lN2, InterfaceC3511lN interfaceC3511lN3, int i) {
        this.f35212a = i;
        this.f35213b = c3243gN;
        this.f35215d = interfaceC3297hN;
        this.f35216e = interfaceC3511lN;
        this.f35214c = interfaceC3511lN2;
        this.f35217f = interfaceC3511lN3;
    }

    public /* synthetic */ C4225yj(InterfaceC3297hN interfaceC3297hN, InterfaceC3297hN interfaceC3297hN2, InterfaceC3297hN interfaceC3297hN3, C3243gN c3243gN, InterfaceC3511lN interfaceC3511lN, int i) {
        this.f35212a = i;
        this.f35215d = interfaceC3297hN;
        this.f35216e = interfaceC3297hN2;
        this.f35214c = interfaceC3297hN3;
        this.f35213b = c3243gN;
        this.f35217f = interfaceC3511lN;
    }

    public /* synthetic */ C4225yj(Object obj, C3243gN c3243gN, InterfaceC3297hN interfaceC3297hN, InterfaceC3511lN interfaceC3511lN, InterfaceC3511lN interfaceC3511lN2, int i) {
        this.f35212a = i;
        this.f35215d = obj;
        this.f35213b = c3243gN;
        this.f35216e = interfaceC3297hN;
        this.f35214c = interfaceC3511lN;
        this.f35217f = interfaceC3511lN2;
    }
}
