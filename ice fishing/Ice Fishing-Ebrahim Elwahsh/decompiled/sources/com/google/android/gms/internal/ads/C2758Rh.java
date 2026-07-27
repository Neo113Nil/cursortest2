package com.google.android.gms.internal.ads;

import X.InterfaceC0406f;
import android.content.Context;
import android.webkit.CookieManager;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import p2.C4856a;

/* renamed from: com.google.android.gms.internal.ads.Rh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2758Rh implements InterfaceC4063vN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27397a;

    /* renamed from: b, reason: collision with root package name */
    public final C4009uN f27398b;

    /* renamed from: c, reason: collision with root package name */
    public final C4009uN f27399c;

    public /* synthetic */ C2758Rh(C4009uN c4009uN, C4009uN c4009uN2, int i) {
        this.f27397a = i;
        this.f27398b = c4009uN;
        this.f27399c = c4009uN2;
    }

    public C3331hr a() {
        return new C3331hr((C3922sr) this.f27398b.d(), (C2781Sn) this.f27399c.d());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4279zN
    public final Object d() {
        C3157eg c3157eg;
        switch (this.f27397a) {
            case 0:
                return new C2741Qh((C2690Nh) this.f27398b.d(), (C3165eo) this.f27399c.d());
            case 1:
                return new C2775Sh((ScheduledExecutorService) this.f27399c.d());
            case 2:
                return ((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31428E3)).booleanValue() ? new C3348i7((InterfaceC3240g7) this.f27399c.d()) : new C3348i7((InterfaceC3240g7) this.f27398b.d());
            case 3:
                C3617n8 c3617n8 = (C3617n8) this.f27398b.d();
                C3045cd c3045cd = (C3045cd) this.f27399c.d();
                C3151ea c3151ea = AbstractC3368ia.H6;
                q2.r rVar = q2.r.f40116e;
                if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
                    c3157eg = AbstractC3212fg.f30740c;
                } else {
                    c3157eg = ((Boolean) rVar.f40119c.a(AbstractC3368ia.f31449G6)).booleanValue() ? AbstractC3212fg.f30738a : AbstractC3212fg.f30743f;
                }
                AbstractC3137eE.h(c3157eg);
                return new C2827Vi(c3617n8.f32836c, c3045cd, c3157eg);
            case 4:
                C2895Zi c2895Zi = (C2895Zi) this.f27398b.d();
                C3157eg c3157eg2 = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg2);
                Set singleton = ((JSONObject) this.f27399c.d()) == null ? Collections.EMPTY_SET : Collections.singleton(new C2473Al(c2895Zi, c3157eg2));
                AbstractC3137eE.h(singleton);
                return singleton;
            case 5:
                C2895Zi c2895Zi2 = (C2895Zi) this.f27398b.d();
                C3157eg c3157eg3 = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg3);
                Set singleton2 = ((JSONObject) this.f27399c.d()) == null ? Collections.EMPTY_SET : Collections.singleton(new C2473Al(c2895Zi2, c3157eg3));
                AbstractC3137eE.h(singleton2);
                return singleton2;
            case 6:
                C2895Zi c2895Zi3 = (C2895Zi) this.f27398b.d();
                C3157eg c3157eg4 = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg4);
                Set singleton3 = ((JSONObject) this.f27399c.d()) == null ? Collections.EMPTY_SET : Collections.singleton(new C2473Al(c2895Zi3, c3157eg4));
                AbstractC3137eE.h(singleton3);
                return singleton3;
            case 7:
                C2895Zi c2895Zi4 = (C2895Zi) this.f27398b.d();
                C3157eg c3157eg5 = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg5);
                Set singleton4 = ((JSONObject) this.f27399c.d()) == null ? Collections.EMPTY_SET : Collections.singleton(new C2473Al(c2895Zi4, c3157eg5));
                AbstractC3137eE.h(singleton4);
                return singleton4;
            case 8:
                return new C2743Qj((S2.a) this.f27398b.d(), (C2824Vf) this.f27399c.d());
            case 9:
                return new C4856a((Context) this.f27398b.d(), (InterfaceC4180xf) this.f27399c.d());
            case 10:
                return new C2473Al((C2999bl) this.f27398b.d(), (Executor) this.f27399c.d());
            case 11:
                return new C2473Al((C2999bl) this.f27398b.d(), (Executor) this.f27399c.d());
            case 12:
                return new C2473Al((C2999bl) this.f27398b.d(), (Executor) this.f27399c.d());
            case 13:
                return new C2473Al((C2999bl) this.f27398b.d(), (Executor) this.f27399c.d());
            case 14:
                return new C2473Al((C2999bl) this.f27398b.d(), (Executor) this.f27399c.d());
            case 15:
                return new C2473Al((C2999bl) this.f27398b.d(), (Executor) this.f27399c.d());
            case 16:
                return new C2473Al((C2999bl) this.f27398b.d(), (Executor) this.f27399c.d());
            case 17:
                return new C2473Al((C2999bl) this.f27398b.d(), (Executor) this.f27399c.d());
            case 18:
                return new C2745Ql((C2727Pk) this.f27398b.d(), (C4186xl) this.f27399c.d());
            case 19:
                return new C3542lo((C3381io) this.f27399c.d(), (String) this.f27398b.d());
            case 20:
                return new C2680Mo((C2527Do) this.f27398b.d(), (C2764Rn) this.f27399c.d());
            case 21:
                Ou ou = (Ou) this.f27398b.d();
                p2.j.f39798C.f39806f.getClass();
                CookieManager x3 = W3.e.x();
                Lu lu = Lu.WEBVIEW_COOKIE;
                Objects.requireNonNull(ou);
                CallableC3454k7 callableC3454k7 = new CallableC3454k7(4, x3);
                OD od = Ou.f26776d;
                List list = Collections.EMPTY_LIST;
                J3.a b9 = ou.f26777a.b(callableC3454k7);
                TimeUnit timeUnit = TimeUnit.SECONDS;
                Q8 q82 = new Q8(ou, lu, null, od, list, C3686oN.w(b9, 1L, TimeUnit.SECONDS, ou.f26778b));
                C2538Ei c2538Ei = new C2538Ei(14);
                Ou ou2 = (Ou) q82.f27124y;
                return new Q8(ou2, q82.f27121v, (String) q82.f27119n, (J3.a) q82.f27120u, (List) q82.f27122w, C3686oN.v((J3.a) q82.f27123x, Exception.class, c2538Ei, ou2.f26777a)).r();
            case 22:
                return a();
            case 23:
                J3.a aVar = (J3.a) this.f27398b.d();
                C3157eg c3157eg6 = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg6);
                return new Wr(aVar, c3157eg6, (ScheduledExecutorService) this.f27399c.d(), 0);
            case 24:
                C3157eg c3157eg7 = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg7);
                C3923ss c3923ss = new C3923ss(c3157eg7, 2);
                S2.a aVar2 = (S2.a) this.f27398b.d();
                AbstractC3137eE.h(c3157eg7);
                return new C3869rs(c3923ss, ((Long) AbstractC2496Ca.f24179f.r()).longValue(), aVar2, c3157eg7, (C3165eo) this.f27399c.d());
            case 25:
                return new Tt((S2.a) this.f27398b.d(), (C3165eo) this.f27399c.d());
            case 26:
                return new Sr((C3869rs) this.f27398b.d(), ((Integer) q2.r.f40116e.f40119c.a(AbstractC3368ia.Ld)).intValue(), (ScheduledExecutorService) this.f27399c.d());
            case 27:
                return new Sr((C3869rs) this.f27398b.d(), ((Integer) q2.r.f40116e.f40119c.a(AbstractC3368ia.yd)).intValue(), (ScheduledExecutorService) this.f27399c.d());
            case 28:
                return new Lv((Mv) this.f27398b.d(), (Gv) this.f27399c.d());
            default:
                InterfaceC0406f interfaceC0406f = (InterfaceC0406f) this.f27398b.d();
                ExecutorService executorService = AbstractC3212fg.f30744g;
                AbstractC3137eE.h(executorService);
                return new Qx(interfaceC0406f, new C4086vt(3, executorService), (C2730Pn) this.f27399c.d(), new Dr((byte) 0, 15));
        }
    }
}
