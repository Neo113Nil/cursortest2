package defpackage;

import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.c;
import androidx.compose.foundation.layout.d;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class u04 implements pyc {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ u04(zpd zpdVar, yci yciVar, o0k o0kVar, float f, f14 f14Var) {
        this.a = 0;
        this.c = zpdVar;
        this.d = yciVar;
        this.e = o0kVar;
        this.b = f;
        this.f = f14Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        hq5 hq5Var;
        boolean z;
        hq5 hq5Var2;
        ?? r9;
        float f;
        Function0 function0;
        float f2;
        boolean z2;
        float f3;
        float f4;
        int i = this.a;
        float f5 = this.b;
        Object obj4 = gq5.a;
        Object obj5 = this.f;
        Object obj6 = this.e;
        Object obj7 = this.d;
        Object obj8 = this.c;
        switch (i) {
            case 0:
                zpd zpdVar = (zpd) obj8;
                yci yciVar = (yci) obj7;
                o0k o0kVar = (o0k) obj6;
                f14 f14Var = (f14) obj5;
                lht lhtVar = (lht) obj;
                hq5 hq5Var3 = (hq5) obj2;
                int intValue = ((Integer) obj3).intValue();
                lhtVar.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((oq5) hq5Var3).f(lhtVar) ? 4 : 2;
                }
                boolean z3 = (intValue & 19) != 18;
                int i2 = intValue & 1;
                oq5 oq5Var = (oq5) hq5Var3;
                if (oq5Var.P(i2, z3)) {
                    boolean z4 = lhtVar instanceof lgt;
                    float f6 = this.b;
                    if (z4) {
                        oq5Var.Z(2136118769);
                        boolean z5 = ((lgt) lhtVar).b;
                        Object K = oq5Var.K();
                        if (K == obj4) {
                            K = new zj3(29);
                            oq5Var.k0(K);
                        }
                        bg3.h(z5, zpdVar, nfp.a(yciVar, (Function1) K), o0kVar, f6, oq5Var, 0);
                        oq5Var.p(false);
                    } else {
                        if (!(lhtVar instanceof ygt)) {
                            throw vz1.i(oq5Var, 68905350, false);
                        }
                        oq5Var.Z(2136530232);
                        bg3.b(((ygt) lhtVar).b, f14Var, yciVar, zpdVar == zpd.k, o0kVar, f6, oq5Var, 0);
                        oq5Var.p(false);
                    }
                } else {
                    oq5Var.S();
                }
                return Unit.a;
            case 1:
                cvd cvdVar = (cvd) obj7;
                ((Integer) obj3).getClass();
                ((am0) obj).getClass();
                quj.y((c) obj8, this.b, cvdVar.b, cvdVar.c, (Function1) obj6, (Function0) obj5, null, (hq5) obj2, 0);
                return Unit.a;
            case 2:
                Function0 function02 = (Function0) obj8;
                aqi aqiVar = (aqi) obj7;
                aqi aqiVar2 = (aqi) obj6;
                aqi aqiVar3 = (aqi) obj5;
                hq5 hq5Var4 = (hq5) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((ua5) obj).getClass();
                if ((intValue2 & 17) == 16) {
                    oq5 oq5Var2 = (oq5) hq5Var4;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        return Unit.a;
                    }
                }
                vci vciVar = vci.a;
                float f7 = 16;
                yci b = a.b(xp3.u(d.e(d.d(vciVar, 1.0f), f5), ugo.c(f7, f7)), d85.b, vnj.i);
                kfh d = ug3.d(b2c.b, false);
                oq5 oq5Var3 = (oq5) hq5Var4;
                int i3 = oq5Var3.P;
                androidx.compose.runtime.internal.a l = oq5Var3.l();
                yci H = vnj.H(hq5Var4, b);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var3.d0();
                if (oq5Var3.O) {
                    oq5Var3.k(grbVar);
                } else {
                    oq5Var3.n0();
                }
                g0g.U(hq5Var4, d, wp5.f);
                g0g.U(hq5Var4, l, wp5.e);
                kb5 kb5Var = wp5.g;
                if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i3))) {
                    ouj.x(i3, oq5Var3, i3, kb5Var);
                }
                g0g.U(hq5Var4, H, wp5.d);
                xcv xcvVar = (xcv) aqiVar.getValue();
                if (xcvVar != null) {
                    oq5Var3.Z(-1612898295);
                    yci a0 = gut.a0(d.c(vciVar, 1.0f));
                    Object K2 = oq5Var3.K();
                    if (K2 == obj4) {
                        K2 = new xfv(118);
                        oq5Var3.k0(K2);
                    }
                    xfv xfvVar = (xfv) K2;
                    Object K3 = oq5Var3.K();
                    if (K3 == obj4) {
                        K3 = new j0h(aqiVar2);
                        oq5Var3.k0(K3);
                    }
                    ixf.n(xcvVar, a0, (j0h) K3, 0L, xfvVar, null, null, null, null, false, hq5Var4, 199680, 0, 2000);
                    hq5Var = hq5Var4;
                    z = false;
                } else {
                    hq5Var = hq5Var4;
                    z = false;
                    oq5Var3.Z(-1617410221);
                }
                oq5Var3.p(z);
                if (((Boolean) aqiVar2.getValue()).booleanValue()) {
                    oq5Var3.Z(-1611466560);
                    c3x.m(48, 0, 600L, hq5Var, d.x(gut.a0(d.c(vciVar, 1.0f)), b2c.f, 2));
                    hq5Var2 = hq5Var;
                    r9 = 0;
                } else {
                    hq5Var2 = hq5Var;
                    r9 = 0;
                    oq5Var3.Z(-1617410221);
                }
                oq5Var3.p(r9);
                iz2 iz2Var = b2c.c;
                b bVar = b.a;
                ot0.f(r9, r9, hq5Var2, bVar.a(vciVar, iz2Var));
                v3g.g(r9, hq5Var2, androidx.compose.foundation.layout.a.n(gut.a0(d.d(bVar.a(vciVar, b2c.i), 1.0f)), f7, f7), function02, ((Boolean) aqiVar3.getValue()).booleanValue());
                oq5Var3.p(true);
                return Unit.a;
            default:
                uoi uoiVar = (uoi) obj8;
                Function0 function03 = (Function0) obj7;
                Function1 function1 = (Function1) obj6;
                Function0 function04 = (Function0) obj5;
                c cVar = (c) obj;
                hq5 hq5Var5 = (hq5) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                cVar.getClass();
                long j = cVar.b;
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((oq5) hq5Var5).f(cVar) ? 4 : 2;
                }
                oq5 oq5Var4 = (oq5) hq5Var5;
                if (oq5Var4.P(intValue3 & 1, (intValue3 & 19) != 18)) {
                    final float f8 = 2;
                    float f9 = 12;
                    float f10 = 8;
                    agr agrVar = es5.h;
                    float n0 = ((jx7) oq5Var4.j(agrVar)).n0(f10);
                    float i4 = ga6.i(j);
                    if (i4 < 1.0f) {
                        i4 = 1.0f;
                    }
                    float c = yhn.c((ga6.i(j) - n0) - ((jx7) oq5Var4.j(agrVar)).n0(4), 1.0f, i4);
                    Object K4 = oq5Var4.K();
                    if (K4 == obj4) {
                        K4 = szf.g0(Float.valueOf(0.0f));
                        oq5Var4.k0(K4);
                    }
                    aqi aqiVar4 = (aqi) K4;
                    Object K5 = oq5Var4.K();
                    if (K5 == obj4) {
                        K5 = szf.g0(Boolean.TRUE);
                        oq5Var4.k0(K5);
                    }
                    aqi aqiVar5 = (aqi) K5;
                    Object K6 = oq5Var4.K();
                    if (K6 == obj4) {
                        K6 = szf.g0(Float.valueOf(f5));
                        oq5Var4.k0(K6);
                    }
                    final aqi aqiVar6 = (aqi) K6;
                    if (((Number) aqiVar4.getValue()).floatValue() != 0.0f || ((Boolean) aqiVar5.getValue()).booleanValue()) {
                        f = f9;
                        function0 = function04;
                    } else {
                        f = f9;
                        float f11 = 100;
                        function0 = function04;
                        aqiVar5.setValue(Boolean.valueOf(((int) (f5 * f11)) == ((int) (((Number) aqiVar6.getValue()).floatValue() * f11))));
                    }
                    if (((Boolean) aqiVar5.getValue()).booleanValue() && ((Number) aqiVar4.getValue()).floatValue() == 0.0f) {
                        aqiVar6.setValue(Float.valueOf(f5));
                    }
                    boolean c2 = oq5Var4.c(i4);
                    Object K7 = oq5Var4.K();
                    if (c2 || K7 == obj4) {
                        ta0 ta0Var = new ta0(c, function1, aqiVar4, aqiVar6);
                        kr3 kr3Var = zoa.a;
                        K7 = new nl7(ta0Var);
                        oq5Var4.k0(K7);
                    }
                    cpa cpaVar = (cpa) K7;
                    bxj bxjVar = bxj.b;
                    boolean f12 = oq5Var4.f(function03) | oq5Var4.c(n0) | oq5Var4.c(c) | oq5Var4.f(function1);
                    Object K8 = oq5Var4.K();
                    if (f12 || K8 == obj4) {
                        K8 = new l9u(function03, n0, c, function1, aqiVar4, aqiVar6, null);
                        f2 = c;
                        oq5Var4.k0(K8);
                    } else {
                        f2 = c;
                    }
                    pyc pycVar = (pyc) K8;
                    Function0 function05 = function0;
                    boolean f13 = oq5Var4.f(function05);
                    Object K9 = oq5Var4.K();
                    if (f13 || K9 == obj4) {
                        K9 = new v42(function05, aqiVar4, aqiVar5, (Continuation) null);
                        oq5Var4.k0(K9);
                    }
                    vci vciVar2 = vci.a;
                    yci a = zoa.a(vciVar2, cpaVar, bxjVar, false, uoiVar, true, pycVar, (pyc) K9, false, 132);
                    boolean c3 = oq5Var4.c(f5) | oq5Var4.f(function1);
                    Object K10 = oq5Var4.K();
                    if (c3 || K10 == obj4) {
                        z2 = false;
                        K10 = new j9u(f5, function1, 0);
                        oq5Var4.k0(K10);
                    } else {
                        z2 = false;
                    }
                    yci C = dag.C(nfp.b(a, z2, (Function1) K10), f5);
                    kfh d2 = ug3.d(b2c.b, z2);
                    int i5 = oq5Var4.P;
                    androidx.compose.runtime.internal.a l2 = oq5Var4.l();
                    yci H2 = vnj.H(oq5Var4, C);
                    xp5.T.getClass();
                    grb grbVar2 = wp5.b;
                    oq5Var4.d0();
                    if (oq5Var4.O) {
                        oq5Var4.k(grbVar2);
                    } else {
                        oq5Var4.n0();
                    }
                    g0g.U(oq5Var4, d2, wp5.f);
                    g0g.U(oq5Var4, l2, wp5.e);
                    kb5 kb5Var2 = wp5.g;
                    if (oq5Var4.O || !Intrinsics.d(oq5Var4.K(), Integer.valueOf(i5))) {
                        ouj.x(i5, oq5Var4, i5, kb5Var2);
                    }
                    g0g.U(oq5Var4, H2, wp5.d);
                    yci c4 = d.c(vciVar2, 1.0f);
                    boolean c5 = oq5Var4.c(f2) | oq5Var4.c(i4);
                    Object K11 = oq5Var4.K();
                    if (c5 || K11 == obj4) {
                        final float f14 = f;
                        final float f15 = f2;
                        final float f16 = i4;
                        K11 = new Function1() { // from class: k9u
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj9) {
                                jpa jpaVar = (jpa) obj9;
                                jpaVar.getClass();
                                long j2 = d85.f;
                                float f17 = f14;
                                long a2 = enj.a(0.0f, jpaVar.n0(f17), 1, 0L);
                                aqi aqiVar7 = aqiVar6;
                                float floatValue = ((Number) aqiVar7.getValue()).floatValue();
                                float f18 = f15;
                                float n02 = jpaVar.n0(f17);
                                long floatToRawIntBits = (Float.floatToRawIntBits(n02) & 4294967295L) | (Float.floatToRawIntBits(floatValue * f18) << 32);
                                float f19 = f8;
                                jpaVar.s(j2, a2, floatToRawIntBits, (r18 & 8) != 0 ? 0.0f : jpaVar.n0(f19), (r18 & 16) != 0 ? 0 : 1);
                                long b2 = d85.b(j2, 0.5f, 0.0f, 0.0f, 0.0f, 14);
                                float n03 = jpaVar.n0(12) + (((Number) aqiVar7.getValue()).floatValue() * f18);
                                float n04 = jpaVar.n0(f17);
                                float n05 = jpaVar.n0(f17);
                                jpaVar.s(b2, (Float.floatToRawIntBits(n03) << 32) | (Float.floatToRawIntBits(n04) & 4294967295L), (Float.floatToRawIntBits(f16) << 32) | (Float.floatToRawIntBits(n05) & 4294967295L), (r18 & 8) != 0 ? 0.0f : jpaVar.n0(f19), (r18 & 16) != 0 ? 0 : 1);
                                return Unit.a;
                            }
                        };
                        f3 = f15;
                        f4 = f8;
                        oq5Var4.k0(K11);
                    } else {
                        f3 = f2;
                        f4 = f8;
                    }
                    ksw.j(6, oq5Var4, c4, (Function1) K11);
                    q7g.m(hrg.f((Number) aqiVar6.getValue(), ((jx7) oq5Var4.j(agrVar)).d0(f3), f4), uoiVar, f10, oq5Var4, 3078);
                    oq5Var4.p(true);
                } else {
                    oq5Var4.S();
                }
                return Unit.a;
        }
    }

    public /* synthetic */ u04(float f, Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = f;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ u04(c cVar, float f, cvd cvdVar, Function1 function1, Function0 function0) {
        this.a = 1;
        this.c = cVar;
        this.b = f;
        this.d = cvdVar;
        this.e = function1;
        this.f = function0;
    }
}
