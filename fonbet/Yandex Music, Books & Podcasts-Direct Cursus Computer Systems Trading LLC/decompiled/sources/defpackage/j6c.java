package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.lazy.a;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class j6c implements pyc {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ float b;
    public final /* synthetic */ wn5 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ j6c(float f, wn5 wn5Var, int i, Object obj) {
        this.b = f;
        this.c = wn5Var;
        this.d = i;
        this.e = obj;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                hq5 hq5Var = (hq5) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((a) obj).getClass();
                if ((intValue & 17) == 16) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        return Unit.a;
                    }
                }
                yci r = d.r(vci.a, this.b);
                kfh d = ug3.d(b2c.b, false);
                oq5 oq5Var2 = (oq5) hq5Var;
                int i = oq5Var2.P;
                androidx.compose.runtime.internal.a l = oq5Var2.l();
                yci H = vnj.H(hq5Var, r);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var2.d0();
                if (oq5Var2.O) {
                    oq5Var2.k(grbVar);
                } else {
                    oq5Var2.n0();
                }
                g0g.U(hq5Var, d, wp5.f);
                g0g.U(hq5Var, l, wp5.e);
                kb5 kb5Var = wp5.g;
                if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i))) {
                    ouj.x(i, oq5Var2, i, kb5Var);
                }
                g0g.U(hq5Var, H, wp5.d);
                this.c.invoke(Integer.valueOf(this.d), this.e, hq5Var, 0);
                oq5Var2.p(true);
                return Unit.a;
            default:
                List list = (List) this.e;
                hq5 hq5Var2 = (hq5) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((qnc) obj).getClass();
                oq5 oq5Var3 = (oq5) hq5Var2;
                if (oq5Var3.P(intValue2 & 1, (intValue2 & 17) != 16)) {
                    int i2 = 0;
                    for (Object obj4 : list) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            u75.n();
                            throw null;
                        }
                        yci r2 = d.r(vci.a, this.b);
                        kfh d2 = ug3.d(b2c.b, true);
                        int i4 = oq5Var3.P;
                        androidx.compose.runtime.internal.a l2 = oq5Var3.l();
                        yci H2 = vnj.H(oq5Var3, r2);
                        xp5.T.getClass();
                        grb grbVar2 = wp5.b;
                        oq5Var3.d0();
                        if (oq5Var3.O) {
                            oq5Var3.k(grbVar2);
                        } else {
                            oq5Var3.n0();
                        }
                        g0g.U(oq5Var3, d2, wp5.f);
                        g0g.U(oq5Var3, l2, wp5.e);
                        kb5 kb5Var2 = wp5.g;
                        if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i4))) {
                            ouj.x(i4, oq5Var3, i4, kb5Var2);
                        }
                        g0g.U(oq5Var3, H2, wp5.d);
                        int i5 = this.d;
                        this.c.invoke(new spd(i2 % i5, i2 / i5, i2), obj4, oq5Var3, 0);
                        oq5Var3.p(true);
                        i2 = i3;
                    }
                } else {
                    oq5Var3.S();
                }
                return Unit.a;
        }
    }

    public /* synthetic */ j6c(List list, float f, wn5 wn5Var, int i) {
        this.e = list;
        this.b = f;
        this.c = wn5Var;
        this.d = i;
    }
}
