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
    private static final Logger f16099b = Logger.getLogger(e.class.getName());

    /* renamed from: a, reason: collision with root package name */
    final d.b f16100a;

    /* renamed from: c, reason: collision with root package name */
    private final com.anythink.core.common.n.c.d f16101c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f16102d;

    /* renamed from: e, reason: collision with root package name */
    private final com.anythink.core.common.n.c.c f16103e;

    /* renamed from: f, reason: collision with root package name */
    private int f16104f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f16105g;

    public j(com.anythink.core.common.n.c.d dVar, boolean z6) {
        this.f16101c = dVar;
        this.f16102d = z6;
        com.anythink.core.common.n.c.c cVar = new com.anythink.core.common.n.c.c();
        this.f16103e = cVar;
        this.f16100a = new d.b(cVar);
        this.f16104f = 16384;
    }

    public final synchronized void a() {
        try {
            if (this.f16105g) {
                throw new IOException("closed");
            }
            if (this.f16102d) {
                Logger logger = f16099b;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(com.anythink.core.common.n.b.a.c.a(">> CONNECTION %s", e.f15948a.g()));
                }
                this.f16101c.d(e.f15948a.k());
                this.f16101c.flush();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b() {
        if (this.f16105g) {
            throw new IOException("closed");
        }
        this.f16101c.flush();
    }

    public final int c() {
        return this.f16104f;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f16105g = true;
        this.f16101c.close();
    }

    public final synchronized void b(m mVar) {
        try {
            if (!this.f16105g) {
                int i = 0;
                a(0, mVar.b() * 6, (byte) 4, (byte) 0);
                while (i < 10) {
                    if (mVar.a(i)) {
                        this.f16101c.k(i == 4 ? 3 : i == 7 ? 4 : i);
                        this.f16101c.i(mVar.b(i));
                    }
                    i++;
                }
                this.f16101c.flush();
            } else {
                throw new IOException("closed");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void a(m mVar) {
        try {
            if (!this.f16105g) {
                this.f16104f = mVar.c(this.f16104f);
                if (mVar.c() != -1) {
                    this.f16100a.a(mVar.c());
                }
                a(0, 0, (byte) 4, (byte) 1);
                this.f16101c.flush();
            } else {
                throw new IOException("closed");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private void b(int i, long j6) {
        while (j6 > 0) {
            int min = (int) Math.min(this.f16104f, j6);
            long j9 = min;
            j6 -= j9;
            a(i, min, (byte) 9, j6 == 0 ? (byte) 4 : (byte) 0);
            this.f16101c.a(this.f16103e, j9);
        }
    }

    public final synchronized void a(int i, int i4, List<c> list) {
        if (!this.f16105g) {
            this.f16100a.a(list);
            long b9 = this.f16103e.b();
            int min = (int) Math.min(this.f16104f - 4, b9);
            long j6 = min;
            a(i, min + 4, (byte) 5, b9 == j6 ? (byte) 4 : (byte) 0);
            this.f16101c.i(i4 & Integer.MAX_VALUE);
            this.f16101c.a(this.f16103e, j6);
            if (b9 > j6) {
                b(i, b9 - j6);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void a(int i, b bVar) {
        if (!this.f16105g) {
            if (bVar.f15909l != -1) {
                a(i, 4, (byte) 3, (byte) 0);
                this.f16101c.i(bVar.f15909l);
                this.f16101c.flush();
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void a(boolean z6, int i, com.anythink.core.common.n.c.c cVar, int i4) {
        if (!this.f16105g) {
            a(i, i4, (byte) 0, z6 ? (byte) 1 : (byte) 0);
            if (i4 > 0) {
                this.f16101c.a(cVar, i4);
            }
        } else {
            throw new IOException("closed");
        }
    }

    private void a(int i, byte b9, com.anythink.core.common.n.c.c cVar, int i4) {
        a(i, i4, (byte) 0, b9);
        if (i4 > 0) {
            this.f16101c.a(cVar, i4);
        }
    }

    public final synchronized void a(boolean z6, int i, int i4) {
        if (!this.f16105g) {
            a(0, 8, (byte) 6, z6 ? (byte) 1 : (byte) 0);
            this.f16101c.i(i);
            this.f16101c.i(i4);
            this.f16101c.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void a(int i, b bVar, byte[] bArr) {
        try {
            if (!this.f16105g) {
                if (bVar.f15909l != -1) {
                    a(0, bArr.length + 8, (byte) 7, (byte) 0);
                    this.f16101c.i(i);
                    this.f16101c.i(bVar.f15909l);
                    if (bArr.length > 0) {
                        this.f16101c.d(bArr);
                    }
                    this.f16101c.flush();
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
        if (this.f16105g) {
            throw new IOException("closed");
        }
        if (j6 != 0 && j6 <= 2147483647L) {
            a(i, 4, (byte) 8, (byte) 0);
            this.f16101c.i((int) j6);
            this.f16101c.flush();
        } else {
            throw e.a("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j6));
        }
    }

    private void a(int i, int i4, byte b9, byte b10) {
        Logger logger = f16099b;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(e.a(false, i, i4, b9, b10));
        }
        int i6 = this.f16104f;
        if (i4 > i6) {
            throw e.a("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i6), Integer.valueOf(i4));
        }
        if ((Integer.MIN_VALUE & i) == 0) {
            a(this.f16101c, i4);
            this.f16101c.l(b9 & 255);
            this.f16101c.l(b10 & 255);
            this.f16101c.i(i & Integer.MAX_VALUE);
            return;
        }
        throw e.a("reserved bit set: %s", Integer.valueOf(i));
    }

    private static void a(com.anythink.core.common.n.c.d dVar, int i) {
        dVar.l((i >>> 16) & p.f9259b);
        dVar.l((i >>> 8) & p.f9259b);
        dVar.l(i & p.f9259b);
    }

    public final synchronized void a(boolean z6, int i, List<c> list) {
        if (!this.f16105g) {
            this.f16100a.a(list);
            long b9 = this.f16103e.b();
            int min = (int) Math.min(this.f16104f, b9);
            long j6 = min;
            byte b10 = b9 == j6 ? (byte) 4 : (byte) 0;
            if (z6) {
                b10 = (byte) (b10 | 1);
            }
            a(i, min, (byte) 1, b10);
            this.f16101c.a(this.f16103e, j6);
            if (b9 > j6) {
                b(i, b9 - j6);
            }
        } else {
            throw new IOException("closed");
        }
    }
}
