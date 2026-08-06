package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
@dj0("dialog")
/* loaded from: classes.dex */
public final class am extends ej0 {
    @Override // defpackage.ej0
    public final xh0 GWasM1elztuh() {
        jd jdVar = od.GWasM1elztuh;
        return new zl(this);
    }

    @Override // defpackage.ej0
    public final void OOA6hdeuvCS(fh0 fh0Var, boolean z) {
        Yi7zF1RB1().OOA6hdeuvCS(fh0Var, z);
        int ZB4nixHlTE = rb.ZB4nixHlTE((Iterable) Yi7zF1RB1().EljAMC1QTz.OOA6hdeuvCS.getValue(), fh0Var);
        int i = 0;
        for (Object obj : (Iterable) Yi7zF1RB1().EljAMC1QTz.OOA6hdeuvCS.getValue()) {
            int i2 = i + 1;
            if (i < 0) {
                fb1.MjxSquD6Av();
                throw null;
            }
            fh0 fh0Var2 = (fh0) obj;
            if (i > ZB4nixHlTE) {
                Yi7zF1RB1().X1lG3V04pd(fh0Var2);
            }
            i = i2;
        }
    }

    @Override // defpackage.ej0
    public final void xqGvceK5x(List list, si0 si0Var) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Yi7zF1RB1().EljAMC1QTz((fh0) it.next());
        }
    }
}
