package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class su implements Iterator, xn {
    public boolean MdtA4re8;
    public int NCTxEWno = -1;
    public final /* synthetic */ yt wxUZMvaN;

    public su(yt ytVar) {
        this.wxUZMvaN = ytVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.NCTxEWno + 1 < ((a80) this.wxUZMvaN.wxUZMvaN).MdtA4re8();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.MdtA4re8 = true;
        a80 a80Var = (a80) this.wxUZMvaN.wxUZMvaN;
        int i = this.NCTxEWno + 1;
        this.NCTxEWno = i;
        return (pu) a80Var.wxUZMvaN(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.MdtA4re8) {
            m1.Ey6iv0m0("You must call next() before you can remove an element");
            return;
        }
        a80 a80Var = (a80) this.wxUZMvaN.wxUZMvaN;
        ((pu) a80Var.wxUZMvaN(this.NCTxEWno)).wxUZMvaN = null;
        int i = this.NCTxEWno;
        Object[] objArr = a80Var.wxUZMvaN;
        Object obj = objArr[i];
        Object obj2 = ej0.ow5vqvCr;
        if (obj != obj2) {
            objArr[i] = obj2;
            a80Var.NCTxEWno = true;
        }
        this.NCTxEWno = i - 1;
        this.MdtA4re8 = false;
    }
}
