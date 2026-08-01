package s;

import D1.i;

/* renamed from: s.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0346a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f4337a = new int[0];

    /* renamed from: b, reason: collision with root package name */
    public static final Object[] f4338b = new Object[0];

    public static final int a(int i, int i2, int[] iArr) {
        i.e(iArr, "array");
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else {
                if (i6 <= i2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    public static final int b(long[] jArr, int i, long j) {
        i.e(jArr, "array");
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            long j2 = jArr[i4];
            if (j2 < j) {
                i3 = i4 + 1;
            } else {
                if (j2 <= j) {
                    return i4;
                }
                i2 = i4 - 1;
            }
        }
        return ~i3;
    }
}
