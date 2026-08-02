package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes4.dex */
public abstract class zza {
    public final int zza;
    public Boolean zza$1;
    public final Bundle zzb;
    public boolean zzb$1;
    public final /* synthetic */ BaseGmsClient zzc;
    public final /* synthetic */ BaseGmsClient zzd;

    public zza(BaseGmsClient baseGmsClient, int i, Bundle bundle) {
        this.zzc = baseGmsClient;
        Boolean bool = Boolean.TRUE;
        this.zzd = baseGmsClient;
        this.zza$1 = bool;
        this.zzb$1 = false;
        this.zza = i;
        this.zzb = bundle;
    }

    public abstract boolean zza();

    public abstract void zzb(ConnectionResult connectionResult);

    public final void zzd() {
        Boolean bool;
        synchronized (this) {
            try {
                bool = this.zza$1;
                if (this.zzb$1) {
                    String obj = toString();
                    StringBuilder sb = new StringBuilder(obj.length() + 47);
                    sb.append("Callback proxy ");
                    sb.append(obj);
                    sb.append(" being reused. This is not safe.");
                    Log.w("GmsClient", sb.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bool != null) {
            BaseGmsClient baseGmsClient = this.zzc;
            int i = this.zza;
            if (i != 0) {
                baseGmsClient.zzp(1, null);
                Bundle bundle = this.zzb;
                zzb(new ConnectionResult(i, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null, null));
            } else if (!zza()) {
                baseGmsClient.zzp(1, null);
                zzb(new ConnectionResult(8, null, null));
            }
        }
        synchronized (this) {
            this.zzb$1 = true;
        }
        zze();
    }

    public final void zze() {
        zzf();
        BaseGmsClient baseGmsClient = this.zzd;
        synchronized (baseGmsClient.zzt) {
            baseGmsClient.zzt.remove(this);
        }
    }

    public final void zzf() {
        synchronized (this) {
            this.zza$1 = null;
        }
    }
}
