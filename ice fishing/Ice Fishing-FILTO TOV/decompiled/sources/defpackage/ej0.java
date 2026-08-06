package defpackage;

import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class ej0 {
    public kh0 GWasM1elztuh;
    public boolean Yi7zF1RB1;

    public boolean EljAMC1QTz() {
        return true;
    }

    public abstract xh0 GWasM1elztuh();

    public void OOA6hdeuvCS(fh0 fh0Var, boolean z) {
        List list = (List) Yi7zF1RB1().OOA6hdeuvCS.OOA6hdeuvCS.getValue();
        if (!list.contains(fh0Var)) {
            o4.WIEu4Ya2g8("popBackStack was called with ", fh0Var, " which does not exist in back stack ", list);
            return;
        }
        ListIterator listIterator = list.listIterator(list.size());
        fh0 fh0Var2 = null;
        while (EljAMC1QTz()) {
            fh0Var2 = (fh0) listIterator.previous();
            if (o30.rQPn8YBR(fh0Var2, fh0Var)) {
                break;
            }
        }
        if (fh0Var2 != null) {
            Yi7zF1RB1().xqGvceK5x(fh0Var2, z);
        }
    }

    public final kh0 Yi7zF1RB1() {
        kh0 kh0Var = this.GWasM1elztuh;
        if (kh0Var != null) {
            return kh0Var;
        }
        o4.jivtDDk9H("You cannot access the Navigator's state until the Navigator is attached");
        return null;
    }

    public void xqGvceK5x(List list, si0 si0Var) {
        vr vrVar = new vr(new cl(new r71(new xb(0, list), new E7jCp8Ls(12, this, si0Var), 1), new dx0(22), 1));
        while (vrVar.hasNext()) {
            Yi7zF1RB1().EljAMC1QTz((fh0) vrVar.next());
        }
    }

    public xh0 X1lG3V04pd(xh0 xh0Var) {
        return xh0Var;
    }
}
