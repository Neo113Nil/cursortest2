package com.squareup.cash.cdf.cashcard;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class CashCardTabError implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final LinkedHashMap parameters;
    public final Integer retry_count;

    public CashCardTabError(Integer num) {
        this.retry_count = num;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "CashCard", "cdf_action", "Tab");
        Countries.putSafe(m, "retry_count", num);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CashCardTabError) && this.retry_count.equals(((CashCardTabError) obj).retry_count);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "CashCard Tab Error";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.retry_count.hashCode();
    }

    public final String toString() {
        return "CashCardTabError(retry_count=" + this.retry_count + ")";
    }
}
