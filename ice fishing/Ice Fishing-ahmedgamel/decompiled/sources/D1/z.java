package D1;

import com.google.android.gms.internal.ads.C2964aq;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class z extends FilterInputStream {

    /* renamed from: n, reason: collision with root package name */
    public volatile byte[] f583n;

    /* renamed from: u, reason: collision with root package name */
    public int f584u;

    /* renamed from: v, reason: collision with root package name */
    public int f585v;

    /* renamed from: w, reason: collision with root package name */
    public int f586w;

    /* renamed from: x, reason: collision with root package name */
    public int f587x;

    /* renamed from: y, reason: collision with root package name */
    public final C2964aq f588y;

    public z(InputStream inputStream, C2964aq c2964aq) {
        super(inputStream);
        this.f586w = -1;
        this.f588y = c2964aq;
        this.f583n = (byte[]) c2964aq.f(com.anythink.basead.exoplayer.b.aX, byte[].class);
    }

    public static void j() {
        throw new IOException("BufferedInputStream is closed");
    }

    public final int a(InputStream inputStream, byte[] bArr) {
        int i = this.f586w;
        if (i != -1) {
            int i4 = this.f587x - i;
            int i6 = this.f585v;
            if (i4 < i6) {
                if (i == 0 && i6 > bArr.length && this.f584u == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i6) {
                        i6 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f588y.f(i6, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f583n = bArr2;
                    this.f588y.k(bArr);
                    bArr = bArr2;
                } else if (i > 0) {
                    System.arraycopy(bArr, i, bArr, 0, bArr.length - i);
                }
                int i9 = this.f587x - this.f586w;
                this.f587x = i9;
                this.f586w = 0;
                this.f584u = 0;
                int read = inputStream.read(bArr, i9, bArr.length - i9);
                int i10 = this.f587x;
                if (read > 0) {
                    i10 += read;
                }
                this.f584u = i10;
                return read;
            }
        }
        int read2 = inputStream.read(bArr);
        if (read2 > 0) {
            this.f586w = -1;
            this.f587x = 0;
            this.f584u = read2;
        }
        return read2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f583n == null || inputStream == null) {
            j();
            throw null;
        }
        return (this.f584u - this.f587x) + inputStream.available();
    }

    public final synchronized void b() {
        if (this.f583n != null) {
            this.f588y.k(this.f583n);
            this.f583n = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f583n != null) {
            this.f588y.k(this.f583n);
            this.f583n = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        this.f585v = Math.max(this.f585v, i);
        this.f586w = this.f587x;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        byte[] bArr = this.f583n;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            j();
            throw null;
        }
        if (this.f587x >= this.f584u && a(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.f583n && (bArr = this.f583n) == null) {
            j();
            throw null;
        }
        int i = this.f584u;
        int i4 = this.f587x;
        if (i - i4 <= 0) {
            return -1;
        }
        this.f587x = i4 + 1;
        return bArr[i4] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (this.f583n == null) {
            throw new IOException("Stream is closed");
        }
        int i = this.f586w;
        if (-1 == i) {
            throw new y("Mark has been invalidated, pos: " + this.f587x + " markLimit: " + this.f585v);
        }
        this.f587x = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j6) {
        if (j6 < 1) {
            return 0L;
        }
        byte[] bArr = this.f583n;
        if (bArr == null) {
            j();
            throw null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            j();
            throw null;
        }
        int i = this.f584u;
        int i4 = this.f587x;
        if (i - i4 >= j6) {
            this.f587x = (int) (i4 + j6);
            return j6;
        }
        long j9 = i - i4;
        this.f587x = i;
        if (this.f586w == -1 || j6 > this.f585v) {
            long skip = inputStream.skip(j6 - j9);
            if (skip > 0) {
                this.f586w = -1;
            }
            return j9 + skip;
        }
        if (a(inputStream, bArr) == -1) {
            return j9;
        }
        int i6 = this.f584u;
        int i9 = this.f587x;
        if (i6 - i9 >= j6 - j9) {
            this.f587x = (int) ((i9 + j6) - j9);
            return j6;
        }
        long j10 = (j9 + i6) - i9;
        this.f587x = i6;
        return j10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i4) {
        int i6;
        int i9;
        byte[] bArr2 = this.f583n;
        if (bArr2 == null) {
            j();
            throw null;
        }
        if (i4 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            int i10 = this.f587x;
            int i11 = this.f584u;
            if (i10 < i11) {
                int i12 = i11 - i10;
                if (i12 >= i4) {
                    i12 = i4;
                }
                System.arraycopy(bArr2, i10, bArr, i, i12);
                this.f587x += i12;
                if (i12 == i4 || inputStream.available() == 0) {
                    return i12;
                }
                i += i12;
                i6 = i4 - i12;
            } else {
                i6 = i4;
            }
            while (true) {
                if (this.f586w == -1 && i6 >= bArr2.length) {
                    i9 = inputStream.read(bArr, i, i6);
                    if (i9 == -1) {
                        return i6 != i4 ? i4 - i6 : -1;
                    }
                } else {
                    if (a(inputStream, bArr2) == -1) {
                        return i6 != i4 ? i4 - i6 : -1;
                    }
                    if (bArr2 != this.f583n && (bArr2 = this.f583n) == null) {
                        j();
                        throw null;
                    }
                    int i13 = this.f584u;
                    int i14 = this.f587x;
                    i9 = i13 - i14;
                    if (i9 >= i6) {
                        i9 = i6;
                    }
                    System.arraycopy(bArr2, i14, bArr, i, i9);
                    this.f587x += i9;
                }
                i6 -= i9;
                if (i6 == 0) {
                    return i4;
                }
                if (inputStream.available() == 0) {
                    return i4 - i6;
                }
                i += i9;
            }
        } else {
            j();
            throw null;
        }
    }
}
