package com.squareup.cash.money.analytics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class MoneyAnalyticsService$Companion$Source {
    public static final /* synthetic */ MoneyAnalyticsService$Companion$Source[] $VALUES;
    public static final MoneyAnalyticsService$Companion$Source APP_LAUNCH;
    public static final MoneyAnalyticsService$Companion$Source TAB_BAR_BUTTON;

    static {
        MoneyAnalyticsService$Companion$Source moneyAnalyticsService$Companion$Source = new MoneyAnalyticsService$Companion$Source("TAB_BAR_BUTTON", 0);
        TAB_BAR_BUTTON = moneyAnalyticsService$Companion$Source;
        MoneyAnalyticsService$Companion$Source moneyAnalyticsService$Companion$Source2 = new MoneyAnalyticsService$Companion$Source("CLIENT_ROUTE", 1);
        MoneyAnalyticsService$Companion$Source moneyAnalyticsService$Companion$Source3 = new MoneyAnalyticsService$Companion$Source("APP_LAUNCH", 2);
        APP_LAUNCH = moneyAnalyticsService$Companion$Source3;
        $VALUES = new MoneyAnalyticsService$Companion$Source[]{moneyAnalyticsService$Companion$Source, moneyAnalyticsService$Companion$Source2, moneyAnalyticsService$Companion$Source3, new MoneyAnalyticsService$Companion$Source("BACK_NAVIGATION", 3)};
    }

    public static MoneyAnalyticsService$Companion$Source valueOf(String str) {
        return (MoneyAnalyticsService$Companion$Source) Enum.valueOf(MoneyAnalyticsService$Companion$Source.class, str);
    }

    public static MoneyAnalyticsService$Companion$Source[] values() {
        return (MoneyAnalyticsService$Companion$Source[]) $VALUES.clone();
    }
}
