package com.google.android.gms.internal.ads;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.android.gms.internal.ads.n5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3624n5 extends FilterInputStream {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f33462n;

    /* renamed from: u, reason: collision with root package name */
    public long f33463u;

    /* renamed from: v, reason: collision with root package name */
    public long f33464v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3624n5(BufferedInputStream bufferedInputStream, long j6, int i) {
        super(bufferedInputStream);
        this.f33462n = i;
        this.f33463u = j6;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        switch (this.f33462n) {
            case 1:
                return (int) Math.min(((FilterInputStream) this).in.available(), this.f33463u);
            case 2:
                return (int) Math.min(((FilterInputStream) this).in.available(), this.f33463u);
            default:
                return super.available();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i) {
        switch (this.f33462n) {
            case 1:
                synchronized (this) {
                    ((FilterInputStream) this).in.mark(i);
                    this.f33464v = this.f33463u;
                }
                return;
            case 2:
                synchronized (this) {
                    ((FilterInputStream) this).in.mark(i);
                    this.f33464v = this.f33463u;
                }
                return;
            default:
                super.mark(i);
                return;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        switch (this.f33462n) {
            case 0:
                int read = super.read();
                if (read != -1) {
                    this.f33464v++;
                }
                return read;
            case 1:
                if (this.f33463u == 0) {
                    return -1;
                }
                int read2 = ((FilterInputStream) this).in.read();
                if (read2 != -1) {
                    this.f33463u--;
                }
                return read2;
            case 2:
                if (this.f33463u == 0) {
                    return -1;
                }
                int read3 = ((FilterInputStream) this).in.read();
                if (read3 != -1) {
                    this.f33463u--;
                }
                return read3;
            default:
                int read4 = super.read();
                if (read4 != -1) {
                    this.f33464v++;
                }
                return read4;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        switch (this.f33462n) {
            case 1:
                synchronized (this) {
                    if (!((FilterInputStream) this).in.markSupported()) {
                        throw new IOException("Mark not supported");
                    }
                    if (this.f33464v == -1) {
                        throw new IOException("Mark not set");
                    }
                    ((FilterInputStream) this).in.reset();
                    this.f33463u = this.f33464v;
                }
                return;
            case 2:
                synchronized (this) {
                    if (!((FilterInputStream) this).in.markSupported()) {
                        throw new IOException("Mark not supported");
                    }
                    if (this.f33464v == -1) {
                        throw new IOException("Mark not set");
                    }
                    ((FilterInputStream) this).in.reset();
                    this.f33463u = this.f33464v;
                }
                return;
            default:
                super.reset();
                return;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j6) {
        switch (this.f33462n) {
            case 1:
                long skip = ((FilterInputStream) this).in.skip(Math.min(j6, this.f33463u));
                this.f33463u -= skip;
                return skip;
            case 2:
                long skip2 = ((FilterInputStream) this).in.skip(Math.min(j6, this.f33463u));
                this.f33463u -= skip2;
                return skip2;
            default:
                return super.skip(j6);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3624n5(InputStream inputStream, long j6) {
        super(inputStream);
        this.f33462n = 1;
        this.f33464v = -1L;
        inputStream.getClass();
        AbstractC2792Sd.q("limit must be non-negative", j6 >= 0);
        this.f33463u = j6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3624n5(InputStream inputStream) {
        super(inputStream);
        this.f33462n = 2;
        this.f33464v = -1L;
        this.f33463u = 1048577L;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i4) {
        switch (this.f33462n) {
            case 0:
                int read = super.read(bArr, i, i4);
                if (read != -1) {
                    this.f33464v += read;
                }
                return read;
            case 1:
                long j6 = this.f33463u;
                if (j6 == 0) {
                    return -1;
                }
                int read2 = ((FilterInputStream) this).in.read(bArr, i, (int) Math.min(i4, j6));
                if (read2 != -1) {
                    this.f33463u -= read2;
                }
                return read2;
            case 2:
                long j9 = this.f33463u;
                if (j9 == 0) {
                    return -1;
                }
                int read3 = ((FilterInputStream) this).in.read(bArr, i, (int) Math.min(i4, j9));
                if (read3 != -1) {
                    this.f33463u -= read3;
                }
                return read3;
            default:
                int read4 = super.read(bArr, i, i4);
                if (read4 != -1) {
                    this.f33464v += read4;
                }
                return read4;
        }
    }
}
