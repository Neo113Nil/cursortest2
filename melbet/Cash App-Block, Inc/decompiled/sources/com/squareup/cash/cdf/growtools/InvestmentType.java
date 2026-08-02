package com.squareup.cash.cdf.growtools;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class InvestmentType {
    public static final /* synthetic */ InvestmentType[] $VALUES;
    public static final InvestmentType AUTO_INVEST;
    public static final InvestmentType AUTO_WITHDRAW;
    public static final InvestmentType DIRECT_DEPOSIT;
    public static final InvestmentType P2P_PAYMENT;
    public static final InvestmentType ROUND_UPS;

    static {
        InvestmentType investmentType = new InvestmentType("ROUND_UPS", 0);
        ROUND_UPS = investmentType;
        InvestmentType investmentType2 = new InvestmentType("AUTO_INVEST", 1);
        AUTO_INVEST = investmentType2;
        InvestmentType investmentType3 = new InvestmentType("DIRECT_DEPOSIT", 2);
        DIRECT_DEPOSIT = investmentType3;
        InvestmentType investmentType4 = new InvestmentType("P2P_PAYMENT", 3);
        P2P_PAYMENT = investmentType4;
        InvestmentType investmentType5 = new InvestmentType("AUTO_WITHDRAW", 4);
        AUTO_WITHDRAW = investmentType5;
        $VALUES = new InvestmentType[]{investmentType, investmentType2, investmentType3, investmentType4, investmentType5};
    }

    public static InvestmentType valueOf(String str) {
        return (InvestmentType) Enum.valueOf(InvestmentType.class, str);
    }

    public static InvestmentType[] values() {
        return (InvestmentType[]) $VALUES.clone();
    }
}
