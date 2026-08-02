package com.squareup.cash.cdf.savingsgoal;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class SavingsGoalRemoveRemove implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String goal_token;
    public final LinkedHashMap parameters;

    public SavingsGoalRemoveRemove(String str) {
        this.goal_token = str;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "SavingsGoal", "cdf_action", "Remove");
        Countries.putSafe(m, "goal_token", str);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SavingsGoalRemoveRemove) && Intrinsics.areEqual(this.goal_token, ((SavingsGoalRemoveRemove) obj).goal_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "SavingsGoal Remove Remove";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.goal_token;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SavingsGoalRemoveRemove(goal_token=", this.goal_token, ")");
    }
}
