package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import w2.C5140B;

/* renamed from: com.google.android.gms.internal.ads.ai, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2956ai implements InterfaceC3320hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29849a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC3534lN f29850b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC3534lN f29851c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC3534lN f29852d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC3534lN f29853e;

    public C2956ai(C3010bi c3010bi, C3010bi c3010bi2, C3266gN c3266gN, C3266gN c3266gN2) {
        this.f29849a = 20;
        this.f29852d = c3010bi;
        this.f29853e = c3010bi2;
        this.f29850b = c3266gN;
        this.f29851c = c3266gN2;
    }

    public C3447jr a() {
        return new C3447jr((Lu) ((C3266gN) this.f29850b).f(), (RD) ((C3266gN) this.f29851c).f(), (InterfaceC3446jq) this.f29852d.f(), (InterfaceC3662nq) ((InterfaceC3320hN) this.f29853e).f(), 0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3534lN
    public final Object f() {
        switch (this.f29849a) {
            case 0:
                C5140B b9 = ((C2911Zh) this.f29852d).b();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) ((C3266gN) this.f29850b).f();
                C3557lt c9 = ((E2.F) this.f29853e).c();
                V2.a aVar = (V2.a) ((C3266gN) this.f29851c).f();
                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32894R)).booleanValue()) {
                    return new Cv(b9, scheduledExecutorService, c9, aVar);
                }
                return null;
            case 1:
                Lu lu = (Lu) ((C3266gN) this.f29850b).f();
                RD rd = (RD) ((C3266gN) this.f29851c).f();
                C2573Ff c2573Ff = (C2573Ff) this.f29852d;
                return new C3447jr(lu, rd, ((C2830Uh) this.f29853e).a(), new C4039uq(0, (Context) c2573Ff.f25602b.f(), (C3492ki) c2573Ff.f25603c.f31812a), 0);
            case 2:
                Lu lu2 = (Lu) ((C3266gN) this.f29850b).f();
                RD rd2 = (RD) ((C3266gN) this.f29851c).f();
                C2573Ff c2573Ff2 = (C2573Ff) this.f29852d;
                return new C3447jr(lu2, rd2, ((C2830Uh) this.f29853e).a(), new C2499Aq((Context) c2573Ff2.f25602b.f(), (C3600mi) c2573Ff2.f25603c.f31812a), 0);
            case 3:
                return new C2492Aj(((C2696Mj) this.f29852d).a(), (C2527Ck) ((C3266gN) this.f29850b).f(), (C2731Ok) ((C3266gN) this.f29851c).f(), (C2833Uk) ((C3266gN) this.f29853e).f());
            case 4:
                return new C2865Wj((V2.a) ((C3266gN) this.f29850b).f(), (C2881Xj) ((C3266gN) this.f29851c).f(), ((C3818qk) this.f29852d).a(), (String) ((C3266gN) this.f29853e).f());
            case 5:
                Lu lu3 = (Lu) ((C3266gN) this.f29850b).f();
                RD rd3 = (RD) ((C3266gN) this.f29851c).f();
                C2573Ff c2573Ff3 = (C2573Ff) this.f29852d;
                return new C3447jr(lu3, rd3, ((C2830Uh) this.f29853e).a(), new C4039uq(1, (Context) c2573Ff3.f25602b.f(), (C3816qi) c2573Ff3.f25603c.f31812a), 0);
            case 6:
                C2649Jn c2649Jn = (C2649Jn) ((C3266gN) this.f29850b).f();
                C4036un c4036un = (C4036un) ((C3389im) this.f29852d).f31886b.f25831v;
                AbstractC3364iD.j(c4036un);
                C3118dj c3118dj = (C3118dj) ((C3266gN) this.f29851c).f();
                C3282gm c3282gm = (C3282gm) ((C2783Rl) this.f29853e).f28007b.f();
                AbstractC3364iD.j(c3282gm);
                return new C2682Lm(c2649Jn, c4036un, c3118dj, c3282gm);
            case 7:
                return new BinderC3713on(((C3010bi) this.f29852d).a(), ((C4031ui) this.f29850b).a(), ((C2563Em) this.f29851c).a(), (C3873rm) ((Yr) this.f29853e).f());
            case 8:
                return new BinderC3767pn((String) ((C2696Mj) this.f29852d).f27111b.f32447w, (C3873rm) ((Yr) this.f29851c).f(), ((C4031ui) this.f29853e).a(), (C3230fo) ((C3266gN) this.f29850b).f());
            case 9:
                Lu lu4 = (Lu) ((C3266gN) this.f29850b).f();
                RD rd4 = (RD) ((C3266gN) this.f29851c).f();
                C2573Ff c2573Ff4 = (C2573Ff) this.f29852d;
                return new C3447jr(lu4, rd4, ((C2830Uh) this.f29853e).a(), new C4039uq(2, (Context) c2573Ff4.f25602b.f(), (C3923si) c2573Ff4.f25603c.f31812a), 0);
            case 10:
                return new C3070cp((C3017bp) ((C3266gN) this.f29850b).f(), (C3230fo) ((C3266gN) this.f29851c).f(), ((C3010bi) this.f29853e).a(), ((C2911Zh) this.f29852d).b());
            case 11:
                return new BinderC2903Yp(((C3010bi) this.f29852d).a(), (C2821Tp) ((C3266gN) this.f29850b).f(), (x2.l) this.f29853e.f(), (C3230fo) ((C3266gN) this.f29851c).f());
            case 12:
                return a();
            case 13:
                return new C3447jr((Lu) ((C3266gN) this.f29850b).f(), (RD) ((C3266gN) this.f29851c).f(), (C3915sa) ((C3771pr) this.f29852d).f33934b.f33740u, new C4201xq(2, (C3816qi) ((C3117di) this.f29853e).f30595b.f31812a), 1);
            case 14:
                C3180es a9 = ((C2962ao) this.f29852d).a();
                C3718os c3718os = (C3718os) ((C3266gN) this.f29850b).f();
                List list = (List) ((C3266gN) this.f29851c).f();
                ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) ((C3266gN) this.f29853e).f();
                if (list.contains("10")) {
                    return new Qr(c3718os, ((Integer) s2.r.f40506e.f40509c.a(AbstractC3592ma.Dd)).intValue(), scheduledExecutorService2);
                }
                return new Qr(a9, ((Integer) s2.r.f40506e.f40509c.a(AbstractC3592ma.Dd)).intValue(), scheduledExecutorService2);
            case 15:
                C3180es a10 = ((C3442jm) this.f29852d).a();
                C3718os c3718os2 = (C3718os) ((C3266gN) this.f29850b).f();
                List list2 = (List) ((C3266gN) this.f29851c).f();
                ScheduledExecutorService scheduledExecutorService3 = (ScheduledExecutorService) ((C3266gN) this.f29853e).f();
                if (list2.contains("54")) {
                    return new Qr(c3718os2, ((Integer) s2.r.f40506e.f40509c.a(AbstractC3592ma.Nd)).intValue(), scheduledExecutorService3);
                }
                return new Qr(a10, ((Integer) s2.r.f40506e.f40509c.a(AbstractC3592ma.Nd)).intValue(), scheduledExecutorService3);
            case 16:
                C3073cs b10 = ((C3063ci) this.f29852d).b();
                C3718os c3718os3 = (C3718os) ((C3266gN) this.f29850b).f();
                List list3 = (List) ((C3266gN) this.f29851c).f();
                ScheduledExecutorService scheduledExecutorService4 = (ScheduledExecutorService) ((C3266gN) this.f29853e).f();
                if (list3.contains("13")) {
                    return new Qr(c3718os3, ((Integer) s2.r.f40506e.f40509c.a(AbstractC3592ma.Md)).intValue(), scheduledExecutorService4);
                }
                return new Qr(b10, ((Integer) s2.r.f40506e.f40509c.a(AbstractC3592ma.Md)).intValue(), scheduledExecutorService4);
            case 17:
                C3180es b11 = ((E2.F) this.f29852d).b();
                C3718os c3718os4 = (C3718os) ((C3266gN) this.f29850b).f();
                List list4 = (List) ((C3266gN) this.f29851c).f();
                ScheduledExecutorService scheduledExecutorService5 = (ScheduledExecutorService) ((C3266gN) this.f29853e).f();
                if (list4.contains("60")) {
                    return new Qr(c3718os4, ((Integer) s2.r.f40506e.f40509c.a(AbstractC3592ma.ne)).intValue(), scheduledExecutorService5);
                }
                return new Qr(b11, ((Integer) s2.r.f40506e.f40509c.a(AbstractC3592ma.ne)).intValue(), scheduledExecutorService5);
            case 18:
                Or d9 = ((Hs) this.f29852d).d();
                C3718os c3718os5 = (C3718os) ((C3266gN) this.f29850b).f();
                List list5 = (List) ((C3266gN) this.f29851c).f();
                ScheduledExecutorService scheduledExecutorService6 = (ScheduledExecutorService) ((C3266gN) this.f29853e).f();
                if (list5.contains("35")) {
                    return new Qr(c3718os5, ((Integer) s2.r.f40506e.f40509c.a(AbstractC3592ma.Ad)).intValue(), scheduledExecutorService6);
                }
                return new Qr(d9, ((Integer) s2.r.f40506e.f40509c.a(AbstractC3592ma.Ad)).intValue(), scheduledExecutorService6);
            case 19:
                C3073cs d10 = ((C3063ci) this.f29852d).d();
                C3718os c3718os6 = (C3718os) ((C3266gN) this.f29850b).f();
                List list6 = (List) ((C3266gN) this.f29851c).f();
                ScheduledExecutorService scheduledExecutorService7 = (ScheduledExecutorService) ((C3266gN) this.f29853e).f();
                if (list6.contains("39")) {
                    return new Qr(c3718os6, ((Integer) s2.r.f40506e.f40509c.a(AbstractC3592ma.xd)).intValue(), scheduledExecutorService7);
                }
                return new Qr(d10, ((Integer) s2.r.f40506e.f40509c.a(AbstractC3592ma.xd)).intValue(), scheduledExecutorService7);
            case 20:
                return new Wu(((C3010bi) this.f29852d).a(), ((C3010bi) this.f29853e).b(), (C2768Qn) ((C3266gN) this.f29850b).f(), new C2889Yb(16), (C2847Vh) ((C3266gN) this.f29851c).f());
            case 21:
                return new Kv((Qv) ((C3266gN) this.f29850b).f(), ((E2.F) this.f29853e).c(), ((C3010bi) this.f29852d).a(), (V2.a) ((C3266gN) this.f29851c).f());
            case 22:
                return new By(C3266gN.b((C3588mN) this.f29852d), C3266gN.b((C3588mN) this.f29851c), (ExecutorService) ((C3374iN) this.f29853e).f31812a, C3266gN.b((C3266gN) this.f29850b));
            default:
                return new C3401iz((C4002u6) ((C3374iN) this.f29852d).f31812a, (Map) ((C3374iN) this.f29851c).f31812a, (C2972ay) ((C3374iN) this.f29853e).f31812a, (C4006uA) ((C3266gN) this.f29850b).f());
        }
    }

    public C2956ai(C3266gN c3266gN, E2.F f2, C3010bi c3010bi, C3266gN c3266gN2) {
        this.f29849a = 21;
        this.f29850b = c3266gN;
        this.f29853e = f2;
        this.f29852d = c3010bi;
        this.f29851c = c3266gN2;
    }

    public C2956ai(C3266gN c3266gN, C3389im c3389im, C3266gN c3266gN2, C2783Rl c2783Rl) {
        this.f29849a = 6;
        this.f29850b = c3266gN;
        this.f29852d = c3389im;
        this.f29851c = c3266gN2;
        this.f29853e = c2783Rl;
    }

    public C2956ai(C3266gN c3266gN, C3266gN c3266gN2, C3010bi c3010bi, C2911Zh c2911Zh) {
        this.f29849a = 10;
        this.f29850b = c3266gN;
        this.f29851c = c3266gN2;
        this.f29853e = c3010bi;
        this.f29852d = c2911Zh;
    }

    public /* synthetic */ C2956ai(C3266gN c3266gN, C3266gN c3266gN2, InterfaceC3534lN interfaceC3534lN, InterfaceC3534lN interfaceC3534lN2, int i) {
        this.f29849a = i;
        this.f29850b = c3266gN;
        this.f29851c = c3266gN2;
        this.f29852d = interfaceC3534lN;
        this.f29853e = interfaceC3534lN2;
    }

    public /* synthetic */ C2956ai(InterfaceC3320hN interfaceC3320hN, C3266gN c3266gN, InterfaceC3534lN interfaceC3534lN, C3266gN c3266gN2, int i) {
        this.f29849a = i;
        this.f29852d = interfaceC3320hN;
        this.f29850b = c3266gN;
        this.f29853e = interfaceC3534lN;
        this.f29851c = c3266gN2;
    }

    public /* synthetic */ C2956ai(InterfaceC3320hN interfaceC3320hN, InterfaceC3320hN interfaceC3320hN2, InterfaceC3320hN interfaceC3320hN3, C3266gN c3266gN, int i) {
        this.f29849a = i;
        this.f29852d = interfaceC3320hN;
        this.f29851c = interfaceC3320hN2;
        this.f29853e = interfaceC3320hN3;
        this.f29850b = c3266gN;
    }

    public /* synthetic */ C2956ai(InterfaceC3320hN interfaceC3320hN, InterfaceC3534lN interfaceC3534lN, InterfaceC3534lN interfaceC3534lN2, InterfaceC3534lN interfaceC3534lN3, int i) {
        this.f29849a = i;
        this.f29852d = interfaceC3320hN;
        this.f29850b = interfaceC3534lN;
        this.f29851c = interfaceC3534lN2;
        this.f29853e = interfaceC3534lN3;
    }
}
