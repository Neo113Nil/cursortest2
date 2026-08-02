package com.squareup.cash.cdf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class TransactionType {
    public static final /* synthetic */ TransactionType[] $VALUES;
    public static final TransactionType CASH_IN;
    public static final TransactionType CASH_OUT;
    public static final TransactionType SAVINGS_INTEREST;
    public static final TransactionType SAVINGS_INTEREST_ESTIMATED;

    static {
        TransactionType transactionType = new TransactionType("SAVINGS_INTEREST", 0);
        SAVINGS_INTEREST = transactionType;
        TransactionType transactionType2 = new TransactionType("SAVINGS_INTEREST_ESTIMATED", 1);
        SAVINGS_INTEREST_ESTIMATED = transactionType2;
        TransactionType transactionType3 = new TransactionType("CASH_IN", 2);
        CASH_IN = transactionType3;
        TransactionType transactionType4 = new TransactionType("CASH_OUT", 3);
        CASH_OUT = transactionType4;
        $VALUES = new TransactionType[]{transactionType, transactionType2, transactionType3, transactionType4};
    }

    public static TransactionType valueOf(String str) {
        return (TransactionType) Enum.valueOf(TransactionType.class, str);
    }

    public static TransactionType[] values() {
        return (TransactionType[]) $VALUES.clone();
    }
}
