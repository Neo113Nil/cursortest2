package com.squareup.cash.cdf.knot;

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
public final class KnotLinkMerchantSuccess implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.BRAZE, EventDestination.SNOWFLAKE});
    public final String merchant_name;
    public final LinkedHashMap parameters;

    public KnotLinkMerchantSuccess(String str) {
        this.merchant_name = str;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "Knot", "cdf_action", "LinkMerchant");
        Countries.putSafe(m, "merchant_name", str);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof KnotLinkMerchantSuccess) && Intrinsics.areEqual(this.merchant_name, ((KnotLinkMerchantSuccess) obj).merchant_name);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Knot LinkMerchant Success";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.merchant_name;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("KnotLinkMerchantSuccess(merchant_name=", this.merchant_name, ")");
    }
}
