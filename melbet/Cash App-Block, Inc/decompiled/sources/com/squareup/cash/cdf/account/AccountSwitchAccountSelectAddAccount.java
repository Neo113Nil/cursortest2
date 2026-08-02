package com.squareup.cash.cdf.account;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class AccountSwitchAccountSelectAddAccount implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final AccountType account_type;
    public final String flow_token;
    public final LinkedHashMap parameters;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class AccountType {
        public static final /* synthetic */ AccountType[] $VALUES;
        public static final AccountType BUSINESS;
        public static final AccountType LINK_EXISTING;
        public static final AccountType PERSONAL;

        static {
            AccountType accountType = new AccountType("BUSINESS", 0);
            BUSINESS = accountType;
            AccountType accountType2 = new AccountType("PERSONAL", 1);
            PERSONAL = accountType2;
            AccountType accountType3 = new AccountType("LINK_EXISTING", 2);
            LINK_EXISTING = accountType3;
            $VALUES = new AccountType[]{accountType, accountType2, accountType3};
        }

        public static AccountType valueOf(String str) {
            return (AccountType) Enum.valueOf(AccountType.class, str);
        }

        public static AccountType[] values() {
            return (AccountType[]) $VALUES.clone();
        }
    }

    public AccountSwitchAccountSelectAddAccount(String str, AccountType accountType) {
        this.flow_token = str;
        this.account_type = accountType;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "Account", "cdf_action", "SwitchAccount");
        Countries.putSafe(m, "flow_token", str);
        Countries.putSafe(m, "account_type", accountType);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountSwitchAccountSelectAddAccount)) {
            return false;
        }
        AccountSwitchAccountSelectAddAccount accountSwitchAccountSelectAddAccount = (AccountSwitchAccountSelectAddAccount) obj;
        return Intrinsics.areEqual(this.flow_token, accountSwitchAccountSelectAddAccount.flow_token) && this.account_type == accountSwitchAccountSelectAddAccount.account_type;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Account SwitchAccount SelectAddAccount";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.flow_token;
        return this.account_type.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "AccountSwitchAccountSelectAddAccount(flow_token=" + this.flow_token + ", account_type=" + this.account_type + ")";
    }
}
