package com.squareup.cash.arcade.components.button;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ButtonProminence {
    public static final /* synthetic */ ButtonProminence[] $VALUES;
    public static final ButtonProminence PROMINENT;
    public static final ButtonProminence STANDARD;
    public static final ButtonProminence SUBTLE;

    static {
        ButtonProminence buttonProminence = new ButtonProminence("STANDARD", 0);
        STANDARD = buttonProminence;
        ButtonProminence buttonProminence2 = new ButtonProminence("PROMINENT", 1);
        PROMINENT = buttonProminence2;
        ButtonProminence buttonProminence3 = new ButtonProminence("SUBTLE", 2);
        SUBTLE = buttonProminence3;
        $VALUES = new ButtonProminence[]{buttonProminence, buttonProminence2, buttonProminence3};
    }

    public static ButtonProminence valueOf(String str) {
        return (ButtonProminence) Enum.valueOf(ButtonProminence.class, str);
    }

    public static ButtonProminence[] values() {
        return (ButtonProminence[]) $VALUES.clone();
    }
}
