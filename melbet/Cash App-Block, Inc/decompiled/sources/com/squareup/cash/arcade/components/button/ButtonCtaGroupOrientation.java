package com.squareup.cash.arcade.components.button;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ButtonCtaGroupOrientation {
    public static final /* synthetic */ ButtonCtaGroupOrientation[] $VALUES;
    public static final ButtonCtaGroupOrientation AUTOMATIC;
    public static final ButtonCtaGroupOrientation VERTICAL;

    static {
        ButtonCtaGroupOrientation buttonCtaGroupOrientation = new ButtonCtaGroupOrientation("AUTOMATIC", 0);
        AUTOMATIC = buttonCtaGroupOrientation;
        ButtonCtaGroupOrientation buttonCtaGroupOrientation2 = new ButtonCtaGroupOrientation("VERTICAL", 1);
        VERTICAL = buttonCtaGroupOrientation2;
        $VALUES = new ButtonCtaGroupOrientation[]{buttonCtaGroupOrientation, buttonCtaGroupOrientation2};
    }

    public static ButtonCtaGroupOrientation valueOf(String str) {
        return (ButtonCtaGroupOrientation) Enum.valueOf(ButtonCtaGroupOrientation.class, str);
    }

    public static ButtonCtaGroupOrientation[] values() {
        return (ButtonCtaGroupOrientation[]) $VALUES.clone();
    }
}
