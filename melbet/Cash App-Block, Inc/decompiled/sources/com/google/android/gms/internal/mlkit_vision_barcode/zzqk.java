package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.android.gms.auth.api.zbc;
import com.google.android.gms.common.internal.zzae;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class zzqk {
    public final zzqi zza;
    public final Integer zzb;

    public /* synthetic */ zzqk(zbc zbcVar) {
        this.zza = (zzqi) zbcVar.zba;
        this.zzb = (Integer) zbcVar.zbb;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzqk)) {
            return false;
        }
        zzqk zzqkVar = (zzqk) obj;
        return zzae.equal(this.zza, zzqkVar.zza) && zzae.equal(this.zzb, zzqkVar.zzb) && zzae.equal(null, null) && zzae.equal(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, null, null});
    }
}
