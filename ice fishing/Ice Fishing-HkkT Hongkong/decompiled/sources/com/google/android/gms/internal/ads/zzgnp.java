package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
public final class zzgnp extends zzggq {
    private final zzgoy zza;

    public zzgnp(zzgoy zzgoyVar) {
        this.zza = zzgoyVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgnp)) {
            return false;
        }
        zzgoy zzgoyVar = ((zzgnp) obj).zza;
        return this.zza.zzc().zzf().equals(zzgoyVar.zzc().zzf()) && this.zza.zzc().zzh().equals(zzgoyVar.zzc().zzh()) && this.zza.zzc().zzg().equals(zzgoyVar.zzc().zzg());
    }

    public final int hashCode() {
        zzgoy zzgoyVar = this.zza;
        return Objects.hash(zzgoyVar.zzc(), zzgoyVar.zzd());
    }

    public final String toString() {
        String zzh = this.zza.zzc().zzh();
        zzgvz zzf = this.zza.zzc().zzf();
        zzgvz zzgvzVar = zzgvz.UNKNOWN_PREFIX;
        int ordinal = zzf.ordinal();
        return String.format("(typeUrl=%s, outputPrefixType=%s)", zzh, ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK");
    }

    @Override // com.google.android.gms.internal.ads.zzggq
    public final boolean zza() {
        throw null;
    }

    public final zzgoy zzb() {
        return this.zza;
    }
}
