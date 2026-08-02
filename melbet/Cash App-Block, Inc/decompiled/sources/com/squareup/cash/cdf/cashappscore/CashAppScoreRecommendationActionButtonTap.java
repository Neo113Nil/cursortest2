package com.squareup.cash.cdf.cashappscore;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
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
public final class CashAppScoreRecommendationActionButtonTap implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.AMPLITUDE, EventDestination.SNOWFLAKE});
    public final String action_title;
    public final String button_title;
    public final LinkedHashMap parameters;

    public CashAppScoreRecommendationActionButtonTap(String str, String str2) {
        this.action_title = str;
        this.button_title = str2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "CashAppScore", "cdf_action", "Recommendation");
        Countries.putSafe(m, "action_title", str);
        Countries.putSafe(m, "button_title", str2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CashAppScoreRecommendationActionButtonTap)) {
            return false;
        }
        CashAppScoreRecommendationActionButtonTap cashAppScoreRecommendationActionButtonTap = (CashAppScoreRecommendationActionButtonTap) obj;
        return Intrinsics.areEqual(this.action_title, cashAppScoreRecommendationActionButtonTap.action_title) && Intrinsics.areEqual(this.button_title, cashAppScoreRecommendationActionButtonTap.button_title);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "CashAppScore Recommendation ActionButtonTap";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.action_title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.button_title;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("CashAppScoreRecommendationActionButtonTap(action_title=", this.action_title, ", button_title=", this.button_title, ")");
    }
}
