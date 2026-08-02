package com.google.android.gms.internal.time;

import android.content.Context;
import com.google.android.gms.auth.api.zbc;
import com.google.android.gms.tasks.Task;

/* loaded from: classes4.dex */
public final class zzbj {
    public static final zzbj zzb = new zzbj(new zzdg(4));
    public final Object zzc = new Object();
    public Task zzd;
    public int zze;
    public final zzdg zzf;

    public zzbj(zzdg zzdgVar) {
        this.zzf = zzdgVar;
    }

    public final String toString() {
        String str;
        synchronized (this.zzc) {
            str = "ShareableTimeSignalSupplierManager{shareableSimpleClientInitializerFactory=" + String.valueOf(this.zzf) + ", createShareableTimeSignalSupplierAdapterTask=" + String.valueOf(this.zzd) + ", usageCount=" + this.zze + "}";
        }
        return str;
    }

    public final Task zzb(Context context) {
        synchronized (this.zzc) {
            try {
                Task task = this.zzd;
                if (task != null) {
                    this.zze++;
                    return task.continueWithTask(zzhk.zza, new zzdg(5));
                }
                zzah zzahVar = new zzah(context.getApplicationContext(), zzah.zza);
                this.zze = 1;
                Task zzc = zzahVar.zzc();
                zzhk zzhkVar = zzhk.zza;
                Task continueWithTask = zzc.continueWithTask(zzhkVar, new zbc((Object) this, (Object) zzahVar, false, 14));
                this.zzd = continueWithTask;
                return continueWithTask.continueWithTask(zzhkVar, new zzdg(6));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
