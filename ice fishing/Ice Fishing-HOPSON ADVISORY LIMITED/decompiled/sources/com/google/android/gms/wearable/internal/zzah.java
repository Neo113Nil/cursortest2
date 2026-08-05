package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.net.Uri;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.CapabilityApi;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
public final class zzah implements CapabilityApi {
    @Override // com.google.android.gms.wearable.CapabilityApi
    public final PendingResult<Status> addCapabilityListener(GoogleApiClient googleApiClient, CapabilityApi.CapabilityListener capabilityListener, String str) {
        com.google.android.gms.internal.wearable.zzai.zzd(str, "capability must not be null");
        zzac zzacVar = new zzac(capabilityListener, str);
        IntentFilter zza = zzjd.zza("com.google.android.gms.wearable.CAPABILITY_CHANGED");
        if (!str.startsWith("/")) {
            String.valueOf(str);
            str = "/".concat(String.valueOf(str));
        }
        zza.addDataPath(str, 0);
        return zze.zza(googleApiClient, new zzaa(new IntentFilter[]{zza}), zzacVar);
    }

    @Override // com.google.android.gms.wearable.CapabilityApi
    public final PendingResult<Status> addListener(GoogleApiClient googleApiClient, CapabilityApi.CapabilityListener capabilityListener, Uri uri, int i) {
        boolean z;
        com.google.android.gms.internal.wearable.zzai.zzd(uri, "uri must not be null");
        if (i == 0) {
            z = true;
        } else if (i == 1) {
            i = 1;
            z = true;
        } else {
            z = false;
        }
        com.google.android.gms.internal.wearable.zzai.zzb(z, "invalid filter type");
        return zze.zza(googleApiClient, new zzaa(new IntentFilter[]{zzjd.zzb("com.google.android.gms.wearable.CAPABILITY_CHANGED", uri, i)}), capabilityListener);
    }

    @Override // com.google.android.gms.wearable.CapabilityApi
    public final PendingResult<CapabilityApi.AddLocalCapabilityResult> addLocalCapability(GoogleApiClient googleApiClient, String str) {
        return googleApiClient.enqueue(new zzy(this, googleApiClient, str));
    }

    @Override // com.google.android.gms.wearable.CapabilityApi
    public final PendingResult<CapabilityApi.GetAllCapabilitiesResult> getAllCapabilities(GoogleApiClient googleApiClient, int i) {
        boolean z = true;
        if (i != 0) {
            if (i == 1) {
                i = 1;
            } else {
                z = false;
            }
        }
        com.google.android.gms.internal.wearable.zzai.zza(z);
        return googleApiClient.enqueue(new zzx(this, googleApiClient, i));
    }

    @Override // com.google.android.gms.wearable.CapabilityApi
    public final PendingResult<CapabilityApi.GetCapabilityResult> getCapability(GoogleApiClient googleApiClient, String str, int i) {
        boolean z = true;
        if (i != 0) {
            if (i == 1) {
                i = 1;
            } else {
                z = false;
            }
        }
        com.google.android.gms.internal.wearable.zzai.zza(z);
        return googleApiClient.enqueue(new zzw(this, googleApiClient, str, i));
    }

    @Override // com.google.android.gms.wearable.CapabilityApi
    public final PendingResult<Status> removeCapabilityListener(GoogleApiClient googleApiClient, CapabilityApi.CapabilityListener capabilityListener, String str) {
        return googleApiClient.enqueue(new zzag(googleApiClient, new zzac(capabilityListener, str), null));
    }

    @Override // com.google.android.gms.wearable.CapabilityApi
    public final PendingResult<Status> removeListener(GoogleApiClient googleApiClient, CapabilityApi.CapabilityListener capabilityListener) {
        return googleApiClient.enqueue(new zzag(googleApiClient, capabilityListener, null));
    }

    @Override // com.google.android.gms.wearable.CapabilityApi
    public final PendingResult<CapabilityApi.RemoveLocalCapabilityResult> removeLocalCapability(GoogleApiClient googleApiClient, String str) {
        return googleApiClient.enqueue(new zzz(this, googleApiClient, str));
    }
}
