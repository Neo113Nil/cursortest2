package com.squareup.cash.cdf.referralreward;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.datadog.android.rum.RumErrorSource$EnumUnboxingLocalUtility;
import com.datadog.android.rum.model.ViewEvent$State$EnumUnboxingLocalUtility;
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
public final class ReferralRewardReceiveComplete implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SEGMENT, EventDestination.BRAZE, EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String client_scenario;
    public final Long duration;
    public final String flow_token;
    public final LinkedHashMap parameters;
    public final String rate_plan;
    public final String source;

    public ReferralRewardReceiveComplete(Long l, String str, String str2, String str3, String str4) {
        this.client_scenario = str;
        this.duration = l;
        this.flow_token = str2;
        this.rate_plan = str3;
        this.source = str4;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 7, "ReferralReward", "cdf_action", "Receive");
        Countries.putSafe(m, "client_scenario", str);
        Countries.putSafe(m, "duration", l);
        Countries.putSafe(m, "flow_token", str2);
        Countries.putSafe(m, "rate_plan", str3);
        Countries.putSafe(m, "source", str4);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReferralRewardReceiveComplete)) {
            return false;
        }
        ReferralRewardReceiveComplete referralRewardReceiveComplete = (ReferralRewardReceiveComplete) obj;
        return Intrinsics.areEqual(this.client_scenario, referralRewardReceiveComplete.client_scenario) && this.duration.equals(referralRewardReceiveComplete.duration) && Intrinsics.areEqual(this.flow_token, referralRewardReceiveComplete.flow_token) && Intrinsics.areEqual(this.rate_plan, referralRewardReceiveComplete.rate_plan) && Intrinsics.areEqual(this.source, referralRewardReceiveComplete.source);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "ReferralReward Receive Complete";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.client_scenario;
        int m = ViewEvent$State$EnumUnboxingLocalUtility.m(this.duration, (str == null ? 0 : str.hashCode()) * 31, 31);
        String str2 = this.flow_token;
        int hashCode = (m + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.rate_plan;
        int hashCode2 = (hashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.source;
        return hashCode2 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = RumErrorSource$EnumUnboxingLocalUtility.m(this.duration, "ReferralRewardReceiveComplete(client_scenario=", this.client_scenario, ", duration=", ", flow_token=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.flow_token, ", rate_plan=", this.rate_plan, ", source=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.source, ")");
    }
}
