package defpackage;

import androidx.compose.runtime.internal.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class pp0 extends uif implements Function2 {
    public final /* synthetic */ int r;
    public final /* synthetic */ wn5 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pp0(int i, int i2, wn5 wn5Var) {
        super(2);
        this.r = i2;
        this.s = wn5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Number) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    qs5 qs5Var = mb6.a;
                    long j = ((d85) oq5Var.j(sb6.a)).a;
                    etn.l(qs5Var.a(Float.valueOf((!((ma5) oq5Var.j(pa5.a)).g() ? ((double) c3x.N(j)) < 0.5d : ((double) c3x.N(j)) > 0.5d) ? 0.87f : 1.0f)), this.s, oq5Var, 8);
                } else {
                    oq5Var.S();
                }
                break;
            case 1:
                hq5 hq5Var2 = (hq5) obj;
                int intValue2 = ((Number) obj2).intValue();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    this.s.invoke(qnc.a, oq5Var2, 6);
                } else {
                    oq5Var2.S();
                }
                break;
            case 2:
                ((Number) obj2).intValue();
                rvf.d(this.s, (hq5) obj, rvf.R(7));
                break;
            case 3:
                hq5 hq5Var3 = (hq5) obj;
                int intValue3 = ((Number) obj2).intValue();
                oq5 oq5Var3 = (oq5) hq5Var3;
                if (oq5Var3.P(intValue3 & 1, (intValue3 & 3) != 2)) {
                    zwf.h(this.s, oq5Var3, 0);
                } else {
                    oq5Var3.S();
                }
                break;
            case 4:
                ((Number) obj2).intValue();
                zwf.h(this.s, (hq5) obj, rvf.R(1));
                break;
            case 5:
                hq5 hq5Var4 = (hq5) obj;
                int intValue4 = ((Number) obj2).intValue();
                oq5 oq5Var4 = (oq5) hq5Var4;
                if (oq5Var4.P(intValue4 & 1, (intValue4 & 3) != 2)) {
                    ta5 a = sa5.a(qx0.c, b2c.n, oq5Var4, 0);
                    int i = oq5Var4.P;
                    a l = oq5Var4.l();
                    yci H = vnj.H(oq5Var4, vci.a);
                    xp5.T.getClass();
                    grb grbVar = wp5.b;
                    oq5Var4.d0();
                    if (oq5Var4.O) {
                        oq5Var4.k(grbVar);
                    } else {
                        oq5Var4.n0();
                    }
                    g0g.U(oq5Var4, a, wp5.f);
                    g0g.U(oq5Var4, l, wp5.e);
                    kb5 kb5Var = wp5.g;
                    if (oq5Var4.O || !Intrinsics.d(oq5Var4.K(), Integer.valueOf(i))) {
                        ouj.x(i, oq5Var4, i, kb5Var);
                    }
                    g0g.U(oq5Var4, H, wp5.d);
                    this.s.invoke(wa5.a, oq5Var4, 6);
                    oq5Var4.p(true);
                } else {
                    oq5Var4.S();
                }
                break;
            case 6:
                hq5 hq5Var5 = (hq5) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var5 = (oq5) hq5Var5;
                    if (oq5Var5.z()) {
                        oq5Var5.S();
                        break;
                    }
                }
                rdh.a(null, null, null, this.s, hq5Var5, 0, 7);
            default:
                hq5 hq5Var6 = (hq5) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var6 = (oq5) hq5Var6;
                    if (oq5Var6.z()) {
                        oq5Var6.S();
                        break;
                    }
                }
                rdh.a(null, null, null, this.s, hq5Var6, 0, 7);
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pp0(wn5 wn5Var, int i) {
        super(2);
        this.r = i;
        this.s = wn5Var;
    }
}
