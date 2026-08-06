package Q1;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class t implements W1.w {

    /* renamed from: a, reason: collision with root package name */
    public final W1.q f1658a;

    /* renamed from: b, reason: collision with root package name */
    public int f1659b;

    /* renamed from: c, reason: collision with root package name */
    public int f1660c;

    /* renamed from: d, reason: collision with root package name */
    public int f1661d;

    /* renamed from: e, reason: collision with root package name */
    public int f1662e;

    /* renamed from: f, reason: collision with root package name */
    public int f1663f;

    public t(W1.q source) {
        kotlin.jvm.internal.i.e(source, "source");
        this.f1658a = source;
    }

    @Override // W1.w
    public final W1.y d() {
        return this.f1658a.f1895a.d();
    }

    @Override // W1.w
    public final long e(W1.g sink, long j2) {
        int i2;
        int l2;
        kotlin.jvm.internal.i.e(sink, "sink");
        do {
            int i3 = this.f1662e;
            W1.q qVar = this.f1658a;
            if (i3 != 0) {
                long e2 = qVar.e(sink, Math.min(8192L, i3));
                if (e2 == -1) {
                    return -1L;
                }
                this.f1662e -= (int) e2;
                return e2;
            }
            qVar.r(this.f1663f);
            this.f1663f = 0;
            if ((this.f1660c & 4) != 0) {
                return -1L;
            }
            i2 = this.f1661d;
            int s2 = K1.b.s(qVar);
            this.f1662e = s2;
            this.f1659b = s2;
            int c2 = qVar.c() & 255;
            this.f1660c = qVar.c() & 255;
            Logger logger = u.f1664d;
            if (logger.isLoggable(Level.FINE)) {
                W1.j jVar = g.f1599a;
                logger.fine(g.a(true, this.f1661d, this.f1659b, c2, this.f1660c));
            }
            l2 = qVar.l() & Integer.MAX_VALUE;
            this.f1661d = l2;
            if (c2 != 9) {
                throw new IOException(c2 + " != TYPE_CONTINUATION");
            }
        } while (l2 == i2);
        throw new IOException("TYPE_CONTINUATION streamId changed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
