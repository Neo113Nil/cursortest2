package kotlin.text;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class CatchingFishDaggerView implements CatchingFishCameraXGradle {
    public final float CatchingFishParcelableFAB;

    public CatchingFishDaggerView(float f) {
        this.CatchingFishParcelableFAB = f;
    }

    @Override // kotlin.text.CatchingFishCameraXGradle
    public final float CatchingFishParcelableFAB(RectF rectF) {
        float min = Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f);
        float f = this.CatchingFishParcelableFAB;
        if (f < 0.0f) {
            return 0.0f;
        }
        return f > min ? min : f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CatchingFishDaggerView) && this.CatchingFishParcelableFAB == ((CatchingFishDaggerView) obj).CatchingFishParcelableFAB;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.CatchingFishParcelableFAB)});
    }
}
