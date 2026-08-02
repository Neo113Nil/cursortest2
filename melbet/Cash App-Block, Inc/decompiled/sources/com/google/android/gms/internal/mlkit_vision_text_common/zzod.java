package com.google.android.gms.internal.mlkit_vision_text_common;

import com.google.android.filament.Box;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class zzod {
    public final zzob zza;
    public final Integer zzb;

    public /* synthetic */ zzod(Box box) {
        this.zza = (zzob) box.mCenter;
        this.zzb = (Integer) box.mHalfExtent;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzod)) {
            return false;
        }
        zzod zzodVar = (zzod) obj;
        return com.google.android.gms.common.internal.zzae.equal(this.zza, zzodVar.zza) && com.google.android.gms.common.internal.zzae.equal(this.zzb, zzodVar.zzb) && com.google.android.gms.common.internal.zzae.equal(null, null) && com.google.android.gms.common.internal.zzae.equal(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, null, null});
    }
}
