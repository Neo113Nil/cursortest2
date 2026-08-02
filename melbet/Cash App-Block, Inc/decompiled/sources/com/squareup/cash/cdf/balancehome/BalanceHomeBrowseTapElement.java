package com.squareup.cash.cdf.balancehome;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class BalanceHomeBrowseTapElement implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final BalanceHomeElement Element;
    public final LinkedHashMap parameters;

    public BalanceHomeBrowseTapElement(BalanceHomeElement balanceHomeElement) {
        this.Element = balanceHomeElement;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "BalanceHome", "cdf_action", "Browse");
        Countries.putSafe(m, "Element", balanceHomeElement);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BalanceHomeBrowseTapElement) && this.Element == ((BalanceHomeBrowseTapElement) obj).Element;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "BalanceHome Browse TapElement";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.Element.hashCode();
    }

    public final String toString() {
        return "BalanceHomeBrowseTapElement(Element=" + this.Element + ")";
    }
}
