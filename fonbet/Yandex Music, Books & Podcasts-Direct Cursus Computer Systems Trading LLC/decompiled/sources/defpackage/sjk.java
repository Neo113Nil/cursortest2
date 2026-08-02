package defpackage;

/* loaded from: classes5.dex */
public final class sjk implements n3r {
    public final ij3 a;
    public final hi3 b;
    public xap c;
    public int d;
    public boolean e;
    public long f;

    public sjk(ij3 ij3Var) {
        this.a = ij3Var;
        hi3 h = ij3Var.h();
        this.b = h;
        xap xapVar = h.a;
        this.c = xapVar;
        this.d = xapVar != null ? xapVar.b : -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.e = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        if (r3 == r5.b) goto L16;
     */
    @Override // defpackage.n3r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long e0(hi3 hi3Var, long j) {
        xap xapVar;
        hi3Var.getClass();
        if (j < 0) {
            xq0.o(dfi.d(j, "byteCount < 0: "));
            return 0L;
        }
        if (this.e) {
            xq0.q("closed");
            return 0L;
        }
        xap xapVar2 = this.c;
        hi3 hi3Var2 = this.b;
        if (xapVar2 != null) {
            xap xapVar3 = hi3Var2.a;
            if (xapVar2 == xapVar3) {
                int i = this.d;
                xapVar3.getClass();
            }
            xq0.q("Peek source is invalid because upstream source was used");
            return 0L;
        }
        if (j == 0) {
            return 0L;
        }
        if (!this.a.request(this.f + 1)) {
            return -1L;
        }
        if (this.c == null && (xapVar = hi3Var2.a) != null) {
            this.c = xapVar;
            this.d = xapVar.b;
        }
        long min = Math.min(j, hi3Var2.b - this.f);
        this.b.I(hi3Var, this.f, min);
        this.f += min;
        return min;
    }

    @Override // defpackage.n3r
    public final vis i() {
        return this.a.i();
    }
}
