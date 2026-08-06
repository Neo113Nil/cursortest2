package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class au0 {
    public final rg0 AvO7iQsrTN;
    public final rg0 EljAMC1QTz;
    public Set GWasM1elztuh;
    public ArrayList JFJ3QoxA;
    public rg0 OOA6hdeuvCS;
    public final rg0 X1lG3V04pd;
    public bf Yi7zF1RB1;
    public ig0 encWxUiV2;
    public hg0 mOu10nynGul;
    public ig0 rQPn8YBR;
    public ig0 xqGvceK5x;

    public au0() {
        rg0 rg0Var = new rg0(new vx[16]);
        this.X1lG3V04pd = rg0Var;
        ig0 ig0Var = lx0.GWasM1elztuh;
        this.xqGvceK5x = new ig0();
        this.OOA6hdeuvCS = rg0Var;
        this.EljAMC1QTz = new rg0(new Object[16]);
        this.AvO7iQsrTN = new rg0(new wu[16]);
    }

    public static final boolean EljAMC1QTz(vx vxVar, rg0 rg0Var) {
        Object[] objArr = rg0Var.OOA6hdeuvCS;
        int i = rg0Var.AvO7iQsrTN;
        for (int i2 = 0; i2 < i; i2++) {
            bu0 bu0Var = ((vx) objArr[i2]).GWasM1elztuh;
            if (bu0Var instanceof yo0) {
                rg0 rg0Var2 = ((yo0) bu0Var).EljAMC1QTz;
                if (rg0Var2.JFJ3QoxA(vxVar) || EljAMC1QTz(vxVar, rg0Var2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void AvO7iQsrTN(Set set, bf bfVar) {
        GWasM1elztuh();
        this.GWasM1elztuh = set;
        this.Yi7zF1RB1 = bfVar;
    }

    public final void GWasM1elztuh() {
        this.GWasM1elztuh = null;
        this.Yi7zF1RB1 = null;
        rg0 rg0Var = this.X1lG3V04pd;
        rg0Var.AvO7iQsrTN();
        this.xqGvceK5x.Yi7zF1RB1();
        this.OOA6hdeuvCS = rg0Var;
        this.EljAMC1QTz.AvO7iQsrTN();
        this.AvO7iQsrTN.AvO7iQsrTN();
        this.encWxUiV2 = null;
        this.mOu10nynGul = null;
        this.JFJ3QoxA = null;
    }

    public final void OOA6hdeuvCS(vx vxVar) {
        if (!this.xqGvceK5x.X1lG3V04pd(vxVar)) {
            ig0 ig0Var = this.rQPn8YBR;
            if (ig0Var == null || !ig0Var.X1lG3V04pd(vxVar)) {
                this.EljAMC1QTz.Yi7zF1RB1(vxVar);
                return;
            }
            return;
        }
        this.xqGvceK5x.E7jCp8Ls(vxVar);
        if (!this.OOA6hdeuvCS.JFJ3QoxA(vxVar)) {
            rg0 rg0Var = this.X1lG3V04pd;
            if (!rg0Var.JFJ3QoxA(vxVar)) {
                EljAMC1QTz(vxVar, rg0Var);
            }
        }
        Set set = this.GWasM1elztuh;
        if (set == null) {
            return;
        }
        set.add(vxVar.GWasM1elztuh);
    }

    public final void X1lG3V04pd() {
        Set set = this.GWasM1elztuh;
        if (set == null) {
            return;
        }
        this.rQPn8YBR = null;
        rg0 rg0Var = this.EljAMC1QTz;
        int i = 2;
        if (rg0Var.AvO7iQsrTN != 0) {
            Trace.beginSection("Compose:onForgotten");
            try {
                ig0 ig0Var = this.encWxUiV2;
                int i2 = rg0Var.AvO7iQsrTN;
                while (true) {
                    i2--;
                    if (-1 >= i2) {
                        break;
                    }
                    Object obj = rg0Var.OOA6hdeuvCS[i2];
                    try {
                        if (obj instanceof vx) {
                            bu0 bu0Var = ((vx) obj).GWasM1elztuh;
                            set.remove(bu0Var);
                            bu0Var.OOA6hdeuvCS();
                        }
                        if (obj instanceof be) {
                            if (ig0Var == null || !ig0Var.X1lG3V04pd(obj)) {
                                ((be) obj).Yi7zF1RB1();
                            } else {
                                ((be) obj).GWasM1elztuh();
                            }
                        }
                    } catch (Throwable th) {
                        bf bfVar = this.Yi7zF1RB1;
                        if (bfVar != null) {
                            p.arNh8D4Z5gB(th, new h2(i, bfVar, obj));
                        }
                        throw th;
                    }
                }
            } finally {
            }
        }
        rg0 rg0Var2 = this.X1lG3V04pd;
        if (rg0Var2.AvO7iQsrTN != 0) {
            Trace.beginSection("Compose:onRemembered");
            try {
                Set set2 = this.GWasM1elztuh;
                if (set2 != null) {
                    Object[] objArr = rg0Var2.OOA6hdeuvCS;
                    int i3 = rg0Var2.AvO7iQsrTN;
                    for (int i4 = 0; i4 < i3; i4++) {
                        vx vxVar = (vx) objArr[i4];
                        bu0 bu0Var2 = vxVar.GWasM1elztuh;
                        set2.remove(bu0Var2);
                        try {
                            bu0Var2.X1lG3V04pd();
                        } catch (Throwable th2) {
                            bf bfVar2 = this.Yi7zF1RB1;
                            if (bfVar2 != null) {
                                p.arNh8D4Z5gB(th2, new h2(i, bfVar2, vxVar));
                            }
                            throw th2;
                        }
                    }
                }
            } finally {
            }
        }
    }

    public final void Yi7zF1RB1() {
        Set set = this.GWasM1elztuh;
        if (set == null || set.isEmpty()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                bu0 bu0Var = (bu0) it.next();
                it.remove();
                bu0Var.xqGvceK5x();
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void xqGvceK5x() {
        rg0 rg0Var = this.AvO7iQsrTN;
        if (rg0Var.AvO7iQsrTN != 0) {
            Trace.beginSection("Compose:sideeffects");
            try {
                Object[] objArr = rg0Var.OOA6hdeuvCS;
                int i = rg0Var.AvO7iQsrTN;
                for (int i2 = 0; i2 < i; i2++) {
                    ((wu) objArr[i2]).GWasM1elztuh();
                }
                rg0Var.AvO7iQsrTN();
            } finally {
                Trace.endSection();
            }
        }
    }
}
