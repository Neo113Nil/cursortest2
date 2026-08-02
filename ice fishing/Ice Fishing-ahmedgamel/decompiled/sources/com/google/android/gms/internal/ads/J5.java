package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

/* loaded from: classes2.dex */
public final class J5 {

    /* renamed from: a, reason: collision with root package name */
    public final M.h f26401a = new M.h(5);

    static {
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        int[] iArr = {16, 17, 18, 21, 22, 23, 28, 30};
        for (int i = 0; i < 8; i++) {
            int i4 = iArr[i];
            AbstractC2792Sd.H(!false);
            sparseBooleanArray.append(i4, true);
        }
        AbstractC2792Sd.H(!false);
        SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
        int[] iArr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 19, 31, 20, 24, 25, 33, 26, 34, 35, 27, 29, 32};
        for (int i6 = 0; i6 < 27; i6++) {
            int i9 = iArr2[i6];
            AbstractC2792Sd.H(!false);
            sparseBooleanArray2.append(i9, true);
        }
        AbstractC2792Sd.H(!false);
    }

    public final void a(int i, boolean z6) {
        if (z6) {
            this.f26401a.t(i);
        }
    }
}
