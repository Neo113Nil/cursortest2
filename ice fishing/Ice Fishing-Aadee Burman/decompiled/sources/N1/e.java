package N1;

import B1.A;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class e extends InputStream {

    /* renamed from: v, reason: collision with root package name */
    public static final ArrayDeque f1912v;

    /* renamed from: n, reason: collision with root package name */
    public A f1913n;

    /* renamed from: u, reason: collision with root package name */
    public IOException f1914u;

    static {
        char[] cArr = p.f1932a;
        f1912v = new ArrayDeque(0);
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f1913n.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f1913n.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.f1913n.mark(i);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        this.f1913n.getClass();
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        try {
            return this.f1913n.read();
        } catch (IOException e9) {
            this.f1914u = e9;
            throw e9;
        }
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        this.f1913n.reset();
    }

    @Override // java.io.InputStream
    public final long skip(long j6) {
        try {
            return this.f1913n.skip(j6);
        } catch (IOException e9) {
            this.f1914u = e9;
            throw e9;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        try {
            return this.f1913n.read(bArr);
        } catch (IOException e9) {
            this.f1914u = e9;
            throw e9;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i6) {
        try {
            return this.f1913n.read(bArr, i, i6);
        } catch (IOException e9) {
            this.f1914u = e9;
            throw e9;
        }
    }
}
