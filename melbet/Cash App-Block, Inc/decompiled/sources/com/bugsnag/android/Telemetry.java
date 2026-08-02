package com.bugsnag.android;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class Telemetry {
    public static final /* synthetic */ Telemetry[] $VALUES;
    public static final Telemetry INTERNAL_ERRORS;
    public static final Telemetry USAGE;

    static {
        Telemetry telemetry = new Telemetry("INTERNAL_ERRORS", 0);
        INTERNAL_ERRORS = telemetry;
        Telemetry telemetry2 = new Telemetry("USAGE", 1);
        USAGE = telemetry2;
        $VALUES = new Telemetry[]{telemetry, telemetry2};
    }

    public static Telemetry valueOf(String str) {
        return (Telemetry) Enum.valueOf(Telemetry.class, str);
    }

    public static Telemetry[] values() {
        return (Telemetry[]) $VALUES.clone();
    }
}
