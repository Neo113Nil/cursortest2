package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.Arrays;

/* loaded from: classes4.dex */
public final class zzes {
    public final zzou zza;
    public final Boolean zzc;
    public final zzsd zze;

    public /* synthetic */ zzes(zzdb zzdbVar) {
        this.zza = (zzou) zzdbVar.zzc;
        this.zzc = (Boolean) zzdbVar.zzd;
        this.zze = (zzsd) zzdbVar.zze;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzes)) {
            return false;
        }
        zzes zzesVar = (zzes) obj;
        return com.google.android.gms.common.internal.zzae.equal(this.zza, zzesVar.zza) && com.google.android.gms.common.internal.zzae.equal(null, null) && com.google.android.gms.common.internal.zzae.equal(this.zzc, zzesVar.zzc) && com.google.android.gms.common.internal.zzae.equal(null, null) && com.google.android.gms.common.internal.zzae.equal(this.zze, zzesVar.zze);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, null, this.zzc, null, this.zze});
    }
}
