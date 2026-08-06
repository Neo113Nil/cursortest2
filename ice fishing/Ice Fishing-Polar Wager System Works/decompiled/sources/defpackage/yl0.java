package defpackage;

/* loaded from: classes.dex */
public abstract class yl0 {
    private static final void F7NU4MC0GW(int i) {
        throw new java.lang.IndexOutOfBoundsException(defpackage.fx0.riuEU0zW4(i, "fromIndex (", ") is less than 0."));
    }

    public static final void IHQe1A4L2xu(int i, java.util.List list) {
        int size = list.size();
        if (i < 0 || i >= size) {
            r1MBDhnF(i, size);
        }
    }

    private static final void adDC3e2L(int i, int i2) {
        throw new java.lang.IndexOutOfBoundsException("toIndex (" + i + ") is more than than the list size (" + i2 + ')');
    }

    public static final void oh6vYeIP(java.util.List list, int i, int i2) {
        if (i > i2) {
            xiZrDbcSW0(i, i2);
        }
        if (i < 0) {
            F7NU4MC0GW(i);
        }
        if (i2 > list.size()) {
            adDC3e2L(i2, list.size());
        }
    }

    private static final void r1MBDhnF(int i, int i2) {
        throw new java.lang.IndexOutOfBoundsException("Index " + i + " is out of bounds. The list has " + i2 + " elements.");
    }

    private static final void xiZrDbcSW0(int i, int i2) {
        throw new java.lang.IllegalArgumentException("Indices are out of order. fromIndex (" + i + ") is greater than toIndex (" + i2 + ").");
    }
}
