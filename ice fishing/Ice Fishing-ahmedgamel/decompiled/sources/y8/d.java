package y8;

import java.io.Closeable;

/* loaded from: classes2.dex */
public final class d implements Closeable {

    /* renamed from: n, reason: collision with root package name */
    public e f41948n;

    /* renamed from: u, reason: collision with root package name */
    public boolean f41949u;

    /* renamed from: v, reason: collision with root package name */
    public byte[] f41950v;

    /* renamed from: w, reason: collision with root package name */
    public int f41951w = -1;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f41948n == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        this.f41948n = null;
        this.f41950v = null;
        this.f41951w = -1;
    }
}
