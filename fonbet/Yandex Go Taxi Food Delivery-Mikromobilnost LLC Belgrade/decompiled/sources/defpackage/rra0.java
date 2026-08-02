package defpackage;

/* loaded from: classes9.dex */
public final class rra0 implements y9t0 {
    public final qq6 a;
    public final yp6 b;
    public t7q0 c;
    public int w;
    public boolean x;
    public long y;

    public rra0(qq6 qq6Var) {
        this.a = qq6Var;
        yp6 h = qq6Var.h();
        this.b = h;
        t7q0 t7q0Var = h.a;
        this.c = t7q0Var;
        this.w = t7q0Var != null ? t7q0Var.b : -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.x = true;
    }

    @Override // defpackage.y9t0
    public final long read(yp6 yp6Var, long j) {
        t7q0 t7q0Var;
        t7q0 t7q0Var2;
        if (j < 0) {
            w511.f(qv10.j(j, "byteCount < 0: "));
            return 0L;
        }
        if (this.x) {
            ny61.r("closed");
            return 0L;
        }
        t7q0 t7q0Var3 = this.c;
        yp6 yp6Var2 = this.b;
        if (t7q0Var3 != null && (t7q0Var3 != (t7q0Var2 = yp6Var2.a) || this.w != t7q0Var2.b)) {
            ny61.r("Peek source is invalid because upstream source was used");
            return 0L;
        }
        if (j == 0) {
            return 0L;
        }
        if (!this.a.S(this.y + 1)) {
            return -1L;
        }
        if (this.c == null && (t7q0Var = yp6Var2.a) != null) {
            this.c = t7q0Var;
            this.w = t7q0Var.b;
        }
        long min = Math.min(j, yp6Var2.b - this.y);
        this.b.d(yp6Var, this.y, min);
        this.y += min;
        return min;
    }

    @Override // defpackage.y9t0
    public final ydz0 timeout() {
        return this.a.timeout();
    }
}
