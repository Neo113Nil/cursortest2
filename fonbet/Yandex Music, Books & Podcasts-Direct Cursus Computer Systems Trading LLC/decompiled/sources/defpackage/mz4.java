package defpackage;

import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.c;
import androidx.compose.foundation.layout.d;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class mz4 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ mz4(float f, aqi aqiVar, fvf fvfVar, jz4 jz4Var, qz4 qz4Var, bz4 bz4Var, qnq qnqVar) {
        this.b = f;
        this.c = aqiVar;
        this.d = fvfVar;
        this.e = jz4Var;
        this.f = qz4Var;
        this.g = bz4Var;
        this.h = qnqVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        final int i;
        ffh ffhVar;
        ffh ffhVar2;
        int i2;
        int i3;
        int i4;
        int i5;
        switch (this.a) {
            case 0:
                aqi aqiVar = (aqi) this.c;
                fvf fvfVar = (fvf) this.d;
                jz4 jz4Var = (jz4) this.e;
                qz4 qz4Var = (qz4) this.f;
                bz4 bz4Var = (bz4) this.g;
                qnq qnqVar = (qnq) this.h;
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    quj.b(fvfVar, ghh.C(ghh.C(zs4.g(oq5Var), ogp.A(oq5Var)), a.c(0.0f, this.b + ((cma) aqiVar.getValue()).a, 0.0f, 0.0f, 13)), jz4Var, etn.d0(qz4Var.a, bz4Var, qnqVar, oq5Var), oq5Var, 0);
                } else {
                    oq5Var.S();
                }
                return Unit.a;
            case 1:
                final iwa iwaVar = (iwa) this.c;
                e2o e2oVar = (e2o) this.d;
                Function2 function2 = (Function2) this.e;
                Function1 function1 = (Function1) this.f;
                u6k u6kVar = (u6k) this.g;
                u6k u6kVar2 = (u6k) this.h;
                dnr dnrVar = (dnr) obj;
                dnrVar.getClass();
                long j = ((ga6) obj2).a;
                long b = ga6.b(j, 0, 0, 0, 0, 10);
                boolean z = iwaVar.a;
                boolean z2 = iwaVar.b;
                float e = e2oVar.g.e();
                if (!z) {
                    e = 1.0f;
                }
                final float f = e;
                int L = dnrVar.L(this.b) + dnrVar.L(rwa.a);
                final int L2 = dnrVar.L(rwa.c);
                int L3 = dnrVar.L(rwa.d);
                int L4 = dnrVar.L(rwa.e);
                int L5 = dnrVar.L(rwa.f);
                final int i6 = 0;
                ffh ffhVar3 = (ffh) CollectionsKt.k0(dnrVar.i("header", new wn5(new Function2() { // from class: pwa
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        switch (i6) {
                            case 0:
                                hq5 hq5Var2 = (hq5) obj3;
                                if ((((Integer) obj4).intValue() & 3) == 2) {
                                    oq5 oq5Var2 = (oq5) hq5Var2;
                                    if (oq5Var2.z()) {
                                        oq5Var2.S();
                                        break;
                                    }
                                }
                                xv7.l(iwaVar, null, hq5Var2, 0);
                            default:
                                hq5 hq5Var3 = (hq5) obj3;
                                if ((((Integer) obj4).intValue() & 3) == 2) {
                                    oq5 oq5Var3 = (oq5) hq5Var3;
                                    if (oq5Var3.z()) {
                                        oq5Var3.S();
                                        break;
                                    }
                                }
                                iwa iwaVar2 = iwaVar;
                                ff7.k(iwaVar2.m, iwaVar2.n, null, hq5Var3, 0, 4);
                        }
                        return Unit.a;
                    }
                }, 1525330219, true)));
                if (iwaVar.f == null || iwaVar.g == null) {
                    i = L4;
                    ffhVar = null;
                } else {
                    i = L4;
                    ffhVar = (ffh) CollectionsKt.k0(dnrVar.i("subtitle", new wn5(new kw5(26, iwaVar, e2oVar), 786401147, true)));
                }
                ffh ffhVar4 = (ffh) CollectionsKt.k0(dnrVar.i("first_button", new wn5(new kw5(27, iwaVar, function1), 228460950, true)));
                ffh ffhVar5 = iwaVar.i != null ? (ffh) CollectionsKt.k0(dnrVar.i("second_button", new wn5(new v48(6, iwaVar, e2oVar, function1), -1927922007, true))) : null;
                if (iwaVar.m == null || iwaVar.n == null) {
                    ffhVar2 = null;
                } else {
                    final int i7 = 1;
                    ffhVar2 = (ffh) CollectionsKt.k0(dnrVar.i("disclaimer", new wn5(new Function2() { // from class: pwa
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            switch (i7) {
                                case 0:
                                    hq5 hq5Var2 = (hq5) obj3;
                                    if ((((Integer) obj4).intValue() & 3) == 2) {
                                        oq5 oq5Var2 = (oq5) hq5Var2;
                                        if (oq5Var2.z()) {
                                            oq5Var2.S();
                                            break;
                                        }
                                    }
                                    xv7.l(iwaVar, null, hq5Var2, 0);
                                default:
                                    hq5 hq5Var3 = (hq5) obj3;
                                    if ((((Integer) obj4).intValue() & 3) == 2) {
                                        oq5 oq5Var3 = (oq5) hq5Var3;
                                        if (oq5Var3.z()) {
                                            oq5Var3.S();
                                            break;
                                        }
                                    }
                                    iwa iwaVar2 = iwaVar;
                                    ff7.k(iwaVar2.m, iwaVar2.n, null, hq5Var3, 0, 4);
                            }
                            return Unit.a;
                        }
                    }, -1630233282, true)));
                }
                long b2 = ia6.b(ga6.i(b), Math.max(ffhVar4.a(ga6.i(b)), ffhVar5 != null ? ffhVar5.a(ga6.i(b)) : 0), 5);
                final ksk M = ffhVar3.M(b);
                ksk M2 = ffhVar != null ? ffhVar.M(b) : null;
                final ksk M3 = ffhVar4.M(b2);
                ksk M4 = ffhVar5 != null ? ffhVar5.M(b2) : null;
                ksk M5 = ffhVar2 != null ? ffhVar2.M(b) : null;
                final int L6 = M2 != null ? dnrVar.L(rwa.h) : 0;
                int L7 = M4 != null ? dnrVar.L(rwa.i) : 0;
                int L8 = M5 != null ? dnrVar.L(rwa.j) : 0;
                int i8 = M.b;
                if (z) {
                    i2 = L + L2 + i8 + i + M3.b;
                    if (M5 != null) {
                        i3 = M5.b;
                        i4 = i3 + L8;
                    }
                    i4 = 0;
                } else {
                    i2 = L + L2 + i8 + (M2 != null ? M2.b + L6 : 0) + i + M3.b + (M4 != null ? M4.b + L7 : 0);
                    if (M5 != null) {
                        i3 = M5.b;
                        i4 = i3 + L8;
                    }
                    i4 = 0;
                }
                int i9 = i2 + i4 + L5;
                if (z) {
                    int i10 = (M2 != null ? M2.b + L6 : 0) + (M4 != null ? M4.b + L7 : 0) + i9;
                    int b3 = eeh.b(e2oVar.e.e() - i10);
                    if (b3 < 0) {
                        b3 = 0;
                    }
                    L3 = Math.min(L3, b3);
                    i5 = i10 + L3;
                } else {
                    i5 = i9;
                }
                if (u6kVar.h() != i9 || u6kVar2.h() != i5) {
                    u6kVar.i(i9);
                    u6kVar2.i(i5);
                    function2.invoke(Integer.valueOf(i9), Integer.valueOf(i5));
                }
                int i11 = z2 ? (ga6.i(j) - M.a) / 2 : 0;
                final int i12 = (M2 == null || !z2) ? 0 : (ga6.i(j) - M2.a) / 2;
                final int i13 = (ga6.i(j) - M3.a) / 2;
                final int i14 = M4 != null ? (ga6.i(j) - M4.a) / 2 : 0;
                final int i15 = M5 != null ? (ga6.i(j) - M5.a) / 2 : 0;
                final int i16 = M.b;
                int i17 = M2 != null ? M2.b : 0;
                final int i18 = M3.b;
                int i19 = M4 != null ? M4.b : 0;
                int i20 = M5 != null ? M5.b : 0;
                final float f2 = z ? L3 * f : 0.0f;
                final float f3 = (L6 + i17) * f;
                final float f4 = (L7 + i19) * f;
                final ksk kskVar = M5;
                final int i21 = i11;
                final ksk kskVar2 = M4;
                final ksk kskVar3 = M2;
                final int i22 = L8;
                return mfh.m0(dnrVar, ga6.i(j), eeh.b(L2 + f2 + i16 + f3 + i + i18 + f4 + L8 + i20 + L5), new Function1() { // from class: qwa
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        jsk jskVar = (jsk) obj3;
                        jskVar.getClass();
                        final float f5 = f2;
                        vp vpVar = new vp(1, f5);
                        ksk kskVar4 = ksk.this;
                        int i23 = i21;
                        int i24 = L2;
                        jsk.j(jskVar, kskVar4, i23, i24, vpVar, 4);
                        ksk kskVar5 = kskVar3;
                        int i25 = i16;
                        if (kskVar5 != null) {
                            final float f6 = f;
                            final int i26 = L6;
                            Function1 function12 = new Function1() { // from class: mwa
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    zco zcoVar = (zco) obj4;
                                    zcoVar.getClass();
                                    zcoVar.y((i26 * f6) + f5);
                                    return Unit.a;
                                }
                            };
                            jsk.j(jskVar, kskVar5, i12, i24 + i25, function12, 4);
                        }
                        int i27 = i24 + i25 + i;
                        final float f7 = f3;
                        jskVar.i(M3, i13, i27, 1.0f, new oo1(f5, f7, 1));
                        ksk kskVar6 = kskVar2;
                        final float f8 = f4;
                        if (kskVar6 != null) {
                            final int i28 = 0;
                            jsk.j(jskVar, kskVar6, i14, i27, new Function1() { // from class: nwa
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    int i29 = i28;
                                    zco zcoVar = (zco) obj4;
                                    zcoVar.getClass();
                                    switch (i29) {
                                        case 0:
                                            zcoVar.y(f5 + f7 + f8);
                                            break;
                                        default:
                                            zcoVar.y(f5 + f7 + f8);
                                            break;
                                    }
                                    return Unit.a;
                                }
                            }, 4);
                        }
                        ksk kskVar7 = kskVar;
                        if (kskVar7 != null) {
                            final int i29 = 1;
                            jsk.j(jskVar, kskVar7, i15, i27 + i18 + i22, new Function1() { // from class: nwa
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    int i292 = i29;
                                    zco zcoVar = (zco) obj4;
                                    zcoVar.getClass();
                                    switch (i292) {
                                        case 0:
                                            zcoVar.y(f5 + f7 + f8);
                                            break;
                                        default:
                                            zcoVar.y(f5 + f7 + f8);
                                            break;
                                    }
                                    return Unit.a;
                                }
                            }, 4);
                        }
                        return Unit.a;
                    }
                });
            case 2:
                ((Integer) obj2).getClass();
                quj.y((c) this.c, this.b, (bvd) this.d, (xud) this.e, (Function1) this.f, (Function0) this.g, (yci) this.h, (hq5) obj, rvf.R(1));
                return Unit.a;
            default:
                l6p l6pVar = (l6p) this.c;
                Function1 function12 = (Function1) this.d;
                j6i j6iVar = (j6i) this.e;
                tmb tmbVar = (tmb) this.f;
                Function0 function0 = (Function0) this.g;
                Function0 function02 = (Function0) this.h;
                hq5 hq5Var2 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    boolean z3 = l6pVar instanceof h6p;
                    vci vciVar = vci.a;
                    if (z3) {
                        oq5Var2.Z(58659713);
                        ta5 a = sa5.a(qx0.c, b2c.n, oq5Var2, 0);
                        int i23 = oq5Var2.P;
                        androidx.compose.runtime.internal.a l = oq5Var2.l();
                        yci H = vnj.H(oq5Var2, vciVar);
                        xp5.T.getClass();
                        grb grbVar = wp5.b;
                        oq5Var2.d0();
                        if (oq5Var2.O) {
                            oq5Var2.k(grbVar);
                        } else {
                            oq5Var2.n0();
                        }
                        g0g.U(oq5Var2, a, wp5.f);
                        g0g.U(oq5Var2, l, wp5.e);
                        kb5 kb5Var = wp5.g;
                        if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i23))) {
                            ouj.x(i23, oq5Var2, i23, kb5Var);
                        }
                        g0g.U(oq5Var2, H, wp5.d);
                        h6p h6pVar = (h6p) l6pVar;
                        vut.n(h6pVar.d, h6pVar.e, h6pVar.f, h6pVar.g, function12, d.c(vciVar, 1.0f), oq5Var2, 196608);
                        oq5Var2.p(true);
                        oq5Var2.p(false);
                    } else if (Intrinsics.d(l6pVar, i6p.a)) {
                        oq5Var2.Z(59318649);
                        etn.l(jzj.a.a(null), ild.C(-1511788489, new hon(10, j6iVar, tmbVar), oq5Var2), oq5Var2, 56);
                        oq5Var2.p(false);
                    } else if (l6pVar instanceof j6p) {
                        oq5Var2.Z(59747162);
                        yci q = a.q(vciVar, 0.0f, 24, 0.0f, 0.0f, 13);
                        kfh d = ug3.d(b2c.b, false);
                        int i24 = oq5Var2.P;
                        androidx.compose.runtime.internal.a l2 = oq5Var2.l();
                        yci H2 = vnj.H(oq5Var2, q);
                        xp5.T.getClass();
                        grb grbVar2 = wp5.b;
                        oq5Var2.d0();
                        if (oq5Var2.O) {
                            oq5Var2.k(grbVar2);
                        } else {
                            oq5Var2.n0();
                        }
                        g0g.U(oq5Var2, d, wp5.f);
                        g0g.U(oq5Var2, l2, wp5.e);
                        kb5 kb5Var2 = wp5.g;
                        if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i24))) {
                            ouj.x(i24, oq5Var2, i24, kb5Var2);
                        }
                        g0g.U(oq5Var2, H2, wp5.d);
                        y5g.k(((j6p) l6pVar).a, j6iVar, 0, null, oq5Var2, 384, 8);
                        oq5Var2.p(true);
                        oq5Var2.p(false);
                    } else {
                        if (!(l6pVar instanceof k6p)) {
                            throw vz1.i(oq5Var2, 278986283, false);
                        }
                        oq5Var2.Z(60056170);
                        k6p k6pVar = (k6p) l6pVar;
                        t7g.e(k6pVar.a, k6pVar.f, k6pVar.g, k6pVar.h, function12, j6iVar, tmbVar, function0, this.b, null, function02, oq5Var2, 2097152);
                        oq5Var2.p(false);
                    }
                } else {
                    oq5Var2.S();
                }
                return Unit.a;
        }
    }

    public /* synthetic */ mz4(iwa iwaVar, e2o e2oVar, float f, Function2 function2, Function1 function1, u6k u6kVar, u6k u6kVar2) {
        this.c = iwaVar;
        this.d = e2oVar;
        this.b = f;
        this.e = function2;
        this.f = function1;
        this.g = u6kVar;
        this.h = u6kVar2;
    }

    public /* synthetic */ mz4(l6p l6pVar, Function1 function1, j6i j6iVar, tmb tmbVar, Function0 function0, float f, Function0 function02) {
        this.c = l6pVar;
        this.d = function1;
        this.e = j6iVar;
        this.f = tmbVar;
        this.g = function0;
        this.b = f;
        this.h = function02;
    }

    public /* synthetic */ mz4(c cVar, float f, bvd bvdVar, xud xudVar, Function1 function1, Function0 function0, yci yciVar, int i) {
        this.c = cVar;
        this.b = f;
        this.d = bvdVar;
        this.e = xudVar;
        this.f = function1;
        this.g = function0;
        this.h = yciVar;
    }
}
