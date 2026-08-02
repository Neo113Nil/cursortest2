package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* loaded from: classes.dex */
public final class zzp implements Handler.Callback {
    public final /* synthetic */ zzq zza;

    public /* synthetic */ zzp(zzq zzqVar) {
        this.zza = zzqVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            zzq zzqVar = this.zza;
            synchronized (zzqVar.zzb) {
                try {
                    zzn zznVar = (zzn) message.obj;
                    zzo zzoVar = (zzo) zzqVar.zzb.get(zznVar);
                    if (zzoVar != null && zzoVar.zzg()) {
                        if (zzoVar.zzd()) {
                            zzoVar.zza();
                        }
                        zzqVar.zzb.remove(zznVar);
                    }
                } finally {
                }
            }
            return true;
        }
        if (i != 1) {
            return false;
        }
        zzq zzqVar2 = this.zza;
        synchronized (zzqVar2.zzb) {
            try {
                zzn zznVar2 = (zzn) message.obj;
                zzo zzoVar2 = (zzo) zzqVar2.zzb.get(zznVar2);
                if (zzoVar2 != null && zzoVar2.zze() == 3) {
                    String valueOf = String.valueOf(zznVar2);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 47);
                    sb.append("Timeout waiting for ServiceConnection callback ");
                    sb.append(valueOf);
                    Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                    ComponentName zzi = zzoVar2.zzi();
                    if (zzi == null) {
                        zznVar2.getClass();
                        zzi = null;
                    }
                    if (zzi == null) {
                        String zzb = zznVar2.zzb();
                        zzae.checkNotNull(zzb);
                        zzi = new ComponentName(zzb, "unknown");
                    }
                    zzoVar2.onServiceDisconnected(zzi);
                }
            } finally {
            }
        }
        return true;
    }
}
