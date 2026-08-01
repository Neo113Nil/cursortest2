package K6;

/* loaded from: classes2.dex */
public final class a extends Exception {

    /* renamed from: n, reason: collision with root package name */
    public final Throwable f1577n;

    public a(Throwable th) {
        super(th);
        this.f1577n = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f1577n;
    }
}
