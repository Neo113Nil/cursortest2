package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class vg implements Iterator, xn {
    public final Iterator MdtA4re8;
    public final /* synthetic */ k60 P7K7Inc8;
    public Object VgvYg0wo;
    public final /* synthetic */ int NCTxEWno = 1;
    public int wxUZMvaN = -1;

    public vg(xb xbVar) {
        this.P7K7Inc8 = xbVar;
        this.MdtA4re8 = new nd0((nb0) xbVar.NCTxEWno);
    }

    public void NCTxEWno() {
        Iterator it = this.MdtA4re8;
        if (it.hasNext()) {
            Object next = it.next();
            if (((Boolean) ((nb0) this.P7K7Inc8).MdtA4re8.ow5vqvCr(next)).booleanValue()) {
                this.wxUZMvaN = 1;
                this.VgvYg0wo = next;
                return;
            }
        }
        this.wxUZMvaN = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.NCTxEWno) {
            case 0:
                if (this.wxUZMvaN == -1) {
                    qoPGr6Ce();
                }
                if (this.wxUZMvaN == 1) {
                }
                break;
            default:
                if (this.wxUZMvaN == -1) {
                    NCTxEWno();
                }
                if (this.wxUZMvaN == 1) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.NCTxEWno) {
            case 0:
                if (this.wxUZMvaN == -1) {
                    qoPGr6Ce();
                }
                if (this.wxUZMvaN == 0) {
                    throw new NoSuchElementException();
                }
                Object obj = this.VgvYg0wo;
                this.VgvYg0wo = null;
                this.wxUZMvaN = -1;
                return obj;
            default:
                if (this.wxUZMvaN == -1) {
                    NCTxEWno();
                }
                if (this.wxUZMvaN == 0) {
                    throw new NoSuchElementException();
                }
                Object obj2 = this.VgvYg0wo;
                this.VgvYg0wo = null;
                this.wxUZMvaN = -1;
                return obj2;
        }
    }

    public void qoPGr6Ce() {
        Object next;
        xb xbVar = (xb) this.P7K7Inc8;
        do {
            Iterator it = this.MdtA4re8;
            if (!it.hasNext()) {
                this.wxUZMvaN = 0;
                return;
            }
            next = it.next();
        } while (((Boolean) ((tKaxLBvG) xbVar.MdtA4re8).ow5vqvCr(next)).booleanValue());
        this.VgvYg0wo = next;
        this.wxUZMvaN = 1;
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.NCTxEWno) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public vg(nb0 nb0Var) {
        this.P7K7Inc8 = nb0Var;
        this.MdtA4re8 = nb0Var.NCTxEWno.iterator();
    }
}
