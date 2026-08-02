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
public final class AccountLinkAutofill implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final AliasType alias_type;
    public final String flow_token;
    public final LinkedHashMap parameters;

    public AccountLinkAutofill(AliasType aliasType, String str) {
        this.flow_token = str;
        this.alias_type = aliasType;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "Account", "cdf_action", "Link");
        Countries.putSafe(m, "flow_token", str);
        Countries.putSafe(m, "alias_type", aliasType);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountLinkAutofill)) {
            return false;
        }
        AccountLinkAutofill accountLinkAutofill = (AccountLinkAutofill) obj;
        return Intrinsics.areEqual(this.flow_token, accountLinkAutofill.flow_token) && this.alias_type == accountLinkAutofill.alias_type;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Account Link Autofill";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.flow_token;
        return this.alias_type.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "AccountLinkAutofill(flow_token=" + this.flow_token + ", alias_type=" + this.alias_type + ")";
    }
}
