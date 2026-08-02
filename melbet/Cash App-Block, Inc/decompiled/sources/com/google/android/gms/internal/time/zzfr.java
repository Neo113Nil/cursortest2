package com.google.android.gms.internal.time;

/* loaded from: classes4.dex */
public final class zzfr {
    public final zzgz zza = zzgz.zza;
    public final String zzb;

    public zzfr(String str) {
        zzcw.zza(str, "message");
        this.zzb = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzfr)) {
            return false;
        }
        zzfr zzfrVar = (zzfr) obj;
        return this.zza.equals(zzfrVar.zza) && this.zzb.equals(zzfrVar.zzb);
    }

    public final int hashCode() {
        return this.zzb.hashCode() ^ this.zza.hashCode();
    }
}
