package com.squareup.cash.cdf.money;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class MoneyViewSource {
    public static final /* synthetic */ MoneyViewSource[] $VALUES;
    public static final MoneyViewSource APP_LAUNCH;
    public static final MoneyViewSource BACK_NAVIGATION;
    public static final MoneyViewSource CLIENT_ROUTE;
    public static final MoneyViewSource TAB_BAR_BUTTON;

    static {
        MoneyViewSource moneyViewSource = new MoneyViewSource("TAB_BAR_BUTTON", 0);
        TAB_BAR_BUTTON = moneyViewSource;
        MoneyViewSource moneyViewSource2 = new MoneyViewSource("CLIENT_ROUTE", 1);
        CLIENT_ROUTE = moneyViewSource2;
        MoneyViewSource moneyViewSource3 = new MoneyViewSource("APP_LAUNCH", 2);
        APP_LAUNCH = moneyViewSource3;
        MoneyViewSource moneyViewSource4 = new MoneyViewSource("BACK_NAVIGATION", 3);
        BACK_NAVIGATION = moneyViewSource4;
        $VALUES = new MoneyViewSource[]{moneyViewSource, moneyViewSource2, moneyViewSource3, moneyViewSource4};
    }

    public static MoneyViewSource valueOf(String str) {
        return (MoneyViewSource) Enum.valueOf(MoneyViewSource.class, str);
    }

    public static MoneyViewSource[] values() {
        return (MoneyViewSource[]) $VALUES.clone();
    }
}
