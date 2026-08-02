package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes4.dex */
public final class zze implements ServiceConnection {
    public final /* synthetic */ BaseGmsClient zza;
    public final int zzb;

    public zze(BaseGmsClient baseGmsClient, int i) {
        this.zza = baseGmsClient;
        this.zzb = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i;
        int i2;
        BaseGmsClient baseGmsClient = this.zza;
        if (iBinder == null) {
            synchronized (baseGmsClient.zzp) {
                i = baseGmsClient.zzv;
            }
            if (i == 3) {
                baseGmsClient.zzD = true;
                i2 = 5;
            } else {
                i2 = 4;
            }
            zzb zzbVar = baseGmsClient.zzb;
            zzbVar.sendMessage(zzbVar.obtainMessage(i2, baseGmsClient.zzd.get(), 16));
            return;
        }
        synchronized (baseGmsClient.zzq) {
            try {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                baseGmsClient.zzr = (queryLocalInterface == null || !(queryLocalInterface instanceof zzaa)) ? new zzaa(iBinder) : (zzaa) queryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        BaseGmsClient baseGmsClient2 = this.zza;
        int i3 = this.zzb;
        baseGmsClient2.getClass();
        zzg zzgVar = new zzg(baseGmsClient2, 0, null);
        zzb zzbVar2 = baseGmsClient2.zzb;
        zzbVar2.sendMessage(zzbVar2.obtainMessage(7, i3, -1, zzgVar));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        BaseGmsClient baseGmsClient = this.zza;
        synchronized (baseGmsClient.zzq) {
            baseGmsClient.zzr = null;
        }
        BaseGmsClient baseGmsClient2 = this.zza;
        int i = this.zzb;
        zzb zzbVar = baseGmsClient2.zzb;
        zzbVar.sendMessage(zzbVar.obtainMessage(6, i, 1));
    }
}
