package com.google.android.libraries.places.internal;

import androidx.tracing.Trace;
import com.android.volley.Response;
import com.google.common.base.Ascii;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class zzcfx {
    public final String zza;
    public final Map zzb;

    public zzcfx(String str, Map map) {
        Trace.checkNotNull(str, "policyName");
        this.zza = str;
        Trace.checkNotNull(map, "rawConfigValue");
        this.zzb = map;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzcfx) {
            zzcfx zzcfxVar = (zzcfx) obj;
            if (this.zza.equals(zzcfxVar.zza) && this.zzb.equals(zzcfxVar.zzb)) {
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
        stringHelper.add(this.zza, "policyName");
        stringHelper.add(this.zzb, "rawConfigValue");
        return stringHelper.toString();
    }
}
