package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class p30 extends lDXGDhIF {
    public final List NCTxEWno;

    public p30(List list) {
        this.NCTxEWno = list;
    }

    @Override // java.util.List
    public final Object get(int i) {
        if (i >= 0 && i <= size() - 1) {
            return this.NCTxEWno.get((size() - 1) - i);
        }
        throw new IndexOutOfBoundsException("Element index " + i + " must be in range [" + new en(0, size() - 1, 1) + "].");
    }

    @Override // defpackage.lDXGDhIF, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new o30(this, 0);
    }

    @Override // defpackage.lDXGDhIF, java.util.List
    public final ListIterator listIterator() {
        return new o30(this, 0);
    }

    @Override // defpackage.Qr9iLBAD
    public final int qoPGr6Ce() {
        return this.NCTxEWno.size();
    }

    @Override // defpackage.lDXGDhIF, java.util.List
    public final ListIterator listIterator(int i) {
        return new o30(this, i);
    }
}
