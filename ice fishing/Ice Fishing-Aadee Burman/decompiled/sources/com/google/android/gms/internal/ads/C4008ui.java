package com.google.android.gms.internal.ads;

import S7.AbstractC0406y;
import X.C0409b;
import X.InterfaceC0413f;
import android.content.Context;
import android.widget.FrameLayout;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import org.json.JSONException;
import org.json.JSONObject;
import v7.C5135p;

/* renamed from: com.google.android.gms.internal.ads.ui, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4008ui implements InterfaceC3297hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34560a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f34561b;

    public /* synthetic */ C4008ui(int i, Object obj) {
        this.f34560a = i;
        this.f34561b = obj;
    }

    public static k8.b b() {
        return new k8.b(new C2866Yb(23), new C2866Yb(22), false);
    }

    public C4012um a() {
        C4012um c4012um = (C4012um) ((C3657o7) this.f34561b).f32862u;
        AbstractC3341iD.j(c4012um);
        return c4012um;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3511lN
    public final Object f() {
        Object obj;
        int i = 9;
        int i6 = 8;
        int i9 = 14;
        int i10 = 13;
        int i11 = 11;
        int i12 = 10;
        int i13 = 1;
        int i14 = 12;
        Object obj2 = this.f34561b;
        switch (this.f34560a) {
            case 0:
                return b();
            case 1:
                return new C2573Gi(0, new C3429jw(((C3040ci) obj2).f29536b.a()));
            case 2:
                C2570Gf o6 = C2570Gf.o(((C3040ci) obj2).f29536b.a());
                return new C2590Hi(2, new C2991bm(i14, (T2.a) o6.f25042u, (C2519Df) ((C3243gN) o6.f25044w).f()));
            case 3:
                return (FrameLayout) ((Ux) obj2).f28050u;
            case 4:
                return ((C3578mj) obj2).a();
            case 5:
                C2536Ef c2536Ef = (C2536Ef) obj2;
                return new C2491Bl(new C3955tj((InterfaceC4061vh) ((C3740pj) c2536Ef.f24634b).f33119b.f25045x, (C3153eo) ((C3243gN) c2536Ef.f24635c).f(), ((C2676Mj) c2536Ef.f24636d).a()), AbstractC3413jg.f31268a);
            case 6:
                C2689Nf c2689Nf = (C2689Nf) obj2;
                C4063vj c4063vj = new C4063vj((InterfaceC4061vh) ((C3740pj) c2689Nf.f26506b).f33119b.f25045x, (Executor) ((C3243gN) c2689Nf.f26507c).f());
                if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.be)).booleanValue()) {
                    C2491Bl c2491Bl = new C2491Bl(c4063vj, AbstractC3413jg.f31268a);
                    int i15 = XB.f28503v;
                    obj = new YB(c2491Bl);
                } else {
                    int i16 = XB.f28503v;
                    obj = C3823rC.f33537C;
                }
                AbstractC3341iD.j(obj);
                return obj;
            case 7:
                return new C2491Bl(new C3632nj(0, (C2875Yk) ((C2506Cj) obj2).f24211b.f2840u), AbstractC3413jg.f31275h);
            case 8:
                return ((C3096dk) obj2).a();
            case 9:
                C3847rj c3847rj = (C3847rj) obj2;
                return new C2523Dj(new C2587Hf(c3847rj.f33692b.a(), c3847rj.f33693c.a().f29626g));
            case 10:
                return new C2574Gj(((C3403jN) obj2).f());
            case 11:
                return ((C3416jj) obj2).a();
            case 12:
                return new C3364ik(((C2676Mj) obj2).b());
            case 13:
                C4282zm c4282zm = (C4282zm) ((C3044cm) obj2).f29580b.f29323u;
                AbstractC3341iD.j(c4282zm);
                Set singleton = c4282zm.f35447d != null ? Collections.singleton(com.anythink.expressad.foundation.g.a.f.f19123e) : Collections.EMPTY_SET;
                AbstractC3341iD.j(singleton);
                return singleton;
            case 14:
                C4066vm c4066vm = (C4066vm) ((C2746Ql) obj2).f27063b.f();
                AbstractC3341iD.j(c4066vm);
                JSONObject jSONObject = c4066vm.f34728b;
                if (jSONObject == null) {
                    try {
                        jSONObject = new JSONObject(c4066vm.f34870a.f27654z);
                    } catch (JSONException unused) {
                        return null;
                    }
                }
                return jSONObject;
            case 15:
                BinderC3419jm binderC3419jm = new BinderC3419jm(((C3527lm) obj2).f31846b.a());
                C3904sm c3904sm = new C3904sm();
                c3904sm.f34135a = binderC3419jm;
                return c3904sm;
            case 16:
                C4012um c4012um = (C4012um) ((C3657o7) obj2).f32862u;
                AbstractC3341iD.j(c4012um);
                return c4012um;
            case 17:
                return new C2641Ki(i13, (InterfaceC4061vh) ((InterfaceC3297hN) obj2).f());
            case 18:
                return new C2491Bl(new C2641Ki(i13, (InterfaceC4061vh) ((InterfaceC3297hN) ((C4008ui) obj2).f34561b).f()), AbstractC3413jg.f31273f);
            case 19:
                C2808Uh c2808Uh = (C2808Uh) obj2;
                InterfaceC0413f interfaceC0413f = (InterfaceC0413f) c2808Uh.f27953b.f();
                ExecutorService executorService = AbstractC3413jg.f31274g;
                AbstractC3341iD.j(executorService);
                return new C2680Mn(new Px(interfaceC0413f, new C4019ut(3, executorService), (C2697Nn) c2808Uh.f27954c.f(), new C3586mr((byte) 0, 16)));
            case 20:
                C3360ig c3360ig = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig);
                C2689Nf c2689Nf2 = (C2689Nf) obj2;
                Set singleton2 = ((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32209b6)).booleanValue() ? Collections.singleton(new C2491Bl(new C2830Vn((C3068d9) ((C3243gN) c2689Nf2.f26506b).f(), ((C3403jN) c2689Nf2.f26507c).f()), c3360ig)) : Collections.EMPTY_SET;
                AbstractC3341iD.j(singleton2);
                return singleton2;
            case 21:
                C2.G g4 = (C2.G) obj2;
                C4069vp c4069vp = new C4069vp(g4.f275b.a(), (C2621Jf) g4.f276c.f());
                C3360ig c3360ig2 = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig2);
                return new C2491Bl(c4069vp, c3360ig2);
            case 22:
                return new Qx(28, ((C2.G) obj2).a());
            case 23:
                C2689Nf c2689Nf3 = (C2689Nf) obj2;
                C2699Np c2699Np = (C2699Np) ((C3243gN) c2689Nf3.f26506b).f();
                C2689Nf c2689Nf4 = (C2689Nf) c2689Nf3.f26507c;
                C2830Vn c2830Vn = new C2830Vn(c2699Np, new C2716Op(((C2689Nf) c2689Nf4.f26506b).a(), ((C2888Zh) c2689Nf4.f26507c).b()));
                C3360ig c3360ig3 = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig3);
                return new C2491Bl(c2830Vn, c3360ig3);
            case 24:
                return new Lr(5, ((C3795qk) obj2).f33377b.f32934c);
            case 25:
                AbstractC3341iD.j(AbstractC3413jg.f31268a);
                AbstractC3341iD.j(((C2739Qe) ((C2998bt) obj2).f29342b.f1051v).f27044w);
                return new C2944at();
            case 26:
                Context context = ((C2987bi) obj2).f29310b.f28707b;
                AbstractC3341iD.j(context);
                ExecutorService executorService2 = AbstractC3413jg.f31274g;
                AbstractC3341iD.j(executorService2);
                C3808qx c3808qx = C3861rx.f33777a;
                X7.e b9 = AbstractC0406y.b(new S7.S(executorService2));
                return new X.D(new C3915sx(context), d6.c.k(new C0409b(C5135p.f41439n, null)), new E3.e(), b9);
            case 27:
                Ly ly = (Ly) ((C3243gN) new C2570Gf(((C3163ey) ((C3056cy) obj2).f()).f30004a).f25044w).f();
                AbstractC3341iD.j(ly);
                return ly;
            case 28:
                C3796ql c3796ql = ((C3109dy) ((C3056cy) obj2).f()).f29863a;
                C3351iN c3351iN = (C3351iN) c3796ql.f33379b;
                C3351iN c3351iN2 = (C3351iN) c3796ql.f33381d;
                C3243gN a9 = C3243gN.a(new Fz(c3351iN, c3351iN2, (C3243gN) c3796ql.f33385h, i13));
                C3243gN a10 = C3243gN.a(new C2553Ff(c3351iN, a9, i6));
                C3243gN c3243gN = (C3243gN) c3796ql.i;
                C3243gN c3243gN2 = (C3243gN) c3796ql.f33380c;
                C3351iN c3351iN3 = (C3351iN) c3796ql.f33382e;
                C3243gN a11 = C3243gN.a(new C4079vz(a10, c3243gN, c3243gN2, c3351iN3, 1));
                C3243gN c3243gN3 = (C3243gN) c3796ql.f33390n;
                C3243gN a12 = C3243gN.a(new C3320ht(c3243gN3, i10));
                C3243gN c3243gN4 = (C3243gN) c3796ql.f33391o;
                C3243gN a13 = C3243gN.a(new C4232yq(C3243gN.a(new C2511Co(C3243gN.a(new C3416jj(a12, c3243gN4, c3243gN, i)), C3243gN.a(new C3416jj(C3243gN.a(new C3320ht(c3243gN3, 15)), c3243gN4, c3243gN, i12)), C3243gN.a(new C3416jj(C3243gN.a(new C3320ht(c3243gN3, 17)), c3243gN4, c3243gN, i11)), C3243gN.a(new C3416jj(C3243gN.a(new C3320ht(c3243gN3, i12)), c3243gN4, c3243gN, 6)), C3243gN.a(new C3416jj(C3243gN.a(new C3320ht(c3243gN3, i11)), c3243gN4, c3243gN, 7)), C3243gN.a(new C3416jj(C3243gN.a(new C3320ht(c3243gN3, i14)), c3243gN4, c3243gN, 8)), C3243gN.a(new C3320ht(c3243gN3, 14)), c3351iN2, c3243gN)), C3243gN.a(new C4232yq(C3243gN.a(new C4232yq(c3351iN, a10, c3243gN, 9)), c3351iN2, c3243gN, i11)), c3351iN3, 10));
                C3243gN a14 = C3243gN.a(new C3320ht(c3243gN3, 16));
                C3243gN a15 = C3243gN.a(AbstractC3043cl.f29567L);
                Ly ly2 = (Ly) C3243gN.a(new C4079vz(C3243gN.a(new C2709Oi(a11, C3243gN.a(new Qz(c3351iN, a10, a13, c3243gN, c3351iN2, C3243gN.a(new C3416jj(a14, a15, c3243gN, 5)), a9)), a13, c3243gN, (C3243gN) c3796ql.f33383f, c3351iN3)), C3243gN.a(new C2547Eq(C3243gN.a(new Ht(c3351iN, C3243gN.a(new Fz(c3351iN, c3351iN3, (C3243gN) c3796ql.f33387k, 0)), a9, a15, c3351iN3)), a13, a11, c3243gN, c3351iN2)), a13, c3351iN3, 0)).f();
                AbstractC3341iD.j(ly2);
                return ly2;
            default:
                C3796ql c3796ql2 = ((C3217fy) ((C3056cy) obj2).f()).f30470a;
                C3243gN c3243gN5 = (C3243gN) c3796ql2.f33380c;
                C3243gN c3243gN6 = (C3243gN) c3796ql2.i;
                C3351iN c3351iN4 = (C3351iN) c3796ql2.f33382e;
                C3243gN a16 = C3243gN.a(new C4232yq(c3243gN5, c3243gN6, c3351iN4, i14));
                C3243gN a17 = C3243gN.a(MA.f26254F);
                C3351iN c3351iN5 = (C3351iN) c3796ql2.f33379b;
                C3351iN c3351iN6 = (C3351iN) c3796ql2.f33381d;
                C3243gN a18 = C3243gN.a(new C2709Oi(c3351iN5, c3351iN6, c3351iN4, (C3243gN) c3796ql2.f33384g, c3243gN6, a17, 18));
                C3243gN c3243gN7 = (C3243gN) c3796ql2.f33390n;
                C3243gN a19 = C3243gN.a(new C3320ht(c3243gN7, 18));
                C3243gN c3243gN8 = (C3243gN) c3796ql2.f33391o;
                C3243gN a20 = C3243gN.a(new C2547Eq(C3243gN.a(new C3416jj(a19, c3243gN8, c3243gN6, i14)), C3243gN.a(new C3416jj(C3243gN.a(new C3320ht(c3243gN7, 19)), c3243gN8, c3243gN6, i10)), C3243gN.a(new C3416jj(C3243gN.a(new C3320ht(c3243gN7, 20)), c3243gN8, c3243gN6, i9)), c3351iN6, c3243gN6));
                Ly ly3 = (Ly) C3243gN.a(new C4079vz(C3243gN.a(new C2709Oi(a16, a18, a20, c3243gN6, (C3243gN) c3796ql2.f33383f, c3351iN4)), C3243gN.a(new Qz((C3243gN) c3796ql2.f33385h, a16, a20, (C3243gN) c3796ql2.f33387k, c3243gN6, c3351iN4, c3351iN6)), a20, c3351iN4, 0)).f();
                AbstractC3341iD.j(ly3);
                return ly3;
        }
    }
}
