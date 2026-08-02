package com.google.android.gms.internal.measurement;

import java.util.logging.Level;

/* loaded from: classes.dex */
public final /* synthetic */ class zzly implements Runnable {
    public final /* synthetic */ Level zza;
    public final /* synthetic */ Throwable zzb;
    public final /* synthetic */ String zzc;
    public final /* synthetic */ Object[] zzd;

    public /* synthetic */ zzly(Level level, Throwable th, String str, Object[] objArr) {
        this.zza = level;
        this.zzb = th;
        this.zzc = str;
        this.zzd = objArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzxs zzxsVar = zzlx.zza;
        zzaag zzaagVar = (zzaag) zzxsVar.zza$1;
        Level level = this.zza;
        boolean zzb = zzaagVar.zzb(level);
        String str = zzaagVar.zza;
        ((zzaaj) zzaab.zza).getClass();
        zzaap.zza.zzb(str, level, zzb);
        ((zzxp) ((zzxp) (!zzb ? zzxs.zza : new zzxq(zzxsVar, level)).zzo(this.zzb)).zzn()).zzp(this.zzc, this.zzd);
    }
}
