package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes15.dex */
public final class qj21 implements e1k {
    public final pj21 a;
    public final int b;
    public final /* synthetic */ rj21 c;

    public qj21(rj21 rj21Var, pj21 pj21Var, int i) {
        this.c = rj21Var;
        this.a = pj21Var;
        this.b = i;
        SparseBooleanArray sparseBooleanArray = rj21Var.d;
        SparseArray sparseArray = rj21Var.a;
        if (sparseBooleanArray.get(i)) {
            sparseBooleanArray.put(i, false);
            pj21Var.m();
        }
        List list = (List) sparseArray.get(i);
        if (list == null) {
            list = new ArrayList();
            sparseArray.put(i, list);
        }
        list.add(this);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        tje.e();
        SparseArray sparseArray = this.c.a;
        int i = this.b;
        List list = (List) sparseArray.get(i);
        if (list != null) {
            list.remove(this);
            if (list.isEmpty()) {
                sparseArray.remove(i);
            }
        }
    }
}
