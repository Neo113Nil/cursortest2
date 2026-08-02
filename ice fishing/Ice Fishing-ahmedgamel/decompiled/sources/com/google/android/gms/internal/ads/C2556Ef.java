package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.math.BigInteger;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;
import r2.C4906k;
import w2.C5140B;
import x2.C5189a;

/* renamed from: com.google.android.gms.internal.ads.Ef, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2556Ef implements InterfaceC3320hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25386a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC3534lN f25387b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC3534lN f25388c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC3534lN f25389d;

    public /* synthetic */ C2556Ef(InterfaceC3534lN interfaceC3534lN, InterfaceC3534lN interfaceC3534lN2, InterfaceC3534lN interfaceC3534lN3, int i) {
        this.f25386a = i;
        this.f25387b = interfaceC3534lN;
        this.f25388c = interfaceC3534lN2;
        this.f25389d = interfaceC3534lN3;
    }

    public C3887s a() {
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) ((C3266gN) this.f25387b).f();
        C3383ig c3383ig = AbstractC3436jg.f32055a;
        AbstractC3364iD.j(c3383ig);
        C3383ig c3383ig2 = AbstractC3436jg.f32056b;
        AbstractC3364iD.j(c3383ig2);
        Context a9 = ((C3063ci) this.f25388c).f30321b.a();
        AbstractC3364iD.j(c3383ig);
        return new C3887s(scheduledExecutorService, c3383ig, c3383ig2, new C3715op(a9, c3383ig, 1), C3266gN.b((C2729Oi) this.f25389d), 4);
    }

    public C2590Gf b() {
        C3383ig c3383ig = AbstractC3436jg.f32055a;
        AbstractC3364iD.j(c3383ig);
        C3122dn a9 = ((C3927sm) this.f25387b).a();
        C2709Nf c2709Nf = (C2709Nf) this.f25388c;
        AbstractC3364iD.j(c3383ig);
        return new C2590Gf(c3383ig, a9, new C3504ku(9, c3383ig, ((C3927sm) c2709Nf.f27289b).a(), (C3069co) ((C3266gN) c2709Nf.f27290c).f()), (C3069co) ((C3266gN) this.f25389d).f(), 13);
    }

    public Or c() {
        C3383ig c3383ig = AbstractC3436jg.f32055a;
        AbstractC3364iD.j(c3383ig);
        return new Or(c3383ig, (Object) ((C3010bi) this.f25387b).a(), (Object) ((C3818qk) this.f25388c).a(), ((Ux) ((C4031ui) this.f25389d).f35333b).f28847u, 0);
    }

    public Or d() {
        C3383ig c3383ig = AbstractC3436jg.f32055a;
        AbstractC3364iD.j(c3383ig);
        return new Or(c3383ig, ((C3266gN) this.f25387b).f(), (Object) ((C3818qk) this.f25388c).a(), this.f25389d.f(), 3);
    }

    public Or e() {
        C3383ig c3383ig = AbstractC3436jg.f32055a;
        AbstractC3364iD.j(c3383ig);
        return new Or((Object) c3383ig, ((Ux) ((C4031ui) this.f25387b).f35333b).f28847u, ((C3266gN) this.f25388c).f(), (Object) ((C3588mN) this.f25389d).f(), 4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3534lN
    public final Object f() {
        String bigInteger;
        Set set;
        switch (this.f25386a) {
            case 0:
                C5140B c5140b = (C5140B) ((C3374iN) this.f25388c).f31812a;
                return new C2539Df(c5140b);
            case 1:
                C5189a b9 = ((C3010bi) this.f25387b).b();
                JSONObject jSONObject = (JSONObject) ((C3266gN) this.f25388c).f();
                String str = (String) ((InterfaceC3320hN) this.f25389d).f();
                boolean equals = com.anythink.expressad.foundation.g.a.f.f19906a.equals(str);
                w2.D d9 = C4906k.f40186C.f40191c;
                return new C3842r8(UUID.randomUUID().toString(), b9, str, jSONObject, equals);
            case 2:
                return new C3978tj((InterfaceC4084vh) ((C3763pj) this.f25387b).f33908b.f25833x, (C3230fo) ((C3266gN) this.f25388c).f(), ((C2696Mj) this.f25389d).a());
            case 3:
                V2.a aVar = (V2.a) ((C3266gN) this.f25387b).f();
                C3222fg a9 = ((C2911Zh) this.f25388c).a();
                String str2 = ((C3818qk) this.f25389d).a().f30396g;
                S0.c cVar = a9.f31070v;
                synchronized (cVar) {
                    bigInteger = ((BigInteger) cVar.f2902u).toString();
                    cVar.f2902u = ((BigInteger) cVar.f2902u).add(BigInteger.ONE);
                    cVar.f2903v = bigInteger;
                }
                return new C2893Yf(aVar, a9, bigInteger, str2);
            case 4:
                return new C3226fk(0, (Context) ((C3266gN) this.f25387b).f(), ((C3010bi) this.f25388c).b(), ((C3818qk) this.f25389d).a());
            case 5:
                Context context = (Context) ((C3266gN) this.f25387b).f();
                C5189a b10 = ((C3010bi) this.f25388c).b();
                St a10 = ((C2696Mj) this.f25389d).a();
                C4298zf c4298zf = a10.f28357A;
                if (c4298zf == null) {
                    return null;
                }
                Wt wt = a10.f28423s;
                return new C4244yf(context, b10, c4298zf, wt != null ? wt.f29209b : null);
            case 6:
                C4303zk c4303zk = new C4303zk(((C3979tk) this.f25387b).f35161b.f());
                Set f2 = ((C3588mN) this.f25388c).f();
                C3383ig c3383ig = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig);
                return new C2493Ak(c4303zk, f2, c3383ig, (ScheduledExecutorService) ((C3266gN) this.f25389d).f());
            case 7:
                return new C2799Sk(((C3588mN) this.f25387b).f(), ((C2696Mj) this.f25388c).a(), ((C2696Mj) this.f25389d).b());
            case 8:
                return new C2545Dl((Context) ((C3266gN) this.f25387b).f(), ((C3588mN) this.f25388c).f(), ((C2696Mj) this.f25389d).a());
            case 9:
                C4089vm a11 = ((C4031ui) this.f25387b).a();
                C4143wm c4143wm = (C4143wm) ((C2783Rl) this.f25388c).f28007b.f();
                AbstractC3364iD.j(c4143wm);
                Executor executor = (Executor) ((C3266gN) this.f25389d).f();
                C3383ig c3383ig2 = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig2);
                return new C2767Qm(a11, c4143wm, executor, c3383ig2);
            case 10:
                return b();
            case 11:
                int i = ((C3818qk) this.f25389d).a().f30404p.f2062u;
                if (i != 0) {
                    return i + (-1) != 0 ? ((C2956ai) this.f25388c).a() : ((C2956ai) this.f25387b).a();
                }
                throw null;
            case 12:
                String str3 = ((C2759Qe) ((C3021bt) this.f25387b).f30130b.f1304v).f27820A;
                AbstractC3364iD.j(str3);
                Context a12 = ((C3010bi) this.f25388c).a();
                C3383ig c3383ig3 = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig3);
                Map f9 = ((C3426jN) this.f25389d).f();
                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32988b6)).booleanValue()) {
                    C3091d9 c3091d9 = new C3091d9(new com.bumptech.glide.manager.o(a12, 6));
                    synchronized (c3091d9) {
                        if (c3091d9.f30488c) {
                            try {
                                Z9 z9 = c3091d9.f30487b;
                                z9.h();
                                ((C2948aa) z9.f28504u).B(str3);
                            } catch (NullPointerException e9) {
                                C4906k.f40186C.f40196h.d("AdMobClearcutLogger.modify", e9);
                            }
                        }
                    }
                    set = Collections.singleton(new C2528Cl(new C2869Wn(c3091d9, f9), c3383ig3));
                } else {
                    set = Collections.EMPTY_SET;
                }
                AbstractC3364iD.j(set);
                return set;
            case 13:
                return new C3338ho((C3069co) ((C3266gN) this.f25387b).f(), ((C3588mN) this.f25388c).f(), (V2.a) ((C3266gN) this.f25389d).f());
            case 14:
                C3383ig c3383ig4 = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig4);
                return new C3391io(c3383ig4, (x2.l) this.f25387b.f(), ((F2.a) this.f25388c).f(), new F2.b(0), ((C3010bi) this.f25389d).a());
            case 15:
                Context a13 = ((C3010bi) this.f25387b).a();
                WeakReference weakReference = ((C3010bi) this.f25388c).f30099b.f29484d;
                AbstractC3364iD.j(weakReference);
                C2820To c2820To = (C2820To) ((C3266gN) this.f25389d).f();
                C3383ig c3383ig5 = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig5);
                return new BinderC2918Zo(a13, weakReference, c2820To, c3383ig5);
            case 16:
                return a();
            case 17:
                return c();
            case 18:
                return d();
            case 19:
                C3063ci c3063ci = (C3063ci) this.f25387b;
                C3383ig c3383ig6 = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig6);
                C3073cs c3073cs = new C3073cs(c3383ig6, c3063ci.f30321b.a(), 2);
                V2.a aVar2 = (V2.a) ((C3266gN) this.f25388c).f();
                AbstractC3364iD.j(c3383ig6);
                return new C3718os(c3073cs, ((Long) AbstractC2585Ga.f25768c.r()).longValue(), aVar2, c3383ig6, (C3230fo) ((C3266gN) this.f25389d).f());
            case 20:
                Context a14 = ((C3063ci) this.f25387b).f30321b.a();
                C3383ig c3383ig7 = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig7);
                C3073cs c3073cs2 = new C3073cs(a14, c3383ig7, 6);
                V2.a aVar3 = (V2.a) ((C3266gN) this.f25388c).f();
                AbstractC3364iD.j(c3383ig7);
                return new C3718os(c3073cs2, 2147483647L, aVar3, c3383ig7, (C3230fo) ((C3266gN) this.f25389d).f());
            case 21:
                Or a15 = ((C2500Ba) this.f25387b).a();
                V2.a aVar4 = (V2.a) ((C3266gN) this.f25388c).f();
                C3383ig c3383ig8 = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig8);
                return new C3718os(a15, ((Long) AbstractC2585Ga.f25769d.r()).longValue(), aVar4, c3383ig8, (C3230fo) ((C3266gN) this.f25389d).f());
            case 22:
                C3180es a16 = ((C2962ao) this.f25387b).a();
                V2.a aVar5 = (V2.a) ((C3266gN) this.f25388c).f();
                C3383ig c3383ig9 = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig9);
                return new C3718os(a16, ((Long) AbstractC2585Ga.f25766a.r()).longValue(), aVar5, c3383ig9, (C3230fo) ((C3266gN) this.f25389d).f());
            case 23:
                C3180es a17 = ((C3442jm) this.f25387b).a();
                V2.a aVar6 = (V2.a) ((C3266gN) this.f25388c).f();
                C3383ig c3383ig10 = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig10);
                return new C3718os(a17, 2147483647L, aVar6, c3383ig10, (C3230fo) ((C3266gN) this.f25389d).f());
            case 24:
                C3073cs b11 = ((C3063ci) this.f25387b).b();
                V2.a aVar7 = (V2.a) ((C3266gN) this.f25388c).f();
                C3383ig c3383ig11 = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig11);
                return new C3718os(b11, ((Long) AbstractC2585Ga.f25767b.r()).longValue(), aVar7, c3383ig11, (C3230fo) ((C3266gN) this.f25389d).f());
            case 25:
                C3180es b12 = ((E2.F) this.f25387b).b();
                V2.a aVar8 = (V2.a) ((C3266gN) this.f25388c).f();
                C3383ig c3383ig12 = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig12);
                return new C3718os(b12, ((Long) AbstractC2585Ga.f25770e.r()).longValue(), aVar8, c3383ig12, (C3230fo) ((C3266gN) this.f25389d).f());
            case 26:
                Or d10 = ((Hs) this.f25387b).d();
                V2.a aVar9 = (V2.a) ((C3266gN) this.f25388c).f();
                C3383ig c3383ig13 = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig13);
                return new C3718os(d10, ((Long) AbstractC2585Ga.f25772g.r()).longValue(), aVar9, c3383ig13, (C3230fo) ((C3266gN) this.f25389d).f());
            case 27:
                C3073cs d11 = ((C3063ci) this.f25387b).d();
                V2.a aVar10 = (V2.a) ((C3266gN) this.f25388c).f();
                C3383ig c3383ig14 = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig14);
                return new C3718os(d11, ((Long) AbstractC2585Ga.f25773h.r()).longValue(), aVar10, c3383ig14, (C3230fo) ((C3266gN) this.f25389d).f());
            case 28:
                return e();
            default:
                C3383ig c3383ig15 = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig15);
                return new Or((Object) c3383ig15, (Object) ((C3818qk) this.f25387b).a(), ((C3266gN) this.f25388c).f(), (Object) ((C2911Zh) this.f25389d).b(), 5);
        }
    }
}
