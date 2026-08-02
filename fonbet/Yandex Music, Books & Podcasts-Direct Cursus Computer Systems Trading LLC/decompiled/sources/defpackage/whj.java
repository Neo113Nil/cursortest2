package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public abstract class whj {
    public static final Object[] a = new Object[0];
    public static final gpi b = new gpi(0);

    public static final void a(List list, int i) {
        int size = list.size();
        if (i < 0 || i >= size) {
            e7o.o(dfi.f("Index ", i, size, " is out of bounds. The list has ", " elements."));
        }
    }

    public static final void b(int i, int i2, List list) {
        int size = list.size();
        if (i > i2) {
            xq0.x(dfi.f("Indices are out of order. fromIndex (", i, i2, ") is greater than toIndex (", ")."));
            return;
        }
        if (i < 0) {
            e7o.o(dfi.c(i, "fromIndex (", ") is less than 0."));
            return;
        }
        if (i2 <= size) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i2 + ") is more than than the list size (" + size + ')');
    }
}
