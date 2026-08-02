package p8;

import com.google.android.gms.internal.ads.Wv;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import v7.AbstractC5118i;

/* loaded from: classes2.dex */
public final class A implements Closeable {

    /* renamed from: y, reason: collision with root package name */
    public static final Logger f39850y = Logger.getLogger(h.class.getName());

    /* renamed from: n, reason: collision with root package name */
    public final y8.p f39851n;

    /* renamed from: u, reason: collision with root package name */
    public final y8.e f39852u;

    /* renamed from: v, reason: collision with root package name */
    public int f39853v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f39854w;

    /* renamed from: x, reason: collision with root package name */
    public final f f39855x;

    public A(y8.p sink) {
        kotlin.jvm.internal.h.e(sink, "sink");
        this.f39851n = sink;
        y8.e eVar = new y8.e();
        this.f39852u = eVar;
        this.f39853v = 16384;
        this.f39855x = new f(eVar);
    }

    public final void a(D peerSettings) {
        kotlin.jvm.internal.h.e(peerSettings, "peerSettings");
        synchronized (this) {
            try {
                if (this.f39854w) {
                    throw new IOException("closed");
                }
                int i = this.f39853v;
                int i4 = peerSettings.f39860a;
                if ((i4 & 32) != 0) {
                    i = peerSettings.f39861b[5];
                }
                this.f39853v = i;
                if (((i4 & 2) != 0 ? peerSettings.f39861b[1] : -1) != -1) {
                    f fVar = this.f39855x;
                    int i6 = (i4 & 2) != 0 ? peerSettings.f39861b[1] : -1;
                    fVar.getClass();
                    int min = Math.min(i6, 16384);
                    int i9 = fVar.f39891d;
                    if (i9 != min) {
                        if (min < i9) {
                            fVar.f39889b = Math.min(fVar.f39889b, min);
                        }
                        fVar.f39890c = true;
                        fVar.f39891d = min;
                        int i10 = fVar.f39895h;
                        if (min < i10) {
                            if (min == 0) {
                                C4858d[] c4858dArr = fVar.f39892e;
                                AbstractC5118i.y(c4858dArr, 0, c4858dArr.length);
                                fVar.f39893f = fVar.f39892e.length - 1;
                                fVar.f39894g = 0;
                                fVar.f39895h = 0;
                            } else {
                                fVar.a(i10 - min);
                            }
                        }
                    }
                }
                i(0, 0, 4, 1);
                this.f39851n.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(boolean z6, int i, y8.e eVar, int i4) {
        synchronized (this) {
            if (this.f39854w) {
                throw new IOException("closed");
            }
            i(i, i4, 0, z6 ? 1 : 0);
            if (i4 > 0) {
                kotlin.jvm.internal.h.b(eVar);
                this.f39851n.T(i4, eVar);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            this.f39854w = true;
            this.f39851n.close();
        }
    }

    public final void flush() {
        synchronized (this) {
            if (this.f39854w) {
                throw new IOException("closed");
            }
            this.f39851n.flush();
        }
    }

    public final void i(int i, int i4, int i6, int i9) {
        if (i6 != 8) {
            Level level = Level.FINE;
            Logger logger = f39850y;
            if (logger.isLoggable(level)) {
                logger.fine(h.b(i, i4, i6, i9, false));
            }
        }
        if (i4 > this.f39853v) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f39853v + ": " + i4).toString());
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            throw new IllegalArgumentException(Wv.f(i, "reserved bit set: ").toString());
        }
        byte[] bArr = j8.c.f38494a;
        y8.p pVar = this.f39851n;
        kotlin.jvm.internal.h.e(pVar, "<this>");
        pVar.t((i4 >>> 16) & com.anythink.basead.exoplayer.k.p.f9259b);
        pVar.t((i4 >>> 8) & com.anythink.basead.exoplayer.k.p.f9259b);
        pVar.t(i4 & com.anythink.basead.exoplayer.k.p.f9259b);
        pVar.t(i6 & com.anythink.basead.exoplayer.k.p.f9259b);
        pVar.t(i9 & com.anythink.basead.exoplayer.k.p.f9259b);
        pVar.n(i & Integer.MAX_VALUE);
    }

    public final void j(int i, EnumC4856b enumC4856b, byte[] bArr) {
        synchronized (this) {
            if (this.f39854w) {
                throw new IOException("closed");
            }
            if (enumC4856b.f39871n == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
            i(0, bArr.length + 8, 7, 0);
            this.f39851n.n(i);
            this.f39851n.n(enumC4856b.f39871n);
            if (bArr.length != 0) {
                y8.p pVar = this.f39851n;
                if (pVar.f41953v) {
                    throw new IllegalStateException("closed");
                }
                pVar.f41952u.V(bArr, 0, bArr.length);
                pVar.b();
            }
            this.f39851n.flush();
        }
    }

    public final void k(boolean z6, int i, ArrayList arrayList) {
        synchronized (this) {
            if (this.f39854w) {
                throw new IOException("closed");
            }
            this.f39855x.d(arrayList);
            long j6 = this.f39852u.f41924u;
            long min = Math.min(this.f39853v, j6);
            int i4 = j6 == min ? 4 : 0;
            if (z6) {
                i4 |= 1;
            }
            i(i, (int) min, 1, i4);
            this.f39851n.T(min, this.f39852u);
            if (j6 > min) {
                long j9 = j6 - min;
                while (j9 > 0) {
                    long min2 = Math.min(this.f39853v, j9);
                    j9 -= min2;
                    i(i, (int) min2, 9, j9 == 0 ? 4 : 0);
                    this.f39851n.T(min2, this.f39852u);
                }
            }
        }
    }

    public final void l(int i, int i4, boolean z6) {
        synchronized (this) {
            if (this.f39854w) {
                throw new IOException("closed");
            }
            i(0, 8, 6, z6 ? 1 : 0);
            this.f39851n.n(i);
            this.f39851n.n(i4);
            this.f39851n.flush();
        }
    }

    public final void m(int i, EnumC4856b enumC4856b) {
        synchronized (this) {
            if (this.f39854w) {
                throw new IOException("closed");
            }
            if (enumC4856b.f39871n == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            i(i, 4, 3, 0);
            this.f39851n.n(enumC4856b.f39871n);
            this.f39851n.flush();
        }
    }

    public final void n(int i, long j6) {
        synchronized (this) {
            try {
                if (this.f39854w) {
                    throw new IOException("closed");
                }
                if (j6 == 0 || j6 > 2147483647L) {
                    throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j6).toString());
                }
                Logger logger = f39850y;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(h.c(i, 4, j6, false));
                }
                i(i, 4, 8, 0);
                this.f39851n.n((int) j6);
                this.f39851n.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
