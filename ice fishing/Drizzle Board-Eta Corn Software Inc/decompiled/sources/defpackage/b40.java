package defpackage;

import android.graphics.Point;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class b40 {
    public final Point MdtA4re8;
    public final int NCTxEWno;
    public final int qoPGr6Ce;

    public b40(int i, int i2, Point point) {
        int i3 = point.x;
        int i4 = point.y;
        this.qoPGr6Ce = i;
        this.NCTxEWno = i2;
        this.MdtA4re8 = new Point(i3, i4);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b40)) {
            return false;
        }
        b40 b40Var = (b40) obj;
        return this.qoPGr6Ce == b40Var.qoPGr6Ce && this.NCTxEWno == b40Var.NCTxEWno && this.MdtA4re8.equals(b40Var.MdtA4re8);
    }

    public final int hashCode() {
        return this.MdtA4re8.hashCode() + (((this.qoPGr6Ce * 31) + this.NCTxEWno) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RoundedCornerCompat{position=");
        int i = this.qoPGr6Ce;
        sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? "Invalid" : "BottomLeft" : "BottomRight" : "TopRight" : "TopLeft");
        sb.append(", radius=");
        sb.append(this.NCTxEWno);
        sb.append(", center=");
        sb.append(this.MdtA4re8);
        sb.append('}');
        return sb.toString();
    }
}
