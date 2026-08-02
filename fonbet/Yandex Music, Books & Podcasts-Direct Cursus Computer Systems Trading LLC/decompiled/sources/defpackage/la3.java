package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.internal.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class la3 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ iab c;
    public final /* synthetic */ pbu d;

    public /* synthetic */ la3(Function0 function0, iab iabVar, pbu pbuVar, int i) {
        this.a = i;
        this.b = function0;
        this.c = iabVar;
        this.d = pbuVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        hq5 hq5Var = (hq5) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    Function0 function0 = this.b;
                    pbu pbuVar = this.d;
                    if (function0 != null) {
                        oq5Var.Z(-793769223);
                        iab iabVar = this.c;
                        if (iabVar.h != null || iabVar.d.length() > 0) {
                            oq5Var.Z(-793682454);
                            yci c0 = zsd.c0(d.c(vci.a, 1.0f), function0);
                            kfh d = ug3.d(b2c.b, false);
                            int i2 = oq5Var.P;
                            a l = oq5Var.l();
                            yci H = vnj.H(oq5Var, c0);
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
                            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i2))) {
                                ouj.x(i2, oq5Var, i2, kb5Var);
                            }
                            g0g.U(oq5Var, H, wp5.d);
                            if (iabVar.h != null) {
                                oq5Var.Z(705251987);
                                t7g.j(pbuVar, null, null, null, oq5Var, 0, 14);
                            } else {
                                oq5Var.Z(699008308);
                            }
                            oq5Var.p(false);
                            oq5Var.p(true);
                        } else {
                            oq5Var.Z(-799638608);
                        }
                        oq5Var.p(false);
                        oq5Var.p(false);
                    } else {
                        oq5Var.Z(-793121602);
                        t7g.j(pbuVar, null, null, null, oq5Var, 0, 14);
                        oq5Var.p(false);
                    }
                } else {
                    oq5Var.S();
                }
                break;
            default:
                oq5 oq5Var2 = (oq5) hq5Var;
                if (oq5Var2.P(intValue & 1, (intValue & 3) != 2)) {
                    vci vciVar = vci.a;
                    Function0 function02 = this.b;
                    pbu pbuVar2 = this.d;
                    if (function02 != null) {
                        oq5Var2.Z(1912186116);
                        iab iabVar2 = this.c;
                        if (iabVar2.h != null || iabVar2.d.length() > 0) {
                            oq5Var2.Z(1912272885);
                            yci c02 = zsd.c0(d.c(vciVar, 1.0f), function02);
                            kfh d2 = ug3.d(b2c.b, false);
                            int i3 = oq5Var2.P;
                            a l2 = oq5Var2.l();
                            yci H2 = vnj.H(oq5Var2, c02);
                            xp5.T.getClass();
                            grb grbVar2 = wp5.b;
                            oq5Var2.d0();
                            if (oq5Var2.O) {
                                oq5Var2.k(grbVar2);
                            } else {
                                oq5Var2.n0();
                            }
                            g0g.U(oq5Var2, d2, wp5.f);
                            g0g.U(oq5Var2, l2, wp5.e);
                            kb5 kb5Var2 = wp5.g;
                            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i3))) {
                                ouj.x(i3, oq5Var2, i3, kb5Var2);
                            }
                            g0g.U(oq5Var2, H2, wp5.d);
                            if (iabVar2.h != null) {
                                oq5Var2.Z(-2025150954);
                                t7g.j(pbuVar2, null, null, null, oq5Var2, 0, 14);
                            } else {
                                oq5Var2.Z(-2031908520);
                            }
                            oq5Var2.p(false);
                            oq5Var2.p(true);
                        } else {
                            oq5Var2.Z(1905802844);
                        }
                        oq5Var2.p(false);
                        oq5Var2.p(false);
                    } else {
                        oq5Var2.Z(1912840278);
                        t7g.j(pbuVar2, vciVar, null, null, oq5Var2, 0, 12);
                        oq5Var2.p(false);
                    }
                } else {
                    oq5Var2.S();
                }
                break;
        }
        return Unit.a;
    }
}
