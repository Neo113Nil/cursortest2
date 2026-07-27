package kotlin.text;

import android.graphics.PathMeasure;

/* loaded from: classes.dex */
public final class CatchingFishCardViewMVP {
    public final PathMeasure CatchingFishParcelableFAB;

    public CatchingFishCardViewMVP(PathMeasure pathMeasure) {
        this.CatchingFishParcelableFAB = pathMeasure;
    }

    public final void CatchingFishParcelableFAB(float f, float f2, CatchingFishMoshiRealm catchingFishMoshiRealm) {
        if (catchingFishMoshiRealm == null) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        this.CatchingFishParcelableFAB.getSegment(f, f2, catchingFishMoshiRealm.CatchingFishParcelableFAB, true);
    }
}
