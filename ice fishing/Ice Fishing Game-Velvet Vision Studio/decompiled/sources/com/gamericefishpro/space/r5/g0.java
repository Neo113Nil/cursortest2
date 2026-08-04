package com.gamericefishpro.space.r5;

import android.util.SparseArray;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 {
    public SparseArray a;
    public int b;

    public final f0 a(int i) {
        SparseArray sparseArray = this.a;
        f0 f0Var = (f0) sparseArray.get(i);
        if (f0Var != null) {
            return f0Var;
        }
        f0 f0Var2 = new f0();
        sparseArray.put(i, f0Var2);
        return f0Var2;
    }
}
