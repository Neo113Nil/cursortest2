package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public abstract class zzbv {
    public transient Maps.Values zza;
    public transient zzbl zzb;
    public transient com.google.android.gms.internal.mlkit_vision_face.zzah zzc;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzbv) {
            return zzv().equals(((zzbv) obj).zzv());
        }
        return false;
    }

    public final int hashCode() {
        return ((com.google.android.gms.internal.mlkit_vision_face.zzah) zzv()).zza.hashCode();
    }

    public final String toString() {
        return ((com.google.android.gms.internal.mlkit_vision_face.zzah) zzv()).zza.toString();
    }

    public final Map zzv() {
        com.google.android.gms.internal.mlkit_vision_face.zzah zzahVar = this.zzc;
        if (zzahVar != null) {
            return zzahVar;
        }
        zzbw zzbwVar = (zzbw) this;
        com.google.android.gms.internal.mlkit_vision_face.zzah zzahVar2 = new com.google.android.gms.internal.mlkit_vision_face.zzah(zzbwVar, zzbwVar.zza, 1);
        this.zzc = zzahVar2;
        return zzahVar2;
    }

    public final Set zzw() {
        zzbl zzblVar = this.zzb;
        if (zzblVar != null) {
            return zzblVar;
        }
        zzbw zzbwVar = (zzbw) this;
        zzbl zzblVar2 = new zzbl(zzbwVar, zzbwVar.zza);
        this.zzb = zzblVar2;
        return zzblVar2;
    }
}
