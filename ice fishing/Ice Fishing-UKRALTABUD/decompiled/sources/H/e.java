package H;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final long f354a;

    /* renamed from: b, reason: collision with root package name */
    public final long f355b;

    public e(long j2, long j3) {
        if (j3 == 0) {
            this.f354a = 0L;
            this.f355b = 1L;
        } else {
            this.f354a = j2;
            this.f355b = j3;
        }
    }

    public final String toString() {
        return this.f354a + "/" + this.f355b;
    }
}
