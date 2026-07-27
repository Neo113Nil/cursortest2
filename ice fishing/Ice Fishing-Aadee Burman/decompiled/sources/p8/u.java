package p8;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class u implements y8.x {

    /* renamed from: n, reason: collision with root package name */
    public final y8.r f39907n;

    /* renamed from: u, reason: collision with root package name */
    public int f39908u;

    /* renamed from: v, reason: collision with root package name */
    public int f39909v;

    /* renamed from: w, reason: collision with root package name */
    public int f39910w;

    /* renamed from: x, reason: collision with root package name */
    public int f39911x;

    /* renamed from: y, reason: collision with root package name */
    public int f39912y;

    public u(y8.r source) {
        kotlin.jvm.internal.h.e(source, "source");
        this.f39907n = source;
    }

    @Override // y8.x
    public final y8.z L() {
        return this.f39907n.f41981n.L();
    }

    @Override // y8.x
    public final long d(long j6, y8.e sink) {
        int i;
        int B9;
        kotlin.jvm.internal.h.e(sink, "sink");
        do {
            int i6 = this.f39911x;
            y8.r rVar = this.f39907n;
            if (i6 == 0) {
                rVar.F(this.f39912y);
                this.f39912y = 0;
                if ((this.f39909v & 4) == 0) {
                    i = this.f39910w;
                    int k9 = j8.c.k(rVar);
                    this.f39911x = k9;
                    this.f39908u = k9;
                    int z3 = rVar.z() & 255;
                    this.f39909v = rVar.z() & 255;
                    Logger logger = v.f39913w;
                    if (logger.isLoggable(Level.FINE)) {
                        y8.h hVar = h.f39848a;
                        logger.fine(h.b(this.f39910w, this.f39908u, z3, this.f39909v, true));
                    }
                    B9 = rVar.B() & Integer.MAX_VALUE;
                    this.f39910w = B9;
                    if (z3 != 9) {
                        throw new IOException(z3 + " != TYPE_CONTINUATION");
                    }
                }
            } else {
                long d2 = rVar.d(Math.min(8192L, i6), sink);
                if (d2 != -1) {
                    this.f39911x -= (int) d2;
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
