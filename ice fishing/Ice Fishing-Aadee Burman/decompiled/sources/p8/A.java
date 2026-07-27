package p8;

import com.icefishing.icefishinglive2.AbstractC4404f;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import v7.AbstractC5128i;

/* loaded from: classes2.dex */
public final class A implements Closeable {

    /* renamed from: y, reason: collision with root package name */
    public static final Logger f39800y = Logger.getLogger(h.class.getName());

    /* renamed from: n, reason: collision with root package name */
    public final y8.p f39801n;

    /* renamed from: u, reason: collision with root package name */
    public final y8.e f39802u;

    /* renamed from: v, reason: collision with root package name */
    public int f39803v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f39804w;

    /* renamed from: x, reason: collision with root package name */
    public final f f39805x;

    public A(y8.p sink) {
        kotlin.jvm.internal.h.e(sink, "sink");
        this.f39801n = sink;
        y8.e eVar = new y8.e();
        this.f39802u = eVar;
        this.f39803v = 16384;
        this.f39805x = new f(eVar);
    }

    public final void a(D peerSettings) {
        kotlin.jvm.internal.h.e(peerSettings, "peerSettings");
        synchronized (this) {
            try {
                if (this.f39804w) {
                    throw new IOException("closed");
                }
                int i = this.f39803v;
                int i6 = peerSettings.f39810a;
                if ((i6 & 32) != 0) {
                    i = peerSettings.f39811b[5];
                }
                this.f39803v = i;
                if (((i6 & 2) != 0 ? peerSettings.f39811b[1] : -1) != -1) {
                    f fVar = this.f39805x;
                    int i9 = (i6 & 2) != 0 ? peerSettings.f39811b[1] : -1;
                    fVar.getClass();
                    int min = Math.min(i9, 16384);
                    int i10 = fVar.f39841d;
                    if (i10 != min) {
                        if (min < i10) {
                            fVar.f39839b = Math.min(fVar.f39839b, min);
                        }
                        fVar.f39840c = true;
                        fVar.f39841d = min;
                        int i11 = fVar.f39845h;
                        if (min < i11) {
                            if (min == 0) {
                                C4858d[] c4858dArr = fVar.f39842e;
                                AbstractC5128i.v(c4858dArr, 0, c4858dArr.length);
                                fVar.f39843f = fVar.f39842e.length - 1;
                                fVar.f39844g = 0;
                                fVar.f39845h = 0;
                            } else {
                                fVar.a(i11 - min);
                            }
                        }
                    }
                }
                i(0, 0, 4, 1);
                this.f39801n.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(boolean z3, int i, y8.e eVar, int i6) {
        synchronized (this) {
            if (this.f39804w) {
                throw new IOException("closed");
            }
            i(i, i6, 0, z3 ? 1 : 0);
            if (i6 > 0) {
                kotlin.jvm.internal.h.b(eVar);
                this.f39801n.T(i6, eVar);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            this.f39804w = true;
            this.f39801n.close();
        }
    }

    public final void flush() {
        synchronized (this) {
            if (this.f39804w) {
                throw new IOException("closed");
            }
            this.f39801n.flush();
        }
    }

    public final void i(int i, int i6, int i9, int i10) {
        if (i9 != 8) {
            Level level = Level.FINE;
            Logger logger = f39800y;
            if (logger.isLoggable(level)) {
                logger.fine(h.b(i, i6, i9, i10, false));
            }
        }
        if (i6 > this.f39803v) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f39803v + ": " + i6).toString());
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            throw new IllegalArgumentException(AbstractC4404f.e(i, "reserved bit set: ").toString());
        }
        byte[] bArr = j8.c.f38482a;
        y8.p pVar = this.f39801n;
        kotlin.jvm.internal.h.e(pVar, "<this>");
        pVar.t((i6 >>> 16) & com.anythink.basead.exoplayer.k.p.f8473b);
        pVar.t((i6 >>> 8) & com.anythink.basead.exoplayer.k.p.f8473b);
        pVar.t(i6 & com.anythink.basead.exoplayer.k.p.f8473b);
        pVar.t(i9 & com.anythink.basead.exoplayer.k.p.f8473b);
        pVar.t(i10 & com.anythink.basead.exoplayer.k.p.f8473b);
        pVar.n(i & Integer.MAX_VALUE);
    }

    public final void j(int i, EnumC4856b enumC4856b, byte[] bArr) {
        synchronized (this) {
            if (this.f39804w) {
                throw new IOException("closed");
            }
            if (enumC4856b.f39821n == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
            i(0, bArr.length + 8, 7, 0);
            this.f39801n.n(i);
            this.f39801n.n(enumC4856b.f39821n);
            if (bArr.length != 0) {
                y8.p pVar = this.f39801n;
                if (pVar.f41979v) {
                    throw new IllegalStateException("closed");
                }
                pVar.f41978u.V(bArr, 0, bArr.length);
                pVar.b();
            }
            this.f39801n.flush();
        }
    }

    public final void k(boolean z3, int i, ArrayList arrayList) {
        synchronized (this) {
            if (this.f39804w) {
                throw new IOException("closed");
            }
            this.f39805x.d(arrayList);
            long j6 = this.f39802u.f41950u;
            long min = Math.min(this.f39803v, j6);
            int i6 = j6 == min ? 4 : 0;
            if (z3) {
                i6 |= 1;
            }
            i(i, (int) min, 1, i6);
            this.f39801n.T(min, this.f39802u);
            if (j6 > min) {
                long j9 = j6 - min;
                while (j9 > 0) {
                    long min2 = Math.min(this.f39803v, j9);
                    j9 -= min2;
                    i(i, (int) min2, 9, j9 == 0 ? 4 : 0);
                    this.f39801n.T(min2, this.f39802u);
                }
            }
        }
    }

    public final void l(int i, int i6, boolean z3) {
        synchronized (this) {
            if (this.f39804w) {
                throw new IOException("closed");
            }
            i(0, 8, 6, z3 ? 1 : 0);
            this.f39801n.n(i);
            this.f39801n.n(i6);
            this.f39801n.flush();
        }
    }

    public final void m(int i, EnumC4856b enumC4856b) {
        synchronized (this) {
            if (this.f39804w) {
                throw new IOException("closed");
            }
            if (enumC4856b.f39821n == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            i(i, 4, 3, 0);
            this.f39801n.n(enumC4856b.f39821n);
            this.f39801n.flush();
        }
    }

    public final void n(int i, long j6) {
        synchronized (this) {
            try {
                if (this.f39804w) {
                    throw new IOException("closed");
                }
                if (j6 == 0 || j6 > 2147483647L) {
                    throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j6).toString());
                }
                Logger logger = f39800y;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(h.c(i, 4, j6, false));
                }
                i(i, 4, 8, 0);
                this.f39801n.n((int) j6);
                this.f39801n.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
