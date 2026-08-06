package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class ep implements Runnable {
    public final int EljAMC1QTz;
    public final ArrayList OOA6hdeuvCS;

    public ep(List list, int i, Throwable th) {
        n4.AvO7iQsrTN(list, "initCallbacks cannot be null");
        this.OOA6hdeuvCS = new ArrayList(list);
        this.EljAMC1QTz = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.OOA6hdeuvCS;
        int size = arrayList.size();
        int i = 0;
        if (this.EljAMC1QTz != 1) {
            while (i < size) {
                ((ik) arrayList.get(i)).Yi7zF1RB1.EljAMC1QTz = p.xqGvceK5x;
                i++;
            }
            return;
        }
        while (i < size) {
            ik ikVar = (ik) arrayList.get(i);
            ikVar.GWasM1elztuh.setValue(Boolean.TRUE);
            ikVar.Yi7zF1RB1.EljAMC1QTz = new m00(true);
            i++;
        }
    }
}
