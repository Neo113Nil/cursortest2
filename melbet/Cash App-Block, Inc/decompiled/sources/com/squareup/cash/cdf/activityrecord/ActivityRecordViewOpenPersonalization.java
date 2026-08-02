package com.squareup.cash.cdf.activityrecord;

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
public final class ActivityRecordViewOpenPersonalization implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String entity_token;
    public final LinkedHashMap parameters;
    public final String source;

    public ActivityRecordViewOpenPersonalization(String str, String str2) {
        this.source = str;
        this.entity_token = str2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "ActivityRecord", "cdf_action", "View");
        Countries.putSafe(m, "source", str);
        Countries.putSafe(m, "entity_token", str2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityRecordViewOpenPersonalization)) {
            return false;
        }
        ActivityRecordViewOpenPersonalization activityRecordViewOpenPersonalization = (ActivityRecordViewOpenPersonalization) obj;
        return Intrinsics.areEqual(this.source, activityRecordViewOpenPersonalization.source) && Intrinsics.areEqual(this.entity_token, activityRecordViewOpenPersonalization.entity_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "ActivityRecord View OpenPersonalization";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.source;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.entity_token;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("ActivityRecordViewOpenPersonalization(source=", this.source, ", entity_token=", this.entity_token, ")");
    }
}
