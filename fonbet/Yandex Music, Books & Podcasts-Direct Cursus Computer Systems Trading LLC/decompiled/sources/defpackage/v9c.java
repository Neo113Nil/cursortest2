package defpackage;

import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes5.dex */
public final class v9c implements n3r {
    public final a9f a;
    public long b;
    public boolean c;

    public v9c(a9f a9fVar, long j) {
        this.a = a9fVar;
        this.b = j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a9f a9fVar = this.a;
        if (this.c) {
            return;
        }
        this.c = true;
        ReentrantLock reentrantLock = a9fVar.c;
        reentrantLock.lock();
        try {
            int i = a9fVar.b - 1;
            a9fVar.b = i;
            if (i == 0) {
                if (a9fVar.a) {
                    synchronized (a9fVar) {
                        a9fVar.d.close();
                    }
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.n3r
    public final long e0(hi3 hi3Var, long j) {
        long j2;
        long j3;
        int i;
        hi3Var.getClass();
        if (this.c) {
            xq0.q("closed");
            return 0L;
        }
        a9f a9fVar = this.a;
        long j4 = this.b;
        if (j < 0) {
            xq0.o(dfi.d(j, "byteCount < 0: "));
            return 0L;
        }
        long j5 = j + j4;
        long j6 = j4;
        while (true) {
            if (j6 >= j5) {
                j2 = -1;
                break;
            }
            xap K0 = hi3Var.K0(1);
            byte[] bArr = K0.a;
            int i2 = K0.c;
            j2 = -1;
            int min = (int) Math.min(j5 - j6, 8192 - i2);
            synchronized (a9fVar) {
                bArr.getClass();
                a9fVar.d.seek(j6);
                i = 0;
                while (true) {
                    if (i >= min) {
                        break;
                    }
                    int read = a9fVar.d.read(bArr, i2, min - i);
                    if (read != -1) {
                        i += read;
                    } else if (i == 0) {
                        i = -1;
                    }
                }
            }
            if (i == -1) {
                if (K0.b == K0.c) {
                    hi3Var.a = K0.a();
                    lbp.a(K0);
                }
                if (j4 == j6) {
                    j3 = -1;
                }
            } else {
                K0.c += i;
                long j7 = i;
                j6 += j7;
                hi3Var.b += j7;
            }
        }
        j3 = j6 - j4;
        if (j3 != j2) {
            this.b += j3;
        }
        return j3;
    }

    @Override // defpackage.n3r
    public final vis i() {
        return vis.d;
    }
}
