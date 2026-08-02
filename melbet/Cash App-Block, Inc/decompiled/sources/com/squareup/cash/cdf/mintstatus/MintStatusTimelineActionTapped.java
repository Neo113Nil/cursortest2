package com.squareup.cash.cdf.mintstatus;

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
public final class MintStatusTimelineActionTapped implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String action_label;
    public final String device_id;
    public final LinkedHashMap parameters;
    public final String theme_token;

    public MintStatusTimelineActionTapped(String str, String str2, String str3) {
        this.theme_token = str;
        this.device_id = str2;
        this.action_label = str3;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 7, "MintStatus", "cdf_action", "Timeline");
        Countries.putSafe(m, "theme_token", str);
        Countries.putSafe(m, "device_id", str2);
        Countries.putSafe(m, "action_label", str3);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MintStatusTimelineActionTapped)) {
            return false;
        }
        MintStatusTimelineActionTapped mintStatusTimelineActionTapped = (MintStatusTimelineActionTapped) obj;
        return Intrinsics.areEqual(this.theme_token, mintStatusTimelineActionTapped.theme_token) && Intrinsics.areEqual(this.device_id, mintStatusTimelineActionTapped.device_id) && Intrinsics.areEqual(this.action_label, mintStatusTimelineActionTapped.action_label);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "MintStatus Timeline ActionTapped";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.theme_token;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.device_id;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.action_label;
        return (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("MintStatusTimelineActionTapped(device_type=null, theme_token=", this.theme_token, ", device_id=", this.device_id, ", action_label="), this.action_label, ", action_url=null)");
    }
}
