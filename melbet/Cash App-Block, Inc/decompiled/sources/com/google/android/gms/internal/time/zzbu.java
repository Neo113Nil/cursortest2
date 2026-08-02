package com.google.android.gms.internal.time;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.time.zzb;

/* loaded from: classes4.dex */
public final class zzbu extends GmsClient {
    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.time.trustedtime.internal.ITrustedTimeService");
        return queryLocalInterface instanceof zzat ? (zzat) queryLocalInterface : new zzat(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] getApiFeatures() {
        return zzb.zzb;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final int getMinApkVersion() {
        return 240600000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getServiceDescriptor() {
        return "com.google.android.gms.time.trustedtime.internal.ITrustedTimeService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getStartServiceAction() {
        return "com.google.android.gms.time.trustedtime.service.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean getUseDynamicLookup() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean usesClientTelemetry() {
        return true;
    }
}
