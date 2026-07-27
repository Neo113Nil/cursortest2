package kotlin.text;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public final class CatchingFishMVIEspresso implements Interpolator {
    public final /* synthetic */ int CatchingFishParcelableFAB;

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        switch (this.CatchingFishParcelableFAB) {
        }
        float f2 = f - 1.0f;
        return (f2 * f2 * f2 * f2 * f2) + 1.0f;
    }
}
