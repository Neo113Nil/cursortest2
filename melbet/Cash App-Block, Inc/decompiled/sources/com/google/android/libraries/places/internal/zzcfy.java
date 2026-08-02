package com.google.android.libraries.places.internal;

import androidx.tracing.Trace;
import com.android.volley.Response;
import com.google.common.base.Ascii;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class zzcfy {
    public final zzbrx zza;
    public final Object zzb;

    public zzcfy(zzbrx zzbrxVar, Object obj) {
        Trace.checkNotNull(zzbrxVar, "provider");
        this.zza = zzbrxVar;
        this.zzb = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzcfy.class == obj.getClass()) {
            zzcfy zzcfyVar = (zzcfy) obj;
            if (Objects.equals(this.zza, zzcfyVar.zza) && Objects.equals(this.zzb, zzcfyVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        Response stringHelper = Ascii.toStringHelper(this);
        stringHelper.add(this.zza, "provider");
        stringHelper.add(this.zzb, "config");
        return stringHelper.toString();
    }
}
