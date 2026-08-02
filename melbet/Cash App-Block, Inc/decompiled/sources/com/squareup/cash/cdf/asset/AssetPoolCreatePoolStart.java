package com.squareup.cash.cdf.asset;

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
public final class AssetPoolCreatePoolStart implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.SEGMENT, EventDestination.BRAZE, EventDestination.AMPLITUDE});
    public final Double amount;
    public final String entry_point;
    public final String flow_token;
    public final LinkedHashMap parameters;

    public AssetPoolCreatePoolStart(Double d, String str, String str2) {
        this.amount = d;
        this.flow_token = str;
        this.entry_point = str2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 6, "Asset", "cdf_action", "Pool");
        Countries.putSafe(m, "amount", d);
        Countries.putSafe(m, "flow_token", str);
        Countries.putSafe(m, "entry_point", str2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AssetPoolCreatePoolStart)) {
            return false;
        }
        AssetPoolCreatePoolStart assetPoolCreatePoolStart = (AssetPoolCreatePoolStart) obj;
        return Intrinsics.areEqual((Object) this.amount, (Object) assetPoolCreatePoolStart.amount) && Intrinsics.areEqual(this.flow_token, assetPoolCreatePoolStart.flow_token) && Intrinsics.areEqual(this.entry_point, assetPoolCreatePoolStart.entry_point);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Asset Pool CreatePoolStart";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        Double d = this.amount;
        int hashCode = (d == null ? 0 : d.hashCode()) * 31;
        String str = this.flow_token;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.entry_point;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AssetPoolCreatePoolStart(customer_token=null, amount=");
        sb.append(this.amount);
        sb.append(", flow_token=");
        sb.append(this.flow_token);
        sb.append(", entry_point=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.entry_point, ")");
    }
}
