package com.squareup.cash.cdf.promotions;

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
public final class PromotionsTapPromotionRow implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.AMPLITUDE, EventDestination.SNOWFLAKE});
    public final String campaign_token;
    public final LinkedHashMap parameters;
    public final PromotionState promotion_state;
    public final String variant_token;

    public PromotionsTapPromotionRow(String str, String str2, PromotionState promotionState) {
        this.campaign_token = str;
        this.variant_token = str2;
        this.promotion_state = promotionState;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "Promotions", "cdf_action", "Tap");
        Countries.putSafe(m, "campaign_token", str);
        Countries.putSafe(m, "variant_token", str2);
        Countries.putSafe(m, "promotion_state", promotionState);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromotionsTapPromotionRow)) {
            return false;
        }
        PromotionsTapPromotionRow promotionsTapPromotionRow = (PromotionsTapPromotionRow) obj;
        return Intrinsics.areEqual(this.campaign_token, promotionsTapPromotionRow.campaign_token) && Intrinsics.areEqual(this.variant_token, promotionsTapPromotionRow.variant_token) && this.promotion_state == promotionsTapPromotionRow.promotion_state;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Promotions Tap PromotionRow";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.campaign_token;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.variant_token;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        PromotionState promotionState = this.promotion_state;
        return hashCode2 + (promotionState != null ? promotionState.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PromotionsTapPromotionRow(campaign_token=", this.campaign_token, ", variant_token=", this.variant_token, ", promotion_state=");
        m.append(this.promotion_state);
        m.append(")");
        return m.toString();
    }
}
