package com.squareup.cash.cdf.prepurchasecard;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class ToggleState {
    public static final /* synthetic */ ToggleState[] $VALUES;
    public static final ToggleState DIMMED;
    public static final ToggleState TURNED_OFF;
    public static final ToggleState TURNED_ON;

    static {
        ToggleState toggleState = new ToggleState("TURNED_ON", 0);
        TURNED_ON = toggleState;
        ToggleState toggleState2 = new ToggleState("TURNED_OFF", 1);
        TURNED_OFF = toggleState2;
        ToggleState toggleState3 = new ToggleState("DIMMED", 2);
        DIMMED = toggleState3;
        $VALUES = new ToggleState[]{toggleState, toggleState2, toggleState3};
    }

    public static ToggleState valueOf(String str) {
        return (ToggleState) Enum.valueOf(ToggleState.class, str);
    }

    public static ToggleState[] values() {
        return (ToggleState[]) $VALUES.clone();
    }
}
