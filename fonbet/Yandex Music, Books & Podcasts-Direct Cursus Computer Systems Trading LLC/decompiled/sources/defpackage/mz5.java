package defpackage;

import androidx.compose.foundation.layout.a;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class mz5 implements Function2 {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    public /* synthetic */ mz5(tvd tvdVar, boolean z, mv5 mv5Var, Function0 function0, tz5 tz5Var, hab habVar, iv5 iv5Var, wv5 wv5Var, Function0 function02, rv5 rv5Var, dib dibVar) {
        this.e = tvdVar;
        this.d = z;
        this.f = mv5Var;
        this.b = function0;
        this.g = tz5Var;
        this.h = habVar;
        this.i = iv5Var;
        this.j = wv5Var;
        this.c = function02;
        this.k = rv5Var;
        this.l = dibVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x026d  */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [boolean, int] */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        o0k n;
        ?? r5;
        wn5 wn5Var;
        boolean f;
        Object K;
        boolean z;
        int i = this.a;
        Object obj3 = gq5.a;
        vci vciVar = vci.a;
        Object obj4 = this.l;
        Object obj5 = this.k;
        Object obj6 = this.j;
        Object obj7 = this.i;
        Object obj8 = this.h;
        Object obj9 = this.g;
        Object obj10 = this.f;
        Object obj11 = this.e;
        switch (i) {
            case 0:
                tvd tvdVar = (tvd) obj11;
                mv5 mv5Var = (mv5) obj10;
                tz5 tz5Var = (tz5) obj9;
                hab habVar = (hab) obj8;
                iv5 iv5Var = (iv5) obj7;
                wv5 wv5Var = (wv5) obj6;
                rv5 rv5Var = (rv5) obj5;
                dib dibVar = (dib) obj4;
                hq5 hq5Var = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                oq5 oq5Var2 = (oq5) hq5Var;
                boolean f2 = oq5Var2.f(tvdVar);
                Object K2 = oq5Var2.K();
                if (f2 || K2 == obj3) {
                    K2 = new nr(tvdVar, 17);
                    oq5Var2.k0(K2);
                }
                yci s = wyf.s(vciVar, (Function0) K2);
                if (this.d) {
                    oq5Var2.Z(-646992325);
                    oq5Var2.p(false);
                    n = a.c(0.0f, 100, 0.0f, 0.0f, 13);
                } else {
                    oq5Var2.Z(-646875269);
                    WeakHashMap weakHashMap = rqv.w;
                    n = p6g.n(z7l.h(oq5Var2).f, oq5Var2);
                    oq5Var2.p(false);
                }
                o0k o0kVar = n;
                if (mv5Var instanceof lv5) {
                    lv5 lv5Var = (lv5) mv5Var;
                    if (lv5Var.e.size() > 1 && lv5Var.f) {
                        oq5Var2.Z(-646603151);
                        wn5Var = ild.C(1195100892, new sh1(25, mv5Var, iv5Var, s), oq5Var2);
                        r5 = 0;
                        oq5Var2.p(false);
                        wn5 wn5Var2 = wn5Var;
                        oq5Var2.Z(-644569365);
                        wn5 C = ild.C(2128651117, new zk(11, this.b), oq5Var2);
                        oq5Var2.p(r5);
                        float f3 = !tz5Var.j ? 21 : (float) r5;
                        int i2 = 16;
                        float f4 = 16;
                        float f5 = 74;
                        wn5 C2 = ild.C(-145276357, new up(wv5Var, s, tz5Var, this.c, 16), oq5Var2);
                        wn5 C3 = ild.C(566852398, new pr(iv5Var, mv5Var, rv5Var, dibVar, wv5Var, tz5Var, 8), oq5Var2);
                        wn5 C4 = ild.C(403030954, new ez5(wv5Var, tz5Var, s), oq5Var2);
                        f = oq5Var2.f(tvdVar);
                        K = oq5Var2.K();
                        if (!f || K == obj3) {
                            K = new nr(tvdVar, i2);
                            oq5Var2.k0(K);
                        }
                        wdp.S(C2, null, habVar, o0kVar, C3, wn5Var2, null, C, C4, (Function0) K, true, f5, f4, f3, oq5Var2, 100687878, 3462, 2114);
                    }
                }
                r5 = 0;
                oq5Var2.Z(-645924096);
                oq5Var2.p(false);
                wn5Var = null;
                wn5 wn5Var22 = wn5Var;
                oq5Var2.Z(-644569365);
                wn5 C5 = ild.C(2128651117, new zk(11, this.b), oq5Var2);
                oq5Var2.p(r5);
                float f32 = !tz5Var.j ? 21 : (float) r5;
                int i22 = 16;
                float f42 = 16;
                float f52 = 74;
                wn5 C22 = ild.C(-145276357, new up(wv5Var, s, tz5Var, this.c, 16), oq5Var2);
                wn5 C32 = ild.C(566852398, new pr(iv5Var, mv5Var, rv5Var, dibVar, wv5Var, tz5Var, 8), oq5Var2);
                wn5 C42 = ild.C(403030954, new ez5(wv5Var, tz5Var, s), oq5Var2);
                f = oq5Var2.f(tvdVar);
                K = oq5Var2.K();
                if (!f) {
                }
                K = new nr(tvdVar, i22);
                oq5Var2.k0(K);
                wdp.S(C22, null, habVar, o0kVar, C32, wn5Var22, null, C5, C42, (Function0) K, true, f52, f42, f32, oq5Var2, 100687878, 3462, 2114);
                break;
            case 1:
                ((Integer) obj2).getClass();
                u7g.o((sdr) obj11, (xit) obj10, (z2h) obj9, (x3h) obj8, (b2h) obj7, (Function1) obj6, (Function1) obj5, this.b, this.c, (yci) obj4, this.d, (hq5) obj, rvf.R(1));
                break;
            default:
                n5g n5gVar = (n5g) obj11;
                wn5 wn5Var3 = (wn5) obj10;
                Function2 function2 = (Function2) obj9;
                wn5 wn5Var4 = (wn5) obj8;
                mct mctVar = (mct) obj7;
                wn5 wn5Var5 = (wn5) obj6;
                vqn vqnVar = (vqn) obj5;
                sdr sdrVar = (sdr) obj4;
                hq5 hq5Var2 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var3 = (oq5) hq5Var2;
                    if (oq5Var3.z()) {
                        oq5Var3.S();
                        break;
                    }
                }
                ta5 a = sa5.a(qx0.c, b2c.n, hq5Var2, 0);
                oq5 oq5Var4 = (oq5) hq5Var2;
                int i3 = oq5Var4.P;
                androidx.compose.runtime.internal.a l = oq5Var4.l();
                yci H = vnj.H(hq5Var2, vciVar);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var4.d0();
                if (oq5Var4.O) {
                    oq5Var4.k(grbVar);
                } else {
                    oq5Var4.n0();
                }
                g0g.U(hq5Var2, a, wp5.f);
                g0g.U(hq5Var2, l, wp5.e);
                kb5 kb5Var = wp5.g;
                if (oq5Var4.O || !Intrinsics.d(oq5Var4.K(), Integer.valueOf(i3))) {
                    ouj.x(i3, oq5Var4, i3, kb5Var);
                }
                g0g.U(hq5Var2, H, wp5.d);
                yci v = xp3.v(sqv.a(vciVar, n5gVar));
                Object K3 = oq5Var4.K();
                if (K3 == obj3) {
                    K3 = new x6s(28);
                    oq5Var4.k0(K3);
                }
                Function0 function0 = (Function0) K3;
                lx0 lx0Var = qx0.e;
                boolean booleanValue = ((Boolean) sdrVar.getValue()).booleanValue();
                if (function2 == null) {
                    function2 = lg3.e;
                }
                kct.b(v, function0, wn5Var3, this.b, lx0Var, 0, booleanValue, function2, wn5Var4, null, hq5Var2, 807100464, 54);
                yci f6 = androidx.compose.ui.layout.a.f(xp3.v(sqv.a(vciVar, new n5g(n5gVar, 15))), new dct(mctVar, 2));
                boolean f7 = oq5Var4.f(mctVar);
                Object K4 = oq5Var4.K();
                if (f7 || K4 == obj3) {
                    K4 = new ect(mctVar, 0);
                    oq5Var4.k0(K4);
                }
                Function0 function02 = (Function0) K4;
                kx0 kx0Var = qx0.d;
                int i4 = vqnVar.a;
                wn5 wn5Var6 = lg3.f;
                wn5 wn5Var7 = lg3.g;
                boolean f8 = oq5Var4.f(mctVar);
                Object K5 = oq5Var4.K();
                if (f8 || K5 == obj3) {
                    z = true;
                    K5 = new dct(mctVar, 1);
                    oq5Var4.k0(K5);
                } else {
                    z = true;
                }
                kct.b(f6, function02, wn5Var5, this.c, kx0Var, i4, this.d, wn5Var6, wn5Var7, (Function1) K5, hq5Var2, 906190848, 6);
                oq5Var4.p(z);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ mz5(n5g n5gVar, wn5 wn5Var, Function0 function0, Function2 function2, wn5 wn5Var2, mct mctVar, wn5 wn5Var3, Function0 function02, vqn vqnVar, boolean z, sdr sdrVar) {
        this.e = n5gVar;
        this.f = wn5Var;
        this.b = function0;
        this.g = function2;
        this.h = wn5Var2;
        this.i = mctVar;
        this.j = wn5Var3;
        this.c = function02;
        this.k = vqnVar;
        this.d = z;
        this.l = sdrVar;
    }

    public /* synthetic */ mz5(sdr sdrVar, xit xitVar, z2h z2hVar, x3h x3hVar, b2h b2hVar, Function1 function1, Function1 function12, Function0 function0, Function0 function02, yci yciVar, boolean z, int i) {
        this.e = sdrVar;
        this.f = xitVar;
        this.g = z2hVar;
        this.h = x3hVar;
        this.i = b2hVar;
        this.j = function1;
        this.k = function12;
        this.b = function0;
        this.c = function02;
        this.l = yciVar;
        this.d = z;
    }
}
