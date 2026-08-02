package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzadf {
    public static final zzadf zza;
    public static volatile zzadf zzd;

    static {
        zzadf zzadfVar = new zzadf();
        Map map = Collections.EMPTY_MAP;
        zza = zzadfVar;
    }

    public static zzadf zzb() {
        zzadf zzadfVar = zzd;
        if (zzadfVar != null) {
            return zzadfVar;
        }
        synchronized (zzadf.class) {
            try {
                zzadf zzadfVar2 = zzd;
                if (zzadfVar2 != null) {
                    return zzadfVar2;
                }
                int i = zzacf.$r8$clinit;
                zzadf zzb = zzh.zzb();
                zzd = zzb;
                return zzb;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
