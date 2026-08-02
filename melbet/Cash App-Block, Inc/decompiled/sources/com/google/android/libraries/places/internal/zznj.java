package com.google.android.libraries.places.internal;

import androidx.tracing.Trace;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class zznj {
    public volatile String zza;
    public volatile boolean zzc;

    public final synchronized void zza(String str, boolean z) {
        Trace.checkArgument("API Key must not be empty.", !str.isEmpty());
        this.zza = str;
        this.zzc = z;
    }

    public final synchronized boolean zzb() {
        return this.zza != null;
    }

    public final synchronized String zze() {
        Trace.checkState("ApiConfig must be initialized.", zzb());
        this.zza.getClass();
        return this.zza;
    }

    public final synchronized Locale zzf() {
        Trace.checkState("ApiConfig must be initialized.", zzb());
        return Locale.getDefault();
    }
}
