package com.google.android.libraries.places.internal;

import java.io.OutputStream;

/* loaded from: classes4.dex */
public final class zzclw implements zzcmc {
    public final OutputStream zza;
    public final zzcmd zzb;

    public zzclw(OutputStream outputStream, zzcmd zzcmdVar) {
        outputStream.getClass();
        this.zza = outputStream;
        this.zzb = zzcmdVar;
    }

    @Override // com.google.android.libraries.places.internal.zzcmc, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.zza.close();
    }

    @Override // com.google.android.libraries.places.internal.zzcmc, java.io.Flushable
    public final void flush() {
        this.zza.flush();
    }

    public final String toString() {
        OutputStream outputStream = this.zza;
        StringBuilder sb = new StringBuilder(String.valueOf(outputStream).length() + 6);
        sb.append("sink(");
        sb.append(outputStream);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.internal.zzcmc
    public final void zzc(zzclo zzcloVar, long j) {
        zzkf.zza(zzcloVar.zzb, 0L, j);
        while (j > 0) {
            this.zzb.zzb();
            zzclz zzclzVar = zzcloVar.zza;
            zzclzVar.getClass();
            int min = (int) Math.min(j, zzclzVar.zzc - zzclzVar.zzb);
            this.zza.write(zzclzVar.zza, zzclzVar.zzb, min);
            int i = zzclzVar.zzb + min;
            zzclzVar.zzb = i;
            long j2 = min;
            zzcloVar.zzb -= j2;
            j -= j2;
            if (i == zzclzVar.zzc) {
                zzcloVar.zza = zzclzVar.zzb();
                zzcma.zzb(zzclzVar);
            }
        }
    }
}
