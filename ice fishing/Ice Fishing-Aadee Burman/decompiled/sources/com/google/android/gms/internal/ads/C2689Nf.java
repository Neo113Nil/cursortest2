package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Nf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2689Nf implements InterfaceC3297hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26505a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f26506b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC3511lN f26507c;

    public /* synthetic */ C2689Nf(Object obj, InterfaceC3511lN interfaceC3511lN, int i) {
        this.f26505a = i;
        this.f26506b = obj;
        this.f26507c = interfaceC3511lN;
    }

    public S0.e a() {
        return new S0.e(17, new C2665Lp(((C3040ci) this.f26506b).f29536b.a()), (RD) ((C3243gN) this.f26507c).f());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3511lN
    public final Object f() {
        View view;
        switch (this.f26505a) {
            case 0:
                Context context = (Context) ((C3351iN) this.f26506b).f31039a;
                C2553Ff c2553Ff = (C2553Ff) this.f26507c;
                return new C2672Mf(context, new C2991bm(12, (T2.a) c2553Ff.f24814c.f31039a, (C2519Df) c2553Ff.f24813b.f()));
            case 1:
                return new S0.c(13, ((C3403jN) this.f26506b).f(), ((C3403jN) this.f26507c).f());
            case 2:
                return new C2726Pi(((C2676Mj) this.f26506b).a(), ((C2888Zh) this.f26507c).a());
            case 3:
                return ((C2570Gf) this.f26506b).x(((C3565mN) this.f26507c).f());
            case 4:
                return new Qr(((C2536Ef) this.f26506b).c(), ((Integer) q2.r.f40204e.f40207c.a(AbstractC3569ma.Td)).intValue(), (ScheduledExecutorService) ((C3243gN) this.f26507c).f());
            case 5:
                return new Qr(new Lr(2, ((C2510Cn) this.f26506b).f24227b.a()), ((Integer) q2.r.f40204e.f40207c.a(AbstractC3569ma.Yd)).intValue(), (ScheduledExecutorService) ((C3243gN) this.f26507c).f());
            case 6:
                return new Qr(((C2536Ef) this.f26506b).e(), ((Integer) q2.r.f40204e.f40207c.a(AbstractC3569ma.Ud)).intValue(), (ScheduledExecutorService) ((C3243gN) this.f26507c).f());
            case 7:
                Boolean bool = (Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f31985B6);
                bool.booleanValue();
                return true == bool.booleanValue() ? ((C3578mj) this.f26506b).c() : ((C2933ai) this.f26507c).a();
            case 8:
                return new C4063vj((InterfaceC4061vh) ((C3740pj) this.f26506b).f33119b.f25045x, (Executor) ((C3243gN) this.f26507c).f());
            case 9:
                String str = (String) ((C3243gN) this.f26507c).f();
                C3585mq c3585mq = ((C3687ok) this.f26506b).f32937f;
                return c3585mq != null ? c3585mq : new C3585mq(str);
            case 10:
                ((C2987bi) this.f26507c).a();
                Context context2 = ((C3687ok) this.f26506b).f32932a;
                AbstractC3341iD.j(context2);
                return context2;
            case 11:
                Set f3 = ((C3565mN) this.f26507c).f();
                C3849rl c3849rl = (C3849rl) this.f26506b;
                if (c3849rl.f33719p == null) {
                    c3849rl.f33719p = new C4118wk(f3);
                }
                C4118wk c4118wk = c3849rl.f33719p;
                AbstractC3341iD.j(c4118wk);
                return c4118wk;
            case 12:
                return new C2678Ml((C2680Mn) ((C3243gN) this.f26506b).f(), ((C2676Mj) this.f26507c).f26322b.s());
            case 13:
                St a9 = ((C2676Mj) this.f26506b).a();
                JSONObject jSONObject = (JSONObject) ((C3313hm) this.f26507c).f30929b.f25042u;
                AbstractC3341iD.j(jSONObject);
                return new C4066vm(a9, jSONObject);
            case 14:
                return new C2491Bl(new C4229yn(((C3527lm) this.f26506b).f31846b.a()), (Executor) ((C3243gN) this.f26507c).f());
            case 15:
                u2.r rVar = (u2.r) ((InterfaceC3511lN) this.f26506b).f();
                T2.a aVar = (T2.a) ((C3243gN) this.f26507c).f();
                C3360ig c3360ig = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig);
                return new C2829Vm(rVar, aVar, c3360ig);
            case 16:
                C3360ig c3360ig2 = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig2);
                return new C3481ku(9, c3360ig2, ((C3850rm) this.f26506b).a(), (C2993bo) ((C3243gN) this.f26507c).f());
            case 17:
                C3797qm c3797qm = (C3797qm) ((Yr) this.f26506b).f();
                C4012um a10 = ((C4008ui) this.f26507c).a();
                ViewTreeObserverOnGlobalLayoutListenerC3420jn viewTreeObserverOnGlobalLayoutListenerC3420jn = new ViewTreeObserverOnGlobalLayoutListenerC3420jn("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
                synchronized (a10) {
                    view = a10.f34577o;
                }
                viewTreeObserverOnGlobalLayoutListenerC3420jn.f31314n = view;
                viewTreeObserverOnGlobalLayoutListenerC3420jn.f31315u = a10.r();
                viewTreeObserverOnGlobalLayoutListenerC3420jn.f31316v = c3797qm;
                viewTreeObserverOnGlobalLayoutListenerC3420jn.f31317w = false;
                viewTreeObserverOnGlobalLayoutListenerC3420jn.f31318x = false;
                if (a10.h() != null) {
                    a10.h().j1(viewTreeObserverOnGlobalLayoutListenerC3420jn);
                }
                return viewTreeObserverOnGlobalLayoutListenerC3420jn;
            case 18:
                return new C2748Qn(C3481ku.d(((C3040ci) this.f26506b).f29536b.a()), (C2731Pn) ((C3243gN) this.f26507c).f());
            case 19:
                return new C2830Vn((C3068d9) ((C3243gN) this.f26506b).f(), ((C3403jN) this.f26507c).f());
            case 20:
                return new BinderC3852ro((C3685oi) ((C3351iN) this.f26506b).f31039a, new C3657o7(22, (C3894sc) ((C3094di) this.f26507c).f29822b.f31039a));
            case 21:
                C3360ig c3360ig3 = AbstractC3413jg.f31269b;
                AbstractC3341iD.j(c3360ig3);
                C3360ig c3360ig4 = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig4);
                return new C2570Gf(c3360ig3, c3360ig4, new C3692op((Context) ((C2894Zn) this.f26506b).f28962b.f(), c3360ig4, 0), C3243gN.b((C2709Oi) this.f26507c), 16);
            case 22:
                C3457kN c3457kN = (C3457kN) this.f26506b;
                C3360ig c3360ig5 = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig5);
                return new C4123wp(c3457kN.f30246a, c3360ig5, new C2936al(((C3956tk) this.f26507c).f34382b.f()));
            case 23:
                C3360ig c3360ig6 = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig6);
                return new C4274ze(11, c3360ig6, ((C3040ci) this.f26506b).a(), C3243gN.b((C2709Oi) this.f26507c));
            case 24:
                return a();
            case 25:
                return new C2682Mp(((C4225yj) this.f26506b).b(), ((C2888Zh) this.f26507c).b());
            case 26:
                return new C2716Op(((C2689Nf) this.f26506b).a(), ((C2888Zh) this.f26507c).b());
            case 27:
                C2699Np c2699Np = (C2699Np) ((C3243gN) this.f26506b).f();
                C2689Nf c2689Nf = (C2689Nf) this.f26507c;
                return new C2830Vn(c2699Np, new C2716Op(((C2689Nf) c2689Nf.f26506b).a(), ((C2888Zh) c2689Nf.f26507c).b()));
            case 28:
                C3360ig c3360ig7 = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig7);
                return new Ur(1, c3360ig7, ((C3795qk) this.f26506b).a(), ((C2888Zh) this.f26507c).a());
            default:
                C2826Vj c2826Vj = (C2826Vj) this.f26506b;
                c2826Vj.getClass();
                C3360ig c3360ig8 = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig8);
                C3052cu a11 = c2826Vj.f28230b.a();
                return new Qr(new Sr(c3360ig8, a11, 0), ((Integer) q2.r.f40204e.f40207c.a(AbstractC3569ma.Qd)).intValue(), (ScheduledExecutorService) ((C3243gN) this.f26507c).f());
        }
    }
}
