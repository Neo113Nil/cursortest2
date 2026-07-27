package l8;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class u implements u8.x {

    /* renamed from: n, reason: collision with root package name */
    public final u8.r f39190n;

    /* renamed from: u, reason: collision with root package name */
    public int f39191u;

    /* renamed from: v, reason: collision with root package name */
    public int f39192v;

    /* renamed from: w, reason: collision with root package name */
    public int f39193w;

    /* renamed from: x, reason: collision with root package name */
    public int f39194x;

    /* renamed from: y, reason: collision with root package name */
    public int f39195y;

    public u(u8.r source) {
        kotlin.jvm.internal.h.e(source, "source");
        this.f39190n = source;
    }

    @Override // u8.x
    public final u8.z L() {
        return this.f39190n.f41308n.L();
    }

    @Override // u8.x
    public final long f(long j9, u8.e sink) {
        int i;
        int z8;
        kotlin.jvm.internal.h.e(sink, "sink");
        do {
            int i4 = this.f39194x;
            u8.r rVar = this.f39190n;
            if (i4 == 0) {
                rVar.E(this.f39195y);
                this.f39195y = 0;
                if ((this.f39192v & 4) == 0) {
                    i = this.f39193w;
                    int k6 = f8.c.k(rVar);
                    this.f39194x = k6;
                    this.f39191u = k6;
                    int j10 = rVar.j() & 255;
                    this.f39192v = rVar.j() & 255;
                    Logger logger = v.f39196w;
                    if (logger.isLoggable(Level.FINE)) {
                        u8.h hVar = h.f39131a;
                        logger.fine(h.b(this.f39193w, this.f39191u, j10, this.f39192v, true));
                    }
                    z8 = rVar.z() & Integer.MAX_VALUE;
                    this.f39193w = z8;
                    if (j10 != 9) {
                        throw new IOException(j10 + " != TYPE_CONTINUATION");
                    }
                }
            } else {
                long f6 = rVar.f(Math.min(8192L, i4), sink);
                if (f6 != -1) {
                    this.f39194x -= (int) f6;
                    return f6;
                }
            }
            return -1L;
        } while (z8 == i);
        throw new IOException("TYPE_CONTINUATION streamId changed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
