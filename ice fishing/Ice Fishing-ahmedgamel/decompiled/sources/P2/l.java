package P2;

/* loaded from: classes.dex */
public final class l extends UnsupportedOperationException {

    /* renamed from: n, reason: collision with root package name */
    public final O2.d f2394n;

    public l(O2.d dVar) {
        this.f2394n = dVar;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.f2394n));
    }
}
