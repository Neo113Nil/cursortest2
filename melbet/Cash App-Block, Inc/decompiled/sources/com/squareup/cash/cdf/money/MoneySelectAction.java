package com.squareup.cash.cdf.money;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class MoneySelectAction {
    public static final /* synthetic */ MoneySelectAction[] $VALUES;
    public static final MoneySelectAction SWIPE;
    public static final MoneySelectAction TAP;

    static {
        MoneySelectAction moneySelectAction = new MoneySelectAction("TAP", 0);
        TAP = moneySelectAction;
        MoneySelectAction moneySelectAction2 = new MoneySelectAction("SWIPE", 1);
        SWIPE = moneySelectAction2;
        $VALUES = new MoneySelectAction[]{moneySelectAction, moneySelectAction2};
    }

    public static MoneySelectAction valueOf(String str) {
        return (MoneySelectAction) Enum.valueOf(MoneySelectAction.class, str);
    }

    public static MoneySelectAction[] values() {
        return (MoneySelectAction[]) $VALUES.clone();
    }
}
