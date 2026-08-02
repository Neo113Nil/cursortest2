package com.bumptech.glide.load.resource.bitmap;

import com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes4.dex */
public final class RecyclableBufferedInputStream extends FilterInputStream {
    public volatile byte[] buf;
    public final LruArrayPool byteArrayPool;
    public int count;
    public int marklimit;
    public int markpos;
    public int pos;

    final class InvalidMarkException extends IOException {
    }

    public RecyclableBufferedInputStream(InputStream inputStream, LruArrayPool lruArrayPool) {
        super(inputStream);
        this.markpos = -1;
        this.byteArrayPool = lruArrayPool;
        this.buf = (byte[]) lruArrayPool.get(byte[].class, 65536);
    }

    public static void streamClosed() {
        throw new IOException("BufferedInputStream is closed");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.buf == null || inputStream == null) {
            streamClosed();
            throw null;
        }
        return (this.count - this.pos) + inputStream.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.buf != null) {
            this.byteArrayPool.put(this.buf);
            this.buf = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public final int fillbuf(InputStream inputStream, byte[] bArr) {
        int i = this.markpos;
        if (i != -1) {
            int i2 = this.pos - i;
            int i3 = this.marklimit;
            if (i2 < i3) {
                if (i == 0 && i3 > bArr.length && this.count == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i3) {
                        i3 = length;
                    }
                    byte[] bArr2 = (byte[]) this.byteArrayPool.get(byte[].class, i3);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.buf = bArr2;
                    this.byteArrayPool.put(bArr);
                    bArr = bArr2;
                } else if (i > 0) {
                    System.arraycopy(bArr, i, bArr, 0, bArr.length - i);
                }
                int i4 = this.pos - this.markpos;
                this.pos = i4;
                this.markpos = 0;
                this.count = 0;
                int read = inputStream.read(bArr, i4, bArr.length - i4);
                int i5 = this.pos;
                if (read > 0) {
                    i5 += read;
                }
                this.count = i5;
                return read;
            }
        }
        int read2 = inputStream.read(bArr);
        if (read2 > 0) {
            this.markpos = -1;
            this.pos = 0;
            this.count = read2;
        }
        return read2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        this.marklimit = Math.max(this.marklimit, i);
        this.markpos = this.pos;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        byte[] bArr2 = this.buf;
        if (bArr2 == null) {
            streamClosed();
            throw null;
        }
        if (i2 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            streamClosed();
            throw null;
        }
        int i5 = this.pos;
        int i6 = this.count;
        if (i5 < i6) {
            int i7 = i6 - i5;
            if (i7 >= i2) {
                i7 = i2;
            }
            System.arraycopy(bArr2, i5, bArr, i, i7);
            this.pos += i7;
            if (i7 == i2 || inputStream.available() == 0) {
                return i7;
            }
            i += i7;
            i3 = i2 - i7;
        } else {
            i3 = i2;
        }
        while (true) {
            if (this.markpos == -1 && i3 >= bArr2.length) {
                i4 = inputStream.read(bArr, i, i3);
                if (i4 == -1) {
                    return i3 != i2 ? i2 - i3 : -1;
                }
            } else {
                if (fillbuf(inputStream, bArr2) == -1) {
                    return i3 != i2 ? i2 - i3 : -1;
                }
                if (bArr2 != this.buf && (bArr2 = this.buf) == null) {
                    streamClosed();
                    throw null;
                }
                int i8 = this.count;
                int i9 = this.pos;
                i4 = i8 - i9;
                if (i4 >= i3) {
                    i4 = i3;
                }
                System.arraycopy(bArr2, i9, bArr, i, i4);
                this.pos += i4;
            }
            i3 -= i4;
            if (i3 == 0) {
                return i2;
            }
            if (inputStream.available() == 0) {
                return i2 - i3;
            }
            i += i4;
        }
    }

    public final synchronized void release() {
        if (this.buf != null) {
            this.byteArrayPool.put(this.buf);
            this.buf = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (this.buf == null) {
            throw new IOException("Stream is closed");
        }
        int i = this.markpos;
        if (-1 == i) {
            throw new InvalidMarkException("Mark has been invalidated, pos: " + this.pos + " markLimit: " + this.marklimit);
        }
        this.pos = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j) {
        if (j < 1) {
            return 0L;
        }
        byte[] bArr = this.buf;
        if (bArr == null) {
            streamClosed();
            throw null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            streamClosed();
            throw null;
        }
        int i = this.count;
        int i2 = this.pos;
        if (i - i2 >= j) {
            this.pos = (int) (i2 + j);
            return j;
        }
        long j2 = i - i2;
        this.pos = i;
        if (this.markpos == -1 || j > this.marklimit) {
            long skip = inputStream.skip(j - j2);
            if (skip > 0) {
                this.markpos = -1;
            }
            return j2 + skip;
        }
        if (fillbuf(inputStream, bArr) == -1) {
            return j2;
        }
        int i3 = this.count;
        int i4 = this.pos;
        if (i3 - i4 >= j - j2) {
            this.pos = (int) ((i4 + j) - j2);
            return j;
        }
        long j3 = (j2 + i3) - i4;
        this.pos = i3;
        return j3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        byte[] bArr = this.buf;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr != null && inputStream != null) {
            if (this.pos >= this.count && fillbuf(inputStream, bArr) == -1) {
                return -1;
            }
            if (bArr != this.buf && (bArr = this.buf) == null) {
                streamClosed();
                throw null;
            }
            int i = this.count;
            int i2 = this.pos;
            if (i - i2 <= 0) {
                return -1;
            }
            this.pos = i2 + 1;
            return bArr[i2] & 255;
        }
        streamClosed();
        throw null;
    }
}
