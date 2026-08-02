package com.google.android.libraries.places.internal;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes4.dex */
public final class zzccn extends FilterInputStream {
    public final int zza;
    public final zzcgh zzb;
    public long zzc;
    public long zzd;
    public long zze;

    public zzccn(InputStream inputStream, int i, zzcgh zzcghVar) {
        super(inputStream);
        this.zze = -1L;
        this.zza = i;
        this.zzb = zzcghVar;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        ((FilterInputStream) this).in.mark(i);
        this.zze = this.zzd;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int read = ((FilterInputStream) this).in.read();
        if (read != -1) {
            this.zzd++;
        }
        zzb();
        zza();
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("Mark not supported");
        }
        if (this.zze == -1) {
            throw new IOException("Mark not set");
        }
        ((FilterInputStream) this).in.reset();
        this.zzd = this.zze;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        long skip = ((FilterInputStream) this).in.skip(j);
        this.zzd += skip;
        zzb();
        zza();
        return skip;
    }

    public final void zza() {
        if (this.zzd <= this.zzc) {
            return;
        }
        int i = 0;
        while (true) {
            zzbub[] zzbubVarArr = this.zzb.zza;
            if (i >= zzbubVarArr.length) {
                this.zzc = this.zzd;
                return;
            } else {
                zzbub zzbubVar = zzbubVarArr[i];
                i++;
            }
        }
    }

    public final void zzb() {
        long j = this.zzd;
        int i = this.zza;
        if (j <= i) {
            return;
        }
        zzbtx zzbtxVar = zzbtx.zzf;
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 47);
        sb.append("Decompressed gRPC message exceeds maximum size ");
        sb.append(i);
        throw new zzbua(zzbtxVar.zze(sb.toString()));
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int read = ((FilterInputStream) this).in.read(bArr, i, i2);
        if (read != -1) {
            this.zzd += read;
        }
        zzb();
        zza();
        return read;
    }
}
