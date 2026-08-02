package com.squareup.cash.banking.navigation.api;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class BankingOutboundNavigator$BalanceBasedAddCashIntent {
    public static final /* synthetic */ BankingOutboundNavigator$BalanceBasedAddCashIntent[] $VALUES;
    public static final BankingOutboundNavigator$BalanceBasedAddCashIntent EDIT_INCREMENT_AMOUNT;
    public static final BankingOutboundNavigator$BalanceBasedAddCashIntent EDIT_MINIMUM_BALANCE;
    public static final BankingOutboundNavigator$BalanceBasedAddCashIntent ENABLE;

    static {
        BankingOutboundNavigator$BalanceBasedAddCashIntent bankingOutboundNavigator$BalanceBasedAddCashIntent = new BankingOutboundNavigator$BalanceBasedAddCashIntent("ENABLE", 0);
        ENABLE = bankingOutboundNavigator$BalanceBasedAddCashIntent;
        BankingOutboundNavigator$BalanceBasedAddCashIntent bankingOutboundNavigator$BalanceBasedAddCashIntent2 = new BankingOutboundNavigator$BalanceBasedAddCashIntent("EDIT_MINIMUM_BALANCE", 1);
        EDIT_MINIMUM_BALANCE = bankingOutboundNavigator$BalanceBasedAddCashIntent2;
        BankingOutboundNavigator$BalanceBasedAddCashIntent bankingOutboundNavigator$BalanceBasedAddCashIntent3 = new BankingOutboundNavigator$BalanceBasedAddCashIntent("EDIT_INCREMENT_AMOUNT", 2);
        EDIT_INCREMENT_AMOUNT = bankingOutboundNavigator$BalanceBasedAddCashIntent3;
        $VALUES = new BankingOutboundNavigator$BalanceBasedAddCashIntent[]{bankingOutboundNavigator$BalanceBasedAddCashIntent, bankingOutboundNavigator$BalanceBasedAddCashIntent2, bankingOutboundNavigator$BalanceBasedAddCashIntent3};
    }

    public static BankingOutboundNavigator$BalanceBasedAddCashIntent valueOf(String str) {
        return (BankingOutboundNavigator$BalanceBasedAddCashIntent) Enum.valueOf(BankingOutboundNavigator$BalanceBasedAddCashIntent.class, str);
    }

    public static BankingOutboundNavigator$BalanceBasedAddCashIntent[] values() {
        return (BankingOutboundNavigator$BalanceBasedAddCashIntent[]) $VALUES.clone();
    }
}
