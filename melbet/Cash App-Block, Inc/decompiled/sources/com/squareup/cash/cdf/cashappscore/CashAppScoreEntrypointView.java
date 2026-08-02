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
public final class CashAppScoreEntrypointView implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.AMPLITUDE, EventDestination.SNOWFLAKE});
    public final Integer current_score;
    public final LinkedHashMap parameters;
    public final AppletState state;

    public CashAppScoreEntrypointView(AppletState appletState, Integer num) {
        this.state = appletState;
        this.current_score = num;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "CashAppScore", "cdf_action", "Entrypoint");
        Countries.putSafe(m, "state", appletState);
        Countries.putSafe(m, "current_score", num);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CashAppScoreEntrypointView)) {
            return false;
        }
        CashAppScoreEntrypointView cashAppScoreEntrypointView = (CashAppScoreEntrypointView) obj;
        return this.state == cashAppScoreEntrypointView.state && Intrinsics.areEqual(this.current_score, cashAppScoreEntrypointView.current_score);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "CashAppScore Entrypoint View";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        AppletState appletState = this.state;
        int hashCode = (appletState == null ? 0 : appletState.hashCode()) * 31;
        Integer num = this.current_score;
        return (hashCode + (num != null ? num.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return "CashAppScoreEntrypointView(state=" + this.state + ", current_score=" + this.current_score + ", change_since_last_week=null)";
    }
}
