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
import p2.C4835j;
import u2.C5069B;
import v2.C5110a;

/* renamed from: com.google.android.gms.internal.ads.Ef, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2536Ef implements InterfaceC3297hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24633a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC3511lN f24634b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC3511lN f24635c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC3511lN f24636d;

    public /* synthetic */ C2536Ef(InterfaceC3511lN interfaceC3511lN, InterfaceC3511lN interfaceC3511lN2, InterfaceC3511lN interfaceC3511lN3, int i) {
        this.f24633a = i;
        this.f24634b = interfaceC3511lN;
        this.f24635c = interfaceC3511lN2;
        this.f24636d = interfaceC3511lN3;
    }

    public C3864s a() {
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) ((C3243gN) this.f24634b).f();
        C3360ig c3360ig = AbstractC3413jg.f31268a;
        AbstractC3341iD.j(c3360ig);
        C3360ig c3360ig2 = AbstractC3413jg.f31269b;
        AbstractC3341iD.j(c3360ig2);
        Context a9 = ((C3040ci) this.f24635c).f29536b.a();
        AbstractC3341iD.j(c3360ig);
        return new C3864s(scheduledExecutorService, c3360ig, c3360ig2, new C3692op(a9, c3360ig, 1), C3243gN.b((C2709Oi) this.f24636d), 4);
    }

    public C2570Gf b() {
        C3360ig c3360ig = AbstractC3413jg.f31268a;
        AbstractC3341iD.j(c3360ig);
        C3045cn a9 = ((C3850rm) this.f24634b).a();
        C2689Nf c2689Nf = (C2689Nf) this.f24635c;
        AbstractC3341iD.j(c3360ig);
        return new C2570Gf(c3360ig, a9, new C3481ku(9, c3360ig, ((C3850rm) c2689Nf.f26506b).a(), (C2993bo) ((C3243gN) c2689Nf.f26507c).f()), (C2993bo) ((C3243gN) this.f24636d).f(), 13);
    }

    public Or c() {
        C3360ig c3360ig = AbstractC3413jg.f31268a;
        AbstractC3341iD.j(c3360ig);
        return new Or(c3360ig, (Object) ((C2987bi) this.f24634b).a(), (Object) ((C3795qk) this.f24635c).a(), ((Ux) ((C4008ui) this.f24636d).f34561b).f28050u, 0);
    }

    public Or d() {
        C3360ig c3360ig = AbstractC3413jg.f31268a;
        AbstractC3341iD.j(c3360ig);
        return new Or(c3360ig, ((C3243gN) this.f24634b).f(), (Object) ((C3795qk) this.f24635c).a(), this.f24636d.f(), 3);
    }

    public Or e() {
        C3360ig c3360ig = AbstractC3413jg.f31268a;
        AbstractC3341iD.j(c3360ig);
        return new Or((Object) c3360ig, ((Ux) ((C4008ui) this.f24634b).f34561b).f28050u, ((C3243gN) this.f24635c).f(), (Object) ((C3565mN) this.f24636d).f(), 4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3511lN
    public final Object f() {
        String bigInteger;
        Set set;
        switch (this.f24633a) {
            case 0:
                C5069B c5069b = (C5069B) ((C3351iN) this.f24635c).f31039a;
                return new C2519Df(c5069b);
            case 1:
                C5110a b9 = ((C2987bi) this.f24634b).b();
                JSONObject jSONObject = (JSONObject) ((C3243gN) this.f24635c).f();
                String str = (String) ((InterfaceC3297hN) this.f24636d).f();
                boolean equals = com.anythink.expressad.foundation.g.a.f.f19119a.equals(str);
                u2.D d2 = C4835j.f39733C.f39738c;
                return new C3819r8(UUID.randomUUID().toString(), b9, str, jSONObject, equals);
            case 2:
                return new C3955tj((InterfaceC4061vh) ((C3740pj) this.f24634b).f33119b.f25045x, (C3153eo) ((C3243gN) this.f24635c).f(), ((C2676Mj) this.f24636d).a());
            case 3:
                T2.a aVar = (T2.a) ((C3243gN) this.f24634b).f();
                C3199fg a9 = ((C2888Zh) this.f24635c).a();
                String str2 = ((C3795qk) this.f24636d).a().f29626g;
                S0.c cVar = a9.f30282v;
                synchronized (cVar) {
                    bigInteger = ((BigInteger) cVar.f2775u).toString();
                    cVar.f2775u = ((BigInteger) cVar.f2775u).add(BigInteger.ONE);
                    cVar.f2776v = bigInteger;
                }
                return new C2870Yf(aVar, a9, bigInteger, str2);
            case 4:
                return new C3203fk(0, (Context) ((C3243gN) this.f24634b).f(), ((C2987bi) this.f24635c).b(), ((C3795qk) this.f24636d).a());
            case 5:
                Context context = (Context) ((C3243gN) this.f24634b).f();
                C5110a b10 = ((C2987bi) this.f24635c).b();
                St a10 = ((C2676Mj) this.f24636d).a();
                C4275zf c4275zf = a10.f27574A;
                if (c4275zf == null) {
                    return null;
                }
                Wt wt = a10.f27640s;
                return new C4221yf(context, b10, c4275zf, wt != null ? wt.f28427b : null);
            case 6:
                C4280zk c4280zk = new C4280zk(((C3956tk) this.f24634b).f34382b.f());
                Set f3 = ((C3565mN) this.f24635c).f();
                C3360ig c3360ig = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig);
                return new C2473Ak(c4280zk, f3, c3360ig, (ScheduledExecutorService) ((C3243gN) this.f24636d).f());
            case 7:
                return new C2779Sk(((C3565mN) this.f24634b).f(), ((C2676Mj) this.f24635c).a(), ((C2676Mj) this.f24636d).b());
            case 8:
                return new C2508Cl((Context) ((C3243gN) this.f24634b).f(), ((C3565mN) this.f24635c).f(), ((C2676Mj) this.f24636d).a());
            case 9:
                C4012um a11 = ((C4008ui) this.f24634b).a();
                C4066vm c4066vm = (C4066vm) ((C2746Ql) this.f24635c).f27063b.f();
                AbstractC3341iD.j(c4066vm);
                Executor executor = (Executor) ((C3243gN) this.f24636d).f();
                C3360ig c3360ig2 = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig2);
                return new C2730Pm(a11, c4066vm, executor, c3360ig2);
            case 10:
                return b();
            case 11:
                int i = ((C3795qk) this.f24636d).a().f29634p.f1974u;
                if (i != 0) {
                    return i + (-1) != 0 ? ((C2933ai) this.f24635c).a() : ((C2933ai) this.f24634b).a();
                }
                throw null;
            case 12:
                String str3 = ((C2739Qe) ((C2998bt) this.f24634b).f29342b.f1051v).f27035A;
                AbstractC3341iD.j(str3);
                Context a12 = ((C2987bi) this.f24635c).a();
                C3360ig c3360ig3 = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig3);
                Map f9 = ((C3403jN) this.f24636d).f();
                if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32209b6)).booleanValue()) {
                    C3068d9 c3068d9 = new C3068d9(new com.bumptech.glide.manager.p(a12, 6));
                    synchronized (c3068d9) {
                        if (c3068d9.f29716c) {
                            try {
                                Z9 z9 = c3068d9.f29715b;
                                z9.h();
                                ((C2925aa) z9.f27721u).B(str3);
                            } catch (NullPointerException e9) {
                                C4835j.f39733C.f39743h.d("AdMobClearcutLogger.modify", e9);
                            }
                        }
                    }
                    set = Collections.singleton(new C2491Bl(new C2830Vn(c3068d9, f9), c3360ig3));
                } else {
                    set = Collections.EMPTY_SET;
                }
                AbstractC3341iD.j(set);
                return set;
            case 13:
                return new C3261go((C2993bo) ((C3243gN) this.f24634b).f(), ((C3565mN) this.f24635c).f(), (T2.a) ((C3243gN) this.f24636d).f());
            case 14:
                C3360ig c3360ig4 = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig4);
                return new C3315ho(c3360ig4, (v2.l) this.f24634b.f(), ((D2.a) this.f24635c).f(), new D2.b(0), ((C2987bi) this.f24636d).a());
            case 15:
                Context a13 = ((C2987bi) this.f24634b).a();
                WeakReference weakReference = ((C2987bi) this.f24635c).f29310b.f28709d;
                AbstractC3341iD.j(weakReference);
                C2783So c2783So = (C2783So) ((C3243gN) this.f24636d).f();
                C3360ig c3360ig5 = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig5);
                return new BinderC2895Zo(a13, weakReference, c2783So, c3360ig5);
            case 16:
                return a();
            case 17:
                return c();
            case 18:
                return d();
            case 19:
                C3040ci c3040ci = (C3040ci) this.f24634b;
                C3360ig c3360ig6 = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig6);
                C3050cs c3050cs = new C3050cs(c3360ig6, c3040ci.f29536b.a(), 2);
                T2.a aVar2 = (T2.a) ((C3243gN) this.f24635c).f();
                AbstractC3341iD.j(c3360ig6);
                return new C3695os(c3050cs, ((Long) AbstractC2565Ga.f24979c.r()).longValue(), aVar2, c3360ig6, (C3153eo) ((C3243gN) this.f24636d).f());
            case 20:
                Context a14 = ((C3040ci) this.f24634b).f29536b.a();
                C3360ig c3360ig7 = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig7);
                C3050cs c3050cs2 = new C3050cs(a14, c3360ig7, 6);
                T2.a aVar3 = (T2.a) ((C3243gN) this.f24635c).f();
                AbstractC3341iD.j(c3360ig7);
                return new C3695os(c3050cs2, 2147483647L, aVar3, c3360ig7, (C3153eo) ((C3243gN) this.f24636d).f());
            case 21:
                Or a15 = ((C2480Ba) this.f24634b).a();
                T2.a aVar4 = (T2.a) ((C3243gN) this.f24635c).f();
                C3360ig c3360ig8 = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig8);
                return new C3695os(a15, ((Long) AbstractC2565Ga.f24980d.r()).longValue(), aVar4, c3360ig8, (C3153eo) ((C3243gN) this.f24636d).f());
            case 22:
                C3157es a16 = ((C2894Zn) this.f24634b).a();
                T2.a aVar5 = (T2.a) ((C3243gN) this.f24635c).f();
                C3360ig c3360ig9 = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig9);
                return new C3695os(a16, ((Long) AbstractC2565Ga.f24977a.r()).longValue(), aVar5, c3360ig9, (C3153eo) ((C3243gN) this.f24636d).f());
            case 23:
                C3157es a17 = ((C3366im) this.f24634b).a();
                T2.a aVar6 = (T2.a) ((C3243gN) this.f24635c).f();
                C3360ig c3360ig10 = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig10);
                return new C3695os(a17, 2147483647L, aVar6, c3360ig10, (C3153eo) ((C3243gN) this.f24636d).f());
            case 24:
                C3050cs b11 = ((C3040ci) this.f24634b).b();
                T2.a aVar7 = (T2.a) ((C3243gN) this.f24635c).f();
                C3360ig c3360ig11 = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig11);
                return new C3695os(b11, ((Long) AbstractC2565Ga.f24978b.r()).longValue(), aVar7, c3360ig11, (C3153eo) ((C3243gN) this.f24636d).f());
            case 25:
                C3157es b12 = ((C2.G) this.f24634b).b();
                T2.a aVar8 = (T2.a) ((C3243gN) this.f24635c).f();
                C3360ig c3360ig12 = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig12);
                return new C3695os(b12, ((Long) AbstractC2565Ga.f24981e.r()).longValue(), aVar8, c3360ig12, (C3153eo) ((C3243gN) this.f24636d).f());
            case 26:
                Or d9 = ((Hs) this.f24634b).d();
                T2.a aVar9 = (T2.a) ((C3243gN) this.f24635c).f();
                C3360ig c3360ig13 = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig13);
                return new C3695os(d9, ((Long) AbstractC2565Ga.f24983g.r()).longValue(), aVar9, c3360ig13, (C3153eo) ((C3243gN) this.f24636d).f());
            case 27:
                C3050cs d10 = ((C3040ci) this.f24634b).d();
                T2.a aVar10 = (T2.a) ((C3243gN) this.f24635c).f();
                C3360ig c3360ig14 = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig14);
                return new C3695os(d10, ((Long) AbstractC2565Ga.f24984h.r()).longValue(), aVar10, c3360ig14, (C3153eo) ((C3243gN) this.f24636d).f());
            case 28:
                return e();
            default:
                C3360ig c3360ig15 = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig15);
                return new Or((Object) c3360ig15, (Object) ((C3795qk) this.f24634b).a(), ((C3243gN) this.f24635c).f(), (Object) ((C2888Zh) this.f24636d).b(), 5);
        }
    }
}
