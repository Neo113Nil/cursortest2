package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.internal.a;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class y04 implements pyc {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ zpd b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ y04(zpd zpdVar, boolean z) {
        this.b = zpdVar;
        this.c = z;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                hq5 hq5Var = (hq5) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((Unit) obj).getClass();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 17) != 16)) {
                    qgg.b(this.c, this.b, null, oq5Var, 0, 4);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                hq5 hq5Var2 = (hq5) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((ua5) obj).getClass();
                if ((intValue2 & 17) == 16) {
                    oq5 oq5Var2 = (oq5) hq5Var2;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        break;
                    }
                }
                vci vciVar = vci.a;
                yci d = d.d(vciVar, 1.0f);
                zpd zpdVar = this.b;
                yci e = d.e(d, j66.M(zpdVar, hq5Var2));
                ta5 a = sa5.a(qx0.c, b2c.n, hq5Var2, 0);
                oq5 oq5Var3 = (oq5) hq5Var2;
                int i = oq5Var3.P;
                a l = oq5Var3.l();
                yci H = vnj.H(hq5Var2, e);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var3.d0();
                if (oq5Var3.O) {
                    oq5Var3.k(grbVar);
                } else {
                    oq5Var3.n0();
                }
                g0g.U(hq5Var2, a, wp5.f);
                g0g.U(hq5Var2, l, wp5.e);
                kb5 kb5Var = wp5.g;
                if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i))) {
                    ouj.x(i, oq5Var3, i, kb5Var);
                }
                g0g.U(hq5Var2, H, wp5.d);
                float f = upd.a;
                h6g h6gVar = nu0.a;
                h6g h6gVar2 = h6g.c;
                ges j = nu0.j();
                yci r = d.r(vciVar, 148);
                boolean z = this.c;
                ivf.l(z, r, j, hq5Var2, 48, 0);
                if (zpdVar.b > 0) {
                    oq5Var3.Z(-224138008);
                    u1g.l(hq5Var2, d.e(vciVar, upd.a));
                    ivf.l(z, d.r(vciVar, 64), upd.a(), hq5Var2, 48, 0);
                } else {
                    oq5Var3.Z(-227503492);
                }
                oq5Var3.p(false);
                if (zpdVar.c > 0) {
                    oq5Var3.Z(-223719384);
                    u1g.l(hq5Var2, d.e(vciVar, upd.a));
                    ivf.l(z, d.r(vciVar, 64), upd.a(), hq5Var2, 48, 0);
                } else {
                    oq5Var3.Z(-227503492);
                }
                oq5Var3.p(false);
                oq5Var3.p(true);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ y04(boolean z, zpd zpdVar) {
        this.c = z;
        this.b = zpdVar;
    }
}
