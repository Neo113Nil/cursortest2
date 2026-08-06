package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class TpUsjqg3bxO {
    public int AvO7iQsrTN;
    public int EljAMC1QTz;
    public dqB83aoLBB[] OOA6hdeuvCS;
    public s61 encWxUiV2;

    public final s61 AvO7iQsrTN() {
        s61 s61Var;
        synchronized (this) {
            s61Var = this.encWxUiV2;
            if (s61Var == null) {
                int i = this.EljAMC1QTz;
                s61Var = new s61(1, Integer.MAX_VALUE);
                s61Var.WIEu4Ya2g8(Integer.valueOf(i));
                this.encWxUiV2 = s61Var;
            }
        }
        return s61Var;
    }

    public final void EljAMC1QTz(dqB83aoLBB dqb83aolbb) {
        s61 s61Var;
        int i;
        vg[] Yi7zF1RB1;
        synchronized (this) {
            try {
                int i2 = this.EljAMC1QTz - 1;
                this.EljAMC1QTz = i2;
                s61Var = this.encWxUiV2;
                if (i2 == 0) {
                    this.AvO7iQsrTN = 0;
                }
                dqb83aolbb.getClass();
                Yi7zF1RB1 = dqb83aolbb.Yi7zF1RB1(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (vg vgVar : Yi7zF1RB1) {
            if (vgVar != null) {
                vgVar.AvO7iQsrTN(kc1.GWasM1elztuh);
            }
        }
        if (s61Var != null) {
            s61Var.cilMamHF(-1);
        }
    }

    public abstract dqB83aoLBB[] OOA6hdeuvCS();

    public final dqB83aoLBB X1lG3V04pd() {
        dqB83aoLBB dqb83aolbb;
        s61 s61Var;
        synchronized (this) {
            try {
                dqB83aoLBB[] dqb83aolbbArr = this.OOA6hdeuvCS;
                if (dqb83aolbbArr == null) {
                    dqb83aolbbArr = OOA6hdeuvCS();
                    this.OOA6hdeuvCS = dqb83aolbbArr;
                } else if (this.EljAMC1QTz >= dqb83aolbbArr.length) {
                    Object[] copyOf = Arrays.copyOf(dqb83aolbbArr, dqb83aolbbArr.length * 2);
                    this.OOA6hdeuvCS = (dqB83aoLBB[]) copyOf;
                    dqb83aolbbArr = (dqB83aoLBB[]) copyOf;
                }
                int i = this.AvO7iQsrTN;
                do {
                    dqb83aolbb = dqb83aolbbArr[i];
                    if (dqb83aolbb == null) {
                        dqb83aolbb = xqGvceK5x();
                        dqb83aolbbArr[i] = dqb83aolbb;
                    }
                    i++;
                    if (i >= dqb83aolbbArr.length) {
                        i = 0;
                    }
                } while (!dqb83aolbb.GWasM1elztuh(this));
                this.AvO7iQsrTN = i;
                this.EljAMC1QTz++;
                s61Var = this.encWxUiV2;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (s61Var != null) {
            s61Var.cilMamHF(1);
        }
        return dqb83aolbb;
    }

    public abstract dqB83aoLBB xqGvceK5x();
}
