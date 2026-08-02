package defpackage;

import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.internal.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class xru implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hsu b;

    public /* synthetic */ xru(hsu hsuVar, int i) {
        this.a = i;
        this.b = hsuVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        oq5 oq5Var;
        long j;
        switch (this.a) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var2 = (oq5) hq5Var;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        break;
                    }
                }
                vci vciVar = vci.a;
                yci c = d.c(vciVar, 1.0f);
                kfh d = ug3.d(b2c.b, false);
                oq5 oq5Var3 = (oq5) hq5Var;
                int i = oq5Var3.P;
                a l = oq5Var3.l();
                yci H = vnj.H(hq5Var, c);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var3.d0();
                if (oq5Var3.O) {
                    oq5Var3.k(grbVar);
                } else {
                    oq5Var3.n0();
                }
                g0g.U(hq5Var, d, wp5.f);
                g0g.U(hq5Var, l, wp5.e);
                kb5 kb5Var = wp5.g;
                if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i))) {
                    ouj.x(i, oq5Var3, i, kb5Var);
                }
                g0g.U(hq5Var, H, wp5.d);
                hsu hsuVar = this.b;
                String b = hsuVar.b();
                boolean x = neg.x(hsuVar);
                yci c2 = d.c(vciVar, 1.0f);
                boolean h = oq5Var3.h(hsuVar);
                Object K = oq5Var3.K();
                if (h || K == gq5.a) {
                    K = new wru(hsuVar, 0);
                    oq5Var3.k0(K);
                }
                gdg.c(b, wyf.s(c2, (Function0) K), x, null, hq5Var, 0);
                if (neg.x(hsuVar)) {
                    oq5Var3.Z(1342643778);
                    if (!(hsuVar instanceof gsu)) {
                        if (!(hsuVar instanceof fsu)) {
                            b6e.s();
                            break;
                        }
                    } else if (((gsu) hsuVar).e == mhi.b) {
                        z = true;
                        orl.a(0, 4, 0L, hq5Var, b.a.a(vciVar, b2c.f), z);
                    }
                    z = false;
                    orl.a(0, 4, 0L, hq5Var, b.a.a(vciVar, b2c.f), z);
                } else {
                    oq5Var3.Z(1338497714);
                }
                oq5Var3.p(false);
                oq5Var3.p(true);
                break;
            case 1:
                hq5 hq5Var2 = (hq5) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var4 = (oq5) hq5Var2;
                    if (oq5Var4.z()) {
                        oq5Var4.S();
                        break;
                    }
                }
                hsu hsuVar2 = this.b;
                String a = hsuVar2.a();
                boolean x2 = neg.x(hsuVar2);
                yci c3 = d.c(vci.a, 1.0f);
                oq5 oq5Var5 = (oq5) hq5Var2;
                boolean h2 = oq5Var5.h(hsuVar2);
                Object K2 = oq5Var5.K();
                if (h2 || K2 == gq5.a) {
                    K2 = new wru(hsuVar2, 1);
                    oq5Var5.k0(K2);
                }
                gdg.c(a, wyf.s(c3, (Function0) K2), x2, null, oq5Var5, 0);
                break;
            default:
                hq5 hq5Var3 = (hq5) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var6 = (oq5) hq5Var3;
                    if (oq5Var6.z()) {
                        oq5Var6.S();
                        break;
                    }
                }
                hsu hsuVar3 = this.b;
                String name = hsuVar3.getName();
                ges j2 = nu0.j();
                if (hsuVar3 instanceof gsu) {
                    oq5Var = (oq5) hq5Var3;
                    oq5Var.Z(-1673338477);
                    j = ((dq0) oq5Var.j(eq0.a)).b.a;
                } else {
                    oq5Var = (oq5) hq5Var3;
                    oq5Var.Z(-1673337419);
                    j = ((dq0) oq5Var.j(eq0.a)).b.b;
                }
                oq5Var.p(false);
                xcs.b(name, null, j, 0L, null, 0L, null, null, 0L, 2, false, 2, 0, null, j2, hq5Var3, 0, 3120, 55290);
        }
        return Unit.a;
    }
}
