package com.squareup.cash.cdf.account;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class AccountSwitchSource {
    public static final /* synthetic */ AccountSwitchSource[] $VALUES;
    public static final AccountSwitchSource ACCOUNT_CREATION_FLOW;
    public static final AccountSwitchSource ACCOUNT_SWITCH_FLOW;

    static {
        AccountSwitchSource accountSwitchSource = new AccountSwitchSource("ACCOUNT_SWITCH_FLOW", 0);
        ACCOUNT_SWITCH_FLOW = accountSwitchSource;
        AccountSwitchSource accountSwitchSource2 = new AccountSwitchSource("ACCOUNT_CREATION_FLOW", 1);
        ACCOUNT_CREATION_FLOW = accountSwitchSource2;
        $VALUES = new AccountSwitchSource[]{accountSwitchSource, accountSwitchSource2};
    }

    public static AccountSwitchSource valueOf(String str) {
        return (AccountSwitchSource) Enum.valueOf(AccountSwitchSource.class, str);
    }

    public static AccountSwitchSource[] values() {
        return (AccountSwitchSource[]) $VALUES.clone();
    }
}
