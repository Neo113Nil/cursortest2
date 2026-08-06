package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class a9 implements Iterator {
    public final /* synthetic */ c9 AvO7iQsrTN;
    public final int EljAMC1QTz;
    public int OOA6hdeuvCS = 0;

    public a9(c9 c9Var) {
        this.AvO7iQsrTN = c9Var;
        this.EljAMC1QTz = c9Var.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.OOA6hdeuvCS < this.EljAMC1QTz;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.OOA6hdeuvCS;
        if (i < this.EljAMC1QTz) {
            this.OOA6hdeuvCS = i + 1;
            return Byte.valueOf(this.AvO7iQsrTN.AvO7iQsrTN(i));
        }
        o4.E7jCp8Ls();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
