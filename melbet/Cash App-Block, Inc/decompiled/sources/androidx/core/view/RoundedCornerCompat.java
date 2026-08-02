package androidx.core.view;

import android.graphics.Point;

/* loaded from: classes3.dex */
public final class RoundedCornerCompat {
    public final Point mCenter;
    public final int mPosition;
    public final int mRadius;

    public RoundedCornerCompat(int i, int i2, Point point) {
        int i3 = point.x;
        int i4 = point.y;
        this.mPosition = i;
        this.mRadius = i2;
        this.mCenter = new Point(i3, i4);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RoundedCornerCompat) {
            RoundedCornerCompat roundedCornerCompat = (RoundedCornerCompat) obj;
            if (this.mPosition == roundedCornerCompat.mPosition && this.mRadius == roundedCornerCompat.mRadius && this.mCenter.equals(roundedCornerCompat.mCenter)) {
                return true;
            }
        }
        return false;
    }

    public final int getRadius() {
        return this.mRadius;
    }

    public final int hashCode() {
        return this.mCenter.hashCode() + (((this.mPosition * 31) + this.mRadius) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RoundedCornerCompat{position=");
        int i = this.mPosition;
        sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? "Invalid" : "BottomLeft" : "BottomRight" : "TopRight" : "TopLeft");
        sb.append(", radius=");
        sb.append(this.mRadius);
        sb.append(", center=");
        sb.append(this.mCenter);
        sb.append('}');
        return sb.toString();
    }
}
