package com.google.android.libraries.places.internal;

import androidx.tracing.Trace;
import java.text.MessageFormat;
import java.util.logging.Level;

/* loaded from: classes4.dex */
public final class zzbvi extends zzboy {
    public final zzbvj zza;

    public zzbvi(zzbvj zzbvjVar, zzcgm zzcgmVar) {
        this.zza = zzbvjVar;
        Trace.checkNotNull(zzcgmVar, "time");
    }

    public static Level zzf(int i) {
        int i2 = i - 1;
        return i2 != 1 ? (i2 == 2 || i2 == 3) ? Level.FINE : Level.FINEST : Level.FINER;
    }

    @Override // com.google.android.libraries.places.internal.zzboy
    public final void zza(int i, String str) {
        zzbra zzbraVar = this.zza.zzc;
        Level zzf = zzf(i);
        if (zzbvj.zza.isLoggable(zzf)) {
            zzbvj.zzc(zzbraVar, zzf, str);
        }
        if (i != 1) {
            synchronized (this.zza.zzb) {
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.zzboy
    public final void zzb(String str, int i, Object... objArr) {
        Level zzf = zzf(i);
        if (i != 1) {
            synchronized (this.zza.zzb) {
            }
        }
        zza(i, zzbvj.zza.isLoggable(zzf) ? MessageFormat.format(str, objArr) : null);
    }
}
