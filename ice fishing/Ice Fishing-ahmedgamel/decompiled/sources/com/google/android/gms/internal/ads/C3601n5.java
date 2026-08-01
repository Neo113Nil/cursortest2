package com.google.android.gms.internal.ads;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.android.gms.internal.ads.n5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3601n5 extends FilterInputStream {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f32684n;

    /* renamed from: u, reason: collision with root package name */
    public long f32685u;

    /* renamed from: v, reason: collision with root package name */
    public long f32686v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3601n5(BufferedInputStream bufferedInputStream, long j6, int i) {
        super(bufferedInputStream);
        this.f32684n = i;
        this.f32685u = j6;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        switch (this.f32684n) {
            case 1:
                return (int) Math.min(((FilterInputStream) this).in.available(), this.f32685u);
            case 2:
                return (int) Math.min(((FilterInputStream) this).in.available(), this.f32685u);
            default:
                return super.available();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i) {
        switch (this.f32684n) {
            case 1:
                synchronized (this) {
                    ((FilterInputStream) this).in.mark(i);
                    this.f32686v = this.f32685u;
                }
                return;
            case 2:
                synchronized (this) {
                    ((FilterInputStream) this).in.mark(i);
                    this.f32686v = this.f32685u;
                }
                return;
            default:
                super.mark(i);
                return;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        switch (this.f32684n) {
            case 0:
                int read = super.read();
                if (read != -1) {
                    this.f32686v++;
                }
                return read;
            case 1:
                if (this.f32685u == 0) {
                    return -1;
                }
                int read2 = ((FilterInputStream) this).in.read();
                if (read2 != -1) {
                    this.f32685u--;
                }
                return read2;
            case 2:
                if (this.f32685u == 0) {
                    return -1;
                }
                int read3 = ((FilterInputStream) this).in.read();
                if (read3 != -1) {
                    this.f32685u--;
                }
                return read3;
            default:
                int read4 = super.read();
                if (read4 != -1) {
                    this.f32686v++;
                }
                return read4;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        switch (this.f32684n) {
            case 1:
                synchronized (this) {
                    if (!((FilterInputStream) this).in.markSupported()) {
                        throw new IOException("Mark not supported");
                    }
                    if (this.f32686v == -1) {
                        throw new IOException("Mark not set");
                    }
                    ((FilterInputStream) this).in.reset();
                    this.f32685u = this.f32686v;
                }
                return;
            case 2:
                synchronized (this) {
                    if (!((FilterInputStream) this).in.markSupported()) {
                        throw new IOException("Mark not supported");
                    }
                    if (this.f32686v == -1) {
                        throw new IOException("Mark not set");
                    }
                    ((FilterInputStream) this).in.reset();
                    this.f32685u = this.f32686v;
                }
                return;
            default:
                super.reset();
                return;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j6) {
        switch (this.f32684n) {
            case 1:
                long skip = ((FilterInputStream) this).in.skip(Math.min(j6, this.f32685u));
                this.f32685u -= skip;
                return skip;
            case 2:
                long skip2 = ((FilterInputStream) this).in.skip(Math.min(j6, this.f32685u));
                this.f32685u -= skip2;
                return skip2;
            default:
                return super.skip(j6);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3601n5(InputStream inputStream, long j6) {
        super(inputStream);
        this.f32684n = 1;
        this.f32686v = -1L;
        inputStream.getClass();
        AbstractC2772Sd.q("limit must be non-negative", j6 >= 0);
        this.f32685u = j6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3601n5(InputStream inputStream) {
        super(inputStream);
        this.f32684n = 2;
        this.f32686v = -1L;
        this.f32685u = 1048577L;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i6) {
        switch (this.f32684n) {
            case 0:
                int read = super.read(bArr, i, i6);
                if (read != -1) {
                    this.f32686v += read;
                }
                return read;
            case 1:
                long j6 = this.f32685u;
                if (j6 == 0) {
                    return -1;
                }
                int read2 = ((FilterInputStream) this).in.read(bArr, i, (int) Math.min(i6, j6));
                if (read2 != -1) {
                    this.f32685u -= read2;
                }
                return read2;
            case 2:
                long j9 = this.f32685u;
                if (j9 == 0) {
                    return -1;
                }
                int read3 = ((FilterInputStream) this).in.read(bArr, i, (int) Math.min(i6, j9));
                if (read3 != -1) {
                    this.f32685u -= read3;
                }
                return read3;
            default:
                int read4 = super.read(bArr, i, i6);
                if (read4 != -1) {
                    this.f32686v += read4;
                }
                return read4;
        }
    }
}
