package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class afv implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ dfv b;

    public /* synthetic */ afv(dfv dfvVar, int i) {
        this.a = i;
        this.b = dfvVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                dfv dfvVar = this.b;
                jf0.a(new qzm[0], dfvVar.j, false, ild.C(652556810, new afv(dfvVar, 1), hq5Var), hq5Var, 0, 4);
            case 1:
                hq5 hq5Var2 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var2 = (oq5) hq5Var2;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        break;
                    }
                }
                qs5 qs5Var = sfv.a;
                agr agrVar = eq0.a;
                oq5 oq5Var3 = (oq5) hq5Var2;
                etn.l(qs5Var.a(new rfv(((dq0) oq5Var3.j(agrVar)).c.a, ((dq0) oq5Var3.j(agrVar)).a.a)), ild.C(685215050, new afv(this.b, 2), hq5Var2), hq5Var2, 56);
            default:
                hq5 hq5Var3 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var4 = (oq5) hq5Var3;
                    if (oq5Var4.z()) {
                        oq5Var4.S();
                        break;
                    }
                }
                dfv dfvVar2 = this.b;
                tfv tfvVar = (tfv) dfvVar2.p.getValue();
                xfv xfvVar = dfvVar2.o;
                if (xfvVar == null) {
                    xfvVar = new xfv(127);
                }
                tyf.k(tfvVar, xfvVar, dfvVar2.n, hq5Var3, 8);
        }
        return Unit.a;
    }
}
