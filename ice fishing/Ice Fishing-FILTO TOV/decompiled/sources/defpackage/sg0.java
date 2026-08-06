package defpackage;

import java.util.List;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class sg0 {
    private static final void EljAMC1QTz(int i, int i2) {
        throw new IllegalArgumentException("Indices are out of order. fromIndex (" + i + ") is greater than toIndex (" + i2 + ").");
    }

    public static final void GWasM1elztuh(int i, List list) {
        int size = list.size();
        if (i < 0 || i >= size) {
            X1lG3V04pd(i, size);
        }
    }

    private static final void OOA6hdeuvCS(int i, int i2) {
        throw new IndexOutOfBoundsException("toIndex (" + i + ") is more than than the list size (" + i2 + ')');
    }

    private static final void X1lG3V04pd(int i, int i2) {
        throw new IndexOutOfBoundsException("Index " + i + " is out of bounds. The list has " + i2 + " elements.");
    }

    public static final void Yi7zF1RB1(List list, int i, int i2) {
        if (i > i2) {
            EljAMC1QTz(i, i2);
        }
        if (i < 0) {
            xqGvceK5x(i);
        }
        if (i2 > list.size()) {
            OOA6hdeuvCS(i2, list.size());
        }
    }

    private static final void xqGvceK5x(int i) {
        throw new IndexOutOfBoundsException(mr0.encWxUiV2("fromIndex (", i, ") is less than 0."));
    }
}
