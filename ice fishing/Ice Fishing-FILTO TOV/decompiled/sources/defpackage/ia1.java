package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class ia1 implements Iterator, q40 {
    public final /* synthetic */ r71 EljAMC1QTz;
    public final Iterator OOA6hdeuvCS;

    public ia1(r71 r71Var) {
        this.EljAMC1QTz = r71Var;
        this.OOA6hdeuvCS = r71Var.Yi7zF1RB1.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.OOA6hdeuvCS.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.EljAMC1QTz.X1lG3V04pd.mOu10nynGul(this.OOA6hdeuvCS.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
