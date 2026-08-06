package defpackage;

import android.util.LongSparseArray;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final /* synthetic */ class t implements Runnable {
    public final /* synthetic */ Object AvO7iQsrTN;
    public final /* synthetic */ Object EljAMC1QTz;
    public final /* synthetic */ int OOA6hdeuvCS;

    public /* synthetic */ t(int i, Object obj, Object obj2) {
        this.OOA6hdeuvCS = i;
        this.EljAMC1QTz = obj;
        this.AvO7iQsrTN = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.OOA6hdeuvCS;
        Object obj = this.AvO7iQsrTN;
        Object obj2 = this.EljAMC1QTz;
        switch (i) {
            case 0:
                o30.Y6hRI1cF8((w) obj2, (LongSparseArray) obj);
                break;
            case 1:
                fd fdVar = (fd) obj2;
                fdVar.OOA6hdeuvCS.GWasM1elztuh(new xc((hl0) obj, fdVar));
                break;
            default:
                fi1 fi1Var = (fi1) obj2;
                w90 w90Var = (w90) obj;
                if (!fi1Var.AvO7iQsrTN) {
                    fi1Var.encWxUiV2 = w90Var;
                    w90Var.GWasM1elztuh(fi1Var);
                    break;
                }
                break;
        }
    }
}
