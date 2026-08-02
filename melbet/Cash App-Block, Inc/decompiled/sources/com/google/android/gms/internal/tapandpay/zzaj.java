package com.google.android.gms.internal.tapandpay;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.tapandpay.zza;

/* loaded from: classes4.dex */
public final class zzaj extends GmsClient {
    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.tapandpay.internal.ITapAndPayService");
        return queryLocalInterface instanceof zzd ? (zzd) queryLocalInterface : new zzd(iBinder, "com.google.android.gms.tapandpay.internal.ITapAndPayService");
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] getApiFeatures() {
        return zza.zzD;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Bundle getGetServiceRequestExtraArgs() {
        Bundle bundle = new Bundle();
        bundle.putString("sdk_version", "18.3.3");
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final int getMinApkVersion() {
        return 12800000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getServiceDescriptor() {
        return "com.google.android.gms.tapandpay.internal.ITapAndPayService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getStartServiceAction() {
        return "com.google.android.gms.tapandpay.service.BIND";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean usesClientTelemetry() {
        return true;
    }
}
