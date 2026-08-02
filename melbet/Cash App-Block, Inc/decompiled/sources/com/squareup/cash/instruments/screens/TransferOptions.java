package com.squareup.cash.instruments.screens;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class TransferOptions {
    public static final /* synthetic */ TransferOptions[] $VALUES;
    public static final TransferOptions BankAccount;
    public static final TransferOptions CashBalance;
    public static final TransferOptions CreditCard;
    public static final TransferOptions DebitCard;
    public static final TransferOptions LinkDebit;
    public static final TransferOptions SavingsGeneral;
    public static final TransferOptions SavingsGoal;

    static {
        TransferOptions transferOptions = new TransferOptions("CashBalance", 0);
        CashBalance = transferOptions;
        TransferOptions transferOptions2 = new TransferOptions("SavingsGoal", 1);
        SavingsGoal = transferOptions2;
        TransferOptions transferOptions3 = new TransferOptions("SavingsGeneral", 2);
        SavingsGeneral = transferOptions3;
        TransferOptions transferOptions4 = new TransferOptions("DebitCard", 3);
        DebitCard = transferOptions4;
        TransferOptions transferOptions5 = new TransferOptions("CreditCard", 4);
        CreditCard = transferOptions5;
        TransferOptions transferOptions6 = new TransferOptions("BankAccount", 5);
        BankAccount = transferOptions6;
        TransferOptions transferOptions7 = new TransferOptions("LinkDebit", 6);
        LinkDebit = transferOptions7;
        $VALUES = new TransferOptions[]{transferOptions, transferOptions2, transferOptions3, transferOptions4, transferOptions5, transferOptions6, transferOptions7};
    }

    public static TransferOptions valueOf(String str) {
        return (TransferOptions) Enum.valueOf(TransferOptions.class, str);
    }

    public static TransferOptions[] values() {
        return (TransferOptions[]) $VALUES.clone();
    }
}
