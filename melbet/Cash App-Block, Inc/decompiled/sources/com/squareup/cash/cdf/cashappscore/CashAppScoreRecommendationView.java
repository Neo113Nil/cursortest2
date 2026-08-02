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
public final class CashAppScoreRecommendationView implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.AMPLITUDE, EventDestination.SNOWFLAKE});
    public final String action_title;
    public final Integer order;
    public final LinkedHashMap parameters;

    public CashAppScoreRecommendationView(Integer num, String str) {
        this.order = num;
        this.action_title = str;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "CashAppScore", "cdf_action", "Recommendation");
        Countries.putSafe(m, "order", num);
        Countries.putSafe(m, "action_title", str);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CashAppScoreRecommendationView)) {
            return false;
        }
        CashAppScoreRecommendationView cashAppScoreRecommendationView = (CashAppScoreRecommendationView) obj;
        return this.order.equals(cashAppScoreRecommendationView.order) && Intrinsics.areEqual(this.action_title, cashAppScoreRecommendationView.action_title);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "CashAppScore Recommendation View";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = this.order.hashCode() * 31;
        String str = this.action_title;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "CashAppScoreRecommendationView(order=" + this.order + ", action_title=" + this.action_title + ")";
    }
}
