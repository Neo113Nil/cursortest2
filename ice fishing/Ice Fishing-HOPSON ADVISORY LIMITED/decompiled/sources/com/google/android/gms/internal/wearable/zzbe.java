package com.google.android.gms.internal.wearable;

import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
final class zzbe {
    private final zzan zza = new zzan();
    private final String zzb;
    private volatile Logger zzc;

    zzbe(Class cls) {
        this.zzb = cls.getName();
    }

    final Logger zza() {
        Logger logger = this.zzc;
        if (logger != null) {
            return logger;
        }
        synchronized (this.zza) {
            Logger logger2 = this.zzc;
            if (logger2 != null) {
                return logger2;
            }
            Logger logger3 = Logger.getLogger(this.zzb);
            this.zzc = logger3;
            return logger3;
        }
    }
}
