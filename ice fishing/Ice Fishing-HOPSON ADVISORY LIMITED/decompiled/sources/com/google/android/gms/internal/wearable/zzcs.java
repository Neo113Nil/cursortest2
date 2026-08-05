package com.google.android.gms.internal.wearable;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
public final class zzcs {
    static final zzcs zza = new zzcs(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc = false;
    private static volatile int zze = 1;
    private final Map zzd;

    zzcs() {
        this.zzd = new HashMap();
    }

    static boolean zza() {
        return false;
    }

    public static zzcs zzb() {
        int i = zzbv.zza;
        return zza;
    }

    public final zzdf zzc(zzel zzelVar, int i) {
        return (zzdf) this.zzd.get(new zzcr(zzelVar, i));
    }

    zzcs(boolean z) {
        this.zzd = Collections.emptyMap();
    }
}
