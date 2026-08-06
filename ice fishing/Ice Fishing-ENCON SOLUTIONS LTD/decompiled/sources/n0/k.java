package n0;

/* loaded from: classes.dex */
public final class k extends UnsupportedOperationException {

    /* renamed from: a, reason: collision with root package name */
    public final m0.d f8210a;

    public k(m0.d dVar) {
        this.f8210a = dVar;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.f8210a));
    }
}
