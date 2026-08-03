package t;

import java.util.NoSuchElementException;
import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f6507a = new int[0];

    /* renamed from: b, reason: collision with root package name */
    public static final long[] f6508b = new long[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Object[] f6509c = new Object[0];

    public static final int a(int i10, int i11, int[] iArr) {
        j.e(iArr, "array");
        int i12 = i10 - 1;
        int i13 = 0;
        while (i13 <= i12) {
            int i14 = (i13 + i12) >>> 1;
            int i15 = iArr[i14];
            if (i15 < i11) {
                i13 = i14 + 1;
            } else {
                if (i15 <= i11) {
                    return i14;
                }
                i12 = i14 - 1;
            }
        }
        return ~i13;
    }

    public static final int b(long[] jArr, int i10, long j3) {
        j.e(jArr, "array");
        int i11 = i10 - 1;
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) >>> 1;
            long j6 = jArr[i13];
            if (j6 < j3) {
                i12 = i13 + 1;
            } else {
                if (j6 <= j3) {
                    return i13;
                }
                i11 = i13 - 1;
            }
        }
        return ~i12;
    }

    public static final void c(String str) {
        j.e(str, "message");
        throw new IllegalArgumentException(str);
    }

    public static final void d(String str) {
        j.e(str, "message");
        throw new IndexOutOfBoundsException(str);
    }

    public static final void e(String str) {
        j.e(str, "message");
        throw new NoSuchElementException(str);
    }
}
