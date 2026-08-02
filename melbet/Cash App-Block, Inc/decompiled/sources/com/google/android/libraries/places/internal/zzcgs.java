package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzcgs implements zzcgu {
    public final zzbuj zza;

    public zzcgs(zzbuj zzbujVar) {
        zzbujVar.getClass();
        this.zza = zzbujVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzcgs)) {
            return false;
        }
        return this.zza.equals(((zzcgs) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return this.zza.toString();
    }

    @Override // com.google.android.libraries.places.internal.zzcgu
    public final zzbtf zza(zzbtg zzbtgVar, zzbsy zzbsyVar) {
        return zzbtgVar.zzb(this.zza, zzbsyVar);
    }
}
