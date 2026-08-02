package com.google.android.gms.internal.measurement;

import android.net.Uri;
import com.google.common.collect.ImmutableList;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public final class zzsr implements zzrt {
    public boolean zza;

    static {
        new AtomicInteger();
    }

    @Override // com.google.android.gms.internal.measurement.zzrt
    public final Object zza(zzzm zzzmVar) {
        if (this.zza) {
            if (((ImmutableList) zzzmVar.zzd).isEmpty()) {
                return ((zzsx) zzzmVar.zzc).zzg((Uri) zzzmVar.zzf);
            }
            throw new zzsk("Short circuit would skip transforms.");
        }
        Closeable zzc = zzlf.zzc(zzzmVar);
        try {
            if (!(zzc instanceof zzsf)) {
                throw new IOException("Not convertible and fallback to pipe is disabled.");
            }
            File zza = ((zzsf) zzc).zza();
            if (zzc != null) {
                zzc.close();
            }
            return zza;
        } catch (Throwable th) {
            if (zzc != null) {
                try {
                    zzc.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
