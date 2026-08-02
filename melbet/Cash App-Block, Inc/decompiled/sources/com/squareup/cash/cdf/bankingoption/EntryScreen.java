package com.squareup.cash.cdf.bankingoption;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class EntryScreen {
    public static final /* synthetic */ EntryScreen[] $VALUES;
    public static final EntryScreen BalanceHome;
    public static final EntryScreen MoneyTab;

    static {
        EntryScreen entryScreen = new EntryScreen("MoneyTab", 0);
        MoneyTab = entryScreen;
        EntryScreen entryScreen2 = new EntryScreen("BalanceHome", 1);
        BalanceHome = entryScreen2;
        $VALUES = new EntryScreen[]{entryScreen, entryScreen2, new EntryScreen("AddMoneyBottomSheet", 2)};
    }

    public static EntryScreen valueOf(String str) {
        return (EntryScreen) Enum.valueOf(EntryScreen.class, str);
    }

    public static EntryScreen[] values() {
        return (EntryScreen[]) $VALUES.clone();
    }
}
