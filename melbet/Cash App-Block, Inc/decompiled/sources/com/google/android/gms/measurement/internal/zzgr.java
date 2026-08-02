package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import app.cash.molecule.PlatformKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes.dex */
public final class zzgr implements Runnable {
    public final /* synthetic */ int zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ Object zzc;
    public final /* synthetic */ Object zzd;
    public final /* synthetic */ Object zze;
    public final /* synthetic */ zzgu zzf;

    public zzgr(zzgu zzguVar, int i, String str, Object obj, Object obj2, Object obj3) {
        this.zza = i;
        this.zzb = str;
        this.zzc = obj;
        this.zzd = obj2;
        this.zze = obj3;
        this.zzf = zzguVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzgu zzguVar = this.zzf;
        zzhh zzhhVar = ((zzic) zzguVar.$$delegate_0).zzh;
        zzic.zzN(zzhhVar);
        if (!zzhhVar.zza) {
            Log.println(6, zzguVar.zzn(), "Persisted config not initialized. Not logging error/warn");
            return;
        }
        if (zzguVar.zza == 0) {
            zzal zzalVar = ((zzic) zzguVar.$$delegate_0).zzg;
            if (zzalVar.zzd == null) {
                synchronized (zzalVar) {
                    try {
                        if (zzalVar.zzd == null) {
                            zzic zzicVar = (zzic) zzalVar.$$delegate_0;
                            ApplicationInfo applicationInfo = zzicVar.zzd.getApplicationInfo();
                            if (PlatformKt.zza == null) {
                                PlatformKt.zza = Application.getProcessName();
                            }
                            String str = PlatformKt.zza;
                            if (applicationInfo != null) {
                                String str2 = applicationInfo.processName;
                                zzalVar.zzd = Boolean.valueOf(str2 != null && str2.equals(str));
                            }
                            if (zzalVar.zzd == null) {
                                zzalVar.zzd = Boolean.TRUE;
                                zzgu zzguVar2 = zzicVar.zzi;
                                zzic.zzP(zzguVar2);
                                zzguVar2.zzd.zza("My process not in the list of running processes");
                            }
                        }
                    } finally {
                    }
                }
            }
            if (zzalVar.zzd.booleanValue()) {
                zzguVar.zza = 'C';
            } else {
                zzguVar.zza = 'c';
            }
        }
        if (zzguVar.zzb < 0) {
            ((zzic) zzguVar.$$delegate_0).zzg.zzi();
            zzguVar.zzb = 161000L;
        }
        int i = this.zza;
        char c = zzguVar.zza;
        long j = zzguVar.zzb;
        String str3 = this.zzb;
        Object obj = this.zzc;
        Object obj2 = this.zzd;
        Object obj3 = this.zze;
        char charAt = "01VDIWEA?".charAt(i);
        String zzo = zzgu.zzo(true, str3, obj, obj2, obj3);
        StringBuilder sb = new StringBuilder(JsonLogicResult$Success$$ExternalSyntheticOutline0.m$1(String.valueOf(charAt).length() + 1, String.valueOf(c).length(), String.valueOf(j).length(), 1) + zzo.length());
        sb.append("2");
        sb.append(charAt);
        sb.append(c);
        sb.append(j);
        sb.append(":");
        sb.append(zzo);
        String sb2 = sb.toString();
        if (sb2.length() > 1024) {
            sb2 = str3.substring(0, 1024);
        }
        zzhf zzhfVar = zzhhVar.zzb;
        if (zzhfVar != null) {
            String str4 = (String) zzhfVar.zzd;
            zzhh zzhhVar2 = (zzhh) zzhfVar.zzb;
            zzhhVar2.zzg();
            if (((zzhh) zzhfVar.zzb).zzd().getLong((String) zzhfVar.zza, 0L) == 0) {
                zzhfVar.zzc();
            }
            SharedPreferences zzd = zzhhVar2.zzd();
            String str5 = (String) zzhfVar.zzc;
            long j2 = zzd.getLong(str5, 0L);
            if (j2 <= 0) {
                SharedPreferences.Editor edit = zzhhVar2.zzd().edit();
                edit.putString(str4, sb2);
                edit.putLong(str5, 1L);
                edit.apply();
                return;
            }
            zzpp zzppVar = ((zzic) zzhhVar2.$$delegate_0).zzl;
            zzic.zzN(zzppVar);
            long nextLong = zzppVar.zzf().nextLong() & Long.MAX_VALUE;
            long j3 = j2 + 1;
            long j4 = Long.MAX_VALUE / j3;
            SharedPreferences.Editor edit2 = zzhhVar2.zzd().edit();
            if (nextLong < j4) {
                edit2.putString(str4, sb2);
            }
            edit2.putLong(str5, j3);
            edit2.apply();
        }
    }
}
