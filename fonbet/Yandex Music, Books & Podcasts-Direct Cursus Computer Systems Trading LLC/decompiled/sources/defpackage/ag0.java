package defpackage;

import androidx.compose.ui.draw.a;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class ag0 extends uif implements pyc {
    public static final ag0 A;
    public static final ag0 B;
    public static final ag0 C;
    public static final ag0 s;
    public static final ag0 t;
    public static final ag0 u;
    public static final ag0 v;
    public static final ag0 w;
    public static final ag0 x;
    public static final ag0 y;
    public static final ag0 z;
    public final /* synthetic */ int r;

    static {
        int i = 3;
        s = new ag0(i, 0);
        t = new ag0(i, 1);
        u = new ag0(i, 2);
        v = new ag0(i, 3);
        w = new ag0(i, 4);
        x = new ag0(i, 5);
        y = new ag0(i, 6);
        z = new ag0(i, 7);
        A = new ag0(i, 8);
        B = new ag0(i, 9);
        C = new ag0(i, 10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ag0(int i, int i2) {
        super(i);
        this.r = i2;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.r;
        kjn kjnVar = gq5.a;
        switch (i) {
            case 0:
                yci yciVar = (yci) obj;
                ((Number) obj3).intValue();
                oq5 oq5Var = (oq5) ((hq5) obj2);
                oq5Var.Z(-2126899193);
                long j = ((xds) oq5Var.j(yds.a)).a;
                boolean e = oq5Var.e(j);
                Object K = oq5Var.K();
                if (e || K == kjnVar) {
                    K = new zf0(j, r8 ? 1 : 0);
                    oq5Var.k0(K);
                }
                yci f = yciVar.f(a.b(vci.a, (Function1) K));
                oq5Var.p(false);
                return f;
            case 1:
                hq5 hq5Var = (hq5) obj2;
                int intValue = ((Number) obj3).intValue();
                oq5 oq5Var2 = (oq5) hq5Var;
                if (!oq5Var2.P(intValue & 1, (intValue & 17) != 16)) {
                    oq5Var2.S();
                }
                return Unit.a;
            case 2:
                hq5 hq5Var2 = (hq5) obj2;
                int intValue2 = ((Number) obj3).intValue();
                oq5 oq5Var3 = (oq5) hq5Var2;
                if (!oq5Var3.P(intValue2 & 1, (intValue2 & 17) != 16)) {
                    oq5Var3.S();
                }
                return Unit.a;
            case 3:
                Function2 function2 = (Function2) obj;
                hq5 hq5Var3 = (hq5) obj2;
                int intValue3 = ((Number) obj3).intValue();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((oq5) hq5Var3).h(function2) ? 4 : 2;
                }
                oq5 oq5Var4 = (oq5) hq5Var3;
                if (oq5Var4.P(intValue3 & 1, (intValue3 & 19) != 18)) {
                    function2.invoke(oq5Var4, Integer.valueOf(intValue3 & 14));
                } else {
                    oq5Var4.S();
                }
                return Unit.a;
            case 4:
                Function2 function22 = (Function2) obj;
                hq5 hq5Var4 = (hq5) obj2;
                int intValue4 = ((Number) obj3).intValue();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= ((oq5) hq5Var4).h(function22) ? 4 : 2;
                }
                oq5 oq5Var5 = (oq5) hq5Var4;
                if (oq5Var5.P(intValue4 & 1, (intValue4 & 19) != 18)) {
                    function22.invoke(oq5Var5, Integer.valueOf(intValue4 & 14));
                } else {
                    oq5Var5.S();
                }
                return Unit.a;
            case 5:
                i1r i1rVar = (i1r) obj;
                hq5 hq5Var5 = (hq5) obj2;
                int intValue5 = ((Number) obj3).intValue();
                if ((intValue5 & 6) == 0) {
                    intValue5 |= ((oq5) hq5Var5).f(i1rVar) ? 4 : 2;
                }
                oq5 oq5Var6 = (oq5) hq5Var5;
                if (oq5Var6.P(intValue5 & 1, (intValue5 & 19) != 18)) {
                    tyf.i(i1rVar, null, null, oq5Var6, intValue5 & 14, 6);
                } else {
                    oq5Var6.S();
                }
                return Unit.a;
            case 6:
                i1r i1rVar2 = (i1r) obj;
                hq5 hq5Var6 = (hq5) obj2;
                int intValue6 = ((Number) obj3).intValue();
                if ((intValue6 & 6) == 0) {
                    intValue6 |= ((oq5) hq5Var6).f(i1rVar2) ? 4 : 2;
                }
                oq5 oq5Var7 = (oq5) hq5Var6;
                if (oq5Var7.P(intValue6 & 1, (intValue6 & 19) != 18)) {
                    tyf.i(i1rVar2, null, null, oq5Var7, intValue6 & 14, 6);
                } else {
                    oq5Var7.S();
                }
                return Unit.a;
            case 7:
                g1r g1rVar = (g1r) obj;
                hq5 hq5Var7 = (hq5) obj2;
                int intValue7 = ((Number) obj3).intValue();
                if ((intValue7 & 6) == 0) {
                    intValue7 |= (intValue7 & 8) == 0 ? ((oq5) hq5Var7).f(g1rVar) : ((oq5) hq5Var7).h(g1rVar) ? 4 : 2;
                }
                oq5 oq5Var8 = (oq5) hq5Var7;
                if (oq5Var8.P(intValue7 & 1, (intValue7 & 19) != 18)) {
                    l1r.b(g1rVar, null, null, 0L, 0L, 0L, 0.0f, oq5Var8, intValue7 & 14);
                } else {
                    oq5Var8.S();
                }
                return Unit.a;
            case 8:
                zkn zknVar = (zkn) obj;
                hq5 hq5Var8 = (hq5) obj2;
                int intValue8 = ((Number) obj3).intValue();
                if ((intValue8 & 14) == 0) {
                    intValue8 |= ((oq5) hq5Var8).f(zknVar) ? 4 : 2;
                }
                if ((intValue8 & 91) == 18) {
                    oq5 oq5Var9 = (oq5) hq5Var8;
                    if (oq5Var9.z()) {
                        oq5Var9.S();
                        return Unit.a;
                    }
                }
                bzf.o(zknVar, null, null, null, null, null, 0.0f, null, false, hq5Var8, intValue8 & 14);
                return Unit.a;
            case 9:
                ((mif) obj).getClass();
                ((Function1) obj2).getClass();
                ((Function1) obj3).getClass();
                return Unit.a;
            case 10:
                x7t x7tVar = (x7t) obj;
                ((Number) obj3).intValue();
                oq5 oq5Var10 = (oq5) ((hq5) obj2);
                oq5Var10.Z(-1079955085);
                vne vneVar = vne.a;
                vne vneVar2 = vne.b;
                Object S = x7tVar.c(vneVar, vneVar2) ? weo.S(67, 0, nya.d, 2) : (x7tVar.c(vneVar2, vneVar) || x7tVar.c(vne.c, vneVar2)) ? new act(83, 67, nya.d) : weo.Q(0.0f, 0.0f, null, 7);
                oq5Var10.p(false);
                return S;
            case 11:
                ((Number) obj3).intValue();
                oq5 oq5Var11 = (oq5) ((hq5) obj2);
                oq5Var11.Z(359872873);
                WeakHashMap weakHashMap = rqv.w;
                rqv h = z7l.h(oq5Var11);
                boolean f2 = oq5Var11.f(h);
                Object K2 = oq5Var11.K();
                Object obj4 = K2;
                if (f2 || K2 == kjnVar) {
                    doe doeVar = new doe(h.b);
                    oq5Var11.k0(doeVar);
                    obj4 = doeVar;
                }
                doe doeVar2 = (doe) obj4;
                oq5Var11.p(false);
                return doeVar2;
            case 12:
                ((Number) obj3).intValue();
                oq5 oq5Var12 = (oq5) ((hq5) obj2);
                oq5Var12.Z(359872873);
                WeakHashMap weakHashMap2 = rqv.w;
                rqv h2 = z7l.h(oq5Var12);
                boolean f3 = oq5Var12.f(h2);
                Object K3 = oq5Var12.K();
                Object obj5 = K3;
                if (f3 || K3 == kjnVar) {
                    doe doeVar3 = new doe(h2.c);
                    oq5Var12.k0(doeVar3);
                    obj5 = doeVar3;
                }
                doe doeVar4 = (doe) obj5;
                oq5Var12.p(false);
                return doeVar4;
            case 13:
                ((Number) obj3).intValue();
                oq5 oq5Var13 = (oq5) ((hq5) obj2);
                oq5Var13.Z(359872873);
                WeakHashMap weakHashMap3 = rqv.w;
                rqv h3 = z7l.h(oq5Var13);
                boolean f4 = oq5Var13.f(h3);
                Object K4 = oq5Var13.K();
                Object obj6 = K4;
                if (f4 || K4 == kjnVar) {
                    doe doeVar5 = new doe(h3.e);
                    oq5Var13.k0(doeVar5);
                    obj6 = doeVar5;
                }
                doe doeVar6 = (doe) obj6;
                oq5Var13.p(false);
                return doeVar6;
            case 14:
                ((Number) obj3).intValue();
                oq5 oq5Var14 = (oq5) ((hq5) obj2);
                oq5Var14.Z(359872873);
                WeakHashMap weakHashMap4 = rqv.w;
                rqv h4 = z7l.h(oq5Var14);
                boolean f5 = oq5Var14.f(h4);
                Object K5 = oq5Var14.K();
                Object obj7 = K5;
                if (f5 || K5 == kjnVar) {
                    doe doeVar7 = new doe(h4.f);
                    oq5Var14.k0(doeVar7);
                    obj7 = doeVar7;
                }
                doe doeVar8 = (doe) obj7;
                oq5Var14.p(false);
                return doeVar8;
            default:
                ((Number) obj3).intValue();
                oq5 oq5Var15 = (oq5) ((hq5) obj2);
                oq5Var15.Z(359872873);
                WeakHashMap weakHashMap5 = rqv.w;
                rqv h5 = z7l.h(oq5Var15);
                boolean f6 = oq5Var15.f(h5);
                Object K6 = oq5Var15.K();
                Object obj8 = K6;
                if (f6 || K6 == kjnVar) {
                    doe doeVar9 = new doe(h5.g);
                    oq5Var15.k0(doeVar9);
                    obj8 = doeVar9;
                }
                doe doeVar10 = (doe) obj8;
                oq5Var15.p(false);
                return doeVar10;
        }
    }
}
