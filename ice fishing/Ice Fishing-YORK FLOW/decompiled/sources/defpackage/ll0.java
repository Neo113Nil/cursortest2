package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class ll0 {
    public final android.util.SparseArray ZpBGe2uQfcn8;
    public defpackage.zq1 giKS3J6vZuNy;

    public ll0(int i) {
        this.ZpBGe2uQfcn8 = new android.util.SparseArray(i);
    }

    public final void ZpBGe2uQfcn8(defpackage.zq1 zq1Var, int i, int i2) {
        int ZpBGe2uQfcn8 = zq1Var.ZpBGe2uQfcn8(i);
        android.util.SparseArray sparseArray = this.ZpBGe2uQfcn8;
        defpackage.ll0 ll0Var = sparseArray == null ? null : (defpackage.ll0) sparseArray.get(ZpBGe2uQfcn8);
        if (ll0Var == null) {
            ll0Var = new defpackage.ll0(1);
            sparseArray.put(zq1Var.ZpBGe2uQfcn8(i), ll0Var);
        }
        if (i2 > i) {
            ll0Var.ZpBGe2uQfcn8(zq1Var, i + 1, i2);
        } else {
            ll0Var.giKS3J6vZuNy = zq1Var;
        }
    }
}
