package com.squareup.cash.cdf.cashappscore;

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
public final class CashAppScoreFAQView implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.AMPLITUDE, EventDestination.SNOWFLAKE});
    public final Integer change_since_last_week;
    public final Integer current_score;
    public final LinkedHashMap parameters;

    public CashAppScoreFAQView(Integer num, Integer num2) {
        this.current_score = num;
        this.change_since_last_week = num2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "CashAppScore", "cdf_action", "FAQ");
        Countries.putSafe(m, "current_score", num);
        Countries.putSafe(m, "change_since_last_week", num2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CashAppScoreFAQView)) {
            return false;
        }
        CashAppScoreFAQView cashAppScoreFAQView = (CashAppScoreFAQView) obj;
        return Intrinsics.areEqual(this.current_score, cashAppScoreFAQView.current_score) && Intrinsics.areEqual(this.change_since_last_week, cashAppScoreFAQView.change_since_last_week);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "CashAppScore FAQ View";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        Integer num = this.current_score;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.change_since_last_week;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "CashAppScoreFAQView(from_screen=null, current_score=" + this.current_score + ", change_since_last_week=" + this.change_since_last_week + ")";
    }
}
