package com.squareup.cash.beacondetection.api;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class DetectionContext {
    public static final /* synthetic */ DetectionContext[] $VALUES;
    public static final DetectionContext BACKGROUND_REGION_ENTRY;
    public static final DetectionContext BACKGROUND_REGION_EXIT;
    public static final DetectionContext FOREGROUND_RANGING;

    static {
        DetectionContext detectionContext = new DetectionContext("FOREGROUND_RANGING", 0);
        FOREGROUND_RANGING = detectionContext;
        DetectionContext detectionContext2 = new DetectionContext("BACKGROUND_REGION_ENTRY", 1);
        BACKGROUND_REGION_ENTRY = detectionContext2;
        DetectionContext detectionContext3 = new DetectionContext("BACKGROUND_REGION_EXIT", 2);
        BACKGROUND_REGION_EXIT = detectionContext3;
        $VALUES = new DetectionContext[]{detectionContext, detectionContext2, detectionContext3};
    }

    public static DetectionContext valueOf(String str) {
        return (DetectionContext) Enum.valueOf(DetectionContext.class, str);
    }

    public static DetectionContext[] values() {
        return (DetectionContext[]) $VALUES.clone();
    }
}
