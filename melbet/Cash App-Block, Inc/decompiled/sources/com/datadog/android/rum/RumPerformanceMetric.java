package com.datadog.android.rum;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class RumPerformanceMetric {
    public static final /* synthetic */ RumPerformanceMetric[] $VALUES;
    public static final RumPerformanceMetric FLUTTER_BUILD_TIME;
    public static final RumPerformanceMetric FLUTTER_RASTER_TIME;
    public static final RumPerformanceMetric JS_FRAME_TIME;

    static {
        RumPerformanceMetric rumPerformanceMetric = new RumPerformanceMetric("FLUTTER_BUILD_TIME", 0);
        FLUTTER_BUILD_TIME = rumPerformanceMetric;
        RumPerformanceMetric rumPerformanceMetric2 = new RumPerformanceMetric("FLUTTER_RASTER_TIME", 1);
        FLUTTER_RASTER_TIME = rumPerformanceMetric2;
        RumPerformanceMetric rumPerformanceMetric3 = new RumPerformanceMetric("JS_FRAME_TIME", 2);
        JS_FRAME_TIME = rumPerformanceMetric3;
        $VALUES = new RumPerformanceMetric[]{rumPerformanceMetric, rumPerformanceMetric2, rumPerformanceMetric3};
    }

    public static RumPerformanceMetric valueOf(String str) {
        return (RumPerformanceMetric) Enum.valueOf(RumPerformanceMetric.class, str);
    }

    public static RumPerformanceMetric[] values() {
        return (RumPerformanceMetric[]) $VALUES.clone();
    }
}
