package com.google.android.libraries.places.internal;

import androidx.tracing.Trace;

/* loaded from: classes4.dex */
public final class zzbqn {
    public String zza;
    public zzbqo zzb;
    public Long zzc;
    public zzcah zzd;

    public final zzbqp zze() {
        Trace.checkNotNull(this.zza, "description");
        Trace.checkNotNull(this.zzb, "severity");
        Trace.checkNotNull(this.zzc, "timestampNanos");
        return new zzbqp(this.zza, this.zzb, this.zzc.longValue(), this.zzd);
    }
}
