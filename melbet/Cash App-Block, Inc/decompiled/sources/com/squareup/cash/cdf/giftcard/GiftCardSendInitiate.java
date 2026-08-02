package com.squareup.cash.cdf.giftcard;

import com.datadog.android.rum.RumErrorSource$EnumUnboxingLocalUtility;
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
public final class GiftCardSendInitiate implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SEGMENT, EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String flow_token;
    public final Long gift_card_amount;
    public final String gift_card_token;
    public final LinkedHashMap parameters;
    public final String referrer_flow_token;
    public final SourceLocation source_location;

    public GiftCardSendInitiate(String str, Long l, SourceLocation sourceLocation, String str2, String str3) {
        this.gift_card_token = str;
        this.gift_card_amount = l;
        this.source_location = sourceLocation;
        this.flow_token = str2;
        this.referrer_flow_token = str3;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 7, "GiftCard", "cdf_action", "Send");
        Countries.putSafe(m, "gift_card_token", str);
        Countries.putSafe(m, "gift_card_amount", l);
        Countries.putSafe(m, "source_location", sourceLocation);
        Countries.putSafe(m, "flow_token", str2);
        Countries.putSafe(m, "referrer_flow_token", str3);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GiftCardSendInitiate)) {
            return false;
        }
        GiftCardSendInitiate giftCardSendInitiate = (GiftCardSendInitiate) obj;
        return Intrinsics.areEqual(this.gift_card_token, giftCardSendInitiate.gift_card_token) && Intrinsics.areEqual(this.gift_card_amount, giftCardSendInitiate.gift_card_amount) && this.source_location == giftCardSendInitiate.source_location && Intrinsics.areEqual(this.flow_token, giftCardSendInitiate.flow_token) && Intrinsics.areEqual(this.referrer_flow_token, giftCardSendInitiate.referrer_flow_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "GiftCard Send Initiate";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.gift_card_token;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.gift_card_amount;
        int hashCode2 = (this.source_location.hashCode() + ((hashCode + (l == null ? 0 : l.hashCode())) * 31)) * 31;
        String str2 = this.flow_token;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.referrer_flow_token;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = RumErrorSource$EnumUnboxingLocalUtility.m(this.gift_card_amount, "GiftCardSendInitiate(gift_card_token=", this.gift_card_token, ", gift_card_amount=", ", source_location=");
        m.append(this.source_location);
        m.append(", flow_token=");
        m.append(this.flow_token);
        m.append(", referrer_flow_token=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.referrer_flow_token, ")");
    }
}
