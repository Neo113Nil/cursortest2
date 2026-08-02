package com.squareup.cash.cdf.customersupport;

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
public final class CustomerSupportChatOpenLink implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String flow_token;
    public final String message_token;
    public final LinkedHashMap parameters;
    public final String url;

    public CustomerSupportChatOpenLink(String str, String str2, String str3) {
        this.flow_token = str;
        this.message_token = str2;
        this.url = str3;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "CustomerSupport", "cdf_action", "Chat");
        Countries.putSafe(m, "flow_token", str);
        Countries.putSafe(m, "message_token", str2);
        Countries.putSafe(m, "url", str3);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomerSupportChatOpenLink)) {
            return false;
        }
        CustomerSupportChatOpenLink customerSupportChatOpenLink = (CustomerSupportChatOpenLink) obj;
        return Intrinsics.areEqual(this.flow_token, customerSupportChatOpenLink.flow_token) && Intrinsics.areEqual(this.message_token, customerSupportChatOpenLink.message_token) && Intrinsics.areEqual(this.url, customerSupportChatOpenLink.url);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "CustomerSupport Chat OpenLink";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.flow_token;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.message_token;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.url;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CustomerSupportChatOpenLink(flow_token=", this.flow_token, ", message_token=", this.message_token, ", url="), this.url, ")");
    }
}
