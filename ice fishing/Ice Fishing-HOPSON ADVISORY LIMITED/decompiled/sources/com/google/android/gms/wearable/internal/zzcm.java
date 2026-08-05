package com.google.android.gms.wearable.internal;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
public final class zzcm extends zzgh {
    private final Object zza = new Object();
    private zzcn zzb;
    private zzbp zzc;

    public final void zzb(zzcn zzcnVar) {
        zzbp zzbpVar;
        synchronized (this.zza) {
            zzcn zzcnVar2 = zzcnVar;
            this.zzb = zzcnVar;
            zzbpVar = this.zzc;
        }
        if (zzbpVar != null) {
            zzcnVar.zza(zzbpVar);
        }
    }

    @Override // com.google.android.gms.wearable.internal.zzgi
    public final void zzc(int i, int i2) {
        zzcn zzcnVar;
        zzbp zzbpVar;
        synchronized (this.zza) {
            zzcnVar = this.zzb;
            zzbpVar = new zzbp(i, i2);
            this.zzc = zzbpVar;
        }
        if (zzcnVar != null) {
            zzcnVar.zza(zzbpVar);
        }
    }
}
