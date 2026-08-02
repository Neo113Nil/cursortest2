package com.bumptech.glide.load.data;

import com.google.android.gms.internal.ads.Wv;
import java.io.FilterInputStream;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class h extends FilterInputStream {

    /* renamed from: v, reason: collision with root package name */
    public static final byte[] f24212v = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};

    /* renamed from: w, reason: collision with root package name */
    public static final int f24213w = 31;

    /* renamed from: n, reason: collision with root package name */
    public final byte f24214n;

    /* renamed from: u, reason: collision with root package name */
    public int f24215u;

    public h(InputStream inputStream, int i) {
        super(inputStream);
        if (i < -1 || i > 8) {
            throw new IllegalArgumentException(Wv.f(i, "Cannot add invalid orientation: "));
        }
        this.f24214n = (byte) i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int i;
        int i4 = this.f24215u;
        int read = (i4 < 2 || i4 > (i = f24213w)) ? super.read() : i4 == i ? this.f24214n : f24212v[i4 - 2] & 255;
        if (read != -1) {
            this.f24215u++;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j6) {
        long skip = super.skip(j6);
        if (skip > 0) {
            this.f24215u = (int) (this.f24215u + skip);
        }
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i4) {
        int i6;
        int i9 = this.f24215u;
        int i10 = f24213w;
        if (i9 > i10) {
            i6 = super.read(bArr, i, i4);
        } else if (i9 == i10) {
            bArr[i] = this.f24214n;
            i6 = 1;
        } else if (i9 < 2) {
            i6 = super.read(bArr, i, 2 - i9);
        } else {
            int min = Math.min(i10 - i9, i4);
            System.arraycopy(f24212v, this.f24215u - 2, bArr, i, min);
            i6 = min;
        }
        if (i6 > 0) {
            this.f24215u += i6;
        }
        return i6;
    }
}
