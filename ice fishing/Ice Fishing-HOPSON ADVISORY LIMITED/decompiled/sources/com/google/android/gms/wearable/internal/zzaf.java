package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.CapabilityApi;
import com.google.android.gms.wearable.CapabilityInfo;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
public final class zzaf implements CapabilityApi.GetCapabilityResult {
    private final CapabilityInfo zza;
    private final Status zzb;

    public zzaf(Status status, CapabilityInfo capabilityInfo) {
        this.zzb = status;
        this.zza = capabilityInfo;
    }

    @Override // com.google.android.gms.wearable.CapabilityApi.GetCapabilityResult
    public final CapabilityInfo getCapability() {
        return this.zza;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.zzb;
    }
}
