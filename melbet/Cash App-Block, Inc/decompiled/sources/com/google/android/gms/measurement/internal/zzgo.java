package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.zzae;

/* loaded from: classes4.dex */
public final class zzgo extends BaseGmsClient {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzgo(Context context, Looper looper, BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        super(context, looper, r3, r4, 93, baseConnectionCallbacks, baseOnConnectionFailedListener, null);
        com.google.android.gms.common.internal.zzq zzqVar = com.google.android.gms.common.internal.zzq.getInstance(context);
        GoogleApiAvailabilityLight googleApiAvailabilityLight = GoogleApiAvailabilityLight.zza;
        zzae.checkNotNull(baseConnectionCallbacks);
        zzae.checkNotNull(baseOnConnectionFailedListener);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return queryLocalInterface instanceof zzgb ? (zzgb) queryLocalInterface : new zzfz(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getServiceDescriptor() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getStartServiceAction() {
        return "com.google.android.gms.measurement.START";
    }
}
