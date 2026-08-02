package com.google.android.gms.measurement.internal;

import android.os.SystemClock;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzkb extends zzaz {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzkb(zzlj zzljVar, zzjg zzjgVar) {
        super(zzjgVar);
        this.$r8$classId = 0;
        Objects.requireNonNull(zzljVar);
        this.zza = zzljVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzaz
    public final void zza() {
        int i = this.$r8$classId;
        Object obj = this.zza;
        switch (i) {
            case 0:
                ((zzlj) obj).zzC();
                break;
            case 1:
                zzoa zzoaVar = (zzoa) obj;
                zzoc zzocVar = zzoaVar.zzc;
                zzocVar.zzg();
                zzic zzicVar = (zzic) zzocVar.$$delegate_0;
                zzicVar.zzn.getClass();
                zzoaVar.zzd(SystemClock.elapsedRealtime(), false, false);
                zzd zzdVar = zzicVar.zzq;
                zzic.zzM(zzdVar);
                zzicVar.zzn.getClass();
                zzdVar.zzc(SystemClock.elapsedRealtime());
                break;
            default:
                zzok zzokVar = (zzok) obj;
                zzokVar.zzf$1();
                zzgu zzguVar = ((zzic) zzokVar.$$delegate_0).zzi;
                zzic.zzP(zzguVar);
                zzguVar.zzl.zza("Starting upload from DelayedRunnable");
                zzokVar.zzg.zzM();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zzkb(Object obj, zzjg zzjgVar, int i) {
        super(zzjgVar);
        this.$r8$classId = i;
        this.zza = obj;
    }
}
