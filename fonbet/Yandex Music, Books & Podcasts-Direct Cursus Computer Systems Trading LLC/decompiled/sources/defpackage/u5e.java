package defpackage;

import java.io.InterruptedIOException;

/* loaded from: classes5.dex */
public final class u5e implements jmq {
    public final boolean a;
    public final hi3 b = new hi3();
    public boolean c;
    public final /* synthetic */ x5e d;

    public u5e(x5e x5eVar, boolean z) {
        this.d = x5eVar;
        this.a = z;
    }

    /* JADX WARN: Finally extract failed */
    public final void a(boolean z) {
        long min;
        boolean z2;
        x5e x5eVar = this.d;
        synchronized (x5eVar) {
            x5eVar.l.i();
            while (x5eVar.e >= x5eVar.f && !this.a && !this.c) {
                try {
                    synchronized (x5eVar) {
                        int i = x5eVar.m;
                        if (i != 0) {
                            break;
                        }
                        try {
                            x5eVar.wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    }
                } catch (Throwable th) {
                    x5eVar.l.l();
                    throw th;
                }
            }
            x5eVar.l.l();
            x5eVar.b();
            min = Math.min(x5eVar.f - x5eVar.e, this.b.b);
            x5eVar.e += min;
            z2 = z && min == this.b.b;
        }
        this.d.l.i();
        try {
            x5e x5eVar2 = this.d;
            x5eVar2.b.D(x5eVar2.a, z2, this.b, min);
        } finally {
            this.d.l.l();
        }
    }

    @Override // defpackage.jmq, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z;
        x5e x5eVar = this.d;
        byte[] bArr = cvt.a;
        synchronized (x5eVar) {
            if (this.c) {
                return;
            }
            synchronized (x5eVar) {
                z = x5eVar.m == 0;
            }
            x5e x5eVar2 = this.d;
            if (!x5eVar2.j.a) {
                if (this.b.b > 0) {
                    while (this.b.b > 0) {
                        a(true);
                    }
                } else if (z) {
                    x5eVar2.b.D(x5eVar2.a, true, null, 0L);
                }
            }
            synchronized (this.d) {
                this.c = true;
            }
            this.d.b.w.flush();
            this.d.a();
        }
    }

    @Override // defpackage.jmq, java.io.Flushable
    public final void flush() {
        x5e x5eVar = this.d;
        byte[] bArr = cvt.a;
        synchronized (x5eVar) {
            x5eVar.b();
        }
        while (this.b.b > 0) {
            a(false);
            this.d.b.w.flush();
        }
    }

    @Override // defpackage.jmq
    public final vis i() {
        return this.d.l;
    }

    @Override // defpackage.jmq
    public final void t0(hi3 hi3Var, long j) {
        hi3Var.getClass();
        byte[] bArr = cvt.a;
        hi3 hi3Var2 = this.b;
        hi3Var2.t0(hi3Var, j);
        while (hi3Var2.b >= 16384) {
            a(false);
        }
    }
}
