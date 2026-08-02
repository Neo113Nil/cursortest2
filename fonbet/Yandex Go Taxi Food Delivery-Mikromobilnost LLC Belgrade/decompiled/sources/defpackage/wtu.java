package defpackage;

/* loaded from: classes4.dex */
public final class wtu extends stu {
    public boolean x;

    public wtu(xtu xtuVar, kwu kwuVar) {
        super(xtuVar, kwuVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.c) {
            return;
        }
        if (!this.x) {
            a(xtu.f);
        }
        this.c = true;
    }

    @Override // defpackage.stu, defpackage.y9t0
    public final long read(yp6 yp6Var, long j) {
        if (j < 0) {
            w511.f(qv10.j(j, "byteCount < 0: "));
            return 0L;
        }
        if (this.c) {
            ny61.r("closed");
            return 0L;
        }
        if (this.x) {
            return -1L;
        }
        long read = super.read(yp6Var, j);
        if (read != -1) {
            return read;
        }
        this.x = true;
        a(meu.b);
        return -1L;
    }
}
