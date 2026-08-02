package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.internal.a;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ok2 extends uif implements Function2 {
    public final /* synthetic */ int r;
    public final /* synthetic */ long s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ok2(long j, yci yciVar) {
        super(2);
        this.r = 2;
        this.s = j;
        this.t = yciVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                ((Number) obj2).intValue();
                jf0.f(rvf.R(1), this.s, (hq5) obj, vci.a, (List) this.t);
                break;
            case 1:
                ((Number) obj2).intValue();
                ywf.b(rvf.R(1), this.s, (hq5) obj, vci.a, (List) this.t);
                break;
            default:
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Number) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    long j = this.s;
                    if (j != 9205357640488583168L) {
                        oq5Var.Z(1828931592);
                        yci k = d.k((yci) this.t, fma.c(j), fma.b(j), 0.0f, 0.0f, 12);
                        kfh d = ug3.d(b2c.c, false);
                        int i = oq5Var.P;
                        a l = oq5Var.l();
                        yci H = vnj.H(oq5Var, k);
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
                        if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i))) {
                            ouj.x(i, oq5Var, i, kb5Var);
                        }
                        g0g.U(oq5Var, H, wp5.d);
                        bg0.b(0, 1, oq5Var, null);
                        oq5Var.p(true);
                        oq5Var.p(false);
                    } else {
                        oq5Var.Z(1829298756);
                        bg0.b(0, 0, oq5Var, (yci) this.t);
                        oq5Var.p(false);
                    }
                } else {
                    oq5Var.S();
                }
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ok2(long j, List list, int i, int i2) {
        super(2);
        this.r = i2;
        this.s = j;
        this.t = list;
    }
}
