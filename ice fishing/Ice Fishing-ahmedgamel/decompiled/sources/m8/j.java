package m8;

/* loaded from: classes2.dex */
public final class j implements v {

    /* renamed from: a, reason: collision with root package name */
    public final u f39521a;

    public j(Throwable th) {
        this.f39521a = new u(this, th, 2);
    }

    @Override // m8.v
    public final v a() {
        throw new IllegalStateException("unexpected retry");
    }

    @Override // m8.v
    public final q b() {
        throw new IllegalStateException("unexpected call");
    }

    @Override // m8.v
    public final u c() {
        return this.f39521a;
    }

    @Override // m8.v, n8.e
    public final void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // m8.v
    public final u e() {
        return this.f39521a;
    }

    @Override // m8.v
    public final boolean isReady() {
        return false;
    }
}
