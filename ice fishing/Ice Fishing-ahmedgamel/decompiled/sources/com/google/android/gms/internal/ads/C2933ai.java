package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import u2.C5069B;

/* renamed from: com.google.android.gms.internal.ads.ai, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2933ai implements InterfaceC3297hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29074a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC3511lN f29075b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC3511lN f29076c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC3511lN f29077d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC3511lN f29078e;

    public C2933ai(C2987bi c2987bi, C2987bi c2987bi2, C3243gN c3243gN, C3243gN c3243gN2) {
        this.f29074a = 20;
        this.f29077d = c2987bi;
        this.f29078e = c2987bi2;
        this.f29075b = c3243gN;
        this.f29076c = c3243gN2;
    }

    public C3424jr a() {
        return new C3424jr((Lu) ((C3243gN) this.f29075b).f(), (RD) ((C3243gN) this.f29076c).f(), (InterfaceC3423jq) this.f29077d.f(), (InterfaceC3639nq) ((InterfaceC3297hN) this.f29078e).f(), 0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3511lN
    public final Object f() {
        switch (this.f29074a) {
            case 0:
                C5069B b9 = ((C2888Zh) this.f29077d).b();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) ((C3243gN) this.f29075b).f();
                C3534lt c9 = ((C2.G) this.f29078e).c();
                T2.a aVar = (T2.a) ((C3243gN) this.f29076c).f();
                if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32114R)).booleanValue()) {
                    return new Cv(b9, scheduledExecutorService, c9, aVar);
                }
                return null;
            case 1:
                Lu lu = (Lu) ((C3243gN) this.f29075b).f();
                RD rd = (RD) ((C3243gN) this.f29076c).f();
                C2553Ff c2553Ff = (C2553Ff) this.f29077d;
                return new C3424jr(lu, rd, ((C2808Uh) this.f29078e).a(), new C4016uq(0, (Context) c2553Ff.f24813b.f(), (C3469ki) c2553Ff.f24814c.f31039a), 0);
            case 2:
                Lu lu2 = (Lu) ((C3243gN) this.f29075b).f();
                RD rd2 = (RD) ((C3243gN) this.f29076c).f();
                C2553Ff c2553Ff2 = (C2553Ff) this.f29077d;
                return new C3424jr(lu2, rd2, ((C2808Uh) this.f29078e).a(), new C2479Aq((Context) c2553Ff2.f24813b.f(), (C3577mi) c2553Ff2.f24814c.f31039a), 0);
            case 3:
                return new C2472Aj(((C2676Mj) this.f29077d).a(), (C2507Ck) ((C3243gN) this.f29075b).f(), (C2711Ok) ((C3243gN) this.f29076c).f(), (C2811Uk) ((C3243gN) this.f29078e).f());
            case 4:
                return new C2842Wj((T2.a) ((C3243gN) this.f29075b).f(), (C2858Xj) ((C3243gN) this.f29076c).f(), ((C3795qk) this.f29077d).a(), (String) ((C3243gN) this.f29078e).f());
            case 5:
                Lu lu3 = (Lu) ((C3243gN) this.f29075b).f();
                RD rd3 = (RD) ((C3243gN) this.f29076c).f();
                C2553Ff c2553Ff3 = (C2553Ff) this.f29077d;
                return new C3424jr(lu3, rd3, ((C2808Uh) this.f29078e).a(), new C4016uq(1, (Context) c2553Ff3.f24813b.f(), (C3793qi) c2553Ff3.f24814c.f31039a), 0);
            case 6:
                C2612In c2612In = (C2612In) ((C3243gN) this.f29075b).f();
                C3959tn c3959tn = (C3959tn) ((C3313hm) this.f29077d).f30929b.f25043v;
                AbstractC3341iD.j(c3959tn);
                C3095dj c3095dj = (C3095dj) ((C3243gN) this.f29076c).f();
                C3205fm c3205fm = (C3205fm) ((C2746Ql) this.f29078e).f27063b.f();
                AbstractC3341iD.j(c3205fm);
                return new C2645Km(c2612In, c3959tn, c3095dj, c3205fm);
            case 7:
                return new BinderC3636nn(((C2987bi) this.f29077d).a(), ((C4008ui) this.f29075b).a(), ((C2526Dm) this.f29076c).a(), (C3797qm) ((Yr) this.f29078e).f());
            case 8:
                return new BinderC3690on((String) ((C2676Mj) this.f29077d).f26322b.f31665w, (C3797qm) ((Yr) this.f29076c).f(), ((C4008ui) this.f29078e).a(), (C3153eo) ((C3243gN) this.f29075b).f());
            case 9:
                Lu lu4 = (Lu) ((C3243gN) this.f29075b).f();
                RD rd4 = (RD) ((C3243gN) this.f29076c).f();
                C2553Ff c2553Ff4 = (C2553Ff) this.f29077d;
                return new C3424jr(lu4, rd4, ((C2808Uh) this.f29078e).a(), new C4016uq(2, (Context) c2553Ff4.f24813b.f(), (C3900si) c2553Ff4.f24814c.f31039a), 0);
            case 10:
                return new C3047cp((C2994bp) ((C3243gN) this.f29075b).f(), (C3153eo) ((C3243gN) this.f29076c).f(), ((C2987bi) this.f29078e).a(), ((C2888Zh) this.f29077d).b());
            case 11:
                return new BinderC2880Yp(((C2987bi) this.f29077d).a(), (C2800Tp) ((C3243gN) this.f29075b).f(), (v2.l) this.f29078e.f(), (C3153eo) ((C3243gN) this.f29076c).f());
            case 12:
                return a();
            case 13:
                return new C3424jr((Lu) ((C3243gN) this.f29075b).f(), (RD) ((C3243gN) this.f29076c).f(), (C3892sa) ((C3748pr) this.f29077d).f33148b.f32954u, new C4178xq(2, (C3793qi) ((C3094di) this.f29078e).f29822b.f31039a), 1);
            case 14:
                C3157es a9 = ((C2894Zn) this.f29077d).a();
                C3695os c3695os = (C3695os) ((C3243gN) this.f29075b).f();
                List list = (List) ((C3243gN) this.f29076c).f();
                ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) ((C3243gN) this.f29078e).f();
                if (list.contains("10")) {
                    return new Qr(c3695os, ((Integer) q2.r.f40207e.f40210c.a(AbstractC3569ma.Dd)).intValue(), scheduledExecutorService2);
                }
                return new Qr(a9, ((Integer) q2.r.f40207e.f40210c.a(AbstractC3569ma.Dd)).intValue(), scheduledExecutorService2);
            case 15:
                C3157es a10 = ((C3366im) this.f29077d).a();
                C3695os c3695os2 = (C3695os) ((C3243gN) this.f29075b).f();
                List list2 = (List) ((C3243gN) this.f29076c).f();
                ScheduledExecutorService scheduledExecutorService3 = (ScheduledExecutorService) ((C3243gN) this.f29078e).f();
                if (list2.contains("54")) {
                    return new Qr(c3695os2, ((Integer) q2.r.f40207e.f40210c.a(AbstractC3569ma.Nd)).intValue(), scheduledExecutorService3);
                }
                return new Qr(a10, ((Integer) q2.r.f40207e.f40210c.a(AbstractC3569ma.Nd)).intValue(), scheduledExecutorService3);
            case 16:
                C3050cs b10 = ((C3040ci) this.f29077d).b();
                C3695os c3695os3 = (C3695os) ((C3243gN) this.f29075b).f();
                List list3 = (List) ((C3243gN) this.f29076c).f();
                ScheduledExecutorService scheduledExecutorService4 = (ScheduledExecutorService) ((C3243gN) this.f29078e).f();
                if (list3.contains("13")) {
                    return new Qr(c3695os3, ((Integer) q2.r.f40207e.f40210c.a(AbstractC3569ma.Md)).intValue(), scheduledExecutorService4);
                }
                return new Qr(b10, ((Integer) q2.r.f40207e.f40210c.a(AbstractC3569ma.Md)).intValue(), scheduledExecutorService4);
            case 17:
                C3157es b11 = ((C2.G) this.f29077d).b();
                C3695os c3695os4 = (C3695os) ((C3243gN) this.f29075b).f();
                List list4 = (List) ((C3243gN) this.f29076c).f();
                ScheduledExecutorService scheduledExecutorService5 = (ScheduledExecutorService) ((C3243gN) this.f29078e).f();
                if (list4.contains("60")) {
                    return new Qr(c3695os4, ((Integer) q2.r.f40207e.f40210c.a(AbstractC3569ma.ne)).intValue(), scheduledExecutorService5);
                }
                return new Qr(b11, ((Integer) q2.r.f40207e.f40210c.a(AbstractC3569ma.ne)).intValue(), scheduledExecutorService5);
            case 18:
                Or d2 = ((Hs) this.f29077d).d();
                C3695os c3695os5 = (C3695os) ((C3243gN) this.f29075b).f();
                List list5 = (List) ((C3243gN) this.f29076c).f();
                ScheduledExecutorService scheduledExecutorService6 = (ScheduledExecutorService) ((C3243gN) this.f29078e).f();
                if (list5.contains("35")) {
                    return new Qr(c3695os5, ((Integer) q2.r.f40207e.f40210c.a(AbstractC3569ma.Ad)).intValue(), scheduledExecutorService6);
                }
                return new Qr(d2, ((Integer) q2.r.f40207e.f40210c.a(AbstractC3569ma.Ad)).intValue(), scheduledExecutorService6);
            case 19:
                C3050cs d9 = ((C3040ci) this.f29077d).d();
                C3695os c3695os6 = (C3695os) ((C3243gN) this.f29075b).f();
                List list6 = (List) ((C3243gN) this.f29076c).f();
                ScheduledExecutorService scheduledExecutorService7 = (ScheduledExecutorService) ((C3243gN) this.f29078e).f();
                if (list6.contains("39")) {
                    return new Qr(c3695os6, ((Integer) q2.r.f40207e.f40210c.a(AbstractC3569ma.xd)).intValue(), scheduledExecutorService7);
                }
                return new Qr(d9, ((Integer) q2.r.f40207e.f40210c.a(AbstractC3569ma.xd)).intValue(), scheduledExecutorService7);
            case 20:
                return new Wu(((C2987bi) this.f29077d).a(), ((C2987bi) this.f29078e).b(), (C2731Pn) ((C3243gN) this.f29075b).f(), new C2866Yb(16), (C2824Vh) ((C3243gN) this.f29076c).f());
            case 21:
                return new Kv((Qv) ((C3243gN) this.f29075b).f(), ((C2.G) this.f29078e).c(), ((C2987bi) this.f29077d).a(), (T2.a) ((C3243gN) this.f29076c).f());
            case 22:
                return new By(C3243gN.b((C3565mN) this.f29077d), C3243gN.b((C3565mN) this.f29076c), (ExecutorService) ((C3351iN) this.f29078e).f31039a, C3243gN.b((C3243gN) this.f29075b));
            default:
                return new C3378iz((C3979u6) ((C3351iN) this.f29077d).f31039a, (Map) ((C3351iN) this.f29076c).f31039a, (C2949ay) ((C3351iN) this.f29078e).f31039a, (C3983uA) ((C3243gN) this.f29075b).f());
        }
    }

    public C2933ai(C3243gN c3243gN, C2.G g4, C2987bi c2987bi, C3243gN c3243gN2) {
        this.f29074a = 21;
        this.f29075b = c3243gN;
        this.f29078e = g4;
        this.f29077d = c2987bi;
        this.f29076c = c3243gN2;
    }

    public C2933ai(C3243gN c3243gN, C3313hm c3313hm, C3243gN c3243gN2, C2746Ql c2746Ql) {
        this.f29074a = 6;
        this.f29075b = c3243gN;
        this.f29077d = c3313hm;
        this.f29076c = c3243gN2;
        this.f29078e = c2746Ql;
    }

    public C2933ai(C3243gN c3243gN, C3243gN c3243gN2, C2987bi c2987bi, C2888Zh c2888Zh) {
        this.f29074a = 10;
        this.f29075b = c3243gN;
        this.f29076c = c3243gN2;
        this.f29078e = c2987bi;
        this.f29077d = c2888Zh;
    }

    public /* synthetic */ C2933ai(C3243gN c3243gN, C3243gN c3243gN2, InterfaceC3511lN interfaceC3511lN, InterfaceC3511lN interfaceC3511lN2, int i) {
        this.f29074a = i;
        this.f29075b = c3243gN;
        this.f29076c = c3243gN2;
        this.f29077d = interfaceC3511lN;
        this.f29078e = interfaceC3511lN2;
    }

    public /* synthetic */ C2933ai(InterfaceC3297hN interfaceC3297hN, C3243gN c3243gN, InterfaceC3511lN interfaceC3511lN, C3243gN c3243gN2, int i) {
        this.f29074a = i;
        this.f29077d = interfaceC3297hN;
        this.f29075b = c3243gN;
        this.f29078e = interfaceC3511lN;
        this.f29076c = c3243gN2;
    }

    public /* synthetic */ C2933ai(InterfaceC3297hN interfaceC3297hN, InterfaceC3297hN interfaceC3297hN2, InterfaceC3297hN interfaceC3297hN3, C3243gN c3243gN, int i) {
        this.f29074a = i;
        this.f29077d = interfaceC3297hN;
        this.f29076c = interfaceC3297hN2;
        this.f29078e = interfaceC3297hN3;
        this.f29075b = c3243gN;
    }

    public /* synthetic */ C2933ai(InterfaceC3297hN interfaceC3297hN, InterfaceC3511lN interfaceC3511lN, InterfaceC3511lN interfaceC3511lN2, InterfaceC3511lN interfaceC3511lN3, int i) {
        this.f29074a = i;
        this.f29077d = interfaceC3297hN;
        this.f29075b = interfaceC3511lN;
        this.f29076c = interfaceC3511lN2;
        this.f29078e = interfaceC3511lN3;
    }
}
