package defpackage;

import java.io.InputStream;

/* loaded from: classes9.dex */
public final class v0w implements y9t0 {
    public final InputStream a;
    public final ydz0 b;

    public v0w(InputStream inputStream, ydz0 ydz0Var) {
        this.a = inputStream;
        this.b = ydz0Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.y9t0
    public final long read(yp6 yp6Var, long j) {
        if (j == 0) {
            return 0L;
        }
        if (j < 0) {
            w511.f(qv10.j(j, "byteCount < 0: "));
            return 0L;
        }
        try {
            this.b.f();
            t7q0 a0 = yp6Var.a0(1);
            int read = this.a.read(a0.a, a0.c, (int) Math.min(j, 8192 - a0.c));
            if (read != -1) {
                a0.c += read;
                long j2 = read;
                yp6Var.b += j2;
                return j2;
            }
            if (a0.b != a0.c) {
                return -1L;
            }
            yp6Var.a = a0.a();
            p8q0.a(a0);
            return -1L;
        } catch (AssertionError e) {
            if (!xf61.b(e)) {
                throw e;
            }
            kbs.r(e);
            return 0L;
        }
    }

    @Override // defpackage.y9t0
    public final ydz0 timeout() {
        return this.b;
    }

    public final String toString() {
        return "source(" + this.a + ')';
    }
}
