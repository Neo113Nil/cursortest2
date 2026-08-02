package y8;

/* loaded from: classes2.dex */
public final class o implements x {

    /* renamed from: n, reason: collision with root package name */
    public final g f41945n;

    /* renamed from: u, reason: collision with root package name */
    public final e f41946u;

    /* renamed from: v, reason: collision with root package name */
    public s f41947v;

    /* renamed from: w, reason: collision with root package name */
    public int f41948w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f41949x;

    /* renamed from: y, reason: collision with root package name */
    public long f41950y;

    public o(g gVar) {
        this.f41945n = gVar;
        e P8 = gVar.P();
        this.f41946u = P8;
        s sVar = P8.f41923n;
        this.f41947v = sVar;
        this.f41948w = sVar != null ? sVar.f41959b : -1;
    }

    @Override // y8.x
    public final z L() {
        return this.f41945n.L();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f41949x = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if (r9 == r0.f41959b) goto L13;
     */
    @Override // y8.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long d(long j6, e sink) {
        s sVar;
        kotlin.jvm.internal.h.e(sink, "sink");
        if (this.f41949x) {
            throw new IllegalStateException("closed");
        }
        s sVar2 = this.f41947v;
        e eVar = this.f41946u;
        if (sVar2 != null) {
            s sVar3 = eVar.f41923n;
            if (sVar2 == sVar3) {
                int i = this.f41948w;
                kotlin.jvm.internal.h.b(sVar3);
            }
            throw new IllegalStateException("Peek source is invalid because upstream source was used");
        }
        if (!this.f41945n.S(this.f41950y + 1)) {
            return -1L;
        }
        if (this.f41947v == null && (sVar = eVar.f41923n) != null) {
            this.f41947v = sVar;
            this.f41948w = sVar.f41959b;
        }
        long min = Math.min(8192L, eVar.f41924u - this.f41950y);
        this.f41946u.a(sink, this.f41950y, min);
        this.f41950y += min;
        return min;
    }
}
