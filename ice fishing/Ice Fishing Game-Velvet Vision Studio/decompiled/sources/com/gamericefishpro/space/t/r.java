package com.gamericefishpro.space.t;

import java.util.ConcurrentModificationException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r {
    public static final Object a = new Object();
    public static final long[] b = new long[0];
    public static final Object c = new Object();

    public static final void a(s0 s0Var) {
        int i = s0Var.v;
        int[] iArr = s0Var.e;
        Object[] objArr = s0Var.i;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != c) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        s0Var.d = false;
        s0Var.v = i2;
    }

    public static final void b(f fVar, int i) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        int[] iArr = new int[i];
        Intrinsics.checkNotNullParameter(iArr, "<set-?>");
        fVar.d = iArr;
        Object[] objArr = new Object[i];
        Intrinsics.checkNotNullParameter(objArr, "<set-?>");
        fVar.e = objArr;
    }

    public static final int c(f fVar, Object obj, int i) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        int i2 = fVar.i;
        if (i2 == 0) {
            return -1;
        }
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        try {
            int iA = com.gamericefishpro.space.u.a.a(fVar.i, i, fVar.d);
            if (iA < 0 || Intrinsics.a(obj, fVar.e[iA])) {
                return iA;
            }
            int i3 = iA + 1;
            while (i3 < i2 && fVar.d[i3] == i) {
                if (Intrinsics.a(obj, fVar.e[i3])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = iA - 1; i4 >= 0 && fVar.d[i4] == i; i4--) {
                if (Intrinsics.a(obj, fVar.e[i4])) {
                    return i4;
                }
            }
            return ~i3;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }
}
