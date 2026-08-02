package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.io.InputStream;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class zzclt implements zzcme {
    public final InputStream zza;
    public final zzcmd zzb;

    public zzclt(InputStream inputStream, zzcmd zzcmdVar) {
        inputStream.getClass();
        this.zza = inputStream;
        this.zzb = zzcmdVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.zza.close();
    }

    public final String toString() {
        InputStream inputStream = this.zza;
        StringBuilder sb = new StringBuilder(String.valueOf(inputStream).length() + 8);
        sb.append("source(");
        sb.append(inputStream);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.internal.zzcme
    public final long zza(zzclo zzcloVar, long j) {
        String message;
        try {
            this.zzb.zzb();
            zzclz zzE = zzcloVar.zzE(1);
            int read = this.zza.read(zzE.zza, zzE.zzc, (int) Math.min(j, 8192 - zzE.zzc));
            if (read != -1) {
                zzE.zzc += read;
                long j2 = read;
                zzcloVar.zzb += j2;
                return j2;
            }
            if (zzE.zzb != zzE.zzc) {
                return -1L;
            }
            zzcloVar.zza = zzE.zzb();
            zzcma.zzb(zzE);
            return -1L;
        } catch (AssertionError e) {
            int i = zzclv.$r8$clinit;
            if (e.getCause() == null || (message = e.getMessage()) == null || !StringsKt.contains((CharSequence) message, (CharSequence) "getsockname failed", false)) {
                throw e;
            }
            throw new IOException(e);
        }
    }
}
