package defpackage;

/* loaded from: classes.dex */
public final class y21 {
    public final int IHQe1A4L2xu;
    public final int oh6vYeIP;
    public final android.graphics.Point r1MBDhnF;

    public y21(int i, int i2, android.graphics.Point point) {
        int i3 = point.x;
        int i4 = point.y;
        this.IHQe1A4L2xu = i;
        this.oh6vYeIP = i2;
        this.r1MBDhnF = new android.graphics.Point(i3, i4);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.y21) {
            defpackage.y21 y21Var = (defpackage.y21) obj;
            if (this.IHQe1A4L2xu == y21Var.IHQe1A4L2xu && this.oh6vYeIP == y21Var.oh6vYeIP && this.r1MBDhnF.equals(y21Var.r1MBDhnF)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.r1MBDhnF.hashCode() + (((this.IHQe1A4L2xu * 31) + this.oh6vYeIP) * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RoundedCornerCompat{position=");
        int i = this.IHQe1A4L2xu;
        sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? "Invalid" : "BottomLeft" : "BottomRight" : "TopRight" : "TopLeft");
        sb.append(", radius=");
        sb.append(this.oh6vYeIP);
        sb.append(", center=");
        sb.append(this.r1MBDhnF);
        sb.append('}');
        return sb.toString();
    }
}
