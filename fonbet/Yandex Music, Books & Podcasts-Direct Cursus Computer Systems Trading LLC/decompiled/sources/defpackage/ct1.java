package defpackage;

import java.io.IOException;
import java.net.Socket;

/* loaded from: classes5.dex */
public final class ct1 implements jmq {
    public final sip c;
    public final noj d;
    public final int e;
    public kt1 i;
    public Socket j;
    public boolean k;
    public int l;
    public int m;
    public final Object a = new Object();
    public final hi3 b = new hi3();
    public boolean f = false;
    public boolean g = false;
    public boolean h = false;

    public ct1(sip sipVar, noj nojVar) {
        o2g.O(sipVar, "executor");
        this.c = sipVar;
        this.d = nojVar;
        this.e = 10000;
    }

    public final void a(kt1 kt1Var, Socket socket) {
        o2g.U("AsyncSink's becomeConnected should only be called once.", this.i == null);
        this.i = kt1Var;
        this.j = socket;
    }

    @Override // defpackage.jmq, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.c.execute(new q9(8, this));
    }

    @Override // defpackage.jmq, java.io.Flushable
    public final void flush() {
        if (this.h) {
            kac.f("closed");
            return;
        }
        jkk.c();
        try {
            synchronized (this.a) {
                if (this.g) {
                    jkk.a.getClass();
                    return;
                }
                this.g = true;
                this.c.execute(new zs1(this, 1));
                jkk.a.getClass();
            }
        } catch (Throwable th) {
            try {
                jkk.a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.jmq
    public final vis i() {
        return vis.d;
    }

    @Override // defpackage.jmq
    public final void t0(hi3 hi3Var, long j) {
        o2g.O(hi3Var, "source");
        if (this.h) {
            kac.f("closed");
            return;
        }
        jkk.c();
        try {
            synchronized (this.a) {
                try {
                    this.b.t0(hi3Var, j);
                    int i = this.m + this.l;
                    this.m = i;
                    boolean z = false;
                    this.l = 0;
                    if (this.k || i <= this.e) {
                        if (!this.f && !this.g && this.b.H() > 0) {
                            this.f = true;
                        }
                        jkk.a.getClass();
                        return;
                    }
                    this.k = true;
                    z = true;
                    if (!z) {
                        this.c.execute(new zs1(this, 0));
                        jkk.a.getClass();
                    } else {
                        try {
                            this.j.close();
                        } catch (IOException e) {
                            this.d.o(e);
                        }
                        jkk.a.getClass();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            try {
                jkk.a.getClass();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}
