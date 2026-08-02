package com.google.android.gms.internal.ads;

import S7.AbstractC0410y;
import X.C0413b;
import X.InterfaceC0417f;
import android.content.Context;
import android.widget.FrameLayout;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import o1.C4797a;
import org.json.JSONException;
import org.json.JSONObject;
import v7.C5125p;

/* renamed from: com.google.android.gms.internal.ads.ui, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4031ui implements InterfaceC3320hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35332a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f35333b;

    public /* synthetic */ C4031ui(int i, Object obj) {
        this.f35332a = i;
        this.f35333b = obj;
    }

    public static C4797a b() {
        return new C4797a(new C2889Yb(23), new C2889Yb(22));
    }

    public C4089vm a() {
        C4089vm c4089vm = (C4089vm) ((C3680o7) this.f35333b).f33649u;
        AbstractC3364iD.j(c4089vm);
        return c4089vm;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3534lN
    public final Object f() {
        Object obj;
        int i = 9;
        int i4 = 8;
        int i6 = 13;
        int i9 = 11;
        int i10 = 10;
        int i11 = 1;
        int i12 = 14;
        int i13 = 12;
        Object obj2 = this.f35333b;
        switch (this.f35332a) {
            case 0:
                return b();
            case 1:
                return new C2593Gi(0, new C3506kw(((C3063ci) obj2).f30321b.a()));
            case 2:
                C2590Gf m9 = C2590Gf.m(((C3063ci) obj2).f30321b.a());
                return new C2610Hi(2, new C3067cm(14, (V2.a) m9.f25830u, (C2539Df) ((C3266gN) m9.f25832w).f()));
            case 3:
                return (FrameLayout) ((Ux) obj2).f28847u;
            case 4:
                return ((C3601mj) obj2).a();
            case 5:
                C2556Ef c2556Ef = (C2556Ef) obj2;
                return new C2528Cl(new C3978tj((InterfaceC4084vh) ((C3763pj) c2556Ef.f25387b).f33908b.f25833x, (C3230fo) ((C3266gN) c2556Ef.f25388c).f(), ((C2696Mj) c2556Ef.f25389d).a()), AbstractC3436jg.f32055a);
            case 6:
                C2709Nf c2709Nf = (C2709Nf) obj2;
                C4086vj c4086vj = new C4086vj((InterfaceC4084vh) ((C3763pj) c2709Nf.f27289b).f33908b.f25833x, (Executor) ((C3266gN) c2709Nf.f27290c).f());
                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.be)).booleanValue()) {
                    C2528Cl c2528Cl = new C2528Cl(c4086vj, AbstractC3436jg.f32055a);
                    int i14 = XB.f29283v;
                    obj = new YB(c2528Cl);
                } else {
                    int i15 = XB.f29283v;
                    obj = C3846rC.f34305C;
                }
                AbstractC3364iD.j(obj);
                return obj;
            case 7:
                return new C2528Cl(new C3655nj(0, (C2898Yk) ((C2526Cj) obj2).f24946b.f2969u), AbstractC3436jg.f32062h);
            case 8:
                return ((C3119dk) obj2).a();
            case 9:
                C3870rj c3870rj = (C3870rj) obj2;
                return new C2543Dj(new C2607Hf(c3870rj.f34464b.a(), c3870rj.f34465c.a().f30396g));
            case 10:
                return new C2594Gj(((C3426jN) obj2).f());
            case 11:
                return ((C3439jj) obj2).a();
            case 12:
                return new C3387ik(((C2696Mj) obj2).b());
            case 13:
                C2495Am c2495Am = (C2495Am) ((C3121dm) obj2).f30617b.f30365u;
                AbstractC3364iD.j(c2495Am);
                Set singleton = c2495Am.f24513d != null ? Collections.singleton(com.anythink.expressad.foundation.g.a.f.f19910e) : Collections.EMPTY_SET;
                AbstractC3364iD.j(singleton);
                return singleton;
            case 14:
                C4143wm c4143wm = (C4143wm) ((C2783Rl) obj2).f28007b.f();
                AbstractC3364iD.j(c4143wm);
                JSONObject jSONObject = c4143wm.f35647b;
                if (jSONObject == null) {
                    try {
                        jSONObject = new JSONObject(c4143wm.f35829a.f28437z);
                    } catch (JSONException unused) {
                        return null;
                    }
                }
                return jSONObject;
            case 15:
                BinderC3496km binderC3496km = new BinderC3496km(((C3604mm) obj2).f33356b.a());
                C3981tm c3981tm = new C3981tm();
                c3981tm.f35164a = binderC3496km;
                return c3981tm;
            case 16:
                C4089vm c4089vm = (C4089vm) ((C3680o7) obj2).f33649u;
                AbstractC3364iD.j(c4089vm);
                return c4089vm;
            case 17:
                return new C2661Ki(i11, (InterfaceC4084vh) ((InterfaceC3320hN) obj2).f());
            case 18:
                return new C2528Cl(new C2661Ki(i11, (InterfaceC4084vh) ((InterfaceC3320hN) ((C4031ui) obj2).f35333b).f()), AbstractC3436jg.f32060f);
            case 19:
                C2830Uh c2830Uh = (C2830Uh) obj2;
                InterfaceC0417f interfaceC0417f = (InterfaceC0417f) c2830Uh.f28751b.f();
                ExecutorService executorService = AbstractC3436jg.f32061g;
                AbstractC3364iD.j(executorService);
                return new C2717Nn(new Px(interfaceC0417f, new C4042ut(3, executorService), (C2734On) c2830Uh.f28752c.f(), new C3609mr((byte) 0, 16)));
            case 20:
                C3383ig c3383ig = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig);
                C2709Nf c2709Nf2 = (C2709Nf) obj2;
                Set singleton2 = ((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32988b6)).booleanValue() ? Collections.singleton(new C2528Cl(new C2869Wn((C3091d9) ((C3266gN) c2709Nf2.f27289b).f(), ((C3426jN) c2709Nf2.f27290c).f()), c3383ig)) : Collections.EMPTY_SET;
                AbstractC3364iD.j(singleton2);
                return singleton2;
            case 21:
                E2.F f2 = (E2.F) obj2;
                C4092vp c4092vp = new C4092vp(f2.f735b.a(), (C2641Jf) f2.f736c.f());
                C3383ig c3383ig2 = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig2);
                return new C2528Cl(c4092vp, c3383ig2);
            case 22:
                return new Qx(28, ((E2.F) obj2).a());
            case 23:
                C2709Nf c2709Nf3 = (C2709Nf) obj2;
                C2719Np c2719Np = (C2719Np) ((C3266gN) c2709Nf3.f27289b).f();
                C2709Nf c2709Nf4 = (C2709Nf) c2709Nf3.f27290c;
                C2869Wn c2869Wn = new C2869Wn(c2719Np, new C2736Op(((C2709Nf) c2709Nf4.f27289b).a(), ((C2911Zh) c2709Nf4.f27290c).b()));
                C3383ig c3383ig3 = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig3);
                return new C2528Cl(c2869Wn, c3383ig3);
            case 24:
                return new Lr(5, ((C3818qk) obj2).f34159b.f33720c);
            case 25:
                AbstractC3364iD.j(AbstractC3436jg.f32055a);
                AbstractC3364iD.j(((C2759Qe) ((C3021bt) obj2).f30130b.f1304v).f27829w);
                return new C2967at();
            case 26:
                Context context = ((C3010bi) obj2).f30099b.f29482b;
                AbstractC3364iD.j(context);
                ExecutorService executorService2 = AbstractC3436jg.f32061g;
                AbstractC3364iD.j(executorService2);
                C3831qx c3831qx = C3884rx.f34545a;
                X7.e b9 = AbstractC0410y.b(new S7.S(executorService2));
                return new X.D(new C3938sx(context), Z2.d.n(new C0413b(C5125p.f41221n, null)), new c4.e(), b9);
            case 27:
                Ly ly = (Ly) ((C3266gN) new C2590Gf(((C3186ey) ((C3079cy) obj2).f()).f30791a).f25832w).f();
                AbstractC3364iD.j(ly);
                return ly;
            case 28:
                C3819ql c3819ql = ((C3132dy) ((C3079cy) obj2).f()).f30655a;
                C3374iN c3374iN = (C3374iN) c3819ql.f34161b;
                C3374iN c3374iN2 = (C3374iN) c3819ql.f34163d;
                C3266gN a9 = C3266gN.a(new Fz(c3374iN, c3374iN2, (C3266gN) c3819ql.f34167h, i11));
                C3266gN a10 = C3266gN.a(new C2573Ff(c3374iN, a9, i4));
                C3266gN c3266gN = (C3266gN) c3819ql.i;
                C3266gN c3266gN2 = (C3266gN) c3819ql.f34162c;
                C3374iN c3374iN3 = (C3374iN) c3819ql.f34164e;
                C3266gN a11 = C3266gN.a(new C4102vz(a10, c3266gN, c3266gN2, c3374iN3, 1));
                C3266gN c3266gN3 = (C3266gN) c3819ql.f34172n;
                C3266gN a12 = C3266gN.a(new C3343ht(c3266gN3, i6));
                C3266gN c3266gN4 = (C3266gN) c3819ql.f34173o;
                C3266gN a13 = C3266gN.a(new C4255yq(C3266gN.a(new C2548Do(C3266gN.a(new C3439jj(a12, c3266gN4, c3266gN, i)), C3266gN.a(new C3439jj(C3266gN.a(new C3343ht(c3266gN3, 15)), c3266gN4, c3266gN, i10)), C3266gN.a(new C3439jj(C3266gN.a(new C3343ht(c3266gN3, 17)), c3266gN4, c3266gN, i9)), C3266gN.a(new C3439jj(C3266gN.a(new C3343ht(c3266gN3, i10)), c3266gN4, c3266gN, 6)), C3266gN.a(new C3439jj(C3266gN.a(new C3343ht(c3266gN3, i9)), c3266gN4, c3266gN, 7)), C3266gN.a(new C3439jj(C3266gN.a(new C3343ht(c3266gN3, i13)), c3266gN4, c3266gN, 8)), C3266gN.a(new C3343ht(c3266gN3, 14)), c3374iN2, c3266gN)), C3266gN.a(new C4255yq(C3266gN.a(new C4255yq(c3374iN, a10, c3266gN, 9)), c3374iN2, c3266gN, i9)), c3374iN3, 10));
                C3266gN a14 = C3266gN.a(new C3343ht(c3266gN3, 16));
                C3266gN a15 = C3266gN.a(AbstractC3066cl.f30352L);
                Ly ly2 = (Ly) C3266gN.a(new C4102vz(C3266gN.a(new C2729Oi(a11, C3266gN.a(new Qz(c3374iN, a10, a13, c3266gN, c3374iN2, C3266gN.a(new C3439jj(a14, a15, c3266gN, 5)), a9)), a13, c3266gN, (C3266gN) c3819ql.f34165f, c3374iN3)), C3266gN.a(new C2567Eq(C3266gN.a(new Ht(c3374iN, C3266gN.a(new Fz(c3374iN, c3374iN3, (C3266gN) c3819ql.f34169k, 0)), a9, a15, c3374iN3)), a13, a11, c3266gN, c3374iN2)), a13, c3374iN3, 0)).f();
                AbstractC3364iD.j(ly2);
                return ly2;
            default:
                C3819ql c3819ql2 = ((C3240fy) ((C3079cy) obj2).f()).f31236a;
                C3266gN c3266gN5 = (C3266gN) c3819ql2.f34162c;
                C3266gN c3266gN6 = (C3266gN) c3819ql2.i;
                C3374iN c3374iN4 = (C3374iN) c3819ql2.f34164e;
                C3266gN a16 = C3266gN.a(new C4255yq(c3266gN5, c3266gN6, c3374iN4, i13));
                C3266gN a17 = C3266gN.a(MA.f27045F);
                C3374iN c3374iN5 = (C3374iN) c3819ql2.f34161b;
                C3374iN c3374iN6 = (C3374iN) c3819ql2.f34163d;
                C3266gN a18 = C3266gN.a(new C2729Oi(c3374iN5, c3374iN6, c3374iN4, (C3266gN) c3819ql2.f34166g, c3266gN6, a17, 18));
                C3266gN c3266gN7 = (C3266gN) c3819ql2.f34172n;
                C3266gN a19 = C3266gN.a(new C3343ht(c3266gN7, 18));
                C3266gN c3266gN8 = (C3266gN) c3819ql2.f34173o;
                C3266gN a20 = C3266gN.a(new C2567Eq(C3266gN.a(new C3439jj(a19, c3266gN8, c3266gN6, i13)), C3266gN.a(new C3439jj(C3266gN.a(new C3343ht(c3266gN7, 19)), c3266gN8, c3266gN6, i6)), C3266gN.a(new C3439jj(C3266gN.a(new C3343ht(c3266gN7, 20)), c3266gN8, c3266gN6, i12)), c3374iN6, c3266gN6));
                Ly ly3 = (Ly) C3266gN.a(new C4102vz(C3266gN.a(new C2729Oi(a16, a18, a20, c3266gN6, (C3266gN) c3819ql2.f34165f, c3374iN4)), C3266gN.a(new Qz((C3266gN) c3819ql2.f34167h, a16, a20, (C3266gN) c3819ql2.f34169k, c3266gN6, c3374iN4, c3374iN6)), a20, c3374iN4, 0)).f();
                AbstractC3364iD.j(ly3);
                return ly3;
        }
    }
}
