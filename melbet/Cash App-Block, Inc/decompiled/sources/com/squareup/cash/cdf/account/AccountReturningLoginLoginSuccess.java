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

/* loaded from: classes6.dex */
public final class AccountReturningLoginLoginSuccess implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final AliasType alias_type;
    public final String flow_token;
    public final LinkedHashMap parameters;

    public AccountReturningLoginLoginSuccess(AliasType aliasType, String str) {
        this.alias_type = aliasType;
        this.flow_token = str;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "Account", "cdf_action", "ReturningLogin");
        Countries.putSafe(m, "alias_type", aliasType);
        Countries.putSafe(m, "flow_token", str);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountReturningLoginLoginSuccess)) {
            return false;
        }
        AccountReturningLoginLoginSuccess accountReturningLoginLoginSuccess = (AccountReturningLoginLoginSuccess) obj;
        return this.alias_type == accountReturningLoginLoginSuccess.alias_type && this.flow_token.equals(accountReturningLoginLoginSuccess.flow_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Account ReturningLogin LoginSuccess";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.flow_token.hashCode() + (this.alias_type.hashCode() * 31);
    }

    public final String toString() {
        return "AccountReturningLoginLoginSuccess(alias_type=" + this.alias_type + ", flow_token=" + this.flow_token + ")";
    }
}
