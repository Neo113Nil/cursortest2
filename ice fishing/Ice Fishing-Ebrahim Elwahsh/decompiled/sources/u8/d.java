package u8;

import java.io.Closeable;

/* loaded from: classes2.dex */
public final class d implements Closeable {

    /* renamed from: n, reason: collision with root package name */
    public e f41272n;

    /* renamed from: u, reason: collision with root package name */
    public boolean f41273u;

    /* renamed from: v, reason: collision with root package name */
    public byte[] f41274v;

    /* renamed from: w, reason: collision with root package name */
    public int f41275w = -1;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f41272n == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        this.f41272n = null;
        this.f41274v = null;
        this.f41275w = -1;
    }
}
