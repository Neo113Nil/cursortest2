package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbjb {
    public final Object zza;
    public final int zzb;

    public zzbjb(int i, zzbhz zzbhzVar) {
        this.zza = zzbhzVar;
        this.zzb = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbjb)) {
            return false;
        }
        zzbjb zzbjbVar = (zzbjb) obj;
        return this.zza == zzbjbVar.zza && this.zzb == zzbjbVar.zzb;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * 65535) + this.zzb;
    }
}
