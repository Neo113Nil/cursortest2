package com.squareup.cash.cdf.localmarketing;

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
public final class LocalMarketingBuyerMarketingCampaignViewAllMessages implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String brand_token;
    public final LinkedHashMap parameters;

    public LocalMarketingBuyerMarketingCampaignViewAllMessages(String str) {
        this.brand_token = str;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "LocalMarketing", "cdf_action", "BuyerMarketingCampaign");
        Countries.putSafe(m, "brand_token", str);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalMarketingBuyerMarketingCampaignViewAllMessages) && Intrinsics.areEqual(this.brand_token, ((LocalMarketingBuyerMarketingCampaignViewAllMessages) obj).brand_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "LocalMarketing BuyerMarketingCampaign ViewAllMessages";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.brand_token;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("LocalMarketingBuyerMarketingCampaignViewAllMessages(brand_token=", this.brand_token, ")");
    }
}
