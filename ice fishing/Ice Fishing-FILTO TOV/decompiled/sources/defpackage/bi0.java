package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public class bi0 extends xh0 implements Iterable, q40 {
    public static final /* synthetic */ int rQPn8YBR = 0;
    public final ei0 JFJ3QoxA;

    public bi0(gi0 gi0Var) {
        super(gi0Var);
        this.JFJ3QoxA = new ei0(this);
    }

    public final wh0 EljAMC1QTz(String str, boolean z, xh0 xh0Var) {
        wh0 wh0Var;
        ei0 ei0Var = this.JFJ3QoxA;
        ei0Var.getClass();
        bi0 bi0Var = ei0Var.GWasM1elztuh;
        wh0 GWasM1elztuh = bi0Var.EljAMC1QTz.GWasM1elztuh(str);
        ArrayList arrayList = new ArrayList();
        Iterator it = bi0Var.iterator();
        while (true) {
            di0 di0Var = (di0) it;
            wh0Var = null;
            if (!di0Var.hasNext()) {
                break;
            }
            xh0 xh0Var2 = (xh0) di0Var.next();
            if (!o30.rQPn8YBR(xh0Var2, xh0Var)) {
                if (xh0Var2 instanceof bi0) {
                    wh0Var = ((bi0) xh0Var2).EljAMC1QTz(str, false, bi0Var);
                } else {
                    xh0Var2.getClass();
                    wh0Var = xh0Var2.EljAMC1QTz.GWasM1elztuh(str);
                }
            }
            if (wh0Var != null) {
                arrayList.add(wh0Var);
            }
        }
        wh0 wh0Var2 = (wh0) rb.bCsSzSHkbaQ(arrayList);
        bi0 bi0Var2 = bi0Var.AvO7iQsrTN;
        if (bi0Var2 != null && z && !bi0Var2.equals(xh0Var)) {
            wh0Var = bi0Var2.EljAMC1QTz(str, true, bi0Var);
        }
        return (wh0) rb.bCsSzSHkbaQ(d5.NyNgffpi(new wh0[]{GWasM1elztuh, wh0Var2, wh0Var}));
    }

    public final wh0 OOA6hdeuvCS(f4 f4Var, xh0 xh0Var) {
        return this.JFJ3QoxA.xqGvceK5x(super.X1lG3V04pd(f4Var), f4Var, true, xh0Var);
    }

    @Override // defpackage.xh0
    public final wh0 X1lG3V04pd(f4 f4Var) {
        wh0 X1lG3V04pd = super.X1lG3V04pd(f4Var);
        ei0 ei0Var = this.JFJ3QoxA;
        ei0Var.getClass();
        return ei0Var.xqGvceK5x(X1lG3V04pd, f4Var, false, ei0Var.GWasM1elztuh);
    }

    @Override // defpackage.xh0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof bi0) || !super.equals(obj)) {
            return false;
        }
        ei0 ei0Var = this.JFJ3QoxA;
        int OOA6hdeuvCS = ei0Var.Yi7zF1RB1.OOA6hdeuvCS();
        ei0 ei0Var2 = ((bi0) obj).JFJ3QoxA;
        if (OOA6hdeuvCS != ei0Var2.Yi7zF1RB1.OOA6hdeuvCS() || ei0Var.X1lG3V04pd != ei0Var2.X1lG3V04pd) {
            return false;
        }
        y41 y41Var = ei0Var.Yi7zF1RB1;
        y41Var.getClass();
        for (xh0 xh0Var : x01.k8h8IjolWQ(new jivtDDk9H(2, y41Var))) {
            if (!xh0Var.equals(ei0Var2.Yi7zF1RB1.Yi7zF1RB1(xh0Var.EljAMC1QTz.GWasM1elztuh))) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.xh0
    public final int hashCode() {
        ei0 ei0Var = this.JFJ3QoxA;
        int i = ei0Var.X1lG3V04pd;
        y41 y41Var = ei0Var.Yi7zF1RB1;
        int OOA6hdeuvCS = y41Var.OOA6hdeuvCS();
        for (int i2 = 0; i2 < OOA6hdeuvCS; i2++) {
            i = (((i * 31) + y41Var.X1lG3V04pd(i2)) * 31) + ((xh0) y41Var.EljAMC1QTz(i2)).hashCode();
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        ei0 ei0Var = this.JFJ3QoxA;
        ei0Var.getClass();
        return new di0(ei0Var);
    }

    @Override // defpackage.xh0
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        ei0 ei0Var = this.JFJ3QoxA;
        String str = ei0Var.OOA6hdeuvCS;
        ei0Var.getClass();
        xh0 Yi7zF1RB1 = (str == null || b61.MItybXapHX(str)) ? null : ei0Var.Yi7zF1RB1(str, true);
        if (Yi7zF1RB1 == null) {
            Yi7zF1RB1 = ei0Var.GWasM1elztuh(ei0Var.X1lG3V04pd);
        }
        sb.append(" startDestination=");
        if (Yi7zF1RB1 == null) {
            String str2 = ei0Var.OOA6hdeuvCS;
            if (str2 != null) {
                sb.append(str2);
            } else {
                String str3 = ei0Var.xqGvceK5x;
                if (str3 != null) {
                    sb.append(str3);
                } else {
                    sb.append("0x" + Integer.toHexString(ei0Var.X1lG3V04pd));
                }
            }
        } else {
            sb.append("{");
            sb.append(Yi7zF1RB1.toString());
            sb.append("}");
        }
        return sb.toString();
    }
}
