package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.internal.a;
import com.yandex.passport.internal.ui.challenge.logout.bottomsheet.b;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class o68 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yci b;
    public final /* synthetic */ List c;

    public /* synthetic */ o68(yci yciVar, List list) {
        this.a = 0;
        this.b = yciVar;
        this.c = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        return Unit.a;
                    }
                }
                float f = 1.0f;
                yci d = d.d(this.b, 1.0f);
                int i = 0;
                ta5 a = sa5.a(qx0.c, b2c.n, hq5Var, 0);
                oq5 oq5Var2 = (oq5) hq5Var;
                int i2 = oq5Var2.P;
                a l = oq5Var2.l();
                yci H = vnj.H(hq5Var, d);
                xp5.T.getClass();
                Function0 function0 = wp5.b;
                oq5Var2.d0();
                if (oq5Var2.O) {
                    oq5Var2.k(function0);
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
                oq5Var2.Z(1557969737);
                int i3 = 0;
                for (Object obj3 : this.c) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        u75.n();
                        throw null;
                    }
                    hq5 hq5Var2 = hq5Var;
                    xcs.b((String) obj3, d.d(androidx.compose.foundation.layout.a.q(vci.a, 0.0f, i3 == 0 ? i : 8, 0.0f, 0.0f, 13), f), ((dq0) ((oq5) hq5Var).j(eq0.a)).b.b, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, nu0.i(), hq5Var2, 0, 0, 65528);
                    i = i;
                    oq5Var2 = oq5Var2;
                    hq5Var = hq5Var2;
                    i3 = i4;
                    f = f;
                }
                oq5 oq5Var3 = oq5Var2;
                oq5Var3.p(i);
                oq5Var3.p(true);
                return Unit.a;
            case 1:
                ((Integer) obj2).getClass();
                swf.c(rvf.R(7), (hq5) obj, this.b, this.c);
                return Unit.a;
            case 2:
                ((Integer) obj2).getClass();
                a0g.i(rvf.R(1), (hq5) obj, this.b, this.c);
                return Unit.a;
            default:
                ((Integer) obj2).getClass();
                b.a(rvf.R(49), (hq5) obj, this.b, this.c);
                return Unit.a;
        }
    }

    public /* synthetic */ o68(yci yciVar, List list, int i) {
        this.a = 1;
        this.b = yciVar;
        this.c = list;
    }

    public /* synthetic */ o68(List list, yci yciVar, int i, int i2) {
        this.a = i2;
        this.c = list;
        this.b = yciVar;
    }
}
