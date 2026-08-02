package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.common.util.Clock;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
final class zzemf implements zzgej {
    final /* synthetic */ long zza;
    final /* synthetic */ zzfgp zzb;
    final /* synthetic */ zzfgm zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ zzfnu zze;
    final /* synthetic */ zzfgy zzf;
    final /* synthetic */ zzemh zzg;

    zzemf(zzemh zzemhVar, long j, zzfgp zzfgpVar, zzfgm zzfgmVar, String str, zzfnu zzfnuVar, zzfgy zzfgyVar) {
        this.zza = j;
        this.zzb = zzfgpVar;
        this.zzc = zzfgmVar;
        this.zzd = str;
        this.zze = zzfnuVar;
        this.zzf = zzfgyVar;
        this.zzg = zzemhVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0066 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzgej
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(Throwable th) {
        Clock clock;
        Integer num;
        int i;
        com.google.android.gms.ads.internal.client.zze zzb;
        boolean z;
        boolean z2;
        LinkedHashMap linkedHashMap;
        com.google.android.gms.ads.internal.client.zze zzeVar;
        zzeis zzeisVar;
        zzfny zzfnyVar;
        zzemj zzemjVar;
        clock = this.zzg.zza;
        long elapsedRealtime = clock.elapsedRealtime() - this.zza;
        if (th instanceof TimeoutException) {
            i = 2;
        } else if (th instanceof zzelp) {
            i = 3;
        } else if (th instanceof CancellationException) {
            i = 4;
        } else if (th instanceof zzfho) {
            i = 5;
        } else {
            if (th instanceof zzead) {
                r7 = zzfij.zza(th).zza == 3 ? 1 : 6;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzbC)).booleanValue() && (th instanceof zzeir) && (zzb = ((zzeir) th).zzb()) != null) {
                    num = Integer.valueOf(zzb.zza);
                    i = r7;
                    synchronized (this.zzg) {
                        zzemh zzemhVar = this.zzg;
                        z = zzemhVar.zze;
                        if (z) {
                            zzemjVar = zzemhVar.zzb;
                            zzemjVar.zza(this.zzb, this.zzc, i, th instanceof zzeir ? (zzeir) th : null, elapsedRealtime);
                        }
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zzij)).booleanValue()) {
                            zzfnyVar = this.zzg.zzc;
                            zzfnu zzfnuVar = this.zze;
                            zzfgy zzfgyVar = this.zzf;
                            zzfgm zzfgmVar = this.zzc;
                            zzfnyVar.zzd(zzfnuVar.zzc(zzfgyVar, zzfgmVar, zzfgmVar.zzo));
                        }
                        zzemh zzemhVar2 = this.zzg;
                        z2 = zzemhVar2.zzg;
                        if (z2) {
                            return;
                        }
                        linkedHashMap = zzemhVar2.zzd;
                        zzfgm zzfgmVar2 = this.zzc;
                        linkedHashMap.put(zzfgmVar2, new zzemg(this.zzd, zzfgmVar2.zzag, i, elapsedRealtime, num));
                        com.google.android.gms.ads.internal.client.zze zza = zzfij.zza(th);
                        int i2 = zza.zza;
                        if ((i2 == 3 || i2 == 0) && (zzeVar = zza.zzd) != null && !zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN)) {
                            zza = zzfij.zza(new zzeir(13, zza.zzd));
                        }
                        zzeisVar = this.zzg.zzf;
                        zzeisVar.zzf(this.zzc, elapsedRealtime, zza);
                        return;
                    }
                }
            }
            num = null;
            i = r7;
            synchronized (this.zzg) {
            }
        }
        num = null;
        synchronized (this.zzg) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgej
    public final void zzb(Object obj) {
        Clock clock;
        boolean z;
        boolean z2;
        boolean zzq;
        LinkedHashMap linkedHashMap;
        zzeis zzeisVar;
        LinkedHashMap linkedHashMap2;
        zzemj zzemjVar;
        clock = this.zzg.zza;
        long elapsedRealtime = clock.elapsedRealtime() - this.zza;
        synchronized (this.zzg) {
            zzemh zzemhVar = this.zzg;
            z = zzemhVar.zze;
            if (z) {
                zzemjVar = zzemhVar.zzb;
                zzemjVar.zza(this.zzb, this.zzc, 0, null, elapsedRealtime);
            }
            zzemh zzemhVar2 = this.zzg;
            z2 = zzemhVar2.zzg;
            if (z2) {
                return;
            }
            zzq = zzemhVar2.zzq(this.zzc);
            if (zzq) {
                linkedHashMap2 = this.zzg.zzd;
                ((zzemg) linkedHashMap2.get(this.zzc)).zzd = elapsedRealtime;
            } else {
                linkedHashMap = this.zzg.zzd;
                zzfgm zzfgmVar = this.zzc;
                linkedHashMap.put(zzfgmVar, new zzemg(this.zzd, zzfgmVar.zzag, 0, elapsedRealtime, null));
            }
            zzeisVar = this.zzg.zzf;
            zzeisVar.zzg(this.zzc, elapsedRealtime, null);
        }
    }
}
