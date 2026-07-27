package i8;

/* loaded from: classes2.dex */
public final class u implements w {

    /* renamed from: a, reason: collision with root package name */
    public final r f38444a;

    public u(r rVar) {
        this.f38444a = rVar;
    }

    @Override // i8.w
    public final w a() {
        throw new IllegalStateException("unexpected retry");
    }

    @Override // i8.w
    public final r b() {
        return this.f38444a;
    }

    @Override // i8.w
    public final v c() {
        throw new IllegalStateException("already connected");
    }

    @Override // i8.w, j8.e
    public final void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // i8.w
    public final v f() {
        throw new IllegalStateException("already connected");
    }

    @Override // i8.w
    public final boolean isReady() {
        return true;
    }
}
