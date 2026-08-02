package androidx.compose.animation.core;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.Drop$$ExternalSyntheticBUOutline0;

/* loaded from: classes.dex */
public abstract class EasingKt {
    public static final CubicBezierEasing FastOutSlowInEasing = new CubicBezierEasing(0.4f, RecyclerView.DECELERATION_RATE, 0.2f, 1.0f);
    public static final CubicBezierEasing LinearOutSlowInEasing = new CubicBezierEasing(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 0.2f, 1.0f);
    public static final CubicBezierEasing FastOutLinearInEasing = new CubicBezierEasing(0.4f, RecyclerView.DECELERATION_RATE, 1.0f, 1.0f);
    public static final Drop$$ExternalSyntheticBUOutline0 LinearEasing = new Drop$$ExternalSyntheticBUOutline0(2);
}
