package defpackage;

import androidx.compose.foundation.e;
import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class fh3 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ uoi b;
    public final /* synthetic */ long c;
    public final /* synthetic */ wn5 d;

    public /* synthetic */ fh3(uoi uoiVar, long j, wn5 wn5Var, int i) {
        this.a = i;
        this.b = uoiVar;
        this.c = j;
        this.d = wn5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                yci b = b.a.b(vci.a);
                geo a = eeo.a(0.0f, 3, this.c, false);
                uoi uoiVar = this.b;
                ug3.a(e.a(b, uoiVar, a), hq5Var, 0);
                zc4.m(0L, ild.C(1439728624, new m32(10, this.d, uoiVar), hq5Var), hq5Var, 48, 1);
            default:
                hq5 hq5Var2 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var2 = (oq5) hq5Var2;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        break;
                    }
                }
                b bVar = b.a;
                vci vciVar = vci.a;
                ug3.a(e.a(bVar.b(vciVar), this.b, eeo.a(0.0f, 3, this.c, false)), hq5Var2, 0);
                yci m = a.m(d.c(vciVar, 1.0f), ug6.a);
                nho a2 = lho.a(qx0.g, b2c.l, hq5Var2, 54);
                oq5 oq5Var3 = (oq5) hq5Var2;
                int i = oq5Var3.P;
                androidx.compose.runtime.internal.a l = oq5Var3.l();
                yci H = vnj.H(hq5Var2, m);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var3.d0();
                if (oq5Var3.O) {
                    oq5Var3.k(grbVar);
                } else {
                    oq5Var3.n0();
                }
                g0g.U(hq5Var2, a2, wp5.f);
                g0g.U(hq5Var2, l, wp5.e);
                kb5 kb5Var = wp5.g;
                if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i))) {
                    ouj.x(i, oq5Var3, i, kb5Var);
                }
                g0g.U(hq5Var2, H, wp5.d);
                this.d.invoke(qho.a, hq5Var2, 6);
                oq5Var3.p(true);
                break;
        }
        return Unit.a;
    }
}
