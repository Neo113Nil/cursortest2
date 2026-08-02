package com.squareup.cash.cdf.minttag;

import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
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
public final class MintTagStateViewed implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String device_id;
    public final DeviceType device_type;
    public final Boolean is_locked;
    public final Boolean is_sponsor_locked;
    public final LifecycleState lifecycle_state;
    public final LinkedHashMap parameters;

    public MintTagStateViewed(DeviceType deviceType, String str, LifecycleState lifecycleState, Boolean bool, Boolean bool2) {
        this.device_type = deviceType;
        this.device_id = str;
        this.lifecycle_state = lifecycleState;
        this.is_locked = bool;
        this.is_sponsor_locked = bool2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 7, "MintTag", "cdf_action", "State");
        Countries.putSafe(m, "device_type", deviceType);
        Countries.putSafe(m, "device_id", str);
        Countries.putSafe(m, "lifecycle_state", lifecycleState);
        Countries.putSafe(m, "is_locked", bool);
        Countries.putSafe(m, "is_sponsor_locked", bool2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MintTagStateViewed)) {
            return false;
        }
        MintTagStateViewed mintTagStateViewed = (MintTagStateViewed) obj;
        return this.device_type == mintTagStateViewed.device_type && Intrinsics.areEqual(this.device_id, mintTagStateViewed.device_id) && this.lifecycle_state == mintTagStateViewed.lifecycle_state && this.is_locked.equals(mintTagStateViewed.is_locked) && this.is_sponsor_locked.equals(mintTagStateViewed.is_sponsor_locked);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "MintTag State Viewed";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        DeviceType deviceType = this.device_type;
        int hashCode = (deviceType == null ? 0 : deviceType.hashCode()) * 31;
        String str = this.device_id;
        return this.is_sponsor_locked.hashCode() + ViewEvent$State$EnumUnboxingLocalUtility.m(this.is_locked, (this.lifecycle_state.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MintTagStateViewed(device_type=");
        sb.append(this.device_type);
        sb.append(", device_id=");
        sb.append(this.device_id);
        sb.append(", lifecycle_state=");
        sb.append(this.lifecycle_state);
        sb.append(", is_locked=");
        sb.append(this.is_locked);
        sb.append(", is_sponsor_locked=");
        return Thread$State$EnumUnboxingLocalUtility.m(sb, this.is_sponsor_locked, ")");
    }
}
