package app.cash.redwood.yoga.internal;

import app.cash.redwood.yoga.internal.enums.YGMeasureMode;

/* loaded from: classes3.dex */
public final class YGCachedMeasurement {
    public float computedHeight;
    public float computedWidth;
    public YGMeasureMode heightMeasureMode;
    public YGMeasureMode widthMeasureMode;
    public float availableWidth = -1.0f;
    public float availableHeight = -1.0f;

    public YGCachedMeasurement() {
        YGMeasureMode yGMeasureMode = YGMeasureMode.YGMeasureModeUndefined;
        this.widthMeasureMode = yGMeasureMode;
        this.heightMeasureMode = yGMeasureMode;
        this.computedWidth = -1.0f;
        this.computedHeight = -1.0f;
    }
}
