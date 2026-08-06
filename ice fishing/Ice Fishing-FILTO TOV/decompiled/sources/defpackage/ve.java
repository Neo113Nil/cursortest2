package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class ve {
    public int AvO7iQsrTN;
    public int E7jCp8Ls;
    public int EljAMC1QTz;
    public final qx GWasM1elztuh;
    public boolean X1lG3V04pd;
    public x9 Yi7zF1RB1;
    public final c30 xqGvceK5x = new c30();
    public boolean OOA6hdeuvCS = true;
    public final ArrayList encWxUiV2 = new ArrayList();
    public int mOu10nynGul = -1;
    public int JFJ3QoxA = -1;
    public int rQPn8YBR = -1;

    public ve(qx qxVar, x9 x9Var) {
        this.GWasM1elztuh = qxVar;
        this.Yi7zF1RB1 = x9Var;
    }

    public final void GWasM1elztuh() {
        X1lG3V04pd();
        ArrayList arrayList = this.encWxUiV2;
        if (arrayList.isEmpty()) {
            this.AvO7iQsrTN++;
        } else {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    public final void OOA6hdeuvCS(int i, int i2) {
        if (i2 > 0) {
            if (!(i >= 0)) {
                we.GWasM1elztuh("Invalid remove index " + i);
            }
            if (this.mOu10nynGul == i) {
                this.E7jCp8Ls += i2;
                return;
            }
            X1lG3V04pd();
            this.mOu10nynGul = i;
            this.E7jCp8Ls = i2;
        }
    }

    public final void X1lG3V04pd() {
        int i = this.E7jCp8Ls;
        if (i > 0) {
            int i2 = this.mOu10nynGul;
            if (i2 >= 0) {
                Yi7zF1RB1();
                vm0 vm0Var = this.Yi7zF1RB1.Mjvvu5DE;
                vm0Var.TpUsjqg3bxO(jm0.X1lG3V04pd);
                int i3 = vm0Var.OOA6hdeuvCS - vm0Var.Yi7zF1RB1[vm0Var.X1lG3V04pd - 1].GWasM1elztuh;
                int[] iArr = vm0Var.xqGvceK5x;
                iArr[i3] = i2;
                iArr[i3 + 1] = i;
                this.mOu10nynGul = -1;
            } else {
                int i4 = this.rQPn8YBR;
                int i5 = this.JFJ3QoxA;
                Yi7zF1RB1();
                vm0 vm0Var2 = this.Yi7zF1RB1.Mjvvu5DE;
                vm0Var2.TpUsjqg3bxO(fm0.X1lG3V04pd);
                int i6 = vm0Var2.OOA6hdeuvCS - vm0Var2.Yi7zF1RB1[vm0Var2.X1lG3V04pd - 1].GWasM1elztuh;
                int[] iArr2 = vm0Var2.xqGvceK5x;
                iArr2[i6 + 1] = i4;
                iArr2[i6] = i5;
                iArr2[i6 + 2] = i;
                this.JFJ3QoxA = -1;
                this.rQPn8YBR = -1;
            }
            this.E7jCp8Ls = 0;
        }
    }

    public final void Yi7zF1RB1() {
        int i = this.AvO7iQsrTN;
        if (i > 0) {
            vm0 vm0Var = this.Yi7zF1RB1.Mjvvu5DE;
            vm0Var.TpUsjqg3bxO(rm0.X1lG3V04pd);
            vm0Var.xqGvceK5x[vm0Var.OOA6hdeuvCS - vm0Var.Yi7zF1RB1[vm0Var.X1lG3V04pd - 1].GWasM1elztuh] = i;
            this.AvO7iQsrTN = 0;
        }
        ArrayList arrayList = this.encWxUiV2;
        if (arrayList.isEmpty()) {
            return;
        }
        x9 x9Var = this.Yi7zF1RB1;
        int size = arrayList.size();
        Object[] objArr = new Object[size];
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = arrayList.get(i2);
        }
        x9Var.getClass();
        if (size != 0) {
            vm0 vm0Var2 = x9Var.Mjvvu5DE;
            vm0Var2.TpUsjqg3bxO(ul0.X1lG3V04pd);
            q70.WRKkgoJXwDn(vm0Var2, 0, objArr);
        }
        arrayList.clear();
    }

    public final void xqGvceK5x(boolean z) {
        y21 y21Var = this.GWasM1elztuh.YZjbz8VdP5;
        int i = z ? y21Var.mOu10nynGul : y21Var.AvO7iQsrTN;
        int i2 = i - this.EljAMC1QTz;
        if (i2 < 0) {
            we.GWasM1elztuh("Tried to seek backward");
        }
        if (i2 > 0) {
            vm0 vm0Var = this.Yi7zF1RB1.Mjvvu5DE;
            vm0Var.TpUsjqg3bxO(nl0.X1lG3V04pd);
            vm0Var.xqGvceK5x[vm0Var.OOA6hdeuvCS - vm0Var.Yi7zF1RB1[vm0Var.X1lG3V04pd - 1].GWasM1elztuh] = i2;
            this.EljAMC1QTz = i;
        }
    }
}
