package com.squareup.cash.fidesmo.views;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class ScanningPulseShape {
    public static final /* synthetic */ ScanningPulseShape[] $VALUES;
    public static final ScanningPulseShape Card;
    public static final ScanningPulseShape Heart;
    public static final ScanningPulseShape Star;

    static {
        ScanningPulseShape scanningPulseShape = new ScanningPulseShape("Star", 0);
        Star = scanningPulseShape;
        ScanningPulseShape scanningPulseShape2 = new ScanningPulseShape("Heart", 1);
        Heart = scanningPulseShape2;
        ScanningPulseShape scanningPulseShape3 = new ScanningPulseShape("Card", 2);
        Card = scanningPulseShape3;
        $VALUES = new ScanningPulseShape[]{scanningPulseShape, scanningPulseShape2, scanningPulseShape3};
    }

    public static ScanningPulseShape valueOf(String str) {
        return (ScanningPulseShape) Enum.valueOf(ScanningPulseShape.class, str);
    }

    public static ScanningPulseShape[] values() {
        return (ScanningPulseShape[]) $VALUES.clone();
    }
}
