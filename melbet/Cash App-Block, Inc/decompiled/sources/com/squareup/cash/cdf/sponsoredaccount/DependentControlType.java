package com.squareup.cash.cdf.sponsoredaccount;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class DependentControlType {
    public static final /* synthetic */ DependentControlType[] $VALUES;
    public static final DependentControlType BitcoinInvesting;
    public static final DependentControlType CashCard;
    public static final DependentControlType CashTag;
    public static final DependentControlType P2PTransactions;
    public static final DependentControlType Promotions;
    public static final DependentControlType RealTimeNotifications;
    public static final DependentControlType StockInvesting;

    static {
        DependentControlType dependentControlType = new DependentControlType("BitcoinInvesting", 0);
        BitcoinInvesting = dependentControlType;
        DependentControlType dependentControlType2 = new DependentControlType("CashCard", 1);
        CashCard = dependentControlType2;
        DependentControlType dependentControlType3 = new DependentControlType("P2PTransactions", 2);
        P2PTransactions = dependentControlType3;
        DependentControlType dependentControlType4 = new DependentControlType("RealTimeNotifications", 3);
        RealTimeNotifications = dependentControlType4;
        DependentControlType dependentControlType5 = new DependentControlType("StockInvesting", 4);
        StockInvesting = dependentControlType5;
        DependentControlType dependentControlType6 = new DependentControlType("Promotions", 5);
        Promotions = dependentControlType6;
        DependentControlType dependentControlType7 = new DependentControlType("CashTag", 6);
        CashTag = dependentControlType7;
        $VALUES = new DependentControlType[]{dependentControlType, dependentControlType2, dependentControlType3, dependentControlType4, dependentControlType5, dependentControlType6, dependentControlType7};
    }

    public static DependentControlType valueOf(String str) {
        return (DependentControlType) Enum.valueOf(DependentControlType.class, str);
    }

    public static DependentControlType[] values() {
        return (DependentControlType[]) $VALUES.clone();
    }
}
