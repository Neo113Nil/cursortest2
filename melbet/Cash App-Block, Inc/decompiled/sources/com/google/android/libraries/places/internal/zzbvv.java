package com.google.android.libraries.places.internal;

import java.util.Objects;

/* loaded from: classes4.dex */
public final class zzbvv {
    public String zza = "unknown-authority";
    public zzbor zzb = zzbor.zza;
    public String zzc;
    public zzbqm zzd;

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbvv)) {
            return false;
        }
        zzbvv zzbvvVar = (zzbvv) obj;
        return this.zza.equals(zzbvvVar.zza) && this.zzb.equals(zzbvvVar.zzb) && Objects.equals(this.zzc, zzbvvVar.zzc) && Objects.equals(this.zzd, zzbvvVar.zzd);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb, this.zzc, this.zzd);
    }
}
