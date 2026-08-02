package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.lazy.a;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class fwb extends uif implements ryc {
    public final /* synthetic */ int r;
    public final /* synthetic */ List s;
    public final /* synthetic */ List t;
    public final /* synthetic */ cma u;
    public final /* synthetic */ List v;
    public final /* synthetic */ boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fwb(List list, List list2, cma cmaVar, List list3, boolean z, int i) {
        super(4);
        this.r = i;
        this.s = list;
        this.t = list2;
        this.u = cmaVar;
        this.v = list3;
        this.w = z;
    }

    @Override // defpackage.ryc
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        yci o;
        int i2;
        yci o2;
        switch (this.r) {
            case 0:
                a aVar = (a) obj;
                int intValue = ((Number) obj2).intValue();
                hq5 hq5Var = (hq5) obj3;
                int intValue2 = ((Number) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    i = (((oq5) hq5Var).f(aVar) ? 4 : 2) | intValue2;
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i |= ((oq5) hq5Var).d(intValue) ? 32 : 16;
                }
                if ((i & 147) == 146) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                rrf rrfVar = (rrf) this.s.get(intValue);
                oq5 oq5Var2 = (oq5) hq5Var;
                oq5Var2.Z(1252857961);
                iz2 iz2Var = b2c.f;
                boolean contains = this.t.contains(rrfVar.getType());
                cma cmaVar = this.u;
                vci vciVar = vci.a;
                if (contains) {
                    oq5Var2.Z(1253088910);
                    if (cmaVar == null) {
                        oq5Var2.Z(1253464537);
                        oq5Var2.p(false);
                        o = vciVar;
                    } else {
                        oq5Var2.Z(1253575796);
                        o = androidx.compose.ui.draw.a.b(q7g.N(vciVar), new oo1(cmaVar.a, ((cma) oq5Var2.j(lkg.b)).a, 2));
                        oq5Var2.p(false);
                    }
                    oq5Var2.p(false);
                } else if (cmaVar != null) {
                    oq5Var2.Z(1253855540);
                    oq5Var2.p(false);
                    o = d.r(vciVar, (v0k.b * 2) + cmaVar.a);
                } else {
                    oq5Var2.Z(1254108221);
                    oq5Var2.p(false);
                    o = androidx.compose.foundation.layout.a.o(vciVar, v0k.c, 0.0f, 2);
                }
                kfh d = ug3.d(iz2Var, false);
                int i3 = oq5Var2.P;
                androidx.compose.runtime.internal.a l = oq5Var2.l();
                yci H = vnj.H(oq5Var2, o);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var2.d0();
                if (oq5Var2.O) {
                    oq5Var2.k(grbVar);
                } else {
                    oq5Var2.n0();
                }
                g0g.U(oq5Var2, d, wp5.f);
                g0g.U(oq5Var2, l, wp5.e);
                kb5 kb5Var = wp5.g;
                if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i3))) {
                    ouj.x(i3, oq5Var2, i3, kb5Var);
                }
                g0g.U(oq5Var2, H, wp5.d);
                etn.l(glg.b.a(Integer.valueOf(intValue + 1)), ild.C(1188022107, new ewb(0, rrfVar), oq5Var2), oq5Var2, 56);
                oq5Var2.p(true);
                if (intValue != u75.g(this.v) || this.w) {
                    oq5Var2.Z(1254879904);
                    cma b = rrfVar.b();
                    eta.p(vciVar, b != null ? b.a : cub.e, oq5Var2, false);
                } else {
                    oq5Var2.Z(1254678590);
                    eta.p(vciVar, 8, oq5Var2, false);
                }
                oq5Var2.p(false);
                break;
            default:
                a aVar2 = (a) obj;
                int intValue3 = ((Number) obj2).intValue();
                hq5 hq5Var2 = (hq5) obj3;
                int intValue4 = ((Number) obj4).intValue();
                if ((intValue4 & 6) == 0) {
                    i2 = (((oq5) hq5Var2).f(aVar2) ? 4 : 2) | intValue4;
                } else {
                    i2 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    i2 |= ((oq5) hq5Var2).d(intValue3) ? 32 : 16;
                }
                if ((i2 & 147) == 146) {
                    oq5 oq5Var3 = (oq5) hq5Var2;
                    if (oq5Var3.z()) {
                        oq5Var3.S();
                        break;
                    }
                }
                rrf rrfVar2 = (rrf) this.s.get(intValue3);
                oq5 oq5Var4 = (oq5) hq5Var2;
                oq5Var4.Z(-292128755);
                iz2 iz2Var2 = b2c.f;
                boolean contains2 = this.t.contains(rrfVar2.getType());
                cma cmaVar2 = this.u;
                vci vciVar2 = vci.a;
                if (contains2) {
                    oq5Var4.Z(-291913802);
                    if (cmaVar2 == null) {
                        oq5Var4.Z(-291557023);
                        oq5Var4.p(false);
                        o2 = vciVar2;
                    } else {
                        oq5Var4.Z(-291453700);
                        o2 = androidx.compose.ui.draw.a.b(q7g.N(vciVar2), new oo1(cmaVar2.a, ((cma) oq5Var4.j(lkg.b)).a, 3));
                        oq5Var4.p(false);
                    }
                    oq5Var4.p(false);
                } else if (cmaVar2 != null) {
                    oq5Var4.Z(-291189952);
                    oq5Var4.p(false);
                    o2 = d.r(vciVar2, (v0k.b * 2) + cmaVar2.a);
                } else {
                    oq5Var4.Z(-290953143);
                    oq5Var4.p(false);
                    o2 = androidx.compose.foundation.layout.a.o(vciVar2, v0k.c, 0.0f, 2);
                }
                kfh d2 = ug3.d(iz2Var2, false);
                int i4 = oq5Var4.P;
                androidx.compose.runtime.internal.a l2 = oq5Var4.l();
                yci H2 = vnj.H(oq5Var4, o2);
                xp5.T.getClass();
                grb grbVar2 = wp5.b;
                oq5Var4.d0();
                if (oq5Var4.O) {
                    oq5Var4.k(grbVar2);
                } else {
                    oq5Var4.n0();
                }
                g0g.U(oq5Var4, d2, wp5.f);
                g0g.U(oq5Var4, l2, wp5.e);
                kb5 kb5Var2 = wp5.g;
                if (oq5Var4.O || !Intrinsics.d(oq5Var4.K(), Integer.valueOf(i4))) {
                    ouj.x(i4, oq5Var4, i4, kb5Var2);
                }
                g0g.U(oq5Var4, H2, wp5.d);
                etn.l(glg.b.a(Integer.valueOf(intValue3 + 1)), ild.C(-173857189, new ewb(1, rrfVar2), oq5Var4), oq5Var4, 56);
                oq5Var4.p(true);
                if (intValue3 != u75.g(this.v) || this.w) {
                    oq5Var4.Z(-290245196);
                    cma b2 = rrfVar2.b();
                    eta.p(vciVar2, b2 != null ? b2.a : cub.e, oq5Var4, false);
                } else {
                    oq5Var4.Z(-290426670);
                    eta.p(vciVar2, 8, oq5Var4, false);
                }
                oq5Var4.p(false);
                break;
        }
        return Unit.a;
    }
}
