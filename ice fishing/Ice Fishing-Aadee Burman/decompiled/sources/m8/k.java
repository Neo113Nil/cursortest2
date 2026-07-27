package m8;

/* loaded from: classes2.dex */
public final class k implements w {

    /* renamed from: a, reason: collision with root package name */
    public final v f39364a;

    public k(Throwable th) {
        this.f39364a = new v(this, th, 2);
    }

    @Override // m8.w
    public final w a() {
        throw new IllegalStateException("unexpected retry");
    }

    @Override // m8.w
    public final r b() {
        throw new IllegalStateException("unexpected call");
    }

    @Override // m8.w
    public final v c() {
        return this.f39364a;
    }

    @Override // m8.w, n8.e
    public final void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // m8.w
    public final v e() {
        return this.f39364a;
    }

    @Override // m8.w
    public final boolean isReady() {
        return false;
    }
}
