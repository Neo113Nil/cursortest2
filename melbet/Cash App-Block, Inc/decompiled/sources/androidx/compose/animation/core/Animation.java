package androidx.compose.animation.core;

/* loaded from: classes.dex */
public interface Animation {
    long getDurationNanos();

    Object getTargetValue();

    TwoWayConverterImpl getTypeConverter();

    Object getValueFromNanos(long j);

    AnimationVector getVelocityVectorFromNanos(long j);

    default boolean isFinishedFromNanos(long j) {
        return j >= getDurationNanos();
    }

    boolean isInfinite();
}
