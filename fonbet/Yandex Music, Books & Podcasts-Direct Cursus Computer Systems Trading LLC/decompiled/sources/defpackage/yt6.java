package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.a;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class yt6 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;

    public /* synthetic */ yt6(ArrayList arrayList) {
        this.a = 0;
        this.b = arrayList;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        hq5 hq5Var = (hq5) obj;
        Integer num = (Integer) obj2;
        switch (this.a) {
            case 0:
                if ((num.intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                yci a = a.a(androidx.compose.foundation.layout.a.o(d.d(vci.a, 1.0f), 16, 0.0f, 2), "credentials_bottom_sheet_items");
                ta5 a2 = sa5.a(qx0.c, b2c.n, hq5Var, 0);
                oq5 oq5Var2 = (oq5) hq5Var;
                int i = oq5Var2.P;
                androidx.compose.runtime.internal.a l = oq5Var2.l();
                yci H = vnj.H(hq5Var, a);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var2.d0();
                if (oq5Var2.O) {
                    oq5Var2.k(grbVar);
                } else {
                    oq5Var2.n0();
                }
                g0g.U(hq5Var, a2, wp5.f);
                g0g.U(hq5Var, l, wp5.e);
                kb5 kb5Var = wp5.g;
                if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i))) {
                    ouj.x(i, oq5Var2, i, kb5Var);
                }
                g0g.U(hq5Var, H, wp5.d);
                oq5Var2.Z(241118427);
                Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    ox6.j((ks6) it.next(), hq5Var, 0);
                }
                oq5Var2.p(false);
                oq5Var2.p(true);
                break;
            case 1:
                num.getClass();
                vvv.b(this.b, hq5Var, rvf.R(1));
                break;
            default:
                num.getClass();
                vvv.a(this.b, hq5Var, rvf.R(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ yt6(ArrayList arrayList, int i, int i2) {
        this.a = i2;
        this.b = arrayList;
    }
}
