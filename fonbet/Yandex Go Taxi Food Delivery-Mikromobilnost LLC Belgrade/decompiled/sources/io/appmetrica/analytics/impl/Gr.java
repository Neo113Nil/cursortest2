package io.appmetrica.analytics.impl;

import android.util.SparseArray;
import java.util.HashMap;

/* loaded from: classes4.dex */
public final class Gr {
    public static final int[] c = {0, 1, 2, 3};
    public final SparseArray a = new SparseArray();
    public int b = 0;

    public Gr(int[] iArr) {
        for (int i : iArr) {
            this.a.put(i, new HashMap());
        }
    }
}
