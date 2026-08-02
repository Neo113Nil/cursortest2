package p8;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class u implements y8.x {

    /* renamed from: n, reason: collision with root package name */
    public final y8.r f39957n;

    /* renamed from: u, reason: collision with root package name */
    public int f39958u;

    /* renamed from: v, reason: collision with root package name */
    public int f39959v;

    /* renamed from: w, reason: collision with root package name */
    public int f39960w;

    /* renamed from: x, reason: collision with root package name */
    public int f39961x;

    /* renamed from: y, reason: collision with root package name */
    public int f39962y;

    public u(y8.r source) {
        kotlin.jvm.internal.h.e(source, "source");
        this.f39957n = source;
    }

    @Override // y8.x
    public final y8.z L() {
        return this.f39957n.f41955n.L();
    }

    @Override // y8.x
    public final long d(long j6, y8.e sink) {
        int i;
        int B3;
        kotlin.jvm.internal.h.e(sink, "sink");
        do {
            int i4 = this.f39961x;
            y8.r rVar = this.f39957n;
            if (i4 == 0) {
                rVar.F(this.f39962y);
                this.f39962y = 0;
                if ((this.f39959v & 4) == 0) {
                    i = this.f39960w;
                    int k9 = j8.c.k(rVar);
                    this.f39961x = k9;
                    this.f39958u = k9;
                    int z6 = rVar.z() & 255;
                    this.f39959v = rVar.z() & 255;
                    Logger logger = v.f39963w;
                    if (logger.isLoggable(Level.FINE)) {
                        y8.h hVar = h.f39898a;
                        logger.fine(h.b(this.f39960w, this.f39958u, z6, this.f39959v, true));
                    }
                    B3 = rVar.B() & Integer.MAX_VALUE;
                    this.f39960w = B3;
                    if (z6 != 9) {
                        throw new IOException(z6 + " != TYPE_CONTINUATION");
                    }
                }
            } else {
                long d9 = rVar.d(Math.min(8192L, i4), sink);
                if (d9 != -1) {
                    this.f39961x -= (int) d9;
                    return d9;
                }
            }
            return -1L;
        } while (B3 == i);
        throw new IOException("TYPE_CONTINUATION streamId changed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
