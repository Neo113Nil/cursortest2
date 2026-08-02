package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.compose.runtime.Latch;

/* loaded from: classes4.dex */
public final /* synthetic */ class zzv implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ zzlj zza;

    public /* synthetic */ zzv(zzlj zzljVar, int i) {
        this.$r8$classId = i;
        this.zza = zzljVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        zzlj zzljVar = this.zza;
        switch (i) {
            case 0:
                zzljVar.zzw();
                break;
            case 1:
                zzljVar.zzw();
                break;
            case 2:
                zzx zzxVar = zzljVar.zzb;
                zzic zzicVar = zzxVar.zza;
                zzhz zzhzVar = zzicVar.zzj;
                zzlj zzljVar2 = zzicVar.zzp;
                zzhh zzhhVar = zzicVar.zzh;
                zzic.zzP(zzhzVar);
                zzhzVar.zzg();
                if (zzxVar.zze()) {
                    if (zzxVar.zzd()) {
                        zzic.zzN(zzhhVar);
                        zzhhVar.zzr.zzb(null);
                        Bundle bundle = new Bundle();
                        bundle.putString("source", "(not set)");
                        bundle.putString("medium", "(not set)");
                        bundle.putString("_cis", "intent");
                        bundle.putLong("_cc", 1L);
                        zzic.zzO(zzljVar2);
                        zzljVar2.zzE("auto", "_cmpx", bundle);
                    } else {
                        zzic.zzN(zzhhVar);
                        Latch latch = zzhhVar.zzr;
                        String zza = latch.zza();
                        if (TextUtils.isEmpty(zza)) {
                            zzgu zzguVar = zzicVar.zzi;
                            zzic.zzP(zzguVar);
                            zzguVar.zze.zza("Cache still valid but referrer not found");
                        } else {
                            long j = 3600000;
                            long zza2 = zzhhVar.zzs.zza() / 3600000;
                            Uri parse = Uri.parse(zza);
                            Bundle bundle2 = new Bundle();
                            Pair pair = new Pair(parse.getPath(), bundle2);
                            for (String str : parse.getQueryParameterNames()) {
                                bundle2.putString(str, parse.getQueryParameter(str));
                                j = j;
                            }
                            ((Bundle) pair.second).putLong("_cc", (zza2 - 1) * j);
                            Object obj = pair.first;
                            String str2 = obj == null ? "app" : (String) obj;
                            zzic.zzO(zzljVar2);
                            zzljVar2.zzE(str2, "_cmp", (Bundle) pair.second);
                        }
                        latch.zzb(null);
                    }
                    zzic.zzN(zzhhVar);
                    zzhhVar.zzs.zzb(0L);
                    break;
                }
                break;
            default:
                zzljVar.zzg();
                zzic zzicVar2 = (zzic) zzljVar.$$delegate_0;
                zzhh zzhhVar2 = zzicVar2.zzh;
                zzgu zzguVar2 = zzicVar2.zzi;
                zzic.zzN(zzhhVar2);
                zzhc zzhcVar = zzhhVar2.zzo;
                if (zzhcVar.zza()) {
                    zzic.zzP(zzguVar2);
                    zzguVar2.zzk.zza("Deferred Deep Link already retrieved. Not fetching again.");
                    break;
                } else {
                    zzhe zzheVar = zzhhVar2.zzp;
                    long zza3 = zzheVar.zza();
                    zzheVar.zzb(1 + zza3);
                    if (zza3 >= 5) {
                        zzic.zzP(zzguVar2);
                        zzguVar2.zzg.zza("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                        zzhcVar.zzb(true);
                        break;
                    } else {
                        if (zzljVar.zzq == null) {
                            zzljVar.zzq = new zzju((zzjg) zzljVar, (zzjg) zzicVar2, 2);
                        }
                        zzljVar.zzq.zzb(0L);
                        break;
                    }
                }
        }
    }
}
