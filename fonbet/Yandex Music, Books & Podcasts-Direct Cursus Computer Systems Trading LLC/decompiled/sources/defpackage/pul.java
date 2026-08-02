package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.internal.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class pul implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ po6 c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ pul(po6 po6Var, boolean z, boolean z2, int i) {
        this.c = po6Var;
        this.b = z;
        this.d = z2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ges j;
        boolean z;
        ges j2;
        boolean z2;
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                ngg.k(this.c, this.b, this.d, (hq5) obj, rvf.R(1));
                break;
            default:
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    hz2 hz2Var = b2c.l;
                    nho a = lho.a(qx0.a, hz2Var, oq5Var, 48);
                    int i = oq5Var.P;
                    a l = oq5Var.l();
                    vci vciVar = vci.a;
                    yci H = vnj.H(oq5Var, vciVar);
                    xp5.T.getClass();
                    grb grbVar = wp5.b;
                    oq5Var.d0();
                    if (oq5Var.O) {
                        oq5Var.k(grbVar);
                    } else {
                        oq5Var.n0();
                    }
                    kb5 kb5Var = wp5.f;
                    g0g.U(oq5Var, a, kb5Var);
                    kb5 kb5Var2 = wp5.e;
                    g0g.U(oq5Var, l, kb5Var2);
                    kb5 kb5Var3 = wp5.g;
                    if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i))) {
                        ouj.x(i, oq5Var, i, kb5Var3);
                    }
                    kb5 kb5Var4 = wp5.d;
                    g0g.U(oq5Var, H, kb5Var4);
                    boolean z3 = this.b;
                    if (z3) {
                        oq5Var.Z(-187697437);
                        j = nu0.g();
                    } else {
                        oq5Var.Z(-187696129);
                        j = nu0.j();
                    }
                    oq5Var.p(false);
                    float p = w1g.p(j, 0, oq5Var, 0, 2);
                    float f = mu0.a;
                    yci u = d.u(d.e(vciVar, w1g.p(nu0.i(), 0, oq5Var, 0, 2) + p + f), hz2Var, true);
                    if (1.0f <= 0.0d) {
                        qme.a("invalid weight; must be greater than zero");
                    }
                    yci g = vz1.g(1.0f, u, true);
                    ta5 a2 = sa5.a(qx0.e, b2c.n, oq5Var, 6);
                    int i2 = oq5Var.P;
                    a l2 = oq5Var.l();
                    yci H2 = vnj.H(oq5Var, g);
                    oq5Var.d0();
                    if (oq5Var.O) {
                        oq5Var.k(grbVar);
                    } else {
                        oq5Var.n0();
                    }
                    g0g.U(oq5Var, a2, kb5Var);
                    g0g.U(oq5Var, l2, kb5Var2);
                    if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i2))) {
                        ouj.x(i2, oq5Var, i2, kb5Var3);
                    }
                    g0g.U(oq5Var, H2, kb5Var4);
                    po6 po6Var = this.c;
                    String str = po6Var.b;
                    boolean z4 = po6Var.f;
                    jzb jzbVar = po6Var.e;
                    if (z3) {
                        oq5Var.Z(-1835730867);
                        j2 = nu0.g();
                        z = false;
                    } else {
                        z = false;
                        oq5Var.Z(-1835729559);
                        j2 = nu0.j();
                    }
                    oq5Var.p(z);
                    ges gesVar = j2;
                    boolean z5 = this.d;
                    qgg.r(str, z4, jzbVar, gesVar, z5, 0, oq5Var, 0, 32);
                    String str2 = po6Var.c;
                    if (str2 != null) {
                        oq5Var.Z(-1072893764);
                        u1g.l(oq5Var, d.e(vciVar, f));
                        t7g.i(str2, z5, nu0.i(), oq5Var, 0, 0);
                        z2 = false;
                    } else {
                        z2 = false;
                        oq5Var.Z(-1078832155);
                    }
                    oq5Var.p(z2);
                    oq5Var.p(true);
                    oq5Var.p(true);
                } else {
                    oq5Var.S();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ pul(boolean z, po6 po6Var, boolean z2) {
        this.b = z;
        this.c = po6Var;
        this.d = z2;
    }
}
