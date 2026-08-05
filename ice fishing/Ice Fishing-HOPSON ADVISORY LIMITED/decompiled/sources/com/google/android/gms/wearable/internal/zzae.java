package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.CapabilityApi;
import com.google.android.gms.wearable.CapabilityInfo;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
public final class zzae implements CapabilityApi.GetAllCapabilitiesResult {
    private final Status zza;
    private final Map zzb;

    public zzae(Status status, Map map) {
        this.zza = status;
        this.zzb = map;
    }

    @Override // com.google.android.gms.wearable.CapabilityApi.GetAllCapabilitiesResult
    public final Map<String, CapabilityInfo> getAllCapabilities() {
        return this.zzb;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.zza;
    }
}
