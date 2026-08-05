package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class hp implements Iterator, xn {
    public int MdtA4re8;
    public final CharSequence NCTxEWno;
    public int P7K7Inc8;
    public int VgvYg0wo;
    public int wxUZMvaN;

    public hp(CharSequence charSequence) {
        this.NCTxEWno = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i2;
        int i3 = this.MdtA4re8;
        if (i3 != 0) {
            return i3 == 1;
        }
        if (this.P7K7Inc8 < 0) {
            this.MdtA4re8 = 2;
            return false;
        }
        CharSequence charSequence = this.NCTxEWno;
        int length = charSequence.length();
        int length2 = charSequence.length();
        for (int i4 = this.wxUZMvaN; i4 < length2; i4++) {
            char charAt = charSequence.charAt(i4);
            if (charAt == '\n' || charAt == '\r') {
                i = (charAt == '\r' && (i2 = i4 + 1) < charSequence.length() && charSequence.charAt(i2) == '\n') ? 2 : 1;
                length = i4;
                this.MdtA4re8 = 1;
                this.P7K7Inc8 = i;
                this.VgvYg0wo = length;
                return true;
            }
        }
        i = -1;
        this.MdtA4re8 = 1;
        this.P7K7Inc8 = i;
        this.VgvYg0wo = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.MdtA4re8 = 0;
        int i = this.VgvYg0wo;
        int i2 = this.wxUZMvaN;
        this.wxUZMvaN = this.P7K7Inc8 + i;
        return this.NCTxEWno.subSequence(i2, i).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
