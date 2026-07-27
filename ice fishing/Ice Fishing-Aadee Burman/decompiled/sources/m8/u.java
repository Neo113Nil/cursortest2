package m8;

/* loaded from: classes2.dex */
public final class u implements w {

    /* renamed from: a, reason: collision with root package name */
    public final r f39432a;

    public u(r rVar) {
        this.f39432a = rVar;
    }

    @Override // m8.w
    public final w a() {
        throw new IllegalStateException("unexpected retry");
    }

    @Override // m8.w
    public final r b() {
        return this.f39432a;
    }

    @Override // m8.w
    public final v c() {
        throw new IllegalStateException("already connected");
    }

    @Override // m8.w, n8.e
    public final void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // m8.w
    public final v e() {
        throw new IllegalStateException("already connected");
    }

    @Override // m8.w
    public final boolean isReady() {
        return true;
    }
}
