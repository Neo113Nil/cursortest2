package com.google.android.gms.internal.ads;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.android.gms.internal.ads.l5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3506l5 extends FilterInputStream {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f32538n;

    /* renamed from: u, reason: collision with root package name */
    public long f32539u;

    /* renamed from: v, reason: collision with root package name */
    public long f32540v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3506l5(BufferedInputStream bufferedInputStream, long j9, int i) {
        super(bufferedInputStream);
        this.f32538n = i;
        this.f32539u = j9;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        switch (this.f32538n) {
            case 1:
                return (int) Math.min(((FilterInputStream) this).in.available(), this.f32539u);
            case 2:
                return (int) Math.min(((FilterInputStream) this).in.available(), this.f32539u);
            default:
                return super.available();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i) {
        switch (this.f32538n) {
            case 1:
                synchronized (this) {
                    ((FilterInputStream) this).in.mark(i);
                    this.f32540v = this.f32539u;
                }
                return;
            case 2:
                synchronized (this) {
                    ((FilterInputStream) this).in.mark(i);
                    this.f32540v = this.f32539u;
                }
                return;
            default:
                super.mark(i);
                return;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        switch (this.f32538n) {
            case 0:
                int read = super.read();
                if (read != -1) {
                    this.f32540v++;
                }
                return read;
            case 1:
                if (this.f32539u == 0) {
                    return -1;
                }
                int read2 = ((FilterInputStream) this).in.read();
                if (read2 != -1) {
                    this.f32539u--;
                }
                return read2;
            case 2:
                if (this.f32539u == 0) {
                    return -1;
                }
                int read3 = ((FilterInputStream) this).in.read();
                if (read3 != -1) {
                    this.f32539u--;
                }
                return read3;
            default:
                int read4 = super.read();
                if (read4 != -1) {
                    this.f32540v++;
                }
                return read4;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        switch (this.f32538n) {
            case 1:
                synchronized (this) {
                    if (!((FilterInputStream) this).in.markSupported()) {
                        throw new IOException("Mark not supported");
                    }
                    if (this.f32540v == -1) {
                        throw new IOException("Mark not set");
                    }
                    ((FilterInputStream) this).in.reset();
                    this.f32539u = this.f32540v;
                }
                return;
            case 2:
                synchronized (this) {
                    if (!((FilterInputStream) this).in.markSupported()) {
                        throw new IOException("Mark not supported");
                    }
                    if (this.f32540v == -1) {
                        throw new IOException("Mark not set");
                    }
                    ((FilterInputStream) this).in.reset();
                    this.f32539u = this.f32540v;
                }
                return;
            default:
                super.reset();
                return;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j9) {
        switch (this.f32538n) {
            case 1:
                long skip = ((FilterInputStream) this).in.skip(Math.min(j9, this.f32539u));
                this.f32539u -= skip;
                return skip;
            case 2:
                long skip2 = ((FilterInputStream) this).in.skip(Math.min(j9, this.f32539u));
                this.f32539u -= skip2;
                return skip2;
            default:
                return super.skip(j9);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3506l5(InputStream inputStream, long j9) {
        super(inputStream);
        this.f32538n = 1;
        this.f32540v = -1L;
        inputStream.getClass();
        PA.u("limit must be non-negative", j9 >= 0);
        this.f32539u = j9;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3506l5(InputStream inputStream) {
        super(inputStream);
        this.f32538n = 2;
        this.f32540v = -1L;
        this.f32539u = 1048577L;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i4) {
        switch (this.f32538n) {
            case 0:
                int read = super.read(bArr, i, i4);
                if (read != -1) {
                    this.f32540v += read;
                }
                return read;
            case 1:
                long j9 = this.f32539u;
                if (j9 == 0) {
                    return -1;
                }
                int read2 = ((FilterInputStream) this).in.read(bArr, i, (int) Math.min(i4, j9));
                if (read2 != -1) {
                    this.f32539u -= read2;
                }
                return read2;
            case 2:
                long j10 = this.f32539u;
                if (j10 == 0) {
                    return -1;
                }
                int read3 = ((FilterInputStream) this).in.read(bArr, i, (int) Math.min(i4, j10));
                if (read3 != -1) {
                    this.f32539u -= read3;
                }
                return read3;
            default:
                int read4 = super.read(bArr, i, i4);
                if (read4 != -1) {
                    this.f32540v += read4;
                }
                return read4;
        }
    }
}
