package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class wl implements Iterator, xn {
    public int MdtA4re8 = -2;
    public Object NCTxEWno;
    public final /* synthetic */ xb wxUZMvaN;

    public wl(xb xbVar) {
        this.wxUZMvaN = xbVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.MdtA4re8 < 0) {
            qoPGr6Ce();
        }
        return this.MdtA4re8 == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.MdtA4re8 < 0) {
            qoPGr6Ce();
        }
        if (this.MdtA4re8 == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.NCTxEWno;
        obj.getClass();
        this.MdtA4re8 = -1;
        return obj;
    }

    public final void qoPGr6Ce() {
        Object ow5vqvCr;
        int i = this.MdtA4re8;
        xb xbVar = this.wxUZMvaN;
        if (i == -2) {
            ow5vqvCr = ((e7) xbVar.NCTxEWno).MdtA4re8;
        } else {
            zk zkVar = (zk) xbVar.MdtA4re8;
            Object obj = this.NCTxEWno;
            obj.getClass();
            ow5vqvCr = zkVar.ow5vqvCr(obj);
        }
        this.NCTxEWno = ow5vqvCr;
        this.MdtA4re8 = ow5vqvCr == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
