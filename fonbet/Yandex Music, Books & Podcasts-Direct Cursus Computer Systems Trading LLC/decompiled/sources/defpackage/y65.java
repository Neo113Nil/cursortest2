package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.internal.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.data.wave.recommendations.StationId;

/* loaded from: classes3.dex */
public abstract class y65 {
    public static final float a = 156;
    public static final float b;
    public static final float c;

    static {
        float f = 8;
        b = f;
        c = f;
    }

    public static final void a(a75 a75Var, kxi kxiVar, yci yciVar, hq5 hq5Var, int i) {
        yci yciVar2;
        kxiVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1922295415);
        int i2 = (oq5Var.f(a75Var) ? 4 : 2) | i | (oq5Var.h(kxiVar) ? 32 : 16) | 384;
        if (oq5Var.P(i2 & 1, (i2 & 147) != 146)) {
            aqi O = gld.O(a75Var.h, oq5Var);
            vci vciVar = vci.a;
            yci d = d.d(vciVar, 1.0f);
            kfh d2 = ug3.d(b2c.f, false);
            int i3 = oq5Var.P;
            a l = oq5Var.l();
            yci H = vnj.H(oq5Var, d);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d2, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            e75 e75Var = (e75) O.getValue();
            if (e75Var instanceof b75) {
                oq5Var.Z(2130636792);
                b(((b75) e75Var).a, kxiVar, a75Var, oq5Var, ((i2 << 6) & 896) | (i2 & 112) | 8);
                oq5Var.p(false);
            } else if (Intrinsics.d(e75Var, c75.a)) {
                oq5Var.Z(2130643584);
                c(false, oq5Var, 6);
                oq5Var.p(false);
            } else {
                if (!Intrinsics.d(e75Var, d75.a)) {
                    throw vz1.i(oq5Var, 2130634546, false);
                }
                oq5Var.Z(2130647711);
                c(true, oq5Var, 6);
                oq5Var.p(false);
            }
            oq5Var.p(true);
            yciVar2 = vciVar;
        } else {
            oq5Var.S();
            yciVar2 = yciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new sh1(a75Var, kxiVar, yciVar2, i, 22);
        }
    }

    public static final void b(ilu iluVar, kxi kxiVar, a75 a75Var, hq5 hq5Var, int i) {
        int i2;
        kxi kxiVar2;
        oq5 oq5Var;
        kjn kjnVar = gq5.a;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(880347829);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? oq5Var2.f(iluVar) : oq5Var2.h(iluVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            kxiVar2 = kxiVar;
            i2 |= oq5Var2.h(kxiVar2) ? 32 : 16;
        } else {
            kxiVar2 = kxiVar;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var2.f(a75Var) ? 256 : 128;
        }
        if (oq5Var2.P(i2 & 1, (i2 & 147) != 146)) {
            boolean z = (i2 & 14) == 4 || ((i2 & 8) != 0 && oq5Var2.f(iluVar));
            Object K = oq5Var2.K();
            if (z || K == kjnVar) {
                K = StationId.f(iluVar.b.a);
                oq5Var2.k0(K);
            }
            StationId stationId = (StationId) K;
            stationId.getClass();
            List list = iluVar.b.b.a;
            ArrayList arrayList = new ArrayList(v75.o(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(o8g.Q((g9p) it.next()));
            }
            Object K2 = oq5Var2.K();
            if (K2 == kjnVar) {
                K2 = new x65(0);
                oq5Var2.k0(K2);
            }
            pfn pfnVar = (pfn) K2;
            l18 l18Var = l18.b;
            bdt I = hag.I(k6l.class);
            qdc qdcVar = l18Var.a;
            qdcVar.getClass();
            k6l k6lVar = (k6l) qdcVar.C(I);
            bdt I2 = hag.I(uwu.class);
            qdc qdcVar2 = l18Var.a;
            qdcVar2.getClass();
            uwu uwuVar = (uwu) qdcVar2.C(I2);
            bdt I3 = hag.I(qwu.class);
            qdc qdcVar3 = l18Var.a;
            qdcVar3.getClass();
            qwu qwuVar = (qwu) qdcVar3.C(I3);
            boolean h = oq5Var2.h(stationId) | ((i2 & 896) == 256);
            Object K3 = oq5Var2.K();
            if (h || K3 == kjnVar) {
                K3 = new ap1(21, a75Var, stationId);
                oq5Var2.k0(K3);
            }
            Function0 function0 = (Function0) K3;
            Object K4 = oq5Var2.K();
            if (K4 == kjnVar) {
                K4 = new z35(8);
                oq5Var2.k0(K4);
            }
            oq5Var = oq5Var2;
            y1g.b(iluVar.a, wyf.Y(stationId, arrayList, kxiVar2, function0, k6lVar, uwuVar, qwuVar, null, pfnVar, (Function1) K4, oq5Var, ((i2 << 6) & 7168) | 6, 6, 128), androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.a.o(d.d(vci.a, 1.0f), c, 0.0f, 2), "collection_wave_agent_block"), null, null, new cma(a), oq5Var, 196992);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new b3(iluVar, kxiVar, a75Var, i, 24);
        }
    }

    public static final void c(boolean z, hq5 hq5Var, int i) {
        boolean z2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(342511475);
        if (oq5Var.P(i & 1, (i & 3) != 2)) {
            vci vciVar = vci.a;
            float f = a;
            yci r = d.r(vciVar, f);
            ta5 a2 = sa5.a(qx0.c, b2c.o, oq5Var, 48);
            int i2 = oq5Var.P;
            a l = oq5Var.l();
            yci H = vnj.H(oq5Var, r);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a2, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i2))) {
                ouj.x(i2, oq5Var, i2, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            ivf.k(6, 0, oq5Var, xp3.u(d.m(vciVar, f), o5g.F(oq5Var)), z);
            u1g.l(oq5Var, d.e(vciVar, b));
            ges j = nu0.j();
            yci r2 = d.r(vciVar, f);
            z2 = z;
            ivf.l(z2, r2, j, oq5Var, 54, 0);
            oq5Var.p(true);
        } else {
            z2 = z;
            oq5Var.S();
        }
        xmn r3 = oq5Var.r();
        if (r3 != null) {
            r3.d = new sm(i, 14, z2);
        }
    }
}
