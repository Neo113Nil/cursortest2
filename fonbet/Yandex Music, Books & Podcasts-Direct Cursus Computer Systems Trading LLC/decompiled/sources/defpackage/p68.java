package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.internal.a;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class p68 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ q68 b;
    public final /* synthetic */ List c;

    public /* synthetic */ p68(q68 q68Var, List list, int i) {
        this.a = i;
        this.b = q68Var;
        this.c = list;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        long j;
        vci vciVar;
        long j2;
        switch (this.a) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    pd.b(new qzm[0], false, ild.C(1090980464, new p68(this.b, this.c, 1), oq5Var), oq5Var, 0, 2);
                } else {
                    oq5Var.S();
                }
                return Unit.a;
            default:
                hq5 hq5Var2 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    vci vciVar2 = vci.a;
                    yci d = d.d(vciVar2, 1.0f);
                    ta5 a = sa5.a(qx0.c, b2c.n, oq5Var2, 0);
                    int i = oq5Var2.P;
                    a l = oq5Var2.l();
                    yci H = vnj.H(oq5Var2, d);
                    xp5.T.getClass();
                    grb grbVar = wp5.b;
                    oq5Var2.d0();
                    if (oq5Var2.O) {
                        oq5Var2.k(grbVar);
                    } else {
                        oq5Var2.n0();
                    }
                    g0g.U(oq5Var2, a, wp5.f);
                    g0g.U(oq5Var2, l, wp5.e);
                    kb5 kb5Var = wp5.g;
                    if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i))) {
                        ouj.x(i, oq5Var2, i, kb5Var);
                    }
                    g0g.U(oq5Var2, H, wp5.d);
                    int ordinal = this.b.ordinal();
                    if (ordinal == 0) {
                        oq5Var2.Z(-503996499);
                        j = ((dq0) oq5Var2.j(eq0.a)).b.a;
                        oq5Var2.p(false);
                    } else {
                        if (ordinal != 1) {
                            throw vz1.i(oq5Var2, -503998889, false);
                        }
                        oq5Var2.Z(-503994385);
                        j = ((dq0) oq5Var2.j(eq0.a)).b.b;
                        oq5Var2.p(false);
                    }
                    oq5Var2.Z(-503991792);
                    int i2 = 0;
                    for (Object obj3 : this.c) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            u75.n();
                            throw null;
                        }
                        String str = ((a58) obj3).d;
                        if (str == null) {
                            j2 = j;
                            vciVar = vciVar2;
                        } else {
                            vciVar = vciVar2;
                            j2 = j;
                            xcs.b(str, d.d(androidx.compose.foundation.layout.a.q(vciVar2, 0.0f, i2 == 0 ? 0 : 8, 0.0f, 0.0f, 13), 1.0f), j2, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, nu0.i(), oq5Var2, 0, 0, 65528);
                        }
                        j = j2;
                        i2 = i3;
                        vciVar2 = vciVar;
                    }
                    oq5Var2.p(false);
                    oq5Var2.p(true);
                } else {
                    oq5Var2.S();
                }
                return Unit.a;
        }
    }
}
