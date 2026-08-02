package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class zzaaf {
    public final zzabl zza = zzabl.zza;
    public final String zzb;

    public zzaaf(String str) {
        this.zzb = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzaaf)) {
            return false;
        }
        zzaaf zzaafVar = (zzaaf) obj;
        return this.zza.equals(zzaafVar.zza) && this.zzb.equals(zzaafVar.zzb);
    }

    public final int hashCode() {
        return this.zzb.hashCode() ^ this.zza.hashCode();
    }
}
