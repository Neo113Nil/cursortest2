package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes5.dex */
public final class kt1 implements jmq {
    public final /* synthetic */ int a = 1;
    public final Object b;
    public final Object c;

    public kt1(OutputStream outputStream, vis visVar) {
        outputStream.getClass();
        this.b = outputStream;
        this.c = visVar;
    }

    @Override // defpackage.jmq, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.a) {
            case 0:
                z2r z2rVar = (z2r) this.b;
                kt1 kt1Var = (kt1) this.c;
                z2rVar.i();
                try {
                    kt1Var.close();
                    if (z2rVar.j()) {
                        throw z2rVar.l(null);
                    }
                    return;
                } catch (IOException e) {
                    if (!z2rVar.j()) {
                        throw e;
                    }
                    throw z2rVar.l(e);
                } finally {
                    z2rVar.j();
                }
            default:
                ((OutputStream) this.b).close();
                return;
        }
    }

    @Override // defpackage.jmq, java.io.Flushable
    public final void flush() {
        switch (this.a) {
            case 0:
                z2r z2rVar = (z2r) this.b;
                kt1 kt1Var = (kt1) this.c;
                z2rVar.i();
                try {
                    kt1Var.flush();
                    if (z2rVar.j()) {
                        throw z2rVar.l(null);
                    }
                    return;
                } catch (IOException e) {
                    if (!z2rVar.j()) {
                        throw e;
                    }
                    throw z2rVar.l(e);
                } finally {
                    z2rVar.j();
                }
            default:
                ((OutputStream) this.b).flush();
                return;
        }
    }

    @Override // defpackage.jmq
    public final vis i() {
        switch (this.a) {
            case 0:
                return (z2r) this.b;
            default:
                return (vis) this.c;
        }
    }

    @Override // defpackage.jmq
    public final void t0(hi3 hi3Var, long j) {
        switch (this.a) {
            case 0:
                hi3Var.getClass();
                ox6.A(hi3Var.b, 0L, j);
                long j2 = j;
                while (true) {
                    long j3 = 0;
                    if (j2 <= 0) {
                        return;
                    }
                    xap xapVar = hi3Var.a;
                    xapVar.getClass();
                    while (true) {
                        if (j3 < 65536) {
                            j3 += xapVar.c - xapVar.b;
                            if (j3 >= j2) {
                                j3 = j2;
                            } else {
                                xapVar = xapVar.f;
                                xapVar.getClass();
                            }
                        }
                    }
                    z2r z2rVar = (z2r) this.b;
                    kt1 kt1Var = (kt1) this.c;
                    z2rVar.i();
                    try {
                        try {
                            kt1Var.t0(hi3Var, j3);
                            if (z2rVar.j()) {
                                throw z2rVar.l(null);
                            }
                            j2 -= j3;
                        } catch (IOException e) {
                            if (!z2rVar.j()) {
                                throw e;
                            }
                            throw z2rVar.l(e);
                        }
                    } catch (Throwable th) {
                        z2rVar.j();
                        throw th;
                    }
                }
            default:
                hi3Var.getClass();
                ox6.A(hi3Var.b, 0L, j);
                while (j > 0) {
                    ((vis) this.c).f();
                    xap xapVar2 = hi3Var.a;
                    xapVar2.getClass();
                    int min = (int) Math.min(j, xapVar2.c - xapVar2.b);
                    ((OutputStream) this.b).write(xapVar2.a, xapVar2.b, min);
                    int i = xapVar2.b + min;
                    xapVar2.b = i;
                    long j4 = min;
                    j -= j4;
                    hi3Var.b -= j4;
                    if (i == xapVar2.c) {
                        hi3Var.a = xapVar2.a();
                        lbp.a(xapVar2);
                    }
                }
                return;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "AsyncTimeout.sink(" + ((kt1) this.c) + ')';
            default:
                return "sink(" + ((OutputStream) this.b) + ')';
        }
    }

    public kt1(z2r z2rVar, kt1 kt1Var) {
        this.b = z2rVar;
        this.c = kt1Var;
    }
}
