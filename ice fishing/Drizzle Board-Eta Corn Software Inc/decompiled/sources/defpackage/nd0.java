package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class nd0 implements Iterator, xn {
    public final /* synthetic */ nb0 MdtA4re8;
    public final Iterator NCTxEWno;

    public nd0(nb0 nb0Var) {
        this.MdtA4re8 = nb0Var;
        this.NCTxEWno = nb0Var.NCTxEWno.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.NCTxEWno.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.MdtA4re8.MdtA4re8.ow5vqvCr(this.NCTxEWno.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
