package defpackage;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class OnDfzHZD extends ow5vqvCr implements ListIterator {
    public final /* synthetic */ lDXGDhIF VgvYg0wo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnDfzHZD(lDXGDhIF ldxgdhif, int i) {
        super(0, ldxgdhif);
        this.VgvYg0wo = ldxgdhif;
        int qoPGr6Ce = ldxgdhif.qoPGr6Ce();
        if (i < 0 || i > qoPGr6Ce) {
            throw new IndexOutOfBoundsException(q70.wxUZMvaN(i, qoPGr6Ce, "index: ", ", size: "));
        }
        this.MdtA4re8 = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.MdtA4re8 > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.MdtA4re8;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.MdtA4re8 - 1;
        this.MdtA4re8 = i;
        return this.VgvYg0wo.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.MdtA4re8 - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
