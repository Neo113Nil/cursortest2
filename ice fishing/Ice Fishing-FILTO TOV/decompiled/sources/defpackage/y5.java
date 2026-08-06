package defpackage;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class y5 {
    public final ArrayList GWasM1elztuh;
    public final /* synthetic */ Object OOA6hdeuvCS;
    public final CopyOnWriteArrayList X1lG3V04pd;
    public boolean Yi7zF1RB1;
    public final /* synthetic */ int xqGvceK5x;

    public y5(boolean z) {
        this.GWasM1elztuh = new ArrayList();
        this.Yi7zF1RB1 = z;
        this.X1lG3V04pd = new CopyOnWriteArrayList();
    }

    public final void xqGvceK5x(boolean z) {
        this.Yi7zF1RB1 = z;
        ArrayList arrayList = this.GWasM1elztuh;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            bl0 bl0Var = (bl0) obj;
            bl0Var.EljAMC1QTz(bl0Var.OOA6hdeuvCS && z);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y5(int i, Object obj) {
        this(false);
        this.xqGvceK5x = i;
        this.OOA6hdeuvCS = obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public y5(a0 a0Var) {
        this(true);
        this.xqGvceK5x = 2;
        this.OOA6hdeuvCS = a0Var;
    }

    public final void GWasM1elztuh() {
    }

    public final void X1lG3V04pd(w5 w5Var) {
    }

    public final void Yi7zF1RB1(w5 w5Var) {
    }
}
