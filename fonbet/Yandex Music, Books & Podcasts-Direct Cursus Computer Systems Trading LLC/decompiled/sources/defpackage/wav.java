package defpackage;

import androidx.compose.ui.platform.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class wav implements pyc {
    public final /* synthetic */ int a;
    public final /* synthetic */ jav b;

    public /* synthetic */ wav(jav javVar, int i) {
        this.a = i;
        this.b = javVar;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                ght ghtVar = (ght) obj;
                hq5 hq5Var = (hq5) obj2;
                int intValue = ((Integer) obj3).intValue();
                ghtVar.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((oq5) hq5Var).f(ghtVar) ? 4 : 2;
                }
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 19) != 18)) {
                    boolean z = ghtVar instanceof ggt;
                    vci vciVar = vci.a;
                    if (z) {
                        oq5Var.Z(-57913650);
                        ggt ggtVar = (ggt) ghtVar;
                        String str = ggtVar.a;
                        boolean z2 = ggtVar.b;
                        Object K = oq5Var.K();
                        if (K == gq5.a) {
                            K = new t0v(19);
                            oq5Var.k0(K);
                        }
                        qgg.t(0, oq5Var, nfp.a(vciVar, (Function1) K), str, z2);
                        oq5Var.p(false);
                    } else {
                        if (!(ghtVar instanceof tgt)) {
                            throw vz1.i(oq5Var, -57915042, false);
                        }
                        oq5Var.Z(-57906713);
                        tgt tgtVar = (tgt) ghtVar;
                        qgg.u(tgtVar, this.b, tgtVar.c, a.a(vciVar, "waves_block"), oq5Var, (intValue & 14) | 3072);
                        oq5Var.p(false);
                    }
                } else {
                    oq5Var.S();
                }
                return Unit.a;
            default:
                oav oavVar = (oav) obj;
                hq5 hq5Var2 = (hq5) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                oavVar.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((oq5) hq5Var2).f(oavVar) ? 4 : 2;
                }
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 19) != 18)) {
                    qgg.x(oavVar, this.b, a.a(vci.a, "waves_block_row"), oq5Var2, (intValue2 & 14) | 384);
                } else {
                    oq5Var2.S();
                }
                return Unit.a;
        }
    }
}
