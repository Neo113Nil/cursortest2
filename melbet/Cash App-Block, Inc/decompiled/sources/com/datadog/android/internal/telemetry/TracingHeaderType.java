package com.datadog.android.internal.telemetry;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class TracingHeaderType {
    public static final /* synthetic */ TracingHeaderType[] $VALUES;
    public static final TracingHeaderType B3;
    public static final TracingHeaderType B3MULTI;
    public static final TracingHeaderType DATADOG;
    public static final TracingHeaderType TRACECONTEXT;

    static {
        TracingHeaderType tracingHeaderType = new TracingHeaderType("DATADOG", 0);
        DATADOG = tracingHeaderType;
        TracingHeaderType tracingHeaderType2 = new TracingHeaderType("B3", 1);
        B3 = tracingHeaderType2;
        TracingHeaderType tracingHeaderType3 = new TracingHeaderType("B3MULTI", 2);
        B3MULTI = tracingHeaderType3;
        TracingHeaderType tracingHeaderType4 = new TracingHeaderType("TRACECONTEXT", 3);
        TRACECONTEXT = tracingHeaderType4;
        $VALUES = new TracingHeaderType[]{tracingHeaderType, tracingHeaderType2, tracingHeaderType3, tracingHeaderType4};
    }

    public static TracingHeaderType valueOf(String str) {
        return (TracingHeaderType) Enum.valueOf(TracingHeaderType.class, str);
    }

    public static TracingHeaderType[] values() {
        return (TracingHeaderType[]) $VALUES.clone();
    }
}
