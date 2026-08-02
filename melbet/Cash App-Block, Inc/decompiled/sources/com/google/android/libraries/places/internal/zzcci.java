package com.google.android.libraries.places.internal;

import com.android.volley.Response;
import com.fillr.core.FillrEnv$EnumUnboxingLocalUtility;
import com.google.common.base.Ascii;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class zzcci {
    public final zzccg zza;
    public final Map zzb;
    public final Map zzc;
    public final zzcfk zzd;
    public final Object zze;
    public final Map zzf;

    public zzcci(zzccg zzccgVar, HashMap hashMap, HashMap hashMap2, zzcfk zzcfkVar, Object obj, Map map) {
        this.zza = zzccgVar;
        this.zzb = FillrEnv$EnumUnboxingLocalUtility.m(hashMap);
        this.zzc = FillrEnv$EnumUnboxingLocalUtility.m(hashMap2);
        this.zzd = zzcfkVar;
        this.zze = obj;
        this.zzf = map != null ? Collections.unmodifiableMap(new HashMap(map)) : null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzcci.class == obj.getClass()) {
            zzcci zzcciVar = (zzcci) obj;
            if (Objects.equals(this.zza, zzcciVar.zza) && Objects.equals(this.zzb, zzcciVar.zzb) && Objects.equals(this.zzc, zzcciVar.zzc) && Objects.equals(this.zzd, zzcciVar.zzd) && Objects.equals(this.zze, zzcciVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb, this.zzc, this.zzd, this.zze);
    }

    public final String toString() {
        Response stringHelper = Ascii.toStringHelper(this);
        stringHelper.add(this.zza, "defaultMethodConfig");
        stringHelper.add(this.zzb, "serviceMethodMap");
        stringHelper.add(this.zzc, "serviceMap");
        stringHelper.add(this.zzd, "retryThrottling");
        stringHelper.add(this.zze, "loadBalancingConfig");
        return stringHelper.toString();
    }

    public final zzcch zzb() {
        if (this.zzc.isEmpty() && this.zzb.isEmpty() && this.zza == null) {
            return null;
        }
        return new zzcch(this);
    }
}
