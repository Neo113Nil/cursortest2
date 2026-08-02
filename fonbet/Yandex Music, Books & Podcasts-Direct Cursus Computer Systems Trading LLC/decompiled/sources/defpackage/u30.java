package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.internal.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class u30 extends uif implements Function2 {
    public final /* synthetic */ int r;
    public final /* synthetic */ Function2 s;
    public final /* synthetic */ wn5 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u30(Function2 function2, wn5 wn5Var, int i) {
        super(2);
        this.r = i;
        this.s = function2;
        this.t = wn5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        wn5 C;
        switch (this.r) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Number) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    ta5 a = sa5.a(qx0.c, b2c.n, oq5Var, 0);
                    int i = oq5Var.P;
                    a l = oq5Var.l();
                    yci H = vnj.H(oq5Var, vci.a);
                    xp5.T.getClass();
                    grb grbVar = wp5.b;
                    oq5Var.d0();
                    if (oq5Var.O) {
                        oq5Var.k(grbVar);
                    } else {
                        oq5Var.n0();
                    }
                    g0g.U(oq5Var, a, wp5.f);
                    g0g.U(oq5Var, l, wp5.e);
                    kb5 kb5Var = wp5.g;
                    if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i))) {
                        ouj.x(i, oq5Var, i, kb5Var);
                    }
                    g0g.U(oq5Var, H, wp5.d);
                    oq5Var.Z(-366997612);
                    oq5Var.p(false);
                    Function2 function2 = this.s;
                    if (function2 == null) {
                        oq5Var.Z(-366576167);
                        oq5Var.p(false);
                        C = null;
                    } else {
                        oq5Var.Z(-366576166);
                        C = ild.C(1965858367, new t30(function2, 1), oq5Var);
                        oq5Var.p(false);
                    }
                    z30.a(null, C, oq5Var, 6);
                    eta.l(0, this.t, oq5Var, true);
                } else {
                    oq5Var.S();
                }
                break;
            case 1:
                hq5 hq5Var2 = (hq5) obj;
                int intValue2 = ((Number) obj2).intValue();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Function2 function22 = this.s;
                    if (function22 == null) {
                        oq5Var2.Z(-1324738946);
                    } else {
                        oq5Var2.Z(1481287139);
                        function22.invoke(oq5Var2, 0);
                    }
                    oq5Var2.p(false);
                    this.t.invoke(oq5Var2, 0);
                } else {
                    oq5Var2.S();
                }
                break;
            case 2:
                hq5 hq5Var3 = (hq5) obj;
                int intValue3 = ((Number) obj2).intValue();
                oq5 oq5Var3 = (oq5) hq5Var3;
                if (oq5Var3.P(intValue3 & 1, (intValue3 & 3) != 2)) {
                    float f = 8;
                    yci n = androidx.compose.foundation.layout.a.n(d.d(vci.a, 1.0f), f, 2);
                    kfh d = ug3.d(b2c.b, false);
                    int i2 = oq5Var3.P;
                    a l2 = oq5Var3.l();
                    yci H2 = vnj.H(oq5Var3, n);
                    xp5.T.getClass();
                    grb grbVar2 = wp5.b;
                    oq5Var3.d0();
                    if (oq5Var3.O) {
                        oq5Var3.k(grbVar2);
                    } else {
                        oq5Var3.n0();
                    }
                    g0g.U(oq5Var3, d, wp5.f);
                    g0g.U(oq5Var3, l2, wp5.e);
                    kb5 kb5Var2 = wp5.g;
                    if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i2))) {
                        ouj.x(i2, oq5Var3, i2, kb5Var2);
                    }
                    g0g.U(oq5Var3, H2, wp5.d);
                    z30.c(f, 12, ild.C(-563890224, new u30(this.s, this.t, 1), oq5Var3), oq5Var3, 438);
                    oq5Var3.p(true);
                } else {
                    oq5Var3.S();
                }
                break;
            case 3:
                hq5 hq5Var4 = (hq5) obj;
                int intValue4 = ((Number) obj2).intValue();
                oq5 oq5Var4 = (oq5) hq5Var4;
                if (oq5Var4.P(intValue4 & 1, (intValue4 & 3) != 2)) {
                    wn5 wn5Var = this.t;
                    Function2 function23 = this.s;
                    if (function23 == null) {
                        oq5Var4.Z(1850968129);
                        l1r.d(wn5Var, oq5Var4, 0);
                        oq5Var4.p(false);
                    } else {
                        oq5Var4.Z(1850972359);
                        l1r.c(wn5Var, function23, oq5Var4, 0);
                        oq5Var4.p(false);
                    }
                } else {
                    oq5Var4.S();
                }
                break;
            case 4:
                hq5 hq5Var5 = (hq5) obj;
                int intValue5 = ((Number) obj2).intValue();
                oq5 oq5Var5 = (oq5) hq5Var5;
                if (oq5Var5.P(intValue5 & 1, (intValue5 & 3) != 2)) {
                    xcs.a(((udt) oq5Var5.j(wdt.b)).j, ild.C(225114541, new u30(this.s, this.t, 3), oq5Var5), oq5Var5, 48);
                } else {
                    oq5Var5.S();
                }
                break;
            default:
                hq5 hq5Var6 = (hq5) obj;
                int intValue6 = ((Number) obj2).intValue();
                oq5 oq5Var6 = (oq5) hq5Var6;
                if (oq5Var6.P(intValue6 & 1, (intValue6 & 3) != 2)) {
                    qs5 qs5Var = mb6.a;
                    long j = ((d85) oq5Var6.j(sb6.a)).a;
                    etn.l(qs5Var.a(Float.valueOf((!((ma5) oq5Var6.j(pa5.a)).g() ? ((double) c3x.N(j)) < 0.5d : ((double) c3x.N(j)) > 0.5d) ? 0.87f : 1.0f)), ild.C(1939362236, new u30(this.s, this.t, 4), oq5Var6), oq5Var6, 56);
                } else {
                    oq5Var6.S();
                }
                break;
        }
        return Unit.a;
    }
}
