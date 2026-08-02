package defpackage;

import java.io.OutputStream;

/* loaded from: classes9.dex */
public final class qy80 implements uis0 {
    public final OutputStream a;
    public final ydz0 b;

    public qy80(OutputStream outputStream, ydz0 ydz0Var) {
        this.a = outputStream;
        this.b = ydz0Var;
    }

    @Override // defpackage.uis0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.uis0, java.io.Flushable
    public final void flush() {
        this.a.flush();
    }

    @Override // defpackage.uis0
    public final ydz0 timeout() {
        return this.b;
    }

    public final String toString() {
        return "sink(" + this.a + ')';
    }

    @Override // defpackage.uis0
    public final void write(yp6 yp6Var, long j) {
        j.b(yp6Var.b, 0L, j);
        while (j > 0) {
            this.b.f();
            t7q0 t7q0Var = yp6Var.a;
            int min = (int) Math.min(j, t7q0Var.c - t7q0Var.b);
            this.a.write(t7q0Var.a, t7q0Var.b, min);
            int i = t7q0Var.b + min;
            t7q0Var.b = i;
            long j2 = min;
            j -= j2;
            yp6Var.b -= j2;
            if (i == t7q0Var.c) {
                yp6Var.a = t7q0Var.a();
                p8q0.a(t7q0Var);
            }
        }
    }
}
