package com.google.android.gms.measurement.internal;

import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.zzae;

/* loaded from: classes4.dex */
public final class zza implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String zza;
    public final /* synthetic */ long zzb;
    public final /* synthetic */ zzd zzc;

    public /* synthetic */ zza(zzd zzdVar, String str, long j, int i) {
        this.$r8$classId = i;
        this.zza = str;
        this.zzb = j;
        this.zzc = zzdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        long j = this.zzb;
        String str = this.zza;
        zzd zzdVar = this.zzc;
        switch (i) {
            case 0:
                zzdVar.zzg();
                zzae.checkNotEmpty(str);
                ArrayMap arrayMap = zzdVar.zzb;
                if (arrayMap.isEmpty()) {
                    zzdVar.zzc = j;
                }
                Integer num = (Integer) arrayMap.get(str);
                if (num == null) {
                    if (arrayMap.size < 100) {
                        arrayMap.put(str, 1);
                        zzdVar.zza.put(str, Long.valueOf(j));
                        break;
                    } else {
                        zzgu zzguVar = ((zzic) zzdVar.$$delegate_0).zzi;
                        zzic.zzP(zzguVar);
                        zzguVar.zzg.zza("Too many ads visible");
                        break;
                    }
                } else {
                    arrayMap.put(str, Integer.valueOf(num.intValue() + 1));
                    break;
                }
            default:
                zzdVar.zzg();
                zzae.checkNotEmpty(str);
                ArrayMap arrayMap2 = zzdVar.zzb;
                Integer num2 = (Integer) arrayMap2.get(str);
                zzic zzicVar = (zzic) zzdVar.$$delegate_0;
                if (num2 == null) {
                    zzgu zzguVar2 = zzicVar.zzi;
                    zzic.zzP(zzguVar2);
                    zzguVar2.zzd.zzb(str, "Call to endAdUnitExposure for unknown ad unit id");
                    break;
                } else {
                    zzmb zzmbVar = zzicVar.zzo;
                    zzgu zzguVar3 = zzicVar.zzi;
                    zzic.zzO(zzmbVar);
                    zzlu zzh = zzmbVar.zzh(false);
                    int intValue = num2.intValue() - 1;
                    if (intValue != 0) {
                        arrayMap2.put(str, Integer.valueOf(intValue));
                        break;
                    } else {
                        arrayMap2.remove(str);
                        ArrayMap arrayMap3 = zzdVar.zza;
                        Long l = (Long) arrayMap3.get(str);
                        if (l == null) {
                            zzic.zzP(zzguVar3);
                            zzguVar3.zzd.zza("First ad unit exposure time was never set");
                        } else {
                            long longValue = j - l.longValue();
                            arrayMap3.remove(str);
                            zzdVar.zzi(str, longValue, zzh);
                        }
                        if (arrayMap2.isEmpty()) {
                            long j2 = zzdVar.zzc;
                            if (j2 != 0) {
                                zzdVar.zzh(j - j2, zzh);
                                zzdVar.zzc = 0L;
                                break;
                            } else {
                                zzic.zzP(zzguVar3);
                                zzguVar3.zzd.zza("First ad exposure time was never set");
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }
}
