package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes4.dex */
public final class zzf extends zza {
    public final IBinder zze;
    public final /* synthetic */ BaseGmsClient zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzf(BaseGmsClient baseGmsClient, int i, IBinder iBinder, Bundle bundle) {
        super(baseGmsClient, i, bundle);
        this.zzf = baseGmsClient;
        this.zze = iBinder;
    }

    @Override // com.google.android.gms.common.internal.zza
    public final boolean zza() {
        IBinder iBinder = this.zze;
        try {
            zzae.checkNotNull(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            BaseGmsClient baseGmsClient = this.zzf;
            if (!baseGmsClient.getServiceDescriptor().equals(interfaceDescriptor)) {
                String serviceDescriptor = baseGmsClient.getServiceDescriptor();
                Log.w("GmsClient", JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder(serviceDescriptor.length() + 34 + String.valueOf(interfaceDescriptor).length()), "service descriptor mismatch: ", serviceDescriptor, " vs. ", interfaceDescriptor));
                return false;
            }
            IInterface createServiceInterface = baseGmsClient.createServiceInterface(iBinder);
            if (createServiceInterface == null || !(baseGmsClient.zze(2, 4, createServiceInterface) || baseGmsClient.zze(3, 4, createServiceInterface))) {
                return false;
            }
            baseGmsClient.zzC = null;
            BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks = baseGmsClient.zzw;
            if (baseConnectionCallbacks == null) {
                return true;
            }
            baseConnectionCallbacks.onConnected();
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }

    @Override // com.google.android.gms.common.internal.zza
    public final void zzb(ConnectionResult connectionResult) {
        BaseGmsClient baseGmsClient = this.zzf;
        BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener = baseGmsClient.zzx;
        if (baseOnConnectionFailedListener != null) {
            baseOnConnectionFailedListener.onConnectionFailed(connectionResult);
        }
        baseGmsClient.zzi = connectionResult.zzb;
        baseGmsClient.zzj = System.currentTimeMillis();
    }
}
