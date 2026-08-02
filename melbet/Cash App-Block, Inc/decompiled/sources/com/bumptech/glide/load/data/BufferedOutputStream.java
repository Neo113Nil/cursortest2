package com.bumptech.glide.load.data;

import com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool;
import java.io.FileOutputStream;
import java.io.OutputStream;

/* loaded from: classes4.dex */
public final class BufferedOutputStream extends OutputStream {
    public final LruArrayPool arrayPool;
    public byte[] buffer;
    public int index;
    public final FileOutputStream out;

    public BufferedOutputStream(FileOutputStream fileOutputStream, LruArrayPool lruArrayPool) {
        this.out = fileOutputStream;
        this.arrayPool = lruArrayPool;
        this.buffer = (byte[]) lruArrayPool.get(byte[].class, 65536);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        FileOutputStream fileOutputStream = this.out;
        try {
            flush();
            fileOutputStream.close();
            byte[] bArr = this.buffer;
            if (bArr != null) {
                this.arrayPool.put(bArr);
                this.buffer = null;
            }
        } catch (Throwable th) {
            fileOutputStream.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        int i = this.index;
        FileOutputStream fileOutputStream = this.out;
        if (i > 0) {
            fileOutputStream.write(this.buffer, 0, i);
            this.index = 0;
        }
        fileOutputStream.flush();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        int i3 = 0;
        do {
            int i4 = i2 - i3;
            int i5 = i + i3;
            int i6 = this.index;
            FileOutputStream fileOutputStream = this.out;
            if (i6 == 0 && i4 >= this.buffer.length) {
                fileOutputStream.write(bArr, i5, i4);
                return;
            }
            int min = Math.min(i4, this.buffer.length - i6);
            System.arraycopy(bArr, i5, this.buffer, this.index, min);
            int i7 = this.index + min;
            this.index = i7;
            i3 += min;
            byte[] bArr2 = this.buffer;
            if (i7 == bArr2.length && i7 > 0) {
                fileOutputStream.write(bArr2, 0, i7);
                this.index = 0;
            }
        } while (i3 < i2);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        byte[] bArr = this.buffer;
        int i2 = this.index;
        int i3 = i2 + 1;
        this.index = i3;
        bArr[i2] = (byte) i;
        if (i3 != bArr.length || i3 <= 0) {
            return;
        }
        this.out.write(bArr, 0, i3);
        this.index = 0;
    }
}
