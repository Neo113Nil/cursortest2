package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
public final class zzeve implements zzexp {
    public final Bundle zza;

    public zzeve(Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzexp
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle zza = zzfhv.zza(bundle, DeviceRequestsHelper.DEVICE_INFO_DEVICE);
        zza.putBundle("android_mem_info", this.zza);
        bundle.putBundle(DeviceRequestsHelper.DEVICE_INFO_DEVICE, zza);
    }
}
