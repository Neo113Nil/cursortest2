package com.google.android.gms.internal.mlkit_vision_text_common;

import com.google.android.gms.internal.mlkit_vision_face.zzah;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public abstract class zzan {
    public transient zzab zza;
    public transient zzah zzb;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzan) {
            return zzn().equals(((zzan) obj).zzn());
        }
        return false;
    }

    public final int hashCode() {
        return ((zzah) zzn()).zza.hashCode();
    }

    public final String toString() {
        return ((zzah) zzn()).zza.toString();
    }

    public final Map zzn() {
        zzah zzahVar = this.zzb;
        if (zzahVar != null) {
            return zzahVar;
        }
        zzao zzaoVar = (zzao) this;
        zzah zzahVar2 = new zzah(zzaoVar, zzaoVar.zza, 2);
        this.zzb = zzahVar2;
        return zzahVar2;
    }

    public final Set zzo() {
        zzab zzabVar = this.zza;
        if (zzabVar != null) {
            return zzabVar;
        }
        zzao zzaoVar = (zzao) this;
        zzab zzabVar2 = new zzab(zzaoVar, zzaoVar.zza);
        this.zza = zzabVar2;
        return zzabVar2;
    }
}
