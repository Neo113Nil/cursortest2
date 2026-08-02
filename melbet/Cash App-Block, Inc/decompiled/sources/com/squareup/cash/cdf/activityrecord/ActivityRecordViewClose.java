package com.squareup.cash.cdf.activityrecord;

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
public final class ActivityRecordViewClose implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String entity_id;
    public final Boolean is_badged;
    public final Boolean is_outstanding;
    public final LinkedHashMap parameters;

    public ActivityRecordViewClose(String str, Boolean bool, Boolean bool2) {
        this.entity_id = str;
        this.is_badged = bool;
        this.is_outstanding = bool2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "ActivityRecord", "cdf_action", "View");
        Countries.putSafe(m, "entity_id", str);
        Countries.putSafe(m, "is_badged", bool);
        Countries.putSafe(m, "is_outstanding", bool2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityRecordViewClose)) {
            return false;
        }
        ActivityRecordViewClose activityRecordViewClose = (ActivityRecordViewClose) obj;
        return this.entity_id.equals(activityRecordViewClose.entity_id) && Intrinsics.areEqual(this.is_badged, activityRecordViewClose.is_badged) && Intrinsics.areEqual(this.is_outstanding, activityRecordViewClose.is_outstanding);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "ActivityRecord View Close";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = this.entity_id.hashCode() * 31;
        Boolean bool = this.is_badged;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.is_outstanding;
        return hashCode2 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        return Thread$State$EnumUnboxingLocalUtility.m(Thread$State$EnumUnboxingLocalUtility.m(this.is_badged, "ActivityRecordViewClose(entity_id=", this.entity_id, ", is_badged=", ", is_outstanding="), this.is_outstanding, ")");
    }
}
