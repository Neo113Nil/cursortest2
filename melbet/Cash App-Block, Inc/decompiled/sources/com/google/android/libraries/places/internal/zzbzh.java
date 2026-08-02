package com.google.android.libraries.places.internal;

import com.android.volley.Response;
import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableSet;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes4.dex */
public final class zzbzh {
    public final int zza;
    public final long zzb;
    public final ImmutableSet zzc;

    public zzbzh(int i, long j, Set set) {
        this.zza = i;
        this.zzb = j;
        this.zzc = ImmutableSet.copyOf((Collection) set);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzbzh.class != obj.getClass()) {
            return false;
        }
        zzbzh zzbzhVar = (zzbzh) obj;
        return this.zza == zzbzhVar.zza && this.zzb == zzbzhVar.zzb && Objects.equals(this.zzc, zzbzhVar.zzc);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.zza), Long.valueOf(this.zzb), this.zzc);
    }

    public final String toString() {
        Response stringHelper = Ascii.toStringHelper(this);
        stringHelper.addUnconditionalHolder("maxAttempts", String.valueOf(this.zza));
        stringHelper.add(this.zzb, "hedgingDelayNanos");
        stringHelper.add(this.zzc, "nonFatalStatusCodes");
        return stringHelper.toString();
    }
}
