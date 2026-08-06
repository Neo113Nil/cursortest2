package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class ei0 {
    public final bi0 GWasM1elztuh;
    public String OOA6hdeuvCS;
    public int X1lG3V04pd;
    public final y41 Yi7zF1RB1 = new y41();
    public String xqGvceK5x;

    public ei0(bi0 bi0Var) {
        this.GWasM1elztuh = bi0Var;
    }

    public final xh0 GWasM1elztuh(int i) {
        return X1lG3V04pd(i, this.GWasM1elztuh, null, false);
    }

    public final xh0 X1lG3V04pd(int i, xh0 xh0Var, xh0 xh0Var2, boolean z) {
        y41 y41Var = this.Yi7zF1RB1;
        xh0 xh0Var3 = (xh0) y41Var.Yi7zF1RB1(i);
        if (xh0Var2 != null) {
            if (o30.rQPn8YBR(xh0Var3, xh0Var2) && o30.rQPn8YBR(xh0Var3.AvO7iQsrTN, xh0Var2.AvO7iQsrTN)) {
                return xh0Var3;
            }
            xh0Var3 = null;
        } else if (xh0Var3 != null) {
            return xh0Var3;
        }
        bi0 bi0Var = this.GWasM1elztuh;
        if (z) {
            Iterator it = x01.k8h8IjolWQ(new jivtDDk9H(2, y41Var)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    xh0Var3 = null;
                    break;
                }
                xh0 xh0Var4 = (xh0) it.next();
                xh0Var3 = (!(xh0Var4 instanceof bi0) || xh0Var4.equals(xh0Var)) ? null : ((bi0) xh0Var4).JFJ3QoxA.X1lG3V04pd(i, bi0Var, xh0Var2, true);
                if (xh0Var3 != null) {
                    break;
                }
            }
        }
        if (xh0Var3 != null) {
            return xh0Var3;
        }
        bi0 bi0Var2 = bi0Var.AvO7iQsrTN;
        if (bi0Var2 == null || bi0Var2.equals(xh0Var)) {
            return null;
        }
        bi0 bi0Var3 = bi0Var.AvO7iQsrTN;
        bi0Var3.getClass();
        return bi0Var3.JFJ3QoxA.X1lG3V04pd(i, bi0Var, xh0Var2, z);
    }

    public final xh0 Yi7zF1RB1(String str, boolean z) {
        Object obj;
        bi0 bi0Var;
        str.getClass();
        y41 y41Var = this.Yi7zF1RB1;
        y41Var.getClass();
        Iterator it = x01.k8h8IjolWQ(new jivtDDk9H(2, y41Var)).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            xh0 xh0Var = (xh0) obj;
            String str2 = (String) xh0Var.EljAMC1QTz.OOA6hdeuvCS;
            if ((str2 == null ? false : str2.equals(str)) || xh0Var.EljAMC1QTz.GWasM1elztuh(str) != null) {
                break;
            }
        }
        xh0 xh0Var2 = (xh0) obj;
        if (xh0Var2 != null) {
            return xh0Var2;
        }
        if (!z || (bi0Var = this.GWasM1elztuh.AvO7iQsrTN) == null) {
            return null;
        }
        ei0 ei0Var = bi0Var.JFJ3QoxA;
        ei0Var.getClass();
        if (b61.MItybXapHX(str)) {
            return null;
        }
        return ei0Var.Yi7zF1RB1(str, true);
    }

    public final wh0 xqGvceK5x(wh0 wh0Var, f4 f4Var, boolean z, xh0 xh0Var) {
        wh0 wh0Var2;
        ArrayList arrayList = new ArrayList();
        bi0 bi0Var = this.GWasM1elztuh;
        Iterator it = bi0Var.iterator();
        while (true) {
            di0 di0Var = (di0) it;
            if (!di0Var.hasNext()) {
                break;
            }
            xh0 xh0Var2 = (xh0) di0Var.next();
            wh0Var2 = o30.rQPn8YBR(xh0Var2, xh0Var) ? null : xh0Var2.X1lG3V04pd(f4Var);
            if (wh0Var2 != null) {
                arrayList.add(wh0Var2);
            }
        }
        wh0 wh0Var3 = (wh0) rb.bCsSzSHkbaQ(arrayList);
        bi0 bi0Var2 = bi0Var.AvO7iQsrTN;
        if (bi0Var2 != null && z && !bi0Var2.equals(xh0Var)) {
            wh0Var2 = bi0Var2.OOA6hdeuvCS(f4Var, bi0Var);
        }
        return (wh0) rb.bCsSzSHkbaQ(d5.NyNgffpi(new wh0[]{wh0Var, wh0Var3, wh0Var2}));
    }
}
