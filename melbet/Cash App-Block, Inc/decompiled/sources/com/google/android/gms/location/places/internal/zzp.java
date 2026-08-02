package com.google.android.gms.location.places.internal;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.internal.GmsClient;

/* loaded from: classes4.dex */
public final class zzp extends GmsClient {
    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.places.internal.IGooglePlacesService");
        return queryLocalInterface instanceof zzv ? (zzv) queryLocalInterface : new zzv(iBinder);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getServiceDescriptor() {
        return "com.google.android.gms.location.places.internal.IGooglePlacesService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getStartServiceAction() {
        return "com.google.android.gms.location.places.GeoDataApi";
    }
}
