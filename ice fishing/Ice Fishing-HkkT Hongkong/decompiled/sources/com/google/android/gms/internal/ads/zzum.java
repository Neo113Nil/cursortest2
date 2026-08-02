package com.google.android.gms.internal.ads;

import android.util.Pair;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
public final class zzum extends zzwu {
    private final boolean zzb;
    private final zzcw zzc;
    private final zzcu zzd;
    private zzuk zze;
    private zzuj zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    public zzum(zzut zzutVar, boolean z) {
        super(zzutVar);
        boolean z2;
        if (z) {
            zzutVar.zzv();
            z2 = true;
        } else {
            z2 = false;
        }
        this.zzb = z2;
        this.zzc = new zzcw();
        this.zzd = new zzcu();
        zzutVar.zzM();
        this.zze = zzuk.zzq(zzutVar.zzJ());
    }

    private final Object zzK(Object obj) {
        Object obj2;
        Object obj3;
        obj2 = this.zze.zzf;
        if (obj2 == null || !obj.equals(zzuk.zzd)) {
            return obj;
        }
        obj3 = this.zze.zzf;
        return obj3;
    }

    @RequiresNonNull({"unpreparedMaskingMediaPeriod"})
    private final void zzL(long j) {
        zzuj zzujVar = this.zzf;
        int zza = this.zze.zza(zzujVar.zza.zza);
        if (zza == -1) {
            return;
        }
        zzuk zzukVar = this.zze;
        zzcu zzcuVar = this.zzd;
        zzukVar.zzd(zza, zzcuVar, false);
        long j2 = zzcuVar.zze;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        zzujVar.zzs(j);
    }

    public final zzcx zzC() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    protected final zzur zzD(zzur zzurVar) {
        Object obj;
        Object obj2;
        obj = this.zze.zzf;
        Object obj3 = zzurVar.zza;
        if (obj != null) {
            obj2 = this.zze.zzf;
            if (obj2.equals(obj3)) {
                obj3 = zzuk.zzd;
            }
        }
        return zzurVar.zza(obj3);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0082  */
    @Override // com.google.android.gms.internal.ads.zzwu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void zzE(zzcx zzcxVar) {
        long j;
        zzuj zzujVar;
        zzur zzurVar = null;
        if (this.zzh) {
            this.zze = this.zze.zzp(zzcxVar);
            zzuj zzujVar2 = this.zzf;
            if (zzujVar2 != null) {
                zzL(zzujVar2.zzn());
            }
        } else if (zzcxVar.zzo()) {
            this.zze = this.zzi ? this.zze.zzp(zzcxVar) : zzuk.zzr(zzcxVar, zzcw.zza, zzuk.zzd);
        } else {
            zzcxVar.zze(0, this.zzc, 0L);
            Object obj = this.zzc.zzc;
            zzuj zzujVar3 = this.zzf;
            if (zzujVar3 != null) {
                long zzq = zzujVar3.zzq();
                this.zze.zzn(zzujVar3.zza.zza, this.zzd);
                this.zze.zze(0, this.zzc, 0L);
                if (zzq != 0) {
                    j = zzq;
                    Pair zzl = zzcxVar.zzl(this.zzc, this.zzd, 0, j);
                    Object obj2 = zzl.first;
                    long longValue = ((Long) zzl.second).longValue();
                    this.zze = !this.zzi ? this.zze.zzp(zzcxVar) : zzuk.zzr(zzcxVar, obj, obj2);
                    zzujVar = this.zzf;
                    if (zzujVar != null) {
                        zzL(longValue);
                        zzur zzurVar2 = zzujVar.zza;
                        zzurVar = zzurVar2.zza(zzK(zzurVar2.zza));
                    }
                }
            }
            j = 0;
            Pair zzl2 = zzcxVar.zzl(this.zzc, this.zzd, 0, j);
            Object obj22 = zzl2.first;
            long longValue2 = ((Long) zzl2.second).longValue();
            this.zze = !this.zzi ? this.zze.zzp(zzcxVar) : zzuk.zzr(zzcxVar, obj, obj22);
            zzujVar = this.zzf;
            if (zzujVar != null) {
            }
        }
        this.zzi = true;
        this.zzh = true;
        zzo(this.zze);
        if (zzurVar != null) {
            zzuj zzujVar4 = this.zzf;
            zzujVar4.getClass();
            zzujVar4.zzr(zzurVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwu
    public final void zzF() {
        if (this.zzb) {
            return;
        }
        this.zzg = true;
        zzB(null, ((zzwu) this).zza);
    }

    @Override // com.google.android.gms.internal.ads.zzwu, com.google.android.gms.internal.ads.zzut
    public final void zzG(zzup zzupVar) {
        ((zzuj) zzupVar).zzt();
        if (zzupVar == this.zzf) {
            this.zzf = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwu, com.google.android.gms.internal.ads.zzut
    /* renamed from: zzH, reason: merged with bridge method [inline-methods] */
    public final zzuj zzI(zzur zzurVar, zzyx zzyxVar, long j) {
        zzuj zzujVar = new zzuj(zzurVar, zzyxVar, j);
        zzujVar.zzu(this.zza);
        if (this.zzh) {
            zzujVar.zzr(zzurVar.zza(zzK(zzurVar.zza)));
        } else {
            this.zzf = zzujVar;
            if (!this.zzg) {
                this.zzg = true;
                zzB(null, ((zzwu) this).zza);
            }
        }
        return zzujVar;
    }

    @Override // com.google.android.gms.internal.ads.zzua, com.google.android.gms.internal.ads.zzts
    public final void zzq() {
        this.zzh = false;
        this.zzg = false;
        super.zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzts, com.google.android.gms.internal.ads.zzut
    public final void zzt(zzbp zzbpVar) {
        if (this.zzi) {
            this.zze = this.zze.zzp(new zzwq(this.zze.zzc, zzbpVar));
        } else {
            this.zze = zzuk.zzq(zzbpVar);
        }
        this.zza.zzt(zzbpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzua, com.google.android.gms.internal.ads.zzut
    public final void zzz() {
    }
}
