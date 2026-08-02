package defpackage;

import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes4.dex */
public final class wzq implements y9t0 {
    public final gfx a;
    public long b;
    public boolean c;

    public wzq(gfx gfxVar, long j) {
        this.a = gfxVar;
        this.b = j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        gfx gfxVar = this.a;
        if (this.c) {
            return;
        }
        this.c = true;
        ReentrantLock reentrantLock = gfxVar.c;
        reentrantLock.lock();
        try {
            int i = gfxVar.b - 1;
            gfxVar.b = i;
            if (i == 0) {
                if (gfxVar.a) {
                    synchronized (gfxVar) {
                        gfxVar.w.close();
                    }
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.y9t0
    public final long read(yp6 yp6Var, long j) {
        long j2;
        long j3;
        int i;
        if (this.c) {
            ny61.r("closed");
            return 0L;
        }
        gfx gfxVar = this.a;
        long j4 = this.b;
        if (j < 0) {
            w511.f(qv10.j(j, "byteCount < 0: "));
            return 0L;
        }
        long j5 = j + j4;
        long j6 = j4;
        while (true) {
            if (j6 >= j5) {
                j2 = -1;
                break;
            }
            t7q0 a0 = yp6Var.a0(1);
            byte[] bArr = a0.a;
            int i2 = a0.c;
            j2 = -1;
            int min = (int) Math.min(j5 - j6, 8192 - i2);
            synchronized (gfxVar) {
                gfxVar.w.seek(j6);
                i = 0;
                while (true) {
                    if (i >= min) {
                        break;
                    }
                    int read = gfxVar.w.read(bArr, i2, min - i);
                    if (read != -1) {
                        i += read;
                    } else if (i == 0) {
                        i = -1;
                    }
                }
            }
            if (i == -1) {
                if (a0.b == a0.c) {
                    yp6Var.a = a0.a();
                    p8q0.a(a0);
                }
                if (j4 == j6) {
                    j3 = -1;
                }
            } else {
                a0.c += i;
                long j7 = i;
                j6 += j7;
                yp6Var.b += j7;
            }
        }
        j3 = j6 - j4;
        if (j3 != j2) {
            this.b += j3;
        }
        return j3;
    }

    @Override // defpackage.y9t0
    public final ydz0 timeout() {
        return ydz0.d;
    }
}
