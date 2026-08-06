package defpackage;

import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class qg0 implements ListIterator, q40 {
    public int EljAMC1QTz;
    public final List OOA6hdeuvCS;

    public qg0(int i, List list) {
        this.OOA6hdeuvCS = list;
        this.EljAMC1QTz = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        this.OOA6hdeuvCS.add(this.EljAMC1QTz, obj);
        this.EljAMC1QTz++;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.EljAMC1QTz < this.OOA6hdeuvCS.size();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.EljAMC1QTz > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.EljAMC1QTz;
        this.EljAMC1QTz = i + 1;
        return this.OOA6hdeuvCS.get(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.EljAMC1QTz;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.EljAMC1QTz - 1;
        this.EljAMC1QTz = i;
        return this.OOA6hdeuvCS.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.EljAMC1QTz - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i = this.EljAMC1QTz - 1;
        this.EljAMC1QTz = i;
        this.OOA6hdeuvCS.remove(i);
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        this.OOA6hdeuvCS.set(this.EljAMC1QTz, obj);
    }
}
