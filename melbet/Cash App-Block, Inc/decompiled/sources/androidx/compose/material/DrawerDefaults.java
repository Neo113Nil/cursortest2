package androidx.compose.material;

import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.EasingKt;

/* loaded from: classes3.dex */
public abstract class DrawerDefaults {
    public static final float Elevation;

    static {
        CubicBezierEasing cubicBezierEasing = EasingKt.FastOutSlowInEasing;
        Elevation = 16.0f;
    }
}
