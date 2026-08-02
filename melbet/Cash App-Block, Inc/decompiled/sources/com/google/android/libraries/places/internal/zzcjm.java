package com.google.android.libraries.places.internal;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes4.dex */
public final class zzcjm implements zzcme {
    public int zza;
    public byte zzb;
    public int zzc;
    public int zzd;
    public short zze;
    public final zzcly zzf;

    public zzcjm(zzcly zzclyVar) {
        this.zzf = zzclyVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // com.google.android.libraries.places.internal.zzcme
    public final long zza(zzclo zzcloVar, long j) {
        int i;
        int zzm;
        do {
            int i2 = this.zzd;
            zzcly zzclyVar = this.zzf;
            if (i2 == 0) {
                zzclyVar.zzt(this.zze);
                this.zze = (short) 0;
                if ((this.zzb & 4) == 0) {
                    i = this.zzc;
                    int zzf = zzcjq.zzf(zzclyVar);
                    this.zzd = zzf;
                    this.zza = zzf;
                    int zzj = zzclyVar.zzj() & 255;
                    this.zzb = (byte) (zzclyVar.zzj() & 255);
                    Logger logger = zzcjq.zza;
                    Level level = Level.FINE;
                    byte b = (byte) zzj;
                    if (logger.isLoggable(level)) {
                        logger.logp(level, "io.grpc.okhttp.internal.framed.Http2$ContinuationSource", "readContinuationHeader", zzcjn.zza(true, this.zzc, this.zza, b, this.zzb));
                    }
                    zzm = zzclyVar.zzm() & Integer.MAX_VALUE;
                    this.zzc = zzm;
                    if (b != 9) {
                        zzcjq.zzi("%s != TYPE_CONTINUATION", Byte.valueOf(b));
                        throw null;
                    }
                }
            } else {
                long zza = zzclyVar.zza(zzcloVar, Math.min(j, i2));
                if (zza != -1) {
                    this.zzd -= (int) zza;
                    return zza;
                }
            }
            return -1L;
        } while (zzm == i);
        zzcjq.zzi("TYPE_CONTINUATION streamId changed", new Object[0]);
        throw null;
    }
}
