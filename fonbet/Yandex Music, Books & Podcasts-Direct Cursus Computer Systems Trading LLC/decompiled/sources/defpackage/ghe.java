package defpackage;

import androidx.compose.ui.platform.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class ghe implements pyc {
    public final /* synthetic */ int a;
    public final /* synthetic */ khe b;

    public /* synthetic */ ghe(khe kheVar, int i) {
        this.a = i;
        this.b = kheVar;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                cht chtVar = (cht) obj;
                hq5 hq5Var = (hq5) obj2;
                int intValue = ((Integer) obj3).intValue();
                chtVar.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((oq5) hq5Var).f(chtVar) ? 4 : 2;
                }
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 19) != 18)) {
                    boolean z = chtVar instanceof cgt;
                    vci vciVar = vci.a;
                    if (z) {
                        oq5Var.Z(928028834);
                        cgt cgtVar = (cgt) chtVar;
                        String str = cgtVar.a;
                        boolean z2 = cgtVar.b;
                        Object K = oq5Var.K();
                        if (K == gq5.a) {
                            K = new mvd(26);
                            oq5Var.k0(K);
                        }
                        jhe.b(0, oq5Var, nfp.a(vciVar, (Function1) K), str, z2);
                        oq5Var.p(false);
                    } else {
                        if (!(chtVar instanceof pgt)) {
                            throw vz1.i(oq5Var, -2048274905, false);
                        }
                        oq5Var.Z(928322466);
                        pgt pgtVar = (pgt) chtVar;
                        jhe.c(pgtVar, pgtVar.c, this.b, a.a(vciVar, "in_style_block"), oq5Var, (intValue & 14) | 3072);
                        oq5Var.p(false);
                    }
                } else {
                    oq5Var.S();
                }
                return Unit.a;
            default:
                ahe aheVar = (ahe) obj;
                hq5 hq5Var2 = (hq5) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                aheVar.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((oq5) hq5Var2).f(aheVar) ? 4 : 2;
                }
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 19) != 18)) {
                    jhe.f(aheVar, this.b, a.a(vci.a, "in_style_block_albums"), oq5Var2, (intValue2 & 14) | 384);
                } else {
                    oq5Var2.S();
                }
                return Unit.a;
        }
    }
}
