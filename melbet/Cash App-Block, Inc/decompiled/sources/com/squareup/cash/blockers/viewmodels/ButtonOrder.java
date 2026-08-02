package com.squareup.cash.blockers.viewmodels;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class ButtonOrder {
    public static final /* synthetic */ ButtonOrder[] $VALUES;
    public static final ButtonOrder PRIMARY_BUTTON_FIRST;
    public static final ButtonOrder SECONDARY_BUTTON_FIRST;
    public static final ButtonOrder SINGLE_BUTTON;

    static {
        ButtonOrder buttonOrder = new ButtonOrder("SINGLE_BUTTON", 0);
        SINGLE_BUTTON = buttonOrder;
        ButtonOrder buttonOrder2 = new ButtonOrder("PRIMARY_BUTTON_FIRST", 1);
        PRIMARY_BUTTON_FIRST = buttonOrder2;
        ButtonOrder buttonOrder3 = new ButtonOrder("SECONDARY_BUTTON_FIRST", 2);
        SECONDARY_BUTTON_FIRST = buttonOrder3;
        $VALUES = new ButtonOrder[]{buttonOrder, buttonOrder2, buttonOrder3};
    }

    public static ButtonOrder valueOf(String str) {
        return (ButtonOrder) Enum.valueOf(ButtonOrder.class, str);
    }

    public static ButtonOrder[] values() {
        return (ButtonOrder[]) $VALUES.clone();
    }
}
