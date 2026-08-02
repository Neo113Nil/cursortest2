package com.squareup.cash.cdf.cashappscore;

import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
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
public final class CashAppScoreScoreDetailsView implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.AMPLITUDE, EventDestination.SNOWFLAKE});
    public final Integer change_since_last_week;
    public final Integer current_score;
    public final Boolean feature_impact_present;
    public final LinkedHashMap parameters;

    public CashAppScoreScoreDetailsView(Integer num, Integer num2, Boolean bool) {
        this.current_score = num;
        this.change_since_last_week = num2;
        this.feature_impact_present = bool;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 6, "CashAppScore", "cdf_action", "ScoreDetails");
        Countries.putSafe(m, "current_score", num);
        Countries.putSafe(m, "change_since_last_week", num2);
        Countries.putSafe(m, "feature_impact_present", bool);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CashAppScoreScoreDetailsView)) {
            return false;
        }
        CashAppScoreScoreDetailsView cashAppScoreScoreDetailsView = (CashAppScoreScoreDetailsView) obj;
        return Intrinsics.areEqual(this.current_score, cashAppScoreScoreDetailsView.current_score) && Intrinsics.areEqual(this.change_since_last_week, cashAppScoreScoreDetailsView.change_since_last_week) && this.feature_impact_present.equals(cashAppScoreScoreDetailsView.feature_impact_present);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "CashAppScore ScoreDetails View";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        Integer num = this.current_score;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.change_since_last_week;
        return this.feature_impact_present.hashCode() + ((hashCode + (num2 != null ? num2.hashCode() : 0)) * 961);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CashAppScoreScoreDetailsView(current_score=");
        sb.append(this.current_score);
        sb.append(", change_since_last_week=");
        sb.append(this.change_since_last_week);
        sb.append(", feature_impact=null, feature_impact_present=");
        return Thread$State$EnumUnboxingLocalUtility.m(sb, this.feature_impact_present, ")");
    }
}
