package androidx.compose.material;

import androidx.compose.material.ripple.RippleAlpha;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import androidx.room.InvalidationTracker$$ExternalSyntheticLambda0;

/* loaded from: classes.dex */
public abstract class RippleKt {
    public static final RippleAlpha DarkThemeRippleAlpha;
    public static final RippleNodeFactory DefaultBoundedRipple;
    public static final RippleNodeFactory DefaultUnboundedRipple;
    public static final RippleAlpha LightThemeHighContrastRippleAlpha;
    public static final RippleAlpha LightThemeLowContrastRippleAlpha;
    public static final DynamicProvidableCompositionLocal LocalRippleConfiguration = new DynamicProvidableCompositionLocal(new InvalidationTracker$$ExternalSyntheticLambda0(13));

    static {
        long j = Color.Unspecified;
        DefaultBoundedRipple = new RippleNodeFactory(Float.NaN, j, true);
        DefaultUnboundedRipple = new RippleNodeFactory(Float.NaN, j, false);
        LightThemeHighContrastRippleAlpha = new RippleAlpha(0.16f, 0.24f, 0.08f, 0.24f);
        LightThemeLowContrastRippleAlpha = new RippleAlpha(0.08f, 0.12f, 0.04f, 0.12f);
        DarkThemeRippleAlpha = new RippleAlpha(0.08f, 0.12f, 0.04f, 0.1f);
    }

    /* renamed from: ripple-H2RKhps$default, reason: not valid java name */
    public static RippleNodeFactory m500rippleH2RKhps$default(float f, int i, long j, boolean z) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            f = Float.NaN;
        }
        if ((i & 4) != 0) {
            j = Color.Unspecified;
        }
        return (Dp.m1037equalsimpl0(f, Float.NaN) && Color.m676equalsimpl0(j, Color.Unspecified)) ? z ? DefaultBoundedRipple : DefaultUnboundedRipple : new RippleNodeFactory(f, j, z);
    }
}
