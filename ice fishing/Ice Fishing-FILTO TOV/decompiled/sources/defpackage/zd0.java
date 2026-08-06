package defpackage;

import android.util.SparseArray;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class zd0 {
    public final SparseArray GWasM1elztuh;
    public qb1 Yi7zF1RB1;

    public zd0(int i) {
        this.GWasM1elztuh = new SparseArray(i);
    }

    public final void GWasM1elztuh(qb1 qb1Var, int i, int i2) {
        int GWasM1elztuh = qb1Var.GWasM1elztuh(i);
        SparseArray sparseArray = this.GWasM1elztuh;
        zd0 zd0Var = sparseArray == null ? null : (zd0) sparseArray.get(GWasM1elztuh);
        if (zd0Var == null) {
            zd0Var = new zd0(1);
            sparseArray.put(qb1Var.GWasM1elztuh(i), zd0Var);
        }
        if (i2 > i) {
            zd0Var.GWasM1elztuh(qb1Var, i + 1, i2);
        } else {
            zd0Var.Yi7zF1RB1 = qb1Var;
        }
    }
}
