package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.zzc;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public final class zzo implements ServiceConnection, zzr {
    public final /* synthetic */ zzq zza;
    public final HashMap zzb = new HashMap();
    public int zzc = 2;
    public boolean zzd;
    public IBinder zze;
    public final zzn zzf;
    public ComponentName zzg;

    public zzo(zzq zzqVar, zzn zznVar) {
        this.zza = zzqVar;
        this.zzf = zznVar;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzq zzqVar = this.zza;
        synchronized (zzqVar.zzb) {
            try {
                zzqVar.zzd.removeMessages(1, this.zzf);
                this.zze = iBinder;
                this.zzg = componentName;
                Iterator it = this.zzb.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.zzc = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzq zzqVar = this.zza;
        synchronized (zzqVar.zzb) {
            try {
                zzqVar.zzd.removeMessages(1, this.zzf);
                this.zze = null;
                this.zzg = componentName;
                Iterator it = this.zzb.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.zzc = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zza() {
        zzn zznVar = this.zzf;
        zzq zzqVar = this.zza;
        zzqVar.zzd.removeMessages(1, zznVar);
        zzqVar.zzf.unbindService(zzqVar.zzc, this);
        this.zzd = false;
        this.zzc = 2;
    }

    public final void zzb(zze zzeVar, zze zzeVar2) {
        this.zzb.put(zzeVar, zzeVar2);
    }

    public final void zzc(ServiceConnection serviceConnection) {
        this.zzb.remove(serviceConnection);
    }

    public final boolean zzd() {
        return this.zzd;
    }

    public final int zze() {
        return this.zzc;
    }

    public final boolean zzf(ServiceConnection serviceConnection) {
        return this.zzb.containsKey(serviceConnection);
    }

    public final boolean zzg() {
        return this.zzb.isEmpty();
    }

    public final IBinder zzh() {
        return this.zze;
    }

    public final ComponentName zzi() {
        return this.zzg;
    }

    public final ConnectionResult zzj(String str, Executor executor) {
        try {
            Intent zza = zzah.zza(this.zza.zzc, this.zzf);
            this.zzc = 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            if (Build.VERSION.SDK_INT >= 31) {
                StrictMode.setVmPolicy(zzc.zza(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                zzq zzqVar = this.zza;
                ConnectionTracker connectionTracker = zzqVar.zzf;
                Context context = zzqVar.zzc;
                zzn zznVar = this.zzf;
                boolean zzc = connectionTracker.zzc(context, str, zza, this, 4225, executor);
                this.zzd = zzc;
                if (zzc) {
                    zzqVar.zzd.sendMessageDelayed(zzqVar.zzd.obtainMessage(1, zznVar), zzqVar.zzh);
                    ConnectionResult connectionResult = ConnectionResult.RESULT_SUCCESS;
                    StrictMode.setVmPolicy(vmPolicy);
                    return connectionResult;
                }
                this.zzc = 2;
                try {
                    zzqVar.zzf.unbindService(zzqVar.zzc, this);
                } catch (IllegalArgumentException unused) {
                }
                ConnectionResult connectionResult2 = new ConnectionResult(16, null, null);
                StrictMode.setVmPolicy(vmPolicy);
                return connectionResult2;
            } catch (Throwable th) {
                StrictMode.setVmPolicy(vmPolicy);
                throw th;
            }
        } catch (zzaf e) {
            return e.zza;
        }
    }
}
