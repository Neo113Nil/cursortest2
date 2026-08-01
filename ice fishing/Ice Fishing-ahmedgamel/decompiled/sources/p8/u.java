package p8;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class u implements y8.x {

    /* renamed from: n, reason: collision with root package name */
    public final y8.r f39910n;

    /* renamed from: u, reason: collision with root package name */
    public int f39911u;

    /* renamed from: v, reason: collision with root package name */
    public int f39912v;

    /* renamed from: w, reason: collision with root package name */
    public int f39913w;

    /* renamed from: x, reason: collision with root package name */
    public int f39914x;

    /* renamed from: y, reason: collision with root package name */
    public int f39915y;

    public u(y8.r source) {
        kotlin.jvm.internal.h.e(source, "source");
        this.f39910n = source;
    }

    @Override // y8.x
    public final y8.z L() {
        return this.f39910n.f41984n.L();
    }

    @Override // y8.x
    public final long d(long j6, y8.e sink) {
        int i;
        int B9;
        kotlin.jvm.internal.h.e(sink, "sink");
        do {
            int i6 = this.f39914x;
            y8.r rVar = this.f39910n;
            if (i6 == 0) {
                rVar.F(this.f39915y);
                this.f39915y = 0;
                if ((this.f39912v & 4) == 0) {
                    i = this.f39913w;
                    int k9 = j8.c.k(rVar);
                    this.f39914x = k9;
                    this.f39911u = k9;
                    int z3 = rVar.z() & 255;
                    this.f39912v = rVar.z() & 255;
                    Logger logger = v.f39916w;
                    if (logger.isLoggable(Level.FINE)) {
                        y8.h hVar = h.f39851a;
                        logger.fine(h.b(this.f39913w, this.f39911u, z3, this.f39912v, true));
                    }
                    B9 = rVar.B() & Integer.MAX_VALUE;
                    this.f39913w = B9;
                    if (z3 != 9) {
                        throw new IOException(z3 + " != TYPE_CONTINUATION");
                    }
                }
            } else {
                long d2 = rVar.d(Math.min(8192L, i6), sink);
                if (d2 != -1) {
                    this.f39914x -= (int) d2;
                    return d2;
                }
            }
            return -1L;
        } while (B9 == i);
        throw new IOException("TYPE_CONTINUATION streamId changed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
