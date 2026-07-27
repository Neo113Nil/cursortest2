package com.bumptech.glide.load.data;

import com.icefishing.icefishinglive2.AbstractC4404f;
import java.io.FilterInputStream;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class h extends FilterInputStream {

    /* renamed from: v, reason: collision with root package name */
    public static final byte[] f23425v = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};

    /* renamed from: w, reason: collision with root package name */
    public static final int f23426w = 31;

    /* renamed from: n, reason: collision with root package name */
    public final byte f23427n;

    /* renamed from: u, reason: collision with root package name */
    public int f23428u;

    public h(InputStream inputStream, int i) {
        super(inputStream);
        if (i < -1 || i > 8) {
            throw new IllegalArgumentException(AbstractC4404f.e(i, "Cannot add invalid orientation: "));
        }
        this.f23427n = (byte) i;
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
        int i6 = this.f23428u;
        int read = (i6 < 2 || i6 > (i = f23426w)) ? super.read() : i6 == i ? this.f23427n : f23425v[i6 - 2] & 255;
        if (read != -1) {
            this.f23428u++;
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
            this.f23428u = (int) (this.f23428u + skip);
        }
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i6) {
        int i9;
        int i10 = this.f23428u;
        int i11 = f23426w;
        if (i10 > i11) {
            i9 = super.read(bArr, i, i6);
        } else if (i10 == i11) {
            bArr[i] = this.f23427n;
            i9 = 1;
        } else if (i10 < 2) {
            i9 = super.read(bArr, i, 2 - i10);
        } else {
            int min = Math.min(i11 - i10, i6);
            System.arraycopy(f23425v, this.f23428u - 2, bArr, i, min);
            i9 = min;
        }
        if (i9 > 0) {
            this.f23428u += i9;
        }
        return i9;
    }
}
