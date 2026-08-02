package defpackage;

import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.d;
import com.yandex.pulse.metrics.o;
import io.appmetrica.analytics.BuildConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final /* synthetic */ class cxd implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yci b;

    public /* synthetic */ cxd(yci yciVar, int i) {
        this.a = i;
        this.b = yciVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        yci yciVar = vci.a;
        yci yciVar2 = this.b;
        switch (i) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    yci q = a.q(this.b, 0.0f, 16, 0.0f, 0.0f, 13);
                    ta5 a = sa5.a(qx0.c, b2c.n, oq5Var, 0);
                    int i2 = oq5Var.P;
                    androidx.compose.runtime.internal.a l = oq5Var.l();
                    yci H = vnj.H(oq5Var, q);
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
                    a0g.w(null, oq5Var, 0);
                    a0g.t(2, 48, 1, oq5Var, null);
                    a0g.c(true, null, null, oq5Var, 6, 6);
                    a0g.c(false, null, Integer.valueOf(R.drawable.ic_link_default_24), oq5Var, 6, 2);
                    oq5Var.p(true);
                } else {
                    oq5Var.S();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                wct.k(yciVar2, (hq5) obj, rvf.R(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                lg3.d(yciVar2, (hq5) obj, rvf.R(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                lg3.C(yciVar2, (hq5) obj, rvf.R(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                lg3.F(yciVar2, (hq5) obj, rvf.R(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                ivf.d(yciVar2, (hq5) obj, rvf.R(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                qhi.a(yciVar2, (hq5) obj, rvf.R(7));
                break;
            case 7:
                ((Integer) obj2).getClass();
                ngg.d(yciVar2, (hq5) obj, rvf.R(7));
                break;
            case 8:
                ((Integer) obj2).getClass();
                cb0.i(yciVar2, (hq5) obj, rvf.R(1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                c5n.a(yciVar2, (hq5) obj, rvf.R(1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                zdg.d(yciVar2, (hq5) obj, rvf.R(1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                a0g.w(yciVar2, (hq5) obj, rvf.R(1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                s2s.a(yciVar2, (hq5) obj, rvf.R(55));
                break;
            case 13:
                hq5 hq5Var2 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    float f = 16;
                    yci q2 = a.q(this.b, 0.0f, f, 0.0f, 0.0f, 13);
                    ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var2, 0);
                    int i3 = oq5Var2.P;
                    androidx.compose.runtime.internal.a l2 = oq5Var2.l();
                    yci H2 = vnj.H(oq5Var2, q2);
                    xp5.T.getClass();
                    grb grbVar2 = wp5.b;
                    oq5Var2.d0();
                    if (oq5Var2.O) {
                        oq5Var2.k(grbVar2);
                    } else {
                        oq5Var2.n0();
                    }
                    kb5 kb5Var2 = wp5.f;
                    g0g.U(oq5Var2, a2, kb5Var2);
                    kb5 kb5Var3 = wp5.e;
                    g0g.U(oq5Var2, l2, kb5Var3);
                    kb5 kb5Var4 = wp5.g;
                    if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i3))) {
                        ouj.x(i3, oq5Var2, i3, kb5Var4);
                    }
                    kb5 kb5Var5 = wp5.d;
                    g0g.U(oq5Var2, H2, kb5Var5);
                    a0g.w(null, oq5Var2, 0);
                    float f2 = 8;
                    u1g.l(oq5Var2, d.e(yciVar, f2));
                    yci o = a.o(d.d(yciVar, 1.0f), f, 0.0f, 2);
                    nho a3 = lho.a(qx0.a, b2c.k, oq5Var2, 0);
                    int i4 = oq5Var2.P;
                    androidx.compose.runtime.internal.a l3 = oq5Var2.l();
                    yci H3 = vnj.H(oq5Var2, o);
                    oq5Var2.d0();
                    if (oq5Var2.O) {
                        oq5Var2.k(grbVar2);
                    } else {
                        oq5Var2.n0();
                    }
                    g0g.U(oq5Var2, a3, kb5Var2);
                    g0g.U(oq5Var2, l3, kb5Var3);
                    if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i4))) {
                        ouj.x(i4, oq5Var2, i4, kb5Var4);
                    }
                    g0g.U(oq5Var2, H3, kb5Var5);
                    boolean h = irv.h(oq5Var2);
                    qho qhoVar = qho.a;
                    dag.l(!h ? qhoVar.a(1.0f, yciVar, true) : yciVar, oq5Var2, 0);
                    u1g.l(oq5Var2, d.r(yciVar, f2));
                    dag.l(!h ? qhoVar.a(1.0f, yciVar, true) : yciVar, oq5Var2, 0);
                    u1g.l(oq5Var2, d.r(yciVar, f2));
                    if (!h) {
                        yciVar = qhoVar.a(1.0f, yciVar, true);
                    }
                    dag.l(yciVar, oq5Var2, 0);
                    oq5Var2.p(true);
                    oq5Var2.p(true);
                } else {
                    oq5Var2.S();
                }
                break;
            case 14:
                ((Integer) obj2).getClass();
                dag.j(yciVar2, (hq5) obj, rvf.R(1));
                break;
            case 15:
                ((Integer) obj2).getClass();
                dag.l(yciVar2, (hq5) obj, rvf.R(1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                swf.o(yciVar2, (hq5) obj, rvf.R(7));
                break;
            case 17:
                ((Integer) obj2).getClass();
                ezf.n(yciVar2, (hq5) obj, rvf.R(7));
                break;
            case 18:
                ((Integer) obj2).getClass();
                szf.r(yciVar2, (hq5) obj, rvf.R(1));
                break;
            case 19:
                hq5 hq5Var3 = (hq5) obj;
                int intValue3 = ((Integer) obj2).intValue();
                oq5 oq5Var3 = (oq5) hq5Var3;
                if (oq5Var3.P(intValue3 & 1, (intValue3 & 3) != 2)) {
                    float f3 = 16;
                    yci q3 = a.q(this.b, 0.0f, f3, 0.0f, 0.0f, 13);
                    ta5 a4 = sa5.a(qx0.c, b2c.n, oq5Var3, 0);
                    int i5 = oq5Var3.P;
                    androidx.compose.runtime.internal.a l4 = oq5Var3.l();
                    yci H4 = vnj.H(oq5Var3, q3);
                    xp5.T.getClass();
                    grb grbVar3 = wp5.b;
                    oq5Var3.d0();
                    if (oq5Var3.O) {
                        oq5Var3.k(grbVar3);
                    } else {
                        oq5Var3.n0();
                    }
                    g0g.U(oq5Var3, a4, wp5.f);
                    g0g.U(oq5Var3, l4, wp5.e);
                    kb5 kb5Var6 = wp5.g;
                    if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i5))) {
                        ouj.x(i5, oq5Var3, i5, kb5Var6);
                    }
                    g0g.U(oq5Var3, H4, wp5.d);
                    a0g.w(null, oq5Var3, 0);
                    pm0.d(a.o(d.r(yciVar, BuildConfig.API_LEVEL), f3, 0.0f, 2), nu0.i(), oq5Var3, 6);
                    u1g.l(oq5Var3, d.e(yciVar, 8));
                    a0g.t(0, 0, 3, oq5Var3, null);
                    oq5Var3.p(true);
                } else {
                    oq5Var3.S();
                }
                break;
            case 20:
                ((Integer) obj2).getClass();
                q5g.q(yciVar2, (hq5) obj, rvf.R(1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                o5g.k(yciVar2, (hq5) obj, rvf.R(1));
                break;
            case 22:
                ((Integer) obj2).getClass();
                gut.j(yciVar2, (hq5) obj, rvf.R(1));
                break;
            case 23:
                ((Integer) obj2).getClass();
                q7g.c(yciVar2, (hq5) obj, rvf.R(1));
                break;
            case 24:
                ((Integer) obj2).getClass();
                q7g.b(yciVar2, (hq5) obj, rvf.R(7));
                break;
            case 25:
                ((Integer) obj2).getClass();
                pcg.o(yciVar2, (hq5) obj, rvf.R(1));
                break;
            case 26:
                ((Integer) obj2).getClass();
                hyf.m(yciVar2, (hq5) obj, rvf.R(1));
                break;
            case 27:
                ((Integer) obj2).getClass();
                u1g.f(yciVar2, (hq5) obj, rvf.R(1));
                break;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                ((Integer) obj2).getClass();
                r2v.g(yciVar2, (hq5) obj, rvf.R(1));
                break;
            default:
                ((Integer) obj2).getClass();
                ywf.l(yciVar2, (hq5) obj, rvf.R(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ cxd(yci yciVar, int i, int i2) {
        this.a = i2;
        this.b = yciVar;
    }
}
