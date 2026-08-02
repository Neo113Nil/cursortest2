package com.squareup.cash.account.backend;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class AccountSwitcher$AccountSwitchInitiationSource {
    public static final /* synthetic */ AccountSwitcher$AccountSwitchInitiationSource[] $VALUES;
    public static final AccountSwitcher$AccountSwitchInitiationSource ACCOUNT_SWITCHER;
    public static final AccountSwitcher$AccountSwitchInitiationSource CLIENT_ROUTE;
    public static final AccountSwitcher$AccountSwitchInitiationSource FAMILIES;
    public static final AccountSwitcher$AccountSwitchInitiationSource MANAGED_ACCOUNT_BACK;
    public static final AccountSwitcher$AccountSwitchInitiationSource UNKNOWN;

    static {
        AccountSwitcher$AccountSwitchInitiationSource accountSwitcher$AccountSwitchInitiationSource = new AccountSwitcher$AccountSwitchInitiationSource("ACCOUNT_SWITCHER", 0);
        ACCOUNT_SWITCHER = accountSwitcher$AccountSwitchInitiationSource;
        AccountSwitcher$AccountSwitchInitiationSource accountSwitcher$AccountSwitchInitiationSource2 = new AccountSwitcher$AccountSwitchInitiationSource("CLIENT_ROUTE", 1);
        CLIENT_ROUTE = accountSwitcher$AccountSwitchInitiationSource2;
        AccountSwitcher$AccountSwitchInitiationSource accountSwitcher$AccountSwitchInitiationSource3 = new AccountSwitcher$AccountSwitchInitiationSource("FAMILIES", 2);
        FAMILIES = accountSwitcher$AccountSwitchInitiationSource3;
        AccountSwitcher$AccountSwitchInitiationSource accountSwitcher$AccountSwitchInitiationSource4 = new AccountSwitcher$AccountSwitchInitiationSource("MANAGED_ACCOUNT_BACK", 3);
        MANAGED_ACCOUNT_BACK = accountSwitcher$AccountSwitchInitiationSource4;
        AccountSwitcher$AccountSwitchInitiationSource accountSwitcher$AccountSwitchInitiationSource5 = new AccountSwitcher$AccountSwitchInitiationSource("UNKNOWN", 4);
        UNKNOWN = accountSwitcher$AccountSwitchInitiationSource5;
        $VALUES = new AccountSwitcher$AccountSwitchInitiationSource[]{accountSwitcher$AccountSwitchInitiationSource, accountSwitcher$AccountSwitchInitiationSource2, accountSwitcher$AccountSwitchInitiationSource3, accountSwitcher$AccountSwitchInitiationSource4, accountSwitcher$AccountSwitchInitiationSource5};
    }

    public static AccountSwitcher$AccountSwitchInitiationSource valueOf(String str) {
        return (AccountSwitcher$AccountSwitchInitiationSource) Enum.valueOf(AccountSwitcher$AccountSwitchInitiationSource.class, str);
    }

    public static AccountSwitcher$AccountSwitchInitiationSource[] values() {
        return (AccountSwitcher$AccountSwitchInitiationSource[]) $VALUES.clone();
    }
}
