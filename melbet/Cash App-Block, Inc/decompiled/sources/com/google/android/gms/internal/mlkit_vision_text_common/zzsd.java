package com.google.android.gms.internal.mlkit_vision_text_common;

import com.fillr.n;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class zzsd {
    public final zzsb zza;

    public /* synthetic */ zzsd(n.b bVar) {
        this.zza = (zzsb) bVar.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof zzsd) && com.google.android.gms.common.internal.zzae.equal(this.zza, ((zzsd) obj).zza) && com.google.android.gms.common.internal.zzae.equal(null, null) && com.google.android.gms.common.internal.zzae.equal(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, null, null});
    }
}
