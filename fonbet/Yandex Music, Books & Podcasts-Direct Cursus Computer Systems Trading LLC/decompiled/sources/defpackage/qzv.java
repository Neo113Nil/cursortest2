package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.internal.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public abstract class qzv {
    public static final float a = 60;
    public static final float b = 3;

    public static final void a(List list, hq5 hq5Var, int i) {
        Object h0tVar;
        u6k u6kVar;
        boolean z;
        u6k u6kVar2;
        oq5 oq5Var;
        List list2 = list;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1498270235);
        int i2 = (oq5Var2.f(list2) ? 4 : 2) | i;
        if ((i2 & 3) == 2 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            float Q = ff7.Q(a, oq5Var2);
            Object K = oq5Var2.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = k5r.h(5, oq5Var2);
            }
            u6k u6kVar3 = (u6k) K;
            Object K2 = oq5Var2.K();
            if (K2 == kjnVar) {
                K2 = k5r.h(5, oq5Var2);
            }
            u6k u6kVar4 = (u6k) K2;
            boolean d = oq5Var2.d(u6kVar4.h());
            Object K3 = oq5Var2.K();
            int i3 = 6;
            if (d || K3 == kjnVar) {
                K3 = k5r.h((u6kVar4.h() + 5) % 6, oq5Var2);
            }
            u6k u6kVar5 = (u6k) K3;
            boolean d2 = oq5Var2.d(u6kVar4.h());
            Object K4 = oq5Var2.K();
            if (d2 || K4 == kjnVar) {
                K4 = k5r.h((u6kVar4.h() + 3) % 6, oq5Var2);
            }
            u6k u6kVar6 = (u6k) K4;
            Object K5 = oq5Var2.K();
            if (K5 == kjnVar) {
                K5 = k5r.h(0, oq5Var2);
            }
            u6k u6kVar7 = (u6k) K5;
            vm0 q = ltg.q(u6kVar7.h() == 0 ? 0.0f : 1.0f, 0.0f, weo.S(600, 0, lya.c, 2), Integer.valueOf(u6kVar4.h()), oq5Var2, 48, 0);
            Unit unit = Unit.a;
            boolean z2 = (i2 & 14) == 4;
            Object K6 = oq5Var2.K();
            if (z2 || K6 == kjnVar) {
                u6kVar = u6kVar3;
                z = true;
                u6kVar2 = u6kVar4;
                h0tVar = new h0t(list2, u6kVar2, u6kVar, null, 29);
                oq5Var2.k0(h0tVar);
            } else {
                h0tVar = K6;
                u6kVar = u6kVar3;
                u6kVar2 = u6kVar4;
                z = true;
            }
            gld.w(oq5Var2, unit, (Function2) h0tVar);
            oq5Var2.Z(-1023607159);
            ArrayList arrayList = new ArrayList(6);
            int i4 = 0;
            while (i4 < i3) {
                u6k u6kVar8 = u6kVar2;
                u6k u6kVar9 = u6kVar;
                float f = Q;
                oq5 oq5Var3 = oq5Var2;
                u6kVar2 = u6kVar8;
                arrayList.add(ild.C(738619774, new mg6(i4, list, f, u6kVar9, u6kVar8, u6kVar6, u6kVar5, q, u6kVar7), oq5Var3));
                i4++;
                oq5Var2 = oq5Var3;
                i3 = 6;
                Q = f;
                u6kVar = u6kVar9;
            }
            list2 = list;
            oq5Var = oq5Var2;
            oq5Var.p(false);
            yci u = xp3.u(vci.a, ugo.a);
            boolean f2 = oq5Var.f(q);
            Object K7 = oq5Var.K();
            if (f2 || K7 == kjnVar) {
                K7 = new pzv(u6kVar2, u6kVar7, q);
                oq5Var.k0(K7);
            }
            ggi ggiVar = (ggi) K7;
            wn5 o = ghh.o(arrayList);
            boolean f3 = oq5Var.f(ggiVar);
            Object K8 = oq5Var.K();
            if (f3 || K8 == kjnVar) {
                K8 = new hgi(ggiVar);
                oq5Var.k0(K8);
            }
            kfh kfhVar = (kfh) K8;
            int i5 = oq5Var.P;
            a l = oq5Var.l();
            yci H = vnj.H(oq5Var, u);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, kfhVar, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var, i5, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            eta.l(0, o, oq5Var, z);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new t44(i, 6, list2);
        }
    }

    public static final void b(rzv rzvVar, hq5 hq5Var, int i) {
        rzvVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(451193791);
        if ((((oq5Var.f(rzvVar) ? 4 : 2) | i) & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            vci vciVar = vci.a;
            yci c = d.c(vciVar, 1.0f);
            ta5 a2 = sa5.a(qx0.g(12), b2c.n, oq5Var, 6);
            int i2 = oq5Var.P;
            a l = oq5Var.l();
            yci H = vnj.H(oq5Var, c);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var, a2, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var, l, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i2))) {
                ouj.x(i2, oq5Var, i2, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var, H, kb5Var4);
            yci d = d.d(d.b(vciVar, 0.5f), 1.0f);
            kfh d2 = ug3.d(b2c.i, false);
            int i3 = oq5Var.P;
            a l2 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, d);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d2, kb5Var);
            g0g.U(oq5Var, l2, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var3);
            }
            g0g.U(oq5Var, H2, kb5Var4);
            a(rzvVar.a.a, oq5Var, 0);
            oq5Var.p(true);
            yci c2 = d.c(vciVar, 1.0f);
            kfh d3 = ug3.d(b2c.c, false);
            int i4 = oq5Var.P;
            a l3 = oq5Var.l();
            yci H3 = vnj.H(oq5Var, c2);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d3, kb5Var);
            g0g.U(oq5Var, l3, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var3);
            }
            g0g.U(oq5Var, H3, kb5Var4);
            c(0, oq5Var);
            oq5Var.p(true);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new f5r(rzvVar, i, 29);
        }
    }

    public static final void c(int i, hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(954691905);
        if (i == 0 && oq5Var.z()) {
            oq5Var.S();
        } else {
            neg.s(oq5Var);
            String[] stringArray = gdg.K(oq5Var).getStringArray(R.array.wizard_outboarding_text);
            Object K = oq5Var.K();
            Object obj = gq5.a;
            if (K == obj) {
                K = szf.g0(xz0.y(stringArray));
                oq5Var.k0(K);
            }
            aqi aqiVar = (aqi) K;
            Unit unit = Unit.a;
            boolean h = oq5Var.h(stringArray);
            Object K2 = oq5Var.K();
            if (h || K2 == obj) {
                K2 = new wa2(stringArray, aqiVar, (Continuation) null, 2);
                oq5Var.k0(K2);
            }
            gld.w(oq5Var, unit, (Function2) K2);
            String str = (String) aqiVar.getValue();
            yci d = d.d(vci.a, 1.0f);
            Object K3 = oq5Var.K();
            if (K3 == obj) {
                K3 = new jwv(9);
                oq5Var.k0(K3);
            }
            androidx.compose.animation.a.b(str, d, (Function1) K3, null, "outboarding text animation", null, leu.e, oq5Var, 1597872, 40);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new jiv(i, 9);
        }
    }

    public static final float d(int i, int i2, int i3) {
        int i4 = (6 - i2) % 6;
        return 1.0f - (Math.abs(((i + i4) % 6) - ((i3 + i4) % 6)) * 0.15f);
    }
}
