package kotlin.text;

import android.content.res.Resources;
import java.util.Objects;

/* loaded from: classes.dex */
public final class CatchingFishMoshiAppCompat {
    public final Resources CatchingFishParcelableFAB;
    public final Resources.Theme CatchingFishSnackbar;

    public CatchingFishMoshiAppCompat(Resources resources, Resources.Theme theme) {
        this.CatchingFishParcelableFAB = resources;
        this.CatchingFishSnackbar = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && CatchingFishMoshiAppCompat.class == obj.getClass()) {
            CatchingFishMoshiAppCompat catchingFishMoshiAppCompat = (CatchingFishMoshiAppCompat) obj;
            if (this.CatchingFishParcelableFAB.equals(catchingFishMoshiAppCompat.CatchingFishParcelableFAB) && Objects.equals(this.CatchingFishSnackbar, catchingFishMoshiAppCompat.CatchingFishSnackbar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.CatchingFishParcelableFAB, this.CatchingFishSnackbar);
    }
}
