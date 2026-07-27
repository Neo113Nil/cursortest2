package kotlin.text;

import android.graphics.Path;

/* loaded from: classes.dex */
public final class CatchingFishMoshiGson implements CatchingFishMVIWorkManager {
    public static CatchingFishMoshiGson CatchingFishParcelableFAB;
    public static CatchingFishMoshiGson CatchingFishSnackbar;

    public static Path CatchingFishSnackbar(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(f, f2);
        path.lineTo(f3, f4);
        return path;
    }

    @Override // kotlin.text.CatchingFishMVIWorkManager
    public long CatchingFishParcelableFAB() {
        return System.currentTimeMillis();
    }
}
