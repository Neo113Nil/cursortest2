package com.google.android.gms.measurement.internal;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.fillr.core.FillrEnv$EnumUnboxingLocalUtility;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.internal.measurement.zzahh;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class zzie implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ zzr zza;
    public final /* synthetic */ zzjd zzb;

    public /* synthetic */ zzie(zzjd zzjdVar, zzr zzrVar, int i) {
        this.$r8$classId = i;
        this.zza = zzrVar;
        this.zzb = zzjdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        zzr zzrVar = this.zza;
        zzjd zzjdVar = this.zzb;
        switch (i) {
            case 0:
                zzjdVar.zza.zzaa$1();
                zzjdVar.zza.zzai(zzrVar);
                break;
            case 1:
                zzjdVar.zza.zzaa$1();
                zzpg zzpgVar = zzjdVar.zza;
                zzpgVar.zzaX().zzg();
                zzpgVar.zzu$3();
                zzae.checkNotNull(zzrVar);
                String str = zzrVar.zza;
                zzae.checkNotEmpty(str);
                int i2 = 0;
                if (zzpgVar.zzd().zzp(null, zzfy.zzay)) {
                    zzpgVar.zzba().getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    int zzm = zzpgVar.zzd().zzm(null, zzfy.zzah);
                    zzpgVar.zzd();
                    long longValue = currentTimeMillis - ((Long) zzfy.zzd.zzb(null)).longValue();
                    while (i2 < zzm && zzpgVar.zzaH(longValue, null)) {
                        i2++;
                    }
                } else {
                    zzpgVar.zzd();
                    long intValue = ((Integer) zzfy.zzk.zzb(null)).intValue();
                    while (i2 < intValue && zzpgVar.zzaH(0L, str)) {
                        i2++;
                    }
                }
                if (zzpgVar.zzd().zzp(null, zzfy.zzaz)) {
                    zzpgVar.zzaX().zzg();
                    zzpgVar.zzaG();
                }
                zzou zzouVar = zzpgVar.zzl;
                int _zzb = FillrEnv$EnumUnboxingLocalUtility._zzb(zzrVar.zzE);
                zzouVar.zzg();
                if (_zzb == 2 && !zzou.zzf(str)) {
                    zzht zzhtVar = zzouVar.zzg.zzc;
                    zzpg.zzaT(zzhtVar);
                    com.google.android.gms.internal.measurement.zzgl zzb = zzhtVar.zzb(str);
                    if (zzb != null && zzb.zzp() && !zzb.zzq().zzd().isEmpty()) {
                        zzpgVar.zzaW().zzl.zzb(str, "[sgtm] Going background, trigger client side upload. appId");
                        zzpgVar.zzba().getClass();
                        zzpgVar.zzN(System.currentTimeMillis(), str);
                        break;
                    }
                }
                break;
            case 2:
                zzjdVar.zza.zzaa$1();
                zzpg zzpgVar2 = zzjdVar.zza;
                zzpgVar2.zzaX().zzg();
                zzpgVar2.zzu$3();
                zzae.checkNotEmpty(zzrVar.zza);
                zzpgVar2.zzap(zzrVar);
                break;
            case 3:
                zzjdVar.zza.zzaa$1();
                zzpg zzpgVar3 = zzjdVar.zza;
                if (zzpgVar3.zzz != null) {
                    ArrayList arrayList = new ArrayList();
                    zzpgVar3.zzA = arrayList;
                    arrayList.addAll(zzpgVar3.zzz);
                }
                zzaw zzawVar = zzpgVar3.zze;
                zzpg.zzaT(zzawVar);
                zzic zzicVar = (zzic) zzawVar.$$delegate_0;
                String str2 = zzrVar.zza;
                zzae.checkNotNull(str2);
                zzae.checkNotEmpty(str2);
                zzawVar.zzg();
                zzawVar.zzay();
                try {
                    SQLiteDatabase zze = zzawVar.zze();
                    String[] strArr = {str2};
                    int delete = zze.delete("apps", "app_id=?", strArr) + zze.delete("events", "app_id=?", strArr) + zze.delete("events_snapshot", "app_id=?", strArr) + zze.delete("user_attributes", "app_id=?", strArr) + zze.delete("conditional_properties", "app_id=?", strArr) + zze.delete("raw_events", "app_id=?", strArr) + zze.delete("raw_events_metadata", "app_id=?", strArr) + zze.delete("queue", "app_id=?", strArr) + zze.delete("audience_filter_values", "app_id=?", strArr) + zze.delete("main_event_params", "app_id=?", strArr) + zze.delete("default_event_params", "app_id=?", strArr) + zze.delete("trigger_uris", "app_id=?", strArr) + zze.delete("upload_queue", "app_id=?", strArr);
                    zzahh.zza();
                    if (zzicVar.zzg.zzp(null, zzfy.zzbc)) {
                        delete += zze.delete("no_data_mode_events", "app_id=?", strArr);
                    }
                    int delete2 = delete + zze.delete("diagnostic_signals", "app_id=?", strArr);
                    if (delete2 > 0) {
                        zzgu zzguVar = zzicVar.zzi;
                        zzic.zzP(zzguVar);
                        zzguVar.zzl.zzc("Reset analytics data. app, records", str2, Integer.valueOf(delete2));
                    }
                } catch (SQLiteException e) {
                    zzgu zzguVar2 = zzicVar.zzi;
                    zzic.zzP(zzguVar2);
                    zzguVar2.zzd.zzc("Error resetting analytics data. appId, error", zzgu.zzl(str2), e);
                }
                if (zzrVar.zzh) {
                    zzpgVar3.zzai(zzrVar);
                    break;
                }
                break;
            case 4:
                zzjdVar.zza.zzaa$1();
                zzpg zzpgVar4 = zzjdVar.zza;
                zzpgVar4.zzaX().zzg();
                zzpgVar4.zzu$3();
                zzae.checkNotEmpty(zzrVar.zza);
                zzpgVar4.zzv(zzrVar);
                zzpgVar4.zzw(zzrVar);
                break;
            case 5:
                zzpg zzpgVar5 = zzjdVar.zza;
                zzpgVar5.zzaa$1();
                zzpgVar5.zzw(zzrVar);
                break;
            default:
                zzpg zzpgVar6 = zzjdVar.zza;
                zzpgVar6.zzaa$1();
                zzpgVar6.zzv(zzrVar);
                break;
        }
    }
}
