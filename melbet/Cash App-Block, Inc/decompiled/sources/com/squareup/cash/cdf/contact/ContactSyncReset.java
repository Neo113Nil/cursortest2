package com.squareup.cash.cdf.contact;

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
public final class ContactSyncReset implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Boolean has_previous_patch_id;
    public final Boolean has_previous_sync_token;
    public final LinkedHashMap parameters;
    public final ResetReason reason;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class ResetReason {
        public static final /* synthetic */ ResetReason[] $VALUES;
        public static final ResetReason PERMISSION_DENIED;
        public static final ResetReason SIGNOUT;

        static {
            ResetReason resetReason = new ResetReason("SIGNOUT", 0);
            SIGNOUT = resetReason;
            ResetReason resetReason2 = new ResetReason("CLEAR_APP_DATA", 1);
            ResetReason resetReason3 = new ResetReason("PERMISSION_DENIED", 2);
            PERMISSION_DENIED = resetReason3;
            $VALUES = new ResetReason[]{resetReason, resetReason2, resetReason3, new ResetReason("FORCE_FRESH_SYNC", 3)};
        }

        public static ResetReason valueOf(String str) {
            return (ResetReason) Enum.valueOf(ResetReason.class, str);
        }

        public static ResetReason[] values() {
            return (ResetReason[]) $VALUES.clone();
        }
    }

    public ContactSyncReset(ResetReason resetReason, Boolean bool, Boolean bool2) {
        this.reason = resetReason;
        this.has_previous_sync_token = bool;
        this.has_previous_patch_id = bool2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "Contact", "cdf_action", "Sync");
        Countries.putSafe(m, "reason", resetReason);
        Countries.putSafe(m, "has_previous_sync_token", bool);
        Countries.putSafe(m, "has_previous_patch_id", bool2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactSyncReset)) {
            return false;
        }
        ContactSyncReset contactSyncReset = (ContactSyncReset) obj;
        return this.reason == contactSyncReset.reason && Intrinsics.areEqual(this.has_previous_sync_token, contactSyncReset.has_previous_sync_token) && this.has_previous_patch_id.equals(contactSyncReset.has_previous_patch_id);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Contact Sync Reset";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        ResetReason resetReason = this.reason;
        int hashCode = (resetReason == null ? 0 : resetReason.hashCode()) * 31;
        Boolean bool = this.has_previous_sync_token;
        return this.has_previous_patch_id.hashCode() + ((hashCode + (bool != null ? bool.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContactSyncReset(reason=");
        sb.append(this.reason);
        sb.append(", has_previous_sync_token=");
        sb.append(this.has_previous_sync_token);
        sb.append(", has_previous_patch_id=");
        return Thread$State$EnumUnboxingLocalUtility.m(sb, this.has_previous_patch_id, ")");
    }
}
