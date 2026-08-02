package androidx.compose.material3.tokens;

import androidx.compose.animation.core.CubicBezierEasing;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public abstract class MotionTokens {
    public static final CubicBezierEasing EasingEmphasizedAccelerateCubicBezier;
    public static final CubicBezierEasing EasingEmphasizedDecelerateCubicBezier;
    public static final CubicBezierEasing EasingStandardCubicBezier;

    static {
        new CubicBezierEasing(0.2f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 1.0f);
        EasingEmphasizedAccelerateCubicBezier = new CubicBezierEasing(0.3f, RecyclerView.DECELERATION_RATE, 0.8f, 0.15f);
        EasingEmphasizedDecelerateCubicBezier = new CubicBezierEasing(0.05f, 0.7f, 0.1f, 1.0f);
        new CubicBezierEasing(0.4f, RecyclerView.DECELERATION_RATE, 0.2f, 1.0f);
        new CubicBezierEasing(0.4f, RecyclerView.DECELERATION_RATE, 1.0f, 1.0f);
        new CubicBezierEasing(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 0.2f, 1.0f);
        new CubicBezierEasing(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 1.0f, 1.0f);
        EasingStandardCubicBezier = new CubicBezierEasing(0.2f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 1.0f);
        new CubicBezierEasing(0.3f, RecyclerView.DECELERATION_RATE, 1.0f, 1.0f);
        new CubicBezierEasing(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 1.0f);
    }
}
