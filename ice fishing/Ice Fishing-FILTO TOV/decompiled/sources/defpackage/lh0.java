package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final /* synthetic */ class lh0 implements r90 {
    public final /* synthetic */ Object EljAMC1QTz;
    public final /* synthetic */ int OOA6hdeuvCS;

    public /* synthetic */ lh0(int i, Object obj) {
        this.OOA6hdeuvCS = i;
        this.EljAMC1QTz = obj;
    }

    @Override // defpackage.r90
    public final void OOA6hdeuvCS(t90 t90Var, l90 l90Var) {
        int i = this.OOA6hdeuvCS;
        int i2 = 0;
        Object obj = this.EljAMC1QTz;
        switch (i) {
            case 0:
                ph0 ph0Var = (ph0) obj;
                ph0Var.YmKjaVtbfp5Z = l90Var.GWasM1elztuh();
                if (ph0Var.X1lG3V04pd != null) {
                    ArrayList sb9fmtV8A = rb.sb9fmtV8A(ph0Var.EljAMC1QTz);
                    int size = sb9fmtV8A.size();
                    while (i2 < size) {
                        Object obj2 = sb9fmtV8A.get(i2);
                        i2++;
                        fh0 fh0Var = (fh0) obj2;
                        fh0Var.getClass();
                        hh0 hh0Var = fh0Var.E7jCp8Ls;
                        hh0Var.getClass();
                        hh0Var.GWasM1elztuh.encWxUiV2 = l90Var.GWasM1elztuh();
                        hh0Var.xqGvceK5x = l90Var.GWasM1elztuh();
                        hh0Var.Yi7zF1RB1();
                    }
                    break;
                }
                break;
            default:
                xw0 xw0Var = (xw0) obj;
                if (l90Var != l90.ON_START) {
                    if (l90Var == l90.ON_STOP) {
                        xw0Var.encWxUiV2 = false;
                        break;
                    }
                } else {
                    xw0Var.encWxUiV2 = true;
                    break;
                }
                break;
        }
    }
}
