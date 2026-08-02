package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
public final class zzig implements Runnable {
    public final /* synthetic */ String zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ String zzc;
    public final /* synthetic */ long zzd;
    public final /* synthetic */ zzjd zze;

    public zzig(zzjd zzjdVar, String str, String str2, String str3, long j) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = j;
        this.zze = zzjdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.zzb;
        zzjd zzjdVar = this.zze;
        String str2 = this.zza;
        if (str2 == null) {
            zzpg zzpgVar = zzjdVar.zza;
            zzpgVar.zzaX().zzg();
            String str3 = zzpgVar.zzH;
            if (str3 == null || str3.equals(str)) {
                zzpgVar.zzH = str;
                zzpgVar.zzG = null;
                return;
            }
            return;
        }
        zzlu zzluVar = new zzlu(this.zzc, str2, this.zzd);
        zzpg zzpgVar2 = zzjdVar.zza;
        zzpgVar2.zzaX().zzg();
        String str4 = zzpgVar2.zzH;
        if (str4 != null) {
            str4.equals(str);
        }
        zzpgVar2.zzH = str;
        zzpgVar2.zzG = zzluVar;
    }
}
