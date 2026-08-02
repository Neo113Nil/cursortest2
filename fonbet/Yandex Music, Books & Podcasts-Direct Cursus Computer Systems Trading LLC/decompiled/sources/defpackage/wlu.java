package defpackage;

import androidx.compose.ui.platform.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class wlu implements pyc {
    public final /* synthetic */ int a;
    public final /* synthetic */ nlu b;
    public final /* synthetic */ hoq c;

    public /* synthetic */ wlu(nlu nluVar, hoq hoqVar, int i) {
        this.a = i;
        this.b = nluVar;
        this.c = hoqVar;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                fht fhtVar = (fht) obj;
                hq5 hq5Var = (hq5) obj2;
                int intValue = ((Integer) obj3).intValue();
                fhtVar.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((oq5) hq5Var).f(fhtVar) ? 4 : 2;
                }
                if ((intValue & 19) == 18) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        return Unit.a;
                    }
                }
                boolean z = fhtVar instanceof fgt;
                vci vciVar = vci.a;
                if (z) {
                    oq5 oq5Var2 = (oq5) hq5Var;
                    oq5Var2.Z(649098735);
                    fgt fgtVar = (fgt) fhtVar;
                    String str = fgtVar.a;
                    boolean z2 = fgtVar.b;
                    Object K = oq5Var2.K();
                    if (K == gq5.a) {
                        K = new xlu(0);
                        oq5Var2.k0(K);
                    }
                    o2g.q(0, oq5Var2, nfp.a(vciVar, (Function1) K), str, z2);
                    oq5Var2.p(false);
                } else {
                    if (!(fhtVar instanceof sgt)) {
                        throw vz1.i((oq5) hq5Var, 649097385, false);
                    }
                    oq5 oq5Var3 = (oq5) hq5Var;
                    oq5Var3.Z(-1352554570);
                    sgt sgtVar = (sgt) fhtVar;
                    o2g.r(sgtVar, this.b, sgtVar.c, this.c, a.a(vciVar, "waves_agents_block"), oq5Var3, (intValue & 14) | 25088);
                    oq5Var3.p(false);
                }
                return Unit.a;
            default:
                glu gluVar = (glu) obj;
                hq5 hq5Var2 = (hq5) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                gluVar.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= (intValue2 & 8) == 0 ? ((oq5) hq5Var2).f(gluVar) : ((oq5) hq5Var2).h(gluVar) ? 4 : 2;
                }
                if ((intValue2 & 19) == 18) {
                    oq5 oq5Var4 = (oq5) hq5Var2;
                    if (oq5Var4.z()) {
                        oq5Var4.S();
                        return Unit.a;
                    }
                }
                o2g.x(gluVar, this.b, this.c, a.a(vci.a, "waves_agents_block_row"), hq5Var2, 3080 | (intValue2 & 14));
                return Unit.a;
        }
    }
}
