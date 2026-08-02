package defpackage;

/* loaded from: classes5.dex */
public final class b5e extends x4e {
    public boolean d;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.b) {
            return;
        }
        if (!this.d) {
            a();
        }
        this.b = true;
    }

    @Override // defpackage.x4e, defpackage.n3r
    public final long e0(hi3 hi3Var, long j) {
        hi3Var.getClass();
        if (j < 0) {
            xq0.o(dfi.d(j, "byteCount < 0: "));
            return 0L;
        }
        if (this.b) {
            xq0.q("closed");
            return 0L;
        }
        if (this.d) {
            return -1L;
        }
        long e0 = super.e0(hi3Var, j);
        if (e0 != -1) {
            return e0;
        }
        this.d = true;
        a();
        return -1L;
    }
}
