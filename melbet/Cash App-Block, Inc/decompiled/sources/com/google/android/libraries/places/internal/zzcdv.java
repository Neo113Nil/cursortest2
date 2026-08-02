package com.google.android.libraries.places.internal;

import androidx.tracing.Trace;
import java.io.InputStream;

/* loaded from: classes4.dex */
public final class zzcdv extends InputStream implements zzbrg {
    public final zzbur zza;

    public zzcdv(zzbur zzburVar) {
        Trace.checkNotNull(zzburVar, "buffer");
        this.zza = zzburVar;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.zza.zzf();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.zza.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.zza.zzb();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.zza.zza();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        zzbur zzburVar = this.zza;
        if (zzburVar.zzf() == 0) {
            return -1;
        }
        int min = Math.min(zzburVar.zzf(), i2);
        zzburVar.zzi(i, min, bArr);
        return min;
    }

    @Override // java.io.InputStream
    public final void reset() {
        this.zza.zzc();
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        zzbur zzburVar = this.zza;
        int min = (int) Math.min(zzburVar.zzf(), j);
        zzburVar.zzh(min);
        return min;
    }

    @Override // java.io.InputStream
    public final int read() {
        zzbur zzburVar = this.zza;
        if (zzburVar.zzf() == 0) {
            return -1;
        }
        return zzburVar.zzg();
    }
}
