package com.google.android.gms.wearable.internal;

import com.google.android.gms.wearable.ChannelIOException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
public final class zzce extends InputStream {
    private final InputStream zza;
    private volatile zzbp zzb;

    public zzce(InputStream inputStream) {
        this.zza = inputStream;
    }

    private final int zzb(int i) throws ChannelIOException {
        if (i != -1) {
            return i;
        }
        zzbp zzbpVar = this.zzb;
        if (zzbpVar == null) {
            return -1;
        }
        throw new ChannelIOException("Channel closed unexpectedly before stream was finished", zzbpVar.zza, zzbpVar.zzb);
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        return this.zza.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.zza.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.zza.mark(i);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.zza.markSupported();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int read = this.zza.read();
        zzb(read);
        return read;
    }

    @Override // java.io.InputStream
    public final void reset() throws IOException {
        this.zza.reset();
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        return this.zza.skip(j);
    }

    final void zza(zzbp zzbpVar) {
        this.zzb = zzbpVar;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        int read = this.zza.read(bArr);
        zzb(read);
        return read;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int read = this.zza.read(bArr, i, i2);
        zzb(read);
        return read;
    }
}
