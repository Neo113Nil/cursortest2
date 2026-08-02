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
public final class LocalMarketingBuyerMarketingCampaignTappedMessage implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String brand_token;
    public final String message_token;
    public final String offer_token;
    public final LinkedHashMap parameters;

    public LocalMarketingBuyerMarketingCampaignTappedMessage(String str, String str2, String str3) {
        EventLocation eventLocation = EventLocation.MESSAGES;
        this.brand_token = str;
        this.message_token = str2;
        this.offer_token = str3;
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
        if (!(obj instanceof LocalMarketingBuyerMarketingCampaignTappedMessage)) {
            return false;
        }
        LocalMarketingBuyerMarketingCampaignTappedMessage localMarketingBuyerMarketingCampaignTappedMessage = (LocalMarketingBuyerMarketingCampaignTappedMessage) obj;
        if (!Intrinsics.areEqual(this.brand_token, localMarketingBuyerMarketingCampaignTappedMessage.brand_token) || !Intrinsics.areEqual(this.message_token, localMarketingBuyerMarketingCampaignTappedMessage.message_token) || !Intrinsics.areEqual(this.offer_token, localMarketingBuyerMarketingCampaignTappedMessage.offer_token)) {
            return false;
        }
        EventLocation eventLocation = EventLocation.MESSAGES;
        return true;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "LocalMarketing BuyerMarketingCampaign TappedMessage";
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
        return EventLocation.MESSAGES.hashCode() + ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        EventLocation eventLocation = EventLocation.MESSAGES;
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("LocalMarketingBuyerMarketingCampaignTappedMessage(brand_token=", this.brand_token, ", message_token=", this.message_token, ", offer_token=");
        m.append(this.offer_token);
        m.append(", event_location=");
        m.append(eventLocation);
        m.append(")");
        return m.toString();
    }
}
