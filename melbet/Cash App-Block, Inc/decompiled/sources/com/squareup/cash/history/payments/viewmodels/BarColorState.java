package com.squareup.cash.history.payments.viewmodels;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class BarColorState {
    public static final /* synthetic */ BarColorState[] $VALUES;
    public static final BarColorState DEFAULT;
    public static final BarColorState DISABLED;
    public static final BarColorState MORE_RECEIVED;
    public static final BarColorState MORE_SENT;
    public static final BarColorState ONLY_RECEIVED;
    public static final BarColorState ONLY_SENT;

    static {
        BarColorState barColorState = new BarColorState("DEFAULT", 0);
        DEFAULT = barColorState;
        BarColorState barColorState2 = new BarColorState("DISABLED", 1);
        DISABLED = barColorState2;
        BarColorState barColorState3 = new BarColorState("ONLY_SENT", 2);
        ONLY_SENT = barColorState3;
        BarColorState barColorState4 = new BarColorState("ONLY_RECEIVED", 3);
        ONLY_RECEIVED = barColorState4;
        BarColorState barColorState5 = new BarColorState("MORE_SENT", 4);
        MORE_SENT = barColorState5;
        BarColorState barColorState6 = new BarColorState("MORE_RECEIVED", 5);
        MORE_RECEIVED = barColorState6;
        $VALUES = new BarColorState[]{barColorState, barColorState2, barColorState3, barColorState4, barColorState5, barColorState6};
    }

    public static BarColorState valueOf(String str) {
        return (BarColorState) Enum.valueOf(BarColorState.class, str);
    }

    public static BarColorState[] values() {
        return (BarColorState[]) $VALUES.clone();
    }
}
