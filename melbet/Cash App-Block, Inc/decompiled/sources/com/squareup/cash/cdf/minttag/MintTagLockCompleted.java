package com.squareup.cash.cdf.minttag;

import com.google.mlkit.common.internal.zza;
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
public final class MintTagLockCompleted implements Event {
    public static final zza Companion = new zza(24);
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String device_id;
    public final DeviceType device_type;
    public final Long duration_ms;
    public final String flow_token;
    public final LinkedHashMap parameters;

    public MintTagLockCompleted(DeviceType deviceType, String str, String str2, Long l) {
        this.device_type = deviceType;
        this.device_id = str;
        this.flow_token = str2;
        this.duration_ms = l;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 6, "MintTag", "cdf_action", "Lock");
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
        if (!(obj instanceof MintTagLockCompleted)) {
            return false;
        }
        MintTagLockCompleted mintTagLockCompleted = (MintTagLockCompleted) obj;
        return this.device_type == mintTagLockCompleted.device_type && Intrinsics.areEqual(this.device_id, mintTagLockCompleted.device_id) && Intrinsics.areEqual(this.flow_token, mintTagLockCompleted.flow_token) && this.duration_ms.equals(mintTagLockCompleted.duration_ms);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "MintTag Lock Completed";
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
        return "MintTagLockCompleted(device_type=" + this.device_type + ", device_id=" + this.device_id + ", flow_token=" + this.flow_token + ", duration_ms=" + this.duration_ms + ")";
    }
}
