package com.squareup.cash.cdf.benefitleaflet;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class BenefitType {
    public static final /* synthetic */ BenefitType[] $VALUES;
    public static final BenefitType COVERED_PAPER_MONEY_DEPOSIT;
    public static final BenefitType CUSTOM_WEEKLY_OFFERS;
    public static final BenefitType FREE_OVERDRAFT_COVERAGE;
    public static final BenefitType GUARANTEED_ACCESS_TO_BORROW;
    public static final BenefitType HIGH_INTEREST_SAVINGS;
    public static final BenefitType INCREASED_BORROW_LIMIT;
    public static final BenefitType PRIORITY_PHONE_SUPPORT;
    public static final BenefitType REIMBURSED_ATM_FEES;
    public static final BenefitType UNSPECIFIED;

    static {
        BenefitType benefitType = new BenefitType("UNSPECIFIED", 0);
        UNSPECIFIED = benefitType;
        BenefitType benefitType2 = new BenefitType("FREE_OVERDRAFT_COVERAGE", 1);
        FREE_OVERDRAFT_COVERAGE = benefitType2;
        BenefitType benefitType3 = new BenefitType("HIGH_INTEREST_SAVINGS", 2);
        HIGH_INTEREST_SAVINGS = benefitType3;
        BenefitType benefitType4 = new BenefitType("PRIORITY_PHONE_SUPPORT", 3);
        PRIORITY_PHONE_SUPPORT = benefitType4;
        BenefitType benefitType5 = new BenefitType("REIMBURSED_ATM_FEES", 4);
        REIMBURSED_ATM_FEES = benefitType5;
        BenefitType benefitType6 = new BenefitType("COVERED_PAPER_MONEY_DEPOSIT", 5);
        COVERED_PAPER_MONEY_DEPOSIT = benefitType6;
        BenefitType benefitType7 = new BenefitType("GUARANTEED_ACCESS_TO_BORROW", 6);
        GUARANTEED_ACCESS_TO_BORROW = benefitType7;
        BenefitType benefitType8 = new BenefitType("INCREASED_BORROW_LIMIT", 7);
        INCREASED_BORROW_LIMIT = benefitType8;
        BenefitType benefitType9 = new BenefitType("CUSTOM_WEEKLY_OFFERS", 8);
        CUSTOM_WEEKLY_OFFERS = benefitType9;
        $VALUES = new BenefitType[]{benefitType, benefitType2, benefitType3, benefitType4, benefitType5, benefitType6, benefitType7, benefitType8, benefitType9};
    }

    public static BenefitType valueOf(String str) {
        return (BenefitType) Enum.valueOf(BenefitType.class, str);
    }

    public static BenefitType[] values() {
        return (BenefitType[]) $VALUES.clone();
    }
}
