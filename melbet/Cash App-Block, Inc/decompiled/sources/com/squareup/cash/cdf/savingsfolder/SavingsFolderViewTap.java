package com.squareup.cash.cdf.savingsfolder;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class SavingsFolderViewTap implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SEGMENT, EventDestination.BRAZE, EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final LinkedHashMap parameters = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "SavingsFolder", "cdf_action", "View");

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof SavingsFolderViewTap);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "SavingsFolder View Tap";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "SavingsFolderViewTap(tile_type=null, dependent_customer_token=null)";
    }
}
