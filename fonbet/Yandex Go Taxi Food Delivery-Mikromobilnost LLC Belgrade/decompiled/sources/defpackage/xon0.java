package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.slot.SlotSize;

/* loaded from: classes11.dex */
public final class xon0 implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ xon0(boolean z, int i) {
        this.a = i;
        this.b = z;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        c530 c530Var = c530.a;
        zy11 zy11Var = zy11.a;
        boolean z = this.b;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj2;
                int intValue = ((Number) obj3).intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
                    lhl0 a = khl0.a(lr20.a, x4c.E, btsVar, 48);
                    int hashCode = Long.hashCode(btsVar.T);
                    r1b0 o = btsVar.o();
                    f530 d = b.d(btsVar, c530Var);
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
                    f530 m = ljs0.m(c530Var, 7.0f);
                    boolean a2 = btsVar.a(z);
                    Object Q = btsVar.Q();
                    if (a2 || Q == did.a) {
                        Q = new aqk0(z, 1);
                        btsVar.o0(Q);
                    }
                    qeb1.a(6, btsVar, (tls) Q, m);
                    oeb1.c(btsVar, ljs0.q(c530Var, 8.0f));
                    jeb1.f(ohb1.e(btsVar, z ? kyh0.scooters_ignition_checked_slot_trail_enabled : kyh0.scooters_ignition_checked_slot_trail_disabled), null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar).h.a, btsVar, 0, 0, 16382);
                    btsVar.t(true);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            case 1:
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Number) obj3).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (btsVar2.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                    ydb1.a(null, null, wwg.S(-1495903557, true, new xon0(z, r6 ? 1 : 0), btsVar2), null, null, null, SlotSize.XS, false, btsVar2, 1573248, 187);
                } else {
                    btsVar2.Y();
                }
                return zy11Var;
            default:
                ibp0 ibp0Var = (ibp0) obj;
                fid fidVar3 = (fid) obj2;
                int intValue3 = ((Number) obj3).intValue();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((bts) fidVar3).k(ibp0Var) ? 4 : 2;
                }
                bts btsVar3 = (bts) fidVar3;
                if (btsVar3.V(intValue3 & 1, (intValue3 & 19) != 18)) {
                    zrb1.a(ibp0Var, ilb1.a(), ira1.i(c530Var, ((Number) androidx.compose.animation.core.b.b(z ? -180.0f : 0.0f, sb2.G(0.0f, 400.0f, 5, null), "AnimateChevron", null, btsVar3, 3120, 20).getValue()).floatValue()), null, btsVar3, intValue3 & 14, 12);
                } else {
                    btsVar3.Y();
                }
                return zy11Var;
        }
    }
}
