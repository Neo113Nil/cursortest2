package com.google.android.gms.common.internal.service;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.internal.base.zad;

/* loaded from: classes4.dex */
public final class zab extends GmsClient {
    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientNotificationTelemetryService");
        return queryLocalInterface instanceof zaj ? (zaj) queryLocalInterface : new zaj(iBinder, "com.google.android.gms.common.internal.service.IClientNotificationTelemetryService", 0);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] getApiFeatures() {
        return zad.zac;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final int getMinApkVersion() {
        return 253600000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getServiceDescriptor() {
        return "com.google.android.gms.common.internal.service.IClientNotificationTelemetryService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getStartServiceAction() {
        return "com.google.android.gms.common.telemetry.notification.service.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean getUseDynamicLookup() {
        return true;
    }
}
