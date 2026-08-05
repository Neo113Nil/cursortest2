package defpackage;

import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class o30 implements ListIterator, xn {
    public final /* synthetic */ p30 MdtA4re8;
    public final ListIterator NCTxEWno;

    public o30(p30 p30Var, int i) {
        this.MdtA4re8 = p30Var;
        List list = p30Var.NCTxEWno;
        if (i >= 0 && i <= p30Var.qoPGr6Ce()) {
            this.NCTxEWno = list.listIterator(p30Var.qoPGr6Ce() - i);
            return;
        }
        throw new IndexOutOfBoundsException("Position index " + i + " must be in range [" + new en(0, p30Var.qoPGr6Ce(), 1) + "].");
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.NCTxEWno.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.NCTxEWno.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return this.NCTxEWno.previous();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return (this.MdtA4re8.size() - 1) - this.NCTxEWno.previousIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return this.NCTxEWno.next();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return (this.MdtA4re8.size() - 1) - this.NCTxEWno.nextIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
