package com.squareup.cash.cdf.minttag;

import com.google.mlkit.common.internal.zzd;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class MintTagUnlockCompleted implements Event {
    public static final zzd Companion = new zzd(24);
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String device_id;
    public final DeviceType device_type;
    public final Long duration_ms;
    public final String flow_token;
    public final LinkedHashMap parameters;

    public MintTagUnlockCompleted(DeviceType deviceType, String str, String str2, Long l) {
        this.device_type = deviceType;
        this.device_id = str;
        this.flow_token = str2;
        this.duration_ms = l;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 6, "MintTag", "cdf_action", "Unlock");
        Countries.putSafe(m, "device_type", deviceType);
        Countries.putSafe(m, "device_id", str);
        Countries.putSafe(m, "flow_token", str2);
        Countries.putSafe(m, "duration_ms", l);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MintTagUnlockCompleted)) {
            return false;
        }
        MintTagUnlockCompleted mintTagUnlockCompleted = (MintTagUnlockCompleted) obj;
        return this.device_type == mintTagUnlockCompleted.device_type && Intrinsics.areEqual(this.device_id, mintTagUnlockCompleted.device_id) && Intrinsics.areEqual(this.flow_token, mintTagUnlockCompleted.flow_token) && this.duration_ms.equals(mintTagUnlockCompleted.duration_ms);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "MintTag Unlock Completed";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        DeviceType deviceType = this.device_type;
        int hashCode = (deviceType == null ? 0 : deviceType.hashCode()) * 31;
        String str = this.device_id;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.flow_token;
        return this.duration_ms.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "MintTagUnlockCompleted(device_type=" + this.device_type + ", device_id=" + this.device_id + ", flow_token=" + this.flow_token + ", duration_ms=" + this.duration_ms + ")";
    }
}
