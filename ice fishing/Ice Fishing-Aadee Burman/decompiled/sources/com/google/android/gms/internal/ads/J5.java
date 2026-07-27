package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

/* loaded from: classes2.dex */
public final class J5 {

    /* renamed from: a, reason: collision with root package name */
    public final L3.h f25648a = new L3.h(5);

    static {
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        int[] iArr = {16, 17, 18, 21, 22, 23, 28, 30};
        for (int i = 0; i < 8; i++) {
            int i6 = iArr[i];
            AbstractC2772Sd.H(!false);
            sparseBooleanArray.append(i6, true);
        }
        AbstractC2772Sd.H(!false);
        SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
        int[] iArr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 19, 31, 20, 24, 25, 33, 26, 34, 35, 27, 29, 32};
        for (int i9 = 0; i9 < 27; i9++) {
            int i10 = iArr2[i9];
            AbstractC2772Sd.H(!false);
            sparseBooleanArray2.append(i10, true);
        }
        AbstractC2772Sd.H(!false);
    }

    public final void a(int i, boolean z3) {
        if (z3) {
            this.f25648a.t(i);
        }
    }
}
