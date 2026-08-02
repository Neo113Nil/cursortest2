package com.squareup.cash.cdf.formblocker;

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
public final class FormBlockerInteractTap implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SEGMENT, EventDestination.BRAZE, EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String blockerId;
    public final LinkedHashMap parameters;

    public FormBlockerInteractTap(String str) {
        this.blockerId = str;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "FormBlocker", "cdf_action", "Interact");
        Countries.putSafe(m, "blockerId", str);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FormBlockerInteractTap) && Intrinsics.areEqual(this.blockerId, ((FormBlockerInteractTap) obj).blockerId);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "FormBlocker Interact Tap";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.blockerId;
        return (str == null ? 0 : str.hashCode()) * 31;
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("FormBlockerInteractTap(blockerId=", this.blockerId, ", elementId=null)");
    }
}
