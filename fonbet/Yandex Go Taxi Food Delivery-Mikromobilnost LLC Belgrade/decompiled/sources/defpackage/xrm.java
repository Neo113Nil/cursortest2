package defpackage;

import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;

/* loaded from: classes11.dex */
public final class xrm implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ xrm(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        a aVar = this.b;
        switch (i) {
            case 0:
                j690 j690Var = (j690) obj;
                fid fidVar = (fid) obj2;
                int intValue = ((Number) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= ((bts) fidVar).k(j690Var) ? 4 : 2;
                }
                if ((intValue & 19) == 18) {
                    bts btsVar = (bts) fidVar;
                    if (btsVar.E()) {
                        btsVar.Y();
                        return zy11Var;
                    }
                }
                f530 j = an91.j(c530.a, j690Var);
                sic a = qic.a(lr20.c, x4c.G, fidVar, 0);
                bts btsVar2 = (bts) fidVar;
                int hashCode = Long.hashCode(btsVar2.T);
                r1b0 o = btsVar2.o();
                f530 d = b.d(fidVar, j);
                ohd.G1.getClass();
                sls slsVar = d.b;
                bts btsVar3 = (bts) fidVar;
                if (btsVar3.a == null) {
                    cma1.b0();
                    throw null;
                }
                btsVar3.i0();
                if (btsVar3.S) {
                    btsVar3.n(slsVar);
                } else {
                    btsVar3.r0();
                }
                qje.W(fidVar, d.f, a);
                qje.W(fidVar, d.e, o);
                wls wlsVar = d.g;
                if (btsVar3.S || !jl40.l(btsVar3.Q(), Integer.valueOf(hashCode))) {
                    b64.z(hashCode, btsVar3, hashCode, wlsVar);
                }
                qje.W(fidVar, d.d, d);
                aVar.invoke(uic.a, Boolean.FALSE, fidVar, 54);
                btsVar3.t(true);
                return zy11Var;
            case 1:
                tic ticVar = (tic) obj;
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Number) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((bts) fidVar2).k(ticVar) ? 4 : 2;
                }
                if ((intValue2 & 19) == 18) {
                    bts btsVar4 = (bts) fidVar2;
                    if (btsVar4.E()) {
                        btsVar4.Y();
                        return zy11Var;
                    }
                }
                aVar.invoke(ticVar, Boolean.FALSE, fidVar2, Integer.valueOf((intValue2 & 14) | 48));
                return zy11Var;
            default:
                tic ticVar2 = (tic) obj;
                fid fidVar3 = (fid) obj2;
                int intValue3 = ((Number) obj3).intValue();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((bts) fidVar3).k(ticVar2) ? 4 : 2;
                }
                if ((intValue3 & 19) == 18) {
                    bts btsVar5 = (bts) fidVar3;
                    if (btsVar5.E()) {
                        btsVar5.Y();
                        return zy11Var;
                    }
                }
                aVar.invoke(ticVar2, Boolean.FALSE, fidVar3, Integer.valueOf((intValue3 & 14) | 48));
                return zy11Var;
        }
    }
}
