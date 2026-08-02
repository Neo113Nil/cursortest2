package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
public final class zzetk implements zzexp {
    public final double zza;
    public final boolean zzb;

    public zzetk(double d, boolean z) {
        this.zza = d;
        this.zzb = z;
    }

    @Override // com.google.android.gms.internal.ads.zzexp
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle zza = zzfhv.zza(bundle, DeviceRequestsHelper.DEVICE_INFO_DEVICE);
        bundle.putBundle(DeviceRequestsHelper.DEVICE_INFO_DEVICE, zza);
        Bundle zza2 = zzfhv.zza(zza, "battery");
        zza.putBundle("battery", zza2);
        zza2.putBoolean("is_charging", this.zzb);
        zza2.putDouble("battery_level", this.zza);
    }
}
