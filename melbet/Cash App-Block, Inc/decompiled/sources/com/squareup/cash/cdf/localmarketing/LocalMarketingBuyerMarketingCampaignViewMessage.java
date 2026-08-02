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
public final class LocalMarketingBuyerMarketingCampaignViewMessage implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String brand_token;
    public final EventLocation event_location;
    public final String message_token;
    public final String offer_token;
    public final LinkedHashMap parameters;

    public LocalMarketingBuyerMarketingCampaignViewMessage(String str, String str2, String str3, EventLocation eventLocation) {
        this.brand_token = str;
        this.message_token = str2;
        this.offer_token = str3;
        this.event_location = eventLocation;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 6, "LocalMarketing", "cdf_action", "BuyerMarketingCampaign");
        Countries.putSafe(m, "brand_token", str);
        Countries.putSafe(m, "message_token", str2);
        Countries.putSafe(m, "offer_token", str3);
        Countries.putSafe(m, "event_location", eventLocation);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalMarketingBuyerMarketingCampaignViewMessage)) {
            return false;
        }
        LocalMarketingBuyerMarketingCampaignViewMessage localMarketingBuyerMarketingCampaignViewMessage = (LocalMarketingBuyerMarketingCampaignViewMessage) obj;
        return Intrinsics.areEqual(this.brand_token, localMarketingBuyerMarketingCampaignViewMessage.brand_token) && Intrinsics.areEqual(this.message_token, localMarketingBuyerMarketingCampaignViewMessage.message_token) && Intrinsics.areEqual(this.offer_token, localMarketingBuyerMarketingCampaignViewMessage.offer_token) && this.event_location == localMarketingBuyerMarketingCampaignViewMessage.event_location;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "LocalMarketing BuyerMarketingCampaign ViewMessage";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.brand_token;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.message_token;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.offer_token;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        EventLocation eventLocation = this.event_location;
        return hashCode3 + (eventLocation != null ? eventLocation.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("LocalMarketingBuyerMarketingCampaignViewMessage(brand_token=", this.brand_token, ", message_token=", this.message_token, ", offer_token=");
        m.append(this.offer_token);
        m.append(", event_location=");
        m.append(this.event_location);
        m.append(")");
        return m.toString();
    }
}
