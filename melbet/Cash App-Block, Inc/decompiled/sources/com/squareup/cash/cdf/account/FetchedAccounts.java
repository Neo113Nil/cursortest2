package com.squareup.cash.cdf.account;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class FetchedAccounts {
    public static final /* synthetic */ FetchedAccounts[] $VALUES;
    public static final FetchedAccounts ALREADY_IN_TARGET_ACCOUNT;
    public static final FetchedAccounts FOUND_TARGET_ACCOUNT;
    public static final FetchedAccounts TARGET_ACCOUNT_NOT_FOUND;

    static {
        FetchedAccounts fetchedAccounts = new FetchedAccounts("FOUND_TARGET_ACCOUNT", 0);
        FOUND_TARGET_ACCOUNT = fetchedAccounts;
        FetchedAccounts fetchedAccounts2 = new FetchedAccounts("ALREADY_IN_TARGET_ACCOUNT", 1);
        ALREADY_IN_TARGET_ACCOUNT = fetchedAccounts2;
        FetchedAccounts fetchedAccounts3 = new FetchedAccounts("TARGET_ACCOUNT_NOT_FOUND", 2);
        TARGET_ACCOUNT_NOT_FOUND = fetchedAccounts3;
        $VALUES = new FetchedAccounts[]{fetchedAccounts, fetchedAccounts2, fetchedAccounts3, new FetchedAccounts("NO_ACCOUNTS_FOUND", 3)};
    }

    public static FetchedAccounts valueOf(String str) {
        return (FetchedAccounts) Enum.valueOf(FetchedAccounts.class, str);
    }

    public static FetchedAccounts[] values() {
        return (FetchedAccounts[]) $VALUES.clone();
    }
}
