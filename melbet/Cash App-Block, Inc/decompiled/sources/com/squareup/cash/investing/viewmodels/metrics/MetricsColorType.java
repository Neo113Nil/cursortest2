package com.squareup.cash.investing.viewmodels.metrics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class MetricsColorType {
    public static final /* synthetic */ MetricsColorType[] $VALUES;
    public static final MetricsColorType NUMERIC;
    public static final MetricsColorType UNKNOWN;

    static {
        MetricsColorType metricsColorType = new MetricsColorType("NUMERIC", 0);
        NUMERIC = metricsColorType;
        MetricsColorType metricsColorType2 = new MetricsColorType("UNKNOWN", 1);
        UNKNOWN = metricsColorType2;
        $VALUES = new MetricsColorType[]{metricsColorType, metricsColorType2};
    }

    public static MetricsColorType valueOf(String str) {
        return (MetricsColorType) Enum.valueOf(MetricsColorType.class, str);
    }

    public static MetricsColorType[] values() {
        return (MetricsColorType[]) $VALUES.clone();
    }
}
