package com.google.android.gms.internal.mlkit_vision_face;

import com.fillr.e0;
import com.google.android.gms.common.internal.zzae;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class zzkd {
    public final zzka zza;
    public final zzjy zzb;
    public final zzkb zzc;
    public final zzjz zzd;
    public final Boolean zze;
    public final Float zzf;

    public /* synthetic */ zzkd(e0 e0Var) {
        this.zza = (zzka) e0Var.a;
        this.zzb = (zzjy) e0Var.b;
        this.zzc = (zzkb) e0Var.c;
        this.zzd = (zzjz) e0Var.i;
        this.zze = (Boolean) e0Var.f;
        this.zzf = (Float) e0Var.h;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzkd)) {
            return false;
        }
        zzkd zzkdVar = (zzkd) obj;
        return zzae.equal(this.zza, zzkdVar.zza) && zzae.equal(this.zzb, zzkdVar.zzb) && zzae.equal(this.zzc, zzkdVar.zzc) && zzae.equal(this.zzd, zzkdVar.zzd) && zzae.equal(this.zze, zzkdVar.zze) && zzae.equal(this.zzf, zzkdVar.zzf);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf});
    }
}
