package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* loaded from: classes4.dex */
public final class zzdr {
    public final Object zza;
    public final int zzb;

    public zzdr(zzcq zzcqVar, int i) {
        this.zza = zzcqVar;
        this.zzb = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzdr)) {
            return false;
        }
        zzdr zzdrVar = (zzdr) obj;
        return this.zza == zzdrVar.zza && this.zzb == zzdrVar.zzb;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * 65535) + this.zzb;
    }
}
