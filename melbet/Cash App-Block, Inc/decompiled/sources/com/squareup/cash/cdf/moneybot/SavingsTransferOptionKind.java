package com.squareup.cash.cdf.moneybot;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class SavingsTransferOptionKind {
    public static final /* synthetic */ SavingsTransferOptionKind[] $VALUES;
    public static final SavingsTransferOptionKind CASH_BALANCE;
    public static final SavingsTransferOptionKind GENERAL_SAVINGS;
    public static final SavingsTransferOptionKind LINKED_DEBIT;
    public static final SavingsTransferOptionKind SAVINGS_GOAL;

    static {
        SavingsTransferOptionKind savingsTransferOptionKind = new SavingsTransferOptionKind("CASH_BALANCE", 0);
        CASH_BALANCE = savingsTransferOptionKind;
        SavingsTransferOptionKind savingsTransferOptionKind2 = new SavingsTransferOptionKind("LINKED_DEBIT", 1);
        LINKED_DEBIT = savingsTransferOptionKind2;
        SavingsTransferOptionKind savingsTransferOptionKind3 = new SavingsTransferOptionKind("GENERAL_SAVINGS", 2);
        GENERAL_SAVINGS = savingsTransferOptionKind3;
        SavingsTransferOptionKind savingsTransferOptionKind4 = new SavingsTransferOptionKind("SAVINGS_GOAL", 3);
        SAVINGS_GOAL = savingsTransferOptionKind4;
        $VALUES = new SavingsTransferOptionKind[]{savingsTransferOptionKind, savingsTransferOptionKind2, savingsTransferOptionKind3, savingsTransferOptionKind4};
    }

    public static SavingsTransferOptionKind valueOf(String str) {
        return (SavingsTransferOptionKind) Enum.valueOf(SavingsTransferOptionKind.class, str);
    }

    public static SavingsTransferOptionKind[] values() {
        return (SavingsTransferOptionKind[]) $VALUES.clone();
    }
}
