package defpackage;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;

/* loaded from: classes.dex */
public abstract class uus0 {
    public static final long[] a = new long[0];

    public static final int a(int i, int[] iArr) {
        return iArr[(i * 5) + 3];
    }

    public static final int b(int i, int i2, ArrayList arrayList) {
        int g = g(i, i2, arrayList);
        return g >= 0 ? g : -(g + 1);
    }

    public static final int c(int i, int[] iArr) {
        int i2 = i * 5;
        return Integer.bitCount(iArr[i2 + 1] >> 30) + iArr[i2 + 4];
    }

    public static final int d(int i, int[] iArr) {
        int i2 = i * 5;
        return Integer.bitCount(iArr[i2 + 1] >> 28) + iArr[i2 + 4];
    }

    public static final void e(int[] iArr, int i, int i2) {
        if (i2 >= 0) {
        }
        int i3 = (i * 5) + 1;
        iArr[i3] = i2 | (iArr[i3] & (-67108864));
    }

    public static final sus0 f(nus0 nus0Var) {
        sus0 sus0Var = nus0Var instanceof sus0 ? (sus0) nus0Var : null;
        if (sus0Var != null) {
            return sus0Var;
        }
        lid.b("Inconsistent composition");
        ny61.A();
        return null;
    }

    public static final int g(int i, int i2, ArrayList arrayList) {
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int i5 = ((yss) arrayList.get(i4)).a;
            if (i5 < 0) {
                i5 += i2;
            }
            int q = jl40.q(i5, i);
            if (q < 0) {
                i3 = i4 + 1;
            } else {
                if (q <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static final void h() {
        throw new ConcurrentModificationException();
    }
}
