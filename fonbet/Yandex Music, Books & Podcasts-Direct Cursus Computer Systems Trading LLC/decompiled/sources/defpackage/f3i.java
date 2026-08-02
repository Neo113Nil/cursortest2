package defpackage;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class f3i {
    public final SparseArray a;
    public jdt b;

    public f3i(int i) {
        this.a = new SparseArray(i);
    }

    public final void a(jdt jdtVar, int i, int i2) {
        int a = jdtVar.a(i);
        SparseArray sparseArray = this.a;
        f3i f3iVar = sparseArray == null ? null : (f3i) sparseArray.get(a);
        if (f3iVar == null) {
            f3iVar = new f3i(1);
            sparseArray.put(jdtVar.a(i), f3iVar);
        }
        if (i2 > i) {
            f3iVar.a(jdtVar, i + 1, i2);
        } else {
            f3iVar.b = jdtVar;
        }
    }
}
