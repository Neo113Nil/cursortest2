package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.google.ar.core.ImageMetadata;

/* loaded from: classes13.dex */
public final class tpn0 implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ rqn0 b;
    public final /* synthetic */ tls c;

    public /* synthetic */ tpn0(rqn0 rqn0Var, tls tlsVar, int i) {
        this.a = i;
        this.b = rqn0Var;
        this.c = tlsVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        g43 g43Var = lr20.c;
        tls tlsVar = this.c;
        rqn0 rqn0Var = this.b;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj2;
                int intValue = ((Number) obj3).intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
                    k3r k3rVar = ljs0.c;
                    sic a = qic.a(g43Var, x4c.G, btsVar, 0);
                    int hashCode = Long.hashCode(btsVar.T);
                    r1b0 o = btsVar.o();
                    f530 d = b.d(btsVar, k3rVar);
                    ohd.G1.getClass();
                    sls slsVar = d.b;
                    if (btsVar.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar.i0();
                    if (btsVar.S) {
                        btsVar.n(slsVar);
                    } else {
                        btsVar.r0();
                    }
                    qje.W(btsVar, d.f, a);
                    qje.W(btsVar, d.e, o);
                    qje.W(btsVar, d.g, Integer.valueOf(hashCode));
                    qje.M(btsVar, d.h);
                    qje.W(btsVar, d.d, d);
                    xbd.a.getClass();
                    crb1.b(null, null, null, null, null, xbd.b, null, btsVar, ImageMetadata.EDGE_MODE, 95);
                    ydb1.a(an91.o(c530.a, 0.0f, 0.0f, 0.0f, 8.0f, 7), null, wwg.S(-682063383, true, new spn0(rqn0Var, 0), btsVar), null, null, null, null, false, btsVar, 390, 250);
                    com.yandex.go.scooters.ignition.controlling.d.b(rqn0Var, tlsVar, btsVar, 0);
                    btsVar.t(true);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            default:
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Number) obj3).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (btsVar2.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                    sic a2 = qic.a(g43Var, x4c.G, btsVar2, 0);
                    int hashCode2 = Long.hashCode(btsVar2.T);
                    r1b0 o2 = btsVar2.o();
                    c530 c530Var = c530.a;
                    f530 d2 = b.d(btsVar2, c530Var);
                    ohd.G1.getClass();
                    sls slsVar2 = d.b;
                    if (btsVar2.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar2.i0();
                    if (btsVar2.S) {
                        btsVar2.n(slsVar2);
                    } else {
                        btsVar2.r0();
                    }
                    qje.W(btsVar2, d.f, a2);
                    qje.W(btsVar2, d.e, o2);
                    qje.W(btsVar2, d.g, Integer.valueOf(hashCode2));
                    qje.M(btsVar2, d.h);
                    qje.W(btsVar2, d.d, d2);
                    ydb1.a(an91.o(c530Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), null, wwg.S(1878653726, true, new spn0(rqn0Var, 1), btsVar2), null, null, null, null, false, btsVar2, 390, 250);
                    com.yandex.go.scooters.ignition.controlling.d.b(rqn0Var, tlsVar, btsVar2, 0);
                    btsVar2.t(true);
                } else {
                    btsVar2.Y();
                }
                return zy11Var;
        }
    }
}
