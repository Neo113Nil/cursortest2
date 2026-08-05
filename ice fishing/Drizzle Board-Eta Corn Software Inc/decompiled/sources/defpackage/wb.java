package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class wb implements Iterator, xn {
    public int MdtA4re8;
    public int NCTxEWno = -1;
    public final /* synthetic */ xb P7K7Inc8;
    public en VgvYg0wo;
    public int wxUZMvaN;

    public wb(xb xbVar) {
        this.P7K7Inc8 = xbVar;
        int length = ((CharSequence) xbVar.NCTxEWno).length();
        if (length >= 0) {
            length = length >= 0 ? 0 : length;
            this.MdtA4re8 = length;
            this.wxUZMvaN = length;
        } else {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + length + " is less than minimum 0.");
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.NCTxEWno == -1) {
            qoPGr6Ce();
        }
        return this.NCTxEWno == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.NCTxEWno == -1) {
            qoPGr6Ce();
        }
        if (this.NCTxEWno == 0) {
            throw new NoSuchElementException();
        }
        en enVar = this.VgvYg0wo;
        enVar.getClass();
        this.VgvYg0wo = null;
        this.NCTxEWno = -1;
        return enVar;
    }

    public final void qoPGr6Ce() {
        xb xbVar = this.P7K7Inc8;
        CharSequence charSequence = (CharSequence) xbVar.NCTxEWno;
        int i = this.wxUZMvaN;
        if (i < 0) {
            this.NCTxEWno = 0;
            this.VgvYg0wo = null;
            return;
        }
        if (i > charSequence.length()) {
            int i2 = this.MdtA4re8;
            charSequence.getClass();
            this.VgvYg0wo = new en(i2, charSequence.length() - 1, 1);
            this.wxUZMvaN = -1;
        } else {
            hx hxVar = (hx) ((kx) xbVar.MdtA4re8).Qr9iLBAD(charSequence, Integer.valueOf(this.wxUZMvaN));
            if (hxVar == null) {
                int i3 = this.MdtA4re8;
                charSequence.getClass();
                this.VgvYg0wo = new en(i3, charSequence.length() - 1, 1);
                this.wxUZMvaN = -1;
            } else {
                int intValue = ((Number) hxVar.NCTxEWno).intValue();
                int intValue2 = ((Number) hxVar.MdtA4re8).intValue();
                this.VgvYg0wo = w30.KRabZ4CU(this.MdtA4re8, intValue);
                int i4 = intValue + intValue2;
                this.MdtA4re8 = i4;
                this.wxUZMvaN = i4 + (intValue2 == 0 ? 1 : 0);
            }
        }
        this.NCTxEWno = 1;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
