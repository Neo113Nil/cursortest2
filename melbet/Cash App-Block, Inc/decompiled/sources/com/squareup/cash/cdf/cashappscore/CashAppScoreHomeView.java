package com.squareup.cash.cdf.cashappscore;

import com.datadog.android.rum.model.ViewEvent$State$EnumUnboxingLocalUtility;
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
public final class CashAppScoreHomeView implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.AMPLITUDE, EventDestination.KAFKA, EventDestination.SNOWFLAKE});
    public final Integer change_since_last_week;
    public final Integer current_score;
    public final LinkedHashMap parameters;
    public final String score_token;
    public final Boolean showing_celebration;

    public CashAppScoreHomeView(Boolean bool, Integer num, Integer num2, String str) {
        this.current_score = num;
        this.change_since_last_week = num2;
        this.showing_celebration = bool;
        this.score_token = str;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 6, "CashAppScore", "cdf_action", "Home");
        Countries.putSafe(m, "current_score", num);
        Countries.putSafe(m, "change_since_last_week", num2);
        Countries.putSafe(m, "showing_celebration", bool);
        Countries.putSafe(m, "score_token", str);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CashAppScoreHomeView)) {
            return false;
        }
        CashAppScoreHomeView cashAppScoreHomeView = (CashAppScoreHomeView) obj;
        return Intrinsics.areEqual(this.current_score, cashAppScoreHomeView.current_score) && Intrinsics.areEqual(this.change_since_last_week, cashAppScoreHomeView.change_since_last_week) && this.showing_celebration.equals(cashAppScoreHomeView.showing_celebration) && Intrinsics.areEqual(this.score_token, cashAppScoreHomeView.score_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "CashAppScore Home View";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        Integer num = this.current_score;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.change_since_last_week;
        int m = ViewEvent$State$EnumUnboxingLocalUtility.m(this.showing_celebration, (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31, 31);
        String str = this.score_token;
        return m + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "CashAppScoreHomeView(current_score=" + this.current_score + ", change_since_last_week=" + this.change_since_last_week + ", showing_celebration=" + this.showing_celebration + ", score_token=" + this.score_token + ")";
    }
}
