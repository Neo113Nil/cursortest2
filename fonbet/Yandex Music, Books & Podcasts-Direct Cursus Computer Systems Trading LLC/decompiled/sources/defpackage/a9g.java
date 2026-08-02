package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.internal.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class a9g implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ a9g(int i, boolean z, boolean z2) {
        this.a = i;
        this.b = z;
        this.c = z2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        vci vciVar = vci.a;
        boolean z = this.c;
        switch (i) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                yci d = d.d(vciVar, 1.0f);
                ta5 a = sa5.a(qx0.c, b2c.n, hq5Var, 0);
                oq5 oq5Var2 = (oq5) hq5Var;
                int i2 = oq5Var2.P;
                a l = oq5Var2.l();
                yci H = vnj.H(hq5Var, d);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var2.d0();
                if (oq5Var2.O) {
                    oq5Var2.k(grbVar);
                } else {
                    oq5Var2.n0();
                }
                g0g.U(hq5Var, a, wp5.f);
                g0g.U(hq5Var, l, wp5.e);
                kb5 kb5Var = wp5.g;
                if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i2))) {
                    ouj.x(i2, oq5Var2, i2, kb5Var);
                }
                g0g.U(hq5Var, H, wp5.d);
                h6g h6gVar = nu0.a;
                h6g h6gVar2 = h6g.c;
                ges j = nu0.j();
                yci r = d.r(vciVar, 140);
                boolean z2 = this.b;
                ivf.l(z2, r, j, hq5Var, 48, 0);
                if (z) {
                    oq5Var2.Z(1808238014);
                    u1g.l(hq5Var, d.e(vciVar, mu0.a));
                    ivf.l(z2, d.r(vciVar, 60), nu0.i(), hq5Var, 48, 0);
                } else {
                    oq5Var2.Z(1806303304);
                }
                oq5Var2.p(false);
                oq5Var2.p(true);
                break;
            default:
                hq5 hq5Var2 = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var3 = (oq5) hq5Var2;
                if (oq5Var3.P(intValue & 1, (intValue & 3) != 2)) {
                    if (this.b) {
                        oq5Var3.Z(-1806065839);
                        e9g e9gVar = e9g.a;
                        ivf.k(0, 0, oq5Var3, xp3.u(d.m(vciVar, lsq.s(e9gVar)), lsq.r(e9gVar, qo6.e, oq5Var3, 54)), z);
                    } else {
                        oq5Var3.Z(-1809135676);
                    }
                    oq5Var3.p(false);
                } else {
                    oq5Var3.S();
                }
                break;
        }
        return Unit.a;
    }
}
