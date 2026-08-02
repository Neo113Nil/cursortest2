package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class hva {
    public static final float b;
    public static final float d;
    public static final float a = 40;
    public static final float c = 123;
    public static final float e = 20;
    public static final float f = 143;
    public static final act g = weo.S(600, 0, lya.c, 2);

    static {
        float f2 = 14;
        b = f2;
        d = f2;
    }

    public static final void a(zwa zwaVar, hq5 hq5Var, int i) {
        int i2;
        zwaVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(576032290);
        if ((i & 6) == 0) {
            i2 = (oq5Var.h(zwaVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(vci.a) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            kwa kwaVar = (kwa) gld.O(zwaVar.K(), oq5Var).getValue();
            if (kwaVar instanceof iwa) {
                oq5Var.Z(-483742030);
                b((iwa) kwaVar, zwaVar, oq5Var, (i2 << 3) & 1008);
                oq5Var.p(false);
            } else {
                if (!Intrinsics.d(kwaVar, jwa.a)) {
                    throw vz1.i(oq5Var, -483744244, false);
                }
                oq5Var.Z(-483736314);
                oq5Var.p(false);
            }
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new i4(zwaVar, i);
        }
    }

    public static final void b(iwa iwaVar, zwa zwaVar, hq5 hq5Var, int i) {
        int i2;
        Object v24Var;
        int i3;
        int i4;
        e2o e2oVar;
        zwa zwaVar2 = zwaVar;
        zwaVar2.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1805630476);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(iwaVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(zwaVar2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.f(vci.a) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = tlm.f(gld.R(g.a, oq5Var), oq5Var);
            }
            mm6 mm6Var = ((fs5) K).a;
            d2o d2oVar = d2o.b;
            Object[] objArr = new Object[0];
            d6h d6hVar = new d6h(23);
            kin kinVar = new kin(24);
            apo apoVar = bpo.a;
            apo apoVar2 = new apo(0, d6hVar, kinVar);
            boolean d2 = oq5Var.d(1) | oq5Var.c(1.0f);
            Object K2 = oq5Var.K();
            if (d2 || K2 == kjnVar) {
                K2 = new b6n(20, d2oVar);
                oq5Var.k0(K2);
            }
            e2o e2oVar2 = (e2o) o2g.g0(objArr, apoVar2, (Function0) K2, oq5Var, 0, 4);
            float e2 = irv.e(oq5Var);
            Object K3 = oq5Var.K();
            if (K3 == kjnVar) {
                K3 = szf.g0(Boolean.FALSE);
                oq5Var.k0(K3);
            }
            aqi aqiVar = (aqi) K3;
            float f2 = ((Boolean) aqiVar.getValue()).booleanValue() ? 0.0f : 1.0f;
            ov6 ov6Var = lya.c;
            act S = weo.S(300, 0, ov6Var, 2);
            boolean h = oq5Var.h(zwaVar2);
            Object K4 = oq5Var.K();
            if (h || K4 == kjnVar) {
                K4 = new qua(zwaVar2, 2);
                oq5Var.k0(K4);
            }
            sdr b2 = pk0.b(f2, S, "sheet_alpha", (Function1) K4, oq5Var, 3072, 4);
            oq5Var = oq5Var;
            Unit unit = Unit.a;
            boolean f3 = oq5Var.f(e2oVar2) | oq5Var.h(zwaVar2) | oq5Var.h(mm6Var);
            Object K5 = oq5Var.K();
            if (f3 || K5 == kjnVar) {
                i3 = 0;
                i4 = 2;
                e2oVar = e2oVar2;
                v24Var = new v24(zwaVar2, e2oVar, mm6Var, (Continuation) null, 4);
                oq5Var.k0(v24Var);
            } else {
                i4 = 2;
                v24Var = K5;
                e2oVar = e2oVar2;
                i3 = 0;
            }
            gld.w(oq5Var, unit, (Function2) v24Var);
            zwaVar2 = zwaVar;
            dag.f(e2oVar, weo.S(600, i3, ov6Var, i4), ild.C(1516489765, new bt5(iwaVar, b2, e2, e2oVar, zwaVar, aqiVar), oq5Var), oq5Var, ((i2 >> 3) & 112) | 3072);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new gva(i, iwaVar, zwaVar2);
        }
    }
}
