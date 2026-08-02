package K6;

/* loaded from: classes2.dex */
public final class a extends Exception {

    /* renamed from: n, reason: collision with root package name */
    public final Throwable f1686n;

    public a(Throwable th) {
        super(th);
        this.f1686n = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f1686n;
    }
}
