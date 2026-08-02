package ru.yandex.taxi.animation;

import android.view.animation.Interpolator;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\rR\u0016\u0010\u000e\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0016\u0010\u000f\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0016\u0010\u0010\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u0016\u0010\u0011\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\r¨\u0006\u0012"}, d2 = {"Lru/yandex/taxi/animation/LogarithmicInterpolator;", "Landroid/view/animation/Interpolator;", "", "startX", "endX", "<init>", "(FF)V", "()V", "Lzy11;", "calculateValues", "input", "getInterpolation", "(F)F", "F", "normalizedMaxLogarithmicValue", "rangeLength", "rangeOffset", "offset", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LogarithmicInterpolator implements Interpolator {
    public static final int $stable = 8;
    private final float endX;
    private float normalizedMaxLogarithmicValue;
    private float offset;
    private float rangeLength;
    private float rangeOffset;
    private final float startX;

    public LogarithmicInterpolator(float f, float f2) {
        if (Float.compare(f, f2) < 0) {
            this.startX = Float.compare(f, 0.0f) <= 0 ? Float.MIN_VALUE : f;
            this.endX = f2;
            calculateValues();
        } else {
            throw new IllegalArgumentException("startX = " + f + " should be greater than endX = " + f2);
        }
    }

    private final void calculateValues() {
        float log10 = (float) Math.log10(this.startX);
        float log102 = (float) Math.log10(this.endX);
        float f = log102 - log10;
        this.normalizedMaxLogarithmicValue = f;
        float f2 = this.endX;
        float f3 = f2 - this.startX;
        this.rangeLength = f3;
        this.rangeOffset = f3 - f2;
        this.offset = log102 - f;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float input) {
        return (Float.compare(input, 0.0f) == 0 || Float.compare(input, 1.0f) == 0) ? input : (((float) Math.log10((this.rangeLength * input) - this.rangeOffset)) - this.offset) / this.normalizedMaxLogarithmicValue;
    }

    public LogarithmicInterpolator() {
        this(Float.MIN_VALUE, Float.MAX_VALUE);
    }
}
