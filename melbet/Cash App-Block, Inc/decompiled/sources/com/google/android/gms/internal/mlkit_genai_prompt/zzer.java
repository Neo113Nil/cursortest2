package com.google.android.gms.internal.mlkit_genai_prompt;

import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public abstract class zzer {
    public final zzct zza;
    public final zzku zzb;
    public final zzfn zze;
    public final zzzx zzf;
    public final Executor zzg;
    public final Object zzh = new Object();
    public zzjz zzi;
    public zzla zzj;
    public zzjz zzk;

    public zzer(zzct zzctVar, zzfn zzfnVar, zzzx zzzxVar) {
        this.zze = zzfnVar;
        this.zza = zzctVar;
        this.zzf = zzzxVar;
        this.zzb = zzfnVar.zzf;
        this.zzg = zzfnVar.zzg;
    }

    public final zzjj zzc(Object obj) {
        synchronized (this.zzh) {
            try {
                zzla zzlaVar = this.zzj;
                zzfn zzfnVar = this.zze;
                if (zzlaVar == zzfnVar.zzu().zza()) {
                    if (this.zzi == null) {
                    }
                }
                this.zzi = zzki.zzh(zzjz.zzw(zzfnVar.zzu().zza()), new zzds(this, 3), this.zzb);
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzki.zzh(zzki.zzh(zzjz.zzw(this.zzi), new zzds(this, 2), this.zzb), new zzdz(this, obj, 1), this.zzb);
    }

    public abstract zzal zze(Object obj, Object obj2, zzeo zzeoVar);

    public abstract Object zzg(zzad zzadVar);

    public final ListenableFuture zzv() {
        ListenableFuture zzh;
        zzjz zzjzVar;
        synchronized (this.zzh) {
            try {
                zzla zzlaVar = this.zzj;
                zzfn zzfnVar = this.zze;
                if (zzlaVar == zzfnVar.zzu().zza() && (zzjzVar = this.zzk) != null) {
                    return zzjzVar;
                }
                zzzx zzzxVar = this.zzf;
                int i = 0;
                if (zzfnVar.zzl) {
                    zzct zzctVar = this.zza;
                    zzfnVar.zzv();
                    zzh = zzki.zzh(zzjz.zzw(zzki.zzh(zzki.zzg(zzjz.zzw(zzfnVar.zzu().zza()), new zzet(), zzjx.zza), new zzeu(zzctVar, i), zzfnVar.zzf)), new zzdz(this, zzzxVar, i), this.zzb);
                } else {
                    Log.i("zzer", "Auto-download is disabled, skipping download.");
                    zzh = zzkm.zza;
                }
                zzjz zzw = zzjz.zzw(zzh);
                zzds zzdsVar = new zzds(this, 4);
                zzku zzkuVar = this.zzb;
                zzjj zzh2 = zzki.zzh(zzki.zzh(zzw, zzdsVar, zzkuVar), new zzds(this, i), zzkuVar);
                this.zzk = zzh2;
                this.zzj = zzfnVar.zzu().zza();
                zzh2.addListener(new zzfq(3, zzh2, new zzeo(this)), zzjx.zza);
                return zzh2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
