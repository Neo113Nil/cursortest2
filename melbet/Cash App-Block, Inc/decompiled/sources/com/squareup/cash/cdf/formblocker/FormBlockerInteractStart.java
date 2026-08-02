package com.squareup.cash.cdf.formblocker;

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
public final class FormBlockerInteractStart implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SEGMENT, EventDestination.BRAZE, EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String blockerId;
    public final String elementId;
    public final LinkedHashMap parameters;

    public FormBlockerInteractStart(String str, String str2) {
        this.blockerId = str;
        this.elementId = str2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "FormBlocker", "cdf_action", "Interact");
        Countries.putSafe(m, "blockerId", str);
        Countries.putSafe(m, "elementId", str2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FormBlockerInteractStart)) {
            return false;
        }
        FormBlockerInteractStart formBlockerInteractStart = (FormBlockerInteractStart) obj;
        return Intrinsics.areEqual(this.blockerId, formBlockerInteractStart.blockerId) && Intrinsics.areEqual(this.elementId, formBlockerInteractStart.elementId);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "FormBlocker Interact Start";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.blockerId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.elementId;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("FormBlockerInteractStart(blockerId=", this.blockerId, ", elementId=", this.elementId, ")");
    }
}
