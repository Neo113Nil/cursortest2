package com.squareup.cash.cdf.p2pblocklist;

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
public final class P2PBlockListViewStart implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String blocking_context;
    public final LinkedHashMap parameters;
    public final String subject_customer_token;

    public P2PBlockListViewStart(String str, String str2) {
        this.subject_customer_token = str;
        this.blocking_context = str2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "P2PBlockList", "cdf_action", "View");
        Countries.putSafe(m, "subject_customer_token", str);
        Countries.putSafe(m, "blocking_context", str2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P2PBlockListViewStart)) {
            return false;
        }
        P2PBlockListViewStart p2PBlockListViewStart = (P2PBlockListViewStart) obj;
        return Intrinsics.areEqual(this.subject_customer_token, p2PBlockListViewStart.subject_customer_token) && Intrinsics.areEqual(this.blocking_context, p2PBlockListViewStart.blocking_context);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "P2PBlockList View Start";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.subject_customer_token;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.blocking_context;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("P2PBlockListViewStart(subject_customer_token=", this.subject_customer_token, ", blocking_context=", this.blocking_context, ")");
    }
}
