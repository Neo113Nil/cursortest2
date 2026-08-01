package y8;

/* loaded from: classes2.dex */
public final class o implements x {

    /* renamed from: n, reason: collision with root package name */
    public final g f41974n;

    /* renamed from: u, reason: collision with root package name */
    public final e f41975u;

    /* renamed from: v, reason: collision with root package name */
    public s f41976v;

    /* renamed from: w, reason: collision with root package name */
    public int f41977w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f41978x;

    /* renamed from: y, reason: collision with root package name */
    public long f41979y;

    public o(g gVar) {
        this.f41974n = gVar;
        e P8 = gVar.P();
        this.f41975u = P8;
        s sVar = P8.f41952n;
        this.f41976v = sVar;
        this.f41977w = sVar != null ? sVar.f41988b : -1;
    }

    @Override // y8.x
    public final z L() {
        return this.f41974n.L();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f41978x = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if (r9 == r0.f41988b) goto L13;
     */
    @Override // y8.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long d(long j6, e sink) {
        s sVar;
        kotlin.jvm.internal.h.e(sink, "sink");
        if (this.f41978x) {
            throw new IllegalStateException("closed");
        }
        s sVar2 = this.f41976v;
        e eVar = this.f41975u;
        if (sVar2 != null) {
            s sVar3 = eVar.f41952n;
            if (sVar2 == sVar3) {
                int i = this.f41977w;
                kotlin.jvm.internal.h.b(sVar3);
            }
            throw new IllegalStateException("Peek source is invalid because upstream source was used");
        }
        if (!this.f41974n.S(this.f41979y + 1)) {
            return -1L;
        }
        if (this.f41976v == null && (sVar = eVar.f41952n) != null) {
            this.f41976v = sVar;
            this.f41977w = sVar.f41988b;
        }
        long min = Math.min(8192L, eVar.f41953u - this.f41979y);
        this.f41975u.a(sink, this.f41979y, min);
        this.f41979y += min;
        return min;
    }
}
