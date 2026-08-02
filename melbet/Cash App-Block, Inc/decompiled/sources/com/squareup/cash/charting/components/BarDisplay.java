package com.squareup.cash.charting.components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class BarDisplay {
    public static final /* synthetic */ BarDisplay[] $VALUES;
    public static final BarDisplay Default;
    public static final BarDisplay Focused;
    public static final BarDisplay Unfocused;

    static {
        BarDisplay barDisplay = new BarDisplay("Default", 0);
        Default = barDisplay;
        BarDisplay barDisplay2 = new BarDisplay("Focused", 1);
        Focused = barDisplay2;
        BarDisplay barDisplay3 = new BarDisplay("Unfocused", 2);
        Unfocused = barDisplay3;
        $VALUES = new BarDisplay[]{barDisplay, barDisplay2, barDisplay3};
    }

    public static BarDisplay valueOf(String str) {
        return (BarDisplay) Enum.valueOf(BarDisplay.class, str);
    }

    public static BarDisplay[] values() {
        return (BarDisplay[]) $VALUES.clone();
    }
}
