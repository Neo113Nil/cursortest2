package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public class ow5vqvCr implements Iterator, xn {
    public int MdtA4re8;
    public final /* synthetic */ int NCTxEWno;
    public final Object wxUZMvaN;

    public ow5vqvCr(Object[] objArr) {
        this.NCTxEWno = 1;
        objArr.getClass();
        this.wxUZMvaN = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.NCTxEWno;
        Object obj = this.wxUZMvaN;
        switch (i) {
            case 0:
                if (this.MdtA4re8 < ((lDXGDhIF) obj).qoPGr6Ce()) {
                    break;
                }
                break;
            case 1:
                if (this.MdtA4re8 < ((Object[]) obj).length) {
                    break;
                }
                break;
            default:
                if (this.MdtA4re8 < ((a80) obj).MdtA4re8()) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.NCTxEWno;
        Object obj = this.wxUZMvaN;
        switch (i) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i2 = this.MdtA4re8;
                this.MdtA4re8 = i2 + 1;
                return ((lDXGDhIF) obj).get(i2);
            case 1:
                try {
                    int i3 = this.MdtA4re8;
                    this.MdtA4re8 = i3 + 1;
                    return ((Object[]) obj)[i3];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.MdtA4re8--;
                    throw new NoSuchElementException(e.getMessage());
                }
            default:
                int i4 = this.MdtA4re8;
                this.MdtA4re8 = i4 + 1;
                return ((a80) obj).wxUZMvaN(i4);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.NCTxEWno) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public /* synthetic */ ow5vqvCr(int i, Object obj) {
        this.NCTxEWno = i;
        this.wxUZMvaN = obj;
    }
}
