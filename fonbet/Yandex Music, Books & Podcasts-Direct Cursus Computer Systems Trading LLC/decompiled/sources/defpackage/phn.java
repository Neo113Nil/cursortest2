package defpackage;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public abstract class phn {

    @NotNull
    public static final ohn a = new ohn(null);
    public static final n8 b;

    static {
        Integer num = m1f.b;
        b = (num == null || num.intValue() >= 34) ? new ouk() : new x4c();
    }

    public abstract int a(int i);

    public boolean b() {
        return a(1) != 0;
    }

    public int c() {
        return a(32);
    }

    public int d(int i) {
        return e(0, i);
    }

    public int e(int i, int i2) {
        int c;
        int i3;
        int i4;
        if (i2 <= i) {
            xq0.o("Random range is empty: [" + Integer.valueOf(i) + ", " + Integer.valueOf(i2) + ").");
            return 0;
        }
        int i5 = i2 - i;
        if (i5 > 0 || i5 == Integer.MIN_VALUE) {
            if (((-i5) & i5) == i5) {
                i4 = a(31 - Integer.numberOfLeadingZeros(i5));
            } else {
                do {
                    c = c() >>> 1;
                    i3 = c % i5;
                } while ((i5 - 1) + (c - i3) < 0);
                i4 = i3;
            }
            return i + i4;
        }
        while (true) {
            int c2 = c();
            if (i <= c2 && c2 < i2) {
                return c2;
            }
        }
    }

    public long f() {
        return (c() << 32) + c();
    }

    public long g() {
        long f;
        long j;
        do {
            f = f() >>> 1;
            j = f % Long.MAX_VALUE;
        } while ((f - j) + 9223372036854775806L < 0);
        return j;
    }
}
