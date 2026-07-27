package N1;

import B1.z;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class e extends InputStream {

    /* renamed from: v, reason: collision with root package name */
    public static final ArrayDeque f1956v;

    /* renamed from: n, reason: collision with root package name */
    public z f1957n;

    /* renamed from: u, reason: collision with root package name */
    public IOException f1958u;

    static {
        char[] cArr = p.f1976a;
        f1956v = new ArrayDeque(0);
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f1957n.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f1957n.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.f1957n.mark(i);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        this.f1957n.getClass();
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        try {
            return this.f1957n.read();
        } catch (IOException e6) {
            this.f1958u = e6;
            throw e6;
        }
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        this.f1957n.reset();
    }

    @Override // java.io.InputStream
    public final long skip(long j9) {
        try {
            return this.f1957n.skip(j9);
        } catch (IOException e6) {
            this.f1958u = e6;
            throw e6;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        try {
            return this.f1957n.read(bArr);
        } catch (IOException e6) {
            this.f1958u = e6;
            throw e6;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i4) {
        try {
            return this.f1957n.read(bArr, i, i4);
        } catch (IOException e6) {
            this.f1958u = e6;
            throw e6;
        }
    }
}
