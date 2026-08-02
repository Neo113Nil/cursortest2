package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes5.dex */
public final class lt1 implements n3r {
    public final /* synthetic */ int a = 1;
    public final Object b;
    public final Object c;

    public lt1(InputStream inputStream, vis visVar) {
        inputStream.getClass();
        this.b = inputStream;
        this.c = visVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.a) {
            case 0:
                z2r z2rVar = (z2r) this.b;
                lt1 lt1Var = (lt1) this.c;
                z2rVar.i();
                try {
                    lt1Var.close();
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
                ((InputStream) this.b).close();
                return;
        }
    }

    @Override // defpackage.n3r
    public final long e0(hi3 hi3Var, long j) {
        int i = this.a;
        hi3Var.getClass();
        switch (i) {
            case 0:
                z2r z2rVar = (z2r) this.b;
                lt1 lt1Var = (lt1) this.c;
                z2rVar.i();
                try {
                    long e0 = lt1Var.e0(hi3Var, j);
                    if (z2rVar.j()) {
                        throw z2rVar.l(null);
                    }
                    return e0;
                } catch (IOException e) {
                    if (z2rVar.j()) {
                        throw z2rVar.l(e);
                    }
                    throw e;
                } finally {
                    z2rVar.j();
                }
            default:
                if (j == 0) {
                    return 0L;
                }
                if (j < 0) {
                    xq0.o(dfi.d(j, "byteCount < 0: "));
                    return 0L;
                }
                try {
                    ((vis) this.c).f();
                    xap K0 = hi3Var.K0(1);
                    int read = ((InputStream) this.b).read(K0.a, K0.c, (int) Math.min(j, 8192 - K0.c));
                    if (read == -1) {
                        if (K0.b == K0.c) {
                            hi3Var.a = K0.a();
                            lbp.a(K0);
                        }
                        return -1L;
                    }
                    K0.c += read;
                    long j2 = read;
                    hi3Var.b += j2;
                    return j2;
                } catch (AssertionError e2) {
                    if (fxf.E(e2)) {
                        throw new IOException(e2);
                    }
                    throw e2;
                }
        }
    }

    @Override // defpackage.n3r
    public final vis i() {
        switch (this.a) {
            case 0:
                return (z2r) this.b;
            default:
                return (vis) this.c;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "AsyncTimeout.source(" + ((lt1) this.c) + ')';
            default:
                return "source(" + ((InputStream) this.b) + ')';
        }
    }

    public lt1(z2r z2rVar, lt1 lt1Var) {
        this.b = z2rVar;
        this.c = lt1Var;
    }
}
