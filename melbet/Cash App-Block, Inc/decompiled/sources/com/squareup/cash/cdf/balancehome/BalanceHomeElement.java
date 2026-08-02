package com.squareup.cash.cdf.balancehome;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class BalanceHomeElement {
    public static final /* synthetic */ BalanceHomeElement[] $VALUES;
    public static final BalanceHomeElement AccountAndRoutingFooter;
    public static final BalanceHomeElement BankingDetailsLearnMore;
    public static final BalanceHomeElement CopyAccountNumberButton;
    public static final BalanceHomeElement CopyRoutingNumberButton;
    public static final BalanceHomeElement Disclosure;
    public static final BalanceHomeElement OverdraftManageRow;

    static {
        BalanceHomeElement balanceHomeElement = new BalanceHomeElement("CopyAccountNumberButton", 0);
        CopyAccountNumberButton = balanceHomeElement;
        BalanceHomeElement balanceHomeElement2 = new BalanceHomeElement("CopyRoutingNumberButton", 1);
        CopyRoutingNumberButton = balanceHomeElement2;
        BalanceHomeElement balanceHomeElement3 = new BalanceHomeElement("AccountAndRoutingFooter", 2);
        AccountAndRoutingFooter = balanceHomeElement3;
        BalanceHomeElement balanceHomeElement4 = new BalanceHomeElement("Disclosure", 3);
        Disclosure = balanceHomeElement4;
        BalanceHomeElement balanceHomeElement5 = new BalanceHomeElement("OverdraftManageRow", 4);
        OverdraftManageRow = balanceHomeElement5;
        BalanceHomeElement balanceHomeElement6 = new BalanceHomeElement("BankingDetailsLearnMore", 5);
        BankingDetailsLearnMore = balanceHomeElement6;
        $VALUES = new BalanceHomeElement[]{balanceHomeElement, balanceHomeElement2, balanceHomeElement3, balanceHomeElement4, balanceHomeElement5, balanceHomeElement6};
    }

    public static BalanceHomeElement valueOf(String str) {
        return (BalanceHomeElement) Enum.valueOf(BalanceHomeElement.class, str);
    }

    public static BalanceHomeElement[] values() {
        return (BalanceHomeElement[]) $VALUES.clone();
    }
}
