package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class vm0 extends o50 {
    public int AvO7iQsrTN;
    public int OOA6hdeuvCS;
    public int X1lG3V04pd;
    public tm0[] Yi7zF1RB1 = new tm0[16];
    public int[] xqGvceK5x = new int[16];
    public Object[] EljAMC1QTz = new Object[16];

    public final void DmJncFq5() {
        this.X1lG3V04pd = 0;
        this.OOA6hdeuvCS = 0;
        Arrays.fill(this.EljAMC1QTz, 0, this.AvO7iQsrTN, (Object) null);
        this.AvO7iQsrTN = 0;
    }

    public final void HFYAaqMd6(m4 m4Var, c31 c31Var, au0 au0Var, um0 um0Var) {
        if (this.X1lG3V04pd != 0) {
            nb nbVar = new nb(this);
            vm0 vm0Var = (vm0) nbVar.xqGvceK5x;
            while (true) {
                tm0 tm0Var = vm0Var.Yi7zF1RB1[nbVar.GWasM1elztuh];
                lx Yi7zF1RB1 = tm0Var.Yi7zF1RB1(nbVar);
                m4 m4Var2 = m4Var;
                c31 c31Var2 = c31Var;
                au0 au0Var2 = au0Var;
                um0 um0Var2 = um0Var;
                try {
                    tm0Var.GWasM1elztuh(nbVar, m4Var2, c31Var2, au0Var2, um0Var2);
                    int i = nbVar.GWasM1elztuh;
                    int i2 = vm0Var.X1lG3V04pd;
                    if (i < i2) {
                        tm0 tm0Var2 = vm0Var.Yi7zF1RB1[i];
                        nbVar.Yi7zF1RB1 += tm0Var2.GWasM1elztuh;
                        nbVar.X1lG3V04pd += tm0Var2.Yi7zF1RB1;
                        int i3 = i + 1;
                        nbVar.GWasM1elztuh = i3;
                        if (i3 >= i2) {
                            break;
                        }
                        m4Var = m4Var2;
                        c31Var = c31Var2;
                        au0Var = au0Var2;
                        um0Var = um0Var2;
                    } else {
                        break;
                    }
                } finally {
                }
            }
        }
        DmJncFq5();
    }

    public final void TpUsjqg3bxO(tm0 tm0Var) {
        int i = this.X1lG3V04pd;
        tm0[] tm0VarArr = this.Yi7zF1RB1;
        if (i == tm0VarArr.length) {
            tm0[] tm0VarArr2 = new tm0[(i > 1024 ? 1024 : i) + i];
            System.arraycopy(tm0VarArr, 0, tm0VarArr2, 0, i);
            this.Yi7zF1RB1 = tm0VarArr2;
        }
        int i2 = this.OOA6hdeuvCS;
        int i3 = tm0Var.GWasM1elztuh;
        int i4 = tm0Var.Yi7zF1RB1;
        int i5 = i2 + i3;
        int[] iArr = this.xqGvceK5x;
        int length = iArr.length;
        if (i5 > length) {
            int i6 = (length > 1024 ? 1024 : length) + length;
            if (i6 >= i5) {
                i5 = i6;
            }
            int[] iArr2 = new int[i5];
            d5.MjxSquD6Av(iArr, iArr2, 0, 0, length);
            this.xqGvceK5x = iArr2;
        }
        int i7 = this.AvO7iQsrTN + i4;
        Object[] objArr = this.EljAMC1QTz;
        int length2 = objArr.length;
        if (i7 > length2) {
            int i8 = (length2 <= 1024 ? length2 : 1024) + length2;
            if (i8 >= i7) {
                i7 = i8;
            }
            Object[] objArr2 = new Object[i7];
            System.arraycopy(objArr, 0, objArr2, 0, length2);
            this.EljAMC1QTz = objArr2;
        }
        tm0[] tm0VarArr3 = this.Yi7zF1RB1;
        int i9 = this.X1lG3V04pd;
        this.X1lG3V04pd = i9 + 1;
        tm0VarArr3[i9] = tm0Var;
        this.OOA6hdeuvCS += tm0Var.GWasM1elztuh;
        this.AvO7iQsrTN += i4;
    }

    public final boolean rezfBrjOrqK() {
        return this.X1lG3V04pd == 0;
    }
}
