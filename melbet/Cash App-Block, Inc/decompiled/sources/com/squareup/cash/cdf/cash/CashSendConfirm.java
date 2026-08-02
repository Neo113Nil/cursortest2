package com.squareup.cash.cdf.cash;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class CashSendConfirm implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Boolean is_duplicate;
    public final LinkedHashMap parameters;

    public CashSendConfirm(Boolean bool) {
        this.is_duplicate = bool;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "Cash", "cdf_action", "Send");
        Countries.putSafe(m, "is_duplicate", bool);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CashSendConfirm) && this.is_duplicate.equals(((CashSendConfirm) obj).is_duplicate);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Cash Send Confirm";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.is_duplicate.hashCode();
    }

    public final String toString() {
        return Matcher$$ExternalSyntheticOutline0.m(this.is_duplicate, "CashSendConfirm(is_duplicate=", ")");
    }
}
