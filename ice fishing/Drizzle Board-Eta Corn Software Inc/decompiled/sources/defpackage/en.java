package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class en implements Iterable, xn {
    public static final en VgvYg0wo = new en(1, 0, 1);
    public final int MdtA4re8;
    public final int NCTxEWno;
    public final int wxUZMvaN;

    public en(int i, int i2, int i3) {
        if (i3 == 0) {
            m1.sjUBp5pO("Step must be non-zero.");
            throw null;
        }
        if (i3 == Integer.MIN_VALUE) {
            m1.sjUBp5pO("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
            throw null;
        }
        this.NCTxEWno = i;
        if (i3 > 0) {
            if (i < i2) {
                int i4 = i2 % i3;
                int i5 = i % i3;
                int i6 = ((i4 < 0 ? i4 + i3 : i4) - (i5 < 0 ? i5 + i3 : i5)) % i3;
                i2 -= i6 < 0 ? i6 + i3 : i6;
            }
        } else {
            if (i3 >= 0) {
                m1.sjUBp5pO("Step is zero.");
                throw null;
            }
            if (i > i2) {
                int i7 = -i3;
                int i8 = i % i7;
                int i9 = i2 % i7;
                int i10 = ((i8 < 0 ? i8 + i7 : i8) - (i9 < 0 ? i9 + i7 : i9)) % i7;
                i2 += i10 < 0 ? i10 + i7 : i10;
            }
        }
        this.MdtA4re8 = i2;
        this.wxUZMvaN = i3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof en)) {
            return false;
        }
        if (isEmpty() && ((en) obj).isEmpty()) {
            return true;
        }
        en enVar = (en) obj;
        return this.NCTxEWno == enVar.NCTxEWno && this.MdtA4re8 == enVar.MdtA4re8;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.NCTxEWno * 31) + this.MdtA4re8;
    }

    public final boolean isEmpty() {
        return this.NCTxEWno > this.MdtA4re8;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new dn(this.NCTxEWno, this.MdtA4re8, this.wxUZMvaN);
    }

    public final String toString() {
        return this.NCTxEWno + ".." + this.MdtA4re8;
    }
}
