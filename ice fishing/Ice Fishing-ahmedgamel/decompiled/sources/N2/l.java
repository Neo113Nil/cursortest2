package N2;

/* loaded from: classes.dex */
public final class l extends UnsupportedOperationException {

    /* renamed from: n, reason: collision with root package name */
    public final M2.d f1950n;

    public l(M2.d dVar) {
        this.f1950n = dVar;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.f1950n));
    }
}
