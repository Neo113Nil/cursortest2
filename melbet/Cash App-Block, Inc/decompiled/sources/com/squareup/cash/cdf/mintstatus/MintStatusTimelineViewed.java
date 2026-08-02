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
public final class MintStatusTimelineViewed implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String device_id;
    public final LinkedHashMap parameters;
    public final Integer step_count;
    public final String theme_token;
    public final String timeline_title;

    public MintStatusTimelineViewed(Integer num, String str, String str2, String str3) {
        this.theme_token = str;
        this.device_id = str2;
        this.timeline_title = str3;
        this.step_count = num;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 7, "MintStatus", "cdf_action", "Timeline");
        Countries.putSafe(m, "theme_token", str);
        Countries.putSafe(m, "device_id", str2);
        Countries.putSafe(m, "timeline_title", str3);
        Countries.putSafe(m, "step_count", num);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MintStatusTimelineViewed)) {
            return false;
        }
        MintStatusTimelineViewed mintStatusTimelineViewed = (MintStatusTimelineViewed) obj;
        return Intrinsics.areEqual(this.theme_token, mintStatusTimelineViewed.theme_token) && Intrinsics.areEqual(this.device_id, mintStatusTimelineViewed.device_id) && Intrinsics.areEqual(this.timeline_title, mintStatusTimelineViewed.timeline_title) && this.step_count.equals(mintStatusTimelineViewed.step_count);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "MintStatus Timeline Viewed";
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
        String str3 = this.timeline_title;
        return this.step_count.hashCode() + ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("MintStatusTimelineViewed(device_type=null, theme_token=", this.theme_token, ", device_id=", this.device_id, ", timeline_title=");
        m.append(this.timeline_title);
        m.append(", step_count=");
        m.append(this.step_count);
        m.append(")");
        return m.toString();
    }
}
