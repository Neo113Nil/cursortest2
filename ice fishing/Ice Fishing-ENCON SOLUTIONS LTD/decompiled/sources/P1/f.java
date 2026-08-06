package P1;

import W1.g;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class f extends a {

    /* renamed from: d, reason: collision with root package name */
    public boolean f1513d;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f1499b) {
            return;
        }
        if (!this.f1513d) {
            a();
        }
        this.f1499b = true;
    }

    @Override // P1.a, W1.w
    public final long e(g sink, long j2) {
        i.e(sink, "sink");
        if (this.f1499b) {
            throw new IllegalStateException("closed");
        }
        if (this.f1513d) {
            return -1L;
        }
        long e2 = super.e(sink, 8192L);
        if (e2 != -1) {
            return e2;
        }
        this.f1513d = true;
        a();
        return -1L;
    }
}
