package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.Wh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2843Wh implements InterfaceC4063vN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28440a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC4279zN f28441b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC4279zN f28442c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC4279zN f28443d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC4279zN f28444e;

    public C2843Wh(C2860Xh c2860Xh, C2860Xh c2860Xh2, C4009uN c4009uN, C4009uN c4009uN2) {
        this.f28440a = 20;
        this.f28443d = c2860Xh;
        this.f28444e = c2860Xh2;
        this.f28441b = c4009uN;
        this.f28442c = c4009uN2;
    }

    public C3599mr a() {
        return new C3599mr((Ou) ((C4009uN) this.f28441b).d(), (SD) ((C4009uN) this.f28442c).d(), (InterfaceC3544lq) this.f28443d.d(), (InterfaceC3760pq) ((InterfaceC4063vN) this.f28444e).d(), 0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4279zN
    public final Object d() {
        switch (this.f28440a) {
            case 0:
                t2.E b9 = ((C2826Vh) this.f28443d).b();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) ((C4009uN) this.f28441b).d();
                Mt c4 = ((C2941ai) this.f28444e).c();
                S2.a aVar = (S2.a) ((C4009uN) this.f28442c).d();
                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31534R)).booleanValue()) {
                    return new Ev(b9, scheduledExecutorService, c4, aVar);
                }
                return null;
            case 1:
                Ou ou = (Ou) ((C4009uN) this.f28441b).d();
                SD sd = (SD) ((C4009uN) this.f28442c).d();
                C2501Cf c2501Cf = (C2501Cf) this.f28443d;
                return new C3599mr(ou, sd, ((C2758Rh) this.f28444e).a(), new C4191xq(0, (Context) c2501Cf.f24238b.d(), (C3375ii) c2501Cf.f24239c.f34977a), 0);
            case 2:
                Ou ou2 = (Ou) ((C4009uN) this.f28441b).d();
                SD sd2 = (SD) ((C4009uN) this.f28442c).d();
                C2501Cf c2501Cf2 = (C2501Cf) this.f28443d;
                return new C3599mr(ou2, sd2, ((C2758Rh) this.f28444e).a(), new C2529Dq((Context) c2501Cf2.f24238b.d(), (C3482ki) c2501Cf2.f24239c.f34977a), 0);
            case 3:
                return new C4238yj(((C2675Mj) this.f28443d).a(), (C2489Bk) ((C4009uN) this.f28441b).d(), (C2676Mk) ((C4009uN) this.f28442c).d(), (C2778Sk) ((C4009uN) this.f28444e).d());
            case 4:
                return new C2845Wj((S2.a) ((C4009uN) this.f28441b).d(), (C2862Xj) ((C4009uN) this.f28442c).d(), ((C3700ok) this.f28443d).a(), (String) ((C4009uN) this.f28444e).d());
            case 5:
                Ou ou3 = (Ou) ((C4009uN) this.f28441b).d();
                SD sd3 = (SD) ((C4009uN) this.f28442c).d();
                C2501Cf c2501Cf3 = (C2501Cf) this.f28443d;
                return new C3599mr(ou3, sd3, ((C2758Rh) this.f28444e).a(), new C4191xq(1, (Context) c2501Cf3.f24238b.d(), (C3644ni) c2501Cf3.f24239c.f34977a), 0);
            case 6:
                C2628Jn c2628Jn = (C2628Jn) ((C4009uN) this.f28441b).d();
                C4026un c4026un = (C4026un) ((C3218fm) this.f28443d).f30881b.f24454v;
                AbstractC3137eE.h(c4026un);
                C2997bj c2997bj = (C2997bj) ((C4009uN) this.f28442c).d();
                C3109dm c3109dm = (C3109dm) ((C2694Nl) this.f28444e).f26598b.d();
                AbstractC3137eE.h(c3109dm);
                return new C2610Im(c2628Jn, c4026un, c2997bj, c3109dm);
            case 7:
                return new BinderC3649nn(((C2860Xh) this.f28443d).a(), ((C3913si) this.f28441b).a(), ((C2491Bm) this.f28442c).a(), (C3648nm) ((C3006bs) this.f28444e).d());
            case 8:
                return new BinderC3703on((String) ((C2675Mj) this.f28443d).f26371b.f32776w, (C3648nm) ((C3006bs) this.f28442c).d(), ((C3913si) this.f28444e).a(), (C3165eo) ((C4009uN) this.f28441b).d());
            case 9:
                Ou ou4 = (Ou) ((C4009uN) this.f28441b).d();
                SD sd4 = (SD) ((C4009uN) this.f28442c).d();
                C2501Cf c2501Cf4 = (C2501Cf) this.f28443d;
                return new C3599mr(ou4, sd4, ((C2758Rh) this.f28444e).a(), new C4191xq(2, (Context) c2501Cf4.f24238b.d(), (C3806qi) c2501Cf4.f24239c.f34977a), 0);
            case 10:
                return new C3166ep((C3111dp) ((C4009uN) this.f28441b).d(), (C3165eo) ((C4009uN) this.f28442c).d(), ((C2860Xh) this.f28444e).a(), ((C2826Vh) this.f28443d).b());
            case 11:
                return new BinderC2949aq(((C2860Xh) this.f28443d).a(), (C2834Vp) ((C4009uN) this.f28441b).d(), (u2.l) this.f28444e.d(), (C3165eo) ((C4009uN) this.f28442c).d());
            case 12:
                return a();
            case 13:
                return new C3599mr((Ou) ((C4009uN) this.f28441b).d(), (SD) ((C4009uN) this.f28442c).d(), (C3744pa) ((C3815qr) this.f28443d).f33898b.f33523u, new C2478Aq(2, (C3644ni) ((C2996bi) this.f28444e).f29551b.f34977a), 1);
            case 14:
                C3278gs a9 = ((C3220fo) this.f28443d).a();
                C3869rs c3869rs = (C3869rs) ((C4009uN) this.f28441b).d();
                List list = (List) ((C4009uN) this.f28442c).d();
                ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) ((C4009uN) this.f28444e).d();
                if (list.contains("10")) {
                    return new Sr(c3869rs, ((Integer) q2.r.f40116e.f40119c.a(AbstractC3368ia.Dd)).intValue(), scheduledExecutorService2);
                }
                return new Sr(a9, ((Integer) q2.r.f40116e.f40119c.a(AbstractC3368ia.Dd)).intValue(), scheduledExecutorService2);
            case 15:
                C3278gs a10 = ((C3272gm) this.f28443d).a();
                C3869rs c3869rs2 = (C3869rs) ((C4009uN) this.f28441b).d();
                List list2 = (List) ((C4009uN) this.f28442c).d();
                ScheduledExecutorService scheduledExecutorService3 = (ScheduledExecutorService) ((C4009uN) this.f28444e).d();
                if (list2.contains("54")) {
                    return new Sr(c3869rs2, ((Integer) q2.r.f40116e.f40119c.a(AbstractC3368ia.Nd)).intValue(), scheduledExecutorService3);
                }
                return new Sr(a10, ((Integer) q2.r.f40116e.f40119c.a(AbstractC3368ia.Nd)).intValue(), scheduledExecutorService3);
            case 16:
                C3169es b10 = ((C2877Yh) this.f28443d).b();
                C3869rs c3869rs3 = (C3869rs) ((C4009uN) this.f28441b).d();
                List list3 = (List) ((C4009uN) this.f28442c).d();
                ScheduledExecutorService scheduledExecutorService4 = (ScheduledExecutorService) ((C4009uN) this.f28444e).d();
                if (list3.contains("13")) {
                    return new Sr(c3869rs3, ((Integer) q2.r.f40116e.f40119c.a(AbstractC3368ia.Md)).intValue(), scheduledExecutorService4);
                }
                return new Sr(b10, ((Integer) q2.r.f40116e.f40119c.a(AbstractC3368ia.Md)).intValue(), scheduledExecutorService4);
            case 17:
                C3278gs b11 = ((C2941ai) this.f28443d).b();
                C3869rs c3869rs4 = (C3869rs) ((C4009uN) this.f28441b).d();
                List list4 = (List) ((C4009uN) this.f28442c).d();
                ScheduledExecutorService scheduledExecutorService5 = (ScheduledExecutorService) ((C4009uN) this.f28444e).d();
                if (list4.contains("60")) {
                    return new Sr(c3869rs4, ((Integer) q2.r.f40116e.f40119c.a(AbstractC3368ia.ne)).intValue(), scheduledExecutorService5);
                }
                return new Sr(b11, ((Integer) q2.r.f40116e.f40119c.a(AbstractC3368ia.ne)).intValue(), scheduledExecutorService5);
            case 18:
                Qr e6 = ((Is) this.f28443d).e();
                C3869rs c3869rs5 = (C3869rs) ((C4009uN) this.f28441b).d();
                List list5 = (List) ((C4009uN) this.f28442c).d();
                ScheduledExecutorService scheduledExecutorService6 = (ScheduledExecutorService) ((C4009uN) this.f28444e).d();
                if (list5.contains("35")) {
                    return new Sr(c3869rs5, ((Integer) q2.r.f40116e.f40119c.a(AbstractC3368ia.Ad)).intValue(), scheduledExecutorService6);
                }
                return new Sr(e6, ((Integer) q2.r.f40116e.f40119c.a(AbstractC3368ia.Ad)).intValue(), scheduledExecutorService6);
            case 19:
                C3169es e9 = ((C2877Yh) this.f28443d).e();
                C3869rs c3869rs6 = (C3869rs) ((C4009uN) this.f28441b).d();
                List list6 = (List) ((C4009uN) this.f28442c).d();
                ScheduledExecutorService scheduledExecutorService7 = (ScheduledExecutorService) ((C4009uN) this.f28444e).d();
                if (list6.contains("39")) {
                    return new Sr(c3869rs6, ((Integer) q2.r.f40116e.f40119c.a(AbstractC3368ia.xd)).intValue(), scheduledExecutorService7);
                }
                return new Sr(e9, ((Integer) q2.r.f40116e.f40119c.a(AbstractC3368ia.xd)).intValue(), scheduledExecutorService7);
            case 20:
                return new Zu(((C2860Xh) this.f28443d).a(), ((C2860Xh) this.f28444e).b(), (C2764Rn) ((C4009uN) this.f28441b).d(), new C2837Wb(16), (C2775Sh) ((C4009uN) this.f28442c).d());
            case 21:
                return new Mv((Sv) ((C4009uN) this.f28441b).d(), ((C2941ai) this.f28444e).c(), ((C2860Xh) this.f28443d).a(), (S2.a) ((C4009uN) this.f28442c).d());
            case 22:
                return new Cy(C4009uN.b((AN) this.f28443d), C4009uN.b((AN) this.f28442c), (ExecutorService) ((C4117wN) this.f28444e).f34977a, C4009uN.b((C4009uN) this.f28441b));
            default:
                return new C3553lz((C3830r6) ((C4117wN) this.f28443d).f34977a, (Map) ((C4117wN) this.f28442c).f34977a, (C3066cy) ((C4117wN) this.f28444e).f34977a, (C4158xA) ((C4009uN) this.f28441b).d());
        }
    }

    public C2843Wh(C4009uN c4009uN, C2941ai c2941ai, C2860Xh c2860Xh, C4009uN c4009uN2) {
        this.f28440a = 21;
        this.f28441b = c4009uN;
        this.f28444e = c2941ai;
        this.f28443d = c2860Xh;
        this.f28442c = c4009uN2;
    }

    public C2843Wh(C4009uN c4009uN, C3218fm c3218fm, C4009uN c4009uN2, C2694Nl c2694Nl) {
        this.f28440a = 6;
        this.f28441b = c4009uN;
        this.f28443d = c3218fm;
        this.f28442c = c4009uN2;
        this.f28444e = c2694Nl;
    }

    public C2843Wh(C4009uN c4009uN, C4009uN c4009uN2, C2860Xh c2860Xh, C2826Vh c2826Vh) {
        this.f28440a = 10;
        this.f28441b = c4009uN;
        this.f28442c = c4009uN2;
        this.f28444e = c2860Xh;
        this.f28443d = c2826Vh;
    }

    public /* synthetic */ C2843Wh(C4009uN c4009uN, C4009uN c4009uN2, InterfaceC4279zN interfaceC4279zN, InterfaceC4279zN interfaceC4279zN2, int i) {
        this.f28440a = i;
        this.f28441b = c4009uN;
        this.f28442c = c4009uN2;
        this.f28443d = interfaceC4279zN;
        this.f28444e = interfaceC4279zN2;
    }

    public /* synthetic */ C2843Wh(InterfaceC4063vN interfaceC4063vN, C4009uN c4009uN, InterfaceC4279zN interfaceC4279zN, C4009uN c4009uN2, int i) {
        this.f28440a = i;
        this.f28443d = interfaceC4063vN;
        this.f28441b = c4009uN;
        this.f28444e = interfaceC4279zN;
        this.f28442c = c4009uN2;
    }

    public /* synthetic */ C2843Wh(InterfaceC4063vN interfaceC4063vN, InterfaceC4063vN interfaceC4063vN2, InterfaceC4063vN interfaceC4063vN3, C4009uN c4009uN, int i) {
        this.f28440a = i;
        this.f28443d = interfaceC4063vN;
        this.f28442c = interfaceC4063vN2;
        this.f28444e = interfaceC4063vN3;
        this.f28441b = c4009uN;
    }

    public /* synthetic */ C2843Wh(InterfaceC4063vN interfaceC4063vN, InterfaceC4279zN interfaceC4279zN, InterfaceC4279zN interfaceC4279zN2, InterfaceC4279zN interfaceC4279zN3, int i) {
        this.f28440a = i;
        this.f28443d = interfaceC4063vN;
        this.f28441b = interfaceC4279zN;
        this.f28442c = interfaceC4279zN2;
        this.f28444e = interfaceC4279zN3;
    }
}
