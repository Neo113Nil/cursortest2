package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.SystemClock;

/* loaded from: classes.dex */
public final class zzoa {
    public long zza;
    public long zzb;
    public final /* synthetic */ zzoc zzc;
    public final zzkb zzd;

    public zzoa(zzoc zzocVar) {
        this.zzc = zzocVar;
        zzic zzicVar = (zzic) zzocVar.$$delegate_0;
        this.zzd = new zzkb(this, zzicVar, 1);
        zzicVar.zzn.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.zza = elapsedRealtime;
        this.zzb = elapsedRealtime;
    }

    public final boolean zzd(long j, boolean z, boolean z2) {
        zzoc zzocVar = this.zzc;
        zzocVar.zzg();
        zzocVar.zzb$1();
        zzic zzicVar = (zzic) zzocVar.$$delegate_0;
        boolean zzB = zzicVar.zzB();
        zzgu zzguVar = zzicVar.zzi;
        if (zzB) {
            zzhh zzhhVar = zzicVar.zzh;
            zzic.zzN(zzhhVar);
            zzhe zzheVar = zzhhVar.zzk;
            zzicVar.zzn.getClass();
            zzheVar.zzb(System.currentTimeMillis());
        }
        long j2 = j - this.zza;
        if (!z && j2 < 1000) {
            zzic.zzP(zzguVar);
            zzguVar.zzl.zzb(Long.valueOf(j2), "Screen exposed for less than 1000 ms. Event not sent. time");
            return false;
        }
        if (!z2) {
            j2 = j - this.zzb;
            this.zzb = j;
        }
        zzic.zzP(zzguVar);
        zzguVar.zzl.zzb(Long.valueOf(j2), "Recording user engagement, ms");
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j2);
        boolean z3 = !zzicVar.zzg.zzv();
        zzmb zzmbVar = zzicVar.zzo;
        zzic.zzO(zzmbVar);
        zzpp.zzay(zzmbVar.zzh(z3), bundle, true);
        if (!z2) {
            zzlj zzljVar = zzicVar.zzp;
            zzic.zzO(zzljVar);
            zzljVar.zzE("auto", "_e", bundle);
        }
        this.zza = j;
        zzkb zzkbVar = this.zzd;
        zzkbVar.zzd();
        zzkbVar.zzb(((Long) zzfy.zzap.zzb(null)).longValue());
        return true;
    }
}
