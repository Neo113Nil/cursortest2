package com.google.android.libraries.places.internal;

import com.google.android.filament.Box;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Logger;

/* loaded from: classes4.dex */
public final class zzbvd {
    public static final Logger zzd = Logger.getLogger(zzbvd.class.getName());
    public final ScheduledExecutorService zza;
    public final zzbuf zzb;
    public Box zzc;
    public zzbyl zze;

    public zzbvd(ScheduledExecutorService scheduledExecutorService, zzbuf zzbufVar) {
        this.zza = scheduledExecutorService;
        this.zzb = zzbufVar;
    }
}
