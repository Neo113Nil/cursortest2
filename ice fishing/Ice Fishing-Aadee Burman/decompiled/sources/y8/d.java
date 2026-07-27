package y8;

import java.io.Closeable;

/* loaded from: classes2.dex */
public final class d implements Closeable {

    /* renamed from: n, reason: collision with root package name */
    public e f41945n;

    /* renamed from: u, reason: collision with root package name */
    public boolean f41946u;

    /* renamed from: v, reason: collision with root package name */
    public byte[] f41947v;

    /* renamed from: w, reason: collision with root package name */
    public int f41948w = -1;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f41945n == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        this.f41945n = null;
        this.f41947v = null;
        this.f41948w = -1;
    }
}
