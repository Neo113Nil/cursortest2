package B1;

import com.google.android.gms.internal.ads.C2941aq;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class A extends FilterInputStream {

    /* renamed from: n, reason: collision with root package name */
    public volatile byte[] f97n;

    /* renamed from: u, reason: collision with root package name */
    public int f98u;

    /* renamed from: v, reason: collision with root package name */
    public int f99v;

    /* renamed from: w, reason: collision with root package name */
    public int f100w;

    /* renamed from: x, reason: collision with root package name */
    public int f101x;

    /* renamed from: y, reason: collision with root package name */
    public final C2941aq f102y;

    public A(InputStream inputStream, C2941aq c2941aq) {
        super(inputStream);
        this.f100w = -1;
        this.f102y = c2941aq;
        this.f97n = (byte[]) c2941aq.f(com.anythink.basead.exoplayer.b.aX, byte[].class);
    }

    public static void j() {
        throw new IOException("BufferedInputStream is closed");
    }

    public final int a(InputStream inputStream, byte[] bArr) {
        int i = this.f100w;
        if (i != -1) {
            int i6 = this.f101x - i;
            int i9 = this.f99v;
            if (i6 < i9) {
                if (i == 0 && i9 > bArr.length && this.f98u == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i9) {
                        i9 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f102y.f(i9, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f97n = bArr2;
                    this.f102y.k(bArr);
                    bArr = bArr2;
                } else if (i > 0) {
                    System.arraycopy(bArr, i, bArr, 0, bArr.length - i);
                }
                int i10 = this.f101x - this.f100w;
                this.f101x = i10;
                this.f100w = 0;
                this.f98u = 0;
                int read = inputStream.read(bArr, i10, bArr.length - i10);
                int i11 = this.f101x;
                if (read > 0) {
                    i11 += read;
                }
                this.f98u = i11;
                return read;
            }
        }
        int read2 = inputStream.read(bArr);
        if (read2 > 0) {
            this.f100w = -1;
            this.f101x = 0;
            this.f98u = read2;
        }
        return read2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f97n == null || inputStream == null) {
            j();
            throw null;
        }
        return (this.f98u - this.f101x) + inputStream.available();
    }

    public final synchronized void b() {
        if (this.f97n != null) {
            this.f102y.k(this.f97n);
            this.f97n = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f97n != null) {
            this.f102y.k(this.f97n);
            this.f97n = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        this.f99v = Math.max(this.f99v, i);
        this.f100w = this.f101x;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        byte[] bArr = this.f97n;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            j();
            throw null;
        }
        if (this.f101x >= this.f98u && a(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.f97n && (bArr = this.f97n) == null) {
            j();
            throw null;
        }
        int i = this.f98u;
        int i6 = this.f101x;
        if (i - i6 <= 0) {
            return -1;
        }
        this.f101x = i6 + 1;
        return bArr[i6] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (this.f97n == null) {
            throw new IOException("Stream is closed");
        }
        int i = this.f100w;
        if (-1 == i) {
            throw new z("Mark has been invalidated, pos: " + this.f101x + " markLimit: " + this.f99v);
        }
        this.f101x = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j6) {
        if (j6 < 1) {
            return 0L;
        }
        byte[] bArr = this.f97n;
        if (bArr == null) {
            j();
            throw null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            j();
            throw null;
        }
        int i = this.f98u;
        int i6 = this.f101x;
        if (i - i6 >= j6) {
            this.f101x = (int) (i6 + j6);
            return j6;
        }
        long j9 = i - i6;
        this.f101x = i;
        if (this.f100w == -1 || j6 > this.f99v) {
            long skip = inputStream.skip(j6 - j9);
            if (skip > 0) {
                this.f100w = -1;
            }
            return j9 + skip;
        }
        if (a(inputStream, bArr) == -1) {
            return j9;
        }
        int i9 = this.f98u;
        int i10 = this.f101x;
        if (i9 - i10 >= j6 - j9) {
            this.f101x = (int) ((i10 + j6) - j9);
            return j6;
        }
        long j10 = (j9 + i9) - i10;
        this.f101x = i9;
        return j10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i6) {
        int i9;
        int i10;
        byte[] bArr2 = this.f97n;
        if (bArr2 == null) {
            j();
            throw null;
        }
        if (i6 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            int i11 = this.f101x;
            int i12 = this.f98u;
            if (i11 < i12) {
                int i13 = i12 - i11;
                if (i13 >= i6) {
                    i13 = i6;
                }
                System.arraycopy(bArr2, i11, bArr, i, i13);
                this.f101x += i13;
                if (i13 == i6 || inputStream.available() == 0) {
                    return i13;
                }
                i += i13;
                i9 = i6 - i13;
            } else {
                i9 = i6;
            }
            while (true) {
                if (this.f100w == -1 && i9 >= bArr2.length) {
                    i10 = inputStream.read(bArr, i, i9);
                    if (i10 == -1) {
                        return i9 != i6 ? i6 - i9 : -1;
                    }
                } else {
                    if (a(inputStream, bArr2) == -1) {
                        return i9 != i6 ? i6 - i9 : -1;
                    }
                    if (bArr2 != this.f97n && (bArr2 = this.f97n) == null) {
                        j();
                        throw null;
                    }
                    int i14 = this.f98u;
                    int i15 = this.f101x;
                    i10 = i14 - i15;
                    if (i10 >= i9) {
                        i10 = i9;
                    }
                    System.arraycopy(bArr2, i15, bArr, i, i10);
                    this.f101x += i10;
                }
                i9 -= i10;
                if (i9 == 0) {
                    return i6;
                }
                if (inputStream.available() == 0) {
                    return i6 - i9;
                }
                i += i10;
            }
        } else {
            j();
            throw null;
        }
    }
}
