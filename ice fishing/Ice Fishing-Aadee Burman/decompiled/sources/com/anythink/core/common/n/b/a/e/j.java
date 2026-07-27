package com.anythink.core.common.n.b.a.e;

import com.anythink.basead.exoplayer.k.p;
import com.anythink.core.common.n.b.a.e.d;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
final class j implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    private static final Logger f15312b = Logger.getLogger(e.class.getName());

    /* renamed from: a, reason: collision with root package name */
    final d.b f15313a;

    /* renamed from: c, reason: collision with root package name */
    private final com.anythink.core.common.n.c.d f15314c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f15315d;

    /* renamed from: e, reason: collision with root package name */
    private final com.anythink.core.common.n.c.c f15316e;

    /* renamed from: f, reason: collision with root package name */
    private int f15317f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f15318g;

    public j(com.anythink.core.common.n.c.d dVar, boolean z3) {
        this.f15314c = dVar;
        this.f15315d = z3;
        com.anythink.core.common.n.c.c cVar = new com.anythink.core.common.n.c.c();
        this.f15316e = cVar;
        this.f15313a = new d.b(cVar);
        this.f15317f = 16384;
    }

    public final synchronized void a() {
        try {
            if (this.f15318g) {
                throw new IOException("closed");
            }
            if (this.f15315d) {
                Logger logger = f15312b;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(com.anythink.core.common.n.b.a.c.a(">> CONNECTION %s", e.f15161a.g()));
                }
                this.f15314c.d(e.f15161a.k());
                this.f15314c.flush();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b() {
        if (this.f15318g) {
            throw new IOException("closed");
        }
        this.f15314c.flush();
    }

    public final int c() {
        return this.f15317f;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f15318g = true;
        this.f15314c.close();
    }

    public final synchronized void b(m mVar) {
        try {
            if (!this.f15318g) {
                int i = 0;
                a(0, mVar.b() * 6, (byte) 4, (byte) 0);
                while (i < 10) {
                    if (mVar.a(i)) {
                        this.f15314c.k(i == 4 ? 3 : i == 7 ? 4 : i);
                        this.f15314c.i(mVar.b(i));
                    }
                    i++;
                }
                this.f15314c.flush();
            } else {
                throw new IOException("closed");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void a(m mVar) {
        try {
            if (!this.f15318g) {
                this.f15317f = mVar.c(this.f15317f);
                if (mVar.c() != -1) {
                    this.f15313a.a(mVar.c());
                }
                a(0, 0, (byte) 4, (byte) 1);
                this.f15314c.flush();
            } else {
                throw new IOException("closed");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private void b(int i, long j6) {
        while (j6 > 0) {
            int min = (int) Math.min(this.f15317f, j6);
            long j9 = min;
            j6 -= j9;
            a(i, min, (byte) 9, j6 == 0 ? (byte) 4 : (byte) 0);
            this.f15314c.a(this.f15316e, j9);
        }
    }

    public final synchronized void a(int i, int i6, List<c> list) {
        if (!this.f15318g) {
            this.f15313a.a(list);
            long b9 = this.f15316e.b();
            int min = (int) Math.min(this.f15317f - 4, b9);
            long j6 = min;
            a(i, min + 4, (byte) 5, b9 == j6 ? (byte) 4 : (byte) 0);
            this.f15314c.i(i6 & Integer.MAX_VALUE);
            this.f15314c.a(this.f15316e, j6);
            if (b9 > j6) {
                b(i, b9 - j6);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void a(int i, b bVar) {
        if (!this.f15318g) {
            if (bVar.f15122l != -1) {
                a(i, 4, (byte) 3, (byte) 0);
                this.f15314c.i(bVar.f15122l);
                this.f15314c.flush();
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void a(boolean z3, int i, com.anythink.core.common.n.c.c cVar, int i6) {
        if (!this.f15318g) {
            a(i, i6, (byte) 0, z3 ? (byte) 1 : (byte) 0);
            if (i6 > 0) {
                this.f15314c.a(cVar, i6);
            }
        } else {
            throw new IOException("closed");
        }
    }

    private void a(int i, byte b9, com.anythink.core.common.n.c.c cVar, int i6) {
        a(i, i6, (byte) 0, b9);
        if (i6 > 0) {
            this.f15314c.a(cVar, i6);
        }
    }

    public final synchronized void a(boolean z3, int i, int i6) {
        if (!this.f15318g) {
            a(0, 8, (byte) 6, z3 ? (byte) 1 : (byte) 0);
            this.f15314c.i(i);
            this.f15314c.i(i6);
            this.f15314c.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void a(int i, b bVar, byte[] bArr) {
        try {
            if (!this.f15318g) {
                if (bVar.f15122l != -1) {
                    a(0, bArr.length + 8, (byte) 7, (byte) 0);
                    this.f15314c.i(i);
                    this.f15314c.i(bVar.f15122l);
                    if (bArr.length > 0) {
                        this.f15314c.d(bArr);
                    }
                    this.f15314c.flush();
                } else {
                    throw e.a("errorCode.httpCode == -1", new Object[0]);
                }
            } else {
                throw new IOException("closed");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void a(int i, long j6) {
        if (this.f15318g) {
            throw new IOException("closed");
        }
        if (j6 != 0 && j6 <= 2147483647L) {
            a(i, 4, (byte) 8, (byte) 0);
            this.f15314c.i((int) j6);
            this.f15314c.flush();
        } else {
            throw e.a("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j6));
        }
    }

    private void a(int i, int i6, byte b9, byte b10) {
        Logger logger = f15312b;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(e.a(false, i, i6, b9, b10));
        }
        int i9 = this.f15317f;
        if (i6 > i9) {
            throw e.a("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i9), Integer.valueOf(i6));
        }
        if ((Integer.MIN_VALUE & i) == 0) {
            a(this.f15314c, i6);
            this.f15314c.l(b9 & 255);
            this.f15314c.l(b10 & 255);
            this.f15314c.i(i & Integer.MAX_VALUE);
            return;
        }
        throw e.a("reserved bit set: %s", Integer.valueOf(i));
    }

    private static void a(com.anythink.core.common.n.c.d dVar, int i) {
        dVar.l((i >>> 16) & p.f8473b);
        dVar.l((i >>> 8) & p.f8473b);
        dVar.l(i & p.f8473b);
    }

    public final synchronized void a(boolean z3, int i, List<c> list) {
        if (!this.f15318g) {
            this.f15313a.a(list);
            long b9 = this.f15316e.b();
            int min = (int) Math.min(this.f15317f, b9);
            long j6 = min;
            byte b10 = b9 == j6 ? (byte) 4 : (byte) 0;
            if (z3) {
                b10 = (byte) (b10 | 1);
            }
            a(i, min, (byte) 1, b10);
            this.f15314c.a(this.f15316e, j6);
            if (b9 > j6) {
                b(i, b9 - j6);
            }
        } else {
            throw new IOException("closed");
        }
    }
}
