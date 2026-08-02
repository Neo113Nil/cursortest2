package com.squareup.cash.cdf.browser;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class InfoContext {
    public static final /* synthetic */ InfoContext[] $VALUES;
    public static final InfoContext AffiliateBoost;
    public static final InfoContext AfterPay;
    public static final InfoContext CashAppPay;
    public static final InfoContext SingleUseCardPayinFour;

    static {
        InfoContext infoContext = new InfoContext("AffiliateBoost", 0);
        AffiliateBoost = infoContext;
        InfoContext infoContext2 = new InfoContext("AfterPay", 1);
        AfterPay = infoContext2;
        InfoContext infoContext3 = new InfoContext("CashAppPay", 2);
        CashAppPay = infoContext3;
        InfoContext infoContext4 = new InfoContext("SingleUseCardPayinFour", 3);
        SingleUseCardPayinFour = infoContext4;
        $VALUES = new InfoContext[]{infoContext, infoContext2, infoContext3, infoContext4, new InfoContext("SquareOnline", 4)};
    }

    public static InfoContext valueOf(String str) {
        return (InfoContext) Enum.valueOf(InfoContext.class, str);
    }

    public static InfoContext[] values() {
        return (InfoContext[]) $VALUES.clone();
    }
}
