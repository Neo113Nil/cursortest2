package com.squareup.cash.cdf.account;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class AccountReturningLoginAccountPickerShown implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final int number_of_accounts;
    public final LinkedHashMap parameters;

    public AccountReturningLoginAccountPickerShown(int i) {
        this.number_of_accounts = i;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "Account", "cdf_action", "ReturningLogin");
        Countries.putSafe(m, "number_of_accounts", Integer.valueOf(i));
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AccountReturningLoginAccountPickerShown) && this.number_of_accounts == ((AccountReturningLoginAccountPickerShown) obj).number_of_accounts;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Account ReturningLogin AccountPickerShown";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return Integer.hashCode(this.number_of_accounts);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.number_of_accounts, "AccountReturningLoginAccountPickerShown(number_of_accounts=", ")");
    }
}
