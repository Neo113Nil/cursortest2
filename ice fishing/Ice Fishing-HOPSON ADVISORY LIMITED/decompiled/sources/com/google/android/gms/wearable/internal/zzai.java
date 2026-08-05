package com.google.android.gms.wearable.internal;

import com.google.android.gms.wearable.CapabilityClient;
import com.google.android.gms.wearable.CapabilityInfo;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
final class zzai implements CapabilityClient.OnCapabilityChangedListener {
    final CapabilityClient.OnCapabilityChangedListener zza;
    final String zzb;

    zzai(CapabilityClient.OnCapabilityChangedListener onCapabilityChangedListener, String str) {
        this.zza = onCapabilityChangedListener;
        this.zzb = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zzai zzaiVar = (zzai) obj;
        if (this.zza.equals(zzaiVar.zza)) {
            return this.zzb.equals(zzaiVar.zzb);
        }
        return false;
    }

    public final int hashCode() {
        return (this.zza.hashCode() * 31) + this.zzb.hashCode();
    }

    @Override // com.google.android.gms.wearable.CapabilityClient.OnCapabilityChangedListener, com.google.android.gms.wearable.CapabilityApi.CapabilityListener
    public final void onCapabilityChanged(CapabilityInfo capabilityInfo) {
        this.zza.onCapabilityChanged(capabilityInfo);
    }
}
