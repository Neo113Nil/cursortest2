package o8;

import i8.l;
import kotlin.jvm.internal.h;

/* loaded from: classes2.dex */
public final class f extends a {

    /* renamed from: x, reason: collision with root package name */
    public boolean f39777x;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f39764v) {
            return;
        }
        if (!this.f39777x) {
            a(g.f39778f);
        }
        this.f39764v = true;
    }

    @Override // o8.a, y8.x
    public final long d(long j6, y8.e sink) {
        h.e(sink, "sink");
        if (this.f39764v) {
            throw new IllegalStateException("closed");
        }
        if (this.f39777x) {
            return -1L;
        }
        long d9 = super.d(8192L, sink);
        if (d9 != -1) {
            return d9;
        }
        this.f39777x = true;
        a(l.f38268u);
        return -1L;
    }
}
