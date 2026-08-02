package com.google.android.libraries.places.internal;

import java.io.IOException;

/* loaded from: classes4.dex */
public abstract class zzbwi implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final Object zza;

    public /* synthetic */ zzbwi(Object obj, int i) {
        this.$r8$classId = i;
        this.zza = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        Object obj = this.zza;
        switch (i) {
            case 0:
                zzbpv zzbpvVar = (zzbpv) obj;
                zzbpv zzb = zzbpvVar.zzb();
                try {
                    zza();
                    return;
                } finally {
                    zzbpvVar.zzc(zzb);
                }
            default:
                zzchc zzchcVar = (zzchc) obj;
                try {
                    if (zzchcVar.zzh == null) {
                        throw new IOException("Unable to perform write due to unavailable sink.");
                    }
                    zza();
                    return;
                } catch (Exception e) {
                    zzchcVar.zzd.zzg(e);
                    return;
                }
        }
    }

    public abstract void zza();
}
