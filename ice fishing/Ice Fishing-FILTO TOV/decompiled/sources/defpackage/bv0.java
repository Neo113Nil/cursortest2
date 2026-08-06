package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class bv0 extends lv06NcmrQ {
    public final List OOA6hdeuvCS;

    public bv0(List list) {
        list.getClass();
        this.OOA6hdeuvCS = list;
    }

    @Override // defpackage.XnEVoBF0td1l
    public final int GWasM1elztuh() {
        return this.OOA6hdeuvCS.size();
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.OOA6hdeuvCS.get(rb.SyyZR548qbcW(i, this));
    }

    @Override // defpackage.lv06NcmrQ, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new zu0(this, 0);
    }

    @Override // defpackage.lv06NcmrQ, java.util.List
    public final ListIterator listIterator() {
        return new zu0(this, 0);
    }

    @Override // defpackage.lv06NcmrQ, java.util.List
    public final ListIterator listIterator(int i) {
        return new zu0(this, i);
    }
}
