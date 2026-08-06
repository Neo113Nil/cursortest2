package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
@dj0("composable")
/* loaded from: classes.dex */
public final class zd extends ej0 {
    public final fo0 X1lG3V04pd = z50.WRKkgoJXwDn(Boolean.FALSE);

    public final void AvO7iQsrTN(fh0 fh0Var) {
        kh0 Yi7zF1RB1 = Yi7zF1RB1();
        fh0Var.getClass();
        p51 p51Var = Yi7zF1RB1.X1lG3V04pd;
        p51Var.JFJ3QoxA(null, a11.DmJncFq5((Set) p51Var.getValue(), fh0Var));
        ph0 ph0Var = Yi7zF1RB1.encWxUiV2.Yi7zF1RB1;
        ph0Var.getClass();
        if (ph0Var.EljAMC1QTz.contains(fh0Var)) {
            fh0Var.GWasM1elztuh(m90.encWxUiV2);
        } else {
            o4.jivtDDk9H("Cannot transition entry that is not in the back stack");
        }
    }

    @Override // defpackage.ej0
    public final xh0 GWasM1elztuh() {
        return new yd(this, md.GWasM1elztuh);
    }

    @Override // defpackage.ej0
    public final void OOA6hdeuvCS(fh0 fh0Var, boolean z) {
        Yi7zF1RB1().OOA6hdeuvCS(fh0Var, z);
        this.X1lG3V04pd.setValue(Boolean.TRUE);
    }

    @Override // defpackage.ej0
    public final void xqGvceK5x(List list, si0 si0Var) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            fh0 fh0Var = (fh0) it.next();
            kh0 Yi7zF1RB1 = Yi7zF1RB1();
            ys0 ys0Var = Yi7zF1RB1.OOA6hdeuvCS;
            fh0Var.getClass();
            p51 p51Var = Yi7zF1RB1.X1lG3V04pd;
            Iterable iterable = (Iterable) p51Var.getValue();
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it2 = iterable.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (((fh0) it2.next()) == fh0Var) {
                        Iterable iterable2 = (Iterable) ys0Var.OOA6hdeuvCS.getValue();
                        if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                            Iterator it3 = iterable2.iterator();
                            while (it3.hasNext()) {
                                if (((fh0) it3.next()) == fh0Var) {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            fh0 fh0Var2 = (fh0) rb.cTIXpaxc((List) ys0Var.OOA6hdeuvCS.getValue());
            if (fh0Var2 != null) {
                p51Var.JFJ3QoxA(null, a11.DmJncFq5((Set) p51Var.getValue(), fh0Var2));
            }
            p51Var.JFJ3QoxA(null, a11.DmJncFq5((Set) p51Var.getValue(), fh0Var));
            Yi7zF1RB1.EljAMC1QTz(fh0Var);
        }
        this.X1lG3V04pd.setValue(Boolean.FALSE);
    }
}
