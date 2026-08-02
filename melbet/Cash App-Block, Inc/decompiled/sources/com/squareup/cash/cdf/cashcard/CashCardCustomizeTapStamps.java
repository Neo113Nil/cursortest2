package com.squareup.cash.cdf.cashcard;

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
public final class CashCardCustomizeTapStamps implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Boolean is_pattern;
    public final LinkedHashMap parameters;

    public CashCardCustomizeTapStamps(Boolean bool) {
        this.is_pattern = bool;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "CashCard", "cdf_action", "Customize");
        Countries.putSafe(m, "is_pattern", bool);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CashCardCustomizeTapStamps) && this.is_pattern.equals(((CashCardCustomizeTapStamps) obj).is_pattern);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "CashCard Customize TapStamps";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.is_pattern.hashCode();
    }

    public final String toString() {
        return Matcher$$ExternalSyntheticOutline0.m(this.is_pattern, "CashCardCustomizeTapStamps(is_pattern=", ")");
    }
}
