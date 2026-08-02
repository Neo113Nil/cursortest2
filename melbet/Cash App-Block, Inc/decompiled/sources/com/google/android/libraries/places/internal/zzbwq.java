package com.google.android.libraries.places.internal;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class zzbwq implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ zzcbr zza;

    public zzbwq(zzcbr zzcbrVar, int i) {
        this.$r8$classId = i;
        switch (i) {
            case 1:
                Objects.requireNonNull(zzcbrVar);
                this.zza = zzcbrVar;
                break;
            default:
                this.zza = zzcbrVar;
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.zza.zzg.zzd();
                return;
            default:
                zzcbr zzcbrVar = this.zza;
                zzcby zzcbyVar = zzcbrVar.zzd.zza;
                LinkedHashSet linkedHashSet = zzcbyVar.zzI;
                if (linkedHashSet != null) {
                    linkedHashSet.remove(zzcbrVar);
                    if (zzcbyVar.zzI.isEmpty()) {
                        zzcbyVar.zzf.zza(zzcbyVar.zzJ, false);
                        zzcbyVar.zzI = null;
                        if (zzcbyVar.zzM.get()) {
                            zzyr zzyrVar = zzcbyVar.zzL;
                            zzbtx zzbtxVar = zzcby.zzc;
                            synchronized (zzyrVar.zzc) {
                                try {
                                    if (((zzbtx) zzyrVar.zze) == null) {
                                        zzyrVar.zze = zzbtxVar;
                                        boolean isEmpty = ((HashSet) zzyrVar.zzd).isEmpty();
                                        if (isEmpty) {
                                            ((zzcby) zzyrVar.zzf).zzK.zzd(zzbtxVar);
                                        }
                                    }
                                } finally {
                                }
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
