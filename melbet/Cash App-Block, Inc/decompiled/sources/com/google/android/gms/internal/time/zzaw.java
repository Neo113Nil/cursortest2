package com.google.android.gms.internal.time;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.google.android.gms.time.Ticks;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class zzaw {
    public final zzg zza;
    public final zzi zzb;
    public final Ticks zzc;
    public final zzco zzd;
    public final zzco zze;

    public zzaw(zzg zzgVar, zzi zziVar, Ticks ticks, List list, List list2) {
        Objects.requireNonNull(zzgVar);
        this.zza = zzgVar;
        Objects.requireNonNull(zziVar);
        this.zzb = zziVar;
        this.zzc = ticks;
        this.zze = zzco.zzj(list);
        this.zzd = zzco.zzj(list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzaw)) {
            return false;
        }
        zzaw zzawVar = (zzaw) obj;
        return Objects.equals(this.zza, zzawVar.zza) && Objects.equals(this.zzb, zzawVar.zzb) && Objects.equals(this.zzc, zzawVar.zzc) && Objects.equals(this.zzd, zzawVar.zzd) && Objects.equals(this.zze, zzawVar.zze);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb, this.zzc, this.zzd, this.zze);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        String valueOf2 = String.valueOf(this.zzb);
        String valueOf3 = String.valueOf(this.zzc);
        String valueOf4 = String.valueOf(this.zzd);
        String valueOf5 = String.valueOf(this.zze);
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("InternalTimeSignal{estimatedError=", valueOf, ", currentTime=", valueOf2, ", acquisitionTicks=");
        Boxes$$ExternalSyntheticOutline1.m(m, valueOf3, ", futureUnixEpochClockAdjustments=", valueOf4, ", pastUnixEpochClockAdjustments=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, valueOf5, "}");
    }
}
