package com.squareup.cash.cdf.customersupport;

import com.appsflyer.AppsFlyerProperties;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class CustomerSupportContactViewEnterMessage implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Channel channel;
    public final String flow_token;
    public final LinkedHashMap parameters;

    public CustomerSupportContactViewEnterMessage(Channel channel, String str) {
        this.channel = channel;
        this.flow_token = str;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "CustomerSupport", "cdf_action", "Contact");
        Countries.putSafe(m, AppsFlyerProperties.CHANNEL, channel);
        Countries.putSafe(m, "flow_token", str);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomerSupportContactViewEnterMessage)) {
            return false;
        }
        CustomerSupportContactViewEnterMessage customerSupportContactViewEnterMessage = (CustomerSupportContactViewEnterMessage) obj;
        return this.channel == customerSupportContactViewEnterMessage.channel && Intrinsics.areEqual(this.flow_token, customerSupportContactViewEnterMessage.flow_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "CustomerSupport Contact ViewEnterMessage";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = this.channel.hashCode() * 31;
        String str = this.flow_token;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "CustomerSupportContactViewEnterMessage(channel=" + this.channel + ", flow_token=" + this.flow_token + ")";
    }
}
