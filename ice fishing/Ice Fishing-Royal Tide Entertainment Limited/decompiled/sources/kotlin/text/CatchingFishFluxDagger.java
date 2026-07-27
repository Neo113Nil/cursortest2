package kotlin.text;

import android.graphics.Point;

/* loaded from: classes.dex */
public final class CatchingFishFluxDagger {
    public final Point CatchingFishCoroutine;
    public final int CatchingFishParcelableFAB;
    public final int CatchingFishSnackbar;

    public CatchingFishFluxDagger(int i, int i2, Point point) {
        int i3 = point.x;
        int i4 = point.y;
        this.CatchingFishParcelableFAB = i;
        this.CatchingFishSnackbar = i2;
        this.CatchingFishCoroutine = new Point(i3, i4);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CatchingFishFluxDagger) {
            CatchingFishFluxDagger catchingFishFluxDagger = (CatchingFishFluxDagger) obj;
            if (this.CatchingFishParcelableFAB == catchingFishFluxDagger.CatchingFishParcelableFAB && this.CatchingFishSnackbar == catchingFishFluxDagger.CatchingFishSnackbar && this.CatchingFishCoroutine.equals(catchingFishFluxDagger.CatchingFishCoroutine)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.CatchingFishCoroutine.hashCode() + (((this.CatchingFishParcelableFAB * 31) + this.CatchingFishSnackbar) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RoundedCornerCompat{position=");
        int i = this.CatchingFishParcelableFAB;
        sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? "Invalid" : "BottomLeft" : "BottomRight" : "TopRight" : "TopLeft");
        sb.append(", radius=");
        sb.append(this.CatchingFishSnackbar);
        sb.append(", center=");
        sb.append(this.CatchingFishCoroutine);
        sb.append('}');
        return sb.toString();
    }
}
