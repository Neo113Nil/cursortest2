package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Kf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2637Kf implements InterfaceC4063vN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25994a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f25995b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC4279zN f25996c;

    public /* synthetic */ C2637Kf(Object obj, InterfaceC4279zN interfaceC4279zN, int i) {
        this.f25994a = i;
        this.f25995b = obj;
        this.f25996c = interfaceC4279zN;
    }

    public C2593Hm a() {
        return new C2593Hm(8, new C2715Op(((C2877Yh) this.f25995b).f28846b.a()), (SD) ((C4009uN) this.f25996c).d());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4279zN
    public final Object d() {
        View view;
        switch (this.f25994a) {
            case 0:
                Context context = (Context) ((C4117wN) this.f25995b).f34977a;
                C2501Cf c2501Cf = (C2501Cf) this.f25996c;
                return new C2620Jf(context, new C2881Yl(18, (S2.a) c2501Cf.f24239c.f34977a, (C2467Af) c2501Cf.f24238b.d()));
            case 1:
                return new C4237yi(((C4171xN) this.f25995b).d(), ((C4171xN) this.f25996c).d());
            case 2:
                return new C2691Ni(((C2675Mj) this.f25995b).a(), ((C2826Vh) this.f25996c).a());
            case 3:
                return ((C2518Df) this.f25995b).x(((AN) this.f25996c).d());
            case 4:
                return new Sr(((C2484Bf) this.f25995b).c(), ((Integer) q2.r.f40116e.f40119c.a(AbstractC3368ia.Td)).intValue(), (ScheduledExecutorService) ((C4009uN) this.f25996c).d());
            case 5:
                return new Sr(new Or(2, ((C2543En) this.f25995b).f24821b.a()), ((Integer) q2.r.f40116e.f40119c.a(AbstractC3368ia.Yd)).intValue(), (ScheduledExecutorService) ((C4009uN) this.f25996c).d());
            case 6:
                return new Sr(((C2484Bf) this.f25995b).f(), ((Integer) q2.r.f40116e.f40119c.a(AbstractC3368ia.Ud)).intValue(), (ScheduledExecutorService) ((C4009uN) this.f25996c).d());
            case 7:
                Boolean bool = (Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31407B6);
                bool.booleanValue();
                return true == bool.booleanValue() ? ((C3483kj) this.f25995b).c() : ((C2843Wh) this.f25996c).a();
            case 8:
                return new C4022uj((InterfaceC3858rh) ((C3699oj) this.f25995b).f33186b.f24456x, (Executor) ((C4009uN) this.f25996c).d());
            case 9:
                String str = (String) ((C4009uN) this.f25996c).d();
                C3706oq c3706oq = ((C3646nk) this.f25995b).f32995f;
                return c3706oq != null ? c3706oq : new C3706oq(str);
            case 10:
                ((C2860Xh) this.f25996c).a();
                Context context2 = ((C3646nk) this.f25995b).f32990a;
                AbstractC3137eE.h(context2);
                return context2;
            case 11:
                Set d2 = ((AN) this.f25996c).d();
                C3809ql c3809ql = (C3809ql) this.f25995b;
                if (c3809ql.f33870p == null) {
                    c3809ql.f33870p = new C4077vk(d2);
                }
                C4077vk c4077vk = c3809ql.f33870p;
                AbstractC3137eE.h(c4077vk);
                return c4077vk;
            case 12:
                return new C2643Kl((C2713On) ((C4009uN) this.f25995b).d(), ((C2675Mj) this.f25996c).f26371b.u());
            case 13:
                Ut a9 = ((C2675Mj) this.f25995b).a();
                JSONObject jSONObject = (JSONObject) ((C3218fm) this.f25996c).f30881b.f24453u;
                AbstractC3137eE.h(jSONObject);
                return new C3971tm(a9, jSONObject);
            case 14:
                return new C2473Al(new C4296zn(((C3379im) this.f25995b).f31997b.a()), (Executor) ((C4009uN) this.f25996c).d());
            case 15:
                t2.s sVar = (t2.s) ((InterfaceC4279zN) this.f25995b).d();
                S2.a aVar = (S2.a) ((C4009uN) this.f25996c).d();
                C3157eg c3157eg = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg);
                return new C2797Tm(sVar, aVar, c3157eg);
            case 16:
                C3157eg c3157eg2 = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg2);
                return new C3602mu(c3157eg2, ((C3001bn) this.f25995b).d(), (C3002bo) ((C4009uN) this.f25996c).d(), 9);
            case 17:
                C3648nm c3648nm = (C3648nm) ((C3006bs) this.f25995b).d();
                C3917sm a10 = ((C3913si) this.f25996c).a();
                ViewTreeObserverOnGlobalLayoutListenerC3433jn viewTreeObserverOnGlobalLayoutListenerC3433jn = new ViewTreeObserverOnGlobalLayoutListenerC3433jn("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
                synchronized (a10) {
                    view = a10.f34288o;
                }
                viewTreeObserverOnGlobalLayoutListenerC3433jn.f32193n = view;
                viewTreeObserverOnGlobalLayoutListenerC3433jn.f32194u = a10.r();
                viewTreeObserverOnGlobalLayoutListenerC3433jn.f32195v = c3648nm;
                viewTreeObserverOnGlobalLayoutListenerC3433jn.f32196w = false;
                viewTreeObserverOnGlobalLayoutListenerC3433jn.f32197x = false;
                if (a10.h() != null) {
                    a10.h().c0(viewTreeObserverOnGlobalLayoutListenerC3433jn);
                }
                return viewTreeObserverOnGlobalLayoutListenerC3433jn;
            case 18:
                return new C2781Sn(C3602mu.e(((C2877Yh) this.f25995b).f28846b.a()), (C2764Rn) ((C4009uN) this.f25996c).d());
            case 19:
                return new C2866Xn((C2914a9) ((C4009uN) this.f25995b).d(), ((C4171xN) this.f25996c).d());
            case 20:
                return new BinderC3973to((C3536li) ((C4117wN) this.f25995b).f34977a, new C3562m7(21, (C3584mc) ((C2996bi) this.f25996c).f29551b.f34977a));
            case 21:
                C3157eg c3157eg3 = AbstractC3212fg.f30739b;
                AbstractC3137eE.h(c3157eg3);
                C3157eg c3157eg4 = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg4);
                return new C2518Df(c3157eg3, c3157eg4, new C3866rp((Context) ((C3220fo) this.f25995b).f30888b.d(), c3157eg4, 0), C4009uN.b((C4184xj) this.f25996c), 16);
            case 22:
                C4225yN c4225yN = (C4225yN) this.f25995b;
                C3157eg c3157eg5 = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg5);
                return new C4298zp(c4225yN.f34408a, c3157eg5, new C2897Zk(((C3861rk) this.f25996c).f34102b.d()));
            case 23:
                C3157eg c3157eg6 = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg6);
                return new C4017ue(c3157eg6, ((C2877Yh) this.f25995b).a(), C4009uN.b((C4184xj) this.f25996c), 11);
            case 24:
                return a();
            case 25:
                return new C2732Pp(((C4184xj) this.f25995b).b(), ((C2826Vh) this.f25996c).b());
            case 26:
                return new C2766Rp(((C2637Kf) this.f25995b).a(), ((C2826Vh) this.f25996c).b());
            case 27:
                C2749Qp c2749Qp = (C2749Qp) ((C4009uN) this.f25995b).d();
                C2637Kf c2637Kf = (C2637Kf) this.f25996c;
                return new C2866Xn(c2749Qp, new C2766Rp(((C2637Kf) c2637Kf.f25995b).a(), ((C2826Vh) c2637Kf.f25996c).b()));
            case 28:
                C3157eg c3157eg7 = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg7);
                return new Wr(c3157eg7, ((C3700ok) this.f25995b).a(), ((C2826Vh) this.f25996c).a(), 1);
            default:
                C2828Vj c2828Vj = (C2828Vj) this.f25995b;
                c2828Vj.getClass();
                C3157eg c3157eg8 = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg8);
                C3226fu a11 = c2828Vj.f28290b.a();
                return new Sr(new Ur(c3157eg8, a11, 0), ((Integer) q2.r.f40116e.f40119c.a(AbstractC3368ia.Qd)).intValue(), (ScheduledExecutorService) ((C4009uN) this.f25996c).d());
        }
    }
}
