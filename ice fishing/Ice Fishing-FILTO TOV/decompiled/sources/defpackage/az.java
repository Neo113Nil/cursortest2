package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class az implements Iterator, q40 {
    public int AvO7iQsrTN;
    public final int EljAMC1QTz;
    public final z21 OOA6hdeuvCS;
    public final int encWxUiV2;

    public az(z21 z21Var, int i, int i2) {
        this.OOA6hdeuvCS = z21Var;
        this.EljAMC1QTz = i2;
        this.AvO7iQsrTN = i;
        this.encWxUiV2 = z21Var.E7jCp8Ls;
        if (z21Var.rQPn8YBR) {
            b31.EljAMC1QTz();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.AvO7iQsrTN < this.EljAMC1QTz;
    }

    @Override // java.util.Iterator
    public final Object next() {
        z21 z21Var = this.OOA6hdeuvCS;
        int i = z21Var.E7jCp8Ls;
        int i2 = this.encWxUiV2;
        if (i != i2) {
            b31.EljAMC1QTz();
        }
        int i3 = this.AvO7iQsrTN;
        this.AvO7iQsrTN = z21Var.OOA6hdeuvCS[(i3 * 5) + 3] + i3;
        return new a31(z21Var, i3, i2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
