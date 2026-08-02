package com.squareup.cash.cdf.syncentity;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;

/* loaded from: classes6.dex */
public final class SyncEntitySyncWipe implements Event {
    public static final List destinations = CollectionsKt__CollectionsJVMKt.listOf(EventDestination.AMPLITUDE);
    public final Long count_entities_deleted;
    public final Integer count_ranges_deleted;
    public final LinkedHashMap parameters;
    public final String reason;

    public SyncEntitySyncWipe(Integer num, Long l, String str) {
        this.reason = str;
        this.count_ranges_deleted = num;
        this.count_entities_deleted = l;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "SyncEntity", "cdf_action", "Sync");
        Countries.putSafe(m, "reason", str);
        Countries.putSafe(m, "count_ranges_deleted", num);
        Countries.putSafe(m, "count_entities_deleted", l);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SyncEntitySyncWipe)) {
            return false;
        }
        SyncEntitySyncWipe syncEntitySyncWipe = (SyncEntitySyncWipe) obj;
        return this.reason.equals(syncEntitySyncWipe.reason) && this.count_ranges_deleted.equals(syncEntitySyncWipe.count_ranges_deleted) && this.count_entities_deleted.equals(syncEntitySyncWipe.count_entities_deleted);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "SyncEntity Sync Wipe";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.count_entities_deleted.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(this.reason.hashCode() * 31, 31, this.count_ranges_deleted);
    }

    public final String toString() {
        return Thread$State$EnumUnboxingLocalUtility.m(NavAction$$ExternalSyntheticOutline0.m(this.count_ranges_deleted, "SyncEntitySyncWipe(reason=", this.reason, ", count_ranges_deleted=", ", count_entities_deleted="), this.count_entities_deleted, ")");
    }
}
