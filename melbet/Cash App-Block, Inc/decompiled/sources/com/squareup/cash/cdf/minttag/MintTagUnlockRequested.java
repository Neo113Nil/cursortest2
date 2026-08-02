package com.squareup.cash.cdf.minttag;

import com.google.mlkit.common.internal.zza;
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
public final class MintTagUnlockRequested implements Event {
    public static final zza Companion = new zza(25);
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String device_id;
    public final DeviceType device_type;
    public final String flow_token;
    public final LinkedHashMap parameters;

    public MintTagUnlockRequested(DeviceType deviceType, String str, String str2) {
        this.device_type = deviceType;
        this.device_id = str;
        this.flow_token = str2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "MintTag", "cdf_action", "Unlock");
        Countries.putSafe(m, "device_type", deviceType);
        Countries.putSafe(m, "device_id", str);
        Countries.putSafe(m, "flow_token", str2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MintTagUnlockRequested)) {
            return false;
        }
        MintTagUnlockRequested mintTagUnlockRequested = (MintTagUnlockRequested) obj;
        return this.device_type == mintTagUnlockRequested.device_type && Intrinsics.areEqual(this.device_id, mintTagUnlockRequested.device_id) && Intrinsics.areEqual(this.flow_token, mintTagUnlockRequested.flow_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "MintTag Unlock Requested";
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
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MintTagUnlockRequested(device_type=");
        sb.append(this.device_type);
        sb.append(", device_id=");
        sb.append(this.device_id);
        sb.append(", flow_token=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.flow_token, ")");
    }
}
