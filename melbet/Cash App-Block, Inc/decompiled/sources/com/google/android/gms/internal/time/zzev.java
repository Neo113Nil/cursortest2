package com.google.android.gms.internal.time;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class zzev {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ zzev(int i) {
        this.$r8$classId = i;
    }

    private final void zza$com$google$android$gms$internal$time$zzev(zzdq zzdqVar, Iterator it, zzem zzemVar) {
    }

    public final void zza(zzdq zzdqVar, Iterator it, zzem zzemVar) {
        switch (this.$r8$classId) {
            case 0:
                break;
            default:
                if (!zzdqVar.zzc) {
                    a$$ExternalSyntheticBUOutline0.m$1("non repeating key");
                    break;
                } else if (zzdqVar.zzd && ((zzhh) zzhh.zza.get()).zzb > 20) {
                    while (it.hasNext()) {
                        zzemVar.zza(it.next(), zzdqVar.zza);
                    }
                    break;
                } else {
                    zzdqVar.zza(it, zzemVar);
                    break;
                }
                break;
        }
    }
}
