package com.google.android.gms.internal.mlkit_vision_barcode;

import coil3.request.OneShotDisposable;
import com.google.android.gms.common.internal.zzae;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class zzvz {
    public final zzdk zza;

    public /* synthetic */ zzvz(OneShotDisposable oneShotDisposable) {
        this.zza = (zzdk) oneShotDisposable.job;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzvz) {
            return zzae.equal(this.zza, ((zzvz) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza});
    }
}
