package com.squareup.cash.cdf.knot;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class KnotSelectMerchant implements Event {
    public static final List destinations = CollectionsKt__CollectionsJVMKt.listOf(EventDestination.SNOWFLAKE);
    public final String merchant_id;
    public final String merchant_name;
    public final LinkedHashMap parameters;

    public KnotSelectMerchant(String str, String str2) {
        this.merchant_id = str;
        this.merchant_name = str2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "Knot", "cdf_action", "Select");
        Countries.putSafe(m, "merchant_id", str);
        Countries.putSafe(m, "merchant_name", str2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KnotSelectMerchant)) {
            return false;
        }
        KnotSelectMerchant knotSelectMerchant = (KnotSelectMerchant) obj;
        return Intrinsics.areEqual(this.merchant_id, knotSelectMerchant.merchant_id) && Intrinsics.areEqual(this.merchant_name, knotSelectMerchant.merchant_name);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Knot Select Merchant";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.merchant_id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.merchant_name;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("KnotSelectMerchant(merchant_id=", this.merchant_id, ", merchant_name=", this.merchant_name, ")");
    }
}
