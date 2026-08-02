package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;

/* loaded from: classes5.dex */
public final class v5e implements n3r {
    public final long a;
    public boolean b;
    public final hi3 c = new hi3();
    public final hi3 d = new hi3();
    public boolean e;
    public final /* synthetic */ x5e f;

    public v5e(x5e x5eVar, long j, boolean z) {
        this.f = x5eVar;
        this.a = j;
        this.b = z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j;
        x5e x5eVar = this.f;
        synchronized (x5eVar) {
            this.e = true;
            hi3 hi3Var = this.d;
            j = hi3Var.b;
            hi3Var.b();
            x5eVar.notifyAll();
        }
        if (j > 0) {
            x5e x5eVar2 = this.f;
            byte[] bArr = cvt.a;
            x5eVar2.b.z(j);
        }
        this.f.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0099 A[LOOP:0: B:3:0x000d->B:45:0x0099, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009d A[SYNTHETIC] */
    @Override // defpackage.n3r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long e0(hi3 hi3Var, long j) {
        int i;
        Throwable th;
        boolean z;
        long j2;
        hi3Var.getClass();
        long j3 = 0;
        if (j < 0) {
            xq0.o(dfi.d(j, "byteCount < 0: "));
            return 0L;
        }
        while (true) {
            x5e x5eVar = this.f;
            synchronized (x5eVar) {
                x5eVar.k.i();
                try {
                    synchronized (x5eVar) {
                        i = x5eVar.m;
                    }
                    if (z) {
                        if (j2 != -1) {
                            return j2;
                        }
                        if (th == null) {
                            return -1L;
                        }
                        throw th;
                    }
                    j3 = 0;
                } catch (Throwable th2) {
                    x5eVar.k.l();
                    throw th2;
                }
            }
            th = null;
            if (i != 0 && !this.b) {
                Throwable th3 = x5eVar.n;
                if (th3 == null) {
                    synchronized (x5eVar) {
                        int i2 = x5eVar.m;
                        if (i2 == 0) {
                            throw null;
                        }
                        th3 = new sjr(i2);
                    }
                }
                th = th3;
            }
            if (this.e) {
                throw new IOException("stream closed");
            }
            hi3 hi3Var2 = this.d;
            long j4 = hi3Var2.b;
            z = false;
            if (j4 > j3) {
                j2 = hi3Var2.e0(hi3Var, Math.min(j, j4));
                long j5 = x5eVar.c + j2;
                x5eVar.c = j5;
                long j6 = j5 - x5eVar.d;
                if (th == null && j6 >= x5eVar.b.p.a() / 2) {
                    x5eVar.b.I(x5eVar.a, j6);
                    x5eVar.d = x5eVar.c;
                }
            } else {
                if (!this.b && th == null) {
                    try {
                        x5eVar.wait();
                        z = true;
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                }
                j2 = -1;
            }
            x5eVar.k.l();
            if (z) {
            }
        }
    }

    @Override // defpackage.n3r
    public final vis i() {
        return this.f.k;
    }
}
