package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class ts0 {
    public static final ozMwhSAI OOA6hdeuvCS;

    static {
        Integer num = d40.GWasM1elztuh;
        OOA6hdeuvCS = (num == null || num.intValue() >= 34) ? new fq0() : new gr();
    }

    public abstract int GWasM1elztuh(int i);

    public abstract int X1lG3V04pd();

    public float Yi7zF1RB1() {
        return GWasM1elztuh(24) / 1.6777216E7f;
    }

    public int xqGvceK5x(int i, int i2) {
        int X1lG3V04pd;
        int i3;
        int i4;
        if (i2 <= i) {
            o4.JFJ3QoxA("Random range is empty: [", Integer.valueOf(i), ", ", Integer.valueOf(i2), ").");
            return 0;
        }
        int i5 = i2 - i;
        if (i5 > 0 || i5 == Integer.MIN_VALUE) {
            if (((-i5) & i5) == i5) {
                i4 = GWasM1elztuh(31 - Integer.numberOfLeadingZeros(i5));
            } else {
                do {
                    X1lG3V04pd = X1lG3V04pd() >>> 1;
                    i3 = X1lG3V04pd % i5;
                } while ((i5 - 1) + (X1lG3V04pd - i3) < 0);
                i4 = i3;
            }
            return i + i4;
        }
        while (true) {
            int X1lG3V04pd2 = X1lG3V04pd();
            if (i <= X1lG3V04pd2 && X1lG3V04pd2 < i2) {
                return X1lG3V04pd2;
            }
        }
    }
}
