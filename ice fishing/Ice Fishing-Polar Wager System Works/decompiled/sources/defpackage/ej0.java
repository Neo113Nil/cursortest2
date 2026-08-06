package defpackage;

/* loaded from: classes.dex */
public final class ej0 {
    public final android.util.SparseArray IHQe1A4L2xu;
    public defpackage.wj1 oh6vYeIP;

    public ej0(int i) {
        this.IHQe1A4L2xu = new android.util.SparseArray(i);
    }

    public final void IHQe1A4L2xu(defpackage.wj1 wj1Var, int i, int i2) {
        int IHQe1A4L2xu = wj1Var.IHQe1A4L2xu(i);
        android.util.SparseArray sparseArray = this.IHQe1A4L2xu;
        defpackage.ej0 ej0Var = sparseArray == null ? null : (defpackage.ej0) sparseArray.get(IHQe1A4L2xu);
        if (ej0Var == null) {
            ej0Var = new defpackage.ej0(1);
            sparseArray.put(wj1Var.IHQe1A4L2xu(i), ej0Var);
        }
        if (i2 > i) {
            ej0Var.IHQe1A4L2xu(wj1Var, i + 1, i2);
        } else {
            ej0Var.oh6vYeIP = wj1Var;
        }
    }
}
