package defpackage;

import androidx.compose.runtime.internal.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class wt2 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pyc b;

    public /* synthetic */ wt2(pyc pycVar, int i) {
        this.a = i;
        this.b = pycVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        hq5 hq5Var = (hq5) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                if ((intValue & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                nho a = lho.a(qx0.b, b2c.l, hq5Var, 54);
                oq5 oq5Var2 = (oq5) hq5Var;
                int i2 = oq5Var2.P;
                a l = oq5Var2.l();
                yci H = vnj.H(hq5Var, vci.a);
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
                this.b.invoke(qho.a, hq5Var, 6);
                oq5Var2.p(true);
                break;
            case 1:
                if ((intValue & 3) == 2) {
                    oq5 oq5Var3 = (oq5) hq5Var;
                    if (oq5Var3.z()) {
                        oq5Var3.S();
                        break;
                    }
                }
                this.b.invoke(new uik(((dq0) ((oq5) hq5Var).j(eq0.a)).c.a), hq5Var, 0);
            case 2:
                if ((intValue & 3) == 2) {
                    oq5 oq5Var4 = (oq5) hq5Var;
                    if (oq5Var4.z()) {
                        oq5Var4.S();
                        break;
                    }
                }
                nho a2 = lho.a(qx0.b, b2c.l, hq5Var, 54);
                oq5 oq5Var5 = (oq5) hq5Var;
                int i3 = oq5Var5.P;
                a l2 = oq5Var5.l();
                yci H2 = vnj.H(hq5Var, vci.a);
                xp5.T.getClass();
                grb grbVar2 = wp5.b;
                oq5Var5.d0();
                if (oq5Var5.O) {
                    oq5Var5.k(grbVar2);
                } else {
                    oq5Var5.n0();
                }
                g0g.U(hq5Var, a2, wp5.f);
                g0g.U(hq5Var, l2, wp5.e);
                kb5 kb5Var2 = wp5.g;
                if (oq5Var5.O || !Intrinsics.d(oq5Var5.K(), Integer.valueOf(i3))) {
                    ouj.x(i3, oq5Var5, i3, kb5Var2);
                }
                g0g.U(hq5Var, H2, wp5.d);
                this.b.invoke(qho.a, hq5Var, 6);
                oq5Var5.p(true);
                break;
            default:
                if ((intValue & 3) == 2) {
                    oq5 oq5Var6 = (oq5) hq5Var;
                    if (oq5Var6.z()) {
                        oq5Var6.S();
                        break;
                    }
                }
                nho a3 = lho.a(qx0.b, b2c.l, hq5Var, 54);
                oq5 oq5Var7 = (oq5) hq5Var;
                int i4 = oq5Var7.P;
                a l3 = oq5Var7.l();
                yci H3 = vnj.H(hq5Var, vci.a);
                xp5.T.getClass();
                grb grbVar3 = wp5.b;
                oq5Var7.d0();
                if (oq5Var7.O) {
                    oq5Var7.k(grbVar3);
                } else {
                    oq5Var7.n0();
                }
                g0g.U(hq5Var, a3, wp5.f);
                g0g.U(hq5Var, l3, wp5.e);
                kb5 kb5Var3 = wp5.g;
                if (oq5Var7.O || !Intrinsics.d(oq5Var7.K(), Integer.valueOf(i4))) {
                    ouj.x(i4, oq5Var7, i4, kb5Var3);
                }
                g0g.U(hq5Var, H3, wp5.d);
                this.b.invoke(qho.a, hq5Var, 6);
                oq5Var7.p(true);
                break;
        }
        return Unit.a;
    }
}
