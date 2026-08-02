package com.netcetera.threeds.sdk.api.security;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class Severity {
    private static int ThreeDS2Service = 1;
    private static int initialize;
    public static final Severity LOW = new Severity("LOW", 0);
    public static final Severity MEDIUM = new Severity("MEDIUM", 1);
    public static final Severity HIGH = new Severity("HIGH", 2);
    private static final /* synthetic */ Severity[] $VALUES = $values();

    private static /* synthetic */ Severity[] $values() {
        int i = ThreeDS2Service + 121;
        initialize = i % 128;
        if (i % 2 == 0) {
            return new Severity[]{LOW, MEDIUM, HIGH};
        }
        Severity[] severityArr = new Severity[3];
        severityArr[1] = LOW;
        severityArr[0] = MEDIUM;
        severityArr[5] = HIGH;
        return severityArr;
    }

    static {
        int i = initialize + 57;
        ThreeDS2Service = i % 128;
        if (i % 2 == 0) {
            int i2 = 33 / 0;
        }
    }

    private Severity(String str, int i) {
    }

    public static Severity valueOf(String str) {
        ThreeDS2Service = (initialize + 23) % 128;
        Severity severity = (Severity) Enum.valueOf(Severity.class, str);
        initialize = (ThreeDS2Service + 57) % 128;
        return severity;
    }

    public static Severity[] values() {
        int i = initialize + 11;
        ThreeDS2Service = i % 128;
        if (i % 2 != 0) {
            return (Severity[]) $VALUES.clone();
        }
        $VALUES.clone();
        throw null;
    }
}
