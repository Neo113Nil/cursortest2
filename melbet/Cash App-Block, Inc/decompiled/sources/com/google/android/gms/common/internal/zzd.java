package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.internal.common.zzc;

/* loaded from: classes4.dex */
public final class zzd extends com.google.android.gms.internal.base.zab {
    public BaseGmsClient zza;
    public final int zzb;

    public zzd(BaseGmsClient baseGmsClient, int i) {
        super("com.google.android.gms.common.internal.IGmsCallbacks", 1);
        this.zza = baseGmsClient;
        this.zzb = i;
    }

    @Override // com.google.android.gms.internal.base.zab
    public final boolean zza(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            int readInt = parcel.readInt();
            IBinder readStrongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) zzc.zzb(parcel, Bundle.CREATOR);
            zzc.zzf(parcel);
            zzae.checkNotNull(this.zza, "onPostInitComplete can be called only once per call to getRemoteService");
            BaseGmsClient baseGmsClient = this.zza;
            int i2 = this.zzb;
            baseGmsClient.getClass();
            zzf zzfVar = new zzf(baseGmsClient, readInt, readStrongBinder, bundle);
            zzb zzbVar = baseGmsClient.zzb;
            zzbVar.sendMessage(zzbVar.obtainMessage(1, i2, -1, zzfVar));
            this.zza = null;
        } else if (i == 2) {
            parcel.readInt();
            zzc.zzf(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i != 3) {
                return false;
            }
            int readInt2 = parcel.readInt();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            zzj zzjVar = (zzj) zzc.zzb(parcel, zzj.CREATOR);
            zzc.zzf(parcel);
            BaseGmsClient baseGmsClient2 = this.zza;
            zzae.checkNotNull(baseGmsClient2, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            zzae.checkNotNull(zzjVar);
            baseGmsClient2.zzE = zzjVar;
            if (baseGmsClient2.usesClientTelemetry()) {
                ConnectionTelemetryConfiguration connectionTelemetryConfiguration = zzjVar.zzd;
                RootTelemetryConfigManager rootTelemetryConfigManager = RootTelemetryConfigManager.getInstance();
                RootTelemetryConfiguration rootTelemetryConfiguration = connectionTelemetryConfiguration == null ? null : connectionTelemetryConfiguration.zza;
                synchronized (rootTelemetryConfigManager) {
                    if (rootTelemetryConfiguration == null) {
                        rootTelemetryConfiguration = RootTelemetryConfigManager.zzb;
                    } else {
                        RootTelemetryConfiguration rootTelemetryConfiguration2 = rootTelemetryConfigManager.zzc;
                        if (rootTelemetryConfiguration2 != null) {
                            if (rootTelemetryConfiguration2.zza < rootTelemetryConfiguration.zza) {
                            }
                        }
                    }
                    rootTelemetryConfigManager.zzc = rootTelemetryConfiguration;
                }
            }
            Bundle bundle2 = zzjVar.zza;
            zzae.checkNotNull(this.zza, "onPostInitComplete can be called only once per call to getRemoteService");
            BaseGmsClient baseGmsClient3 = this.zza;
            int i3 = this.zzb;
            baseGmsClient3.getClass();
            zzf zzfVar2 = new zzf(baseGmsClient3, readInt2, readStrongBinder2, bundle2);
            zzb zzbVar2 = baseGmsClient3.zzb;
            zzbVar2.sendMessage(zzbVar2.obtainMessage(1, i3, -1, zzfVar2));
            this.zza = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
