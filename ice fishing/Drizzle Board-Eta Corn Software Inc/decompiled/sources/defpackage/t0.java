package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class t0 implements Iterator, xn {
    public int MdtA4re8;
    public int NCTxEWno;
    public final /* synthetic */ Object P7K7Inc8;
    public final /* synthetic */ int VgvYg0wo;
    public boolean wxUZMvaN;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t0(x0 x0Var, int i) {
        this(x0Var.wxUZMvaN);
        this.VgvYg0wo = i;
        switch (i) {
            case 1:
                this.P7K7Inc8 = x0Var;
                this(x0Var.wxUZMvaN);
                break;
            default:
                this.P7K7Inc8 = x0Var;
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.MdtA4re8 < this.NCTxEWno;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object P7K7Inc8;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.MdtA4re8;
        int i2 = this.VgvYg0wo;
        Object obj = this.P7K7Inc8;
        switch (i2) {
            case 0:
                P7K7Inc8 = ((x0) obj).P7K7Inc8(i);
                break;
            case 1:
                P7K7Inc8 = ((x0) obj).jb9XjC4I(i);
                break;
            default:
                P7K7Inc8 = ((z0) obj).MdtA4re8[i];
                break;
        }
        this.MdtA4re8++;
        this.wxUZMvaN = true;
        return P7K7Inc8;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.wxUZMvaN) {
            m1.Ey6iv0m0("Call next() before removing an element.");
            return;
        }
        int i = this.MdtA4re8 - 1;
        this.MdtA4re8 = i;
        int i2 = this.VgvYg0wo;
        Object obj = this.P7K7Inc8;
        switch (i2) {
            case 0:
                ((x0) obj).b2ZJblxo(i);
                break;
            case 1:
                ((x0) obj).b2ZJblxo(i);
                break;
            default:
                ((z0) obj).qoPGr6Ce(i);
                break;
        }
        this.NCTxEWno--;
        this.wxUZMvaN = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t0(z0 z0Var) {
        this(z0Var.wxUZMvaN);
        this.VgvYg0wo = 2;
        this.P7K7Inc8 = z0Var;
    }

    public t0(int i) {
        this.NCTxEWno = i;
    }
}
