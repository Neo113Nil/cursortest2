package com.gamericefishpro.space.s4;

import android.util.SparseArray;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class s {
    public final SparseArray a;
    public v b;

    public s(int i) {
        this.a = new SparseArray(i);
    }

    public final void a(v vVar, int i, int i2) {
        int iA = vVar.a(i);
        SparseArray sparseArray = this.a;
        s sVar = sparseArray == null ? null : (s) sparseArray.get(iA);
        if (sVar == null) {
            sVar = new s(1);
            sparseArray.put(vVar.a(i), sVar);
        }
        if (i2 > i) {
            sVar.a(vVar, i + 1, i2);
        } else {
            sVar.b = vVar;
        }
    }
}
