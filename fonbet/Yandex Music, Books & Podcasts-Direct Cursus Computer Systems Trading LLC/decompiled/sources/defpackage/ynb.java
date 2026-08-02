package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public final class ynb implements Closeable {
    public static final Logger d = Logger.getLogger(noj.class.getName());
    public final noj a;
    public final at1 b;
    public final j6e c;

    public ynb(noj nojVar, at1 at1Var) {
        Level level = Level.FINE;
        this.c = new j6e(14);
        this.a = nojVar;
        this.b = at1Var;
    }

    public final void a(boolean z, int i, hi3 hi3Var, int i2) {
        j6e j6eVar = this.c;
        hi3Var.getClass();
        j6eVar.j(2, i, hi3Var, i2, z);
        try {
            e5e e5eVar = this.b.a;
            synchronized (e5eVar) {
                if (e5eVar.e) {
                    throw new IOException("closed");
                }
                e5eVar.a(i, i2, (byte) 0, z ? (byte) 1 : (byte) 0);
                if (i2 > 0) {
                    e5eVar.a.t0(hi3Var, i2);
                }
            }
        } catch (IOException e) {
            this.a.o(e);
        }
    }

    public final void b(afb afbVar, byte[] bArr) {
        at1 at1Var = this.b;
        pn3 pn3Var = pn3.d;
        this.c.k(2, 0, afbVar, ovn.M(bArr));
        try {
            at1Var.g(afbVar, bArr);
            at1Var.flush();
        } catch (IOException e) {
            this.a.o(e);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.b.close();
        } catch (IOException e) {
            d.log(e.getClass().equals(IOException.class) ? Level.FINE : Level.INFO, "Failed closing connection", (Throwable) e);
        }
    }

    public final void flush() {
        try {
            this.b.flush();
        } catch (IOException e) {
            this.a.o(e);
        }
    }

    public final void g(int i, int i2, boolean z) {
        j6e j6eVar = this.c;
        if (z) {
            long j = (4294967295L & i2) | (i << 32);
            if (j6eVar.h()) {
                ((Logger) j6eVar.a).log((Level) j6eVar.b, "OUTBOUND PING: ack=true bytes=" + j);
            }
        } else {
            j6eVar.m(2, (4294967295L & i2) | (i << 32));
        }
        try {
            this.b.o(i, i2, z);
        } catch (IOException e) {
            this.a.o(e);
        }
    }

    public final void o(int i, afb afbVar) {
        this.c.n(2, i, afbVar);
        try {
            this.b.z(i, afbVar);
        } catch (IOException e) {
            this.a.o(e);
        }
    }

    public final void z(int i, long j) {
        this.c.r(j, 2, i);
        try {
            this.b.H(i, j);
        } catch (IOException e) {
            this.a.o(e);
        }
    }
}
