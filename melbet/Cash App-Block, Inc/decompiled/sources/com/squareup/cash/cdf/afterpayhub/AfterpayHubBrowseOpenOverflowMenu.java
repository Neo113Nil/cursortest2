package com.squareup.cash.cdf.afterpayhub;

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
public final class AfterpayHubBrowseOpenOverflowMenu implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String afterpay_order_id;
    public final LinkedHashMap parameters;

    public AfterpayHubBrowseOpenOverflowMenu(String str) {
        this.afterpay_order_id = str;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "AfterpayHub", "cdf_action", "Browse");
        Countries.putSafe(m, "afterpay_order_id", str);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AfterpayHubBrowseOpenOverflowMenu) && Intrinsics.areEqual(this.afterpay_order_id, ((AfterpayHubBrowseOpenOverflowMenu) obj).afterpay_order_id);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "AfterpayHub Browse OpenOverflowMenu";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.afterpay_order_id;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AfterpayHubBrowseOpenOverflowMenu(afterpay_order_id=", this.afterpay_order_id, ")");
    }
}
