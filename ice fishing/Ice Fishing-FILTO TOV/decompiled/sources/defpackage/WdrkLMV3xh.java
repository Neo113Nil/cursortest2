package defpackage;

import java.util.ListIterator;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class WdrkLMV3xh implements ListIterator, q40 {
    public int EljAMC1QTz;
    public int OOA6hdeuvCS;

    public WdrkLMV3xh(int i, int i2) {
        this.OOA6hdeuvCS = i;
        this.EljAMC1QTz = i2;
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.OOA6hdeuvCS < this.EljAMC1QTz;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.OOA6hdeuvCS > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.OOA6hdeuvCS;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.OOA6hdeuvCS - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
