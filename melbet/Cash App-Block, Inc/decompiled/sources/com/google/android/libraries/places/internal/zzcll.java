package com.google.android.libraries.places.internal;

import java.io.IOException;

/* loaded from: classes4.dex */
public final class zzcll implements zzcmc {
    public final /* synthetic */ zzclw zza;

    public zzcll(zzclw zzclwVar) {
        this.zza = zzclwVar;
    }

    @Override // com.google.android.libraries.places.internal.zzcmc, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.zza.close();
        } catch (IOException e) {
            throw e;
        } finally {
            zzcmd.zza();
        }
    }

    @Override // com.google.android.libraries.places.internal.zzcmc, java.io.Flushable
    public final void flush() {
        try {
            this.zza.flush();
        } catch (IOException e) {
            throw e;
        } finally {
            zzcmd.zza();
        }
    }

    public final String toString() {
        zzclw zzclwVar = this.zza;
        StringBuilder sb = new StringBuilder(zzclwVar.toString().length() + 19);
        sb.append("AsyncTimeout.sink(");
        sb.append(zzclwVar);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.internal.zzcmc
    public final void zzc(zzclo zzcloVar, long j) {
        zzkf.zza(zzcloVar.zzb, 0L, j);
        while (true) {
            long j2 = 0;
            if (j <= 0) {
                return;
            }
            zzclz zzclzVar = zzcloVar.zza;
            zzclzVar.getClass();
            while (true) {
                if (j2 >= 65536) {
                    break;
                }
                j2 += zzclzVar.zzc - zzclzVar.zzb;
                if (j2 >= j) {
                    j2 = j;
                    break;
                } else {
                    zzclzVar = zzclzVar.zzf;
                    zzclzVar.getClass();
                }
            }
            try {
                try {
                    this.zza.zzc(zzcloVar, j2);
                    zzcmd.zza();
                    j -= j2;
                } catch (IOException e) {
                    zzcmd.zza();
                    throw e;
                }
            } catch (Throwable th) {
                zzcmd.zza();
                throw th;
            }
        }
    }
}
