package m0;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class l2 {
    public static final int a(int[] iArr, int i10) {
        return iArr[(i10 * 5) + 3];
    }

    public static final int b(ArrayList arrayList, int i10, int i11) {
        int e10 = e(arrayList, i10, i11);
        return e10 >= 0 ? e10 : -(e10 + 1);
    }

    public static final int c(int[] iArr, int i10) {
        int i11 = i10 * 5;
        return Integer.bitCount(iArr[i11 + 1] >> 28) + iArr[i11 + 4];
    }

    public static final void d(int i10, int i11, int[] iArr) {
        if (i11 >= 0) {
        }
        int i12 = (i10 * 5) + 1;
        iArr[i12] = i11 | (iArr[i12] & (-67108864));
    }

    public static final int e(ArrayList arrayList, int i10, int i11) {
        int size = arrayList.size() - 1;
        int i12 = 0;
        while (i12 <= size) {
            int i13 = (i12 + size) >>> 1;
            int i14 = ((a) arrayList.get(i13)).f4509a;
            if (i14 < 0) {
                i14 += i11;
            }
            int f10 = pc.j.f(i14, i10);
            if (f10 < 0) {
                i12 = i13 + 1;
            } else {
                if (f10 <= 0) {
                    return i13;
                }
                size = i13 - 1;
            }
        }
        return -(i12 + 1);
    }

    public static final void f() {
        throw new ConcurrentModificationException();
    }
}
