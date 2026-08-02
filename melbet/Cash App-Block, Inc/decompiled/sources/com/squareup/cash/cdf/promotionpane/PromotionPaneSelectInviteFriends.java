package com.squareup.cash.cdf.promotionpane;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class PromotionPaneSelectInviteFriends implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final LinkedHashMap parameters = BalanceFeedKt$$ExternalSyntheticOutline0.m$1("cdf_entity", 2, "PromotionPane", "cdf_action", "Select");
    public final String name = "PromotionPane Select InviteFriends";

    public final boolean equals(Object obj) {
        return obj instanceof PromotionPaneSelectInviteFriends;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return this.name;
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }
}
