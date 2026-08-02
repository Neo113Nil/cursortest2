package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;

/* loaded from: classes10.dex */
public final /* synthetic */ class z82 implements wls {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ f530 b;
    public final /* synthetic */ long c;

    public /* synthetic */ z82(long j, f530 f530Var) {
        this.c = j;
        this.b = f530Var;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        long j = this.c;
        fid fidVar = (fid) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    f530 f530Var = this.b;
                    if (j != 9205357640488583168L) {
                        btsVar.e0(-1244013944);
                        f530 k = ljs0.k(f530Var, c8m.b(j), c8m.a(j), 0.0f, 0.0f, 12);
                        z910 d = pi6.d(x4c.c, false);
                        int hashCode = Long.hashCode(btsVar.T);
                        r1b0 o = btsVar.o();
                        f530 d2 = b.d(btsVar, k);
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
                        qje.W(btsVar, d.f, d);
                        qje.W(btsVar, d.e, o);
                        qje.W(btsVar, d.g, Integer.valueOf(hashCode));
                        qje.M(btsVar, d.h);
                        qje.W(btsVar, d.d, d2);
                        c92.b(0, 1, btsVar, null);
                        btsVar.t(true);
                        btsVar.t(false);
                    } else {
                        btsVar.e0(-1243644858);
                        c92.b(0, 0, btsVar, f530Var);
                        btsVar.t(false);
                    }
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            default:
                num.getClass();
                r4z0.d(vng.O(7), j, fidVar, this.b);
                return zy11Var;
        }
    }

    public /* synthetic */ z82(f530 f530Var, long j, int i) {
        this.b = f530Var;
        this.c = j;
    }
}
