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
public final class LocalMarketingBuyerMarketingCampaignCloseMessage implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String brand_token;
    public final EventLocation event_location;
    public final String message_token;
    public final LinkedHashMap parameters;

    public LocalMarketingBuyerMarketingCampaignCloseMessage(String str, String str2, EventLocation eventLocation) {
        this.brand_token = str;
        this.message_token = str2;
        this.event_location = eventLocation;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 6, "LocalMarketing", "cdf_action", "BuyerMarketingCampaign");
        Countries.putSafe(m, "brand_token", str);
        Countries.putSafe(m, "message_token", str2);
        Countries.putSafe(m, "event_location", eventLocation);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalMarketingBuyerMarketingCampaignCloseMessage)) {
            return false;
        }
        LocalMarketingBuyerMarketingCampaignCloseMessage localMarketingBuyerMarketingCampaignCloseMessage = (LocalMarketingBuyerMarketingCampaignCloseMessage) obj;
        return Intrinsics.areEqual(this.brand_token, localMarketingBuyerMarketingCampaignCloseMessage.brand_token) && Intrinsics.areEqual(this.message_token, localMarketingBuyerMarketingCampaignCloseMessage.message_token) && this.event_location == localMarketingBuyerMarketingCampaignCloseMessage.event_location;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "LocalMarketing BuyerMarketingCampaign CloseMessage";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.brand_token;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.message_token;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 961;
        EventLocation eventLocation = this.event_location;
        return hashCode2 + (eventLocation != null ? eventLocation.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("LocalMarketingBuyerMarketingCampaignCloseMessage(brand_token=", this.brand_token, ", message_token=", this.message_token, ", offer_token=null, event_location=");
        m.append(this.event_location);
        m.append(")");
        return m.toString();
    }
}
