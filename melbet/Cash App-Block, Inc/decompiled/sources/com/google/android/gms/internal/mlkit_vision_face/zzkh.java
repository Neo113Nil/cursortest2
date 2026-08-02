package com.google.android.gms.internal.mlkit_vision_face;

import com.google.android.filament.Box;
import com.google.android.gms.common.internal.zzae;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class zzkh {
    public final zzkf zza;
    public final Integer zzb;

    public /* synthetic */ zzkh(Box box) {
        this.zza = (zzkf) box.mCenter;
        this.zzb = (Integer) box.mHalfExtent;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzkh)) {
            return false;
        }
        zzkh zzkhVar = (zzkh) obj;
        return zzae.equal(this.zza, zzkhVar.zza) && zzae.equal(this.zzb, zzkhVar.zzb) && zzae.equal(null, null) && zzae.equal(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, null, null});
    }
}
