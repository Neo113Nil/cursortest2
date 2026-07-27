package Q;

import android.graphics.Path;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* loaded from: classes.dex */
public abstract class a {
    public static Interpolator a(float f3, float f9) {
        return new PathInterpolator(f3, f9);
    }

    public static Interpolator b(float f3, float f9, float f10, float f11) {
        return new PathInterpolator(f3, f9, f10, f11);
    }

    public static Interpolator c(Path path) {
        return new PathInterpolator(path);
    }
}
