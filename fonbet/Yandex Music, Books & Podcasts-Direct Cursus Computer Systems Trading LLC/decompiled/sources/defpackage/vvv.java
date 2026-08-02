package defpackage;

import androidx.compose.animation.b;
import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.d;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class vvv {
    public static final float a = 36;
    public static final float b = 24;
    public static final float c = 2;

    public static final void a(ArrayList arrayList, hq5 hq5Var, int i) {
        boolean z;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1597919351);
        int i2 = (oq5Var.f(arrayList) ? 4 : 2) | i;
        if ((i2 & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            Object K = oq5Var.K();
            Object obj = gq5.a;
            if (K == obj) {
                int size = arrayList.size();
                if (size > 2) {
                    size = 3;
                }
                K = szf.g0(Integer.valueOf(size));
                oq5Var.k0(K);
            }
            final aqi aqiVar = (aqi) K;
            boolean d = oq5Var.d(((Number) aqiVar.getValue()).intValue());
            Object K2 = oq5Var.K();
            boolean z2 = true;
            final int i3 = 0;
            if (d || K2 == obj) {
                int intValue = ((Number) aqiVar.getValue()).intValue() - 1;
                if (intValue < 0) {
                    intValue = 0;
                }
                K2 = szf.g0(Integer.valueOf(intValue));
                oq5Var.k0(K2);
            }
            final aqi aqiVar2 = (aqi) K2;
            Object K3 = oq5Var.K();
            if (K3 == obj) {
                K3 = szf.g0(CollectionsKt.r0(arrayList, ((Number) aqiVar.getValue()).intValue()));
                oq5Var.k0(K3);
            }
            final aqi aqiVar3 = (aqi) K3;
            Object K4 = oq5Var.K();
            if (K4 == obj) {
                K4 = szf.g0(Integer.valueOf(((Number) aqiVar2.getValue()).intValue()));
                oq5Var.k0(K4);
            }
            final aqi aqiVar4 = (aqi) K4;
            Object K5 = oq5Var.K();
            if (K5 == obj) {
                K5 = szf.g0(Integer.valueOf(arrayList.size()));
                oq5Var.k0(K5);
            }
            aqi aqiVar5 = (aqi) K5;
            Object K6 = oq5Var.K();
            if (K6 == obj) {
                K6 = vq2.a(0.0f);
                oq5Var.k0(K6);
            }
            final fk0 fk0Var = (fk0) K6;
            boolean f = ((i2 & 14) == 4) | oq5Var.f(aqiVar2) | oq5Var.h(fk0Var);
            Object K7 = oq5Var.K();
            if (f || K7 == obj) {
                Object nw1Var = new nw1(arrayList, fk0Var, aqiVar3, aqiVar2, aqiVar4, aqiVar5, aqiVar, null);
                oq5Var.k0(nw1Var);
                K7 = nw1Var;
            }
            gld.w(oq5Var, arrayList, (Function2) K7);
            if (((Number) aqiVar.getValue()).intValue() != 0) {
                oq5Var.Z(1804798804);
                final float Q = ff7.Q(a, oq5Var);
                final float Q2 = ff7.Q(b, oq5Var);
                final float Q3 = ff7.Q(c, oq5Var);
                oq5Var.Z(1997888651);
                int intValue2 = ((Number) aqiVar.getValue()).intValue();
                ArrayList arrayList2 = new ArrayList(intValue2);
                z = false;
                while (i3 < intValue2) {
                    arrayList2.add(ild.C(-70112089, new Function2() { // from class: svv
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            hq5 hq5Var2 = (hq5) obj2;
                            Number number = 0;
                            if ((((Integer) obj3).intValue() & 3) == 2) {
                                oq5 oq5Var2 = (oq5) hq5Var2;
                                if (oq5Var2.z()) {
                                    oq5Var2.S();
                                    return Unit.a;
                                }
                            }
                            final int i4 = i3;
                            final float f2 = Q2;
                            final fk0 fk0Var2 = fk0Var;
                            final float f3 = Q;
                            final float f4 = Q3;
                            final aqi aqiVar6 = aqiVar4;
                            aqi aqiVar7 = aqiVar;
                            aqi aqiVar8 = aqiVar3;
                            if (i4 == 1 && ((Number) aqiVar6.getValue()).intValue() == 0 && ((Number) aqiVar7.getValue()).intValue() == 2) {
                                number = Float.valueOf(((Number) fk0Var2.e()).floatValue() * (-f2));
                            } else if (i4 <= ((Number) aqiVar6.getValue()).intValue() && (i4 != 0 || ((Number) aqiVar7.getValue()).intValue() == 1)) {
                                number = i4 == u75.g((List) aqiVar8.getValue()) ? Float.valueOf(((Number) fk0Var2.e()).floatValue() * (f3 + f4)) : Float.valueOf(((Number) fk0Var2.e()).floatValue() * f2);
                            }
                            int intValue3 = number.intValue();
                            ctv ctvVar = (ctv) CollectionsKt.S((List) aqiVar8.getValue(), i4);
                            oq5 oq5Var3 = (oq5) hq5Var2;
                            if (ctvVar == null) {
                                oq5Var3.Z(-1353959077);
                                oq5Var3.p(false);
                            } else {
                                oq5Var3.Z(-1353959076);
                                boolean d2 = oq5Var3.d(intValue3);
                                Object K8 = oq5Var3.K();
                                kjn kjnVar = gq5.a;
                                if (d2 || K8 == kjnVar) {
                                    K8 = new cv0(intValue3, 8);
                                    oq5Var3.k0(K8);
                                }
                                vci vciVar = vci.a;
                                yci u = xp3.u(a.i(vciVar, (Function1) K8), ugo.a);
                                float f5 = vvv.a;
                                float f6 = (f5 / 2) + vvv.c;
                                boolean z3 = i4 == u75.g((List) aqiVar8.getValue());
                                gar garVar = gar.a;
                                boolean c2 = oq5Var3.c(f3) | oq5Var3.c(f2) | oq5Var3.d(i4);
                                final aqi aqiVar9 = aqiVar2;
                                boolean f7 = c2 | oq5Var3.f(aqiVar9) | oq5Var3.c(f4) | oq5Var3.h(fk0Var2);
                                Object K9 = oq5Var3.K();
                                if (f7 || K9 == kjnVar) {
                                    Function1 function1 = new Function1() { // from class: tvv
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj4) {
                                            float f8;
                                            Number number2;
                                            ((jx7) obj4).getClass();
                                            float f9 = 2;
                                            float f10 = f3 / f9;
                                            float f11 = f2 + f10;
                                            int intValue4 = ((Number) aqiVar9.getValue()).intValue() - 1;
                                            int i5 = i4;
                                            boolean z4 = i5 == intValue4 && i5 <= ((Number) aqiVar6.getValue()).intValue();
                                            float f12 = f4;
                                            fk0 fk0Var3 = fk0Var2;
                                            if (!z4 || i5 != 0) {
                                                if (z4) {
                                                    f8 = f10 - (f12 * f9);
                                                    number2 = (Number) fk0Var3.e();
                                                }
                                                return new enj(swf.i(f11, f10));
                                            }
                                            f8 = f11 - (f12 * f9);
                                            number2 = (Number) fk0Var3.e();
                                            f11 = hrg.f(number2, f8, f11);
                                            return new enj(swf.i(f11, f10));
                                        }
                                    };
                                    oq5Var3.k0(function1);
                                    K9 = function1;
                                }
                                asq.s(ctvVar.a(), xee.w(u, f5, f6, z3, garVar, (Function1) K9), d.m(vciVar, f5), null, null, oq5Var3, 384);
                                oq5Var3.p(false);
                            }
                            return Unit.a;
                        }
                    }, oq5Var));
                    i3++;
                    z2 = z2;
                }
                boolean z3 = z2;
                oq5Var.p(false);
                Object K8 = oq5Var.K();
                if (K8 == obj) {
                    K8 = new uvv(aqiVar);
                    oq5Var.k0(K8);
                }
                ggi ggiVar = (ggi) K8;
                wn5 o = ghh.o(arrayList2);
                Object K9 = oq5Var.K();
                if (K9 == obj) {
                    K9 = new hgi(ggiVar);
                    oq5Var.k0(K9);
                }
                kfh kfhVar = (kfh) K9;
                int i4 = oq5Var.P;
                androidx.compose.runtime.internal.a l = oq5Var.l();
                yci H = vnj.H(oq5Var, vci.a);
                xp5.T.getClass();
                Function0 function0 = wp5.b;
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.k(function0);
                } else {
                    oq5Var.n0();
                }
                g0g.U(oq5Var, kfhVar, wp5.f);
                g0g.U(oq5Var, l, wp5.e);
                kb5 kb5Var = wp5.g;
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                    ouj.x(i4, oq5Var, i4, kb5Var);
                }
                g0g.U(oq5Var, H, wp5.d);
                o.invoke(oq5Var, 0);
                oq5Var.p(z3);
            } else {
                z = false;
                oq5Var.Z(1799862457);
            }
            oq5Var.p(z);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new yt6(arrayList, i, 2);
        }
    }

    public static final void b(ArrayList arrayList, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(330770688);
        int i2 = (oq5Var.f(arrayList) ? 4 : 2) | i;
        if ((i2 & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            yci x = d.x(b.a(xp3.u(vci.a, ugo.a), weo.S(300, 0, lya.c, 2), 2), null, 3);
            kfh d = ug3.d(b2c.b, false);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, x);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            a(arrayList, oq5Var, i2 & 14);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new yt6(arrayList, i, 1);
        }
    }
}
