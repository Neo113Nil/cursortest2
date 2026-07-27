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
import u2.C5107a;

/* renamed from: com.google.android.gms.internal.ads.Bf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2484Bf implements InterfaceC4063vN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24049a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC4279zN f24050b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC4279zN f24051c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC4279zN f24052d;

    public /* synthetic */ C2484Bf(InterfaceC4279zN interfaceC4279zN, InterfaceC4279zN interfaceC4279zN2, InterfaceC4279zN interfaceC4279zN3, int i) {
        this.f24049a = i;
        this.f24050b = interfaceC4279zN;
        this.f24051c = interfaceC4279zN2;
        this.f24052d = interfaceC4279zN3;
    }

    public r a() {
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) ((C4009uN) this.f24050b).d();
        C3157eg c3157eg = AbstractC3212fg.f30738a;
        AbstractC3137eE.h(c3157eg);
        C3157eg c3157eg2 = AbstractC3212fg.f30739b;
        AbstractC3137eE.h(c3157eg2);
        Context a9 = ((C2877Yh) this.f24051c).f28846b.a();
        AbstractC3137eE.h(c3157eg);
        return new r(scheduledExecutorService, c3157eg, c3157eg2, new C3866rp(a9, c3157eg, 1), C4009uN.b((C4184xj) this.f24052d), 4);
    }

    public C2518Df b() {
        C3157eg c3157eg = AbstractC3212fg.f30738a;
        AbstractC3137eE.h(c3157eg);
        C2946an d2 = ((C3001bn) this.f24050b).d();
        C2637Kf c2637Kf = (C2637Kf) this.f24051c;
        AbstractC3137eE.h(c3157eg);
        return new C2518Df(c3157eg, d2, new C3602mu(c3157eg, ((C3001bn) c2637Kf.f25995b).d(), (C3002bo) ((C4009uN) c2637Kf.f25996c).d(), 9), (C3002bo) ((C4009uN) this.f24052d).d(), 13);
    }

    public Qr c() {
        C3157eg c3157eg = AbstractC3212fg.f30738a;
        AbstractC3137eE.h(c3157eg);
        return new Qr(c3157eg, (Object) ((C2860Xh) this.f24050b).a(), (Object) ((C3700ok) this.f24051c).a(), ((Vx) ((C3913si) this.f24052d).f34260b).f28329u, 0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4279zN
    public final Object d() {
        String bigInteger;
        Set set;
        switch (this.f24049a) {
            case 0:
                t2.E e6 = (t2.E) ((C4117wN) this.f24051c).f34977a;
                return new C2467Af(e6);
            case 1:
                C5107a b9 = ((C2860Xh) this.f24050b).b();
                JSONObject jSONObject = (JSONObject) ((C4009uN) this.f24051c).d();
                String str = (String) ((InterfaceC4063vN) this.f24052d).d();
                boolean equals = com.anythink.expressad.foundation.g.a.f.f19277a.equals(str);
                t2.G g9 = p2.j.f39798C.f39803c;
                return new C3617n8(UUID.randomUUID().toString(), b9, str, jSONObject, equals);
            case 2:
                return new C3860rj((InterfaceC3858rh) ((C3699oj) this.f24050b).f33186b.f24456x, (C3165eo) ((C4009uN) this.f24051c).d(), ((C2675Mj) this.f24052d).a());
            case 3:
                S2.a aVar = (S2.a) ((C4009uN) this.f24050b).d();
                C2994bg a9 = ((C2826Vh) this.f24051c).a();
                String str2 = ((C3700ok) this.f24052d).a().f30904g;
                C2881Yl c2881Yl = a9.f29529v;
                synchronized (c2881Yl) {
                    bigInteger = ((BigInteger) c2881Yl.f28862u).toString();
                    c2881Yl.f28862u = ((BigInteger) c2881Yl.f28862u).add(BigInteger.ONE);
                    c2881Yl.f28863v = bigInteger;
                }
                return new C2824Vf(aVar, a9, bigInteger, str2);
            case 4:
                return new C3161ek((Context) ((C4009uN) this.f24050b).d(), ((C2860Xh) this.f24051c).b(), ((C3700ok) this.f24052d).a(), 0);
            case 5:
                Context context = (Context) ((C4009uN) this.f24050b).d();
                C5107a b10 = ((C2860Xh) this.f24051c).b();
                Ut a10 = ((C2675Mj) this.f24052d).a();
                C4126wf c4126wf = a10.f28107A;
                if (c4126wf == null) {
                    return null;
                }
                Yt yt = a10.f28173s;
                return new C4072vf(context, b10, c4126wf, yt != null ? yt.f28907b : null);
            case 6:
                C4239yk c4239yk = new C4239yk(((C3861rk) this.f24050b).f34102b.d());
                Set d2 = ((AN) this.f24051c).d();
                C3157eg c3157eg = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg);
                return new C4293zk(c4239yk, d2, c3157eg, (ScheduledExecutorService) ((C4009uN) this.f24052d).d());
            case 7:
                return new C2744Qk(((AN) this.f24050b).d(), ((C2675Mj) this.f24051c).a(), ((C2675Mj) this.f24052d).b());
            case 8:
                return new C2490Bl((Context) ((C4009uN) this.f24050b).d(), ((AN) this.f24051c).d(), ((C2675Mj) this.f24052d).a());
            case 9:
                C3917sm a11 = ((C3913si) this.f24050b).a();
                C3971tm c3971tm = (C3971tm) ((C2694Nl) this.f24051c).f26598b.d();
                AbstractC3137eE.h(c3971tm);
                Executor executor = (Executor) ((C4009uN) this.f24052d).d();
                C3157eg c3157eg2 = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg2);
                return new C2712Om(a11, c3971tm, executor, c3157eg2);
            case 10:
                return b();
            case 11:
                int i = ((C3700ok) this.f24052d).a().f30912p.f1421u;
                if (i != 0) {
                    return i + (-1) != 0 ? ((C2843Wh) this.f24051c).a() : ((C2843Wh) this.f24050b).a();
                }
                throw null;
            case 12:
                String str3 = ((C2687Ne) ((C3115dt) this.f24050b).f30253b.f1195v).f26573A;
                AbstractC3137eE.h(str3);
                Context a12 = ((C2860Xh) this.f24051c).a();
                C3157eg c3157eg3 = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg3);
                Map d3 = ((C4171xN) this.f24052d).d();
                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31630b6)).booleanValue()) {
                    C2914a9 c2914a9 = new C2914a9(new com.bumptech.glide.manager.o(a12, 6));
                    synchronized (c2914a9) {
                        if (c2914a9.f29177c) {
                            try {
                                W9 w9 = c2914a9.f29176b;
                                w9.h();
                                ((X9) w9.f30000u).B(str3);
                            } catch (NullPointerException e9) {
                                p2.j.f39798C.f39808h.d("AdMobClearcutLogger.modify", e9);
                            }
                        }
                    }
                    set = Collections.singleton(new C2473Al(new C2866Xn(c2914a9, d3), c3157eg3));
                } else {
                    set = Collections.EMPTY_SET;
                }
                AbstractC3137eE.h(set);
                return set;
            case 13:
                return new C3328ho((C3002bo) ((C4009uN) this.f24050b).d(), ((AN) this.f24051c).d(), (S2.a) ((C4009uN) this.f24052d).d());
            case 14:
                C3157eg c3157eg4 = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg4);
                return new C3381io(c3157eg4, (u2.l) this.f24050b.d(), ((C2.a) this.f24051c).d(), new C2.b(), ((C2860Xh) this.f24052d).a());
            case 15:
                Context a13 = ((C2860Xh) this.f24050b).a();
                WeakReference weakReference = ((C2860Xh) this.f24051c).f28669b.f28062d;
                AbstractC3137eE.h(weakReference);
                C2799To c2799To = (C2799To) ((C4009uN) this.f24052d).d();
                C3157eg c3157eg5 = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg5);
                return new BinderC2948ap(a13, weakReference, c2799To, c3157eg5);
            case 16:
                return a();
            case 17:
                return c();
            case 18:
                return e();
            case 19:
                C2877Yh c2877Yh = (C2877Yh) this.f24050b;
                C3157eg c3157eg6 = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg6);
                C3169es c3169es = new C3169es(c3157eg6, c2877Yh.f28846b.a(), 2);
                S2.a aVar2 = (S2.a) ((C4009uN) this.f24051c).d();
                AbstractC3137eE.h(c3157eg6);
                return new C3869rs(c3169es, ((Long) AbstractC2496Ca.f24176c.r()).longValue(), aVar2, c3157eg6, (C3165eo) ((C4009uN) this.f24052d).d());
            case 20:
                Context a14 = ((C2877Yh) this.f24050b).f28846b.a();
                C3157eg c3157eg7 = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg7);
                C3169es c3169es2 = new C3169es(a14, c3157eg7, 6);
                S2.a aVar3 = (S2.a) ((C4009uN) this.f24051c).d();
                AbstractC3137eE.h(c3157eg7);
                return new C3869rs(c3169es2, 2147483647L, aVar3, c3157eg7, (C3165eo) ((C4009uN) this.f24052d).d());
            case 21:
                Qr a15 = ((C4229ya) this.f24050b).a();
                S2.a aVar4 = (S2.a) ((C4009uN) this.f24051c).d();
                C3157eg c3157eg8 = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg8);
                return new C3869rs(a15, ((Long) AbstractC2496Ca.f24177d.r()).longValue(), aVar4, c3157eg8, (C3165eo) ((C4009uN) this.f24052d).d());
            case 22:
                C3278gs a16 = ((C3220fo) this.f24050b).a();
                S2.a aVar5 = (S2.a) ((C4009uN) this.f24051c).d();
                C3157eg c3157eg9 = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg9);
                return new C3869rs(a16, ((Long) AbstractC2496Ca.f24174a.r()).longValue(), aVar5, c3157eg9, (C3165eo) ((C4009uN) this.f24052d).d());
            case 23:
                C3278gs a17 = ((C3272gm) this.f24050b).a();
                S2.a aVar6 = (S2.a) ((C4009uN) this.f24051c).d();
                C3157eg c3157eg10 = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg10);
                return new C3869rs(a17, 2147483647L, aVar6, c3157eg10, (C3165eo) ((C4009uN) this.f24052d).d());
            case 24:
                C3169es b11 = ((C2877Yh) this.f24050b).b();
                S2.a aVar7 = (S2.a) ((C4009uN) this.f24051c).d();
                C3157eg c3157eg11 = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg11);
                return new C3869rs(b11, ((Long) AbstractC2496Ca.f24175b.r()).longValue(), aVar7, c3157eg11, (C3165eo) ((C4009uN) this.f24052d).d());
            case 25:
                C3278gs b12 = ((C2941ai) this.f24050b).b();
                S2.a aVar8 = (S2.a) ((C4009uN) this.f24051c).d();
                C3157eg c3157eg12 = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg12);
                return new C3869rs(b12, ((Long) AbstractC2496Ca.f24178e.r()).longValue(), aVar8, c3157eg12, (C3165eo) ((C4009uN) this.f24052d).d());
            case 26:
                Qr e10 = ((Is) this.f24050b).e();
                S2.a aVar9 = (S2.a) ((C4009uN) this.f24051c).d();
                C3157eg c3157eg13 = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg13);
                return new C3869rs(e10, ((Long) AbstractC2496Ca.f24180g.r()).longValue(), aVar9, c3157eg13, (C3165eo) ((C4009uN) this.f24052d).d());
            case 27:
                C3169es e11 = ((C2877Yh) this.f24050b).e();
                S2.a aVar10 = (S2.a) ((C4009uN) this.f24051c).d();
                C3157eg c3157eg14 = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg14);
                return new C3869rs(e11, ((Long) AbstractC2496Ca.f24181h.r()).longValue(), aVar10, c3157eg14, (C3165eo) ((C4009uN) this.f24052d).d());
            case 28:
                return f();
            default:
                C3157eg c3157eg15 = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg15);
                return new Qr((Object) c3157eg15, (Object) ((C3700ok) this.f24050b).a(), ((C4009uN) this.f24051c).d(), (Object) ((C2826Vh) this.f24052d).b(), 5);
        }
    }

    public Qr e() {
        C3157eg c3157eg = AbstractC3212fg.f30738a;
        AbstractC3137eE.h(c3157eg);
        return new Qr(c3157eg, ((C4009uN) this.f24050b).d(), (Object) ((C3700ok) this.f24051c).a(), this.f24052d.d(), 3);
    }

    public Qr f() {
        C3157eg c3157eg = AbstractC3212fg.f30738a;
        AbstractC3137eE.h(c3157eg);
        return new Qr((Object) c3157eg, ((Vx) ((C3913si) this.f24050b).f34260b).f28329u, ((C4009uN) this.f24051c).d(), (Object) ((AN) this.f24052d).d(), 4);
    }
}
