package kotlin.text;

import java.util.Objects;

/* loaded from: classes.dex */
public final class CatchingFishFirebaseGlide {
    public final int CatchingFishCoroutine;
    public final String CatchingFishParcelableFAB;
    public final int CatchingFishSnackbar;

    public CatchingFishFirebaseGlide(String str, int i, int i2) {
        this.CatchingFishParcelableFAB = str;
        this.CatchingFishSnackbar = i;
        this.CatchingFishCoroutine = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatchingFishFirebaseGlide)) {
            return false;
        }
        CatchingFishFirebaseGlide catchingFishFirebaseGlide = (CatchingFishFirebaseGlide) obj;
        return Objects.equals(this.CatchingFishParcelableFAB, catchingFishFirebaseGlide.CatchingFishParcelableFAB) && this.CatchingFishSnackbar == catchingFishFirebaseGlide.CatchingFishSnackbar && this.CatchingFishCoroutine == catchingFishFirebaseGlide.CatchingFishCoroutine;
    }

    public final int hashCode() {
        Integer valueOf = Integer.valueOf(this.CatchingFishSnackbar);
        Integer valueOf2 = Integer.valueOf(this.CatchingFishCoroutine);
        Float valueOf3 = Float.valueOf(1.0f);
        return Objects.hash(this.CatchingFishParcelableFAB, valueOf, valueOf2, valueOf3, 0, 0, 0, valueOf3);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DisplayShapeCompat{ spec=");
        String str = this.CatchingFishParcelableFAB;
        sb.append(str != null ? Integer.valueOf(str.hashCode()) : "null");
        sb.append(" displayWidth=");
        sb.append(this.CatchingFishSnackbar);
        sb.append(" displayHeight=");
        sb.append(this.CatchingFishCoroutine);
        sb.append(" physicalPixelDisplaySizeRatio=1.0 rotation=0 offsetX=0 offsetY=0 scale=1.0}");
        return sb.toString();
    }
}
