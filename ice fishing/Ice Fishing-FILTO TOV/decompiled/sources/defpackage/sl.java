package defpackage;

import java.util.List;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final /* synthetic */ class sl implements hv {
    public final /* synthetic */ Object AvO7iQsrTN;
    public final /* synthetic */ boolean EljAMC1QTz;
    public final /* synthetic */ int OOA6hdeuvCS = 0;
    public final /* synthetic */ Object encWxUiV2;

    public /* synthetic */ sl(fh0 fh0Var, List list, boolean z) {
        this.AvO7iQsrTN = fh0Var;
        this.EljAMC1QTz = z;
        this.encWxUiV2 = list;
    }

    @Override // defpackage.hv
    public final Object mOu10nynGul(Object obj) {
        int i = this.OOA6hdeuvCS;
        Object obj2 = this.encWxUiV2;
        Object obj3 = this.AvO7iQsrTN;
        final boolean z = this.EljAMC1QTz;
        switch (i) {
            case 0:
                final fh0 fh0Var = (fh0) obj3;
                final List list = (List) obj2;
                r90 r90Var = new r90() { // from class: tl
                    @Override // defpackage.r90
                    public final void OOA6hdeuvCS(t90 t90Var, l90 l90Var) {
                        boolean z2 = z;
                        List list2 = list;
                        fh0 fh0Var2 = fh0Var;
                        if (z2 && !list2.contains(fh0Var2)) {
                            list2.add(fh0Var2);
                        }
                        if (l90Var == l90.ON_START && !list2.contains(fh0Var2)) {
                            list2.add(fh0Var2);
                        }
                        if (l90Var == l90.ON_STOP) {
                            list2.remove(fh0Var2);
                        }
                    }
                };
                fh0Var.E7jCp8Ls.JFJ3QoxA.GWasM1elztuh(r90Var);
                return new wl(0, fh0Var, r90Var);
            default:
                String str = (String) obj3;
                m31 m31Var = (m31) obj2;
                l01 l01Var = (l01) obj;
                if (z) {
                    u40[] u40VarArr = j01.GWasM1elztuh;
                    k01 k01Var = h01.rQPn8YBR;
                    u40 u40Var = j01.GWasM1elztuh[3];
                    l01Var.GWasM1elztuh(k01Var, new ya0());
                }
                o1 o1Var = new o1(19, m31Var);
                u40[] u40VarArr2 = j01.GWasM1elztuh;
                l01Var.GWasM1elztuh(yz0.Y6hRI1cF8, new VeqTn1PQw7(null, o1Var));
                k01 k01Var2 = h01.xqGvceK5x;
                u40 u40Var2 = j01.GWasM1elztuh[2];
                l01Var.GWasM1elztuh(k01Var2, str);
                return kc1.GWasM1elztuh;
        }
    }

    public /* synthetic */ sl(boolean z, String str, m31 m31Var) {
        this.EljAMC1QTz = z;
        this.AvO7iQsrTN = str;
        this.encWxUiV2 = m31Var;
    }
}
