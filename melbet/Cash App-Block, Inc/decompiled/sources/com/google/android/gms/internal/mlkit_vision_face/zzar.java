package com.google.android.gms.internal.mlkit_vision_face;

import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public abstract class zzar {
    public transient zzaj zza;
    public transient zzah zzb;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzar) {
            return zzp().equals(((zzar) obj).zzp());
        }
        return false;
    }

    public final int hashCode() {
        return ((zzah) zzp()).zza.hashCode();
    }

    public final String toString() {
        return ((zzah) zzp()).zza.toString();
    }

    public final Map zzp() {
        zzah zzahVar = this.zzb;
        if (zzahVar != null) {
            return zzahVar;
        }
        zzas zzasVar = (zzas) this;
        zzah zzahVar2 = new zzah(zzasVar, zzasVar.zza, 0);
        this.zzb = zzahVar2;
        return zzahVar2;
    }

    public final Set zzq() {
        zzaj zzajVar = this.zza;
        if (zzajVar != null) {
            return zzajVar;
        }
        zzas zzasVar = (zzas) this;
        zzaj zzajVar2 = new zzaj(zzasVar, zzasVar.zza);
        this.zza = zzajVar2;
        return zzajVar2;
    }
}
