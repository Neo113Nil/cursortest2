package p8;

import com.icefishing.icefishingbigwin.AbstractC4404f;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import v7.AbstractC5128i;

/* loaded from: classes2.dex */
public final class A implements Closeable {

    /* renamed from: y, reason: collision with root package name */
    public static final Logger f39803y = Logger.getLogger(h.class.getName());

    /* renamed from: n, reason: collision with root package name */
    public final y8.p f39804n;

    /* renamed from: u, reason: collision with root package name */
    public final y8.e f39805u;

    /* renamed from: v, reason: collision with root package name */
    public int f39806v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f39807w;

    /* renamed from: x, reason: collision with root package name */
    public final f f39808x;

    public A(y8.p sink) {
        kotlin.jvm.internal.h.e(sink, "sink");
        this.f39804n = sink;
        y8.e eVar = new y8.e();
        this.f39805u = eVar;
        this.f39806v = 16384;
        this.f39808x = new f(eVar);
    }

    public final void a(D peerSettings) {
        kotlin.jvm.internal.h.e(peerSettings, "peerSettings");
        synchronized (this) {
            try {
                if (this.f39807w) {
                    throw new IOException("closed");
                }
                int i = this.f39806v;
                int i6 = peerSettings.f39813a;
                if ((i6 & 32) != 0) {
                    i = peerSettings.f39814b[5];
                }
                this.f39806v = i;
                if (((i6 & 2) != 0 ? peerSettings.f39814b[1] : -1) != -1) {
                    f fVar = this.f39808x;
                    int i9 = (i6 & 2) != 0 ? peerSettings.f39814b[1] : -1;
                    fVar.getClass();
                    int min = Math.min(i9, 16384);
                    int i10 = fVar.f39844d;
                    if (i10 != min) {
                        if (min < i10) {
                            fVar.f39842b = Math.min(fVar.f39842b, min);
                        }
                        fVar.f39843c = true;
                        fVar.f39844d = min;
                        int i11 = fVar.f39848h;
                        if (min < i11) {
                            if (min == 0) {
                                C4858d[] c4858dArr = fVar.f39845e;
                                AbstractC5128i.v(c4858dArr, 0, c4858dArr.length);
                                fVar.f39846f = fVar.f39845e.length - 1;
                                fVar.f39847g = 0;
                                fVar.f39848h = 0;
                            } else {
                                fVar.a(i11 - min);
                            }
                        }
                    }
                }
                i(0, 0, 4, 1);
                this.f39804n.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(boolean z3, int i, y8.e eVar, int i6) {
        synchronized (this) {
            if (this.f39807w) {
                throw new IOException("closed");
            }
            i(i, i6, 0, z3 ? 1 : 0);
            if (i6 > 0) {
                kotlin.jvm.internal.h.b(eVar);
                this.f39804n.T(i6, eVar);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            this.f39807w = true;
            this.f39804n.close();
        }
    }

    public final void flush() {
        synchronized (this) {
            if (this.f39807w) {
                throw new IOException("closed");
            }
            this.f39804n.flush();
        }
    }

    public final void i(int i, int i6, int i9, int i10) {
        if (i9 != 8) {
            Level level = Level.FINE;
            Logger logger = f39803y;
            if (logger.isLoggable(level)) {
                logger.fine(h.b(i, i6, i9, i10, false));
            }
        }
        if (i6 > this.f39806v) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f39806v + ": " + i6).toString());
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            throw new IllegalArgumentException(AbstractC4404f.e(i, "reserved bit set: ").toString());
        }
        byte[] bArr = j8.c.f38482a;
        y8.p pVar = this.f39804n;
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
            if (this.f39807w) {
                throw new IOException("closed");
            }
            if (enumC4856b.f39824n == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
            i(0, bArr.length + 8, 7, 0);
            this.f39804n.n(i);
            this.f39804n.n(enumC4856b.f39824n);
            if (bArr.length != 0) {
                y8.p pVar = this.f39804n;
                if (pVar.f41982v) {
                    throw new IllegalStateException("closed");
                }
                pVar.f41981u.V(bArr, 0, bArr.length);
                pVar.b();
            }
            this.f39804n.flush();
        }
    }

    public final void k(boolean z3, int i, ArrayList arrayList) {
        synchronized (this) {
            if (this.f39807w) {
                throw new IOException("closed");
            }
            this.f39808x.d(arrayList);
            long j6 = this.f39805u.f41953u;
            long min = Math.min(this.f39806v, j6);
            int i6 = j6 == min ? 4 : 0;
            if (z3) {
                i6 |= 1;
            }
            i(i, (int) min, 1, i6);
            this.f39804n.T(min, this.f39805u);
            if (j6 > min) {
                long j9 = j6 - min;
                while (j9 > 0) {
                    long min2 = Math.min(this.f39806v, j9);
                    j9 -= min2;
                    i(i, (int) min2, 9, j9 == 0 ? 4 : 0);
                    this.f39804n.T(min2, this.f39805u);
                }
            }
        }
    }

    public final void l(int i, int i6, boolean z3) {
        synchronized (this) {
            if (this.f39807w) {
                throw new IOException("closed");
            }
            i(0, 8, 6, z3 ? 1 : 0);
            this.f39804n.n(i);
            this.f39804n.n(i6);
            this.f39804n.flush();
        }
    }

    public final void m(int i, EnumC4856b enumC4856b) {
        synchronized (this) {
            if (this.f39807w) {
                throw new IOException("closed");
            }
            if (enumC4856b.f39824n == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            i(i, 4, 3, 0);
            this.f39804n.n(enumC4856b.f39824n);
            this.f39804n.flush();
        }
    }

    public final void n(int i, long j6) {
        synchronized (this) {
            try {
                if (this.f39807w) {
                    throw new IOException("closed");
                }
                if (j6 == 0 || j6 > 2147483647L) {
                    throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j6).toString());
                }
                Logger logger = f39803y;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(h.c(i, 4, j6, false));
                }
                i(i, 4, 8, 0);
                this.f39804n.n((int) j6);
                this.f39804n.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
