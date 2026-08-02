package androidx.compose.material3;

import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;

/* loaded from: classes3.dex */
public abstract class RippleKt {
    public static final RippleNodeFactory DefaultBoundedRipple;
    public static final RippleNodeFactory DefaultUnboundedRipple;
    public static final DynamicProvidableCompositionLocal LocalRippleConfiguration = new DynamicProvidableCompositionLocal(new androidx.compose.material.TextKt$$ExternalSyntheticLambda0(18));

    static {
        long j = Color.Unspecified;
        DefaultBoundedRipple = new RippleNodeFactory(Float.NaN, j, true);
        DefaultUnboundedRipple = new RippleNodeFactory(Float.NaN, j, false);
    }

    /* renamed from: ripple-H2RKhps$default, reason: not valid java name */
    public static RippleNodeFactory m548rippleH2RKhps$default(int i, float f, boolean z) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            f = Float.NaN;
        }
        long j = Color.Unspecified;
        return (Dp.m1037equalsimpl0(f, Float.NaN) && Color.m676equalsimpl0(j, j)) ? z ? DefaultBoundedRipple : DefaultUnboundedRipple : new RippleNodeFactory(f, j, z);
    }
}
