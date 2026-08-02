package com.google.android.libraries.places.internal;

import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class zzbpp {
    public static zzbpp zza;
    public final List zzb = Collections.EMPTY_LIST;

    public static synchronized zzbpp zza() {
        zzbpp zzbppVar;
        synchronized (zzbpp.class) {
            try {
                if (zza == null) {
                    zza = new zzbpp();
                }
                zzbppVar = zza;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzbppVar;
    }
}
