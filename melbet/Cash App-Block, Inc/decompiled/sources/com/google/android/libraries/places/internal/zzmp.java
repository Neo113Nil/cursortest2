package com.google.android.libraries.places.internal;

import com.google.common.collect.RegularImmutableMap;
import okhttp3.internal.http.StatusLine;

/* loaded from: classes4.dex */
public abstract class zzmp {
    public static final RegularImmutableMap zza;

    static {
        StatusLine builder = RegularImmutableMap.builder();
        builder.put(zzgf.zza, "NONE");
        builder.put(zzgf.zzb, "WPA_PSK");
        builder.put(zzgf.zzc, "WPA_EAP");
        builder.put(zzgf.zzd, "SECURED_NONE");
        zza = builder.build(true);
    }
}
