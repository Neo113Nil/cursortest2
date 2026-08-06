package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class av0 extends pog2g9KITJA {
    public final List OOA6hdeuvCS;

    public av0(List list) {
        list.getClass();
        this.OOA6hdeuvCS = list;
    }

    @Override // defpackage.pog2g9KITJA
    public final int GWasM1elztuh() {
        return this.OOA6hdeuvCS.size();
    }

    @Override // defpackage.pog2g9KITJA
    public final Object Yi7zF1RB1(int i) {
        return this.OOA6hdeuvCS.remove(rb.SyyZR548qbcW(i, this));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        this.OOA6hdeuvCS.add(rb.rASgSCrgZkT7(i, this), obj);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.OOA6hdeuvCS.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.OOA6hdeuvCS.get(rb.SyyZR548qbcW(i, this));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new zu0(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return new zu0(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        return this.OOA6hdeuvCS.set(rb.SyyZR548qbcW(i, this), obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new zu0(this, i);
    }
}
