package com.google.android.gms.wearable.internal;

import com.google.android.gms.wearable.CapabilityApi;
import com.google.android.gms.wearable.CapabilityInfo;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
final class zzac implements CapabilityApi.CapabilityListener {
    final CapabilityApi.CapabilityListener zza;
    final String zzb;

    zzac(CapabilityApi.CapabilityListener capabilityListener, String str) {
        this.zza = capabilityListener;
        this.zzb = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zzac zzacVar = (zzac) obj;
        if (this.zza.equals(zzacVar.zza)) {
            return this.zzb.equals(zzacVar.zzb);
        }
        return false;
    }

    public final int hashCode() {
        return (this.zza.hashCode() * 31) + this.zzb.hashCode();
    }

    @Override // com.google.android.gms.wearable.CapabilityApi.CapabilityListener
    public final void onCapabilityChanged(CapabilityInfo capabilityInfo) {
        this.zza.onCapabilityChanged(capabilityInfo);
    }
}
