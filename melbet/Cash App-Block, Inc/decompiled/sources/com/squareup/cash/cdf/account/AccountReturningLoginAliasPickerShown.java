package com.squareup.cash.cdf.account;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class AccountReturningLoginAliasPickerShown implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final int number_of_aliases;
    public final LinkedHashMap parameters;
    public final boolean preferred_alias_exists;

    public AccountReturningLoginAliasPickerShown(int i, boolean z) {
        this.number_of_aliases = i;
        this.preferred_alias_exists = z;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "Account", "cdf_action", "ReturningLogin");
        Countries.putSafe(m, "number_of_aliases", Integer.valueOf(i));
        Countries.putSafe(m, "preferred_alias_exists", Boolean.valueOf(z));
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountReturningLoginAliasPickerShown)) {
            return false;
        }
        AccountReturningLoginAliasPickerShown accountReturningLoginAliasPickerShown = (AccountReturningLoginAliasPickerShown) obj;
        return this.number_of_aliases == accountReturningLoginAliasPickerShown.number_of_aliases && this.preferred_alias_exists == accountReturningLoginAliasPickerShown.preferred_alias_exists;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Account ReturningLogin AliasPickerShown";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.preferred_alias_exists) + (Integer.hashCode(this.number_of_aliases) * 31);
    }

    public final String toString() {
        return "AccountReturningLoginAliasPickerShown(number_of_aliases=" + this.number_of_aliases + ", preferred_alias_exists=" + this.preferred_alias_exists + ")";
    }
}
