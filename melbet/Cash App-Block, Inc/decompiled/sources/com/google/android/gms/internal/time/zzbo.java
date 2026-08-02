package com.google.android.gms.internal.time;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class zzbo {
    public final zzaw zza;

    public zzbo(zzaw zzawVar) {
        Objects.requireNonNull(zzawVar);
        this.zza = zzawVar;
    }

    public static long[] zza(long j, List list) {
        boolean z;
        Iterator it;
        if (list.isEmpty()) {
            return new long[]{0, 0};
        }
        long j2 = 0;
        boolean z2 = true;
        long[] jArr = {0, 0};
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            zzm zzmVar = (zzm) it2.next();
            if (Math.abs(j2) >= Math.abs(j)) {
                break;
            }
            long zzc = zzmVar.zza.zzc();
            if (Math.abs(j2) < Math.abs(zzc)) {
                if (Math.abs(zzc) >= Math.abs(j)) {
                    break;
                }
                j2 = zzc;
            }
            long zzc2 = zzmVar.zzc.zzc();
            long zzc3 = zzmVar.zzd.zzc();
            long zzc4 = zzmVar.zzb.zzc();
            long zza = zzbz.zza(j2, zzc4);
            if (Math.abs(zza) > Math.abs(j)) {
                z = z2;
                it = it2;
                j2 = zzbz.zzc(j, j2);
                double d = j2 / zzc4;
                jArr[0] = jArr[0] + ((int) (zzc2 * d));
                jArr[z ? 1 : 0] = jArr[z ? 1 : 0] + ((int) (zzc3 * d));
            } else {
                z = z2;
                it = it2;
                jArr[0] = jArr[0] + zzc2;
                jArr[z ? 1 : 0] = jArr[z ? 1 : 0] + zzc3;
                j2 = zza;
            }
            it2 = it;
            z2 = z;
        }
        return jArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzbo.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.zza, ((zzbo) obj).zza);
    }

    public final int hashCode() {
        return Objects.hash(this.zza);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("TimeSignalAdapter{internalTimeSignal=", String.valueOf(this.zza), "}");
    }
}
