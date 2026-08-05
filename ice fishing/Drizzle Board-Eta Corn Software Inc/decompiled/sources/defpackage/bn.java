package defpackage;

import android.graphics.Insets;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class bn {
    public static final bn VgvYg0wo = new bn(0, 0, 0, 0);
    public final int MdtA4re8;
    public final int NCTxEWno;
    public final int qoPGr6Ce;
    public final int wxUZMvaN;

    public bn(int i, int i2, int i3, int i4) {
        this.qoPGr6Ce = i;
        this.NCTxEWno = i2;
        this.MdtA4re8 = i3;
        this.wxUZMvaN = i4;
    }

    public static bn NCTxEWno(Insets insets) {
        int i;
        int i2;
        int i3;
        int i4;
        i = insets.left;
        i2 = insets.top;
        i3 = insets.right;
        i4 = insets.bottom;
        return qoPGr6Ce(i, i2, i3, i4);
    }

    public static bn qoPGr6Ce(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? VgvYg0wo : new bn(i, i2, i3, i4);
    }

    public final Insets MdtA4re8() {
        return i0.NCTxEWno(this.qoPGr6Ce, this.NCTxEWno, this.MdtA4re8, this.wxUZMvaN);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || bn.class != obj.getClass()) {
            return false;
        }
        bn bnVar = (bn) obj;
        return this.wxUZMvaN == bnVar.wxUZMvaN && this.qoPGr6Ce == bnVar.qoPGr6Ce && this.MdtA4re8 == bnVar.MdtA4re8 && this.NCTxEWno == bnVar.NCTxEWno;
    }

    public final int hashCode() {
        return (((((this.qoPGr6Ce * 31) + this.NCTxEWno) * 31) + this.MdtA4re8) * 31) + this.wxUZMvaN;
    }

    public final String toString() {
        return "Insets{left=" + this.qoPGr6Ce + ", top=" + this.NCTxEWno + ", right=" + this.MdtA4re8 + ", bottom=" + this.wxUZMvaN + '}';
    }
}
