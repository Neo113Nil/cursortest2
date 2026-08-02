package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.internal.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final /* synthetic */ class xf3 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ m0s c;

    public /* synthetic */ xf3(boolean z, m0s m0sVar, int i) {
        this.a = i;
        this.b = z;
        this.c = m0sVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        vci vciVar = vci.a;
        m0s m0sVar = this.c;
        boolean z = this.b;
        switch (i) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    nho a = lho.a(qx0.g(4), b2c.l, oq5Var, 54);
                    int i2 = oq5Var.P;
                    a l = oq5Var.l();
                    yci H = vnj.H(oq5Var, vciVar);
                    xp5.T.getClass();
                    grb grbVar = wp5.b;
                    oq5Var.d0();
                    if (oq5Var.O) {
                        oq5Var.k(grbVar);
                    } else {
                        oq5Var.n0();
                    }
                    g0g.U(oq5Var, a, wp5.f);
                    g0g.U(oq5Var, l, wp5.e);
                    kb5 kb5Var = wp5.g;
                    if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i2))) {
                        ouj.x(i2, oq5Var, i2, kb5Var);
                    }
                    g0g.U(oq5Var, H, wp5.d);
                    if (z) {
                        oq5Var.Z(-458108310);
                        ug3.a(androidx.compose.foundation.a.b(d.m(vciVar, 8), kg5.r(R.color.avatar_alert_red, oq5Var), ugo.a), oq5Var, 0);
                    } else {
                        oq5Var.Z(-469858612);
                    }
                    oq5Var.p(false);
                    xcs.b(m0sVar.getTitle(), neg.D(), ((dq0) oq5Var.j(eq0.a)).b.a, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, nu0.j(), oq5Var, 0, 3120, 55288);
                    oq5Var.p(true);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                hq5 hq5Var2 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    nho a2 = lho.a(qx0.g(4), b2c.l, oq5Var2, 54);
                    int i3 = oq5Var2.P;
                    a l2 = oq5Var2.l();
                    yci H2 = vnj.H(oq5Var2, vciVar);
                    xp5.T.getClass();
                    grb grbVar2 = wp5.b;
                    oq5Var2.d0();
                    if (oq5Var2.O) {
                        oq5Var2.k(grbVar2);
                    } else {
                        oq5Var2.n0();
                    }
                    g0g.U(oq5Var2, a2, wp5.f);
                    g0g.U(oq5Var2, l2, wp5.e);
                    kb5 kb5Var2 = wp5.g;
                    if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i3))) {
                        ouj.x(i3, oq5Var2, i3, kb5Var2);
                    }
                    g0g.U(oq5Var2, H2, wp5.d);
                    if (z) {
                        oq5Var2.Z(-780021845);
                        ug3.a(androidx.compose.foundation.a.b(d.m(vciVar, 8), kg5.r(R.color.avatar_alert_red, oq5Var2), ugo.a), oq5Var2, 0);
                    } else {
                        oq5Var2.Z(-787632035);
                    }
                    oq5Var2.p(false);
                    xcs.b(m0sVar.getTitle(), neg.D(), ((dq0) oq5Var2.j(eq0.a)).b.a, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, nu0.j(), oq5Var2, 0, 3120, 55288);
                    oq5Var2.p(true);
                } else {
                    oq5Var2.S();
                }
                break;
        }
        return Unit.a;
    }
}
