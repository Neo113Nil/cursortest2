package com.squareup.cash.cdf.account;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.AliasType;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class AccountSignInSwitchAliasEntryType implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final AliasType alias_type;
    public final String flow_token;
    public final LinkedHashMap parameters;

    public AccountSignInSwitchAliasEntryType(AliasType aliasType, String str) {
        this.alias_type = aliasType;
        this.flow_token = str;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "Account", "cdf_action", "SignIn");
        Countries.putSafe(m, "alias_type", aliasType);
        Countries.putSafe(m, "flow_token", str);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountSignInSwitchAliasEntryType)) {
            return false;
        }
        AccountSignInSwitchAliasEntryType accountSignInSwitchAliasEntryType = (AccountSignInSwitchAliasEntryType) obj;
        return this.alias_type == accountSignInSwitchAliasEntryType.alias_type && Intrinsics.areEqual(this.flow_token, accountSignInSwitchAliasEntryType.flow_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Account SignIn SwitchAliasEntryType";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        AliasType aliasType = this.alias_type;
        int hashCode = (aliasType == null ? 0 : aliasType.hashCode()) * 31;
        String str = this.flow_token;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "AccountSignInSwitchAliasEntryType(alias_type=" + this.alias_type + ", flow_token=" + this.flow_token + ")";
    }
}
