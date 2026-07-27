package M2;

/* loaded from: classes.dex */
public final class l extends UnsupportedOperationException {

    /* renamed from: n, reason: collision with root package name */
    public final L2.d f1895n;

    public l(L2.d dVar) {
        this.f1895n = dVar;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.f1895n));
    }
}
