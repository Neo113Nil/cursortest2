package defpackage;

import android.util.SparseArray;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class vs {
    public te0 NCTxEWno;
    public final SparseArray qoPGr6Ce;

    public vs(int i) {
        this.qoPGr6Ce = new SparseArray(i);
    }

    public final void qoPGr6Ce(te0 te0Var, int i, int i2) {
        int qoPGr6Ce = te0Var.qoPGr6Ce(i);
        SparseArray sparseArray = this.qoPGr6Ce;
        vs vsVar = (vs) sparseArray.get(qoPGr6Ce);
        if (vsVar == null) {
            vsVar = new vs(1);
            sparseArray.put(te0Var.qoPGr6Ce(i), vsVar);
        }
        if (i2 > i) {
            vsVar.qoPGr6Ce(te0Var, i + 1, i2);
        } else {
            vsVar.NCTxEWno = te0Var;
        }
    }
}
