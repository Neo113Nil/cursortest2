package P1;

import D1.z;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class e extends InputStream {

    /* renamed from: v, reason: collision with root package name */
    public static final ArrayDeque f2356v;

    /* renamed from: n, reason: collision with root package name */
    public z f2357n;

    /* renamed from: u, reason: collision with root package name */
    public IOException f2358u;

    static {
        char[] cArr = p.f2376a;
        f2356v = new ArrayDeque(0);
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f2357n.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f2357n.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.f2357n.mark(i);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        this.f2357n.getClass();
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        try {
            return this.f2357n.read();
        } catch (IOException e9) {
            this.f2358u = e9;
            throw e9;
        }
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        this.f2357n.reset();
    }

    @Override // java.io.InputStream
    public final long skip(long j6) {
        try {
            return this.f2357n.skip(j6);
        } catch (IOException e9) {
            this.f2358u = e9;
            throw e9;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        try {
            return this.f2357n.read(bArr);
        } catch (IOException e9) {
            this.f2358u = e9;
            throw e9;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i4) {
        try {
            return this.f2357n.read(bArr, i, i4);
        } catch (IOException e9) {
            this.f2358u = e9;
            throw e9;
        }
    }
}
