package defpackage;

import androidx.compose.ui.input.nestedscroll.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class kpq implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qnq b;
    public final /* synthetic */ hgp c;
    public final /* synthetic */ npq d;
    public final /* synthetic */ wxi e;

    public /* synthetic */ kpq(qnq qnqVar, hgp hgpVar, npq npqVar, wxi wxiVar, int i) {
        this.a = i;
        this.b = qnqVar;
        this.c = hgpVar;
        this.d = npqVar;
        this.e = wxiVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        hq5 hq5Var = (hq5) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    etn.m(new qzm[]{clg.d.o(clg.e, oq5Var), dlg.d.o(dlg.e, oq5Var)}, ild.C(-432377760, new kpq(this.b, this.c, this.d, this.e, 1), oq5Var), oq5Var, 56);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                boolean z = false;
                oq5 oq5Var2 = (oq5) hq5Var;
                if (oq5Var2.P(intValue & 1, (intValue & 3) != 2)) {
                    npq npqVar = this.d;
                    nnq nnqVar = ((uoq) npqVar.d.getValue()).e;
                    fvf fvfVar = npqVar.n;
                    if (((Boolean) npqVar.j.getValue()).booleanValue()) {
                        oq5Var2.Z(1096814277);
                        boolean booleanValue = ((Boolean) szf.Q(npqVar.o, oq5Var2).getValue()).booleanValue();
                        oq5Var2.p(false);
                        z = booleanValue;
                    } else {
                        oq5Var2.Z(-358494544);
                        oq5Var2.p(false);
                    }
                    yci yciVar = vci.a;
                    if (!z) {
                        yciVar = a.a(yciVar, this.e, null);
                    }
                    yci yciVar2 = yciVar;
                    boolean h = oq5Var2.h(npqVar);
                    Object K = oq5Var2.K();
                    if (h || K == gq5.a) {
                        K = new jpq(npqVar, 1);
                        oq5Var2.k0(K);
                    }
                    q7g.l(this.b, this.c, nnqVar, fvfVar, yciVar2, (Function0) K, oq5Var2, 8);
                } else {
                    oq5Var2.S();
                }
                break;
        }
        return Unit.a;
    }
}
