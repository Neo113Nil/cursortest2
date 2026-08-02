package com.squareup.cash.cdf.mintpdp;

import com.google.mlkit.common.internal.zze;
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

/* loaded from: classes.dex */
public final class MintPdpPageViewed implements Event {
    public static final zze Companion = new zze(23);
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String device_type;
    public final String flow_token;
    public final LinkedHashMap parameters;
    public final String payment_device_id;

    public MintPdpPageViewed(String str, String str2, String str3) {
        this.device_type = str;
        this.payment_device_id = str2;
        this.flow_token = str3;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "MintPdp", "cdf_action", "Page");
        Countries.putSafe(m, "device_type", str);
        Countries.putSafe(m, "payment_device_id", str2);
        Countries.putSafe(m, "flow_token", str3);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MintPdpPageViewed)) {
            return false;
        }
        MintPdpPageViewed mintPdpPageViewed = (MintPdpPageViewed) obj;
        return this.device_type.equals(mintPdpPageViewed.device_type) && Intrinsics.areEqual(this.payment_device_id, mintPdpPageViewed.payment_device_id) && Intrinsics.areEqual(this.flow_token, mintPdpPageViewed.flow_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "MintPdp Page Viewed";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = this.device_type.hashCode() * 31;
        String str = this.payment_device_id;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.flow_token;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("MintPdpPageViewed(device_type=", this.device_type, ", payment_device_id=", this.payment_device_id, ", flow_token="), this.flow_token, ")");
    }
}
