package com.squareup.cash.cdf.offline;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class TransactionType {
    public static final /* synthetic */ TransactionType[] $VALUES;
    public static final TransactionType CASH_IN;
    public static final TransactionType CASH_OUT;
    public static final TransactionType FIAT_PAYMENT;

    static {
        TransactionType transactionType = new TransactionType("FIAT_PAYMENT", 0);
        FIAT_PAYMENT = transactionType;
        TransactionType transactionType2 = new TransactionType("FIAT_PAYMENT_PERSONALIZED", 1);
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
