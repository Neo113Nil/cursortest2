package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class ab1 implements Iterator, q40 {
    public int AvO7iQsrTN;
    public int EljAMC1QTz;
    public Object[] OOA6hdeuvCS = za1.OOA6hdeuvCS.xqGvceK5x;

    public final void GWasM1elztuh(Object[] objArr, int i, int i2) {
        this.OOA6hdeuvCS = objArr;
        this.EljAMC1QTz = i;
        this.AvO7iQsrTN = i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.AvO7iQsrTN < this.EljAMC1QTz;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
