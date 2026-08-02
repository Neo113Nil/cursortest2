package com.squareup.cash.account.backend;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class AccountSwitcher$AccountSwitchType {
    public static final /* synthetic */ AccountSwitcher$AccountSwitchType[] $VALUES;
    public static final AccountSwitcher$AccountSwitchType BACK_TO_SPONSOR;
    public static final AccountSwitcher$AccountSwitchType REGULAR;
    public static final AccountSwitcher$AccountSwitchType TO_MANAGED_ACCOUNT;

    static {
        AccountSwitcher$AccountSwitchType accountSwitcher$AccountSwitchType = new AccountSwitcher$AccountSwitchType("TO_MANAGED_ACCOUNT", 0);
        TO_MANAGED_ACCOUNT = accountSwitcher$AccountSwitchType;
        AccountSwitcher$AccountSwitchType accountSwitcher$AccountSwitchType2 = new AccountSwitcher$AccountSwitchType("BACK_TO_SPONSOR", 1);
        BACK_TO_SPONSOR = accountSwitcher$AccountSwitchType2;
        AccountSwitcher$AccountSwitchType accountSwitcher$AccountSwitchType3 = new AccountSwitcher$AccountSwitchType("REGULAR", 2);
        REGULAR = accountSwitcher$AccountSwitchType3;
        $VALUES = new AccountSwitcher$AccountSwitchType[]{accountSwitcher$AccountSwitchType, accountSwitcher$AccountSwitchType2, accountSwitcher$AccountSwitchType3};
    }

    public static AccountSwitcher$AccountSwitchType valueOf(String str) {
        return (AccountSwitcher$AccountSwitchType) Enum.valueOf(AccountSwitcher$AccountSwitchType.class, str);
    }

    public static AccountSwitcher$AccountSwitchType[] values() {
        return (AccountSwitcher$AccountSwitchType[]) $VALUES.clone();
    }
}
