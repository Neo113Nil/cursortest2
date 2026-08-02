package androidx.compose.material;

import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public abstract class ElevationKt {
    public static final TweenSpec DefaultIncomingSpec = new TweenSpec(120, EasingKt.FastOutSlowInEasing, 2);
    public static final TweenSpec DefaultOutgoingSpec = new TweenSpec(150, new CubicBezierEasing(0.4f, RecyclerView.DECELERATION_RATE, 0.6f, 1.0f), 2);
    public static final TweenSpec HoveredOutgoingSpec = new TweenSpec(120, new CubicBezierEasing(0.4f, RecyclerView.DECELERATION_RATE, 0.6f, 1.0f), 2);
}
