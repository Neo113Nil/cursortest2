package com.google.android.gms.internal.measurement;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class zzzl {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ zzzl(int i) {
        this.$r8$classId = i;
    }

    private final void zza$com$google$android$gms$internal$measurement$zzzl(zzyl zzylVar, Iterator it, zzzc zzzcVar) {
    }

    public final void zza(zzyl zzylVar, Iterator it, zzzc zzzcVar) {
        switch (this.$r8$classId) {
            case 0:
                break;
            default:
                if (!zzylVar.zzc) {
                    a$$ExternalSyntheticBUOutline0.m$1("non repeating key");
                    break;
                } else if (zzylVar.zzd && ((zzabt) zzabt.zza.get()).zzb > 20) {
                    while (it.hasNext()) {
                        zzzcVar.zza(it.next(), zzylVar.zza);
                    }
                    break;
                } else {
                    zzylVar.zza(it, zzzcVar);
                    break;
                }
                break;
        }
    }
}
