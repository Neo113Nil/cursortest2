package i8;

/* loaded from: classes2.dex */
public final class j implements w {

    /* renamed from: a, reason: collision with root package name */
    public final v f38375a;

    public j(Throwable th) {
        this.f38375a = new v(this, th, 2);
    }

    @Override // i8.w
    public final w a() {
        throw new IllegalStateException("unexpected retry");
    }

    @Override // i8.w
    public final r b() {
        throw new IllegalStateException("unexpected call");
    }

    @Override // i8.w
    public final v c() {
        return this.f38375a;
    }

    @Override // i8.w, j8.e
    public final void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // i8.w
    public final v f() {
        return this.f38375a;
    }

    @Override // i8.w
    public final boolean isReady() {
        return false;
    }
}
