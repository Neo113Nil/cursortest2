package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.Flushable;

/* loaded from: classes5.dex */
public final class to3 implements Closeable, Flushable {
    public final k78 a;

    public to3(File file, long j) {
        file.getClass();
        this.a = new k78(file, j, m8s.h);
    }

    public final void a(d0o d0oVar) {
        d0oVar.getClass();
        k78 k78Var = this.a;
        String z = q6k.z(d0oVar.a);
        synchronized (k78Var) {
            z.getClass();
            k78Var.z();
            k78Var.a();
            k78.X(z);
            d78 d78Var = (d78) k78Var.h.get(z);
            if (d78Var == null) {
                return;
            }
            k78Var.R(d78Var);
            if (k78Var.f <= k78Var.b) {
                k78Var.n = false;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // java.io.Flushable
    public final void flush() {
        this.a.flush();
    }
}
