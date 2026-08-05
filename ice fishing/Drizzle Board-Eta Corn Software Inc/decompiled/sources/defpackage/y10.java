package defpackage;

import android.util.SparseArray;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class y10 {
    public int NCTxEWno;
    public SparseArray qoPGr6Ce;

    public final x10 qoPGr6Ce(int i) {
        SparseArray sparseArray = this.qoPGr6Ce;
        x10 x10Var = (x10) sparseArray.get(i);
        if (x10Var != null) {
            return x10Var;
        }
        x10 x10Var2 = new x10();
        sparseArray.put(i, x10Var2);
        return x10Var2;
    }
}
