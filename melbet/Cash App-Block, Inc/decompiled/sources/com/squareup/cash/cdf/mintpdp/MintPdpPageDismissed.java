package com.squareup.cash.cdf.mintpdp;

import com.google.mlkit.common.internal.zzd;
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
public final class MintPdpPageDismissed implements Event {
    public static final zzd Companion = new zzd(23);
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String device_type;
    public final String flow_token;
    public final LinkedHashMap parameters;
    public final String payment_device_id;
    public final Long time_on_page_ms;

    public MintPdpPageDismissed(String str, String str2, String str3, Long l) {
        this.device_type = str;
        this.payment_device_id = str2;
        this.time_on_page_ms = l;
        this.flow_token = str3;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 6, "MintPdp", "cdf_action", "Page");
        Countries.putSafe(m, "device_type", str);
        Countries.putSafe(m, "payment_device_id", str2);
        Countries.putSafe(m, "time_on_page_ms", l);
        Countries.putSafe(m, "flow_token", str3);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MintPdpPageDismissed)) {
            return false;
        }
        MintPdpPageDismissed mintPdpPageDismissed = (MintPdpPageDismissed) obj;
        return this.device_type.equals(mintPdpPageDismissed.device_type) && this.payment_device_id.equals(mintPdpPageDismissed.payment_device_id) && Intrinsics.areEqual(this.time_on_page_ms, mintPdpPageDismissed.time_on_page_ms) && Intrinsics.areEqual(this.flow_token, mintPdpPageDismissed.flow_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "MintPdp Page Dismissed";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.device_type.hashCode() * 31, 31, this.payment_device_id);
        Long l = this.time_on_page_ms;
        int hashCode = (m + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.flow_token;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("MintPdpPageDismissed(device_type=", this.device_type, ", payment_device_id=", this.payment_device_id, ", time_on_page_ms=");
        m.append(this.time_on_page_ms);
        m.append(", flow_token=");
        m.append(this.flow_token);
        m.append(")");
        return m.toString();
    }
}
