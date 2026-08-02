package com.squareup.cash.cdf.customerengagement;

import com.appsflyer.AppsFlyerProperties;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class CustomerEngagementClickReport implements Event {
    public static final List destinations = CollectionsKt__CollectionsJVMKt.listOf(EventDestination.KAFKA);
    public final Channel channel;
    public final String metadata_id;
    public final LinkedHashMap parameters;
    public final String url;

    public CustomerEngagementClickReport(String str, String str2, int i) {
        Channel channel = (i & 1) != 0 ? null : Channel.PUSH;
        this.channel = channel;
        this.metadata_id = str;
        this.url = str2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 6, "CustomerEngagement", "cdf_action", "Click");
        Countries.putSafe(m, AppsFlyerProperties.CHANNEL, channel);
        Countries.putSafe(m, "metadata_id", str);
        Countries.putSafe(m, "url", str2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomerEngagementClickReport)) {
            return false;
        }
        CustomerEngagementClickReport customerEngagementClickReport = (CustomerEngagementClickReport) obj;
        return this.channel == customerEngagementClickReport.channel && Intrinsics.areEqual(this.metadata_id, customerEngagementClickReport.metadata_id) && Intrinsics.areEqual(this.url, customerEngagementClickReport.url);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "CustomerEngagement Click Report";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        Channel channel = this.channel;
        int hashCode = (channel == null ? 0 : channel.hashCode()) * 31;
        String str = this.metadata_id;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.url;
        return (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CustomerEngagementClickReport(channel=");
        sb.append(this.channel);
        sb.append(", metadata_id=");
        sb.append(this.metadata_id);
        sb.append(", url=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.url, ", additional_data=null)");
    }
}
