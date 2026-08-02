package m8;

/* loaded from: classes2.dex */
public final class t implements v {

    /* renamed from: a, reason: collision with root package name */
    public final q f39589a;

    public t(q qVar) {
        this.f39589a = qVar;
    }

    @Override // m8.v
    public final v a() {
        throw new IllegalStateException("unexpected retry");
    }

    @Override // m8.v
    public final q b() {
        return this.f39589a;
    }

    @Override // m8.v
    public final u c() {
        throw new IllegalStateException("already connected");
    }

    @Override // m8.v, n8.e
    public final void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // m8.v
    public final u e() {
        throw new IllegalStateException("already connected");
    }

    @Override // m8.v
    public final boolean isReady() {
        return true;
    }
}
