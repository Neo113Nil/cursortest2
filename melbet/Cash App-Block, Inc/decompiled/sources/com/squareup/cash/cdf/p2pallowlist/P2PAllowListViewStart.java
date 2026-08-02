package com.squareup.cash.cdf.p2pallowlist;

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
public final class P2PAllowListViewStart implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final LinkedHashMap parameters;
    public final String subject_customer_token;

    public P2PAllowListViewStart(String str) {
        this.subject_customer_token = str;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "P2PAllowList", "cdf_action", "View");
        Countries.putSafe(m, "subject_customer_token", str);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof P2PAllowListViewStart) && Intrinsics.areEqual(this.subject_customer_token, ((P2PAllowListViewStart) obj).subject_customer_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "P2PAllowList View Start";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.subject_customer_token;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("P2PAllowListViewStart(subject_customer_token=", this.subject_customer_token, ")");
    }
}
