package o8;

import i8.l;
import kotlin.jvm.internal.h;

/* loaded from: classes2.dex */
public final class f extends a {

    /* renamed from: x, reason: collision with root package name */
    public boolean f39669x;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f39656v) {
            return;
        }
        if (!this.f39669x) {
            a(g.f39670f);
        }
        this.f39656v = true;
    }

    @Override // o8.a, y8.x
    public final long d(long j6, y8.e sink) {
        h.e(sink, "sink");
        if (this.f39656v) {
            throw new IllegalStateException("closed");
        }
        if (this.f39669x) {
            return -1L;
        }
        long d2 = super.d(8192L, sink);
        if (d2 != -1) {
            return d2;
        }
        this.f39669x = true;
        a(l.f38149u);
        return -1L;
    }
}
