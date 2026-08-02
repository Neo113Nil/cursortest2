package com.squareup.cash.cdf.personalprofile;

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
public final class PersonalProfileManageAddAccount implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final AccountType account_type;
    public final String flow_token;
    public final LinkedHashMap parameters;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class AccountType {
        public static final /* synthetic */ AccountType[] $VALUES;
        public static final AccountType BUSINESS;
        public static final AccountType PERSONAL;

        static {
            AccountType accountType = new AccountType("BUSINESS", 0);
            BUSINESS = accountType;
            AccountType accountType2 = new AccountType("PERSONAL", 1);
            PERSONAL = accountType2;
            $VALUES = new AccountType[]{accountType, accountType2};
        }

        public static AccountType valueOf(String str) {
            return (AccountType) Enum.valueOf(AccountType.class, str);
        }

        public static AccountType[] values() {
            return (AccountType[]) $VALUES.clone();
        }
    }

    public PersonalProfileManageAddAccount(String str, AccountType accountType) {
        this.flow_token = str;
        this.account_type = accountType;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "PersonalProfile", "cdf_action", "Manage");
        Countries.putSafe(m, "flow_token", str);
        Countries.putSafe(m, "account_type", accountType);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PersonalProfileManageAddAccount)) {
            return false;
        }
        PersonalProfileManageAddAccount personalProfileManageAddAccount = (PersonalProfileManageAddAccount) obj;
        return Intrinsics.areEqual(this.flow_token, personalProfileManageAddAccount.flow_token) && this.account_type == personalProfileManageAddAccount.account_type;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "PersonalProfile Manage AddAccount";
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
        return "PersonalProfileManageAddAccount(flow_token=" + this.flow_token + ", account_type=" + this.account_type + ")";
    }
}
