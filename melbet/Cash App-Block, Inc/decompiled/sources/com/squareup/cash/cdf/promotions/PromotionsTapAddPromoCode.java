package com.squareup.cash.cdf.promotions;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class PromotionsTapAddPromoCode implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.AMPLITUDE, EventDestination.SNOWFLAKE});
    public final LinkedHashMap parameters;
    public final PromotionsSourceScreen source;

    public PromotionsTapAddPromoCode(PromotionsSourceScreen promotionsSourceScreen) {
        this.source = promotionsSourceScreen;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "Promotions", "cdf_action", "Tap");
        Countries.putSafe(m, "source", promotionsSourceScreen);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PromotionsTapAddPromoCode) && this.source == ((PromotionsTapAddPromoCode) obj).source;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Promotions Tap AddPromoCode";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        PromotionsSourceScreen promotionsSourceScreen = this.source;
        if (promotionsSourceScreen == null) {
            return 0;
        }
        return promotionsSourceScreen.hashCode();
    }

    public final String toString() {
        return "PromotionsTapAddPromoCode(source=" + this.source + ")";
    }
}
