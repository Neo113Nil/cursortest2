package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class aj0 {
    public int AvO7iQsrTN;
    public boolean E7jCp8Ls;
    public xi0 EljAMC1QTz;
    public final p51 GWasM1elztuh = vc0.EljAMC1QTz(bj0.GWasM1elztuh);
    public final LinkedHashSet JFJ3QoxA;
    public final v4 OOA6hdeuvCS;
    public final ys0 X1lG3V04pd;
    public boolean XnEVoBF0td1l;
    public final p51 Yi7zF1RB1;
    public zi0 encWxUiV2;
    public final LinkedHashSet mOu10nynGul;
    public final LinkedHashSet rQPn8YBR;
    public boolean uFEq9NpZ;
    public final v4 xqGvceK5x;

    public aj0() {
        p51 EljAMC1QTz = vc0.EljAMC1QTz(new yi0());
        this.Yi7zF1RB1 = EljAMC1QTz;
        this.X1lG3V04pd = new ys0(EljAMC1QTz);
        this.xqGvceK5x = new v4();
        this.OOA6hdeuvCS = new v4();
        this.mOu10nynGul = new LinkedHashSet();
        this.JFJ3QoxA = new LinkedHashSet();
        this.rQPn8YBR = new LinkedHashSet();
    }

    public final void GWasM1elztuh(rx0 rx0Var, zi0 zi0Var, int i) {
        rx0Var.getClass();
        if (zi0Var.GWasM1elztuh == null) {
            (i != 0 ? i != 1 ? this.mOu10nynGul : this.JFJ3QoxA : this.rQPn8YBR).add(zi0Var);
            zi0Var.GWasM1elztuh = rx0Var;
            ((yi0) this.X1lG3V04pd.OOA6hdeuvCS.getValue()).getClass();
            zi0Var.Yi7zF1RB1(i != 0 ? i != 1 ? this.uFEq9NpZ : this.E7jCp8Ls : this.XnEVoBF0td1l);
            return;
        }
        StringBuilder sb = new StringBuilder("Input '");
        sb.append(zi0Var);
        rx0 rx0Var2 = zi0Var.GWasM1elztuh;
        sb.append("' is already added to dispatcher ");
        sb.append(rx0Var2);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public final xi0 X1lG3V04pd(int i) {
        Object obj;
        Object obj2;
        v4 v4Var = this.OOA6hdeuvCS;
        v4 v4Var2 = this.xqGvceK5x;
        Object obj3 = null;
        if (i == -1) {
            Iterator it = v4Var2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((xi0) obj).Yi7zF1RB1) {
                    break;
                }
            }
            xi0 xi0Var = (xi0) obj;
            if (xi0Var != null) {
                return xi0Var;
            }
            Iterator it2 = v4Var.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (((xi0) next).Yi7zF1RB1) {
                    obj3 = next;
                    break;
                }
            }
            return (xi0) obj3;
        }
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException(("Unsupported direction: '" + i + "'.").toString());
            }
            Iterator it3 = v4Var2.iterator();
            while (it3.hasNext()) {
                ((xi0) it3.next()).getClass();
            }
            Iterator it4 = v4Var.iterator();
            while (it4.hasNext()) {
                ((xi0) it4.next()).getClass();
            }
            return null;
        }
        Iterator it5 = v4Var2.iterator();
        while (true) {
            if (!it5.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it5.next();
            if (((xi0) obj2).Yi7zF1RB1) {
                break;
            }
        }
        xi0 xi0Var2 = (xi0) obj2;
        if (xi0Var2 != null) {
            return xi0Var2;
        }
        Iterator it6 = v4Var.iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            Object next2 = it6.next();
            if (((xi0) next2).Yi7zF1RB1) {
                obj3 = next2;
                break;
            }
        }
        return (xi0) obj3;
    }

    public final void Yi7zF1RB1() {
        boolean z;
        boolean z2;
        yi0 yi0Var;
        v4 v4Var = this.xqGvceK5x;
        if (v4Var == null || !v4Var.isEmpty()) {
            Iterator it = v4Var.iterator();
            while (it.hasNext()) {
                if (((xi0) it.next()).Yi7zF1RB1) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        v4 v4Var2 = this.OOA6hdeuvCS;
        if (v4Var2 == null || !v4Var2.isEmpty()) {
            Iterator it2 = v4Var2.iterator();
            while (it2.hasNext()) {
                if (((xi0) it2.next()).Yi7zF1RB1) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        boolean z3 = z || z2;
        boolean z4 = this.XnEVoBF0td1l != z;
        boolean z5 = this.E7jCp8Ls != z2;
        boolean z6 = this.uFEq9NpZ != z3;
        LinkedHashSet linkedHashSet = this.rQPn8YBR;
        if (z4) {
            Iterator it3 = linkedHashSet.iterator();
            while (it3.hasNext()) {
                ((zi0) it3.next()).Yi7zF1RB1(z);
            }
        }
        LinkedHashSet linkedHashSet2 = this.JFJ3QoxA;
        if (z5) {
            Iterator it4 = linkedHashSet2.iterator();
            while (it4.hasNext()) {
                ((zi0) it4.next()).Yi7zF1RB1(z2);
            }
        }
        LinkedHashSet linkedHashSet3 = this.mOu10nynGul;
        if (z6) {
            Iterator it5 = linkedHashSet3.iterator();
            while (it5.hasNext()) {
                ((zi0) it5.next()).Yi7zF1RB1(z3);
            }
        }
        this.XnEVoBF0td1l = z;
        this.E7jCp8Ls = z2;
        this.uFEq9NpZ = z3;
        xi0 xi0Var = this.EljAMC1QTz;
        if (xi0Var == null) {
            xi0Var = X1lG3V04pd(0);
        }
        xi0 xi0Var2 = this.EljAMC1QTz;
        if (xi0Var2 == null) {
            xi0Var2 = X1lG3V04pd(0);
        }
        if (o30.rQPn8YBR(xi0Var2, xi0Var)) {
            if (xi0Var2 == null) {
                yi0Var = new yi0();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator<E> it6 = v4Var.iterator();
                while (it6.hasNext()) {
                    boolean z7 = ((xi0) it6.next()).Yi7zF1RB1;
                }
                Iterator<E> it7 = v4Var2.iterator();
                while (it7.hasNext()) {
                    boolean z8 = ((xi0) it7.next()).Yi7zF1RB1;
                }
                d70 d70Var = xi0Var2.GWasM1elztuh;
                ta0 ta0Var = new ta0(10);
                wb.nXl1EmE5(ta0Var, arrayList);
                ta0Var.add(d70Var);
                wb.nXl1EmE5(ta0Var, xp.OOA6hdeuvCS);
                yi0Var = new yi0(arrayList.size(), fb1.WIEu4Ya2g8(ta0Var));
            }
            p51 p51Var = this.Yi7zF1RB1;
            if (o30.rQPn8YBR((yi0) p51Var.getValue(), yi0Var)) {
                return;
            }
            p51Var.JFJ3QoxA(null, yi0Var);
            Iterator it8 = linkedHashSet.iterator();
            while (it8.hasNext()) {
                ((zi0) it8.next()).getClass();
            }
            Iterator it9 = linkedHashSet2.iterator();
            while (it9.hasNext()) {
                ((zi0) it9.next()).getClass();
            }
            Iterator it10 = linkedHashSet3.iterator();
            while (it10.hasNext()) {
                ((zi0) it10.next()).getClass();
            }
        }
    }
}
