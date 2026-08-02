package com.google.android.libraries.places.internal;

import com.android.volley.Response;
import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableSet;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes4.dex */
public final class zzcfm {
    public final int zza;
    public final long zzb;
    public final long zzc;
    public final double zzd;
    public final Long zze;
    public final ImmutableSet zzf;

    public zzcfm(int i, long j, long j2, double d, Long l, Set set) {
        this.zza = i;
        this.zzb = j;
        this.zzc = j2;
        this.zzd = d;
        this.zze = l;
        this.zzf = ImmutableSet.copyOf((Collection) set);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzcfm)) {
            return false;
        }
        zzcfm zzcfmVar = (zzcfm) obj;
        return this.zza == zzcfmVar.zza && this.zzb == zzcfmVar.zzb && this.zzc == zzcfmVar.zzc && Double.compare(this.zzd, zzcfmVar.zzd) == 0 && Objects.equals(this.zze, zzcfmVar.zze) && Objects.equals(this.zzf, zzcfmVar.zzf);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.zza), Long.valueOf(this.zzb), Long.valueOf(this.zzc), Double.valueOf(this.zzd), this.zze, this.zzf);
    }

    public final String toString() {
        Response stringHelper = Ascii.toStringHelper(this);
        stringHelper.addUnconditionalHolder("maxAttempts", String.valueOf(this.zza));
        stringHelper.add(this.zzb, "initialBackoffNanos");
        stringHelper.add(this.zzc, "maxBackoffNanos");
        stringHelper.addUnconditionalHolder("backoffMultiplier", String.valueOf(this.zzd));
        stringHelper.add(this.zze, "perAttemptRecvTimeoutNanos");
        stringHelper.add(this.zzf, "retryableStatusCodes");
        return stringHelper.toString();
    }
}
