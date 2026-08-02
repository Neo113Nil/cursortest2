package com.google.android.libraries.places.internal;

import androidx.tracing.Trace;

/* loaded from: classes4.dex */
public final class zzcka {
    public static final ThreadLocal zza = new ThreadLocal();
    public final zzblh zzb;
    public final zzbhz zzc;

    public zzcka(zzbhz zzbhzVar) {
        Trace.checkNotNull(zzbhzVar, "defaultInstance cannot be null");
        this.zzc = zzbhzVar;
        this.zzb = (zzblh) ((zzbjr) zzbhzVar).zzb(7, null);
    }
}
