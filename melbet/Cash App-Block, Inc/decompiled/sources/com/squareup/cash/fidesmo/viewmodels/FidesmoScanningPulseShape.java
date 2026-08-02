package com.squareup.cash.fidesmo.viewmodels;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class FidesmoScanningPulseShape {
    public static final /* synthetic */ FidesmoScanningPulseShape[] $VALUES;
    public static final FidesmoScanningPulseShape HEART;
    public static final FidesmoScanningPulseShape MINI_CARD;
    public static final FidesmoScanningPulseShape STAR;

    static {
        FidesmoScanningPulseShape fidesmoScanningPulseShape = new FidesmoScanningPulseShape("STAR", 0);
        STAR = fidesmoScanningPulseShape;
        FidesmoScanningPulseShape fidesmoScanningPulseShape2 = new FidesmoScanningPulseShape("HEART", 1);
        HEART = fidesmoScanningPulseShape2;
        FidesmoScanningPulseShape fidesmoScanningPulseShape3 = new FidesmoScanningPulseShape("MINI_CARD", 2);
        MINI_CARD = fidesmoScanningPulseShape3;
        $VALUES = new FidesmoScanningPulseShape[]{fidesmoScanningPulseShape, fidesmoScanningPulseShape2, fidesmoScanningPulseShape3};
    }

    public static FidesmoScanningPulseShape valueOf(String str) {
        return (FidesmoScanningPulseShape) Enum.valueOf(FidesmoScanningPulseShape.class, str);
    }

    public static FidesmoScanningPulseShape[] values() {
        return (FidesmoScanningPulseShape[]) $VALUES.clone();
    }
}
