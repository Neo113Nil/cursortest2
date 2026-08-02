package com.google.android.libraries.places.internal;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes4.dex */
public final class zzbug extends zzbpu {
    public static final Logger zzb = Logger.getLogger(zzbug.class.getName());
    public static final ThreadLocal zza = new ThreadLocal();

    @Override // com.google.android.libraries.places.internal.zzbpu
    public final zzbpv zza(zzbpv zzbpvVar) {
        zzbpv zzc = zzc();
        zza.set(zzbpvVar);
        return zzc;
    }

    @Override // com.google.android.libraries.places.internal.zzbpu
    public final void zzb(zzbpv zzbpvVar, zzbpv zzbpvVar2) {
        if (zzc() != zzbpvVar) {
            zzb.logp(Level.SEVERE, "io.grpc.ThreadLocalContextStorage", "detach", "Context was not attached when detaching", new Throwable().fillInStackTrace());
        }
        zzbpv zzbpvVar3 = zzbpv.zzb;
        ThreadLocal threadLocal = zza;
        if (zzbpvVar2 != zzbpvVar3) {
            threadLocal.set(zzbpvVar2);
        } else {
            threadLocal.set(null);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbpu
    public final zzbpv zzc() {
        zzbpv zzbpvVar = (zzbpv) zza.get();
        return zzbpvVar == null ? zzbpv.zzb : zzbpvVar;
    }
}
