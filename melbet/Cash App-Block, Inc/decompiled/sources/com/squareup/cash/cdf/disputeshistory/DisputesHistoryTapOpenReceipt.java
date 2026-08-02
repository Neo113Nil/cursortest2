package com.squareup.cash.cdf.disputeshistory;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
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
public final class DisputesHistoryTapOpenReceipt implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String flow_token;
    public final LinkedHashMap parameters;
    public final String transaction_token;

    public DisputesHistoryTapOpenReceipt(String str, String str2) {
        this.flow_token = str;
        this.transaction_token = str2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "DisputesHistory", "cdf_action", "Tap");
        Countries.putSafe(m, "flow_token", str);
        Countries.putSafe(m, "transaction_token", str2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DisputesHistoryTapOpenReceipt)) {
            return false;
        }
        DisputesHistoryTapOpenReceipt disputesHistoryTapOpenReceipt = (DisputesHistoryTapOpenReceipt) obj;
        return Intrinsics.areEqual(this.flow_token, disputesHistoryTapOpenReceipt.flow_token) && Intrinsics.areEqual(this.transaction_token, disputesHistoryTapOpenReceipt.transaction_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "DisputesHistory Tap OpenReceipt";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.flow_token;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.transaction_token;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("DisputesHistoryTapOpenReceipt(flow_token=", this.flow_token, ", transaction_token=", this.transaction_token, ")");
    }
}
