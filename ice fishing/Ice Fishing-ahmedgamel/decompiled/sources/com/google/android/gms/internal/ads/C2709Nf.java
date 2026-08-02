package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Nf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2709Nf implements InterfaceC3320hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27288a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f27289b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC3534lN f27290c;

    public /* synthetic */ C2709Nf(Object obj, InterfaceC3534lN interfaceC3534lN, int i) {
        this.f27288a = i;
        this.f27289b = obj;
        this.f27290c = interfaceC3534lN;
    }

    public S0.e a() {
        return new S0.e(20, new C2685Lp(((C3063ci) this.f27289b).f30321b.a()), (RD) ((C3266gN) this.f27290c).f());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3534lN
    public final Object f() {
        View view;
        switch (this.f27288a) {
            case 0:
                Context context = (Context) ((C3374iN) this.f27289b).f31812a;
                C2573Ff c2573Ff = (C2573Ff) this.f27290c;
                return new C2692Mf(context, new C3067cm(14, (V2.a) c2573Ff.f25603c.f31812a, (C2539Df) c2573Ff.f25602b.f()));
            case 1:
                return new S0.c(16, ((C3426jN) this.f27289b).f(), ((C3426jN) this.f27290c).f());
            case 2:
                return new C2746Pi(((C2696Mj) this.f27289b).a(), ((C2911Zh) this.f27290c).a());
            case 3:
                return ((C2590Gf) this.f27289b).v(((C3588mN) this.f27290c).f());
            case 4:
                return new Qr(((C2556Ef) this.f27289b).c(), ((Integer) s2.r.f40506e.f40509c.a(AbstractC3592ma.Td)).intValue(), (ScheduledExecutorService) ((C3266gN) this.f27290c).f());
            case 5:
                return new Qr(new Lr(2, ((C2547Dn) this.f27289b).f25213b.a()), ((Integer) s2.r.f40506e.f40509c.a(AbstractC3592ma.Yd)).intValue(), (ScheduledExecutorService) ((C3266gN) this.f27290c).f());
            case 6:
                return new Qr(((C2556Ef) this.f27289b).e(), ((Integer) s2.r.f40506e.f40509c.a(AbstractC3592ma.Ud)).intValue(), (ScheduledExecutorService) ((C3266gN) this.f27290c).f());
            case 7:
                Boolean bool = (Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32765B6);
                bool.booleanValue();
                return true == bool.booleanValue() ? ((C3601mj) this.f27289b).c() : ((C2956ai) this.f27290c).a();
            case 8:
                return new C4086vj((InterfaceC4084vh) ((C3763pj) this.f27289b).f33908b.f25833x, (Executor) ((C3266gN) this.f27290c).f());
            case 9:
                String str = (String) ((C3266gN) this.f27290c).f();
                C3608mq c3608mq = ((C3710ok) this.f27289b).f33723f;
                return c3608mq != null ? c3608mq : new C3608mq(str);
            case 10:
                ((C3010bi) this.f27290c).a();
                Context context2 = ((C3710ok) this.f27289b).f33718a;
                AbstractC3364iD.j(context2);
                return context2;
            case 11:
                Set f2 = ((C3588mN) this.f27290c).f();
                C3872rl c3872rl = (C3872rl) this.f27289b;
                if (c3872rl.f34491p == null) {
                    c3872rl.f34491p = new C4141wk(f2);
                }
                C4141wk c4141wk = c3872rl.f34491p;
                AbstractC3364iD.j(c4141wk);
                return c4141wk;
            case 12:
                return new C2715Nl((C2717Nn) ((C3266gN) this.f27289b).f(), ((C2696Mj) this.f27290c).f27111b.r());
            case 13:
                St a9 = ((C2696Mj) this.f27289b).a();
                JSONObject jSONObject = (JSONObject) ((C3389im) this.f27290c).f31886b.f25830u;
                AbstractC3364iD.j(jSONObject);
                return new C4143wm(a9, jSONObject);
            case 14:
                return new C2528Cl(new C4306zn(((C3604mm) this.f27289b).f33356b.a()), (Executor) ((C3266gN) this.f27290c).f());
            case 15:
                w2.r rVar = (w2.r) ((InterfaceC3534lN) this.f27289b).f();
                V2.a aVar = (V2.a) ((C3266gN) this.f27290c).f();
                C3383ig c3383ig = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig);
                return new C2868Wm(rVar, aVar, c3383ig);
            case 16:
                C3383ig c3383ig2 = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig2);
                return new C3504ku(9, c3383ig2, ((C3927sm) this.f27289b).a(), (C3069co) ((C3266gN) this.f27290c).f());
            case 17:
                C3873rm c3873rm = (C3873rm) ((Yr) this.f27289b).f();
                C4089vm a10 = ((C4031ui) this.f27290c).a();
                ViewTreeObserverOnGlobalLayoutListenerC3497kn viewTreeObserverOnGlobalLayoutListenerC3497kn = new ViewTreeObserverOnGlobalLayoutListenerC3497kn("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
                synchronized (a10) {
                    view = a10.f35498o;
                }
                viewTreeObserverOnGlobalLayoutListenerC3497kn.f32404n = view;
                viewTreeObserverOnGlobalLayoutListenerC3497kn.f32405u = a10.r();
                viewTreeObserverOnGlobalLayoutListenerC3497kn.f32406v = c3873rm;
                viewTreeObserverOnGlobalLayoutListenerC3497kn.f32407w = false;
                viewTreeObserverOnGlobalLayoutListenerC3497kn.f32408x = false;
                if (a10.h() != null) {
                    a10.h().j1(viewTreeObserverOnGlobalLayoutListenerC3497kn);
                }
                return viewTreeObserverOnGlobalLayoutListenerC3497kn;
            case 18:
                return new C2785Rn(C3504ku.d(((C3063ci) this.f27289b).f30321b.a()), (C2768Qn) ((C3266gN) this.f27290c).f());
            case 19:
                return new C2869Wn((C3091d9) ((C3266gN) this.f27289b).f(), ((C3426jN) this.f27290c).f());
            case 20:
                return new BinderC3929so((C3708oi) ((C3374iN) this.f27289b).f31812a, new C3680o7(22, (C3917sc) ((C3117di) this.f27290c).f30595b.f31812a));
            case 21:
                C3383ig c3383ig3 = AbstractC3436jg.f32056b;
                AbstractC3364iD.j(c3383ig3);
                C3383ig c3383ig4 = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig4);
                return new C2590Gf(c3383ig3, c3383ig4, new C3715op((Context) ((C2962ao) this.f27289b).f29908b.f(), c3383ig4, 0), C3266gN.b((C2729Oi) this.f27290c), 16);
            case 22:
                C3480kN c3480kN = (C3480kN) this.f27289b;
                C3383ig c3383ig5 = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig5);
                return new C4146wp(c3480kN.f31033a, c3383ig5, new C2959al(((C3979tk) this.f27290c).f35161b.f()));
            case 23:
                C3383ig c3383ig6 = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig6);
                return new C4297ze(11, c3383ig6, ((C3063ci) this.f27289b).a(), C3266gN.b((C2729Oi) this.f27290c));
            case 24:
                return a();
            case 25:
                return new C2702Mp(((C4248yj) this.f27289b).b(), ((C2911Zh) this.f27290c).b());
            case 26:
                return new C2736Op(((C2709Nf) this.f27289b).a(), ((C2911Zh) this.f27290c).b());
            case 27:
                C2719Np c2719Np = (C2719Np) ((C3266gN) this.f27289b).f();
                C2709Nf c2709Nf = (C2709Nf) this.f27290c;
                return new C2869Wn(c2719Np, new C2736Op(((C2709Nf) c2709Nf.f27289b).a(), ((C2911Zh) c2709Nf.f27290c).b()));
            case 28:
                C3383ig c3383ig7 = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig7);
                return new Ur(1, c3383ig7, ((C3818qk) this.f27289b).a(), ((C2911Zh) this.f27290c).a());
            default:
                C2849Vj c2849Vj = (C2849Vj) this.f27289b;
                c2849Vj.getClass();
                C3383ig c3383ig8 = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig8);
                C3075cu a11 = c2849Vj.f29027b.a();
                return new Qr(new Sr(c3383ig8, a11, 0), ((Integer) s2.r.f40506e.f40509c.a(AbstractC3592ma.Qd)).intValue(), (ScheduledExecutorService) ((C3266gN) this.f27290c).f());
        }
    }
}
