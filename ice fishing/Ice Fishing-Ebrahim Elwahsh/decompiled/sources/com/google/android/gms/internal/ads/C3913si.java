package com.google.android.gms.internal.ads;

import O7.AbstractC0399y;
import X.C0402b;
import X.InterfaceC0406f;
import android.content.Context;
import android.widget.FrameLayout;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import org.json.JSONException;
import org.json.JSONObject;
import r7.C4985p;

/* renamed from: com.google.android.gms.internal.ads.si, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3913si implements InterfaceC4063vN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34259a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f34260b;

    public /* synthetic */ C3913si(int i, Object obj) {
        this.f34259a = i;
        this.f34260b = obj;
    }

    public static S0.s b() {
        return new S0.s(new C2837Wb(23), new C2837Wb(22), 15, false);
    }

    public C3917sm a() {
        C3917sm c3917sm = (C3917sm) ((C3562m7) this.f34260b).f32668u;
        AbstractC3137eE.h(c3917sm);
        return c3917sm;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4279zN
    public final Object d() {
        Object obj;
        int i = 8;
        int i4 = 14;
        int i9 = 13;
        int i10 = 18;
        int i11 = 11;
        int i12 = 10;
        int i13 = 1;
        int i14 = 12;
        int i15 = 9;
        Object obj2 = this.f34260b;
        switch (this.f34259a) {
            case 0:
                return b();
            case 1:
                return new C2555Fi(0, new C3550lw(((C2877Yh) obj2).f28846b.a()));
            case 2:
                C2518Df p6 = C2518Df.p(((C2877Yh) obj2).f28846b.a());
                return new C2572Gi(2, new C2881Yl(i10, (S2.a) p6.f24453u, (C2467Af) ((C4009uN) p6.f24455w).d()));
            case 3:
                return (FrameLayout) ((Vx) obj2).f28329u;
            case 4:
                return ((C3483kj) obj2).a();
            case 5:
                C2484Bf c2484Bf = (C2484Bf) obj2;
                return new C2473Al(new C3860rj((InterfaceC3858rh) ((C3699oj) c2484Bf.f24050b).f33186b.f24456x, (C3165eo) ((C4009uN) c2484Bf.f24051c).d(), ((C2675Mj) c2484Bf.f24052d).a()), AbstractC3212fg.f30738a);
            case 6:
                C2637Kf c2637Kf = (C2637Kf) obj2;
                C4022uj c4022uj = new C4022uj((InterfaceC3858rh) ((C3699oj) c2637Kf.f25995b).f33186b.f24456x, (Executor) ((C4009uN) c2637Kf.f25996c).d());
                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.be)).booleanValue()) {
                    C2473Al c2473Al = new C2473Al(c4022uj, AbstractC3212fg.f30738a);
                    int i16 = AbstractC2917aC.f29181v;
                    obj = new C2972bC(c2473Al);
                } else {
                    int i17 = AbstractC2917aC.f29181v;
                    obj = C3998uC.f34563C;
                }
                AbstractC3137eE.h(obj);
                return obj;
            case 7:
                return new C2473Al(new C3537lj(0, (C2863Xk) ((C2471Aj) obj2).f23885b.f28862u), AbstractC3212fg.f30745h);
            case 8:
                return ((C3107dk) obj2).a();
            case 9:
                C3807qj c3807qj = (C3807qj) obj2;
                return new C2488Bj(new C2535Ef(c3807qj.f33854b.a(), c3807qj.f33855c.a().f30904g));
            case 10:
                return new C2556Fj(((C4171xN) obj2).d());
            case 11:
                return ((C3323hj) obj2).a();
            case 12:
                return new C3270gk(((C2675Mj) obj2).b());
            case 13:
                C4133wm c4133wm = (C4133wm) ((C2898Zl) obj2).f29059b.f28862u;
                AbstractC3137eE.h(c4133wm);
                Set singleton = c4133wm.f35064d != null ? Collections.singleton(com.anythink.expressad.foundation.g.a.f.f19281e) : Collections.EMPTY_SET;
                AbstractC3137eE.h(singleton);
                return singleton;
            case 14:
                C3971tm c3971tm = (C3971tm) ((C2694Nl) obj2).f26598b.d();
                AbstractC3137eE.h(c3971tm);
                JSONObject jSONObject = c3971tm.f34453b;
                if (jSONObject == null) {
                    try {
                        jSONObject = new JSONObject(c3971tm.f34649a.f28187z);
                    } catch (JSONException unused) {
                        return null;
                    }
                }
                return jSONObject;
            case 15:
                BinderC3326hm binderC3326hm = new BinderC3326hm(((C3379im) obj2).f31997b.a());
                C3756pm c3756pm = new C3756pm();
                c3756pm.f33505a = binderC3326hm;
                return c3756pm;
            case 16:
                C3917sm c3917sm = (C3917sm) ((C3562m7) obj2).f32668u;
                AbstractC3137eE.h(c3917sm);
                return c3917sm;
            case 17:
                return new C2623Ji(i13, (InterfaceC3858rh) ((InterfaceC4063vN) obj2).d());
            case 18:
                return new C2473Al(new C2623Ji(i13, (InterfaceC3858rh) ((InterfaceC4063vN) ((C3913si) obj2).f34260b).d()), AbstractC3212fg.f30743f);
            case 19:
                C2758Rh c2758Rh = (C2758Rh) obj2;
                InterfaceC0406f interfaceC0406f = (InterfaceC0406f) c2758Rh.f27398b.d();
                ExecutorService executorService = AbstractC3212fg.f30744g;
                AbstractC3137eE.h(executorService);
                return new C2713On(new Qx(interfaceC0406f, new C4086vt(3, executorService), (C2730Pn) c2758Rh.f27399c.d(), new Dr((byte) 0, 15)));
            case 20:
                C3157eg c3157eg = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg);
                C2637Kf c2637Kf2 = (C2637Kf) obj2;
                Set singleton2 = ((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31630b6)).booleanValue() ? Collections.singleton(new C2473Al(new C2866Xn((C2914a9) ((C4009uN) c2637Kf2.f25995b).d(), ((C4171xN) c2637Kf2.f25996c).d()), c3157eg)) : Collections.EMPTY_SET;
                AbstractC3137eE.h(singleton2);
                return singleton2;
            case 21:
                C2941ai c2941ai = (C2941ai) obj2;
                C4244yp c4244yp = new C4244yp(c2941ai.f29263b.a(), (C2569Gf) c2941ai.f29264c.d());
                C3157eg c3157eg2 = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg2);
                return new C2473Al(c4244yp, c3157eg2);
            case 22:
                return new Rx(28, ((C2941ai) obj2).a());
            case 23:
                C2637Kf c2637Kf3 = (C2637Kf) obj2;
                C2749Qp c2749Qp = (C2749Qp) ((C4009uN) c2637Kf3.f25995b).d();
                C2637Kf c2637Kf4 = (C2637Kf) c2637Kf3.f25996c;
                C2866Xn c2866Xn = new C2866Xn(c2749Qp, new C2766Rp(((C2637Kf) c2637Kf4.f25995b).a(), ((C2826Vh) c2637Kf4.f25996c).b()));
                C3157eg c3157eg3 = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg3);
                return new C2473Al(c2866Xn, c3157eg3);
            case 24:
                return new Or(5, ((C3700ok) obj2).f33188b.f32992c);
            case 25:
                AbstractC3137eE.h(AbstractC3212fg.f30738a);
                AbstractC3137eE.h(((C2687Ne) ((C3115dt) obj2).f30253b.f1195v).f26582w);
                return new C3061ct();
            case 26:
                Context context = ((C2860Xh) obj2).f28669b.f28060b;
                AbstractC3137eE.h(context);
                ExecutorService executorService2 = AbstractC3212fg.f30744g;
                AbstractC3137eE.h(executorService2);
                C3874rx c3874rx = C3928sx.f34330a;
                T7.e b9 = AbstractC0399y.b(new O7.S(executorService2));
                return new X.D(new C3982tx(context), p8.g.k(new C0402b(C4985p.f40358n, null)), new W3.e(9), b9);
            case 27:
                Ny ny = (Ny) ((C4009uN) new C2518Df(((C3284gy) ((C3120dy) obj2).d()).f31119a).f24455w).d();
                AbstractC3137eE.h(ny);
                return ny;
            case 28:
                C3755pl c3755pl = ((C3175ey) ((C3120dy) obj2).d()).f30558a;
                C4117wN c4117wN = (C4117wN) c3755pl.f33492b;
                C4117wN c4117wN2 = (C4117wN) c3755pl.f33494d;
                C4009uN a9 = C4009uN.a(new Iz(c4117wN, c4117wN2, (C4009uN) c3755pl.f33498h, i13));
                C4009uN a10 = C4009uN.a(new C2501Cf(c4117wN, a9, i));
                C4009uN c4009uN = (C4009uN) c3755pl.i;
                C4009uN c4009uN2 = (C4009uN) c3755pl.f33493c;
                C4117wN c4117wN3 = (C4117wN) c3755pl.f33495e;
                C4009uN a11 = C4009uN.a(new C4200xz(a10, c4009uN, c4009uN2, c4117wN3, 1));
                C4009uN c4009uN3 = (C4009uN) c3755pl.f33503n;
                C4009uN a12 = C4009uN.a(new Kt(c4009uN3, i14));
                C4009uN c4009uN4 = (C4009uN) c3755pl.f33504o;
                C4009uN a13 = C4009uN.a(new C2495Bq(C4009uN.a(new C4080vn(C4009uN.a(new C3323hj(a12, c4009uN4, c4009uN, i15)), C4009uN.a(new C3323hj(C4009uN.a(new Kt(c4009uN3, i4)), c4009uN4, c4009uN, i12)), C4009uN.a(new C3323hj(C4009uN.a(new Kt(c4009uN3, 16)), c4009uN4, c4009uN, i11)), C4009uN.a(new C3323hj(C4009uN.a(new Kt(c4009uN3, i15)), c4009uN4, c4009uN, 6)), C4009uN.a(new C3323hj(C4009uN.a(new Kt(c4009uN3, i12)), c4009uN4, c4009uN, 7)), C4009uN.a(new C3323hj(C4009uN.a(new Kt(c4009uN3, i11)), c4009uN4, c4009uN, 8)), C4009uN.a(new Kt(c4009uN3, 13)), c4117wN2, c4009uN)), C4009uN.a(new C2495Bq(C4009uN.a(new C2495Bq(c4117wN, a10, c4009uN, 9)), c4117wN2, c4009uN, i11)), c4117wN3, i12));
                C4009uN a14 = C4009uN.a(new Kt(c4009uN3, 15));
                C4009uN a15 = C4009uN.a(AbstractC2720Pd.f26982G);
                Ny ny2 = (Ny) C4009uN.a(new C4200xz(C4009uN.a(new C2674Mi(a11, C4009uN.a(new Tz(c4117wN, a10, a13, c4009uN, c4117wN2, C4009uN.a(new C3323hj(a14, a15, c4009uN, 5)), a9)), a13, c4009uN, (C4009uN) c3755pl.f33496f, c4117wN3)), C4009uN.a(new C2580Gq(C4009uN.a(new Ht(c4117wN, C4009uN.a(new Iz(c4117wN, c4117wN3, (C4009uN) c3755pl.f33500k, 0)), a9, a15, c4117wN3)), a13, a11, c4009uN, c4117wN2)), a13, c4117wN3, 0)).d();
                AbstractC3137eE.h(ny2);
                return ny2;
            default:
                C3755pl c3755pl2 = ((C3338hy) ((C3120dy) obj2).d()).f31279a;
                C4009uN c4009uN5 = (C4009uN) c3755pl2.f33493c;
                C4009uN c4009uN6 = (C4009uN) c3755pl2.i;
                C4117wN c4117wN4 = (C4117wN) c3755pl2.f33495e;
                C4009uN a16 = C4009uN.a(new C2495Bq(c4009uN5, c4009uN6, c4117wN4, i14));
                C4009uN a17 = C4009uN.a(AbstractC2655Lg.f26176L);
                C4117wN c4117wN5 = (C4117wN) c3755pl2.f33492b;
                C4117wN c4117wN6 = (C4117wN) c3755pl2.f33494d;
                C4009uN a18 = C4009uN.a(new C2674Mi(c4117wN5, c4117wN6, c4117wN4, (C4009uN) c3755pl2.f33497g, c4009uN6, a17, 17));
                C4009uN c4009uN7 = (C4009uN) c3755pl2.f33503n;
                C4009uN a19 = C4009uN.a(new Kt(c4009uN7, 17));
                C4009uN c4009uN8 = (C4009uN) c3755pl2.f33504o;
                C4009uN a20 = C4009uN.a(new C2580Gq(C4009uN.a(new C3323hj(a19, c4009uN8, c4009uN6, i14)), C4009uN.a(new C3323hj(C4009uN.a(new Kt(c4009uN7, i10)), c4009uN8, c4009uN6, i9)), C4009uN.a(new C3323hj(C4009uN.a(new Kt(c4009uN7, 19)), c4009uN8, c4009uN6, i4)), c4117wN6, c4009uN6));
                Ny ny3 = (Ny) C4009uN.a(new C4200xz(C4009uN.a(new C2674Mi(a16, a18, a20, c4009uN6, (C4009uN) c3755pl2.f33496f, c4117wN4)), C4009uN.a(new Tz((C4009uN) c3755pl2.f33498h, a16, a20, (C4009uN) c3755pl2.f33500k, c4009uN6, c4117wN4, c4117wN6)), a20, c4117wN4, 0)).d();
                AbstractC3137eE.h(ny3);
                return ny3;
        }
    }
}
