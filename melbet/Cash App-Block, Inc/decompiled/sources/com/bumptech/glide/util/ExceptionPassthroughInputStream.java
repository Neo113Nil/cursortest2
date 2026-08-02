package com.bumptech.glide.util;

import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;

/* loaded from: classes4.dex */
public final class ExceptionPassthroughInputStream extends InputStream {
    public static final ArrayDeque POOL = new ArrayDeque(0);
    public IOException exception;
    public RecyclableBufferedInputStream wrapped;

    @Override // java.io.InputStream
    public final int available() {
        return this.wrapped.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.wrapped.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.wrapped.mark(i);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        this.wrapped.getClass();
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        try {
            return this.wrapped.read();
        } catch (IOException e) {
            this.exception = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        this.wrapped.reset();
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        try {
            return this.wrapped.skip(j);
        } catch (IOException e) {
            this.exception = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        try {
            return this.wrapped.read(bArr);
        } catch (IOException e) {
            this.exception = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        try {
            return this.wrapped.read(bArr, i, i2);
        } catch (IOException e) {
            this.exception = e;
            throw e;
        }
    }
}
