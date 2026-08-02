package defpackage;

import androidx.compose.runtime.internal.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class jg0 extends uif implements Function2 {
    public final /* synthetic */ int r;
    public final /* synthetic */ aqi s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jg0(aqi aqiVar, int i) {
        super(2);
        this.r = i;
        this.s = aqiVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Number) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    xv7.q(nfp.b(vci.a, false, d5.C), (Function2) this.s.getValue(), oq5Var, 0);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                hq5 hq5Var2 = (hq5) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var2 = (oq5) hq5Var2;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        break;
                    }
                }
                yci b = nfp.b(vci.a, false, k9i.F);
                kfh d = ug3.d(b2c.b, false);
                oq5 oq5Var3 = (oq5) hq5Var2;
                int i = oq5Var3.P;
                a l = oq5Var3.l();
                yci H = vnj.H(hq5Var2, b);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var3.d0();
                if (oq5Var3.O) {
                    oq5Var3.k(grbVar);
                } else {
                    oq5Var3.n0();
                }
                g0g.U(hq5Var2, d, wp5.f);
                g0g.U(hq5Var2, l, wp5.e);
                kb5 kb5Var = wp5.g;
                if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i))) {
                    ouj.x(i, oq5Var3, i, kb5Var);
                }
                g0g.U(hq5Var2, H, wp5.d);
                ((Function2) this.s.getValue()).invoke(hq5Var2, 0);
                oq5Var3.p(true);
                break;
        }
        return Unit.a;
    }
}
