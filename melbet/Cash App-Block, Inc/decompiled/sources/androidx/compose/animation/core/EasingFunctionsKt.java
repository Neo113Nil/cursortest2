package androidx.compose.animation.core;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public abstract class EasingFunctionsKt {
    public static final CubicBezierEasing EaseIn;
    public static final CubicBezierEasing EaseInCirc;
    public static final CubicBezierEasing EaseInOut;
    public static final CubicBezierEasing EaseInOutCubic;
    public static final CubicBezierEasing EaseOut;
    public static final CubicBezierEasing EaseOutCirc;
    public static final CubicBezierEasing EaseOutCubic;
    public static final CubicBezierEasing EaseOutExpo;

    static {
        new CubicBezierEasing(0.25f, 0.1f, 0.25f, 1.0f);
        EaseOut = new CubicBezierEasing(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 0.58f, 1.0f);
        EaseIn = new CubicBezierEasing(0.42f, RecyclerView.DECELERATION_RATE, 1.0f, 1.0f);
        EaseInOut = new CubicBezierEasing(0.42f, RecyclerView.DECELERATION_RATE, 0.58f, 1.0f);
        new CubicBezierEasing(0.12f, RecyclerView.DECELERATION_RATE, 0.39f, RecyclerView.DECELERATION_RATE);
        new CubicBezierEasing(0.61f, 1.0f, 0.88f, 1.0f);
        new CubicBezierEasing(0.37f, RecyclerView.DECELERATION_RATE, 0.63f, 1.0f);
        new CubicBezierEasing(0.32f, RecyclerView.DECELERATION_RATE, 0.67f, RecyclerView.DECELERATION_RATE);
        EaseOutCubic = new CubicBezierEasing(0.33f, 1.0f, 0.68f, 1.0f);
        EaseInOutCubic = new CubicBezierEasing(0.65f, RecyclerView.DECELERATION_RATE, 0.35f, 1.0f);
        new CubicBezierEasing(0.64f, RecyclerView.DECELERATION_RATE, 0.78f, RecyclerView.DECELERATION_RATE);
        new CubicBezierEasing(0.22f, 1.0f, 0.36f, 1.0f);
        new CubicBezierEasing(0.83f, RecyclerView.DECELERATION_RATE, 0.17f, 1.0f);
        EaseInCirc = new CubicBezierEasing(0.55f, RecyclerView.DECELERATION_RATE, 1.0f, 0.45f);
        EaseOutCirc = new CubicBezierEasing(RecyclerView.DECELERATION_RATE, 0.55f, 0.45f, 1.0f);
        new CubicBezierEasing(0.85f, RecyclerView.DECELERATION_RATE, 0.15f, 1.0f);
        new CubicBezierEasing(0.11f, RecyclerView.DECELERATION_RATE, 0.5f, RecyclerView.DECELERATION_RATE);
        new CubicBezierEasing(0.5f, 1.0f, 0.89f, 1.0f);
        new CubicBezierEasing(0.45f, RecyclerView.DECELERATION_RATE, 0.55f, 1.0f);
        new CubicBezierEasing(0.5f, RecyclerView.DECELERATION_RATE, 0.75f, RecyclerView.DECELERATION_RATE);
        new CubicBezierEasing(0.25f, 1.0f, 0.5f, 1.0f);
        new CubicBezierEasing(0.76f, RecyclerView.DECELERATION_RATE, 0.24f, 1.0f);
        new CubicBezierEasing(0.7f, RecyclerView.DECELERATION_RATE, 0.84f, RecyclerView.DECELERATION_RATE);
        EaseOutExpo = new CubicBezierEasing(0.16f, 1.0f, 0.3f, 1.0f);
        new CubicBezierEasing(0.87f, RecyclerView.DECELERATION_RATE, 0.13f, 1.0f);
        new CubicBezierEasing(0.36f, RecyclerView.DECELERATION_RATE, 0.66f, -0.56f);
        new CubicBezierEasing(0.34f, 1.56f, 0.64f, 1.0f);
        new CubicBezierEasing(0.68f, -0.6f, 0.32f, 1.6f);
    }
}
